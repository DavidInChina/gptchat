package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredService;
import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import android.gov.nist.javax.sip.parser.HeaderParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.javax.sip.g;

/* loaded from: classes2.dex */
public class PPreferredServiceParser extends HeaderParser implements TokenTypes {
    public PPreferredServiceParser(Lexer lexer) {
        super(lexer);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        PPreferredService pPreferredService;
        String buffer;
        if (ParserCore.debug) {
            dbg_enter("PPreferredServiceParser.parse");
        }
        try {
            this.lexer.match(TokenTypes.P_PREFERRED_SERVICE);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            pPreferredService = new PPreferredService();
            buffer = this.lexer.getBuffer();
        } finally {
        }
        if (buffer.contains(ParameterNamesIms.SERVICE_ID)) {
            if (buffer.contains(ParameterNamesIms.SERVICE_ID_LABEL)) {
                String str = buffer.split("3gpp-service.")[1];
                if (!str.trim().equals("")) {
                    pPreferredService.setSubserviceIdentifiers(str);
                } else {
                    try {
                        throw new g("URN should atleast have one sub-service");
                    } catch (g e10) {
                        e10.printStackTrace();
                    }
                }
            } else if (buffer.contains(ParameterNamesIms.APPLICATION_ID_LABEL)) {
                String str2 = buffer.split(ParameterNamesIms.APPLICATION_ID_LABEL)[1];
                if (!str2.trim().equals("")) {
                    pPreferredService.setApplicationIdentifiers(str2);
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
                dbg_enter("PPreferredServiceParser.parse");
            }
        }
        super.parse();
        return pPreferredService;
    }

    public PPreferredServiceParser(String str) {
        super(str);
    }
}
