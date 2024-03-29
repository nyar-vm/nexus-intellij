// This is a generated file. Not intended for manual editing.
package dejavu.psi.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static dejavu.psi.DejavuTypes.*;
import static dejavu.psi.ParserExtension.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class YggdrasilParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(IDENTIFIER, IDENTIFIER_FREE),
    create_token_set_(ATOMIC, EXPRESSION, EXPRESSION_CHOICE, EXPRESSION_GROUP,
      EXPRESSION_HARD, EXPRESSION_SOFT, EXPRESSION_TAG, TERM),
  };

  /* ********************************************************** */
  // attribute* modifier*
  public static boolean annotations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotations")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATIONS, "<annotations>");
    r = annotations_0(b, l + 1);
    r = r && annotations_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute*
  private static boolean annotations_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotations_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!attribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotations_0", c)) break;
    }
    return true;
  }

  // modifier*
  private static boolean annotations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotations_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotations_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (identifier-free EQ)? value {
  // //    mixin = "dejavu.psi.mixin.MixinTuple"
  // }
  public static boolean argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT, "<argument>");
    r = argument_0(b, l + 1);
    r = r && value(b, l + 1);
    r = r && argument_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (identifier-free EQ)?
  private static boolean argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_0")) return false;
    argument_0_0(b, l + 1);
    return true;
  }

  // identifier-free EQ
  private static boolean argument_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier_free(b, l + 1);
    r = r && consumeToken(b, EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // //    mixin = "dejavu.psi.mixin.MixinTuple"
  // }
  private static boolean argument_2(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // expression-group | identifier-free | escape | string | regex | function-call | number
  public static boolean atomic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atomic")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ATOMIC, "<atomic>");
    r = expression_group(b, l + 1);
    if (!r) r = identifier_free(b, l + 1);
    if (!r) r = escape(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = regex(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    if (!r) r = number(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (AT|HASH) identifier tuple?
  public static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    if (!nextTokenIs(b, "<attribute>", AT, HASH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE, "<attribute>");
    r = attribute_0(b, l + 1);
    r = r && identifier(b, l + 1);
    p = r; // pin = 2
    r = r && attribute_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // AT|HASH
  private static boolean attribute_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_0")) return false;
    boolean r;
    r = consumeToken(b, AT);
    if (!r) r = consumeToken(b, HASH);
    return r;
  }

  // tuple?
  private static boolean attribute_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_2")) return false;
    tuple(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // template-case text-element*
  public static boolean case_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_case(b, l + 1);
    r = r && case_statement_1(b, l + 1);
    exit_section_(b, m, CASE_STATEMENT, r);
    return r;
  }

  // text-element*
  private static boolean case_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // BRACE_L (key EQ)? identifier-free BRACE_R
  public static boolean category(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "category")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && category_1(b, l + 1);
    r = r && identifier_free(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, CATEGORY, r);
    return r;
  }

  // (key EQ)?
  private static boolean category_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "category_1")) return false;
    category_1_0(b, l + 1);
    return true;
  }

  // key EQ
  private static boolean category_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "category_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = key(b, l + 1);
    r = r && consumeToken(b, EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // annotations KW_CLASS identifier class-cast? OP_REMARK? class-body
  public static boolean class_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_$")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CLASS, "<class $>");
    r = annotations(b, l + 1);
    r = r && consumeToken(b, KW_CLASS);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, class_3(b, l + 1)) && r;
    r = p && report_error_(b, class_4(b, l + 1)) && r;
    r = p && class_body(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // class-cast?
  private static boolean class_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_3")) return false;
    class_cast(b, l + 1);
    return true;
  }

  // OP_REMARK?
  private static boolean class_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_4")) return false;
    consumeToken(b, OP_REMARK);
    return true;
  }

  /* ********************************************************** */
  // BRACE_L OP_OR? expression? BRACE_R
  public static boolean class_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && class_body_1(b, l + 1);
    r = r && class_body_2(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, CLASS_BODY, r);
    return r;
  }

  // OP_OR?
  private static boolean class_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body_1")) return false;
    consumeToken(b, OP_OR);
    return true;
  }

  // expression?
  private static boolean class_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body_2")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TO identifier
  public static boolean class_cast(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_cast")) return false;
    if (!nextTokenIs(b, TO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TO);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, CLASS_CAST, r);
    return r;
  }

  /* ********************************************************** */
  // annotations KW_MACRO identifier-free function-parameter function-block
  public static boolean define_function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_function")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEFINE_FUNCTION, "<define function>");
    r = annotations(b, l + 1);
    r = r && consumeToken(b, KW_MACRO);
    p = r; // pin = 2
    r = r && report_error_(b, identifier_free(b, l + 1));
    r = p && report_error_(b, function_parameter(b, l + 1)) && r;
    r = p && function_block(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // annotations KW_UNION identifier OP_REMARK? union-body
  public static boolean define_union(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_union")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEFINE_UNION, "<define union>");
    r = annotations(b, l + 1);
    r = r && consumeToken(b, KW_UNION);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, define_union_3(b, l + 1)) && r;
    r = p && union_body(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OP_REMARK?
  private static boolean define_union_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_union_3")) return false;
    consumeToken(b, OP_REMARK);
    return true;
  }

  /* ********************************************************** */
  // template-else-if text-element*
  public static boolean else_if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_if_statement")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_else_if(b, l + 1);
    r = r && else_if_statement_1(b, l + 1);
    exit_section_(b, m, ELSE_IF_STATEMENT, r);
    return r;
  }

  // text-element*
  private static boolean else_if_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_if_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "else_if_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // template-else text-element*
  public static boolean else_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_statement")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_else(b, l + 1);
    r = r && else_statement_1(b, l + 1);
    exit_section_(b, m, ELSE_STATEMENT, r);
    return r;
  }

  // text-element*
  private static boolean else_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "else_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ESCAPED category? {
  // }
  public static boolean escape(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escape")) return false;
    if (!nextTokenIs(b, ESCAPED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ESCAPED);
    r = r && escape_1(b, l + 1);
    r = r && escape_2(b, l + 1);
    exit_section_(b, m, ESCAPE, r);
    return r;
  }

  // category?
  private static boolean escape_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escape_1")) return false;
    category(b, l + 1);
    return true;
  }

  // {
  // }
  private static boolean escape_2(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // expression-choice {
  // }
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = expression_choice(b, l + 1);
    r = r && expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {
  // }
  private static boolean expression_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // expression-hard (OP_OR expression-hard)*
  public static boolean expression_choice(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_choice")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION_CHOICE, "<expression choice>");
    r = expression_hard(b, l + 1);
    r = r && expression_choice_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP_OR expression-hard)*
  private static boolean expression_choice_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_choice_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_choice_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_choice_1", c)) break;
    }
    return true;
  }

  // OP_OR expression-hard
  private static boolean expression_choice_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_choice_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_OR);
    r = r && expression_hard(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L OP_OR? expression PARENTHESIS_R
  public static boolean expression_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_group")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && expression_group_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, EXPRESSION_GROUP, r);
    return r;
  }

  // OP_OR?
  private static boolean expression_group_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_group_1")) return false;
    consumeToken(b, OP_OR);
    return true;
  }

  /* ********************************************************** */
  // expression-soft (OP_CONCAT expression-soft)*
  public static boolean expression_hard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_hard")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION_HARD, "<expression hard>");
    r = expression_soft(b, l + 1);
    r = r && expression_hard_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP_CONCAT expression-soft)*
  private static boolean expression_hard_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_hard_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_hard_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_hard_1", c)) break;
    }
    return true;
  }

  // OP_CONCAT expression-soft
  private static boolean expression_hard_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_hard_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_CONCAT);
    r = r && expression_soft(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression-tag expression-tag*
  public static boolean expression_soft(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_soft")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION_SOFT, "<expression soft>");
    r = expression_tag(b, l + 1);
    r = r && expression_soft_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expression-tag*
  private static boolean expression_soft_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_soft_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_tag(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_soft_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (identifier-free COLON)? term
  public static boolean expression_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_tag")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION_TAG, "<expression tag>");
    r = expression_tag_0(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (identifier-free COLON)?
  private static boolean expression_tag_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_tag_0")) return false;
    expression_tag_0_0(b, l + 1);
    return true;
  }

  // identifier-free COLON
  private static boolean expression_tag_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_tag_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier_free(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // for-statement else-statement? template-end
  public static boolean for_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_element")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = for_statement(b, l + 1);
    r = r && for_element_1(b, l + 1);
    r = r && template_end(b, l + 1);
    exit_section_(b, m, FOR_ELEMENT, r);
    return r;
  }

  // else-statement?
  private static boolean for_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_element_1")) return false;
    else_statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // template-for text-element*
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_for(b, l + 1);
    r = r && for_statement_1(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // text-element*
  private static boolean for_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "for_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // BRACE_L OP_OR? expression? BRACE_R
  public static boolean function_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_block")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && function_block_1(b, l + 1);
    r = r && function_block_2(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, FUNCTION_BLOCK, r);
    return r;
  }

  // OP_OR?
  private static boolean function_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_block_1")) return false;
    consumeToken(b, OP_OR);
    return true;
  }

  // expression?
  private static boolean function_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_block_2")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AT identifier-free tuple?
  public static boolean function_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL, null);
    r = consumeToken(b, AT);
    r = r && identifier_free(b, l + 1);
    p = r; // pin = 2
    r = r && function_call_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // tuple?
  private static boolean function_call_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_2")) return false;
    tuple(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PARENTHESIS_L (parameter (COMMA parameter)* COMMA?)? PARENTHESIS_R
  public static boolean function_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && function_parameter_1(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, FUNCTION_PARAMETER, r);
    return r;
  }

  // (parameter (COMMA parameter)* COMMA?)?
  private static boolean function_parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_1")) return false;
    function_parameter_1_0(b, l + 1);
    return true;
  }

  // parameter (COMMA parameter)* COMMA?
  private static boolean function_parameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter(b, l + 1);
    r = r && function_parameter_1_0_1(b, l + 1);
    r = r && function_parameter_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA parameter)*
  private static boolean function_parameter_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_parameter_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_parameter_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA parameter
  private static boolean function_parameter_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean function_parameter_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // annotations KW_GRAMMAR identifier grammar-body
  public static boolean grammar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, GRAMMAR, "<grammar>");
    r = annotations(b, l + 1);
    r = r && consumeToken(b, KW_GRAMMAR);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && grammar_body(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BRACE_L grammar-term* BRACE_R
  public static boolean grammar_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && grammar_body_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, GRAMMAR_BODY, r);
    return r;
  }

  // grammar-term*
  private static boolean grammar_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_body_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!grammar_term(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "grammar_body_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // pair | COMMA | SEMICOLON
  public static boolean grammar_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GRAMMAR_TERM, "<grammar term>");
    r = pair(b, l + 1);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // annotations KW_GROUP identifier-free? group-body
  public static boolean group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, GROUP, "<group>");
    r = annotations(b, l + 1);
    r = r && consumeToken(b, KW_GROUP);
    p = r; // pin = 2
    r = r && report_error_(b, group_2(b, l + 1));
    r = p && group_body(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // identifier-free?
  private static boolean group_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_2")) return false;
    identifier_free(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BRACE_L group-term* BRACE_R
  public static boolean group_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && group_body_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, GROUP_BODY, r);
    return r;
  }

  // group-term*
  private static boolean group_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_body_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!group_term(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "group_body_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // attribute* identifier* EQ atomic {
  // //    mixin = "dejavu.psi.mixin.MixinGroupItem"
  // //    methods=[highlight createLookup]
  // }
  public static boolean group_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_ITEM, "<group item>");
    r = group_item_0(b, l + 1);
    r = r && group_item_1(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && atomic(b, l + 1);
    r = r && group_item_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attribute*
  private static boolean group_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_item_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!attribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "group_item_0", c)) break;
    }
    return true;
  }

  // identifier*
  private static boolean group_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_item_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "group_item_1", c)) break;
    }
    return true;
  }

  // {
  // //    mixin = "dejavu.psi.mixin.MixinGroupItem"
  // //    methods=[highlight createLookup]
  // }
  private static boolean group_item_4(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // group-item | SEMICOLON
  public static boolean group_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_TERM, "<group term>");
    r = group_item(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL | SYMBOW_RAW {
  // //    mixin = "dejavu.psi.mixin.MixinIdentifier"
  // //    methods=[highlight]
  // }
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, "<identifier>", SYMBOL, SYMBOW_RAW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = identifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SYMBOW_RAW {
  // //    mixin = "dejavu.psi.mixin.MixinIdentifier"
  // //    methods=[highlight]
  // }
  private static boolean identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOW_RAW);
    r = r && identifier_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // //    mixin = "dejavu.psi.mixin.MixinIdentifier"
  // //    methods=[highlight]
  // }
  private static boolean identifier_1_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // SYMBOL | SYMBOW_RAW
  //   | KW_WHILE | KW_FOR
  //   | KW_IF
  //   | KW_MATCH
  public static boolean identifier_free(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_free")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER_FREE, "<identifier free>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, SYMBOW_RAW);
    if (!r) r = consumeToken(b, KW_WHILE);
    if (!r) r = consumeToken(b, KW_FOR);
    if (!r) r = consumeToken(b, KW_IF);
    if (!r) r = consumeToken(b, KW_MATCH);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // if-statement else-if-statement* else-statement? template-end
  public static boolean if_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_element")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_statement(b, l + 1);
    r = r && if_element_1(b, l + 1);
    r = r && if_element_2(b, l + 1);
    r = r && template_end(b, l + 1);
    exit_section_(b, m, IF_ELEMENT, r);
    return r;
  }

  // else-if-statement*
  private static boolean if_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_element_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!else_if_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_element_1", c)) break;
    }
    return true;
  }

  // else-statement?
  private static boolean if_element_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_element_2")) return false;
    else_statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // template-if text-element*
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_if(b, l + 1);
    r = r && if_statement_1(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // text-element*
  private static boolean if_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identifier-free
  public static boolean key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEY, "<key>");
    r = identifier_free(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // match-statement case-statement* else-statement? template-end
  public static boolean match_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_element")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = match_statement(b, l + 1);
    r = r && match_element_1(b, l + 1);
    r = r && match_element_2(b, l + 1);
    r = r && template_end(b, l + 1);
    exit_section_(b, m, MATCH_ELEMENT, r);
    return r;
  }

  // case-statement*
  private static boolean match_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_element_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!case_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "match_element_1", c)) break;
    }
    return true;
  }

  // else-statement?
  private static boolean match_element_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_element_2")) return false;
    else_statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // template-match WHITE_SPACE*
  public static boolean match_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_statement")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_match(b, l + 1);
    r = r && match_statement_1(b, l + 1);
    exit_section_(b, m, MATCH_STATEMENT, r);
    return r;
  }

  // WHITE_SPACE*
  private static boolean match_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WHITE_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "match_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identifier {
  // //    mixin = "dejavu.psi.mixin.MixinModifier"
  // }
  public static boolean modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifier")) return false;
    if (!nextTokenIs(b, "<modifier>", SYMBOL, SYMBOW_RAW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODIFIER, "<modifier>");
    r = identifier(b, l + 1);
    r = r && modifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {
  // //    mixin = "dejavu.psi.mixin.MixinModifier"
  // }
  private static boolean modifier_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // INTEGER {
  // //    mixin = "dejavu.psi.mixin.MixinNumber"
  // }
  public static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    if (!nextTokenIs(b, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    r = r && number_1(b, l + 1);
    exit_section_(b, m, NUMBER, r);
    return r;
  }

  // {
  // //    mixin = "dejavu.psi.mixin.MixinNumber"
  // }
  private static boolean number_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // key EQ value {
  // //    mixin = "dejavu.psi.mixin.MixinTuple"
  // }
  public static boolean pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAIR, "<pair>");
    r = key(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && value(b, l + 1);
    r = r && pair_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {
  // //    mixin = "dejavu.psi.mixin.MixinTuple"
  // }
  private static boolean pair_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // identifier ((EQ|COLON) expression)? {
  // }
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    if (!nextTokenIs(b, "<parameter>", SYMBOL, SYMBOW_RAW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = identifier(b, l + 1);
    r = r && parameter_1(b, l + 1);
    r = r && parameter_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((EQ|COLON) expression)?
  private static boolean parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1")) return false;
    parameter_1_0(b, l + 1);
    return true;
  }

  // (EQ|COLON) expression
  private static boolean parameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_1_0_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQ|COLON
  private static boolean parameter_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, COLON);
    return r;
  }

  // {
  // }
  private static boolean parameter_2(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // OP_NOT | OP_AND | OP_REMARK
  public static boolean prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX, "<prefix>");
    r = consumeToken(b, OP_NOT);
    if (!r) r = consumeToken(b, OP_AND);
    if (!r) r = consumeToken(b, OP_REMARK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BRACE_L COMMA? BRACE_R
  //            | BRACE_L range-lower COMMA? BRACE_R
  //            | BRACE_L COMMA range-upper BRACE_R
  //            | BRACE_L range-upper COMMA range-upper BRACE_R
  public static boolean range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = range_0(b, l + 1);
    if (!r) r = range_1(b, l + 1);
    if (!r) r = range_2(b, l + 1);
    if (!r) r = range_3(b, l + 1);
    exit_section_(b, m, RANGE, r);
    return r;
  }

  // BRACE_L COMMA? BRACE_R
  private static boolean range_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && range_0_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean range_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // BRACE_L range-lower COMMA? BRACE_R
  private static boolean range_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && range_lower(b, l + 1);
    r = r && range_1_2(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean range_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_1_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // BRACE_L COMMA range-upper BRACE_R
  private static boolean range_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BRACE_L, COMMA);
    r = r && range_upper(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // BRACE_L range-upper COMMA range-upper BRACE_R
  private static boolean range_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && range_upper(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && range_upper(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER
  public static boolean range_lower(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_lower")) return false;
    if (!nextTokenIs(b, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    exit_section_(b, m, RANGE_LOWER, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER
  public static boolean range_upper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_upper")) return false;
    if (!nextTokenIs(b, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    exit_section_(b, m, RANGE_UPPER, r);
    return r;
  }

  /* ********************************************************** */
  // REGULAR_EXPRESSION | REGULAR_RANGE
  public static boolean regex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex")) return false;
    if (!nextTokenIs(b, "<regex>", REGULAR_EXPRESSION, REGULAR_RANGE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REGEX, "<regex>");
    r = consumeToken(b, REGULAR_EXPRESSION);
    if (!r) r = consumeToken(b, REGULAR_RANGE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // text-element*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // grammar
  //   | for-element
  //   | SEMICOLON
  static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    boolean r;
    r = grammar(b, l + 1);
    if (!r) r = for_element(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // TEXT_SINGLE | TEXT_DOUBLE {
  // //    mixin = "dejavu.psi.mixin.MixinString"
  // }
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, "<string>", TEXT_DOUBLE, TEXT_SINGLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
    r = consumeToken(b, TEXT_SINGLE);
    if (!r) r = string_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TEXT_DOUBLE {
  // //    mixin = "dejavu.psi.mixin.MixinString"
  // }
  private static boolean string_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEXT_DOUBLE);
    r = r && string_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // //    mixin = "dejavu.psi.mixin.MixinString"
  // }
  private static boolean string_1_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // OP_OPTIONAL | OP_MANY | OP_MANY1 | range
  public static boolean suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUFFIX, "<suffix>");
    r = consumeToken(b, OP_OPTIONAL);
    if (!r) r = consumeToken(b, OP_MANY);
    if (!r) r = consumeToken(b, OP_MANY1);
    if (!r) r = range(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // HASH identifier-free
  public static boolean tag_branch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_branch")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH);
    r = r && identifier_free(b, l + 1);
    exit_section_(b, m, TAG_BRANCH, r);
    return r;
  }

  /* ********************************************************** */
  // TEMPLATE_L KW_CASE identifier TEMPLATE_R
  public static boolean template_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_case")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_CASE, null);
    r = consumeTokens(b, 2, TEMPLATE_L, KW_CASE);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && consumeToken(b, TEMPLATE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TEMPLATE_L KW_ELSE TEMPLATE_R
  public static boolean template_else(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_else")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_ELSE, null);
    r = consumeTokens(b, 2, TEMPLATE_L, KW_ELSE, TEMPLATE_R);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TEMPLATE_L KW_ELSE KW_IF identifier TEMPLATE_R
  public static boolean template_else_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_else_if")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_ELSE_IF, null);
    r = consumeTokens(b, 3, TEMPLATE_L, KW_ELSE, KW_IF);
    p = r; // pin = 3
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && consumeToken(b, TEMPLATE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TEMPLATE_L (KW_END identifier-free? | identifier-free? KW_END) TEMPLATE_R
  public static boolean template_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_end")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_END, null);
    r = consumeToken(b, TEMPLATE_L);
    r = r && template_end_1(b, l + 1);
    p = r; // pin = 2
    r = r && consumeToken(b, TEMPLATE_R);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // KW_END identifier-free? | identifier-free? KW_END
  private static boolean template_end_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_end_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_end_1_0(b, l + 1);
    if (!r) r = template_end_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_END identifier-free?
  private static boolean template_end_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_end_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_END);
    r = r && template_end_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier-free?
  private static boolean template_end_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_end_1_0_1")) return false;
    identifier_free(b, l + 1);
    return true;
  }

  // identifier-free? KW_END
  private static boolean template_end_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_end_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_end_1_1_0(b, l + 1);
    r = r && consumeToken(b, KW_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier-free?
  private static boolean template_end_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_end_1_1_0")) return false;
    identifier_free(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TEMPLATE_L KW_FOR identifier KW_IN identifier TEMPLATE_R
  public static boolean template_for(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_for")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_FOR, null);
    r = consumeTokens(b, 2, TEMPLATE_L, KW_FOR);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, KW_IN)) && r;
    r = p && report_error_(b, identifier(b, l + 1)) && r;
    r = p && consumeToken(b, TEMPLATE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TEMPLATE_L KW_IF identifier TEMPLATE_R
  public static boolean template_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_if")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_IF, null);
    r = consumeTokens(b, 2, TEMPLATE_L, KW_IF);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && consumeToken(b, TEMPLATE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TEMPLATE_L KW_MATCH identifier TEMPLATE_R
  public static boolean template_match(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_match")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_MATCH, null);
    r = consumeTokens(b, 2, TEMPLATE_L, KW_MATCH);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && consumeToken(b, TEMPLATE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TEMPLATE_L KW_WHILE identifier TEMPLATE_R
  public static boolean template_while(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_while")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_WHILE, null);
    r = consumeTokens(b, 2, TEMPLATE_L, KW_WHILE);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && consumeToken(b, TEMPLATE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // prefix* atomic suffix*
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TERM, "<term>");
    r = term_0(b, l + 1);
    r = r && atomic(b, l + 1);
    r = r && term_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // prefix*
  private static boolean term_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!prefix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_0", c)) break;
    }
    return true;
  }

  // suffix*
  private static boolean term_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!suffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // if-element
  //   | while-element
  //   | for-element
  //   | match-element
  //   | WHITE_SPACE
  //   | NORMAL_TEXT
  public static boolean text_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "text_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEXT_ELEMENT, "<text element>");
    r = if_element(b, l + 1);
    if (!r) r = while_element(b, l + 1);
    if (!r) r = for_element(b, l + 1);
    if (!r) r = match_element(b, l + 1);
    if (!r) r = consumeToken(b, WHITE_SPACE);
    if (!r) r = consumeToken(b, NORMAL_TEXT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L (argument (COMMA argument)* COMMA?)?  PARENTHESIS_R
  public static boolean tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && tuple_1(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, TUPLE, r);
    return r;
  }

  // (argument (COMMA argument)* COMMA?)?
  private static boolean tuple_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1")) return false;
    tuple_1_0(b, l + 1);
    return true;
  }

  // argument (COMMA argument)* COMMA?
  private static boolean tuple_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = argument(b, l + 1);
    r = r && tuple_1_0_1(b, l + 1);
    r = r && tuple_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA argument)*
  private static boolean tuple_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tuple_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA argument
  private static boolean tuple_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean tuple_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // BRACE_L union-variant* BRACE_R
  public static boolean union_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && union_body_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, UNION_BODY, r);
    return r;
  }

  // union-variant*
  private static boolean union_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_body_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!union_variant(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "union_body_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OP_OR expression-hard tag-branch? {
  // //    mixin = "dejavu.psi.mixin.MixinUnionItem"
  // }
  public static boolean union_variant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_variant")) return false;
    if (!nextTokenIs(b, OP_OR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_OR);
    r = r && expression_hard(b, l + 1);
    r = r && union_variant_2(b, l + 1);
    r = r && union_variant_3(b, l + 1);
    exit_section_(b, m, UNION_VARIANT, r);
    return r;
  }

  // tag-branch?
  private static boolean union_variant_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_variant_2")) return false;
    tag_branch(b, l + 1);
    return true;
  }

  // {
  // //    mixin = "dejavu.psi.mixin.MixinUnionItem"
  // }
  private static boolean union_variant_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // annotations KW_USING identifier-free (DOT (OP_MANY | using-body))?
  public static boolean using(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, USING, "<using>");
    r = annotations(b, l + 1);
    r = r && consumeToken(b, KW_USING);
    p = r; // pin = 2
    r = r && report_error_(b, identifier_free(b, l + 1));
    r = p && using_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (DOT (OP_MANY | using-body))?
  private static boolean using_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_3")) return false;
    using_3_0(b, l + 1);
    return true;
  }

  // DOT (OP_MANY | using-body)
  private static boolean using_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && using_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_MANY | using-body
  private static boolean using_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_3_0_1")) return false;
    boolean r;
    r = consumeToken(b, OP_MANY);
    if (!r) r = using_body(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // key KW_AS identifier-free
  public static boolean using_alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_alias")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USING_ALIAS, "<using alias>");
    r = key(b, l + 1);
    r = r && consumeToken(b, KW_AS);
    r = r && identifier_free(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BRACE_L using-term* BRACE_R
  public static boolean using_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && using_body_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, USING_BODY, r);
    return r;
  }

  // using-term*
  private static boolean using_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_body_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!using_term(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "using_body_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // using-alias
  //   | SEMICOLON
  public static boolean using_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USING_TERM, "<using term>");
    r = using_alias(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // tuple | expression-tag
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = tuple(b, l + 1);
    if (!r) r = expression_tag(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // while-statement else-statement? template-end
  public static boolean while_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_element")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = while_statement(b, l + 1);
    r = r && while_element_1(b, l + 1);
    r = r && template_end(b, l + 1);
    exit_section_(b, m, WHILE_ELEMENT, r);
    return r;
  }

  // else-statement?
  private static boolean while_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_element_1")) return false;
    else_statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // template-while text-element*
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_while(b, l + 1);
    r = r && while_statement_1(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  // text-element*
  private static boolean while_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "while_statement_1", c)) break;
    }
    return true;
  }

}
