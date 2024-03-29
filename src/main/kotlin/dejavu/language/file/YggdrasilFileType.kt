package yggdrasil.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import dejavu.language.DejavuLanguage
import javax.swing.Icon

object YggdrasilFileType : LanguageFileType(DejavuLanguage) {
    override fun getName(): String = DejavuLanguage.id

    override fun getDescription(): String = yggdrasil.language.YggdrasilBundle.message("filetype.description")

    override fun getDefaultExtension(): String = "dejavu;"

    override fun getIcon(): Icon = YggdrasilIconProvider.Instance.File

}