package valkyrie.language.ast.classes

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo
import com.intellij.icons.AllIcons
import com.intellij.navigation.GotoRelatedItem
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.refactoring.suggested.endOffset
import nexus.language.antlr.NexusAntlrParser
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.ValkyrieHighlightColor
import valkyrie.ide.hint.ParameterInlayHint
import valkyrie.ide.hint.TypeInlayHint
import valkyrie.ide.view.IdentifierPresentation
import valkyrie.language.antlr.NexusParser
import valkyrie.language.ast.ValkyrieFunctionParameter
import valkyrie.language.ast.ValkyrieModifiedNode
import valkyrie.language.file.ValkyrieIconProvider
import valkyrie.language.psi.ValkyrieHighlightElement
import valkyrie.language.psi.ValkyrieInlayElement
import valkyrie.language.psi.ValkyrieLineMarkElement
import valkyrie.language.psi.ValkyrieScopeNode
import javax.swing.Icon


class ValkyrieClassMethodNode(node: CompositeElement) : ValkyrieScopeNode(node), PsiNameIdentifierOwner, ValkyrieLineMarkElement,
    ValkyrieHighlightElement, ValkyrieInlayElement {
    val method by lazy { ValkyrieModifiedNode.findIdentifier(this)!! }
    val modifiers by lazy { ValkyrieModifiedNode.findModifiers(this) };
    override fun getName(): String {
        return method.name
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }


    override fun getBaseIcon(): Icon {
        if (method.name == "constructor") {
            return AllIcons.Gutter.ImplementingMethod
        }
        for (m in modifiers) {
            if (m.name == "get" || m.name == "set") {
                return AllIcons.Nodes.Property
            }
        }
        return ValkyrieIconProvider.Instance.Method
    }


    override fun getPresentation(): ItemPresentation {
        return IdentifierPresentation(method, this.baseIcon)
    }


    override fun getNameIdentifier(): PsiElement {
        return method
    }

    override fun on_highlight(e: NodeHighlighter) {
        if (method.name == "constructor") {
            e.register(nameIdentifier, ValkyrieHighlightColor.KEYWORD)
        } else {
            e.register(nameIdentifier, ValkyrieHighlightColor.SYM_FUNCTION_SELF)
        }
        e.register_modifiers(modifiers)
    }

    override fun on_line_mark(e: MutableCollection<in LineMarkerInfo<*>>) {
        val info = RelatedItemLineMarkerInfo(
            nameIdentifier.firstChild,
            nameIdentifier.textRange,
            baseIcon,
            null,
            null,
            GutterIconRenderer.Alignment.RIGHT // 上
        ) { mutableListOf(GotoRelatedItem(this)) }
        e.add(info)
    }


    override fun type_hint(inlay: TypeInlayHint): Boolean {
        val typeHint = NexusParser.getChildOfType(this, NexusAntlrParser.RULE_type_hint);
        val argument = NexusParser.getChildOfType(this, NexusAntlrParser.RULE_function_parameters)!!;
        if (typeHint == null) {
            inlay.inline(argument.endOffset, ": Any?")
        }
        return true
    }

    override fun parameter_hint(inlay: ParameterInlayHint): Boolean {
        val argument = NexusParser.getChildOfType(this, NexusAntlrParser.RULE_function_parameters)!!;
        val parameter = NexusParser.getChildrenOfType<ValkyrieFunctionParameter>(argument)
        if (parameter.isEmpty()) {
            for (m in modifiers) {
                if (m.name == "get") {
                    inlay.inline(argument.firstChild.endOffset, "self")
                } else if (m.name == "set") {
                    inlay.inline(argument.firstChild.endOffset, "mut self")
                }
            }
        }
        return false
    }
}

