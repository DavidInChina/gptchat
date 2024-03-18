package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.Organization;
import android.gov.nist.javax.sip.header.SIPHeader;

/* loaded from: classes2.dex */
public class OrganizationParser extends HeaderParser {
    public OrganizationParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("OrganizationParser.parse");
        }
        Organization organization = new Organization();
        try {
            headerName(TokenTypes.ORGANIZATION);
            organization.setOrganization(this.lexer.getRest().trim());
            if (z10) {
                dbg_leave("OrganizationParser.parse");
            }
            return organization;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("OrganizationParser.parse");
            }
            throw th2;
        }
    }

    public OrganizationParser(Lexer lexer) {
        super(lexer);
    }
}
