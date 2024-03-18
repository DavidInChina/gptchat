package android.gov.nist.javax.sip.parser.extensions;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.extensions.Replaces;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.ParametersParser;
import android.gov.nist.javax.sip.parser.TokenTypes;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class ReplacesParser extends ParametersParser {
    public ReplacesParser(String str) {
        super(str);
    }

    public static void main(String[] strArr) {
        String[] strArr2 = {"Replaces: 12345th5z8z\n", "Replaces: 12345th5z8z;to-tag=tozght6-45;from-tag=fromzght789-337-2\n"};
        for (int i10 = 0; i10 < 2; i10++) {
            Replaces replaces = (Replaces) new ReplacesParser(strArr2[i10]).parse();
            PrintStream printStream = System.out;
            printStream.println("Parsing => " + strArr2[i10]);
            printStream.print("encoded = " + replaces.encode() + "==> ");
            printStream.println("callId " + replaces.getCallId() + " from-tag=" + replaces.getFromTag() + " to-tag=" + replaces.getToTag());
        }
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("parse");
        }
        try {
            headerName(TokenTypes.REPLACES_TO);
            Replaces replaces = new Replaces();
            this.lexer.SPorHT();
            String byteStringNoSemicolon = this.lexer.byteStringNoSemicolon();
            this.lexer.SPorHT();
            super.parse(replaces);
            replaces.setCallId(byteStringNoSemicolon);
            if (z10) {
                dbg_leave("parse");
            }
            return replaces;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
            throw th2;
        }
    }

    public ReplacesParser(Lexer lexer) {
        super(lexer);
    }
}
