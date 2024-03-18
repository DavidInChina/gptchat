package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.Server;
import java.text.ParseException;

/* loaded from: classes2.dex */
public class ServerParser extends HeaderParser {
    public ServerParser(String str) {
        super(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[DONT_GENERATE] */
    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("ServerParser.parse");
        }
        Server server = new Server();
        try {
            headerName(TokenTypes.SERVER);
            int i10 = 0;
            if (this.lexer.lookAhead(0) != '\n') {
                while (this.lexer.lookAhead(0) != '\n' && this.lexer.lookAhead(0) != 0) {
                    if (this.lexer.lookAhead(0) == '(') {
                        String comment = this.lexer.comment();
                        server.addProductToken('(' + comment + ')');
                    } else {
                        try {
                            int markInputPosition = this.lexer.markInputPosition();
                            try {
                                String string = this.lexer.getString('/');
                                if (string.charAt(string.length() - 1) == '\n') {
                                    string = string.trim();
                                }
                                server.addProductToken(string);
                            } catch (ParseException unused) {
                                i10 = markInputPosition;
                                this.lexer.rewindInputPosition(i10);
                                server.addProductToken(this.lexer.getRest().trim());
                                return server;
                            }
                        } catch (ParseException unused2) {
                        }
                    }
                }
                return server;
            }
            throw createParseException("empty header");
        } finally {
            if (ParserCore.debug) {
                dbg_leave("ServerParser.parse");
            }
        }
    }

    public ServerParser(Lexer lexer) {
        super(lexer);
    }
}
