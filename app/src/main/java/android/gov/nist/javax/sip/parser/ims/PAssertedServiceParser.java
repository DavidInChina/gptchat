package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedService;
import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import android.gov.nist.javax.sip.parser.HeaderParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.javax.sip.g;

/* loaded from: classes.dex */
public class PAssertedServiceParser extends HeaderParser implements TokenTypes {
    public PAssertedServiceParser(Lexer lexer) {
        super(lexer);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        PAssertedService pAssertedService;
        String buffer;
        if (ParserCore.debug) {
            dbg_enter("PAssertedServiceParser.parse");
        }
        try {
            this.lexer.match(TokenTypes.P_ASSERTED_SERVICE);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            pAssertedService = new PAssertedService();
            buffer = this.lexer.getBuffer();
        } finally {
        }
        if (buffer.contains(ParameterNamesIms.SERVICE_ID)) {
            if (buffer.contains(ParameterNamesIms.SERVICE_ID_LABEL)) {
                if (!buffer.split("3gpp-service.")[1].trim().equals("")) {
                    pAssertedService.setSubserviceIdentifiers(buffer.split(ParameterNamesIms.SERVICE_ID_LABEL)[1]);
                } else {
                    try {
                        throw new g("URN should atleast have one sub-service");
                    } catch (g e10) {
                        e10.printStackTrace();
                    }
                }
            } else if (buffer.contains(ParameterNamesIms.APPLICATION_ID_LABEL)) {
                if (!buffer.split("3gpp-application.")[1].trim().equals("")) {
                    pAssertedService.setApplicationIdentifiers(buffer.split(ParameterNamesIms.APPLICATION_ID_LABEL)[1]);
                } else {
                    try {
                        throw new g("URN should atleast have one sub-application");
                    } catch (g e11) {
                        e11.printStackTrace();
                    }
                }
            } else {
                try {
                    throw new g("URN is not well formed");
                } catch (g e12) {
                    e12.printStackTrace();
                }
            }
            if (ParserCore.debug) {
                dbg_enter("PAssertedServiceParser.parse");
            }
        }
        super.parse();
        return pAssertedService;
    }

    public PAssertedServiceParser(String str) {
        super(str);
    }
}
