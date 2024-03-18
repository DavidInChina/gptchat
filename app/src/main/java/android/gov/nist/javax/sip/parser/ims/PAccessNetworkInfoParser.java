package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PAccessNetworkInfo;
import android.gov.nist.javax.sip.parser.HeaderParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PAccessNetworkInfoParser extends HeaderParser implements TokenTypes {
    public PAccessNetworkInfoParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        String str;
        if (ParserCore.debug) {
            dbg_enter("AccessNetworkInfoParser.parse");
        }
        try {
            headerName(TokenTypes.P_ACCESS_NETWORK_INFO);
            PAccessNetworkInfo pAccessNetworkInfo = new PAccessNetworkInfo();
            pAccessNetworkInfo.setHeaderName("P-Access-Network-Info");
            this.lexer.SPorHT();
            this.lexer.match(4095);
            pAccessNetworkInfo.setAccessType(this.lexer.getNextToken().getTokenValue());
            this.lexer.SPorHT();
            while (this.lexer.lookAhead(0) == ';') {
                this.lexer.match(59);
                this.lexer.SPorHT();
                try {
                    pAccessNetworkInfo.setParameter(super.nameValue('='));
                } catch (ParseException unused) {
                    this.lexer.SPorHT();
                    String quotedString = this.lexer.quotedString();
                    if (quotedString == null) {
                        str = this.lexer.ttokenGenValue();
                    } else {
                        str = Separators.DOUBLE_QUOTE + quotedString + Separators.DOUBLE_QUOTE;
                    }
                    pAccessNetworkInfo.setExtensionAccessInfo(str);
                }
                this.lexer.SPorHT();
            }
            this.lexer.SPorHT();
            this.lexer.match(10);
            return pAccessNetworkInfo;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("AccessNetworkInfoParser.parse");
            }
        }
    }

    public PAccessNetworkInfoParser(Lexer lexer) {
        super(lexer);
    }
}
