package android.gov.nist.javax.sip.parser.extensions;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.extensions.SessionExpires;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.ParametersParser;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.javax.sip.g;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class SessionExpiresParser extends ParametersParser {
    public SessionExpiresParser(String str) {
        super(str);
    }

    public static void main(String[] strArr) {
        String[] strArr2 = {"Session-Expires: 30\n", "Session-Expires: 45;refresher=uac\n"};
        for (int i10 = 0; i10 < 2; i10++) {
            SessionExpires sessionExpires = (SessionExpires) new SessionExpiresParser(strArr2[i10]).parse();
            PrintStream printStream = System.out;
            printStream.println("encoded = " + sessionExpires.encode());
            printStream.println("\ntime=" + sessionExpires.getExpires());
            if (sessionExpires.getParameter(SessionExpires.REFRESHER) != null) {
                printStream.println("refresher=" + sessionExpires.getParameter(SessionExpires.REFRESHER));
            }
        }
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        SessionExpires sessionExpires = new SessionExpires();
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("parse");
        }
        try {
            headerName(TokenTypes.SESSIONEXPIRES_TO);
            try {
                sessionExpires.setExpires(Integer.parseInt(this.lexer.getNextId()));
                this.lexer.SPorHT();
                super.parse(sessionExpires);
                if (z10) {
                    dbg_leave("parse");
                }
                return sessionExpires;
            } catch (g e10) {
                throw createParseException(e10.getMessage());
            } catch (NumberFormatException unused) {
                throw createParseException("bad integer format");
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
            throw th2;
        }
    }

    public SessionExpiresParser(Lexer lexer) {
        super(lexer);
    }
}
