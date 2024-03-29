// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.YggdrasilElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class YggdrasilCategoryNode extends YggdrasilElement implements YggdrasilCategory {

    public YggdrasilCategoryNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitCategory(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public YggdrasilIdentifierFree getIdentifierFree() {
        return findNotNullChildByClass(YggdrasilIdentifierFree.class);
    }

    @Override
    @Nullable
    public YggdrasilKey getKey() {
        return findChildByClass(YggdrasilKey.class);
    }

}