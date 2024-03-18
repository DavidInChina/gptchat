package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.ReferTo;
import android.gov.nist.javax.sip.header.SIPHeader;
import java.io.PrintStream;

/* loaded from: classes2.dex */
public class ReferToParser extends AddressParametersParser {
    public ReferToParser(String str) {
        super(str);
    }

    public static void main(String[] strArr) {
        String[] strArr2 = {"Refer-To: <sip:dave@denver.example.org?Replaces=12345%40192.168.118.3%3Bto-tag%3D12345%3Bfrom-tag%3D5FFE-3994>\n", "Refer-To: <sip:+1-650-555-2222@ss1.wcom.com;user=phone>;tag=5617\n", "Refer-To: T. A. Watson <sip:watson@bell-telephone.com>\n", "Refer-To: LittleGuy <sip:UserB@there.com>\n", "Refer-To: sip:mranga@120.6.55.9\n", "Refer-To: sip:mranga@129.6.55.9 ; tag=696928473514.129.6.55.9\n"};
        for (int i10 = 0; i10 < 6; i10++) {
            PrintStream printStream = System.out;
            printStream.println("encoded = " + ((ReferTo) new ReferToParser(strArr2[i10]).parse()).encode());
        }
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        headerName(TokenTypes.REFER_TO);
        ReferTo referTo = new ReferTo();
        super.parse((AddressParametersHeader) referTo);
        this.lexer.match(10);
        return referTo;
    }

    public ReferToParser(Lexer lexer) {
        super(lexer);
    }
}
