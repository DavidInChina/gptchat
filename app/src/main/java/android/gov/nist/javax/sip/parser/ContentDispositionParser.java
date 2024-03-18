package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.ContentDisposition;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.text.ParseException;

/* loaded from: classes.dex */
public class ContentDispositionParser extends ParametersParser {
    public ContentDispositionParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("ContentDispositionParser.parse");
        }
        try {
            try {
                headerName(TokenTypes.CONTENT_DISPOSITION);
                ContentDisposition contentDisposition = new ContentDisposition();
                contentDisposition.setHeaderName(SIPHeaderNames.CONTENT_DISPOSITION);
                this.lexer.SPorHT();
                this.lexer.match(4095);
                contentDisposition.setDispositionType(this.lexer.getNextToken().getTokenValue());
                this.lexer.SPorHT();
                super.parse(contentDisposition);
                this.lexer.SPorHT();
                this.lexer.match(10);
                if (z10) {
                    dbg_leave("ContentDispositionParser.parse");
                }
                return contentDisposition;
            } catch (ParseException e10) {
                throw createParseException(e10.getMessage());
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("ContentDispositionParser.parse");
            }
            throw th2;
        }
    }

    public ContentDispositionParser(Lexer lexer) {
        super(lexer);
    }
}
