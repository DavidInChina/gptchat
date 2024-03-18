package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PChargingFunctionAddresses;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.ParametersParser;
import android.gov.nist.javax.sip.parser.TokenTypes;
import java.io.PrintStream;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PChargingFunctionAddressesParser extends ParametersParser implements TokenTypes {
    public PChargingFunctionAddressesParser(String str) {
        super(str);
    }

    public static void main(String[] strArr) {
        String[] strArr2 = {"P-Charging-Function-Addresses: ccf=\"test str\"; ecf=token\n", "P-Charging-Function-Addresses: ccf=192.1.1.1; ccf=192.1.1.2; ecf=192.1.1.3; ecf=192.1.1.4\n", "P-Charging-Function-Addresses: ccf=[5555::b99:c88:d77:e66]; ccf=[5555::a55:b44:c33:d22]; ecf=[5555::1ff:2ee:3dd:4cc]; ecf=[5555::6aa:7bb:8cc:9dd]\n"};
        for (int i10 = 0; i10 < 3; i10++) {
            PChargingFunctionAddressesParser pChargingFunctionAddressesParser = new PChargingFunctionAddressesParser(strArr2[i10]);
            PrintStream printStream = System.out;
            printStream.println("original = " + strArr2[i10]);
            printStream.println("encoded = " + ((PChargingFunctionAddresses) pChargingFunctionAddressesParser.parse()).encode());
        }
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("parse");
        }
        try {
            headerName(TokenTypes.P_CHARGING_FUNCTION_ADDRESSES);
            PChargingFunctionAddresses pChargingFunctionAddresses = new PChargingFunctionAddresses();
            while (this.lexer.lookAhead(0) != '\n') {
                try {
                    parseParameter(pChargingFunctionAddresses);
                    this.lexer.SPorHT();
                    char lookAhead = this.lexer.lookAhead(0);
                    if (lookAhead == '\n' || lookAhead == 0) {
                        break;
                    }
                    this.lexer.match(59);
                    this.lexer.SPorHT();
                } catch (ParseException e10) {
                    throw e10;
                }
            }
            super.parse(pChargingFunctionAddresses);
            return pChargingFunctionAddresses;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
        }
    }

    public void parseParameter(PChargingFunctionAddresses pChargingFunctionAddresses) {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("parseParameter");
        }
        try {
            pChargingFunctionAddresses.setMultiParameter(nameValue('='));
            if (z10) {
                dbg_leave("parseParameter");
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("parseParameter");
            }
            throw th2;
        }
    }

    public PChargingFunctionAddressesParser(Lexer lexer) {
        super(lexer);
    }
}
