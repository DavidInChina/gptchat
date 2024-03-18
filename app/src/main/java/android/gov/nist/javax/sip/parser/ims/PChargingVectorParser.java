package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PChargingVector;
import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.ParametersParser;
import android.gov.nist.javax.sip.parser.TokenTypes;
import java.text.ParseException;

/* loaded from: classes2.dex */
public class PChargingVectorParser extends ParametersParser implements TokenTypes {
    public PChargingVectorParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("parse");
        }
        try {
            headerName(TokenTypes.P_VECTOR_CHARGING);
            PChargingVector pChargingVector = new PChargingVector();
            while (this.lexer.lookAhead(0) != '\n') {
                try {
                    parseParameter(pChargingVector);
                    this.lexer.SPorHT();
                    char lookAhead = this.lexer.lookAhead(0);
                    if (lookAhead == '\n' || lookAhead == 0) {
                        break;
                    }
                    this.lexer.match(59);
                    this.lexer.SPorHT();
                } catch (ParseException e10) {
                    throw e10;
                }
            }
            super.parse(pChargingVector);
            if (pChargingVector.getParameter(ParameterNamesIms.ICID_VALUE) != null) {
                return pChargingVector;
            }
            throw new ParseException("Missing a required Parameter : icid-value", 0);
        } finally {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
        }
    }

    public void parseParameter(PChargingVector pChargingVector) {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("parseParameter");
        }
        try {
            pChargingVector.setParameter(nameValue('='));
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

    public PChargingVectorParser(Lexer lexer) {
        super(lexer);
    }
}
