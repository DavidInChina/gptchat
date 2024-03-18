package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkID;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkIDList;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.ParametersParser;
import android.gov.nist.javax.sip.parser.TokenTypes;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PVisitedNetworkIDParser extends ParametersParser implements TokenTypes {
    public PVisitedNetworkIDParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        char lookAhead;
        PVisitedNetworkIDList pVisitedNetworkIDList = new PVisitedNetworkIDList();
        if (ParserCore.debug) {
            dbg_enter("VisitedNetworkIDParser.parse");
        }
        try {
            this.lexer.match(TokenTypes.P_VISITED_NETWORK_ID);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            while (true) {
                PVisitedNetworkID pVisitedNetworkID = new PVisitedNetworkID();
                if (this.lexer.lookAhead(0) == '\"') {
                    parseQuotedString(pVisitedNetworkID);
                } else {
                    parseToken(pVisitedNetworkID);
                }
                pVisitedNetworkIDList.add((PVisitedNetworkIDList) pVisitedNetworkID);
                this.lexer.SPorHT();
                lookAhead = this.lexer.lookAhead(0);
                if (lookAhead != ',') {
                    break;
                }
                this.lexer.match(44);
                this.lexer.SPorHT();
            }
            if (lookAhead == '\n') {
                if (ParserCore.debug) {
                    dbg_leave("VisitedNetworkIDParser.parse");
                }
                return pVisitedNetworkIDList;
            }
            throw createParseException("unexpected char = " + lookAhead);
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("VisitedNetworkIDParser.parse");
            }
            throw th2;
        }
    }

    public void parseQuotedString(PVisitedNetworkID pVisitedNetworkID) {
        boolean z10;
        if (ParserCore.debug) {
            dbg_enter("parseQuotedString");
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            if (this.lexer.lookAhead(0) == '\"') {
                this.lexer.consume(1);
                while (true) {
                    char nextChar = this.lexer.getNextChar();
                    if (nextChar == '\"') {
                        pVisitedNetworkID.setVisitedNetworkID(sb2.toString());
                        super.parse(pVisitedNetworkID);
                        if (z10) {
                            return;
                        }
                        return;
                    } else if (nextChar != 0) {
                        if (nextChar == '\\') {
                            sb2.append(nextChar);
                            sb2.append(this.lexer.getNextChar());
                        } else {
                            sb2.append(nextChar);
                        }
                    } else {
                        throw new ParseException("unexpected EOL", 1);
                    }
                }
            } else {
                throw createParseException("unexpected char");
            }
        } finally {
            if (ParserCore.debug) {
                dbg_leave("parseQuotedString.parse");
            }
        }
    }

    public void parseToken(PVisitedNetworkID pVisitedNetworkID) {
        this.lexer.match(4095);
        pVisitedNetworkID.setVisitedNetworkID(this.lexer.getNextToken());
        super.parse(pVisitedNetworkID);
    }

    public PVisitedNetworkIDParser(Lexer lexer) {
        super(lexer);
    }
}
