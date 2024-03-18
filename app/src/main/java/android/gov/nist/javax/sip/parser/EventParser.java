package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.Event;
import android.gov.nist.javax.sip.header.SIPHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class EventParser extends ParametersParser {
    public EventParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("EventParser.parse");
        }
        try {
            try {
                headerName(TokenTypes.EVENT);
                this.lexer.SPorHT();
                Event event = new Event();
                this.lexer.match(4095);
                event.setEventType(this.lexer.getNextToken().getTokenValue());
                super.parse(event);
                this.lexer.SPorHT();
                this.lexer.match(10);
                if (z10) {
                    dbg_leave("EventParser.parse");
                }
                return event;
            } catch (ParseException e10) {
                throw createParseException(e10.getMessage());
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("EventParser.parse");
            }
            throw th2;
        }
    }

    public EventParser(Lexer lexer) {
        super(lexer);
    }
}
