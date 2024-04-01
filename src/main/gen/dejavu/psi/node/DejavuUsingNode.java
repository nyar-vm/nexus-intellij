// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dejavu.psi.DejavuTypes.*;
import dejavu.psi.DejavuElement;

public class DejavuUsingNode extends DejavuElement implements DejavuUsing {

  public DejavuUsingNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitUsing(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DejavuAnnotations getAnnotations() {
    return findNotNullChildByClass(DejavuAnnotations.class);
  }

  @Override
  @Nullable
  public DejavuIdentifierFree getIdentifierFree() {
    return findChildByClass(DejavuIdentifierFree.class);
  }

  @Override
  @Nullable
  public DejavuUsingBody getUsingBody() {
    return findChildByClass(DejavuUsingBody.class);
  }

}