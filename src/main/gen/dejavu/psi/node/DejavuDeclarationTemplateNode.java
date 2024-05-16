// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dejavu.psi.DejavuTypes.*;
import dejavu.psi.mixin.MixinTemplate;
import error.NonExistentClass;

public class DejavuDeclarationTemplateNode extends MixinTemplate implements DejavuDeclarationTemplate {

  public DejavuDeclarationTemplateNode(NonExistentClass node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitDeclarationTemplate(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DejavuNamepath getNamepath() {
    return findChildByClass(DejavuNamepath.class);
  }

  @Override
  @NotNull
  public List<DejavuProgramElement> getProgramElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuProgramElement.class);
  }

}
