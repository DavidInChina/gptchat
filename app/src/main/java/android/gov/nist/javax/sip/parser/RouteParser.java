package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.Route;
import android.gov.nist.javax.sip.header.RouteList;
import android.gov.nist.javax.sip.header.SIPHeader;

/* loaded from: classes.dex */
public class RouteParser extends AddressParametersParser {
    public RouteParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        char lookAhead;
        RouteList routeList = new RouteList();
        if (ParserCore.debug) {
            dbg_enter("parse");
        }
        try {
            this.lexer.match(TokenTypes.ROUTE);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            while (true) {
                Route route = new Route();
                super.parse((AddressParametersHeader) route);
                routeList.add((RouteList) route);
                this.lexer.SPorHT();
                lookAhead = this.lexer.lookAhead(0);
                if (lookAhead != ',') {
                    break;
                }
                this.lexer.match(44);
                this.lexer.SPorHT();
            }
            if (lookAhead == '\n') {
                return routeList;
            }
            throw createParseException("unexpected char");
        } finally {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
        }
    }

    public RouteParser(Lexer lexer) {
        super(lexer);
    }
}
