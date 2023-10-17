package dejavu.language.symbol

import com.intellij.model.presentation.SymbolDeclarationPresentation
import com.intellij.model.presentation.SymbolDeclarationPresentationProvider
import dejavu.language.file.DejavuIconProvider
import javax.swing.Icon

object SymbolProvider : SymbolDeclarationPresentationProvider<ValkyrieDeclared> {
    override fun getPresentation(symbolDeclaration: ValkyrieDeclared): SymbolDeclarationPresentation? {
        return object : SymbolDeclarationPresentation {
            override fun getPresentableText(): String? {
                return "SymbolDeclarationPresentation.getPresentableText"
            }

            override fun getIcon(unused: Boolean): Icon? {
                return DejavuIconProvider.Instance.Valkyrie
            }
        }
    }
}
