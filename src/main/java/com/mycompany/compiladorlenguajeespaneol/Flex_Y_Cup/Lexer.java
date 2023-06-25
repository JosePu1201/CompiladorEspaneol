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
    "\11\0\1\55\1\56\1\0\1\55\1\57\22\0\1\55\1\0\1\41"+
    "\5\0\1\35\1\36\1\45\1\51\1\44\1\46\1\62\1\47\1\60"+
    "\11\61\1\42\1\43\1\53\1\54\1\52\2\0\1\34\1\64\1\25"+
    "\1\64\1\1\1\22\1\66\1\64\1\66\2\64\1\7\1\26\1\33"+
    "\1\32\1\30\1\64\1\31\1\21\1\17\1\66\3\64\1\67\1\64"+
    "\3\0\1\50\2\0\1\16\1\6\1\3\1\64\1\10\1\14\2\64"+
    "\1\5\2\64\1\15\1\24\1\11\1\13\1\23\1\64\1\4\1\2"+
    "\1\12\1\27\2\64\1\20\2\64\1\37\1\65\1\40\u05e2\0\12\63"+
    "\206\0\12\63\306\0\12\63\u019c\0\12\63\166\0\12\63\166\0\12\63"+
    "\166\0\12\63\166\0\12\63\166\0\12\63\166\0\12\63\166\0\12\63"+
    "\166\0\12\63\166\0\12\63\140\0\12\63\166\0\12\63\106\0\12\63"+
    "\u0116\0\12\63\106\0\12\63\u0746\0\12\63\46\0\12\63\u012c\0\12\63"+
    "\200\0\12\63\246\0\12\63\6\0\12\63\266\0\12\63\126\0\12\63"+
    "\206\0\12\63\6\0\12\63\u89c6\0\12\63\u02a6\0\12\63\46\0\12\63"+
    "\306\0\12\63\26\0\12\63\126\0\12\63\u0196\0\12\63\u5316\0\12\63"+
    "\u0586\0\12\63\u0bbc\0\12\63\200\0\12\63\74\0\12\63\220\0\12\63"+
    "\u0116\0\12\63\u0156\0\12\63\166\0\12\63\u0176\0\12\63\146\0\12\63"+
    "\146\0\12\63\u01a6\0\12\63\u0366\0\12\63\u4e06\0\12\63\346\0\12\63"+
    "\u6c74\0\62\63\u1150\0\12\63\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u16b5\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\6\3\1\4\1\3"+
    "\1\4\1\2\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\2\25\2\26\3\3\1\27\4\3"+
    "\1\30\7\3\1\0\12\3\1\31\5\3\1\32\2\3"+
    "\1\33\1\3\1\34\5\3\1\35\1\3\1\36\1\3"+
    "\1\37\1\40\10\3\1\41\1\42\1\43\3\3\1\44"+
    "\1\45\7\3\1\46\1\47\4\3\1\50\1\3\1\51"+
    "\1\52\1\53\2\3\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[124];
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
    "\0\0\0\70\0\160\0\250\0\340\0\u0118\0\u0150\0\u0188"+
    "\0\u01c0\0\u01f8\0\u0230\0\u0268\0\250\0\u02a0\0\u02d8\0\250"+
    "\0\u0310\0\70\0\70\0\70\0\70\0\70\0\70\0\70"+
    "\0\70\0\70\0\70\0\70\0\70\0\70\0\70\0\70"+
    "\0\70\0\70\0\u0348\0\u0380\0\u03b8\0\u03f0\0\u0428\0\u0460"+
    "\0\250\0\u0498\0\u04d0\0\u0508\0\u0540\0\u0578\0\u05b0\0\u05e8"+
    "\0\u0620\0\u0658\0\u0690\0\u06c8\0\u0700\0\u0738\0\u0770\0\u07a8"+
    "\0\u07e0\0\u0818\0\u0850\0\u0888\0\u08c0\0\u08f8\0\u0930\0\u0968"+
    "\0\250\0\u09a0\0\u09d8\0\u0a10\0\u0a48\0\u0a80\0\70\0\u0ab8"+
    "\0\u0af0\0\250\0\u0b28\0\250\0\u0b60\0\u0b98\0\u0bd0\0\u0c08"+
    "\0\u0c40\0\250\0\u0c78\0\u0cb0\0\u0ce8\0\250\0\250\0\u0d20"+
    "\0\u0d58\0\u0d90\0\u0dc8\0\u0e00\0\u0e38\0\u0e70\0\u0ea8\0\250"+
    "\0\250\0\250\0\u0ee0\0\u0f18\0\u0f50\0\250\0\250\0\u0f88"+
    "\0\u0fc0\0\u0ff8\0\u1030\0\u1068\0\u10a0\0\u10d8\0\250\0\250"+
    "\0\u1110\0\u1148\0\u1180\0\u11b8\0\250\0\u11f0\0\250\0\250"+
    "\0\250\0\u1228\0\u1260\0\250";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[124];
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
    "\1\15\1\4\1\16\1\17\1\15\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\42\1\44\1\45\2\2\1\4\1\2\1\21"+
    "\1\15\71\0\1\4\1\46\6\4\1\47\23\4\23\0"+
    "\2\4\2\0\4\4\1\0\34\4\23\0\2\4\2\0"+
    "\4\4\1\0\15\4\1\50\16\4\23\0\2\4\2\0"+
    "\4\4\1\0\6\4\1\51\1\52\23\4\1\51\23\0"+
    "\2\4\2\0\2\4\1\51\1\4\1\0\4\4\1\53"+
    "\7\4\1\54\17\4\23\0\2\4\2\0\4\4\1\0"+
    "\7\4\1\55\24\4\23\0\2\4\2\0\4\4\1\0"+
    "\4\4\1\56\27\4\23\0\2\4\2\0\4\4\1\0"+
    "\4\4\1\57\21\4\1\60\5\4\23\0\2\4\2\0"+
    "\4\4\1\0\15\4\1\61\16\4\23\0\2\4\2\0"+
    "\4\4\1\0\4\4\1\62\10\4\1\63\16\4\23\0"+
    "\2\4\2\0\4\4\1\0\3\4\1\64\30\4\23\0"+
    "\2\4\2\0\4\4\1\0\1\65\33\4\23\0\2\4"+
    "\2\0\4\4\1\0\6\4\1\51\24\4\1\51\23\0"+
    "\2\4\2\0\2\4\1\51\1\4\57\0\1\42\72\0"+
    "\1\66\65\0\2\45\1\66\6\0\2\4\1\67\31\4"+
    "\23\0\2\4\2\0\4\4\1\0\11\4\1\70\22\4"+
    "\23\0\2\4\2\0\4\4\1\0\1\4\1\71\21\4"+
    "\1\72\10\4\23\0\2\4\2\0\4\4\1\0\7\4"+
    "\1\73\24\4\23\0\2\4\2\0\4\4\1\0\10\4"+
    "\1\74\23\4\23\0\2\4\2\0\4\4\1\0\12\4"+
    "\1\75\21\4\23\0\2\4\2\0\4\4\1\0\17\4"+
    "\1\76\14\4\23\0\2\4\2\0\4\4\1\0\10\4"+
    "\1\77\23\4\23\0\2\4\2\0\4\4\1\0\10\4"+
    "\1\100\23\4\23\0\2\4\2\0\4\4\1\0\10\4"+
    "\1\101\23\4\23\0\2\4\2\0\4\4\1\0\3\4"+
    "\1\102\30\4\23\0\2\4\2\0\4\4\1\0\7\4"+
    "\1\103\24\4\23\0\2\4\2\0\4\4\1\0\4\4"+
    "\1\104\27\4\23\0\2\4\2\0\4\4\1\0\12\4"+
    "\1\105\21\4\23\0\2\4\2\0\4\4\1\0\16\4"+
    "\1\106\15\4\23\0\2\4\2\0\4\4\60\0\2\107"+
    "\1\0\1\107\5\0\3\4\1\110\30\4\23\0\2\4"+
    "\2\0\4\4\1\0\7\4\1\111\24\4\23\0\2\4"+
    "\2\0\4\4\1\0\12\4\1\112\21\4\23\0\2\4"+
    "\2\0\4\4\1\0\5\4\1\113\26\4\23\0\2\4"+
    "\2\0\4\4\1\0\3\4\1\114\30\4\23\0\2\4"+
    "\2\0\4\4\1\0\22\4\1\115\1\4\1\116\1\117"+
    "\6\4\23\0\2\4\2\0\4\4\1\0\11\4\1\120"+
    "\22\4\23\0\2\4\2\0\4\4\1\0\11\4\1\121"+
    "\22\4\23\0\2\4\2\0\4\4\1\0\12\4\1\122"+
    "\21\4\23\0\2\4\2\0\4\4\1\0\1\4\1\123"+
    "\32\4\23\0\2\4\2\0\4\4\1\0\15\4\1\124"+
    "\16\4\23\0\2\4\2\0\4\4\1\0\10\4\1\125"+
    "\23\4\23\0\2\4\2\0\4\4\1\0\10\4\1\126"+
    "\23\4\23\0\2\4\2\0\4\4\1\0\1\4\1\127"+
    "\32\4\23\0\2\4\2\0\4\4\1\0\31\4\1\130"+
    "\2\4\23\0\2\4\2\0\4\4\1\0\4\4\1\131"+
    "\27\4\23\0\2\4\2\0\4\4\1\0\3\4\1\132"+
    "\30\4\23\0\2\4\2\0\4\4\1\0\4\4\1\133"+
    "\27\4\23\0\2\4\2\0\4\4\1\0\15\4\1\134"+
    "\16\4\23\0\2\4\2\0\4\4\1\0\15\4\1\135"+
    "\16\4\23\0\2\4\2\0\4\4\1\0\4\4\1\136"+
    "\27\4\23\0\2\4\2\0\4\4\1\0\15\4\1\137"+
    "\16\4\23\0\2\4\2\0\4\4\1\0\12\4\1\140"+
    "\21\4\23\0\2\4\2\0\4\4\1\0\4\4\1\141"+
    "\27\4\23\0\2\4\2\0\4\4\1\0\3\4\1\142"+
    "\30\4\23\0\2\4\2\0\4\4\1\0\11\4\1\143"+
    "\22\4\23\0\2\4\2\0\4\4\1\0\30\4\1\144"+
    "\3\4\23\0\2\4\2\0\4\4\1\0\5\4\1\145"+
    "\26\4\23\0\2\4\2\0\4\4\1\0\12\4\1\146"+
    "\21\4\23\0\2\4\2\0\4\4\1\0\12\4\1\147"+
    "\21\4\23\0\2\4\2\0\4\4\1\0\3\4\1\150"+
    "\30\4\23\0\2\4\2\0\4\4\1\0\1\4\1\151"+
    "\32\4\23\0\2\4\2\0\4\4\1\0\7\4\1\152"+
    "\24\4\23\0\2\4\2\0\4\4\1\0\10\4\1\153"+
    "\23\4\23\0\2\4\2\0\4\4\1\0\3\4\1\154"+
    "\30\4\23\0\2\4\2\0\4\4\1\0\32\4\1\155"+
    "\1\4\23\0\2\4\2\0\4\4\1\0\4\4\1\156"+
    "\27\4\23\0\2\4\2\0\4\4\1\0\15\4\1\157"+
    "\16\4\23\0\2\4\2\0\4\4\1\0\12\4\1\160"+
    "\21\4\23\0\2\4\2\0\4\4\1\0\10\4\1\161"+
    "\23\4\23\0\2\4\2\0\4\4\1\0\11\4\1\162"+
    "\22\4\23\0\2\4\2\0\4\4\1\0\15\4\1\163"+
    "\16\4\23\0\2\4\2\0\4\4\1\0\33\4\1\164"+
    "\23\0\2\4\2\0\4\4\1\0\3\4\1\165\30\4"+
    "\23\0\2\4\2\0\4\4\1\0\11\4\1\166\22\4"+
    "\23\0\2\4\2\0\4\4\1\0\7\4\1\167\24\4"+
    "\23\0\2\4\2\0\4\4\1\0\1\4\1\170\32\4"+
    "\23\0\2\4\2\0\4\4\1\0\30\4\1\171\3\4"+
    "\23\0\2\4\2\0\4\4\1\0\3\4\1\172\30\4"+
    "\23\0\2\4\2\0\4\4\1\0\15\4\1\173\16\4"+
    "\23\0\2\4\2\0\4\4\1\0\1\4\1\174\32\4"+
    "\23\0\2\4\2\0\4\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4760];
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
    "\1\0\1\11\17\1\21\11\23\1\1\0\20\1\1\11"+
    "\65\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[124];
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
    while (i < 400) {
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
          case 45: break;
          case 2: 
            { System.out.println(yytext());return new Symbol(sym.MENORIGUAL,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 46: break;
          case 3: 
            { System.out.println(yytext());return new Symbol(sym.ID,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 47: break;
          case 4: 
            { System.out.println(yytext());return new Symbol(sym.MAYORIGUAL,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 48: break;
          case 5: 
            { System.out.println(yytext());return new Symbol(sym.PARENTESISABIERTO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 49: break;
          case 6: 
            { System.out.println(yytext());return new Symbol(sym.PARENTESISCERRADO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 50: break;
          case 7: 
            { System.out.println(yytext());return new Symbol(sym.LLAVEA,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 51: break;
          case 8: 
            { System.out.println(yytext());return new Symbol(sym.LLAVEC,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 52: break;
          case 9: 
            { System.out.println(yytext());return new Symbol(sym.COMILLAS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 53: break;
          case 10: 
            { System.out.println(yytext());return new Symbol(sym.DOSPUNTOS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 54: break;
          case 11: 
            { System.out.println(yytext());return new Symbol(sym.PUNTOYCOMA,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 55: break;
          case 12: 
            { System.out.println(yytext());return new Symbol(sym.COMA,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 56: break;
          case 13: 
            { System.out.println(yytext());return new Symbol(sym.MULTIPLICAR,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 57: break;
          case 14: 
            { System.out.println(yytext());return new Symbol(sym.MENOS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 58: break;
          case 15: 
            { System.out.println(yytext());return new Symbol(sym.DIAGONAL,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 59: break;
          case 16: 
            { System.out.println(yytext());return new Symbol(sym.POTENCIA,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 60: break;
          case 17: 
            { System.out.println(yytext());return new Symbol(sym.MAS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 61: break;
          case 18: 
            { System.out.println(yytext());return new Symbol(sym.MAYOR,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 62: break;
          case 19: 
            { System.out.println(yytext());return new Symbol(sym.MENOR,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 63: break;
          case 20: 
            { System.out.println(yytext());return new Symbol(sym.IGUAL,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 64: break;
          case 21: 
            { 
            } 
            // fall through
          case 65: break;
          case 22: 
            { System.out.println(yytext());return new Symbol(sym.NUMERO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 66: break;
          case 23: 
            { System.out.println(yytext());return new Symbol(sym.IGUALDOBLE,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 67: break;
          case 24: 
            { System.out.println(yytext());return new Symbol(sym.SI,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 68: break;
          case 25: 
            { System.out.println(yytext());return new Symbol(sym.FUN,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 69: break;
          case 26: 
            { System.out.println(yytext());return new Symbol(sym.DECIMAL,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 70: break;
          case 27: 
            { System.out.println(yytext());return new Symbol(sym.CASO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 71: break;
          case 28: 
            { System.out.println(yytext());return new Symbol(sym.LEER,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 72: break;
          case 29: 
            { System.out.println(yytext());return new Symbol(sym.SINO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 73: break;
          case 30: 
            { System.out.println(yytext());return new Symbol(sym.PARA,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 74: break;
          case 31: 
            { System.out.println(yytext());return new Symbol(sym.MAIN,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 75: break;
          case 32: 
            { System.out.println(yytext());return new Symbol(sym.PROS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 76: break;
          case 33: 
            { System.out.println(yytext());return new Symbol(sym.STRING,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 77: break;
          case 34: 
            { System.out.println(yytext());return new Symbol(sym.FINSI,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 78: break;
          case 35: 
            { System.out.println(yytext());return new Symbol(sym.PARAR,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 79: break;
          case 36: 
            { System.out.println(yytext());return new Symbol(sym.ENTERO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 80: break;
          case 37: 
            { System.out.println(yytext());return new Symbol(sym.CAMBIO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 81: break;
          case 38: 
            { System.out.println(yytext());return new Symbol(sym.FINPARA,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 82: break;
          case 39: 
            { System.out.println(yytext());return new Symbol(sym.FINCASO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 83: break;
          case 40: 
            { System.out.println(yytext());return new Symbol(sym.ESCRIBIR,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 84: break;
          case 41: 
            { System.out.println(yytext());return new Symbol(sym.FLOTANTE,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 85: break;
          case 42: 
            { System.out.println(yytext());return new Symbol(sym.MIENTRAS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 86: break;
          case 43: 
            { System.out.println(yytext());return new Symbol(sym.RETORNO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 87: break;
          case 44: 
            { System.out.println(yytext());return new Symbol(sym.FINMIENTRAS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 88: break;
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
