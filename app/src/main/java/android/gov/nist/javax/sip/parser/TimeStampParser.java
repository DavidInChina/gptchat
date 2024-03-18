package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.TimeStamp;
import android.javax.sip.g;

/* loaded from: classes2.dex */
public class TimeStampParser extends HeaderParser {
    public TimeStampParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("TimeStampParser.parse");
        }
        TimeStamp timeStamp = new TimeStamp();
        try {
            headerName(TokenTypes.TIMESTAMP);
            timeStamp.setHeaderName(SIPHeaderNames.TIMESTAMP);
            this.lexer.SPorHT();
            String number = this.lexer.number();
            try {
                try {
                    if (this.lexer.lookAhead(0) == '.') {
                        this.lexer.match(46);
                        String number2 = this.lexer.number();
                        timeStamp.setTimeStamp(Float.parseFloat(number + Separators.DOT + number2));
                    } else {
                        timeStamp.setTime(Long.parseLong(number));
                    }
                    this.lexer.SPorHT();
                    if (this.lexer.lookAhead(0) != '\n') {
                        String number3 = this.lexer.number();
                        try {
                            try {
                                if (this.lexer.lookAhead(0) == '.') {
                                    this.lexer.match(46);
                                    String number4 = this.lexer.number();
                                    timeStamp.setDelay(Float.parseFloat(number3 + Separators.DOT + number4));
                                } else {
                                    timeStamp.setDelay(Integer.parseInt(number3));
                                }
                            } catch (g e10) {
                                throw createParseException(e10.getMessage());
                            }
                        } catch (NumberFormatException e11) {
                            throw createParseException(e11.getMessage());
                        }
                    }
                    if (z10) {
                        dbg_leave("TimeStampParser.parse");
                    }
                    return timeStamp;
                } catch (g e12) {
                    throw createParseException(e12.getMessage());
                }
            } catch (NumberFormatException e13) {
                throw createParseException(e13.getMessage());
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("TimeStampParser.parse");
            }
            throw th2;
        }
    }

    public TimeStampParser(Lexer lexer) {
        super(lexer);
    }
}
