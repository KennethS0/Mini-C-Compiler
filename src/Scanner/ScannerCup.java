/* The following code was generated by JFlex 1.4.3 on 18/05/21 23:29 */

package Scanner;

import java.util.*;
import Scanner.DataStructure.*;
import Scanner.Constants.*;

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 18/05/21 23:29 from the specification file
 * <tt>src/Scanner/RegexCup.flex</tt>
 */
public class ScannerCup implements java_cup.runtime.Scanner {

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
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 13, 14,  0,  0, 13,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    13, 51, 15,  0,  0, 47, 53, 24, 29, 29, 28, 46, 13, 10,  7, 27, 
     3,  4,  4,  4,  4,  4,  4,  4,  2,  2, 54, 45, 50, 48, 49, 25, 
     0,  6,  6,  6,  6,  9,  6, 11, 11, 11, 11, 11, 11, 11, 11, 11, 
    40, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 56, 23, 56, 55, 39, 
     0, 16, 17, 33,  1,  8, 18, 43, 26, 31, 11, 41, 42, 44, 19, 32, 
    38, 11, 20, 34, 21, 30, 22, 35,  5, 37, 36, 57, 52, 57, 58,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 
    12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 
    12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 
    12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\2\4\1\3\1\5\1\3\1\6"+
    "\1\1\1\7\1\10\6\3\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\5\3\1\2\2\3\1\17\1\20\1\21"+
    "\1\22\3\13\3\23\1\24\1\25\1\23\1\3\1\26"+
    "\2\0\1\27\1\0\3\3\1\30\1\22\1\31\1\32"+
    "\1\0\7\3\1\12\1\0\2\12\1\33\1\7\1\34"+
    "\1\3\1\35\10\3\1\0\1\3\1\36\2\3\1\37"+
    "\2\40\1\0\1\41\5\3\1\26\6\3\3\12\1\33"+
    "\2\0\2\3\1\42\11\3\1\0\3\3\1\43\1\3"+
    "\1\44\4\3\3\12\1\7\12\3\1\0\5\3\1\45"+
    "\5\3\1\0\3\3\1\46\1\0\2\3\1\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[169];
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
    "\0\0\0\73\0\166\0\261\0\354\0\u0127\0\73\0\u0162"+
    "\0\u019d\0\u01d8\0\u0213\0\u024e\0\u0289\0\u02c4\0\u02ff\0\u033a"+
    "\0\u0375\0\u03b0\0\73\0\u03eb\0\73\0\u0426\0\u0461\0\73"+
    "\0\u049c\0\u04d7\0\u0512\0\u054d\0\u0588\0\u05c3\0\u05fe\0\u0639"+
    "\0\73\0\u0674\0\73\0\u06af\0\u06ea\0\u0725\0\u06af\0\u0760"+
    "\0\u079b\0\u0461\0\73\0\73\0\73\0\u07d6\0\u0811\0\u084c"+
    "\0\u0887\0\u08c2\0\u08fd\0\u0938\0\u0973\0\u09ae\0\73\0\73"+
    "\0\73\0\u09e9\0\u09e9\0\u0a24\0\u0a5f\0\u0a9a\0\u0ad5\0\u0b10"+
    "\0\u0b4b\0\u0b86\0\u0bc1\0\u0bfc\0\u0c37\0\u0c72\0\73\0\u0cad"+
    "\0\u0ce8\0\u0d23\0\u0127\0\u0d5e\0\u0d99\0\u0dd4\0\u0e0f\0\u0e4a"+
    "\0\u0e85\0\u0ec0\0\u0efb\0\u0f36\0\u0f71\0\73\0\u0fac\0\u0fe7"+
    "\0\u1022\0\u105d\0\73\0\u1098\0\u10d3\0\u110e\0\u1149\0\u1184"+
    "\0\u11bf\0\u11fa\0\u0127\0\u1235\0\u1270\0\u12ab\0\u12e6\0\u1321"+
    "\0\u135c\0\u1397\0\u13d2\0\u140d\0\u0bfc\0\u1448\0\u1483\0\u14be"+
    "\0\u14f9\0\u0127\0\u1534\0\u156f\0\u15aa\0\u15e5\0\u1620\0\u165b"+
    "\0\u1696\0\u16d1\0\u170c\0\u1747\0\u1782\0\u17bd\0\u17f8\0\u1833"+
    "\0\u186e\0\u0127\0\u18a9\0\u18e4\0\u191f\0\u195a\0\73\0\u1995"+
    "\0\u19d0\0\73\0\u1a0b\0\u1a46\0\u1a81\0\u1abc\0\u1af7\0\u1b32"+
    "\0\u1b6d\0\u1ba8\0\u1be3\0\u1c1e\0\u1c59\0\u1c94\0\u1ccf\0\u1d0a"+
    "\0\u1d45\0\u1d80\0\u0127\0\u1dbb\0\u1df6\0\u1e31\0\u1e6c\0\u1ea7"+
    "\0\u1ee2\0\u1f1d\0\u1f58\0\u1f93\0\u0127\0\u1fce\0\u2009\0\u2044"+
    "\0\73";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[169];
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
    "\1\2\1\3\1\4\1\5\1\4\2\6\1\7\1\10"+
    "\1\6\1\11\1\6\1\12\2\13\1\14\1\15\1\16"+
    "\1\17\1\6\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\6\1\26\1\27\1\30\1\31\1\32\1\6\1\33"+
    "\1\34\1\35\3\6\1\36\2\6\1\37\1\40\1\6"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\25\1\52\1\53\1\54\1\55\74\0\1\6"+
    "\3\0\2\6\1\0\1\56\1\6\1\0\1\6\1\12"+
    "\3\0\7\6\3\0\1\6\3\0\2\6\1\57\6\6"+
    "\1\0\5\6\20\0\3\4\2\0\1\60\2\61\65\0"+
    "\1\62\1\63\1\0\1\60\2\61\62\0\1\6\3\0"+
    "\2\6\1\0\2\6\1\0\1\6\1\12\3\0\7\6"+
    "\3\0\1\6\3\0\11\6\1\0\5\6\17\0\1\6"+
    "\3\0\1\64\1\6\1\0\2\6\1\0\1\6\1\12"+
    "\3\0\3\6\1\65\3\6\3\0\1\6\3\0\11\6"+
    "\1\0\2\6\1\66\2\6\30\0\1\67\45\0\1\70"+
    "\1\71\12\0\1\12\3\0\2\12\1\0\2\12\1\0"+
    "\2\12\3\0\7\12\3\0\1\12\3\0\11\12\1\0"+
    "\5\12\33\0\2\13\54\0\16\14\1\0\1\72\15\14"+
    "\1\73\35\14\1\0\1\6\3\0\2\6\1\0\2\6"+
    "\1\0\1\6\1\12\3\0\7\6\3\0\1\6\3\0"+
    "\1\74\10\6\1\0\5\6\17\0\1\6\3\0\2\6"+
    "\1\0\2\6\1\0\1\6\1\12\3\0\4\6\1\75"+
    "\2\6\3\0\1\6\3\0\11\6\1\0\5\6\17\0"+
    "\1\6\3\0\2\6\1\0\2\6\1\0\1\6\1\12"+
    "\3\0\7\6\3\0\1\6\3\0\2\6\1\76\6\6"+
    "\1\0\2\6\1\77\2\6\17\0\1\6\3\0\2\6"+
    "\1\0\1\100\1\6\1\0\1\6\1\12\3\0\7\6"+
    "\3\0\1\6\3\0\11\6\1\0\5\6\17\0\1\6"+
    "\3\0\2\6\1\0\2\6\1\0\1\6\1\12\3\0"+
    "\7\6\3\0\1\6\3\0\7\6\1\101\1\6\1\0"+
    "\5\6\17\0\1\6\3\0\2\6\1\0\2\6\1\0"+
    "\1\6\1\12\3\0\7\6\3\0\1\6\3\0\2\6"+
    "\1\102\6\6\1\0\5\6\16\0\16\103\1\104\1\105"+
    "\7\103\1\106\1\107\4\103\1\104\35\103\33\0\1\110"+
    "\1\111\23\0\1\70\72\0\1\70\13\0\1\6\3\0"+
    "\2\6\1\0\2\6\1\0\1\6\1\12\3\0\3\6"+
    "\1\112\3\6\3\0\1\6\3\0\11\6\1\0\5\6"+
    "\17\0\1\6\3\0\2\6\1\0\2\6\1\0\1\6"+
    "\1\12\3\0\2\6\1\113\1\114\3\6\3\0\1\6"+
    "\3\0\11\6\1\0\5\6\17\0\1\6\3\0\2\6"+
    "\1\0\2\6\1\0\1\6\1\12\3\0\1\66\6\6"+
    "\3\0\1\115\3\0\2\6\1\116\6\6\1\0\5\6"+
    "\17\0\1\6\3\0\2\6\1\0\2\6\1\0\1\6"+
    "\1\12\3\0\5\6\1\117\1\6\3\0\1\120\3\0"+
    "\1\6\1\121\3\6\1\122\3\6\1\0\5\6\17\0"+
    "\1\6\3\0\2\6\1\0\2\6\1\0\1\6\1\12"+
    "\3\0\7\6\3\0\1\123\3\0\11\6\1\0\5\6"+
    "\66\0\1\124\23\0\1\6\3\0\2\6\1\0\2\6"+
    "\1\0\1\6\1\12\3\0\7\6\3\0\1\6\3\0"+
    "\2\6\1\125\6\6\1\0\5\6\17\0\1\6\3\0"+
    "\2\6\1\0\2\6\1\0\1\6\1\12\3\0\7\6"+
    "\3\0\1\6\3\0\2\6\1\74\6\6\1\0\5\6"+
    "\74\0\1\126\1\0\1\70\72\0\1\25\72\0\1\25"+
    "\1\52\71\0\1\25\1\0\1\52\70\0\1\70\3\0"+
    "\1\25\66\0\1\70\4\0\1\25\6\0\1\6\3\0"+
    "\2\6\1\0\2\6\1\0\1\6\1\12\3\0\2\6"+
    "\1\127\4\6\3\0\1\6\3\0\11\6\1\0\5\6"+
    "\17\0\1\6\3\0\2\6\1\0\2\6\1\0\1\6"+
    "\1\12\3\0\7\6\3\0\1\6\3\0\1\130\10\6"+
    "\1\0\5\6\20\0\3\131\70\0\1\132\1\133\1\132"+
    "\5\0\1\134\63\0\2\62\70\0\1\135\1\0\1\135"+
    "\1\0\1\135\2\0\1\135\62\0\1\6\3\0\2\6"+
    "\1\0\2\6\1\0\1\6\1\12\3\0\5\6\1\136"+
    "\1\6\3\0\1\6\3\0\11\6\1\0\5\6\17\0"+
    "\1\6\3\0\2\6\1\0\2\6\1\0\1\6\1\12"+
    "\3\0\7\6\3\0\1\6\3\0\1\137\10\6\1\0"+
    "\5\6\17\0\1\6\3\0\2\6\1\0\2\6\1\0"+
    "\1\6\1\12\3\0\7\6\3\0\1\6\3\0\4\6"+
    "\1\140\4\6\1\0\5\6\16\0\16\73\1\0\1\72"+
    "\53\73\1\0\1\6\3\0\2\6\1\0\2\6\1\0"+
    "\1\6\1\12\3\0\5\6\1\141\1\6\3\0\1\6"+
    "\3\0\11\6\1\0\5\6\17\0\1\6\3\0\2\6"+
    "\1\0\1\142\1\6\1\0\1\6\1\12\3\0\7\6"+
    "\3\0\1\6\3\0\11\6\1\0\5\6\17\0\1\6"+
    "\3\0\2\6\1\0\2\6\1\0\1\6\1\12\3\0"+
    "\4\6\1\143\2\6\3\0\1\6\3\0\11\6\1\0"+
    "\5\6\17\0\1\6\3\0\2\6\1\0\2\6\1\0"+
    "\1\6\1\12\3\0\7\6\3\0\1\6\3\0\2\6"+
    "\1\144\6\6\1\0\5\6\17\0\1\6\3\0\2\6"+
    "\1\0\2\6\1\0\1\6\1\12\3\0\5\6\1\145"+
    "\1\6\3\0\1\6\3\0\11\6\1\0\3\6\1\146"+
    "\1\6\17\0\1\6\3\0\2\6\1\0\2\6\1\0"+
    "\1\6\1\12\3\0\7\6\3\0\1\6\3\0\10\6"+
    "\1\147\1\0\5\6\17\0\1\6\3\0\2\6\1\0"+
    "\2\6\1\0\1\6\1\12\3\0\7\6\3\0\1\6"+
    "\3\0\1\6\1\150\7\6\1\0\2\6\1\151\2\6"+
    "\16\0\16\152\1\0\11\152\1\107\4\152\1\0\35\152"+
    "\30\0\1\107\42\0\16\152\1\0\11\152\1\0\4\152"+
    "\1\0\40\152\1\103\1\152\1\153\10\152\1\0\4\103"+
    "\1\154\4\103\1\155\1\103\3\152\1\0\35\152\16\110"+
    "\1\0\54\110\33\111\1\156\1\157\1\156\35\111\1\0"+
    "\1\6\3\0\2\6\1\0\2\6\1\0\1\6\1\12"+
    "\3\0\7\6\3\0\1\6\3\0\1\6\1\160\2\6"+
    "\1\161\4\6\1\0\5\6\17\0\1\6\3\0\2\6"+
    "\1\0\2\6\1\0\1\6\1\12\3\0\5\6\1\162"+
    "\1\6\3\0\1\6\3\0\11\6\1\0\5\6\17\0"+
    "\1\6\3\0\2\6\1\0\2\6\1\0\1\6\1\12"+
    "\3\0\1\163\6\6\3\0\1\6\3\0\11\6\1\0"+
    "\5\6\17\0\1\6\3\0\2\6\1\0\2\6\1\0"+
    "\1\6\1\12\3\0\3\6\1\164\3\6\3\0\1\6"+
    "\3\0\11\6\1\0\5\6\17\0\1\6\3\0\2\6"+
    "\1\0\2\6\1\0\1\6\1\12\3\0\1\165\3\6"+
    "\1\166\2\6\3\0\1\6\3\0\11\6\1\0\5\6"+
    "\17\0\1\6\3\0\2\6\1\0\2\6\1\0\1\6"+
    "\1\12\3\0\7\6\3\0\1\6\3\0\2\6\1\167"+
    "\6\6\1\0\5\6\17\0\1\6\3\0\2\6\1\0"+
    "\2\6\1\0\1\6\1\12\3\0\7\6\3\0\1\6"+
    "\3\0\6\6\1\170\2\6\1\0\3\6\1\171\1\6"+
    "\17\0\1\6\3\0\2\6\1\0\2\6\1\0\1\6"+
    "\1\12\3\0\7\6\3\0\1\6\3\0\1\6\1\172"+
    "\7\6\1\0\5\6\17\0\1\6\3\0\2\6\1\0"+
    "\2\6\1\0\1\6\1\12\3\0\7\6\3\0\1\6"+
    "\3\0\1\6\1\173\7\6\1\0\5\6\36\0\1\174"+
    "\53\0\1\6\3\0\2\6\1\0\2\6\1\0\1\6"+
    "\1\12\3\0\3\6\1\175\3\6\3\0\1\6\3\0"+
    "\11\6\1\0\5\6\17\0\1\6\3\0\2\6\1\0"+
    "\2\6\1\0\1\6\1\12\3\0\1\176\6\6\3\0"+
    "\1\6\3\0\11\6\1\0\5\6\17\0\1\6\3\0"+
    "\2\6\1\0\2\6\1\0\1\6\1\12\3\0\1\6"+
    "\1\177\5\6\3\0\1\6\3\0\11\6\1\0\5\6"+
    "\20\0\3\131\2\0\1\200\2\61\63\0\3\132\70\0"+
    "\1\132\1\133\1\132\70\0\3\135\1\0\1\135\2\0"+
    "\1\135\62\0\1\6\3\0\2\6\1\0\1\201\1\6"+
    "\1\0\1\6\1\12\3\0\7\6\3\0\1\6\3\0"+
    "\11\6\1\0\5\6\17\0\1\6\3\0\2\6\1\0"+
    "\2\6\1\0\1\6\1\12\3\0\7\6\3\0\1\6"+
    "\3\0\11\6\1\0\4\6\1\202\17\0\1\6\3\0"+
    "\2\6\1\0\1\113\1\6\1\0\1\6\1\12\3\0"+
    "\7\6\3\0\1\6\3\0\11\6\1\0\5\6\17\0"+
    "\1\6\3\0\2\6\1\0\2\6\1\0\1\6\1\12"+
    "\3\0\7\6\3\0\1\6\3\0\2\6\1\113\6\6"+
    "\1\0\5\6\17\0\1\6\3\0\2\6\1\0\2\6"+
    "\1\0\1\6\1\12\3\0\1\203\6\6\3\0\1\6"+
    "\3\0\11\6\1\0\5\6\17\0\1\6\3\0\2\6"+
    "\1\0\2\6\1\0\1\6\1\12\3\0\1\114\6\6"+
    "\3\0\1\6\3\0\11\6\1\0\5\6\17\0\1\6"+
    "\3\0\2\6\1\0\2\6\1\0\1\6\1\12\3\0"+
    "\7\6\3\0\1\6\3\0\1\201\10\6\1\0\5\6"+
    "\17\0\1\6\3\0\2\6\1\0\2\6\1\0\1\6"+
    "\1\12\3\0\7\6\3\0\1\6\3\0\1\6\1\204"+
    "\7\6\1\0\5\6\17\0\1\6\3\0\2\6\1\0"+
    "\1\205\1\6\1\0\1\6\1\12\3\0\7\6\3\0"+
    "\1\6\3\0\11\6\1\0\5\6\17\0\1\162\3\0"+
    "\2\6\1\0\2\6\1\0\1\6\1\12\3\0\7\6"+
    "\3\0\1\6\3\0\11\6\1\0\5\6\17\0\1\6"+
    "\3\0\2\6\1\0\2\6\1\0\1\6\1\12\3\0"+
    "\1\206\6\6\3\0\1\6\3\0\11\6\1\0\5\6"+
    "\16\0\16\152\1\0\11\152\1\207\4\152\1\0\53\152"+
    "\1\0\11\152\1\207\1\152\1\210\2\152\1\0\53\152"+
    "\1\0\4\152\1\211\4\152\1\107\4\152\1\0\35\152"+
    "\34\156\1\157\71\156\1\212\1\157\36\156\1\0\1\6"+
    "\3\0\2\6\1\0\2\6\1\0\1\6\1\12\3\0"+
    "\7\6\3\0\1\6\3\0\2\6\1\213\6\6\1\0"+
    "\5\6\17\0\1\6\3\0\2\6\1\0\2\6\1\0"+
    "\1\6\1\12\3\0\7\6\3\0\1\6\3\0\1\6"+
    "\1\214\7\6\1\0\5\6\17\0\1\6\3\0\2\6"+
    "\1\0\2\6\1\0\1\6\1\12\3\0\4\6\1\162"+
    "\2\6\3\0\1\6\3\0\11\6\1\0\5\6\17\0"+
    "\1\6\3\0\2\6\1\0\2\6\1\0\1\6\1\12"+
    "\3\0\5\6\1\215\1\6\3\0\1\6\3\0\4\6"+
    "\1\216\4\6\1\0\5\6\17\0\1\6\3\0\2\6"+
    "\1\0\2\6\1\0\1\6\1\12\3\0\5\6\1\217"+
    "\1\6\3\0\1\6\3\0\11\6\1\0\5\6\17\0"+
    "\1\6\3\0\2\6\1\0\2\6\1\0\1\6\1\12"+
    "\3\0\7\6\3\0\1\6\3\0\1\220\10\6\1\0"+
    "\5\6\17\0\1\6\3\0\2\6\1\0\2\6\1\0"+
    "\1\6\1\12\3\0\4\6\1\114\2\6\3\0\1\6"+
    "\3\0\11\6\1\0\5\6\17\0\1\6\3\0\2\6"+
    "\1\0\1\221\1\6\1\0\1\6\1\12\3\0\7\6"+
    "\3\0\1\6\3\0\11\6\1\0\5\6\17\0\1\6"+
    "\3\0\2\6\1\0\2\6\1\0\1\6\1\12\3\0"+
    "\3\6\1\222\3\6\3\0\1\6\3\0\11\6\1\0"+
    "\5\6\17\0\1\6\3\0\2\6\1\0\2\6\1\0"+
    "\1\6\1\12\3\0\5\6\1\223\1\6\3\0\1\6"+
    "\3\0\11\6\1\0\5\6\17\0\1\6\3\0\2\6"+
    "\1\0\2\6\1\0\1\6\1\12\3\0\7\6\3\0"+
    "\1\6\3\0\11\6\1\0\2\6\1\224\2\6\57\0"+
    "\1\225\32\0\1\6\3\0\2\6\1\0\2\6\1\0"+
    "\1\6\1\12\3\0\7\6\3\0\1\6\3\0\11\6"+
    "\1\0\3\6\1\162\1\6\17\0\1\6\3\0\2\6"+
    "\1\0\2\6\1\0\1\6\1\12\3\0\7\6\3\0"+
    "\1\6\3\0\1\226\10\6\1\0\5\6\17\0\1\6"+
    "\3\0\2\6\1\0\2\6\1\0\1\6\1\12\3\0"+
    "\7\6\3\0\1\6\3\0\11\6\1\0\2\6\1\227"+
    "\2\6\17\0\1\200\5\0\1\200\64\0\1\6\3\0"+
    "\2\6\1\0\2\6\1\0\1\6\1\12\3\0\4\6"+
    "\1\213\2\6\3\0\1\6\3\0\11\6\1\0\5\6"+
    "\17\0\1\6\3\0\2\6\1\0\2\6\1\0\1\6"+
    "\1\12\3\0\7\6\3\0\1\6\3\0\11\6\1\0"+
    "\1\6\1\143\3\6\17\0\1\6\3\0\2\6\1\0"+
    "\2\6\1\0\1\6\1\12\3\0\7\6\3\0\1\6"+
    "\3\0\4\6\1\230\4\6\1\0\5\6\17\0\1\231"+
    "\3\0\2\6\1\0\2\6\1\0\1\6\1\12\3\0"+
    "\7\6\3\0\1\6\3\0\11\6\1\0\5\6\17\0"+
    "\1\6\3\0\2\6\1\0\2\6\1\0\1\6\1\12"+
    "\3\0\5\6\1\232\1\6\3\0\1\6\3\0\11\6"+
    "\1\0\5\6\16\0\16\152\1\0\11\152\1\207\1\152"+
    "\1\103\2\152\1\0\53\152\1\0\4\152\1\103\4\152"+
    "\1\207\4\152\1\0\35\152\1\0\1\6\3\0\2\6"+
    "\1\0\2\6\1\0\1\6\1\12\3\0\3\6\1\233"+
    "\3\6\3\0\1\6\3\0\11\6\1\0\5\6\17\0"+
    "\1\6\3\0\2\6\1\0\2\6\1\0\1\6\1\12"+
    "\3\0\7\6\3\0\1\6\3\0\11\6\1\0\3\6"+
    "\1\171\1\6\17\0\1\6\3\0\2\6\1\0\2\6"+
    "\1\0\1\6\1\12\3\0\7\6\3\0\1\6\3\0"+
    "\1\6\1\234\7\6\1\0\5\6\17\0\1\6\3\0"+
    "\2\6\1\0\2\6\1\0\1\6\1\12\3\0\5\6"+
    "\1\233\1\6\3\0\1\6\3\0\11\6\1\0\5\6"+
    "\17\0\1\6\3\0\2\6\1\0\2\6\1\0\1\6"+
    "\1\12\3\0\7\6\3\0\1\6\3\0\1\6\1\235"+
    "\7\6\1\0\5\6\17\0\1\6\3\0\2\6\1\0"+
    "\2\6\1\0\1\6\1\12\3\0\7\6\3\0\1\6"+
    "\3\0\3\6\1\216\5\6\1\0\5\6\17\0\1\6"+
    "\3\0\2\6\1\0\2\6\1\0\1\6\1\12\3\0"+
    "\7\6\3\0\1\6\3\0\2\6\1\236\6\6\1\0"+
    "\5\6\17\0\1\6\3\0\2\6\1\0\1\237\1\6"+
    "\1\0\1\6\1\12\3\0\7\6\3\0\1\6\3\0"+
    "\11\6\1\0\5\6\17\0\1\6\3\0\2\6\1\0"+
    "\2\6\1\0\1\6\1\12\3\0\7\6\3\0\1\6"+
    "\3\0\3\6\1\240\5\6\1\0\5\6\17\0\1\6"+
    "\3\0\2\6\1\0\1\143\1\6\1\0\1\6\1\12"+
    "\3\0\7\6\3\0\1\6\3\0\11\6\1\0\5\6"+
    "\67\0\1\241\22\0\1\6\3\0\2\6\1\0\2\6"+
    "\1\0\1\6\1\12\3\0\7\6\3\0\1\6\3\0"+
    "\11\6\1\0\2\6\1\216\2\6\17\0\1\6\3\0"+
    "\2\6\1\0\1\162\1\6\1\0\1\6\1\12\3\0"+
    "\7\6\3\0\1\6\3\0\11\6\1\0\5\6\17\0"+
    "\1\6\3\0\2\6\1\0\2\6\1\0\1\6\1\12"+
    "\3\0\5\6\1\242\1\6\3\0\1\6\3\0\11\6"+
    "\1\0\5\6\17\0\1\6\3\0\2\6\1\0\1\236"+
    "\1\6\1\0\1\6\1\12\3\0\7\6\3\0\1\6"+
    "\3\0\11\6\1\0\5\6\17\0\1\6\3\0\2\6"+
    "\1\0\2\6\1\0\1\6\1\12\3\0\7\6\3\0"+
    "\1\6\3\0\1\6\1\243\7\6\1\0\5\6\17\0"+
    "\1\6\3\0\2\6\1\0\2\6\1\0\1\6\1\12"+
    "\3\0\3\6\1\244\3\6\3\0\1\6\3\0\11\6"+
    "\1\0\5\6\17\0\1\6\3\0\2\6\1\0\2\6"+
    "\1\0\1\6\1\12\3\0\7\6\3\0\1\6\3\0"+
    "\3\6\1\245\5\6\1\0\5\6\17\0\1\6\3\0"+
    "\2\6\1\0\2\6\1\0\1\6\1\12\3\0\2\6"+
    "\1\233\4\6\3\0\1\6\3\0\11\6\1\0\5\6"+
    "\17\0\1\245\3\0\2\6\1\0\2\6\1\0\1\6"+
    "\1\12\3\0\7\6\3\0\1\6\3\0\11\6\1\0"+
    "\5\6\17\0\1\6\3\0\2\6\1\0\2\6\1\0"+
    "\1\6\1\12\3\0\7\6\3\0\1\233\3\0\11\6"+
    "\1\0\5\6\26\0\1\246\63\0\1\6\3\0\2\6"+
    "\1\0\1\247\1\6\1\0\1\6\1\12\3\0\7\6"+
    "\3\0\1\6\3\0\11\6\1\0\5\6\17\0\1\6"+
    "\3\0\2\6\1\0\2\6\1\0\1\6\1\12\3\0"+
    "\7\6\3\0\1\6\3\0\11\6\1\0\2\6\1\250"+
    "\2\6\17\0\1\6\3\0\2\6\1\0\2\6\1\0"+
    "\1\6\1\12\3\0\7\6\3\0\1\6\3\0\1\224"+
    "\10\6\1\0\5\6\17\0\1\251\72\0\1\6\3\0"+
    "\2\6\1\0\2\6\1\0\1\6\1\12\3\0\4\6"+
    "\1\233\2\6\3\0\1\6\3\0\11\6\1\0\5\6"+
    "\17\0\1\6\3\0\2\6\1\0\1\245\1\6\1\0"+
    "\1\6\1\12\3\0\7\6\3\0\1\6\3\0\11\6"+
    "\1\0\5\6\16\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8319];
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
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\4\1\1\11\13\1\1\11\1\1\1\11"+
    "\2\1\1\11\10\1\1\11\1\1\1\11\7\1\3\11"+
    "\2\1\2\0\1\1\1\0\3\1\3\11\1\1\1\0"+
    "\10\1\1\0\2\1\1\11\14\1\1\0\1\1\1\11"+
    "\4\1\1\11\1\0\21\1\2\0\14\1\1\0\12\1"+
    "\1\11\2\1\1\11\12\1\1\0\13\1\1\0\4\1"+
    "\1\0\2\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[169];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Structure data = new Structure();
    private Structure errors = new Structure();

