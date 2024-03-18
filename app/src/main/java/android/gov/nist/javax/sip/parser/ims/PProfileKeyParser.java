package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PProfileKey;
import android.gov.nist.javax.sip.parser.AddressParametersParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;

/* loaded from: classes.dex */
public class PProfileKeyParser extends AddressParametersParser implements TokenTypes {
    public PProfileKeyParser(Lexer lexer) {
        super(lexer);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("PProfileKey.parse");
        }
        try {
            this.lexer.match(TokenTypes.P_PROFILE_KEY);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            PProfileKey pProfileKey = new PProfileKey();
            super.parse((AddressParametersHeader) pProfileKey);
            if (z10) {
                dbg_leave("PProfileKey.parse");
            }
            return pProfileKey;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("PProfileKey.parse");
            }
            throw th2;
        }
    }

    public PProfileKeyParser(String str) {
        super(str);
    }
}
