package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPDateHeader;
import android.gov.nist.javax.sip.header.SIPHeader;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class DateParser extends HeaderParser {
    public DateParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("DateParser.parse");
        }
        try {
            headerName(TokenTypes.DATE);
            wkday();
            this.lexer.match(44);
            this.lexer.match(32);
            Calendar date = date();
            this.lexer.match(32);
            time(date);
            this.lexer.match(32);
            String lowerCase = this.lexer.ttoken().toLowerCase();
            if ("gmt".equals(lowerCase)) {
                this.lexer.match(10);
                SIPDateHeader sIPDateHeader = new SIPDateHeader();
                sIPDateHeader.setDate(date);
                if (z10) {
                    dbg_leave("DateParser.parse");
                }
                return sIPDateHeader;
            }
            throw createParseException("Bad Time Zone " + lowerCase);
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("DateParser.parse");
            }
            throw th2;
        }
    }

    public DateParser(Lexer lexer) {
        super(lexer);
    }
}
