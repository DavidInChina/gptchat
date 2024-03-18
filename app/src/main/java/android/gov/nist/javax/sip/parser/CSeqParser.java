package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.Debug;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.javax.sip.g;

/* loaded from: classes2.dex */
public class CSeqParser extends HeaderParser {
    public CSeqParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        try {
            CSeq cSeq = new CSeq();
            headerName(TokenTypes.CSEQ);
            cSeq.setSeqNumber(Long.parseLong(this.lexer.number()));
            this.lexer.SPorHT();
            cSeq.setMethod(SIPRequest.getCannonicalName(method()).intern());
            this.lexer.SPorHT();
            this.lexer.match(10);
            return cSeq;
        } catch (g e10) {
            Debug.printStackTrace(e10);
            throw createParseException(e10.getMessage());
        } catch (NumberFormatException e11) {
            Debug.printStackTrace(e11);
            throw createParseException("Number format exception");
        }
    }

    public CSeqParser(Lexer lexer) {
        super(lexer);
    }
}
