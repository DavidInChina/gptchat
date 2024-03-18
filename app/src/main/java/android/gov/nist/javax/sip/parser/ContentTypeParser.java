package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Token;
import android.gov.nist.javax.sip.header.ContentType;
import android.gov.nist.javax.sip.header.SIPHeader;

/* loaded from: classes2.dex */
public class ContentTypeParser extends ParametersParser {
    public ContentTypeParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        ContentType contentType = new ContentType();
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("ContentTypeParser.parse");
        }
        try {
            headerName(TokenTypes.CONTENT_TYPE);
            this.lexer.match(4095);
            Token nextToken = this.lexer.getNextToken();
            this.lexer.SPorHT();
            contentType.setContentType(nextToken.getTokenValue());
            this.lexer.match(47);
            this.lexer.match(4095);
            Token nextToken2 = this.lexer.getNextToken();
            this.lexer.SPorHT();
            contentType.setContentSubType(nextToken2.getTokenValue());
            super.parse(contentType);
            this.lexer.match(10);
            if (z10) {
                dbg_leave("ContentTypeParser.parse");
            }
            return contentType;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("ContentTypeParser.parse");
            }
            throw th2;
        }
    }

    public ContentTypeParser(Lexer lexer) {
        super(lexer);
    }
}
