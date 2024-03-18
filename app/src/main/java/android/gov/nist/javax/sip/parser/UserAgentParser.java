package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.UserAgent;
import java.io.PrintStream;

/* loaded from: classes2.dex */
public class UserAgentParser extends HeaderParser {
    public UserAgentParser(String str) {
        super(str);
    }

    public static void main(String[] strArr) {
        String[] strArr2 = {"User-Agent: Softphone/Beta1.5 \n", "User-Agent:Nist/Beta1 (beta version) \n", "User-Agent: Nist UA (beta version)\n", "User-Agent: Nist1.0/Beta2 Ubi/vers.1.0 (very cool) \n", "User-Agent: SJphone/1.60.299a/L (SJ Labs)\n", "User-Agent: sipXecs/3.5.11 sipXecs/sipxbridge (Linux)\n"};
        for (int i10 = 0; i10 < 6; i10++) {
            PrintStream printStream = System.out;
            printStream.println("encoded = " + ((UserAgent) new UserAgentParser(strArr2[i10]).parse()).encode());
        }
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("UserAgentParser.parse");
        }
        UserAgent userAgent = new UserAgent();
        try {
            headerName(TokenTypes.USER_AGENT);
            if (this.lexer.lookAhead(0) != '\n') {
                while (this.lexer.lookAhead(0) != '\n' && this.lexer.lookAhead(0) != 0) {
                    if (this.lexer.lookAhead(0) == '(') {
                        String comment = this.lexer.comment();
                        userAgent.addProductToken('(' + comment + ')');
                    } else {
                        getLexer().SPorHT();
                        String byteStringNoSlash = this.lexer.byteStringNoSlash();
                        if (byteStringNoSlash != null) {
                            StringBuilder sb2 = new StringBuilder(byteStringNoSlash);
                            if (this.lexer.peekNextToken().getTokenType() == 47) {
                                this.lexer.match(47);
                                getLexer().SPorHT();
                                String byteStringNoSlash2 = this.lexer.byteStringNoSlash();
                                if (byteStringNoSlash2 != null) {
                                    sb2.append(Separators.SLASH);
                                    sb2.append(byteStringNoSlash2);
                                } else {
                                    throw createParseException("Expected product version");
                                }
                            }
                            userAgent.addProductToken(sb2.toString());
                        } else {
                            throw createParseException("Expected product string");
                        }
                    }
                    this.lexer.SPorHT();
                }
                if (ParserCore.debug) {
                    dbg_leave("UserAgentParser.parse");
                }
                return userAgent;
            }
            throw createParseException("empty header");
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("UserAgentParser.parse");
            }
            throw th2;
        }
    }

    public UserAgentParser(Lexer lexer) {
        super(lexer);
    }
}
