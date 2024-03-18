package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPETag;
import android.gov.nist.javax.sip.header.SIPHeader;

/* loaded from: classes2.dex */
public class SIPETagParser extends HeaderParser {
    public SIPETagParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("SIPEtag.parse");
        }
        SIPETag sIPETag = new SIPETag();
        try {
            headerName(TokenTypes.SIP_ETAG);
            this.lexer.SPorHT();
            this.lexer.match(4095);
            sIPETag.setETag(this.lexer.getNextToken().getTokenValue());
            this.lexer.SPorHT();
            this.lexer.match(10);
            if (z10) {
                dbg_leave("SIPEtag.parse");
            }
            return sIPETag;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("SIPEtag.parse");
            }
            throw th2;
        }
    }

    public SIPETagParser(Lexer lexer) {
        super(lexer);
    }
}
