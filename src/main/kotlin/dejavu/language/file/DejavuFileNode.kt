package dejavu.language.file

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.model.psi.PsiSymbolReference
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import dejavu.language.DejavuLanguage
import yggdrasil.language.file.YggdrasilFileCache


/**
ValkyrieFile 是个 PsiElement
 */
@Suppress("UnstableApiUsage")
class DejavuFileNode(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, DejavuLanguage) {
    override fun getFileType(): FileType = DejavuFileType

    override fun toString(): String = yggdrasil.language.YggdrasilBundle.message("action.create_file")

    val definitions = YggdrasilFileCache(this)


    override fun getOwnDeclarations(): MutableCollection<out PsiSymbolDeclaration> {
//        val output = mutableListOf<PsiSymbolDeclaration>()
//        for (child in this.children) {
//            output.addAll(child.ownDeclarations)
//        }
//        return output
        return mutableListOf()
    }

    override fun getOwnReferences(): MutableCollection<out PsiSymbolReference> {
//        val output = mutableListOf<PsiSymbolReference>()
//        for (child in this.children) {
//            output.addAll(child.ownReferences)
//        }
//        return output
        return mutableListOf()
    }

    fun isIndexFile(): Boolean {
        return this.name == "index.ygg"
    }
}
