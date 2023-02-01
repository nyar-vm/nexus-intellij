package valkyrie.ide.codegen

import com.intellij.ide.util.MemberChooser
import com.intellij.openapi.project.Project
import nexus.language.ast.classes.NexusClassStatement

class GenerateClassFieldChooser : MemberChooser<GenerateClassFieldMember> {
    constructor(here: NexusClassStatement, project: Project) : super(arrayOf(), true, true, project) {
        title = "Valkyrie Class Field Chooser";
        setCopyJavadocVisible(false)
        resetElements(here.getFields().map { GenerateClassFieldMember(it, here) }.toTypedArray())
    }
}