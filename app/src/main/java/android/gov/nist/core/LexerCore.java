package android.gov.nist.core;

import android.gov.nist.javax.sip.Utils;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.ParseException;
import java.util.Map;

/* loaded from: classes.dex */
public class LexerCore extends StringTokenizer {
    public static final int ALPHA = 4099;
    static final char ALPHADIGIT_VALID_CHARS = '\ufffd';
    static final char ALPHA_VALID_CHARS = '\uffff';
    public static final int AND = 38;
    public static final int AT = 64;
    public static final int BACKSLASH = 92;
    public static final int BACK_QUOTE = 96;
    public static final int BAR = 124;
    public static final int COLON = 58;
    public static final int DIGIT = 4098;
    static final char DIGIT_VALID_CHARS = '\ufffe';
    public static final int DOLLAR = 36;
    public static final int DOT = 46;
    public static final int DOUBLEQUOTE = 34;
    public static final int END = 4096;
    public static final int EQUALS = 61;
    public static final int EXCLAMATION = 33;
    public static final int GREATER_THAN = 62;
    public static final int HAT = 94;
    public static final int HT = 9;
    public static final int ID = 4095;
    public static final int ID_NO_WHITESPACE = 4093;
    public static final int IPV6 = 4100;
    public static final int LESS_THAN = 60;
    public static final int LPAREN = 40;
    public static final int L_CURLY = 123;
    public static final int L_SQUARE_BRACKET = 91;
    public static final int MINUS = 45;
    public static final int NULL = 0;
    public static final int PERCENT = 37;
    public static final int PLUS = 43;
    public static final int POUND = 35;
    public static final int QUESTION = 63;
    public static final int QUOTE = 39;
    public static final int RPAREN = 41;
    public static final int R_CURLY = 125;
    public static final int R_SQUARE_BRACKET = 93;
    public static final int SAFE = 4094;
    public static final int SEMICOLON = 59;
    public static final int SLASH = 47;
    public static final int SP = 32;
    public static final int STAR = 42;
    public static final int START = 2048;
    public static final int TILDE = 126;
    public static final int UNDERSCORE = 95;
    public static final int WHITESPACE = 4097;
    protected static final ConcurrentHashMap<Integer, String> globalSymbolTable = new ConcurrentHashMap<>();
    protected static final ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> lexerTables = new ConcurrentHashMap<>();
    protected Map<String, Integer> currentLexer;
    protected String currentLexerName;
    protected Token currentMatch;

    public LexerCore() {
        this.currentLexer = new ConcurrentHashMap();
        this.currentLexerName = "charLexer";
    }

    public static String charAsString(char c10) {
        return String.valueOf(c10);
    }

    public static final boolean isTokenChar(char c10) {
        if (StringTokenizer.isAlphaDigit(c10) || c10 == '!' || c10 == '%' || c10 == '\'' || c10 == '~' || c10 == '*' || c10 == '+' || c10 == '-' || c10 == '.' || c10 == '_' || c10 == '`') {
            return true;
        }
        return false;
    }

    public void SPorHT() {
        try {
            char lookAhead = lookAhead(0);
            while (true) {
                if (lookAhead == ' ' || lookAhead == '\t') {
                    consume(1);
                    lookAhead = lookAhead(0);
                } else {
                    return;
                }
            }
        } catch (ParseException unused) {
        }
    }

    public void addKeyword(String str, int i10) {
        String upperCase = Utils.toUpperCase(str);
        Integer valueOf = Integer.valueOf(i10);
        this.currentLexer.put(upperCase, valueOf);
        globalSymbolTable.putIfAbsent(valueOf, upperCase);
    }

