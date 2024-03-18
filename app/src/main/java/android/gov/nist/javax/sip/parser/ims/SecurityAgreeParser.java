package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeaderList;
import android.gov.nist.javax.sip.header.ims.SecurityAgree;
import android.gov.nist.javax.sip.header.ims.SecurityClient;
import android.gov.nist.javax.sip.header.ims.SecurityClientList;
import android.gov.nist.javax.sip.header.ims.SecurityServer;
import android.gov.nist.javax.sip.header.ims.SecurityServerList;
import android.gov.nist.javax.sip.header.ims.SecurityVerify;
import android.gov.nist.javax.sip.header.ims.SecurityVerifyList;
import android.gov.nist.javax.sip.parser.HeaderParser;
import android.gov.nist.javax.sip.parser.Lexer;

/* loaded from: classes.dex */
public class SecurityAgreeParser extends HeaderParser {
    public SecurityAgreeParser(String str) {
        super(str);
    }

    public SIPHeaderList parse(SecurityAgree securityAgree) {
        SIPHeaderList sIPHeaderList;
        if (securityAgree.getClass().isInstance(new SecurityClient())) {
            sIPHeaderList = new SecurityClientList();
        } else if (securityAgree.getClass().isInstance(new SecurityServer())) {
            sIPHeaderList = new SecurityServerList();
        } else if (securityAgree.getClass().isInstance(new SecurityVerify())) {
            sIPHeaderList = new SecurityVerifyList();
        } else {
            return null;
        }
        this.lexer.SPorHT();
        this.lexer.match(4095);
        securityAgree.setSecurityMechanism(this.lexer.getNextToken().getTokenValue());
        this.lexer.SPorHT();
        char lookAhead = this.lexer.lookAhead(0);
        if (lookAhead == '\n') {
            sIPHeaderList.add((SIPHeaderList) securityAgree);
            return sIPHeaderList;
        }
        if (lookAhead == ';') {
            this.lexer.match(59);
        }
        this.lexer.SPorHT();
        while (this.lexer.lookAhead(0) != '\n') {
            parseParameter(securityAgree);
            this.lexer.SPorHT();
            char lookAhead2 = this.lexer.lookAhead(0);
            if (lookAhead2 == '\n' || lookAhead2 == 0) {
                break;
            }
            if (lookAhead2 == ',') {
                sIPHeaderList.add((SIPHeaderList) securityAgree);
                if (securityAgree.getClass().isInstance(new SecurityClient())) {
                    securityAgree = new SecurityClient();
                } else if (securityAgree.getClass().isInstance(new SecurityServer())) {
                    securityAgree = new SecurityServer();
                } else if (securityAgree.getClass().isInstance(new SecurityVerify())) {
                    securityAgree = new SecurityVerify();
                }
                this.lexer.match(44);
                this.lexer.SPorHT();
                this.lexer.match(4095);
                securityAgree.setSecurityMechanism(this.lexer.getNextToken().getTokenValue());
            }
            this.lexer.SPorHT();
            if (this.lexer.lookAhead(0) == ';') {
                this.lexer.match(59);
            }
            this.lexer.SPorHT();
        }
        sIPHeaderList.add((SIPHeaderList) securityAgree);
        return sIPHeaderList;
    }

    public void parseParameter(SecurityAgree securityAgree) {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("parseParameter");
        }
        try {
            securityAgree.setParameter(nameValue('='));
            if (z10) {
                dbg_leave("parseParameter");
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("parseParameter");
            }
            throw th2;
        }
    }

    public SecurityAgreeParser(Lexer lexer) {
        super(lexer);
    }
}
