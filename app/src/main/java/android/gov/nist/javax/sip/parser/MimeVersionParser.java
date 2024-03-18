package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.MimeVersion;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.javax.sip.g;

/* loaded from: classes2.dex */
public class MimeVersionParser extends HeaderParser {
    public MimeVersionParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("MimeVersionParser.parse");
        }
        MimeVersion mimeVersion = new MimeVersion();
        try {
            headerName(TokenTypes.MIME_VERSION);
            mimeVersion.setHeaderName(SIPHeaderNames.MIME_VERSION);
            try {
                mimeVersion.setMajorVersion(Integer.parseInt(this.lexer.number()));
                this.lexer.match(46);
                mimeVersion.setMinorVersion(Integer.parseInt(this.lexer.number()));
                this.lexer.SPorHT();
                this.lexer.match(10);
                if (z10) {
                    dbg_leave("MimeVersionParser.parse");
                }
                return mimeVersion;
            } catch (g e10) {
                throw createParseException(e10.getMessage());
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("MimeVersionParser.parse");
            }
            throw th2;
        }
    }

    public MimeVersionParser(Lexer lexer) {
        super(lexer);
    }
}
