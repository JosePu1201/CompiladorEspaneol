/* The following code was generated by JFlex 1.7.0 */

package com.mycompany.compiladorlenguajeespaneol.Flex_Y_Cup;

import java_cup.runtime.*;
import java.util.*;
import java_cup.runtime.XMLElement;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Lexico.jflex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\45\1\46\1\0\1\45\1\47\22\0\1\45\1\0\1\31"+
    "\5\0\1\27\1\30\1\35\1\41\1\34\1\36\1\52\1\37\1\50"+
    "\11\51\1\32\1\33\1\43\1\44\1\42\2\0\1\56\1\54\1\25"+
    "\1\54\1\1\1\22\1\56\1\54\1\56\2\54\1\7\1\26\1\60"+
    "\1\57\2\54\1\57\1\21\1\17\1\56\3\54\1\57\1\54\3\0"+
    "\1\40\2\0\1\16\1\6\1\3\1\54\1\10\1\14\2\54\1\5"+
    "\2\54\1\15\1\24\1\11\1\13\1\23\1\54\1\4\1\2\1\12"+
    "\3\54\1\20\2\54\1\0\1\55\u05e3\0\12\53\206\0\12\53\306\0"+
    "\12\53\u019c\0\12\53\166\0\12\53\166\0\12\53\166\0\12\53\166\0"+
    "\12\53\166\0\12\53\166\0\12\53\166\0\12\53\166\0\12\53\166\0"+
    "\12\53\140\0\12\53\166\0\12\53\106\0\12\53\u0116\0\12\53\106\0"+
    "\12\53\u0746\0\12\53\46\0\12\53\u012c\0\12\53\200\0\12\53\246\0"+
    "\12\53\6\0\12\53\266\0\12\53\126\0\12\53\206\0\12\53\6\0"+
    "\12\53\u89c6\0\12\53\u02a6\0\12\53\46\0\12\53\306\0\12\53\26\0"+
    "\12\53\126\0\12\53\u0196\0\12\53\u5316\0\12\53\u0586\0\12\53\u0bbc\0"+
    "\12\53\200\0\12\53\74\0\12\53\220\0\12\53\u0116\0\12\53\u0156\0"+
    "\12\53\166\0\12\53\u0176\0\12\53\146\0\12\53\146\0\12\53\u01a6\0"+
    "\12\53\u0366\0\12\53\u4e06\0\12\53\346\0\12\53\u6c74\0\62\53\u1150\0"+
    "\12\53\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u16b5\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\6\3\1\4\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\2\23\2\24\1\4"+
    "\1\2\3\3\1\25\4\3\1\26\3\3\1\0\14\3"+
    "\1\27\2\3\1\30\1\3\1\31\5\3\1\32\1\3"+
    "\1\33\10\3\1\34\1\35\1\36\2\3\1\37\1\40"+
    "\6\3\1\41\1\42\3\3\1\43\1\3\1\44\1\45"+
    "\2\3\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[105];
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
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157"+
    "\0\u0188\0\u01b9\0\u01ea\0\u021b\0\223\0\61\0\61\0\61"+
    "\0\61\0\61\0\61\0\61\0\61\0\61\0\61\0\61"+
    "\0\61\0\61\0\61\0\61\0\u024c\0\u027d\0\u02ae\0\u02df"+
    "\0\223\0\u0310\0\u0341\0\u0372\0\223\0\u03a3\0\u03d4\0\u0405"+
    "\0\u0436\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c\0\u058d"+
    "\0\u05be\0\u05ef\0\u0620\0\u0651\0\u0682\0\u06b3\0\u06e4\0\u0715"+
    "\0\u0746\0\u0777\0\61\0\u07a8\0\u07d9\0\223\0\u080a\0\223"+
    "\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff\0\223\0\u0930\0\u0961"+
    "\0\u0992\0\u09c3\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\u0ab8\0\u0ae9"+
    "\0\223\0\223\0\223\0\u0b1a\0\u0b4b\0\223\0\223\0\u0b7c"+
    "\0\u0bad\0\u0bde\0\u0c0f\0\u0c40\0\u0c71\0\223\0\223\0\u0ca2"+
    "\0\u0cd3\0\u0d04\0\223\0\u0d35\0\223\0\223\0\u0d66\0\u0d97"+
    "\0\223";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[105];
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
    "\1\2\1\3\1\4\1\5\3\4\1\6\4\4\1\7"+
    "\2\4\1\10\1\4\1\11\1\12\1\13\1\14\1\4"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\34\1\36\1\37\2\2\1\4\1\2\1\40"+
    "\1\15\1\41\62\0\1\4\1\42\6\4\1\43\15\4"+
    "\21\0\2\4\2\0\5\4\1\0\26\4\21\0\2\4"+
    "\2\0\5\4\1\0\15\4\1\44\10\4\21\0\2\4"+
    "\2\0\5\4\1\0\6\4\1\45\1\46\16\4\21\0"+
    "\2\4\2\0\2\4\1\45\2\4\1\0\4\4\1\47"+
    "\7\4\1\50\11\4\21\0\2\4\2\0\5\4\1\0"+
    "\7\4\1\51\16\4\21\0\2\4\2\0\5\4\1\0"+
    "\4\4\1\52\21\4\21\0\2\4\2\0\5\4\1\0"+
    "\4\4\1\53\21\4\21\0\2\4\2\0\5\4\1\0"+
    "\15\4\1\54\10\4\21\0\2\4\2\0\5\4\1\0"+
    "\4\4\1\55\21\4\21\0\2\4\2\0\5\4\47\0"+
    "\1\34\63\0\1\56\56\0\2\37\1\56\7\0\6\4"+
    "\1\45\17\4\21\0\2\4\2\0\2\4\1\45\2\4"+
    "\1\0\2\4\1\57\23\4\21\0\2\4\2\0\5\4"+
    "\1\0\11\4\1\60\14\4\21\0\2\4\2\0\5\4"+
    "\1\0\1\4\1\61\21\4\1\62\2\4\21\0\2\4"+
    "\2\0\5\4\1\0\7\4\1\63\16\4\21\0\2\4"+
    "\2\0\5\4\1\0\10\4\1\64\15\4\21\0\2\4"+
    "\2\0\5\4\1\0\12\4\1\65\13\4\21\0\2\4"+
    "\2\0\5\4\1\0\17\4\1\66\6\4\21\0\2\4"+
    "\2\0\5\4\1\0\10\4\1\67\15\4\21\0\2\4"+
    "\2\0\5\4\1\0\10\4\1\70\15\4\21\0\2\4"+
    "\2\0\5\4\1\0\3\4\1\71\22\4\21\0\2\4"+
    "\2\0\5\4\1\0\7\4\1\72\16\4\21\0\2\4"+
    "\2\0\5\4\50\0\2\73\1\0\1\73\6\0\3\4"+
    "\1\74\22\4\21\0\2\4\2\0\5\4\1\0\7\4"+
    "\1\75\16\4\21\0\2\4\2\0\5\4\1\0\12\4"+
    "\1\76\13\4\21\0\2\4\2\0\5\4\1\0\5\4"+
    "\1\77\20\4\21\0\2\4\2\0\5\4\1\0\3\4"+
    "\1\100\22\4\21\0\2\4\2\0\5\4\1\0\22\4"+
    "\1\101\1\4\1\102\1\103\21\0\2\4\2\0\5\4"+
    "\1\0\11\4\1\104\14\4\21\0\2\4\2\0\5\4"+
    "\1\0\11\4\1\105\14\4\21\0\2\4\2\0\5\4"+
    "\1\0\12\4\1\106\13\4\21\0\2\4\2\0\5\4"+
    "\1\0\1\4\1\107\24\4\21\0\2\4\2\0\5\4"+
    "\1\0\15\4\1\110\10\4\21\0\2\4\2\0\5\4"+
    "\1\0\10\4\1\111\15\4\21\0\2\4\2\0\5\4"+
    "\1\0\4\4\1\112\21\4\21\0\2\4\2\0\5\4"+
    "\1\0\3\4\1\113\22\4\21\0\2\4\2\0\5\4"+
    "\1\0\4\4\1\114\21\4\21\0\2\4\2\0\5\4"+
    "\1\0\15\4\1\115\10\4\21\0\2\4\2\0\5\4"+
    "\1\0\15\4\1\116\10\4\21\0\2\4\2\0\5\4"+
    "\1\0\4\4\1\117\21\4\21\0\2\4\2\0\5\4"+
    "\1\0\15\4\1\120\10\4\21\0\2\4\2\0\5\4"+
    "\1\0\12\4\1\121\13\4\21\0\2\4\2\0\5\4"+
    "\1\0\4\4\1\122\21\4\21\0\2\4\2\0\5\4"+
    "\1\0\3\4\1\123\22\4\21\0\2\4\2\0\5\4"+
    "\1\0\11\4\1\124\14\4\21\0\2\4\2\0\5\4"+
    "\1\0\5\4\1\125\20\4\21\0\2\4\2\0\5\4"+
    "\1\0\12\4\1\126\13\4\21\0\2\4\2\0\5\4"+
    "\1\0\12\4\1\127\13\4\21\0\2\4\2\0\5\4"+
    "\1\0\3\4\1\130\22\4\21\0\2\4\2\0\5\4"+
    "\1\0\1\4\1\131\24\4\21\0\2\4\2\0\5\4"+
    "\1\0\7\4\1\132\16\4\21\0\2\4\2\0\5\4"+
    "\1\0\10\4\1\133\15\4\21\0\2\4\2\0\5\4"+
    "\1\0\3\4\1\134\22\4\21\0\2\4\2\0\5\4"+
    "\1\0\4\4\1\135\21\4\21\0\2\4\2\0\5\4"+
    "\1\0\15\4\1\136\10\4\21\0\2\4\2\0\5\4"+
    "\1\0\12\4\1\137\13\4\21\0\2\4\2\0\5\4"+
    "\1\0\10\4\1\140\15\4\21\0\2\4\2\0\5\4"+
    "\1\0\11\4\1\141\14\4\21\0\2\4\2\0\5\4"+
    "\1\0\15\4\1\142\10\4\21\0\2\4\2\0\5\4"+
    "\1\0\3\4\1\143\22\4\21\0\2\4\2\0\5\4"+
    "\1\0\11\4\1\144\14\4\21\0\2\4\2\0\5\4"+
    "\1\0\7\4\1\145\16\4\21\0\2\4\2\0\5\4"+
    "\1\0\1\4\1\146\24\4\21\0\2\4\2\0\5\4"+
    "\1\0\3\4\1\147\22\4\21\0\2\4\2\0\5\4"+
    "\1\0\15\4\1\150\10\4\21\0\2\4\2\0\5\4"+
    "\1\0\1\4\1\151\24\4\21\0\2\4\2\0\5\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3528];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\13\1\17\11\21\1\1\0\14\1\1\11"+
    "\56\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[105];
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
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 394) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
          yycolumn += zzCharCount;
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /*return new SYMBOL(sym.ERROR,yyline,yycolumn,yytext());*/
            } 
            // fall through
          case 39: break;
          case 2: 
            { System.out.println(yytext());return new Symbol(sym.MENORIGUAL,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 40: break;
          case 3: 
            { System.out.println(yytext());return new Symbol(sym.ID,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 41: break;
          case 4: 
            { System.out.println(yytext());return new Symbol(sym.MAYORIGUAL,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 42: break;
          case 5: 
            { System.out.println(yytext());return new Symbol(sym.PARENTESISABIERTO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 43: break;
          case 6: 
            { System.out.println(yytext());return new Symbol(sym.PARENTESISCERRADO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 44: break;
          case 7: 
            { System.out.println(yytext());return new Symbol(sym.COMILLAS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 45: break;
          case 8: 
            { System.out.println(yytext());return new Symbol(sym.DOSPUNTOS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 46: break;
          case 9: 
            { System.out.println(yytext());return new Symbol(sym.PUNTOYCOMA,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 47: break;
          case 10: 
            { System.out.println(yytext());return new Symbol(sym.COMA,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 48: break;
          case 11: 
            { System.out.println(yytext());return new Symbol(sym.MULTIPLICAR,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 49: break;
          case 12: 
            { System.out.println(yytext());return new Symbol(sym.MENOS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 50: break;
          case 13: 
            { System.out.println(yytext());return new Symbol(sym.DIAGONAL,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 51: break;
          case 14: 
            { System.out.println(yytext());return new Symbol(sym.POTENCIA,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 52: break;
          case 15: 
            { System.out.println(yytext());return new Symbol(sym.MAS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 53: break;
          case 16: 
            { System.out.println(yytext());return new Symbol(sym.MAYOR,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 54: break;
          case 17: 
            { System.out.println(yytext());return new Symbol(sym.MENOR,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 55: break;
          case 18: 
            { System.out.println(yytext());return new Symbol(sym.IGUAL,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 56: break;
          case 19: 
            { 
            } 
            // fall through
          case 57: break;
          case 20: 
            { System.out.println(yytext());return new Symbol(sym.NUMERO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 58: break;
          case 21: 
            { System.out.println(yytext());return new Symbol(sym.IGUALDOBLE,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 59: break;
          case 22: 
            { System.out.println(yytext());return new Symbol(sym.SI,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 60: break;
          case 23: 
            { System.out.println(yytext());return new Symbol(sym.DECIMAL,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 61: break;
          case 24: 
            { System.out.println(yytext());return new Symbol(sym.CASO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 62: break;
          case 25: 
            { System.out.println(yytext());return new Symbol(sym.LEER,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 63: break;
          case 26: 
            { System.out.println(yytext());return new Symbol(sym.SINO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 64: break;
          case 27: 
            { System.out.println(yytext());return new Symbol(sym.PARA,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 65: break;
          case 28: 
            { System.out.println(yytext());return new Symbol(sym.STRING,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 66: break;
          case 29: 
            { System.out.println(yytext());return new Symbol(sym.FINSI,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 67: break;
          case 30: 
            { System.out.println(yytext());return new Symbol(sym.PARAR,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 68: break;
          case 31: 
            { System.out.println(yytext());return new Symbol(sym.ENTERO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 69: break;
          case 32: 
            { System.out.println(yytext());return new Symbol(sym.CAMBIO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 70: break;
          case 33: 
            { System.out.println(yytext());return new Symbol(sym.FINPARA,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 71: break;
          case 34: 
            { System.out.println(yytext());return new Symbol(sym.FINCASO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 72: break;
          case 35: 
            { System.out.println(yytext());return new Symbol(sym.ESCRIBIR,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 73: break;
          case 36: 
            { System.out.println(yytext());return new Symbol(sym.FLOTANTE,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 74: break;
          case 37: 
            { System.out.println(yytext());return new Symbol(sym.MIENTRAS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 75: break;
          case 38: 
            { System.out.println(yytext());return new Symbol(sym.FINMIENTRAS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 76: break;
          default:
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
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
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
