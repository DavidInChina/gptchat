package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.NameValue;
import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.SubscriptionState;
import android.javax.sip.g;

/* loaded from: classes2.dex */
public class SubscriptionStateParser extends HeaderParser {
    public SubscriptionStateParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("SubscriptionStateParser.parse");
        }
        SubscriptionState subscriptionState = new SubscriptionState();
        try {
            headerName(TokenTypes.SUBSCRIPTION_STATE);
            subscriptionState.setHeaderName(SIPHeaderNames.SUBSCRIPTION_STATE);
            this.lexer.match(4095);
            subscriptionState.setState(this.lexer.getNextToken().getTokenValue());
            while (this.lexer.lookAhead(0) == ';') {
                this.lexer.match(59);
                this.lexer.SPorHT();
                NameValue nameValue = nameValue('=');
                if (nameValue.getName().equalsIgnoreCase("reason")) {
                    subscriptionState.setReasonCode(nameValue.getValue());
                } else if (nameValue.getName().equalsIgnoreCase("expires")) {
                    try {
                        subscriptionState.setExpires(Integer.parseInt(nameValue.getValue()));
                    } catch (g e10) {
                        throw createParseException(e10.getMessage());
                    } catch (NumberFormatException e11) {
                        throw createParseException(e11.getMessage());
                    }
                } else if (nameValue.getName().equalsIgnoreCase("retry-after")) {
                    try {
                        subscriptionState.setRetryAfter(Integer.parseInt(nameValue.getValue()));
                    } catch (g e12) {
                        throw createParseException(e12.getMessage());
                    } catch (NumberFormatException e13) {
                        throw createParseException(e13.getMessage());
                    }
                } else {
                    subscriptionState.setParameter(nameValue);
                }
                this.lexer.SPorHT();
            }
            if (ParserCore.debug) {
                dbg_leave("SubscriptionStateParser.parse");
            }
            return subscriptionState;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("SubscriptionStateParser.parse");
            }
            throw th2;
        }
    }

    public SubscriptionStateParser(Lexer lexer) {
        super(lexer);
    }
}
