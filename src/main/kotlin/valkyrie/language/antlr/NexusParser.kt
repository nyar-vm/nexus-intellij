package valkyrie.language.antlr

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.lang.PsiBuilder
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.PsiTreeUtil
import nexus.language.antlr.NexusAntlrParser
import nexus.language.antlr.NexusAntlrParser.*
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.parser.ANTLRParseTreeToPSIConverter
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.tree.ParseTree
import valkyrie.language.NexusLanguage
import valkyrie.language.ast.*
import valkyrie.language.ast.calls.ValkyrieAnnotation
import valkyrie.language.ast.calls.ValkyrieAnnotationItem
import valkyrie.language.ast.calls.ValkyrieCallMacro
import valkyrie.language.ast.classes.*
import valkyrie.language.ast.pattern_match.ValkyrieMatchStatement
import valkyrie.language.psi.types.ValkyrieBlockType
import valkyrie.language.psi.types.ValkyrieModifiedType


class NexusParser(parser: NexusAntlrParser) : ANTLRParserAdaptor(NexusLanguage, parser) {
    override fun parse(parser: Parser, root: IElementType): ParseTree {
        return (parser as NexusAntlrParser).program()
    }


    override fun parse(root: IElementType, builder: PsiBuilder): ASTNode {
        return super.parse(root, builder)
    }

    override fun createListener(parser: Parser?, root: IElementType?, builder: PsiBuilder?): ANTLRParseTreeToPSIConverter {
        return super.createListener(parser, root, builder)
    }

    companion object {
        fun extractCompositeNode(node: CompositeElement): PsiElement {
            val type: RuleIElementType = node.elementType as RuleIElementType;
            return when (type.ruleIndex) {
//                RULE_program -> ValkyrieProgramNode(node, type)
                RULE_define_namespace -> ValkyrieNamespaceStatement(node, type)
                RULE_import_block -> ValkyrieBlockNode(node, ValkyrieBlockType.Brace)
                // annotations
                RULE_template_call -> ValkyrieTemplateStatement(node)
                RULE_modifiers -> ValkyrieModifiedNode(node, ValkyrieModifiedType.Pure)
                RULE_modified_identifier -> ValkyrieModifiedNode(node, ValkyrieModifiedType.ModifiedIdentifier)
                RULE_modified_namepath -> ValkyrieModifiedNode(node, ValkyrieModifiedType.ModifiedNamepath)
                RULE_template_block -> ValkyrieBlockNode(node, ValkyrieBlockType.Brace)
                RULE_where_block -> ValkyrieBlockNode(node, ValkyrieBlockType.Brace)
                RULE_annotation -> ValkyrieAnnotation(node)
                RULE_annotation_call_item -> ValkyrieAnnotationItem(node)
                // class
                RULE_define_class -> ValkyrieClassStatement(node)
                RULE_define_generic -> ValkyrieGenericStatement(node)
                RULE_class_inherit_item -> ValkyrieClassInheritItem(node)
                RULE_class_block -> ValkyrieBlockNode(node, ValkyrieBlockType.Brace)
                RULE_class_field -> ValkyrieClassFieldNode(node)
                RULE_class_method -> ValkyrieClassMethodNode(node)
                RULE_class_dsl -> ValkyrieClassCustomNode(node)
                // function
                RULE_define_function -> ValkyrieFunctionStatement(node)
                RULE_function_parameters -> ValkyrieBlockNode(node, ValkyrieBlockType.Parenthesis)
                RULE_parameter_item -> ValkyrieFunctionParameter(node)
                RULE_function_block -> ValkyrieBlockNode(node, ValkyrieBlockType.Brace)
                // variable
                RULE_let_binding -> ValkyrieLetStatement(node)
                RULE_let_pattern -> ValkyrieLetPattern(node)
                RULE_let_pattern_item -> ValkyrieLetPatternItem(node)
                // control
//                RULE_for_statement -> ValkyrieForStatement(node)
//                RULE_while_statement -> ValkyrieWhileStatement(node)
                // pattern match
                RULE_match_statement -> {
//                    ValkyrieParser.getChildOfType(node.psi)
                    ValkyrieMatchStatement(node)
                    // ValkyrieCatchBlockNode(node)
                }
//                RULE_match_call -> {
//                    ValkyrieMatchCall(node)
//                }

                RULE_lambda_name -> ValkyrieLambdaSlot(node)


                RULE_match_block -> ValkyrieBlockNode(node, ValkyrieBlockType.Brace)
                RULE_match_case_block -> ValkyrieBlockNode(node, ValkyrieBlockType.Indent)
                // expression
                RULE_macro_call -> ValkyrieCallMacro(node)
                RULE_generic_call -> ValkyrieGenericCall(node, true)
                RULE_generic_call_in_type -> ValkyrieGenericCall(node, false)
                RULE_tuple_call_item -> ValkyrieCallArgument(node)
                RULE_tuple_call_body -> ValkyrieBlockNode(node, ValkyrieBlockType.Parenthesis)
                // operators
                RULE_infix_map -> ValkyrieOperatorNode(node, ValkyrieOperatorKind.Infix)
                RULE_expression -> extractExpression(node)
                RULE_function_call -> ValkyrieCallFunction(node)
                // atomic
                RULE_namepath_free -> ValkyrieNamepathNode(node, type, true)
                RULE_namepath -> ValkyrieNamepathNode(node, type)
                RULE_identifier -> ValkyrieIdentifierNode(node)
                RULE_string_literal -> ValkyrieStringNode(node)
                RULE_number -> ValkyrieNumberNode(node)
                // comment


                else -> ASTWrapperPsiElement(node)
            }
        }

        fun getChildOfType(psi: PsiElement?, parserRule: Int): PsiElement? {
            if (psi != null) {
                for (child in psi.children) {
                    val type = child.node.elementType as RuleIElementType;
                    if (type.ruleIndex == parserRule) {
                        return child;
                    }
                }
            }
            return null;
        }

        inline fun <reified T> getChildrenOfType(psi: PsiElement?): List<T> where T : PsiElement {
            if (psi != null) {
                return PsiTreeUtil.getChildrenOfTypeAsList(psi, T::class.java)
            }
            return emptyList()
        }


        fun getChildrenOfType(psi: PsiElement?, parserRule: Int): List<PsiElement> {
            val output = mutableListOf<PsiElement>();
            if (psi != null) {
                for (child in psi.children) {
                    val type = child.node.elementType as RuleIElementType;
                    if (type.ruleIndex == parserRule) {
                        output.add(child)
                    }
                }
            }
            return output;
        }
    }
}

