package valkyrie.ide.highlight


import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase.pack
import com.intellij.psi.tree.IElementType
import dejavu.psi.DejavuTypes.*
import dejavu.psi.ParserDefinition

class TokenHighlighter : SyntaxHighlighter {
    override fun getHighlightingLexer(): Lexer {
        return ParserDefinition.createLexer()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): HighlightColor? {
        return when (tokenType) {
            KW_IF, KW_ELSE,
            KW_FOR, KW_IN,
            KW_CLASS, KW_UNION, KW_GROUP, KW_MACRO,
            KW_END,
            -> HighlightColor.KEYWORD
            // operations
            COLON, EQ -> HighlightColor.OPERATION
            OP_OR, OP_CONCAT -> HighlightColor.OPERATION
            OP_REMARK -> HighlightColor.OPERATION
            OP_OPTIONAL, OP_MANY, OP_MANY1 -> HighlightColor.OPERATION
            // literals
            TEXT_SINGLE, TEXT_DOUBLE -> HighlightColor.STRING
            ESCAPED -> HighlightColor.STRING_ESCAPED
            INTEGER -> HighlightColor.INTEGER
            // comments
            COMMENT_LINE -> HighlightColor.COMMENT_LINE
            COMMENT_BLOCK -> HighlightColor.COMMENT_BLOCK
            // errors
//            TokenType.BAD_CHARACTER -> YggdrasilHighlightColor.BAD_CHARACTER

            else -> null
        }
    }
}
