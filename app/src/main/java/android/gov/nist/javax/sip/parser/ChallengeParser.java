package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Token;
import android.gov.nist.javax.sip.header.AuthenticationHeader;

/* loaded from: classes2.dex */
public abstract class ChallengeParser extends HeaderParser {
    public ChallengeParser(String str) {
        super(str);
    }

    public void parse(AuthenticationHeader authenticationHeader) {
        this.lexer.SPorHT();
        this.lexer.match(4095);
        Token nextToken = this.lexer.getNextToken();
        this.lexer.SPorHT();
        authenticationHeader.setScheme(nextToken.getTokenValue());
        while (this.lexer.lookAhead(0) != '\n') {
            parseParameter(authenticationHeader);
            this.lexer.SPorHT();
            char lookAhead = this.lexer.lookAhead(0);
            if (lookAhead != '\n' && lookAhead != 0) {
                this.lexer.match(44);
                this.lexer.SPorHT();
            } else {
                return;
            }
        }
    }

    public void parseParameter(AuthenticationHeader authenticationHeader) {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("parseParameter");
        }
        try {
            authenticationHeader.setParameter(nameValue('='));
            if (z10) {
                dbg_leave("parseParameter");
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("parseParameter");
            }
            throw th2;
        }
    }

    public ChallengeParser(Lexer lexer) {
        super(lexer);
    }
}
