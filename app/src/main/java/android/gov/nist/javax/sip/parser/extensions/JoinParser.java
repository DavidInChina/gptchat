package android.gov.nist.javax.sip.parser.extensions;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.extensions.Join;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.ParametersParser;
import android.gov.nist.javax.sip.parser.TokenTypes;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class JoinParser extends ParametersParser {
    public JoinParser(String str) {
        super(str);
    }

    public static void main(String[] strArr) {
        String[] strArr2 = {"Join: 12345th5z8z\n", "Join: 12345th5z8z;to-tag=tozght6-45;from-tag=fromzght789-337-2\n"};
        for (int i10 = 0; i10 < 2; i10++) {
            Join join = (Join) new JoinParser(strArr2[i10]).parse();
            PrintStream printStream = System.out;
            printStream.println("Parsing => " + strArr2[i10]);
            printStream.print("encoded = " + join.encode() + "==> ");
            printStream.println("callId " + join.getCallId() + " from-tag=" + join.getFromTag() + " to-tag=" + join.getToTag());
        }
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("parse");
        }
        try {
            headerName(TokenTypes.JOIN_TO);
            Join join = new Join();
            this.lexer.SPorHT();
            String byteStringNoSemicolon = this.lexer.byteStringNoSemicolon();
            this.lexer.SPorHT();
            super.parse(join);
            join.setCallId(byteStringNoSemicolon);
            if (z10) {
                dbg_leave("parse");
            }
            return join;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
            throw th2;
        }
    }

    public JoinParser(Lexer lexer) {
        super(lexer);
    }
}
