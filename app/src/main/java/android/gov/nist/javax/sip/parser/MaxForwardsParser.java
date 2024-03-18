package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.MaxForwards;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.javax.sip.g;

/* loaded from: classes.dex */
public class MaxForwardsParser extends HeaderParser {
    public MaxForwardsParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("MaxForwardsParser.enter");
        }
        try {
            try {
                MaxForwards maxForwards = new MaxForwards();
                headerName(TokenTypes.MAX_FORWARDS);
                maxForwards.setMaxForwards(Integer.parseInt(this.lexer.number()));
                this.lexer.SPorHT();
                this.lexer.match(10);
                if (z10) {
                    dbg_leave("MaxForwardsParser.leave");
                }
                return maxForwards;
            } catch (g e10) {
                throw createParseException(e10.getMessage());
            } catch (NumberFormatException e11) {
                throw createParseException(e11.getMessage());
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("MaxForwardsParser.leave");
            }
            throw th2;
        }
    }

    public MaxForwardsParser(Lexer lexer) {
        super(lexer);
    }
}
