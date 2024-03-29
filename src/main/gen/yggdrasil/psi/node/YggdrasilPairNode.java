// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.YggdrasilElement;
import org.jetbrains.annotations.NotNull;

public class YggdrasilPairNode extends YggdrasilElement implements YggdrasilPair {

    public YggdrasilPairNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitPair(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public YggdrasilKey getKey() {
        return findNotNullChildByClass(YggdrasilKey.class);
    }

    @Override
    @NotNull
    public YggdrasilValue getValue() {
        return findNotNullChildByClass(YggdrasilValue.class);
    }

}