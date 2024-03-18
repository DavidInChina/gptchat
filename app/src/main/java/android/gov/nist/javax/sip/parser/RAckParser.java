package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.RAck;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.javax.sip.g;

/* loaded from: classes2.dex */
public class RAckParser extends HeaderParser {
    public RAckParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("RAckParser.parse");
        }
        RAck rAck = new RAck();
        try {
            headerName(TokenTypes.RACK);
            rAck.setHeaderName(SIPHeaderNames.RACK);
            try {
                rAck.setRSequenceNumber(Long.parseLong(this.lexer.number()));
                this.lexer.SPorHT();
                rAck.setCSequenceNumber(Long.parseLong(this.lexer.number()));
                this.lexer.SPorHT();
                this.lexer.match(4095);
                rAck.setMethod(this.lexer.getNextToken().getTokenValue());
                this.lexer.SPorHT();
                this.lexer.match(10);
                if (z10) {
                    dbg_leave("RAckParser.parse");
                }
                return rAck;
            } catch (g e10) {
                throw createParseException(e10.getMessage());
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("RAckParser.parse");
            }
            throw th2;
        }
    }

    public RAckParser(Lexer lexer) {
        super(lexer);
    }
}
