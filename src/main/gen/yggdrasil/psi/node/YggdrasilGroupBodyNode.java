// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import yggdrasil.psi.YggdrasilElement;

import java.util.List;

public class YggdrasilGroupBodyNode extends YggdrasilElement implements YggdrasilGroupBody {

    public YggdrasilGroupBodyNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitGroupBody(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<YggdrasilGroupTerm> getGroupTermList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilGroupTerm.class);
    }

}
