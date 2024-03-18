package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.StatusLine;
import java.text.ParseException;

/* loaded from: classes.dex */
public class StatusLineParser extends Parser {
    public StatusLineParser(String str) {
        this.lexer = new Lexer("status_lineLexer", str);
    }

    public StatusLine parse() {
        try {
            boolean z10 = ParserCore.debug;
            if (z10) {
                dbg_enter("parse");
            }
            StatusLine statusLine = new StatusLine();
            statusLine.setSipVersion(sipVersion());
            this.lexer.SPorHT();
            statusLine.setStatusCode(statusCode());
            this.lexer.SPorHT();
            statusLine.setReasonPhrase(reasonPhrase());
            this.lexer.SPorHT();
            if (z10) {
                dbg_leave("parse");
            }
            return statusLine;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
            throw th2;
        }
    }

    public String reasonPhrase() {
        return this.lexer.getRest().trim();
    }

    /* JADX WARN: Finally extract failed */
    public int statusCode() {
        String number = this.lexer.number();
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("statusCode");
        }
        try {
            try {
                int parseInt = Integer.parseInt(number);
                if (z10) {
                    dbg_leave("statusCode");
                }
                return parseInt;
            } catch (NumberFormatException e10) {
                throw new ParseException(this.lexer.getBuffer() + ":" + e10.getMessage(), this.lexer.getPtr());
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("statusCode");
            }
            throw th2;
        }
    }

    public StatusLineParser(Lexer lexer) {
        this.lexer = lexer;
        lexer.selectLexer("status_lineLexer");
    }
}
