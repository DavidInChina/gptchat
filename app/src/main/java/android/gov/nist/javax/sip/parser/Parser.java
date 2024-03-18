package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.Debug;
import android.gov.nist.core.LexerCore;
import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Token;
import android.gov.nist.javax.sip.SIPConstants;
import java.text.ParseException;

/* loaded from: classes.dex */
public abstract class Parser extends ParserCore implements TokenTypes {
    public static final void checkToken(String str) {
        if (str != null && str.length() != 0) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                if (!LexerCore.isTokenChar(str.charAt(i10))) {
                    throw new ParseException("Invalid character(s) in string (not allowed in 'token')", i10);
                }
            }
            return;
        }
        throw new ParseException("null or empty token", -1);
    }

    public ParseException createParseException(String str) {
        return new ParseException(this.lexer.getBuffer() + ":" + str, this.lexer.getPtr());
    }

    public Lexer getLexer() {
        return (Lexer) this.lexer;
    }

    public String method() {
        try {
            if (ParserCore.debug) {
                dbg_enter("method");
            }
            Token token = this.lexer.peekNextToken(1)[0];
            if (token.getTokenType() != 2053 && token.getTokenType() != 2054 && token.getTokenType() != 2056 && token.getTokenType() != 2055 && token.getTokenType() != 2052 && token.getTokenType() != 2057 && token.getTokenType() != 2101 && token.getTokenType() != 2102 && token.getTokenType() != 2115 && token.getTokenType() != 2118 && token.getTokenType() != 4095) {
                throw createParseException("Invalid Method");
            }
            this.lexer.consume();
            String tokenValue = token.getTokenValue();
            if (Debug.debug) {
                dbg_leave("method");
            }
            return tokenValue;
        } catch (Throwable th2) {
            if (Debug.debug) {
                dbg_leave("method");
            }
            throw th2;
        }
    }

    public String sipVersion() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("sipVersion");
        }
        try {
            if (!this.lexer.match(TokenTypes.SIP).getTokenValue().equalsIgnoreCase("SIP")) {
                createParseException("Expecting SIP");
            }
            this.lexer.match(47);
            if (!this.lexer.match(4095).getTokenValue().equals("2.0")) {
                createParseException("Expecting SIP/2.0");
            }
            if (z10) {
                dbg_leave("sipVersion");
            }
            return SIPConstants.SIP_VERSION_STRING;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("sipVersion");
            }
            throw th2;
        }
    }
}
