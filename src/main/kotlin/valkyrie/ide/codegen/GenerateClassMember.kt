package valkyrie.ide.codegen

import com.intellij.codeInsight.generation.MemberChooserObject
import com.intellij.ui.SimpleColoredComponent
import com.intellij.ui.SimpleTextAttributes
import com.intellij.ui.speedSearch.SpeedSearchUtil
import nexus.language.ast.classes.NexusClassStatement
import javax.swing.JTree

class GenerateClassMember(val parent: NexusClassStatement) : MemberChooserObject {
    override fun renderTreeNode(component: SimpleColoredComponent, tree: JTree) {
        SpeedSearchUtil.appendFragmentsForSpeedSearch(
            tree,
            this.text,
            SimpleTextAttributes.SIMPLE_CELL_ATTRIBUTES,
            false,
            component
        )
        component.icon = parent.baseIcon
    }

    override fun getText(): String {
        return parent.name
    }
}