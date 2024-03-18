package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.Expires;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.javax.sip.g;

/* loaded from: classes2.dex */
public class ExpiresParser extends HeaderParser {
    public ExpiresParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        Expires expires = new Expires();
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("parse");
        }
        try {
            this.lexer.match(TokenTypes.EXPIRES);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            try {
                try {
                    expires.setExpires(Integer.parseInt(this.lexer.getNextId()));
                    this.lexer.match(10);
                    if (z10) {
                        dbg_leave("parse");
                    }
                    return expires;
                } catch (NumberFormatException unused) {
                    throw createParseException("bad integer format");
                }
            } catch (g e10) {
                throw createParseException(e10.getMessage());
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
            throw th2;
        }
    }

    public ExpiresParser(Lexer lexer) {
        super(lexer);
    }
}
