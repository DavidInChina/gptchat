package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AlertInfo;
import android.gov.nist.javax.sip.header.AlertInfoList;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderNames;

/* loaded from: classes2.dex */
public class AlertInfoParser extends ParametersParser {
    public AlertInfoParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("AlertInfoParser.parse");
        }
        AlertInfoList alertInfoList = new AlertInfoList();
        try {
            headerName(TokenTypes.ALERT_INFO);
            for (int i10 = 0; this.lexer.lookAhead(0) != '\n' && i10 < 20; i10++) {
                while (true) {
                    AlertInfo alertInfo = new AlertInfo();
                    alertInfo.setHeaderName(SIPHeaderNames.ALERT_INFO);
                    this.lexer.SPorHT();
                    if (this.lexer.lookAhead(0) == '<') {
                        this.lexer.match(60);
                        alertInfo.setAlertInfo(new URLParser((Lexer) this.lexer).uriReference(true));
                        this.lexer.match(62);
                    } else {
                        alertInfo.setAlertInfo(this.lexer.byteStringNoSemicolon());
                    }
                    this.lexer.SPorHT();
                    super.parse(alertInfo);
                    alertInfoList.add((AlertInfoList) alertInfo);
                    if (this.lexer.lookAhead(0) == ',') {
                        this.lexer.match(44);
                    }
                }
            }
            if (ParserCore.debug) {
                dbg_leave("AlertInfoParser.parse");
            }
            return alertInfoList;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("AlertInfoParser.parse");
            }
            throw th2;
        }
    }

    public AlertInfoParser(Lexer lexer) {
        super(lexer);
    }
}
