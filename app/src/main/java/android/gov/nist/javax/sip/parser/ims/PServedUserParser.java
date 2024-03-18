package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PServedUser;
import android.gov.nist.javax.sip.parser.AddressParametersParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;

/* loaded from: classes.dex */
public class PServedUserParser extends AddressParametersParser {
    public PServedUserParser(Lexer lexer) {
        super(lexer);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("PServedUser.parse");
        }
        try {
            PServedUser pServedUser = new PServedUser();
            headerName(TokenTypes.P_SERVED_USER);
            super.parse((AddressParametersHeader) pServedUser);
            this.lexer.match(10);
            if (z10) {
                dbg_leave("PServedUser.parse");
            }
            return pServedUser;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("PServedUser.parse");
            }
            throw th2;
        }
    }

    public PServedUserParser(String str) {
        super(str);
    }
}
