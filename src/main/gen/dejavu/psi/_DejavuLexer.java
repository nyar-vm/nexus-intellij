// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: dejavu.flex

package dejavu.psi;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static dejavu.psi.DejavuTypes.*;


public class _DejavuLexer implements com.intellij.lexer.FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int ProgramContext = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\1\u1f00\11\u2000\1\u2100\1\u2200\2\u2000\1\u2300"+
    "\1\u2400\2\u2000\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700"+
    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100"+
    "\1\u2e00\10\u2f00\31\u2000\1\u0100\1\u3000\1\u3100\1\u3200\1\u3300"+
    "\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900\1\u3a00\1\u3b00"+
    "\1\u0100\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000\1\u4100\1\u4200"+
    "\1\u2000\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800\1\u4900"+
    "\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u4e00\1\u2000\1\u4f00\1\u5000"+
    "\1\u5100\1\u2000\3\u0100\1\u5200\1\u5300\1\u5400\12\u2000\4\u0100"+
    "\1\u5500\17\u2000\2\u0100\1\u5600\41\u2000\2\u0100\1\u5700\1\u5800"+
    "\2\u2000\1\u5900\1\u5a00\27\u0100\1\u5b00\2\u0100\1\u5c00\45\u2000"+
    "\1\u0100\1\u5d00\1\u5e00\11\u2000\1\u5f00\24\u2000\1\u6000\1\u6100"+
    "\1\u2000\1\u6200\1\u6300\1\u6400\1\u6500\2\u2000\1\u6600\5\u2000"+
    "\1\u6700\1\u6800\1\u6900\5\u2000\1\u6a00\1\u6b00\4\u2000\1\u6c00"+
    "\21\u2000\246\u0100\1\u6d00\20\u0100\1\u6e00\1\u6f00\25\u0100\1\u7000"+
    "\34\u0100\1\u7100\14\u2000\2\u0100\1\u7200\u0b06\u2000\1\u7300\u02fe\u2000";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\1\0"+
    "\1\4\1\0\1\5\1\6\1\0\1\7\1\10\1\11"+
    "\1\12\1\0\1\13\1\14\1\15\1\16\12\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\32\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\27\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\27\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\27\1\54\1\55"+
    "\1\56\1\27\1\57\1\60\1\61\2\27\1\62\1\63"+
    "\1\64\1\65\6\0\1\3\32\0\1\1\11\0\1\27"+
    "\12\0\1\27\1\0\1\66\2\0\1\27\5\0\27\27"+
    "\1\0\37\27\1\0\u01ca\27\4\0\14\27\16\0\5\27"+
    "\7\0\1\27\1\0\1\27\21\0\160\66\5\27\1\0"+
    "\2\27\3\0\3\27\1\0\1\27\6\0\1\27\1\66"+
    "\3\27\1\0\1\27\1\0\24\27\1\0\123\27\1\0"+
    "\213\27\1\0\5\66\2\0\246\27\1\0\46\27\2\0"+
    "\1\27\6\0\51\27\10\0\55\66\1\0\1\66\1\0"+
    "\2\66\1\0\2\66\1\0\1\66\10\0\33\27\4\0"+
    "\4\27\35\0\13\66\5\0\53\27\37\66\4\0\2\27"+
    "\1\66\143\27\1\0\1\27\7\66\2\0\6\66\2\27"+
    "\2\66\1\0\4\66\2\27\12\66\3\27\2\0\1\27"+
    "\20\0\1\27\1\66\36\27\33\66\2\0\131\27\13\66"+
    "\1\27\16\0\12\66\41\27\11\66\2\27\4\0\1\27"+
    "\2\0\1\66\2\0\26\27\4\66\1\27\11\66\1\27"+
    "\3\66\1\27\5\66\22\0\31\27\3\66\4\0\13\27"+
    "\65\0\25\27\1\0\10\27\25\0\17\66\1\0\41\66"+
    "\66\27\3\66\1\27\22\66\1\27\7\66\12\27\2\66"+
    "\2\0\12\66\1\0\20\27\3\66\1\0\10\27\2\0"+
    "\2\27\2\0\26\27\1\0\7\27\1\0\1\27\3\0"+
    "\4\27\2\0\1\66\1\27\7\66\2\0\2\66\2\0"+
    "\3\66\1\27\10\0\1\66\4\0\2\27\1\0\3\27"+
    "\2\66\2\0\12\66\2\27\12\0\1\27\1\0\1\66"+
    "\2\0\3\66\1\0\6\27\4\0\2\27\2\0\26\27"+
    "\1\0\7\27\1\0\2\27\1\0\2\27\1\0\2\27"+
    "\2\0\1\66\1\0\5\66\4\0\2\66\2\0\3\66"+
    "\3\0\1\66\7\0\4\27\1\0\1\27\7\0\14\66"+
    "\3\27\1\66\13\0\3\66\1\0\11\27\1\0\3\27"+
    "\1\0\26\27\1\0\7\27\1\0\2\27\1\0\5\27"+
    "\2\0\1\66\1\27\10\66\1\0\3\66\1\0\3\66"+
    "\2\0\1\27\17\0\2\27\2\66\2\0\12\66\11\0"+
    "\1\27\6\66\1\0\3\66\1\0\10\27\2\0\2\27"+
    "\2\0\26\27\1\0\7\27\1\0\2\27\1\0\5\27"+
    "\2\0\1\66\1\27\7\66\2\0\2\66\2\0\3\66"+
    "\10\0\2\66\4\0\2\27\1\0\3\27\2\66\2\0"+
    "\12\66\1\0\1\27\20\0\1\66\1\27\1\0\6\27"+
    "\3\0\3\27\1\0\4\27\3\0\2\27\1\0\1\27"+
    "\1\0\2\27\3\0\2\27\3\0\3\27\3\0\14\27"+
    "\4\0\5\66\3\0\3\66\1\0\4\66\2\0\1\27"+
    "\6\0\1\66\16\0\12\66\20\0\5\66\10\27\1\0"+
    "\3\27\1\0\27\27\1\0\20\27\3\0\1\27\7\66"+
    "\1\0\3\66\1\0\4\66\7\0\2\66\1\0\3\27"+
    "\5\0\2\27\2\66\2\0\12\66\20\0\1\27\3\66"+
    "\1\0\10\27\1\0\3\27\1\0\27\27\1\0\12\27"+
    "\1\0\5\27\2\0\1\66\1\27\7\66\1\0\3\66"+
    "\1\0\4\66\7\0\2\66\7\0\1\27\1\0\2\27"+
    "\2\66\2\0\12\66\1\0\2\27\15\0\4\66\1\0"+
    "\10\27\1\0\3\27\1\0\51\27\2\66\1\27\7\66"+
    "\1\0\3\66\1\0\4\66\1\27\5\0\3\27\1\66"+
    "\7\0\3\27\2\66\2\0\12\66\12\0\6\27\2\0"+
    "\2\66\1\0\22\27\3\0\30\27\1\0\11\27\1\0"+
    "\1\27\2\0\7\27\3\0\1\66\4\0\6\66\1\0"+
    "\1\66\1\0\10\66\6\0\12\66\2\0\2\66\15\0"+
    "\60\27\1\66\1\27\10\66\5\0\7\27\10\66\1\0"+
    "\12\66\47\0\2\27\1\0\1\27\1\0\5\27\1\0"+
    "\30\27\1\0\1\27\1\0\12\27\1\66\1\27\12\66"+
    "\1\27\2\0\5\27\1\0\1\27\1\0\6\66\2\0"+
    "\12\66\2\0\4\27\40\0\1\27\27\0\2\66\6\0"+
    "\12\66\13\0\1\66\1\0\1\66\1\0\1\66\4\0"+
    "\2\66\10\27\1\0\44\27\4\0\24\66\1\0\2\66"+
    "\5\27\13\66\1\0\44\66\11\0\1\66\71\0\53\27"+
    "\24\66\1\27\12\66\6\0\6\27\4\66\4\27\3\66"+
    "\1\27\3\66\2\27\7\66\3\27\4\66\15\27\14\66"+
    "\1\27\17\66\2\0\46\27\1\0\1\27\5\0\1\27"+
    "\2\0\53\27\1\0\115\27\1\0\4\27\2\0\7\27"+
    "\1\0\1\27\1\0\4\27\2\0\51\27\1\0\4\27"+
    "\2\0\41\27\1\0\4\27\2\0\7\27\1\0\1\27"+
    "\1\0\4\27\2\0\17\27\1\0\71\27\1\0\4\27"+
    "\2\0\103\27\2\0\3\66\11\0\11\66\16\0\20\27"+
    "\20\0\126\27\2\0\6\27\3\0\u016c\27\2\0\21\27"+
    "\1\1\32\27\5\0\113\27\3\0\13\27\7\0\15\27"+
    "\1\0\4\27\3\66\13\0\22\27\3\66\13\0\22\27"+
    "\2\66\14\0\15\27\1\0\3\27\1\0\2\66\14\0"+
    "\64\27\40\66\3\0\1\27\4\0\1\27\1\66\2\0"+
    "\12\66\41\0\3\66\2\0\12\66\6\0\131\27\7\0"+
    "\51\27\1\66\1\27\5\0\106\27\12\0\37\27\1\0"+
    "\14\66\4\0\14\66\12\0\12\66\36\27\2\0\5\27"+
    "\13\0\54\27\4\0\32\27\6\0\13\66\45\0\27\27"+
    "\5\66\4\0\65\27\12\66\1\0\35\66\2\0\13\66"+
    "\6\0\12\66\15\0\1\27\10\0\16\66\102\0\5\66"+
    "\57\27\21\66\7\27\4\0\12\66\21\0\11\66\14\0"+
    "\3\66\36\27\15\66\2\27\12\66\54\27\16\66\14\0"+
    "\44\27\24\66\10\0\12\66\3\0\3\27\12\66\44\27"+
    "\2\0\11\27\7\0\53\27\2\0\3\27\20\0\3\66"+
    "\1\0\25\66\4\27\1\66\6\27\1\66\2\27\3\66"+
    "\1\27\5\0\300\27\72\66\1\0\5\66\26\27\2\0"+
    "\6\27\2\0\46\27\2\0\6\27\2\0\10\27\1\0"+
    "\1\27\1\0\1\27\1\0\1\27\1\0\37\27\2\0"+
    "\65\27\1\0\7\27\1\0\1\27\3\0\3\27\1\0"+
    "\7\27\3\0\4\27\2\0\6\27\4\0\15\27\5\0"+
    "\3\27\1\0\7\27\3\0\13\1\35\0\2\3\5\0"+
    "\1\1\17\0\2\66\23\0\1\66\12\0\1\1\21\0"+
    "\1\27\15\0\1\27\20\0\15\27\63\0\15\66\4\0"+
    "\1\66\3\0\14\66\21\0\1\27\4\0\1\27\2\0"+
    "\12\27\1\0\1\27\2\0\6\27\6\0\1\27\1\0"+
    "\1\27\1\0\1\27\1\0\20\27\2\0\4\27\5\0"+
    "\5\27\4\0\1\27\21\0\51\27\256\0\1\67\u01c8\0"+
    "\57\27\1\0\57\27\1\0\205\27\6\0\4\27\3\66"+
    "\2\27\14\0\46\27\1\0\1\27\5\0\1\27\2\0"+
    "\70\27\7\0\1\27\17\0\1\66\27\27\11\0\7\27"+
    "\1\0\7\27\1\0\7\27\1\0\7\27\1\0\7\27"+
    "\1\0\7\27\1\0\7\27\1\0\7\27\1\0\40\66"+
    "\1\1\4\0\3\27\31\0\11\27\6\66\1\0\5\27"+
    "\2\0\5\27\4\0\126\27\2\0\2\66\2\0\3\27"+
    "\1\0\132\27\1\0\4\27\5\0\53\27\1\0\136\27"+
    "\21\0\33\27\65\0\306\27\112\0\360\27\20\0\215\27"+
    "\103\0\56\27\2\0\15\27\3\0\20\27\12\66\2\27"+
    "\24\0\57\27\1\66\4\0\12\66\1\0\37\27\2\66"+
    "\120\27\2\66\45\0\11\27\2\0\147\27\2\0\65\27"+
    "\2\0\5\27\60\0\13\27\1\66\3\27\1\66\4\27"+
    "\1\66\27\27\5\66\30\0\64\27\14\0\2\66\62\27"+
    "\22\66\12\0\12\66\6\0\22\66\6\27\3\0\1\27"+
    "\1\0\2\27\13\66\34\27\10\66\2\0\27\27\15\66"+
    "\14\0\35\27\3\0\4\66\57\27\16\66\16\0\1\27"+
    "\12\66\6\0\5\27\1\66\12\27\12\66\5\27\1\0"+
    "\51\27\16\66\11\0\3\27\1\66\10\27\2\66\2\0"+
    "\12\66\6\0\27\27\3\0\1\27\3\66\62\27\1\66"+
    "\1\27\3\66\2\27\2\66\5\27\2\66\1\27\1\66"+
    "\1\27\30\0\3\27\2\0\13\27\5\66\2\0\3\27"+
    "\2\66\12\0\6\27\2\0\6\27\2\0\6\27\11\0"+
    "\7\27\1\0\7\27\1\0\53\27\1\0\14\27\10\0"+
    "\163\27\10\66\1\0\2\66\2\0\12\66\6\0\244\27"+
    "\14\0\27\27\4\0\61\27\4\0\u0100\70\156\27\2\0"+
    "\152\27\46\0\7\27\14\0\5\27\5\0\1\27\1\66"+
    "\12\27\1\0\15\27\1\0\5\27\1\0\1\27\1\0"+
    "\2\27\1\0\2\27\1\0\154\27\41\0\213\27\6\0"+
    "\332\27\22\0\100\27\2\0\66\27\50\0\12\27\6\0"+
    "\20\66\20\0\20\66\3\0\2\66\30\0\3\66\41\0"+
    "\1\27\1\0\1\27\3\0\1\27\1\0\1\27\1\0"+
    "\1\27\1\0\1\27\1\0\176\27\23\0\12\66\7\0"+
    "\32\27\4\0\1\66\1\0\32\27\13\0\70\27\2\66"+
    "\37\27\3\0\6\27\2\0\6\27\2\0\6\27\2\0"+
    "\3\27\43\0\14\27\1\0\32\27\1\0\23\27\1\0"+
    "\2\27\1\0\17\27\2\0\16\27\42\0\173\27\105\0"+
    "\65\27\210\0\1\66\202\0\35\27\3\0\61\27\17\0"+
    "\1\66\37\0\40\27\15\0\36\27\5\0\46\27\5\66"+
    "\5\0\36\27\2\0\44\27\4\0\10\27\1\0\5\27"+
    "\52\0\236\27\2\0\12\66\6\0\44\27\4\0\44\27"+
    "\4\0\50\27\10\0\64\27\234\0\67\27\11\0\26\27"+
    "\12\0\10\27\230\0\6\27\2\0\1\27\1\0\54\27"+
    "\1\0\2\27\3\0\1\27\2\0\27\27\12\0\27\27"+
    "\11\0\37\27\101\0\23\27\1\0\2\27\12\0\26\27"+
    "\12\0\32\27\106\0\70\27\6\0\2\27\100\0\1\27"+
    "\3\66\1\0\2\66\5\0\4\66\4\27\1\0\3\27"+
    "\1\0\35\27\2\0\3\66\4\0\1\66\40\0\35\27"+
    "\3\0\35\27\43\0\10\27\1\0\34\27\2\66\31\0"+
    "\66\27\12\0\26\27\12\0\23\27\15\0\22\27\156\0"+
    "\111\27\67\0\63\27\15\0\63\27\15\0\44\27\4\66"+
    "\10\0\12\66\306\0\35\27\12\0\1\27\10\0\26\27"+
    "\13\66\217\0\27\27\11\0\3\66\65\27\17\66\37\0"+
    "\12\66\17\0\4\66\55\27\13\66\25\0\31\27\7\0"+
    "\12\66\6\0\3\66\44\27\16\66\1\0\12\66\4\0"+
    "\1\27\2\66\11\0\43\27\1\66\2\0\1\27\11\0"+
    "\3\66\60\27\16\66\4\27\4\0\4\66\3\0\12\66"+
    "\1\27\1\0\1\27\43\0\22\27\1\0\31\27\14\66"+
    "\6\0\1\66\101\0\7\27\1\0\1\27\1\0\4\27"+
    "\1\0\17\27\1\0\12\27\7\0\57\27\14\66\5\0"+
    "\12\66\6\0\4\66\1\0\10\27\2\0\2\27\2\0"+
    "\26\27\1\0\7\27\1\0\2\27\1\0\5\27\1\0"+
    "\2\66\1\27\7\66\2\0\2\66\2\0\3\66\2\0"+
    "\1\27\6\0\1\66\5\0\5\27\2\66\2\0\7\66"+
    "\3\0\5\66\213\0\65\27\22\66\4\27\5\0\12\66"+
    "\4\0\1\66\1\27\40\0\60\27\24\66\2\27\1\0"+
    "\1\27\10\0\12\66\246\0\57\27\7\66\2\0\11\66"+
    "\27\0\4\27\2\66\42\0\60\27\21\66\3\0\1\27"+
    "\13\0\12\66\46\0\53\27\15\66\1\27\7\0\12\66"+
    "\66\0\33\27\2\0\17\66\4\0\12\66\306\0\54\27"+
    "\17\66\145\0\100\27\12\66\25\0\1\27\240\0\10\27"+
    "\2\0\47\27\7\66\2\0\7\66\1\27\1\0\1\27"+
    "\1\66\33\0\1\27\12\66\50\27\7\66\1\27\4\66"+
    "\10\0\1\66\10\0\1\27\13\66\56\27\20\66\3\0"+
    "\1\27\42\0\71\27\7\0\11\27\1\0\45\27\10\66"+
    "\1\0\10\66\1\27\17\0\12\66\30\0\36\27\2\0"+
    "\26\66\1\0\16\66\111\0\7\27\1\0\2\27\1\0"+
    "\46\27\6\66\3\0\1\66\1\0\2\66\1\0\7\66"+
    "\1\27\1\66\10\0\12\66\6\0\6\27\1\0\2\27"+
    "\1\0\40\27\5\66\1\0\2\66\1\0\5\66\1\27"+
    "\7\0\12\66\u0136\0\23\27\4\66\11\0\232\27\146\0"+
    "\157\27\21\0\304\27\274\0\57\27\321\0\107\27\271\0"+
    "\71\27\7\0\37\27\1\0\12\66\146\0\36\27\2\0"+
    "\5\66\13\0\60\27\7\66\11\0\4\27\14\0\12\66"+
    "\11\0\25\27\5\0\23\27\260\0\100\27\200\0\113\27"+
    "\4\0\1\66\1\27\67\66\7\0\4\66\15\27\100\0"+
    "\2\27\1\0\1\27\34\0\370\27\10\0\363\27\15\0"+
    "\37\27\61\0\3\27\21\0\4\27\10\0\u018c\27\4\0"+
    "\153\27\5\0\15\27\3\0\11\27\7\0\12\27\3\0"+
    "\2\66\306\0\5\66\3\0\6\66\10\0\10\66\2\0"+
    "\7\66\36\0\4\66\224\0\3\66\273\0\125\27\1\0"+
    "\107\27\1\0\2\27\2\0\1\27\2\0\2\27\2\0"+
    "\4\27\1\0\14\27\1\0\1\27\1\0\7\27\1\0"+
    "\101\27\1\0\4\27\2\0\10\27\1\0\7\27\1\0"+
    "\34\27\1\0\4\27\1\0\5\27\1\0\1\27\3\0"+
    "\7\27\1\0\u0154\27\2\0\31\27\1\0\31\27\1\0"+
    "\37\27\1\0\31\27\1\0\37\27\1\0\31\27\1\0"+
    "\37\27\1\0\31\27\1\0\37\27\1\0\31\27\1\0"+
    "\10\27\2\0\151\66\4\0\62\66\10\0\1\66\16\0"+
    "\1\66\26\0\5\66\1\0\17\66\120\0\7\66\1\0"+
    "\21\66\2\0\7\66\1\0\2\66\1\0\5\66\325\0"+
    "\55\27\3\0\7\66\7\27\2\0\12\66\4\0\1\27"+
    "\u0171\0\54\27\16\66\6\0\305\27\13\0\7\66\51\0"+
    "\104\27\7\66\1\27\4\0\12\66\246\0\4\27\1\0"+
    "\33\27\1\0\2\27\1\0\1\27\2\0\1\27\1\0"+
    "\12\27\1\0\4\27\1\0\1\27\1\0\1\27\6\0"+
    "\1\27\4\0\1\27\1\0\1\27\1\0\1\27\1\0"+
    "\3\27\1\0\2\27\1\0\1\27\2\0\1\27\1\0"+
    "\1\27\1\0\1\27\1\0\1\27\1\0\1\27\1\0"+
    "\2\27\1\0\1\27\2\0\4\27\1\0\7\27\1\0"+
    "\4\27\1\0\4\27\1\0\1\27\1\0\12\27\1\0"+
    "\21\27\5\0\3\27\1\0\5\27\1\0\21\27\104\0"+
    "\327\27\51\0\65\27\13\0\336\27\2\0\u0182\27\16\0"+
    "\u0131\27\37\0\36\27\342\0\360\66\20\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[29696];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\2\3\1\2\1\3\1\4\2\3"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\3\1\22\1\23"+
    "\1\24\1\3\1\25\1\26\1\23\1\3\13\23\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\0\1\35\1\0"+
    "\1\36\1\0\1\37\1\0\1\40\1\0\1\41\1\42"+
    "\1\0\1\43\1\44\5\23\1\45\1\23\1\46\6\23"+
    "\1\34\1\35\1\0\2\23\1\47\1\23\1\50\2\23"+
    "\1\51\6\23\1\52\1\53\1\54\6\23\1\55\1\23"+
    "\1\56\5\23\1\57\2\23\1\60\2\23\1\61\1\62"+
    "\2\23\1\63\1\23\1\64\2\23\1\65\1\23\1\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\71\0\162\0\253\0\344\0\u011d\0\u0156\0\u018f"+
    "\0\u011d\0\u01c8\0\u0201\0\u011d\0\u011d\0\u011d\0\u011d\0\u023a"+
    "\0\u011d\0\u0273\0\u02ac\0\u02e5\0\u011d\0\u011d\0\u031e\0\u011d"+
    "\0\u031e\0\u011d\0\u0357\0\u011d\0\u0390\0\u011d\0\u011d\0\u03c9"+
    "\0\u0402\0\u043b\0\u0474\0\u04ad\0\u04e6\0\u051f\0\u0558\0\u0591"+
    "\0\u05ca\0\u0603\0\u063c\0\u0675\0\u011d\0\u011d\0\u011d\0\u031e"+
    "\0\u011d\0\u06ae\0\u018f\0\u011d\0\u06e7\0\u011d\0\u0201\0\u011d"+
    "\0\u01c8\0\u011d\0\u0720\0\u0759\0\u011d\0\u0402\0\u011d\0\u0357"+
    "\0\u0792\0\u07cb\0\u0804\0\u083d\0\u0876\0\u0357\0\u08af\0\u08e8"+
    "\0\u0921\0\u095a\0\u0993\0\u09cc\0\u0a05\0\u0a3e\0\u011d\0\u018f"+
    "\0\u0a77\0\u0ab0\0\u0ae9\0\u0357\0\u0b22\0\u0357\0\u0b5b\0\u0b94"+
    "\0\u0357\0\u0bcd\0\u0c06\0\u0c3f\0\u0c78\0\u0cb1\0\u0cea\0\u011d"+
    "\0\u0357\0\u0357\0\u0d23\0\u0d5c\0\u0d95\0\u0dce\0\u0e07\0\u0e40"+
    "\0\u0357\0\u0e79\0\u0357\0\u0eb2\0\u0eeb\0\u0f24\0\u0f5d\0\u0f96"+
    "\0\u0357\0\u0fcf\0\u1008\0\u0357\0\u1041\0\u107a\0\u0357\0\u0357"+
    "\0\u10b3\0\u10ec\0\u0357\0\u1125\0\u0357\0\u115e\0\u1197\0\u0357"+
    "\0\u11d0\0\u0357";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\3\4\16\3\1\5\46\3\1\6\3\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\33\1\44\1\45\2\33\1\46"+
    "\1\33\1\47\1\50\2\33\1\51\1\33\1\52\1\53"+
    "\1\33\1\54\1\33\1\55\1\56\1\57\1\60\1\6"+
    "\1\61\1\6\22\3\1\0\47\3\3\4\16\3\1\0"+
    "\46\3\6\0\1\62\154\0\3\7\65\0\4\63\1\64"+
    "\24\63\1\65\37\63\24\0\1\66\44\0\7\67\1\70"+
    "\61\67\6\0\1\71\15\0\1\72\56\0\1\73\3\0"+
    "\1\74\71\0\1\23\71\0\1\61\56\0\1\71\101\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\24\33\4\0"+
    "\1\33\2\0\2\75\2\0\64\75\7\0\1\71\10\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\24\33\4\0"+
    "\1\33\2\0\35\76\1\77\33\76\17\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\17\33\1\100\4\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\1\101\23\33\4\0\1\33\21\0\1\33\7\0\1\33"+
    "\4\0\1\33\1\0\11\33\1\102\1\33\1\103\7\33"+
    "\1\104\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\14\33\1\105\7\33\4\0\1\33\21\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\4\33\1\106"+
    "\5\33\1\107\1\110\10\33\4\0\1\33\21\0\1\33"+
    "\7\0\1\33\4\0\1\33\1\0\3\33\1\111\20\33"+
    "\4\0\1\33\21\0\1\33\7\0\1\33\4\0\1\33"+
    "\1\0\1\112\23\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\16\33\1\113\5\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\11\33\1\114\12\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\3\33\1\115\20\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\6\33\1\116\15\33\4\0\1\33\16\0\1\117\6\0"+
    "\1\117\1\0\1\117\6\0\1\117\30\0\1\117\3\0"+
    "\4\63\1\120\24\63\1\65\37\63\12\73\1\121\56\73"+
    "\2\74\1\0\66\74\17\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\17\33\1\122\4\33\4\0\1\33\21\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\17\33\1\123"+
    "\4\33\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\2\33\1\124\21\33\4\0\1\33\21\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\20\33\1\125"+
    "\3\33\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\16\33\1\126\5\33\4\0\1\33\21\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\15\33\1\127"+
    "\6\33\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\21\33\1\130\2\33\4\0\1\33\21\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\20\33\1\131"+
    "\3\33\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\20\33\1\132\3\33\4\0\1\33\21\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\14\33\1\133"+
    "\7\33\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\14\33\1\134\7\33\4\0\1\33\21\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\12\33\1\135"+
    "\11\33\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\3\33\1\136\3\33\1\137\14\33\4\0"+
    "\1\33\2\0\12\73\1\121\3\73\1\140\52\73\17\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\3\33\1\141"+
    "\20\33\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\3\33\1\142\20\33\4\0\1\33\21\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\3\33\1\143"+
    "\20\33\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\11\33\1\144\2\33\1\145\7\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\14\33\1\146\7\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\1\33\1\147\22\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\5\33\1\150\16\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\20\33\1\151\3\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\15\33\1\152\6\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\13\33\1\153\10\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\11\33\1\154\12\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\13\33\1\155\10\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\3\33\1\156\20\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\16\33\1\157\5\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\10\33\1\160\13\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\6\33\1\161\15\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\16\33\1\162\5\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\11\33\1\163\12\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\3\33\1\164\20\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\2\33\1\165\21\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\12\33\1\166\11\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\20\33\1\167\3\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\3\33\1\170\20\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\1\171\23\33\4\0\1\33"+
    "\21\0\1\33\7\0\1\33\4\0\1\33\1\0\1\172"+
    "\23\33\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\17\33\1\173\4\33\4\0\1\33\21\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\3\33\1\174"+
    "\20\33\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\12\33\1\175\11\33\4\0\1\33\21\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\20\33\1\176"+
    "\3\33\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\13\33\1\177\10\33\4\0\1\33\21\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\3\33\1\200"+
    "\20\33\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\20\33\1\201\3\33\4\0\1\33\21\0"+
    "\1\33\7\0\1\33\4\0\1\33\1\0\17\33\1\202"+
    "\4\33\4\0\1\33\2\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[4617];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\3\1\1\11\2\1\1\11\2\1\4\11\1\1"+
    "\1\11\3\1\2\11\1\1\1\11\1\1\1\11\1\1"+
    "\1\11\1\1\2\11\15\1\3\11\1\1\1\11\1\1"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\1\1\11\1\0\1\11\17\1\1\11\1\1"+
    "\1\0\16\1\1\11\42\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _DejavuLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public com.intellij.psi.tree.IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return NORMAL_TEXT;
            }
          // fall through
          case 55: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 56: break;
          case 3:
            { return BAD_CHARACTER;
            }
          // fall through
          case 57: break;
          case 4:
            { return DOLLAR;
            }
          // fall through
          case 58: break;
          case 5:
            { return PARENTHESIS_L;
            }
          // fall through
          case 59: break;
          case 6:
            { return PARENTHESIS_R;
            }
          // fall through
          case 60: break;
          case 7:
            { return OP_MANY;
            }
          // fall through
          case 61: break;
          case 8:
            { return COMMA;
            }
          // fall through
          case 62: break;
          case 9:
            { return HYPHEN;
            }
          // fall through
          case 63: break;
          case 10:
            { return DOT;
            }
          // fall through
          case 64: break;
          case 11:
            { return SLASH;
            }
          // fall through
          case 65: break;
          case 12:
            { return INTEGER;
            }
          // fall through
          case 66: break;
          case 13:
            { return COLON;
            }
          // fall through
          case 67: break;
          case 14:
            { return SEMICOLON;
            }
          // fall through
          case 68: break;
          case 15:
            { return ANGLE_L;
            }
          // fall through
          case 69: break;
          case 16:
            { return EQ;
            }
          // fall through
          case 70: break;
          case 17:
            { return ANGLE_R;
            }
          // fall through
          case 71: break;
          case 18:
            { return AT;
            }
          // fall through
          case 72: break;
          case 19:
            { return SYMBOL;
            }
          // fall through
          case 73: break;
          case 20:
            { return BRACKET_L;
            }
          // fall through
          case 74: break;
          case 21:
            { return BRACKET_R;
            }
          // fall through
          case 75: break;
          case 22:
            { return OP_REMARK;
            }
          // fall through
          case 76: break;
          case 23:
            { return BRACE_L;
            }
          // fall through
          case 77: break;
          case 24:
            { return OP_OR;
            }
          // fall through
          case 78: break;
          case 25:
            { return BRACE_R;
            }
          // fall through
          case 79: break;
          case 26:
            { return OP_CONCAT;
            }
          // fall through
          case 80: break;
          case 27:
            { return PROPORTION;
            }
          // fall through
          case 81: break;
          case 28:
            { yybegin(ProgramContext);
          return TEMPLATE_L;
            }
          // fall through
          case 82: break;
          case 29:
            { return TEXT_DOUBLE;
            }
          // fall through
          case 83: break;
          case 30:
            { yybegin(YYINITIAL);
		  return TEMPLATE_R;
            }
          // fall through
          case 84: break;
          case 31:
            { return TEXT_SINGLE;
            }
          // fall through
          case 85: break;
          case 32:
            { return TO;
            }
          // fall through
          case 86: break;
          case 33:
            { return COMMENT_LINE;
            }
          // fall through
          case 87: break;
          case 34:
            { return ESCAPED;
            }
          // fall through
          case 88: break;
          case 35:
            { return SYMBOW_RAW;
            }
          // fall through
          case 89: break;
          case 36:
            { return KW_AS;
            }
          // fall through
          case 90: break;
          case 37:
            { return KW_IF;
            }
          // fall through
          case 91: break;
          case 38:
            { return KW_IN;
            }
          // fall through
          case 92: break;
          case 39:
            { return KW_END;
            }
          // fall through
          case 93: break;
          case 40:
            { return KW_FOR;
            }
          // fall through
          case 94: break;
          case 41:
            { return KW_LET;
            }
          // fall through
          case 95: break;
          case 42:
            { return COMMENT_BLOCK;
            }
          // fall through
          case 96: break;
          case 43:
            { return KW_CASE;
            }
          // fall through
          case 97: break;
          case 44:
            { return KW_ELSE;
            }
          // fall through
          case 98: break;
          case 45:
            { return KW_SLOT;
            }
          // fall through
          case 99: break;
          case 46:
            { return KW_WHEN;
            }
          // fall through
          case 100: break;
          case 47:
            { return KW_MATCH;
            }
          // fall through
          case 101: break;
          case 48:
            { return KW_WHILE;
            }
          // fall through
          case 102: break;
          case 49:
            { return KW_IMPORT;
            }
          // fall through
          case 103: break;
          case 50:
            { return KW_INVOKE;
            }
          // fall through
          case 104: break;
          case 51:
            { return KW_EXTENDS;
            }
          // fall through
          case 105: break;
          case 52:
            { return KW_PROGRAM;
            }
          // fall through
          case 106: break;
          case 53:
            { return KW_TEMPLATE;
            }
          // fall through
          case 107: break;
          case 54:
            { return KW_IMPLEMENTS;
            }
          // fall through
          case 108: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
