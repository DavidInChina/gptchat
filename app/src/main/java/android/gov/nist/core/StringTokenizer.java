package android.gov.nist.core;

import java.text.ParseException;
import java.util.Vector;

/* loaded from: classes2.dex */
public class StringTokenizer {
    protected char[] buffer;
    protected int bufferLen;
    protected int ptr;
    protected int savedPtr;

    public StringTokenizer() {
    }

    public static String getSDPFieldName(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(0, str.indexOf(Separators.EQUALS));
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static boolean isAlpha(char c10) {
        if (c10 <= '\u007f') {
            if ((c10 < 'a' || c10 > 'z') && (c10 < 'A' || c10 > 'Z')) {
                return false;
            }
            return true;
        } else if (!Character.isLowerCase(c10) && !Character.isUpperCase(c10)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isAlphaDigit(char c10) {
        if (c10 <= '\u007f') {
            if ((c10 < 'a' || c10 > 'z') && ((c10 < 'A' || c10 > 'Z') && (c10 > '9' || c10 < '0'))) {
                return false;
            }
            return true;
        } else if (!Character.isLowerCase(c10) && !Character.isUpperCase(c10) && !Character.isDigit(c10)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isDigit(char c10) {
        if (c10 <= '\u007f') {
            if (c10 <= '9' && c10 >= '0') {
                return true;
            }
            return false;
        }
        return Character.isDigit(c10);
    }

    public static boolean isHexDigit(char c10) {
        if ((c10 >= 'A' && c10 <= 'F') || ((c10 >= 'a' && c10 <= 'f') || isDigit(c10))) {
            return true;
        }
        return false;
    }

    public void consume() {
        this.ptr = this.savedPtr;
    }

    public String getLine() {
        int i10;
        int i11;
        int i12 = this.ptr;
        while (true) {
            i10 = this.ptr;
            i11 = this.bufferLen;
            if (i10 >= i11 || this.buffer[i10] == '\n') {
                break;
            }
            this.ptr = i10 + 1;
        }
        if (i10 < i11 && this.buffer[i10] == '\n') {
            this.ptr = i10 + 1;
        }
        return String.valueOf(this.buffer, i12, this.ptr - i12);
    }

    public Vector<String> getLines() {
        Vector<String> vector = new Vector<>();
        while (hasMoreChars()) {
            vector.addElement(getLine());
        }
        return vector;
    }

    public char getNextChar() {
        int i10 = this.ptr;
        if (i10 < this.bufferLen) {
            char[] cArr = this.buffer;
            this.ptr = i10 + 1;
            return cArr[i10];
        }
        throw new ParseException(((Object) this.buffer) + " getNextChar: End of buffer", this.ptr);
    }

    public String getNextToken(char c10) {
        int i10 = this.ptr;
        while (true) {
            char lookAhead = lookAhead(0);
            if (lookAhead == c10) {
                return String.valueOf(this.buffer, i10, this.ptr - i10);
            }
            if (lookAhead != 0) {
                consume(1);
            } else {
                throw new ParseException("EOL reached", 0);
            }
        }
    }

    public boolean hasMoreChars() {
        if (this.ptr < this.bufferLen) {
            return true;
        }
        return false;
    }

    public char lookAhead() {
        return lookAhead(0);
    }

    public String nextToken() {
        char c10;
        int i10 = this.ptr;
        do {
            int i11 = this.ptr;
            if (i11 >= this.bufferLen) {
                break;
            }
            c10 = this.buffer[i11];
            this.ptr = i11 + 1;
        } while (c10 != '\n');
        return String.valueOf(this.buffer, i10, this.ptr - i10);
    }

    public String peekLine() {
        int i10 = this.ptr;
        String line = getLine();
        this.ptr = i10;
        return line;
    }

    public StringTokenizer(String str) {
        this.buffer = str.toCharArray();
        this.bufferLen = str.length();
        this.ptr = 0;
    }

    public void consume(int i10) {
        this.ptr += i10;
    }

    public char lookAhead(int i10) {
        try {
            return this.buffer[this.ptr + i10];
        } catch (IndexOutOfBoundsException unused) {
            return (char) 0;
        }
    }
}
