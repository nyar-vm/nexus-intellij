// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import dejavu.psi.YggdrasilElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class YggdrasilUsingBodyNode extends YggdrasilElement implements YggdrasilUsingBody {

    public YggdrasilUsingBodyNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitUsingBody(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<YggdrasilUsingTerm> getUsingTermList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilUsingTerm.class);
    }

}