    public Structure getData() {
        return this.data;
    }

    public Structure getErrors() {
        return this.errors;
    }

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public ScannerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public ScannerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 19: 
          { data.addData(yytext(), Types.OPERATOR_BINARY, yyline);
          return new Symbol(sym.OPERATOR_BINARY, yychar, yyline, yytext());
          }
        case 39: break;
        case 17: 
          { data.addData(yytext(), Types.OPERATOR_REMAINDER, yyline);
        return new Symbol(sym.OPERATOR_REMAINDER, yychar, yyline, yytext());
          }
        case 40: break;
        case 30: 
          { data.addData(yytext(), Types.OPERATOR_INC, yyline);
        return new Symbol(sym.OPERATOR_INC, yychar, yyline, yytext());
          }
        case 41: break;
        case 23: 
          { data.addData(yytext(), Types.LITERAL_OCTAL, yyline);
        return new Symbol(sym.LITERAL_OCTAL, yychar, yyline, yytext());
          }
        case 42: break;
        case 16: 
          { data.addData(yytext(), Types.OPERATOR_ADD, yyline);
         return new Symbol(sym.OPERATOR_ADD, yychar, yyline, yytext());
          }
        case 43: break;
        case 12: 
          { data.addData(yytext(), Types.OPERATOR_DIVIDE, yyline);
        return new Symbol(sym.OPERATOR_DIVIDE, yychar, yyline, yytext());
          }
        case 44: break;
        case 35: 
          { errors.addData(yytext(), Types.FLOAT_MANY_DOTS_ERROR, yyline);
      return new Symbol(sym.FLOAT_MANY_DOTS_ERROR, yychar, yyline, yytext());
          }
        case 45: break;
        case 32: 
          { data.addData(yytext(), Types.LITERAL_EXPONENTIAL_FLOAT, yyline);
        return new Symbol(sym.LITERAL_EXPONENTIAL_FLOAT, yychar, yyline, yytext());
          }
        case 46: break;
        case 11: 
          { data.addData(yytext(), Types.OPERATOR_BOOLEAN, yyline);
        return new Symbol(sym.OPERATOR_BOOLEAN, yychar, yyline, yytext());
          }
        case 47: break;
        case 37: 
          { data.addData(yytext(), Types.RESERVED_WORDS, yyline);
                return new Symbol(sym.RESERVED_WORDS, yychar, yyline, yytext());
          }
        case 48: break;
        case 25: 
          { data.addData(yytext(), Types.OPERATOR_MEMORY, yyline);
        return new Symbol(sym.OPERATOR_MEMORY, yychar, yyline, yytext());
          }
        case 49: break;
        case 31: 
          { data.addData(yytext(), Types.LITERAL_FLOAT, yyline);
        return new Symbol(sym.LITERAL_FLOAT, yychar, yyline, yytext());
          }
        case 50: break;
        case 26: 
          { data.addData(yytext(), Types.LITERAL_STRING, yyline);
        return new Symbol(sym.LITERAL_STRING, yychar, yyline, yytext());
          }
        case 51: break;
        case 29: 
          { data.addData(yytext(), Types.RESERVED_CONDITION, yyline);
            return new Symbol(sym.RESERVED_CONDITION, yychar, yyline, yytext());
          }
        case 52: break;
        case 9: 
          { data.addData(yytext(), Types.OPERATOR_CONTINUE_LINE, yyline);
        return new Symbol(sym.OPERATOR_CONTINUE_LINE, yychar, yyline, yytext());
          }
        case 53: break;
        case 13: 
          { data.addData(yytext(), Types.OPERATOR_MULTIPLY, yyline);
        return new Symbol(sym.OPERATOR_MULTIPLY, yychar, yyline, yytext());
          }
        case 54: break;
        case 28: 
          { errors.addData(yytext(), Types.COMMENTS_ERROR, yyline);
        return new Symbol(sym.COMMENTS_ERROR, yychar, yyline, yytext());
          }
        case 55: break;
        case 10: 
          { errors.addData(yytext(), Types.CHARACTER_ERROR, yyline);
        return new Symbol(sym.CHARACTER_ERROR, yychar, yyline, yytext());
          }
        case 56: break;
        case 24: 
          { data.addData(yytext(), Types.OPERATOR_DEC, yyline);
        return new Symbol(sym.OPERATOR_DEC, yychar, yyline, yytext());
          }
        case 57: break;
        case 36: 
          { data.addData(yytext(), Types.RESERVED_ENUM, yyline);
             return new Symbol(sym.RESERVED_ENUM , yychar, yyline, yytext());
          }
        case 58: break;
        case 5: 
          { data.addData(yytext(), Types.OPERATOR_DOT, yyline);
        return new Symbol(sym.OPERATOR_DOT, yychar, yyline, yytext());
          }
        case 59: break;
        case 7: 
          { /* DO NOTHING */
          }
        case 60: break;
        case 22: 
          { data.addData(yytext(), Types.RESERVED_LOOP, yyline);
      return new Symbol(sym.RESERVED_LOOP, yychar, yyline, yytext());
          }
        case 61: break;
        case 18: 
          { data.addData(yytext(), Types.OPERATOR_ASSIGNMENT, yyline);
        return new Symbol(sym.OPERATOR_ASSIGNMENT, yychar, yyline, yytext());
          }
        case 62: break;
        case 4: 
          { data.addData(yytext(), Types.LITERAL_DECIMAL, yyline);
        return new Symbol(sym.LITERAL_DECIMAL, yychar, yyline, yytext());
          }
        case 63: break;
        case 14: 
          { data.addData(yytext(), Types.OPERATOR_PARENTHESIS, yyline);
        return new Symbol(sym.OPERATOR_PARENTHESIS, yychar, yyline, yytext());
          }
        case 64: break;
        case 6: 
          { data.addData(yytext(), Types.OPERATOR_NEGATIVE, yyline);
        return new Symbol(sym.OPERATOR_NEGATIVE, yychar, yyline, yytext());
          }
        case 65: break;
        case 33: 
          { data.addData(yytext(), Types.LITERAL_HEXA, yyline);
        return new Symbol(sym.LITERAL_HEXA, yychar, yyline, yytext());
          }
        case 66: break;
        case 8: 
          { errors.addData(yytext(), Types.STRING_ERROR, yyline);
        return new Symbol(sym.STRING_ERROR, yychar, yyline, yytext());
          }
        case 67: break;
        case 38: 
          { data.addData(yytext(), Types.RESERVED_MODIFIER, yyline);
        return new Symbol(sym.RESERVED_MODIFIER, yychar, yyline, yytext());
          }
        case 68: break;
        case 34: 
          { data.addData(yytext(), Types.RESERVED_DATA_TYPE, yyline);
            return new Symbol(sym.RESERVED_DATA_TYPE, yychar, yyline, yytext());
          }
        case 69: break;
        case 27: 
          { data.addData(yytext(), Types.LITERAL_CHARACTER, yyline);
        return new Symbol(sym.LITERAL_CHARACTER, yychar, yyline, yytext());
          }
        case 70: break;
        case 3: 
          { data.addData(yytext(), Types.IDENTIFIER, yyline);
        return new Symbol(sym.IDENTIFIER, yychar, yyline, yytext());
          }
        case 71: break;
        case 15: 
          { data.addData(yytext(), Types.OPERATOR_END_LINE, yyline);
        return new Symbol(sym.OPERATOR_END_LINE, yychar, yyline, yytext());
          }
        case 72: break;
        case 21: 
          { data.addData(yytext(), Types.OPERATOR_BRACKET, yyline);
        return new Symbol(sym.OPERATOR_BRACKET, yychar, yyline, yytext());
          }
        case 73: break;
        case 2: 
          { errors.addData(yytext(), Types.UNKNOWN_ERROR, yyline);
        return new Symbol(sym.UNKNOWN_ERROR, yychar, yyline, yytext());
          }
        case 74: break;
        case 20: 
          { data.addData(yytext(), Types.OPERATOR_SQ_BRACKET, yyline);
        return new Symbol(sym.OPERATOR_SQ_BRACKET, yychar, yyline, yytext());
          }
        case 75: break;
        case 1: 
          { errors.addData(yytext(), Types.IDENTIFIER_ERROR, yyline);
        return new Symbol(sym.IDENTIFIER_ERROR, yychar, yyline, yytext());
          }
        case 76: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java ScannerCup <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        ScannerCup scanner = null;
        try {
          scanner = new ScannerCup( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
