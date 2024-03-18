package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.Subject;

/* loaded from: classes2.dex */
public class SubjectParser extends HeaderParser {
    public SubjectParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        Subject subject = new Subject();
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("SubjectParser.parse");
        }
        try {
            headerName(TokenTypes.SUBJECT);
            subject.setSubject(this.lexer.getRest().trim());
            if (z10) {
                dbg_leave("SubjectParser.parse");
            }
            return subject;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("SubjectParser.parse");
            }
            throw th2;
        }
    }

    public SubjectParser(Lexer lexer) {
        super(lexer);
    }
}
