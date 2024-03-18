package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.SIPHeader;

/* loaded from: classes2.dex */
public class FromParser extends AddressParametersParser {
    public FromParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        From from = new From();
        headerName(TokenTypes.FROM);
        super.parse((AddressParametersHeader) from);
        this.lexer.match(10);
        return from;
    }

    public FromParser(Lexer lexer) {
        super(lexer);
    }
}
