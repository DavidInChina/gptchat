package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AcceptLanguage;
import android.gov.nist.javax.sip.header.AcceptLanguageList;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.javax.sip.g;

/* loaded from: classes.dex */
public class AcceptLanguageParser extends HeaderParser {
    public AcceptLanguageParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        AcceptLanguageList acceptLanguageList = new AcceptLanguageList();
        if (ParserCore.debug) {
            dbg_enter("AcceptLanguageParser.parse");
        }
        try {
            headerName(TokenTypes.ACCEPT_LANGUAGE);
            while (true) {
                AcceptLanguage acceptLanguage = new AcceptLanguage();
                this.lexer.SPorHT();
                if (this.lexer.startsId()) {
                    acceptLanguage.setLanguageRange(this.lexer.match(4095).getTokenValue());
                    this.lexer.SPorHT();
                    while (this.lexer.lookAhead(0) == ';') {
                        this.lexer.match(59);
                        this.lexer.SPorHT();
                        this.lexer.match(113);
                        this.lexer.SPorHT();
                        this.lexer.match(61);
                        this.lexer.SPorHT();
                        this.lexer.match(4095);
                        try {
                            acceptLanguage.setQValue(Float.parseFloat(this.lexer.getNextToken().getTokenValue()));
                            this.lexer.SPorHT();
                        } catch (g e10) {
                            throw createParseException(e10.getMessage());
                        } catch (NumberFormatException e11) {
                            throw createParseException(e11.getMessage());
                        }
                    }
                }
                acceptLanguageList.add((AcceptLanguageList) acceptLanguage);
                if (this.lexer.lookAhead(0) != ',') {
                    break;
                }
                this.lexer.match(44);
                this.lexer.SPorHT();
            }
            if (ParserCore.debug) {
                dbg_leave("AcceptLanguageParser.parse");
            }
            return acceptLanguageList;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("AcceptLanguageParser.parse");
            }
            throw th2;
        }
    }

    public AcceptLanguageParser(Lexer lexer) {
        super(lexer);
    }
}
