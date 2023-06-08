/* The following code was generated by JFlex 1.7.0 */

//codigo en java

package com.mycompany.compiladorlenguajeespaneol.Flex_Y_Cup;

//import com.mycompany.servidor_boxworold.lexer.cup.sym;

//import java_cup.runtime.*;
import java.util.*;
//import java_cup.runtime.XMLElement;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Lexer_JASON.jflex</tt>
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
    "\11\0\1\35\1\33\1\0\1\35\1\34\22\0\1\36\1\0\1\23"+
    "\5\0\1\21\1\22\1\26\1\32\1\25\1\27\1\41\1\30\1\37"+
    "\11\40\1\24\6\0\1\46\1\43\1\46\1\43\1\1\3\43\1\46"+
    "\2\43\1\7\1\46\1\43\1\46\3\43\1\46\1\17\6\43\3\0"+
    "\1\31\1\44\1\0\1\16\1\6\1\3\1\47\1\10\1\14\2\43"+
    "\1\5\2\43\1\15\1\43\1\11\1\13\2\43\1\4\1\2\1\12"+
    "\3\43\1\20\2\43\1\0\1\45\u05e3\0\12\42\206\0\12\42\306\0"+
    "\12\42\u019c\0\12\42\166\0\12\42\166\0\12\42\166\0\12\42\166\0"+
    "\12\42\166\0\12\42\166\0\12\42\166\0\12\42\166\0\12\42\166\0"+
    "\12\42\140\0\12\42\166\0\12\42\106\0\12\42\u0116\0\12\42\106\0"+
    "\12\42\u0746\0\12\42\46\0\12\42\u012c\0\12\42\200\0\12\42\246\0"+
    "\12\42\6\0\12\42\266\0\12\42\126\0\12\42\206\0\12\42\6\0"+
    "\12\42\u89c6\0\12\42\u02a6\0\12\42\46\0\12\42\306\0\12\42\26\0"+
    "\12\42\126\0\12\42\u0196\0\12\42\u5316\0\12\42\u0586\0\12\42\u0bbc\0"+
    "\12\42\200\0\12\42\74\0\12\42\220\0\12\42\u0116\0\12\42\u0156\0"+
    "\12\42\166\0\12\42\u0176\0\12\42\146\0\12\42\146\0\12\42\u01a6\0"+
    "\12\42\u0366\0\12\42\u4e06\0\12\42\346\0\12\42\u6c74\0\62\42\u1150\0"+
    "\12\42\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u16b5\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\6\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\2\14\2\15\1\1\5\16"+
    "\1\0\2\16\3\0\1\17\3\0\1\20\2\0\1\21"+
    "\5\0\1\22\1\0\1\23\3\0\1\24\1\25";

  private static int [] zzUnpackAction() {
    int [] result = new int[54];
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
    "\0\0\0\50\0\120\0\170\0\240\0\310\0\360\0\50"+
    "\0\50\0\50\0\50\0\50\0\50\0\50\0\50\0\50"+
    "\0\50\0\u0118\0\50\0\u0140\0\u0168\0\u0190\0\50\0\u01b8"+
    "\0\u01e0\0\u0208\0\u0230\0\u0208\0\u0258\0\u0280\0\u02a8\0\u02d0"+
    "\0\u02f8\0\50\0\u0320\0\u0348\0\u0370\0\50\0\u0398\0\u03c0"+
    "\0\50\0\u03e8\0\u0410\0\u0438\0\u0460\0\u0488\0\50\0\u04b0"+
    "\0\50\0\u04d8\0\u0500\0\u0528\0\50\0\50";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[54];
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
    "\1\2\1\3\5\4\1\5\4\4\1\6\2\4\1\7"+
    "\1\4\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\3\23\1\24\1\25\2\2"+
    "\1\4\2\2\1\26\1\4\51\0\1\27\1\30\6\27"+
    "\1\31\7\27\5\0\1\27\10\0\2\27\2\0\5\27"+
    "\1\0\20\27\5\0\1\27\10\0\2\27\2\0\5\27"+
    "\1\0\4\27\1\32\2\27\1\33\10\27\5\0\1\27"+
    "\7\0\1\34\2\27\2\0\2\27\1\32\1\27\1\32"+
    "\1\0\14\27\1\35\3\27\5\0\1\27\10\0\2\27"+
    "\2\0\5\27\1\0\7\27\1\36\10\27\5\0\1\27"+
    "\10\0\2\27\2\0\5\27\34\0\1\23\54\0\1\37"+
    "\45\0\2\25\1\37\7\0\4\27\1\32\13\27\5\0"+
    "\1\27\7\0\1\34\2\27\2\0\2\27\1\32\1\27"+
    "\1\32\3\0\1\40\56\0\1\41\42\0\1\34\1\0"+
    "\1\42\26\0\1\34\6\0\1\34\1\42\1\34\10\0"+
    "\1\43\52\0\1\44\54\0\1\45\66\0\2\46\1\0"+
    "\1\46\11\0\1\47\53\0\1\50\43\0\1\51\55\0"+
    "\1\52\47\0\1\53\42\0\1\54\46\0\1\55\61\0"+
    "\1\56\44\0\1\57\42\0\1\60\54\0\1\61\45\0"+
    "\1\62\43\0\1\63\54\0\1\64\41\0\1\65\53\0"+
    "\1\66\37\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1360];
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
    "\1\0\1\11\5\1\12\11\1\1\1\11\3\1\1\11"+
    "\4\1\1\0\2\1\3\0\1\11\3\0\1\11\2\0"+
    "\1\11\5\0\1\11\1\0\1\11\3\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[54];
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
    while (i < 374) {
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
          case 22: break;
          case 2: 
            { /*System.out.println(yytext());*/return new Symbol(sym.PARENTESISABIERTO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 23: break;
          case 3: 
            { /*System.out.println(yytext());*/return new Symbol(sym.PARENTESISCERRADO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 24: break;
          case 4: 
            { /*System.out.println(yytext());*/return new Symbol(sym.COMILLAS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 25: break;
          case 5: 
            { /*System.out.println(yytext());*/return new Symbol(sym.DOSPUNTOS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 26: break;
          case 6: 
            { /*System.out.println(yytext());*/return new Symbol(sym.COMA,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 27: break;
          case 7: 
            { /*System.out.println(yytext());*/return new Symbol(sym.MULTIPLICAR,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 28: break;
          case 8: 
            { /*System.out.println(yytext());*/return new Symbol(sym.MENOS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 29: break;
          case 9: 
            { /*System.out.println(yytext());*/return new Symbol(sym.DIAGONAL,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 30: break;
          case 10: 
            { /*System.out.println(yytext());*/return new Symbol(sym.POTENCIA,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 31: break;
          case 11: 
            { /*System.out.println(yytext());*/return new Symbol(sym.MAS,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 32: break;
          case 12: 
            { 
            } 
            // fall through
          case 33: break;
          case 13: 
            { /*System.out.println(yytext());*/return new Symbol(sym.NUMERO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 34: break;
          case 14: 
            { /*System.out.println(yytext());*/return new Symbol(sym.ID,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 35: break;
          case 15: 
            { /*System.out.println(yytext());*/return new Symbol(sym.COMILASTEXTO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 36: break;
          case 16: 
            { /*System.out.println(yytext());*/return new Symbol(sym.DECIMAL,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 37: break;
          case 17: 
            { /*System.out.println(yytext());*/return new Symbol(sym.LEER,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 38: break;
          case 18: 
            { /*System.out.println(yytext());*/return new Symbol(sym.STRING,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 39: break;
          case 19: 
            { /*System.out.println(yytext());*/return new Symbol(sym.ENTERO,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 40: break;
          case 20: 
            { /*System.out.println(yytext());*/return new Symbol(sym.ESCRIBIR,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 41: break;
          case 21: 
            { /*System.out.println(yytext());*/return new Symbol(sym.FLOTANTE,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 42: break;
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