    public String byteStringNoComma() {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                char lookAhead = lookAhead(0);
                if (lookAhead == '\n' || lookAhead == ',') {
                    break;
                }
                consume(1);
                sb2.append(lookAhead);
            } catch (ParseException unused) {
            }
        }
        return sb2.toString();
    }

    public String byteStringNoSemicolon() {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                char lookAhead = lookAhead(0);
                if (lookAhead == 0 || lookAhead == '\n' || lookAhead == ';' || lookAhead == ',') {
                    break;
                }
                consume(1);
                sb2.append(lookAhead);
            } catch (ParseException unused) {
                return sb2.toString();
            }
        }
        return sb2.toString();
    }

    public String byteStringNoSlash() {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                char lookAhead = lookAhead(0);
                if (lookAhead == 0 || lookAhead == '\n' || lookAhead == '/') {
                    break;
                }
                consume(1);
                sb2.append(lookAhead);
            } catch (ParseException unused) {
                return sb2.toString();
            }
        }
        return sb2.toString();
    }

    public String comment() {
        StringBuilder sb2 = new StringBuilder();
        if (lookAhead(0) != '(') {
            return null;
        }
        consume(1);
        while (true) {
            char nextChar = getNextChar();
            if (nextChar == ')') {
                return sb2.toString();
            }
            if (nextChar != 0) {
                if (nextChar == '\\') {
                    sb2.append(nextChar);
                    char nextChar2 = getNextChar();
                    if (nextChar2 != 0) {
                        sb2.append(nextChar2);
                    } else {
                        throw new ParseException(((Object) this.buffer) + " : unexpected EOL", this.ptr);
                    }
                } else {
                    sb2.append(nextChar);
                }
            } else {
                throw new ParseException(((Object) this.buffer) + " :unexpected EOL", this.ptr);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032 A[Catch: ParseException -> 0x0036, LOOP:1: B:23:0x0001->B:20:0x0032, LOOP_END, TRY_LEAVE, TryCatch #0 {ParseException -> 0x0036, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x0011, B:9:0x0013, B:13:0x001c, B:14:0x0021, B:15:0x0026, B:18:0x002d, B:20:0x0032), top: B:23:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void consumeValidChars(char[] cArr) {
        while (hasMoreChars()) {
            try {
                char lookAhead = lookAhead(0);
                boolean z10 = false;
                for (char c10 : cArr) {
                    switch (c10) {
                        case '\ufffd':
                            z10 = StringTokenizer.isAlphaDigit(lookAhead);
                            break;
                        case '\ufffe':
                            z10 = StringTokenizer.isDigit(lookAhead);
                            break;
                        case '\uffff':
                            z10 = StringTokenizer.isAlpha(lookAhead);
                            break;
                        default:
                            if (lookAhead == c10) {
                                z10 = true;
                                break;
                            } else {
                                z10 = false;
                                break;
                            }
                    }
                    if (z10) {
                        if (!z10) {
                            consume(1);
                        } else {
                            return;
                        }
                    }
                }
                if (!z10) {
                }
            } catch (ParseException unused) {
                return;
            }
        }
    }

    public ParseException createParseException() {
        return new ParseException(getBuffer(), this.ptr);
    }

    public String getBuffer() {
        return String.valueOf(this.buffer);
    }

    public String getNextId() {
        return ttoken();
    }

    public String getNextIdNoWhiteSpace() {
        return ttokenNoWhiteSpace();
    }

    public String getNextIp() {
        return tIpv6address();
    }

    public Token getNextToken() {
        return this.currentMatch;
    }

    public int getPtr() {
        return this.ptr;
    }

    public String getRest() {
        int i10 = this.ptr;
        int i11 = this.bufferLen;
        if (i10 > i11) {
            return null;
        }
        if (i10 == i11) {
            return "";
        }
        return String.valueOf(this.buffer, i10, i11 - i10);
    }

    public String getString(char c10) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            char lookAhead = lookAhead(0);
            if (lookAhead != 0) {
                if (lookAhead == c10) {
                    consume(1);
                    return sb2.toString();
                } else if (lookAhead == '\\') {
                    consume(1);
                    char lookAhead2 = lookAhead(0);
                    if (lookAhead2 != 0) {
                        consume(1);
                        sb2.append(lookAhead2);
                    } else {
                        throw new ParseException(((Object) this.buffer) + "unexpected EOL", this.ptr);
                    }
                } else {
                    consume(1);
                    sb2.append(lookAhead);
                }
            } else {
                throw new ParseException(((Object) this.buffer) + "unexpected EOL", this.ptr);
            }
        }
    }

    public String lookupToken(int i10) {
        if (i10 > 2048) {
            return globalSymbolTable.get(Integer.valueOf(i10));
        }
        return Character.valueOf((char) i10).toString();
    }

    public int markInputPosition() {
        return this.ptr;
    }

    public Token match(int i10) {
        if (Debug.parserDebug) {
            Debug.println("match " + i10);
        }
        if (i10 > 2048 && i10 < 4096) {
            if (i10 == 4095) {
                if (startsId()) {
                    String nextId = getNextId();
                    Token token = new Token();
                    this.currentMatch = token;
                    token.tokenValue = nextId;
                    token.tokenType = 4095;
                } else {
                    throw new ParseException(((Object) this.buffer) + "\nID expected", this.ptr);
                }
            } else if (i10 == 4094) {
                if (startsSafeToken()) {
                    String ttokenSafe = ttokenSafe();
                    Token token2 = new Token();
                    this.currentMatch = token2;
                    token2.tokenValue = ttokenSafe;
                    token2.tokenType = 4094;
                } else {
                    throw new ParseException(((Object) this.buffer) + "\nID expected", this.ptr);
                }
            } else if (i10 == 4093) {
                if (startsIdNoWhiteSpace()) {
                    String nextIdNoWhiteSpace = getNextIdNoWhiteSpace();
                    Token token3 = new Token();
                    this.currentMatch = token3;
                    token3.tokenValue = nextIdNoWhiteSpace;
                    token3.tokenType = ID_NO_WHITESPACE;
                } else {
                    throw new ParseException(((Object) this.buffer) + "\nID no white space expected", this.ptr);
                }
            } else {
                String nextId2 = getNextId();
                Integer num = this.currentLexer.get(Utils.toUpperCase(nextId2));
                if (num != null && num.intValue() == i10) {
                    Token token4 = new Token();
                    this.currentMatch = token4;
                    token4.tokenValue = nextId2;
                    token4.tokenType = i10;
                } else {
                    throw new ParseException(((Object) this.buffer) + "\nUnexpected Token : " + nextId2, this.ptr);
                }
            }
        } else if (i10 > 4096) {
            char lookAhead = lookAhead(0);
            if (i10 == 4098) {
                if (StringTokenizer.isDigit(lookAhead)) {
                    Token token5 = new Token();
                    this.currentMatch = token5;
                    token5.tokenValue = String.valueOf(lookAhead);
                    this.currentMatch.tokenType = i10;
                    consume(1);
                } else {
                    throw new ParseException(((Object) this.buffer) + "\nExpecting DIGIT", this.ptr);
                }
            } else if (i10 == 4099) {
                if (StringTokenizer.isAlpha(lookAhead)) {
                    Token token6 = new Token();
                    this.currentMatch = token6;
                    token6.tokenValue = String.valueOf(lookAhead);
                    this.currentMatch.tokenType = i10;
                    consume(1);
                } else {
                    throw new ParseException(((Object) this.buffer) + "\nExpecting ALPHA", this.ptr);
                }
            } else if (i10 == 4100) {
                String nextIp = getNextIp();
                Token token7 = new Token();
                this.currentMatch = token7;
                token7.tokenValue = nextIp;
                token7.tokenType = IPV6;
            }
        } else {
            char c10 = (char) i10;
            char lookAhead2 = lookAhead(0);
            if (lookAhead2 == c10) {
                consume(1);
            } else {
                throw new ParseException(((Object) this.buffer) + "\nExpecting  >>>" + c10 + "<<< got >>>" + lookAhead2 + "<<<", this.ptr);
            }
        }
        return this.currentMatch;
    }

    public String number() {
        int i10 = this.ptr;
        try {
            if (StringTokenizer.isDigit(lookAhead(0))) {
                consume(1);
                while (StringTokenizer.isDigit(lookAhead(0))) {
                    consume(1);
                }
                return String.valueOf(this.buffer, i10, this.ptr - i10);
            }
            throw new ParseException(((Object) this.buffer) + ": Unexpected token at " + lookAhead(0), this.ptr);
        } catch (ParseException unused) {
            return String.valueOf(this.buffer, i10, this.ptr - i10);
        }
    }

    public String peekNextId() {
        int i10 = this.ptr;
        String ttoken = ttoken();
        this.savedPtr = this.ptr;
        this.ptr = i10;
        return ttoken;
    }

    public Token peekNextToken() {
        return peekNextToken(1)[0];
    }

    public String quotedString() {
        int i10 = this.ptr + 1;
        if (lookAhead(0) != '\"') {
            return null;
        }
        consume(1);
        while (true) {
            char nextChar = getNextChar();
            if (nextChar == '\"') {
                return String.valueOf(this.buffer, i10, (this.ptr - i10) - 1);
            }
            if (nextChar != 0) {
                if (nextChar == '\\') {
                    consume(1);
                }
            } else {
                throw new ParseException(String.valueOf(this.buffer) + " :unexpected EOL", this.ptr);
            }
        }
    }

    public void rewindInputPosition(int i10) {
        this.ptr = i10;
    }

    public void selectLexer(String str) {
        this.currentLexerName = str;
    }

    public boolean startsId() {
        try {
            return isTokenChar(lookAhead(0));
        } catch (ParseException unused) {
            return false;
        }
    }

    public boolean startsIdNoWhiteSpace() {
        try {
            char lookAhead = lookAhead(0);
            if (lookAhead == ' ' || lookAhead == '\t' || lookAhead == '\n') {
                return false;
            }
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public boolean startsSafeToken() {
        try {
            char lookAhead = lookAhead(0);
            if (!StringTokenizer.isAlphaDigit(lookAhead) && lookAhead != '\'' && lookAhead != '=' && lookAhead != '[' && lookAhead != '*' && lookAhead != '+' && lookAhead != ':' && lookAhead != ';' && lookAhead != '?' && lookAhead != '@') {
                switch (lookAhead) {
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                        break;
                    default:
                        switch (lookAhead) {
                            case '-':
                            case '.':
                            case '/':
                                break;
                            default:
                                switch (lookAhead) {
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                        break;
                                    default:
                                        switch (lookAhead) {
                                            case '{':
                                            case '|':
                                            case '}':
                                            case '~':
                                                break;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
            }
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public String tIpv6address() {
        try {
            char[] cArr = this.buffer;
            int i10 = this.ptr;
            HostPort hostPort = new HostNameParser(String.valueOf(cArr, i10, cArr.length - i10)).hostPort(true);
            consume(hostPort.getHost().hostname.length());
            return hostPort.getHost().hostname;
        } catch (ParseException unused) {
            return null;
        }
    }

    public String ttoken() {
        int i10 = this.ptr;
        while (hasMoreChars() && isTokenChar(lookAhead(0))) {
            try {
                consume(1);
            } catch (ParseException unused) {
                return null;
            }
        }
        return String.valueOf(this.buffer, i10, this.ptr - i10);
    }

    public String ttokenGenValue() {
        int i10 = this.ptr;
        while (hasMoreChars()) {
            try {
                char lookAhead = lookAhead(0);
                if (StringTokenizer.isAlphaDigit(lookAhead)) {
                    consume(1);
                } else {
                    if (lookAhead != '\'' && lookAhead != ':' && lookAhead != '[' && lookAhead != '*' && lookAhead != '+' && lookAhead != '?' && lookAhead != '@') {
                        switch (lookAhead) {
                            case '!':
                            case '\"':
                            case '#':
                            case '$':
                            case '%':
                                break;
                            default:
                                switch (lookAhead) {
                                    case '-':
                                    case '.':
                                    case '/':
                                        break;
                                    default:
                                        switch (lookAhead) {
                                            case ']':
                                            case '^':
                                            case '_':
                                            case '`':
                                                break;
                                            default:
                                                switch (lookAhead) {
                                                    case '{':
                                                    case '|':
                                                    case '}':
                                                    case '~':
                                                        break;
                                                    default:
                                                        return String.valueOf(this.buffer, i10, this.ptr - i10);
                                                }
                                        }
                                }
                        }
                    }
                    consume(1);
                }
            } catch (ParseException unused) {
                return null;
            }
        }
        return String.valueOf(this.buffer, i10, this.ptr - i10);
    }

    public String ttokenNoWhiteSpace() {
        char lookAhead;
        int i10 = this.ptr;
        while (hasMoreChars() && (lookAhead = lookAhead(0)) != ' ' && lookAhead != '\n' && lookAhead != '\t') {
            try {
                consume(1);
            } catch (ParseException unused) {
                return null;
            }
        }
        return String.valueOf(this.buffer, i10, this.ptr - i10);
    }

    public String ttokenSafe() {
        int i10 = this.ptr;
        while (hasMoreChars()) {
            try {
                char lookAhead = lookAhead(0);
                if (StringTokenizer.isAlphaDigit(lookAhead)) {
                    consume(1);
                } else {
                    if (lookAhead != '\'' && lookAhead != '[' && lookAhead != '*' && lookAhead != '+' && lookAhead != ':' && lookAhead != ';' && lookAhead != '?' && lookAhead != '@') {
                        switch (lookAhead) {
                            case '!':
                            case '\"':
                            case '#':
                            case '$':
                            case '%':
                                break;
                            default:
                                switch (lookAhead) {
                                    case '-':
                                    case '.':
                                    case '/':
                                        break;
                                    default:
                                        switch (lookAhead) {
                                            case ']':
                                            case '^':
                                            case '_':
                                            case '`':
                                                break;
                                            default:
                                                switch (lookAhead) {
                                                    case '{':
                                                    case '|':
                                                    case '}':
                                                    case '~':
                                                        break;
                                                    default:
                                                        return String.valueOf(this.buffer, i10, this.ptr - i10);
                                                }
                                        }
                                }
                        }
                    }
                    consume(1);
                }
            } catch (ParseException unused) {
                return null;
            }
        }
        return String.valueOf(this.buffer, i10, this.ptr - i10);
    }

    public String charAsString(int i10) {
        return String.valueOf(this.buffer, this.ptr, i10 - 1);
    }

    public Token[] peekNextToken(int i10) {
        int i11 = this.ptr;
        Token[] tokenArr = new Token[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            Token token = new Token();
            if (startsId()) {
                String ttoken = ttoken();
                token.tokenValue = ttoken;
                String upperCase = Utils.toUpperCase(ttoken);
                if (this.currentLexer.containsKey(upperCase)) {
                    token.tokenType = this.currentLexer.get(upperCase).intValue();
                } else {
                    token.tokenType = 4095;
                }
            } else {
                char nextChar = getNextChar();
                token.tokenValue = String.valueOf(nextChar);
                if (StringTokenizer.isAlpha(nextChar)) {
                    token.tokenType = 4099;
                } else if (StringTokenizer.isDigit(nextChar)) {
                    token.tokenType = 4098;
                } else {
                    token.tokenType = nextChar;
                }
            }
            tokenArr[i12] = token;
        }
        this.savedPtr = this.ptr;
        this.ptr = i11;
        return tokenArr;
    }

    public LexerCore(String str, String str2) {
        super(str2);
        this.currentLexerName = str;
    }
}
