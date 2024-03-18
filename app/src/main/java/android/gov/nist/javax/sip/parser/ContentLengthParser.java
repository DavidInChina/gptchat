package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.javax.sip.g;

/* loaded from: classes.dex */
public class ContentLengthParser extends HeaderParser {
    public ContentLengthParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("ContentLengthParser.enter");
        }
        try {
            try {
                ContentLength contentLength = new ContentLength();
                headerName(TokenTypes.CONTENT_LENGTH);
                contentLength.setContentLength(Integer.parseInt(this.lexer.number()));
                this.lexer.SPorHT();
                this.lexer.match(10);
                if (z10) {
                    dbg_leave("ContentLengthParser.leave");
                }
                return contentLength;
            } catch (g e10) {
                throw createParseException(e10.getMessage());
            } catch (NumberFormatException e11) {
                throw createParseException(e11.getMessage());
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("ContentLengthParser.leave");
            }
            throw th2;
        }
    }

    public ContentLengthParser(Lexer lexer) {
        super(lexer);
    }
}
