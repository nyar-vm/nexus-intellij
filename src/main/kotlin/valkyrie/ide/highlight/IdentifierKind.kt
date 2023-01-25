package valkyrie.ide.highlight

import valkyrie.language.ast.ValkyrieIdentifierNode
import valkyrie.language.ast.classes.ValkyrieClassFieldNode
import valkyrie.language.ast.classes.ValkyrieClassMethodNode
import valkyrie.language.ast.classes.ValkyrieClassStatement

//import valkyrie.language.psi_node.ValkyrieClassStatementNode
//import valkyrie.language.psi_node.ValkyrieTraitStatementNode

enum class IdentifierKind {
    Trait,
    Class,
    ClassField,
    ClassMethod,
    Variant,
    VariantItem;

    val color
        get() = when (this) {
            Trait -> ValkyrieHighlightColor.SYM_TRAIT
            Class -> ValkyrieHighlightColor.SYM_CLASS
            ClassField -> ValkyrieHighlightColor.SYM_FIELD
            ClassMethod -> ValkyrieHighlightColor.SYM_FUNCTION_SELF
            Variant -> ValkyrieHighlightColor.SYM_VARIANT
            VariantItem -> ValkyrieHighlightColor.SYM_FIELD
        }

    companion object {
        fun resolve(o: ValkyrieIdentifierNode): IdentifierKind? {
            return when (o.reference?.resolve()) {
                is ValkyrieClassStatement -> Class
                is ValkyrieClassFieldNode -> ClassField
                is ValkyrieClassMethodNode -> ClassMethod
                else -> null
            }
        }
    }
}