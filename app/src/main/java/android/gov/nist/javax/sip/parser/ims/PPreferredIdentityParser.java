package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredIdentity;
import android.gov.nist.javax.sip.parser.AddressParametersParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;

/* loaded from: classes.dex */
public class PPreferredIdentityParser extends AddressParametersParser implements TokenTypes {
    public PPreferredIdentityParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("PreferredIdentityParser.parse");
        }
        try {
            this.lexer.match(TokenTypes.P_PREFERRED_IDENTITY);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            PPreferredIdentity pPreferredIdentity = new PPreferredIdentity();
            super.parse((AddressParametersHeader) pPreferredIdentity);
            if (z10) {
                dbg_leave("PreferredIdentityParser.parse");
            }
            return pPreferredIdentity;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("PreferredIdentityParser.parse");
            }
            throw th2;
        }
    }

    public PPreferredIdentityParser(Lexer lexer) {
        super(lexer);
    }
}
