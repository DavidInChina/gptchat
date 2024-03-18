package android.gov.nist.javax.sdp.parser;

import android.gov.nist.javax.sdp.fields.SDPField;
import android.gov.nist.javax.sdp.fields.SessionNameField;
import java.io.PrintStream;

/* loaded from: classes2.dex */
public class SessionNameFieldParser extends SDPParser {
    public SessionNameFieldParser(String str) {
        this.lexer = new Lexer("charLexer", str);
    }

    public static void main(String[] strArr) {
        String[] strArr2 = {"s=SDP Seminar \n", "s= Session SDP\n"};
        for (int i10 = 0; i10 < 2; i10++) {
            SessionNameField sessionNameField = new SessionNameFieldParser(strArr2[i10]).sessionNameField();
            PrintStream printStream = System.out;
            printStream.println("encoded: " + sessionNameField.encode());
        }
    }

    @Override // android.gov.nist.javax.sdp.parser.SDPParser
    public SDPField parse() {
        return sessionNameField();
    }

    public SessionNameField sessionNameField() {
        String str;
        try {
            this.lexer.match(115);
            this.lexer.SPorHT();
            this.lexer.match(61);
            this.lexer.SPorHT();
            SessionNameField sessionNameField = new SessionNameField();
            String rest = this.lexer.getRest();
            if (rest == null) {
                str = "";
            } else {
                str = rest.trim();
            }
            sessionNameField.setSessionName(str);
            return sessionNameField;
        } catch (Exception unused) {
            throw this.lexer.createParseException();
        }
    }
}
