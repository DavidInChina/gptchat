package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.HostNameParser;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Token;
import android.gov.nist.javax.sip.header.Protocol;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.header.ViaList;
import java.text.ParseException;

/* loaded from: classes.dex */
public class ViaParser extends HeaderParser {
    public ViaParser(String str) {
        super(str);
    }

    private void parseVia(Via via) {
        this.lexer.match(4095);
        Token nextToken = this.lexer.getNextToken();
        this.lexer.SPorHT();
        this.lexer.match(47);
        this.lexer.SPorHT();
        this.lexer.match(4095);
        this.lexer.SPorHT();
        Token nextToken2 = this.lexer.getNextToken();
        this.lexer.SPorHT();
        this.lexer.match(47);
        this.lexer.SPorHT();
        this.lexer.match(4095);
        this.lexer.SPorHT();
        Token nextToken3 = this.lexer.getNextToken();
        this.lexer.SPorHT();
        Protocol protocol = new Protocol();
        protocol.setProtocolName(nextToken.getTokenValue());
        protocol.setProtocolVersion(nextToken2.getTokenValue());
        protocol.setTransport(nextToken3.getTokenValue());
        via.setSentProtocol(protocol);
        via.setSentBy(new HostNameParser(getLexer()).hostPort(true));
        this.lexer.SPorHT();
        while (this.lexer.lookAhead(0) == ';') {
            this.lexer.consume(1);
            this.lexer.SPorHT();
            NameValue nameValue = nameValue();
            if (nameValue.getName().equals("branch") && ((String) nameValue.getValueAsObject()) == null) {
                throw new ParseException("null branch Id", this.lexer.getPtr());
            }
            via.setParameter(nameValue);
            this.lexer.SPorHT();
        }
        if (this.lexer.lookAhead(0) == '(') {
            this.lexer.selectLexer("charLexer");
            this.lexer.consume(1);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                char lookAhead = this.lexer.lookAhead(0);
                if (lookAhead == ')') {
                    this.lexer.consume(1);
                    break;
                } else if (lookAhead == '\\') {
                    sb2.append(this.lexer.getNextToken().getTokenValue());
                    this.lexer.consume(1);
                    sb2.append(this.lexer.getNextToken().getTokenValue());
                    this.lexer.consume(1);
                } else if (lookAhead == '\n') {
                    break;
                } else {
                    sb2.append(lookAhead);
                    this.lexer.consume(1);
                }
            }
            via.setComment(sb2.toString());
        }
    }

    @Override // android.gov.nist.core.ParserCore
    public NameValue nameValue() {
        String str;
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("nameValue");
        }
        try {
            this.lexer.match(4095);
            Token nextToken = this.lexer.getNextToken();
            this.lexer.SPorHT();
            try {
                boolean z11 = false;
                if (this.lexer.lookAhead(0) == '=') {
                    this.lexer.consume(1);
                    this.lexer.SPorHT();
                    if (nextToken.getTokenValue().compareToIgnoreCase("received") == 0) {
                        str = this.lexer.byteStringNoSemicolon();
                    } else if (this.lexer.lookAhead(0) == '\"') {
                        str = this.lexer.quotedString();
                        z11 = true;
                    } else {
                        this.lexer.match(4095);
                        str = this.lexer.getNextToken().getTokenValue();
                    }
                    NameValue nameValue = new NameValue(nextToken.getTokenValue().toLowerCase(), str);
                    if (z11) {
                        nameValue.setQuotedValue();
                    }
                    if (z10) {
                        dbg_leave("nameValue");
                    }
                    return nameValue;
                }
                NameValue nameValue2 = new NameValue(nextToken.getTokenValue().toLowerCase(), null);
                if (z10) {
                    dbg_leave("nameValue");
                }
                return nameValue2;
            } catch (ParseException unused) {
                NameValue nameValue3 = new NameValue(nextToken.getTokenValue(), null);
                if (ParserCore.debug) {
                    dbg_leave("nameValue");
                }
                return nameValue3;
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("nameValue");
            }
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("parse");
        }
        try {
            ViaList viaList = new ViaList();
            this.lexer.match(TokenTypes.VIA);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            do {
                Via via = new Via();
                parseVia(via);
                viaList.add((ViaList) via);
                this.lexer.SPorHT();
                if (this.lexer.lookAhead(0) == ',') {
                    this.lexer.consume(1);
                    this.lexer.SPorHT();
                }
            } while (this.lexer.lookAhead(0) != '\n');
            this.lexer.match(10);
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
            return viaList;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
            throw th2;
        }
    }

    public ViaParser(Lexer lexer) {
        super(lexer);
    }
}
