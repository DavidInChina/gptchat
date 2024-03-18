package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorization;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorizationList;
import android.gov.nist.javax.sip.parser.HeaderParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.javax.sip.g;

/* loaded from: classes.dex */
public class PMediaAuthorizationParser extends HeaderParser implements TokenTypes {
    public PMediaAuthorizationParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        PMediaAuthorizationList pMediaAuthorizationList = new PMediaAuthorizationList();
        if (ParserCore.debug) {
            dbg_enter("MediaAuthorizationParser.parse");
        }
        try {
            headerName(TokenTypes.P_MEDIA_AUTHORIZATION);
            PMediaAuthorization pMediaAuthorization = new PMediaAuthorization();
            pMediaAuthorization.setHeaderName("P-Media-Authorization");
            while (this.lexer.lookAhead(0) != '\n') {
                this.lexer.match(4095);
                try {
                    pMediaAuthorization.setMediaAuthorizationToken(this.lexer.getNextToken().getTokenValue());
                    pMediaAuthorizationList.add((PMediaAuthorizationList) pMediaAuthorization);
                    this.lexer.SPorHT();
                    if (this.lexer.lookAhead(0) == ',') {
                        this.lexer.match(44);
                        pMediaAuthorization = new PMediaAuthorization();
                    }
                    this.lexer.SPorHT();
                } catch (g e10) {
                    throw createParseException(e10.getMessage());
                }
            }
            if (ParserCore.debug) {
                dbg_leave("MediaAuthorizationParser.parse");
            }
            return pMediaAuthorizationList;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("MediaAuthorizationParser.parse");
            }
            throw th2;
        }
    }

    public PMediaAuthorizationParser(Lexer lexer) {
        super(lexer);
    }
}
