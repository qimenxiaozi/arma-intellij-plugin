/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.kaylerrenslow.a3plugin.lang.header;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.kaylerrenslow.a3plugin.lang.header.psi.HeaderTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>header.flex</tt>
 */
class HeaderLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 14864 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\5\21\1\22\1\23\1\24\1\21\14\25\1\26\50\25\1\27\2\25\1\30\1\31\1\32\1\33"+
    "\25\25\1\34\20\21\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\21\1\44\1\45\1\46\1"+
    "\21\1\47\2\21\1\50\4\21\1\25\1\51\1\52\5\21\2\25\1\53\31\21\1\25\1\54\1\21"+
    "\1\55\40\21\1\56\17\21\1\57\1\60\1\61\1\62\13\21\1\63\10\21\123\25\1\64\7"+
    "\25\1\65\1\66\37\21\1\25\1\66\u0582\21\1\67\u017f\21");

  /* The ZZ_CMAP_Y table has 3584 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1"+
    "\17\3\0\1\20\1\21\1\22\1\23\2\24\1\25\3\24\1\25\71\24\1\26\1\24\1\27\1\30"+
    "\1\31\1\32\2\30\16\0\1\33\1\20\1\34\1\35\2\24\1\36\11\24\1\37\21\24\1\40\1"+
    "\41\23\24\1\30\1\42\3\24\1\25\1\43\1\42\4\24\1\44\1\45\4\0\1\46\1\47\1\30"+
    "\3\24\2\50\1\30\1\51\1\52\1\0\1\53\5\24\1\54\3\0\1\55\1\56\13\24\1\57\1\46"+
    "\1\60\1\61\1\0\1\62\1\30\1\63\1\64\3\24\3\0\1\65\12\24\1\66\1\0\1\67\1\30"+
    "\1\0\1\70\3\24\1\54\1\71\1\23\2\24\1\66\1\72\1\73\1\74\2\30\3\24\1\75\10\30"+
    "\1\76\1\31\6\30\1\77\2\0\1\100\1\101\6\24\1\102\2\0\1\103\1\24\1\104\1\0\2"+
    "\42\1\105\1\106\1\107\2\24\1\76\1\110\1\111\1\112\1\113\1\63\1\114\1\104\1"+
    "\0\1\115\1\52\1\105\1\116\1\107\2\24\1\76\1\117\1\120\1\121\1\122\1\123\1"+
    "\124\1\125\1\0\1\126\1\30\1\105\1\37\1\36\2\24\1\76\1\127\1\111\1\46\1\130"+
    "\1\131\1\30\1\104\1\0\1\43\1\30\1\105\1\106\1\107\2\24\1\76\1\127\1\111\1"+
    "\112\1\122\1\125\1\114\1\104\1\0\1\43\1\30\1\132\1\133\1\134\1\135\1\136\1"+
    "\133\1\24\1\137\1\140\1\141\1\142\1\30\1\125\1\0\1\30\1\43\1\105\1\33\1\76"+
    "\2\24\1\76\1\143\1\144\1\145\1\141\1\146\1\27\1\104\1\0\2\30\1\147\1\33\1"+
    "\76\2\24\1\76\1\143\1\111\1\145\1\141\1\146\1\34\1\104\1\0\1\150\1\30\1\147"+
    "\1\33\1\76\4\24\1\151\1\145\1\152\1\63\1\30\1\104\1\0\1\30\1\41\1\147\1\24"+
    "\1\25\1\41\2\24\1\36\1\153\1\25\1\154\1\155\1\0\2\30\1\156\1\30\1\42\5\24"+
    "\1\157\1\160\1\161\1\100\1\0\1\162\4\30\1\163\1\164\1\165\1\42\1\166\1\167"+
    "\1\157\1\170\1\171\1\172\1\0\1\173\4\30\1\131\2\30\1\162\1\0\1\162\1\174\1"+
    "\175\1\24\1\42\3\24\1\31\1\45\1\0\1\145\1\176\1\0\1\45\3\0\1\51\1\177\7\30"+
    "\5\24\1\54\1\0\1\200\1\0\1\162\1\66\1\201\1\202\1\203\1\204\1\24\1\205\1\206"+
    "\1\0\1\172\4\24\1\37\1\22\5\24\1\207\51\24\1\134\1\25\1\134\5\24\1\134\4\24"+
    "\1\134\1\25\1\134\1\24\1\25\7\24\1\134\10\24\1\210\4\30\2\24\2\30\12\24\1"+
    "\31\1\30\1\42\114\24\1\106\2\24\1\42\2\24\1\50\11\24\1\133\1\131\1\30\1\24"+
    "\1\33\1\211\1\30\2\24\1\211\1\30\2\24\1\212\1\30\1\24\1\33\1\213\1\30\6\24"+
    "\1\214\3\0\1\215\1\216\1\0\1\162\3\30\1\217\1\0\1\162\13\24\1\30\5\24\1\220"+
    "\10\24\1\221\1\30\3\24\1\31\1\0\1\2\1\0\1\2\1\125\1\0\3\24\1\221\1\31\1\30"+
    "\5\24\1\115\2\0\1\56\1\162\1\0\1\162\4\30\2\24\1\161\1\2\6\24\1\176\1\100"+
    "\3\0\1\112\1\0\1\162\1\0\1\162\1\44\13\30\1\222\5\24\1\214\1\0\1\222\1\115"+
    "\1\0\1\162\1\30\1\223\1\2\1\30\1\224\3\24\1\103\1\203\1\0\1\70\4\24\1\66\1"+
    "\0\1\2\1\30\4\24\1\214\2\0\1\30\1\0\1\225\1\0\1\70\3\24\1\221\12\30\1\226"+
    "\2\0\1\227\1\230\1\30\30\24\4\0\1\100\2\30\1\77\42\24\2\221\4\24\2\221\1\24"+
    "\1\231\3\24\1\221\6\24\1\33\1\171\1\232\1\31\1\233\1\115\1\24\1\31\1\232\1"+
    "\31\1\30\1\223\3\30\1\234\1\30\1\44\1\131\1\30\1\235\1\30\1\51\1\236\1\43"+
    "\1\44\2\30\1\24\1\31\3\24\1\50\2\30\1\0\1\51\1\237\1\0\1\240\1\30\1\241\1"+
    "\41\1\153\1\242\1\32\1\243\1\24\1\244\1\245\1\246\2\30\5\24\1\131\116\30\5"+
    "\24\1\25\5\24\1\25\20\24\1\31\1\247\1\250\1\30\4\24\1\37\1\22\7\24\1\44\1"+
    "\30\1\63\2\24\1\25\1\30\10\25\4\0\5\30\1\44\72\30\1\245\3\30\1\42\1\205\1"+
    "\242\1\31\1\42\11\24\1\25\1\251\1\42\12\24\1\207\1\245\4\24\1\221\1\42\12"+
    "\24\1\25\2\30\3\24\1\50\6\30\170\24\1\221\11\30\71\24\1\31\6\30\21\24\1\31"+
    "\10\30\5\24\1\221\41\24\1\31\2\24\1\0\1\250\2\30\5\24\1\161\1\77\1\252\3\24"+
    "\1\63\12\24\1\162\3\30\1\44\1\24\1\41\14\24\1\253\1\115\1\30\1\24\1\50\11"+
    "\30\1\24\1\254\1\255\2\24\1\54\2\30\1\131\6\24\1\115\1\30\1\70\5\24\1\214"+
    "\1\0\1\51\1\30\1\0\1\162\2\0\1\70\1\52\1\0\1\70\2\24\1\66\1\172\2\24\1\161"+
    "\1\0\1\2\1\30\3\24\1\31\1\101\5\24\1\54\1\0\1\240\1\44\1\0\1\162\4\30\5\24"+
    "\1\103\1\100\1\30\1\255\1\256\1\0\1\162\2\24\1\25\1\257\6\24\1\202\1\260\1"+
    "\220\2\30\1\261\1\24\1\54\1\262\1\30\3\263\1\30\2\25\22\30\4\24\1\54\1\264"+
    "\1\0\1\162\64\24\1\115\1\30\2\24\1\25\1\265\5\24\1\115\40\30\55\24\1\221\15"+
    "\24\1\27\4\30\1\25\1\30\1\265\1\266\1\24\1\76\1\25\1\171\1\267\15\24\1\27"+
    "\3\30\1\265\54\24\1\221\2\30\10\24\1\41\6\24\5\30\1\24\1\31\2\0\2\30\1\100"+
    "\1\30\1\136\2\30\1\245\3\30\1\43\1\33\20\24\1\270\1\235\1\30\1\0\1\162\1\42"+
    "\2\24\1\116\1\42\2\24\1\50\1\271\12\24\1\25\3\41\1\272\1\273\2\30\1\274\1"+
    "\24\1\143\2\24\1\25\2\24\1\275\1\24\1\221\1\24\1\221\4\30\17\24\1\50\10\30"+
    "\6\24\1\31\20\30\1\276\20\30\3\24\1\31\6\24\1\131\5\30\3\24\1\25\2\30\3\24"+
    "\1\50\6\30\3\24\1\221\4\24\1\115\1\24\1\242\5\30\23\24\1\221\1\0\1\162\52"+
    "\30\1\221\1\76\4\24\1\37\1\277\2\24\1\221\25\30\2\24\1\221\1\30\3\24\1\27"+
    "\10\30\7\24\1\271\10\30\1\300\1\77\1\143\1\42\2\24\1\115\1\121\4\30\3\24\1"+
    "\31\20\30\6\24\1\221\1\30\2\24\1\221\1\30\2\24\1\50\21\30\11\24\1\131\66\30"+
    "\1\224\6\24\1\0\1\100\3\30\1\125\1\0\2\30\1\224\5\24\1\0\1\301\2\30\3\24\1"+
    "\131\1\0\1\162\1\224\3\24\1\161\1\0\1\145\1\0\10\30\1\224\5\24\1\54\1\0\1"+
    "\302\1\30\1\0\1\162\24\30\5\24\1\54\1\0\1\30\1\0\1\162\46\30\55\24\1\25\22"+
    "\30\14\24\1\50\63\30\5\24\1\25\72\30\7\24\1\131\130\30\10\24\1\31\1\30\1\103"+
    "\4\0\1\100\1\30\1\63\1\224\1\24\14\30\1\27\153\30\1\303\1\304\2\0\1\305\1"+
    "\2\3\30\1\306\22\30\1\307\67\30\12\24\1\33\10\24\1\33\1\310\1\311\1\24\1\312"+
    "\1\143\7\24\1\37\1\313\2\33\3\24\1\314\1\171\1\41\1\76\51\24\1\221\3\24\1"+
    "\76\2\24\1\207\3\24\1\207\2\24\1\33\3\24\1\33\2\24\1\25\3\24\1\25\3\24\1\76"+
    "\3\24\1\76\2\24\1\207\1\315\6\0\1\143\3\24\1\163\1\42\1\207\1\316\1\241\1"+
    "\317\1\163\1\231\1\163\2\207\1\124\1\24\1\36\1\24\1\115\1\320\1\36\1\24\1"+
    "\115\50\30\32\24\1\25\5\30\106\24\1\31\1\30\33\24\1\221\74\30\1\123\3\30\14"+
    "\0\20\30\36\0\2\30");

  /* The ZZ_CMAP_A table has 1672 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\7\1\13\1\11\1\63\1\13\1\10\6\7\4\0\1\13\1\0\1\25\1\40\1\1\3\0\1\30\1\31"+
    "\1\15\1\53\1\60\1\21\1\17\1\14\1\22\11\16\1\61\1\62\1\26\1\52\1\27\2\0\1\34"+
    "\1\24\1\37\1\24\1\32\1\24\5\6\1\35\5\6\1\4\1\2\1\3\1\6\1\33\1\6\1\36\2\6\1"+
    "\56\1\12\1\57\1\0\1\5\1\0\1\51\1\24\1\50\1\41\1\20\1\42\2\6\1\43\2\6\1\46"+
    "\1\6\1\44\4\6\1\47\1\6\1\45\2\6\1\23\2\6\1\54\1\0\1\55\1\0\6\7\1\64\2\7\2"+
    "\0\4\6\4\0\1\6\2\0\1\7\7\0\1\6\4\0\1\6\5\0\17\6\1\0\2\6\4\0\4\6\16\0\5\6\7"+
    "\0\1\6\1\0\1\6\1\0\5\6\1\0\2\6\6\0\1\6\1\0\3\6\1\0\1\6\1\0\4\6\1\0\13\6\1"+
    "\0\3\6\1\0\5\7\2\0\6\6\1\0\7\6\1\0\1\6\15\0\1\6\1\0\15\7\1\0\1\7\1\0\2\7\1"+
    "\0\2\7\1\0\1\7\3\6\5\0\5\7\6\0\1\6\4\0\3\7\5\0\3\6\7\7\4\0\2\6\1\7\13\6\1"+
    "\0\1\6\7\7\2\6\2\7\1\0\4\7\2\6\2\7\3\6\2\0\1\6\7\0\1\7\1\6\1\7\6\6\3\7\2\0"+
    "\11\6\3\7\1\6\6\0\2\7\6\6\4\7\2\6\2\0\2\7\1\6\11\7\1\6\3\7\1\6\5\7\2\0\1\6"+
    "\3\7\4\0\1\6\1\0\6\6\4\0\13\7\1\0\4\7\6\6\3\7\1\6\2\7\1\6\7\7\2\6\2\7\2\0"+
    "\2\7\1\0\3\7\1\0\10\6\2\0\2\6\2\0\6\6\1\0\1\6\3\0\4\6\2\0\1\7\1\6\7\7\2\0"+
    "\2\7\2\0\3\7\1\6\5\0\2\6\1\0\5\6\4\0\3\6\4\0\2\6\1\0\2\6\1\0\2\6\1\0\2\6\2"+
    "\0\1\7\1\0\5\7\4\0\2\7\2\0\3\7\3\0\1\7\7\0\4\6\1\0\1\6\7\0\4\7\3\6\1\7\2\0"+
    "\1\6\1\0\2\6\1\0\3\6\2\7\1\0\3\7\2\0\1\6\11\0\1\7\1\6\1\0\6\6\3\0\3\6\1\0"+
    "\4\6\3\0\2\6\1\0\1\6\1\0\2\6\3\0\2\6\3\0\2\6\4\0\5\7\3\0\3\7\1\0\4\7\2\0\1"+
    "\6\6\0\1\7\4\6\1\0\5\6\3\0\1\6\7\7\1\0\2\7\5\0\2\7\3\0\2\7\1\0\3\6\1\0\2\6"+
    "\5\0\3\6\2\0\1\6\3\7\1\0\4\7\1\6\1\0\4\6\1\0\1\6\4\0\1\7\4\0\6\7\1\0\1\7\3"+
    "\0\2\7\4\0\1\6\1\7\2\6\7\7\4\0\10\6\3\7\7\0\2\6\1\0\1\6\2\0\2\6\1\0\1\6\2"+
    "\0\1\6\6\0\4\6\1\0\3\6\1\0\1\6\1\0\1\6\2\0\2\6\1\0\3\6\2\7\1\0\2\7\1\6\2\0"+
    "\5\6\1\0\1\6\1\0\6\7\2\0\2\7\2\0\4\6\5\0\1\7\1\0\1\7\1\0\1\7\4\0\2\7\5\6\3"+
    "\7\6\0\1\7\1\0\7\7\1\6\2\7\4\6\3\7\1\6\3\7\2\6\7\7\3\6\4\7\5\6\14\7\1\6\1"+
    "\7\3\6\1\0\7\6\2\0\3\7\2\6\3\7\3\0\2\6\2\7\4\0\1\6\1\0\2\7\4\0\4\6\10\7\3"+
    "\0\1\6\3\0\2\6\1\7\5\0\3\7\2\0\1\6\1\7\1\6\5\0\6\6\2\0\5\7\3\6\3\0\10\7\5"+
    "\6\2\7\3\0\3\6\3\7\1\0\5\7\4\6\1\7\4\6\3\7\2\6\2\0\1\6\1\0\1\6\1\0\1\6\1\0"+
    "\1\6\2\0\3\6\1\0\6\6\2\0\2\6\2\63\5\7\5\0\1\6\5\0\6\7\1\0\1\7\3\0\4\7\11\0"+
    "\1\6\4\0\1\6\1\0\5\6\2\0\1\6\1\0\4\6\1\0\3\6\2\0\4\6\5\0\5\6\4\0\1\6\4\0\4"+
    "\6\3\7\2\6\5\0\2\7\2\0\3\6\6\7\1\0\2\6\2\0\4\6\1\0\2\6\1\7\3\6\1\7\4\6\1\7"+
    "\10\6\2\7\4\0\1\6\1\7\4\0\1\7\5\6\2\7\3\0\3\6\4\0\3\6\2\7\2\0\6\6\1\0\3\7"+
    "\1\0\2\7\5\0\5\6\5\0\1\6\1\7\3\6\1\0\2\6\1\0\7\6\2\0\1\7\6\0\2\6\2\0\3\6\3"+
    "\0\2\6\3\0\2\6\2\0\3\7\4\0\3\6\1\0\2\6\1\0\1\6\5\0\1\7\2\0\1\6\3\0\1\6\2\0"+
    "\2\6\3\7\1\0\2\7\1\0\3\7\2\0\1\7\2\0\1\7\4\6\10\0\5\7\3\0\6\7\2\0\3\7\2\0"+
    "\4\7\4\0\3\7\5\0\1\6\2\0\2\6\2\0\4\6\1\0\4\6\1\0\1\6\1\0\6\6\2\0\5\6\1\0\4"+
    "\6\1\0\4\6\2\0\2\7\1\0\1\6\1\0\1\6\5\0\1\6\1\0\1\6\1\0\3\6\1\0\3\6\1\0\3\6");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\3\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\1\1\7\1\6\2\1\1\10\1\11\1\1\1\2"+
    "\1\12\1\13\1\14\1\15\1\1\1\16\1\17\1\20"+
    "\2\2\2\3\1\21\2\0\2\6\2\0\1\22\1\0"+
    "\1\23\3\0\1\2\1\24\2\2\1\0\1\6\2\25"+
    "\4\0\4\2\1\26\1\25\5\0\4\2\1\25\5\0"+
    "\1\27\1\30\2\2\1\25\11\0\1\25\6\0\1\31"+
    "\1\0\1\32\1\25\5\0\1\33\3\34\2\0\1\25"+
    "\3\35\5\0\1\34\1\25\1\35\16\0\1\36\6\0"+
    "\1\37\17\0\1\36\1\0\1\37";

  private static int [] zzUnpackAction() {
    int [] result = new int[165];
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
    "\0\0\0\65\0\152\0\237\0\324\0\u0109\0\u013e\0\u0173"+
    "\0\65\0\u01a8\0\u01dd\0\65\0\u0212\0\u0247\0\u027c\0\65"+
    "\0\65\0\u02b1\0\u02e6\0\65\0\65\0\65\0\65\0\u031b"+
    "\0\65\0\65\0\65\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424"+
    "\0\u0459\0\u01dd\0\u048e\0\u04c3\0\u04f8\0\u0247\0\u052d\0\u027c"+
    "\0\u027c\0\u0562\0\u0597\0\u05cc\0\u0601\0\65\0\u0636\0\u066b"+
    "\0\u06a0\0\u06d5\0\u070a\0\u04f8\0\u073f\0\u0774\0\u07a9\0\u07de"+
    "\0\u0813\0\u0848\0\u087d\0\u08b2\0\65\0\u08e7\0\u091c\0\u0951"+
    "\0\u0986\0\u09bb\0\u09f0\0\u0a25\0\u0a5a\0\u0a8f\0\u0ac4\0\u0af9"+
    "\0\u0b2e\0\u0b63\0\u0b98\0\u0bcd\0\u0c02\0\237\0\u0c37\0\u0c6c"+
    "\0\u0ca1\0\u0cd6\0\u0d0b\0\u0d40\0\u0d75\0\u0daa\0\u0ddf\0\u0e14"+
    "\0\u0e49\0\u0e7e\0\u0eb3\0\u0ee8\0\u0f1d\0\u0f52\0\u0f87\0\u0fbc"+
    "\0\u0ff1\0\u1026\0\65\0\u105b\0\65\0\u1090\0\u10c5\0\u10fa"+
    "\0\u112f\0\u1164\0\u1199\0\65\0\u11ce\0\u1203\0\u0ff1\0\u1238"+
    "\0\u126d\0\u12a2\0\u12d7\0\u130c\0\u10c5\0\u1341\0\u1376\0\u13ab"+
    "\0\u13e0\0\u1415\0\u144a\0\65\0\u147f\0\u14b4\0\u14e9\0\u151e"+
    "\0\u1553\0\u1588\0\u15bd\0\u15f2\0\u1627\0\u165c\0\u1691\0\u16c6"+
    "\0\u16fb\0\u1730\0\u1765\0\u10fa\0\u179a\0\u17cf\0\u1804\0\u1839"+
    "\0\u186e\0\u18a3\0\u13ab\0\u18d8\0\u190d\0\u1942\0\u1977\0\u19ac"+
    "\0\u19e1\0\u1a16\0\u1a4b\0\u1a80\0\u1ab5\0\u1aea\0\u1b1f\0\u1b54"+
    "\0\u1b89\0\u1bbe\0\u1839\0\u1bf3\0\u1977";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[165];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\3\4\1\5\1\4\1\2\2\6\1\7"+
    "\1\6\1\10\1\11\1\12\1\13\1\4\1\14\1\15"+
    "\2\4\1\16\1\17\1\2\1\20\1\21\6\4\1\22"+
    "\7\4\1\23\1\4\1\24\1\25\1\26\1\27\1\30"+
    "\1\2\1\31\1\32\1\33\70\0\1\4\1\34\5\4"+
    "\6\0\1\4\1\0\1\4\1\0\3\4\5\0\6\4"+
    "\1\0\11\4\12\0\1\4\1\0\7\4\6\0\1\4"+
    "\1\0\1\4\1\0\3\4\5\0\6\4\1\0\11\4"+
    "\12\0\1\4\1\0\4\4\1\35\2\4\6\0\1\4"+
    "\1\0\1\4\1\0\3\4\5\0\6\4\1\0\11\4"+
    "\12\0\1\4\10\0\2\6\1\0\1\6\61\0\1\36"+
    "\1\37\67\0\1\40\1\41\65\0\1\12\1\42\1\43"+
    "\1\0\1\12\7\0\1\43\50\0\1\44\3\0\1\44"+
    "\60\0\1\12\1\42\1\43\1\0\1\12\1\45\6\0"+
    "\1\43\3\0\1\45\26\0\25\46\1\47\37\46\10\50"+
    "\2\0\15\50\1\51\35\50\41\0\1\52\1\0\1\53"+
    "\1\0\1\54\20\0\7\4\6\0\1\4\1\0\1\4"+
    "\1\0\3\4\5\0\6\4\1\0\5\4\1\55\3\4"+
    "\12\0\1\4\57\0\1\56\6\0\2\4\1\57\4\4"+
    "\6\0\1\4\1\0\1\4\1\0\3\4\5\0\6\4"+
    "\1\0\11\4\12\0\1\4\1\0\7\4\6\0\1\4"+
    "\1\0\1\4\1\0\3\4\5\0\1\60\5\4\1\0"+
    "\11\4\12\0\1\4\11\0\1\37\1\0\1\37\64\0"+
    "\1\37\51\0\10\40\2\0\53\40\15\41\1\61\47\41"+
    "\16\0\1\62\2\0\2\62\30\0\1\62\27\0\1\44"+
    "\1\0\1\43\1\0\1\44\7\0\1\43\50\0\1\63"+
    "\1\0\1\63\1\0\1\64\1\0\1\63\5\0\1\63"+
    "\1\0\1\63\2\0\1\63\1\0\2\63\5\0\2\63"+
    "\40\0\1\46\57\0\1\65\106\0\1\66\1\0\1\67"+
    "\64\0\1\70\21\0\7\4\6\0\1\4\1\0\1\4"+
    "\1\0\3\4\5\0\6\4\1\0\10\4\1\71\12\0"+
    "\1\4\1\0\3\4\1\72\3\4\6\0\1\4\1\0"+
    "\1\4\1\0\3\4\5\0\6\4\1\0\11\4\12\0"+
    "\1\4\1\0\7\4\6\0\1\4\1\0\1\4\1\0"+
    "\3\4\5\0\1\4\1\73\2\4\1\74\1\4\1\0"+
    "\11\4\12\0\1\4\14\41\1\75\1\61\47\41\16\0"+
    "\1\62\3\0\1\62\60\0\1\76\1\0\1\76\1\0"+
    "\1\76\1\0\1\76\5\0\1\76\1\0\1\76\2\0"+
    "\1\76\1\0\2\76\5\0\2\76\55\0\1\77\63\0"+
    "\1\100\2\0\1\101\70\0\1\102\55\0\1\103\24\0"+
    "\7\4\6\0\1\4\1\0\1\4\1\0\3\4\5\0"+
    "\6\4\1\0\6\4\1\104\2\4\12\0\1\4\1\0"+
    "\4\4\1\105\2\4\6\0\1\4\1\0\1\4\1\0"+
    "\3\4\5\0\6\4\1\0\11\4\12\0\1\4\1\0"+
    "\7\4\6\0\1\4\1\0\1\4\1\0\3\4\5\0"+
    "\2\4\1\106\3\4\1\0\11\4\12\0\1\4\1\0"+
    "\7\4\6\0\1\4\1\0\1\4\1\0\3\4\5\0"+
    "\1\107\5\4\1\0\11\4\12\0\1\4\16\0\1\110"+
    "\1\0\1\110\1\0\1\110\1\0\1\110\5\0\1\110"+
    "\1\0\1\110\2\0\1\110\1\0\2\110\5\0\2\110"+
    "\56\0\1\111\41\0\1\112\105\0\1\113\71\0\1\114"+
    "\36\0\1\115\45\0\7\4\6\0\1\4\1\0\1\4"+
    "\1\0\3\4\5\0\6\4\1\0\6\4\1\116\2\4"+
    "\12\0\1\4\1\0\6\117\1\4\6\0\1\4\1\0"+
    "\1\117\1\0\1\4\2\117\5\0\6\117\1\0\11\117"+
    "\12\0\1\4\1\0\7\4\6\0\1\4\1\0\1\4"+
    "\1\0\3\4\5\0\3\4\1\120\2\4\1\0\11\4"+
    "\12\0\1\4\1\0\7\4\6\0\1\4\1\0\1\4"+
    "\1\0\3\4\5\0\5\4\1\121\1\0\11\4\12\0"+
    "\1\4\16\0\1\122\1\0\1\122\1\0\1\122\1\0"+
    "\1\122\5\0\1\122\1\0\1\122\2\0\1\122\1\0"+
    "\2\122\5\0\2\122\57\0\1\123\62\0\1\124\42\0"+
    "\1\125\111\0\1\126\61\0\1\127\23\0\7\117\6\0"+
    "\1\117\1\0\1\117\1\0\3\117\5\0\6\117\1\0"+
    "\11\117\12\0\1\117\1\0\7\4\2\130\1\0\1\130"+
    "\2\0\1\4\1\0\1\4\1\0\3\4\3\0\1\131"+
    "\1\0\6\4\1\0\11\4\12\0\1\4\1\0\7\4"+
    "\2\132\1\0\1\132\2\0\1\4\1\0\1\4\1\0"+
    "\3\4\3\0\1\133\1\0\6\4\1\0\11\4\12\0"+
    "\1\4\16\0\1\134\1\0\1\134\1\0\1\134\1\0"+
    "\1\134\5\0\1\134\1\0\1\134\2\0\1\134\1\0"+
    "\2\134\5\0\2\134\33\0\1\135\54\0\2\136\1\0"+
    "\1\136\113\0\1\137\63\0\1\140\33\0\2\141\1\0"+
    "\1\141\61\0\2\130\1\0\1\130\14\0\1\131\34\0"+
    "\10\131\2\0\16\131\1\142\1\143\33\131\10\0\2\132"+
    "\1\0\1\132\14\0\1\133\34\0\10\133\2\0\16\133"+
    "\1\144\1\145\33\133\16\0\1\146\1\0\1\146\1\0"+
    "\1\146\1\0\1\146\5\0\1\146\1\0\1\146\2\0"+
    "\1\146\1\0\2\146\5\0\2\146\23\0\2\147\1\0"+
    "\1\147\51\0\10\150\2\136\1\151\1\152\51\150\10\0"+
    "\2\153\1\0\1\153\71\0\1\154\44\0\10\155\2\141"+
    "\1\156\1\157\51\155\10\160\2\0\16\160\2\0\33\160"+
    "\10\161\2\0\16\161\2\0\33\161\16\0\1\162\1\0"+
    "\1\162\1\0\1\162\1\0\1\162\5\0\1\162\1\0"+
    "\1\162\2\0\1\162\1\0\2\162\5\0\2\162\13\0"+
    "\10\163\2\147\1\164\1\165\51\163\10\150\2\0\1\151"+
    "\25\150\1\166\34\150\1\167\1\150\1\151\25\150\1\166"+
    "\34\150\2\136\1\151\1\152\24\150\1\166\24\150\10\170"+
    "\2\153\1\171\1\172\51\170\10\155\2\0\1\156\62\155"+
    "\1\173\1\155\1\156\52\155\31\0\1\131\64\0\1\133"+
    "\51\0\1\174\1\0\1\174\1\0\1\174\1\0\1\174"+
    "\5\0\1\174\1\0\1\174\2\0\1\174\1\0\2\174"+
    "\5\0\2\174\13\0\10\163\2\0\1\164\62\163\1\175"+
    "\1\163\1\164\52\163\10\150\2\0\1\151\5\150\1\176"+
    "\17\150\1\166\34\150\1\0\1\150\1\151\25\150\1\166"+
    "\24\150\10\170\2\0\1\171\25\170\1\177\34\170\1\200"+
    "\1\170\1\171\25\170\1\177\34\170\2\153\1\171\1\172"+
    "\24\170\1\177\24\170\10\155\1\0\1\155\1\156\52\155"+
    "\10\163\1\0\1\163\1\164\52\163\10\150\2\0\1\151"+
    "\25\150\1\166\3\150\1\201\1\150\1\202\16\150\10\170"+
    "\2\0\1\171\5\170\1\203\17\170\1\177\34\170\1\0"+
    "\1\170\1\171\25\170\1\177\24\170\10\150\2\0\1\151"+
    "\25\150\1\166\1\204\33\150\2\0\1\151\25\150\1\166"+
    "\6\150\1\205\15\150\10\170\2\0\1\171\25\170\1\177"+
    "\3\170\1\206\1\170\1\207\16\170\10\150\2\0\1\151"+
    "\25\150\1\166\2\150\1\210\31\150\2\0\1\151\5\150"+
    "\1\211\17\150\1\166\24\150\10\170\2\0\1\171\25\170"+
    "\1\177\1\212\33\170\2\0\1\171\25\170\1\177\6\170"+
    "\1\213\15\170\10\150\2\0\1\151\25\150\1\166\1\150"+
    "\1\214\32\150\2\215\1\151\1\211\24\150\1\166\24\150"+
    "\10\170\2\0\1\171\25\170\1\177\2\170\1\216\31\170"+
    "\2\0\1\171\5\170\1\217\17\170\1\177\24\170\10\220"+
    "\2\215\1\221\1\222\51\220\10\170\2\0\1\171\25\170"+
    "\1\177\1\170\1\223\32\170\2\224\1\171\1\217\24\170"+
    "\1\177\24\170\10\220\2\0\1\221\25\220\1\225\34\220"+
    "\1\226\1\220\1\221\25\220\1\225\34\220\2\215\1\221"+
    "\1\222\24\220\1\225\24\220\10\227\2\224\1\230\1\231"+
    "\51\227\10\220\2\0\1\221\5\220\1\232\17\220\1\225"+
    "\34\220\1\0\1\220\1\221\25\220\1\225\24\220\10\227"+
    "\2\0\1\230\25\227\1\233\34\227\1\234\1\227\1\230"+
    "\25\227\1\233\34\227\2\224\1\230\1\231\24\227\1\233"+
    "\24\227\10\220\2\0\1\221\25\220\1\225\3\220\1\235"+
    "\20\220\10\227\2\0\1\230\5\227\1\236\17\227\1\233"+
    "\34\227\1\0\1\227\1\230\25\227\1\233\24\227\10\220"+
    "\2\0\1\221\25\220\1\225\1\237\23\220\10\227\2\0"+
    "\1\230\25\227\1\233\3\227\1\240\20\227\10\220\2\0"+
    "\1\221\25\220\1\225\2\220\1\241\21\220\10\227\2\0"+
    "\1\230\25\227\1\233\1\242\23\227\10\220\2\0\1\221"+
    "\25\220\1\225\1\220\1\243\22\220\10\227\2\0\1\230"+
    "\25\227\1\233\2\227\1\244\31\227\2\0\1\230\25\227"+
    "\1\233\1\227\1\245\22\227";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7208];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\1\11\2\1\1\11\3\1\2\11"+
    "\2\1\4\11\1\1\3\11\5\1\2\0\2\1\2\0"+
    "\1\1\1\0\1\1\3\0\1\1\1\11\2\1\1\0"+
    "\3\1\4\0\4\1\1\11\1\1\5\0\5\1\5\0"+
    "\5\1\11\0\1\1\6\0\1\11\1\0\1\11\1\1"+
    "\5\0\1\11\3\1\2\0\4\1\5\0\1\1\1\11"+
    "\1\1\16\0\1\1\6\0\1\1\17\0\1\1\1\0"+
    "\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[165];
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

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  HeaderLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * @return      <code>false</code>, iff there was new input.
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
   * Returns the character at position <tt>pos</tt> from the
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
   * Reports an error that occured while scanning.
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
        return;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            }
          case 32: break;
          case 2: 
            { return HeaderTypes.IDENTIFIER;
            }
          case 33: break;
          case 3: 
            { return TokenType.WHITE_SPACE;
            }
          case 34: break;
          case 4: 
            { return HeaderTypes.FSLASH;
            }
          case 35: break;
          case 5: 
            { return HeaderTypes.ASTERISK;
            }
          case 36: break;
          case 6: 
            { return HeaderTypes.NUMBER_LITERAL;
            }
          case 37: break;
          case 7: 
            { return HeaderTypes.MINUS;
            }
          case 38: break;
          case 8: 
            { return HeaderTypes.LPAREN;
            }
          case 39: break;
          case 9: 
            { return HeaderTypes.RPAREN;
            }
          case 40: break;
          case 10: 
            { return HeaderTypes.EQ;
            }
          case 41: break;
          case 11: 
            { return HeaderTypes.PLUS;
            }
          case 42: break;
          case 12: 
            { return HeaderTypes.LBRACE;
            }
          case 43: break;
          case 13: 
            { return HeaderTypes.RBRACE;
            }
          case 44: break;
          case 14: 
            { return HeaderTypes.COMMA;
            }
          case 45: break;
          case 15: 
            { return HeaderTypes.COLON;
            }
          case 46: break;
          case 16: 
            { return HeaderTypes.SEMICOLON;
            }
          case 47: break;
          case 17: 
            { return HeaderTypes.INLINE_COMMENT;
            }
          case 48: break;
          case 18: 
            { return HeaderTypes.STRING_LITERAL;
            }
          case 49: break;
          case 19: 
            { return HeaderTypes.INCLUDE_VALUE_ANGBR;
            }
          case 50: break;
          case 20: 
            { return HeaderTypes.BRACKET_PAIR;
            }
          case 51: break;
          case 21: 
            { return HeaderTypes.HEX_LITERAL;
            }
          case 52: break;
          case 22: 
            { return HeaderTypes.BLOCK_COMMENT;
            }
          case 53: break;
          case 23: 
            { return HeaderTypes.CLASS;
            }
          case 54: break;
          case 24: 
            { return HeaderTypes.STRINGTABLE_ENTRY;
            }
          case 55: break;
          case 25: 
            { return HeaderTypes.PREPROCESS_EVAL;
            }
          case 56: break;
          case 26: 
            { return HeaderTypes.PREPROCESS_EXEC;
            }
          case 57: break;
          case 27: 
            { return HeaderTypes.PREPROCESS_INCLUDE;
            }
          case 58: break;
          case 28: 
            { return HeaderTypes.PREPROCESS_UNDEF;
            }
          case 59: break;
          case 29: 
            { return HeaderTypes.PREPROCESS_DEFINE;
            }
          case 60: break;
          case 30: 
            { return HeaderTypes.PREPROCESS_IF_DEF;
            }
          case 61: break;
          case 31: 
            { return HeaderTypes.PREPROCESS_IF_N_DEF;
            }
          case 62: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
