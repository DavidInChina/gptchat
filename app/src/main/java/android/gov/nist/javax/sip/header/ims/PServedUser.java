package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.javax.sip.g;
import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PServedUser extends AddressParametersHeader implements PServedUserHeader, SIPHeaderNamesIms, AbstractC2266v {
    public PServedUser(AddressImpl addressImpl) {
        super("P-Served-User");
        this.address = addressImpl;
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        return (PServedUser) super.clone();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.address.encode());
        if (this.parameters.containsKey(ParameterNamesIms.REGISTRATION_STATE)) {
            sb2.append(Separators.SEMICOLON);
            sb2.append(ParameterNamesIms.REGISTRATION_STATE);
            sb2.append(Separators.EQUALS);
            sb2.append(getRegistrationState());
        }
        if (this.parameters.containsKey(ParameterNamesIms.SESSION_CASE)) {
            sb2.append(Separators.SEMICOLON);
            sb2.append(ParameterNamesIms.SESSION_CASE);
            sb2.append(Separators.EQUALS);
            sb2.append(getSessionCase());
        }
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj instanceof PServedUser) {
            PServedUserHeader pServedUserHeader = (PServedUserHeader) obj;
            return getAddress().equals(((PServedUser) obj).getAddress());
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PServedUserHeader
    public String getRegistrationState() {
        return getParameter(ParameterNamesIms.REGISTRATION_STATE);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PServedUserHeader
    public String getSessionCase() {
        return getParameter(ParameterNamesIms.SESSION_CASE);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PServedUserHeader
    public void setRegistrationState(String str) {
        if (str != null) {
            if (!str.equals("reg") && !str.equals("unreg")) {
                try {
                    throw new g("Value can be either reg or unreg");
                } catch (g e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            try {
                setParameter(ParameterNamesIms.REGISTRATION_STATE, str);
                return;
            } catch (ParseException e11) {
                e11.printStackTrace();
                return;
            }
        }
        throw new NullPointerException("regstate Parameter value is null");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PServedUserHeader
    public void setSessionCase(String str) {
        if (str != null) {
            if (!str.equals("orig") && !str.equals("term")) {
                try {
                    throw new g("Value can be either orig or term");
                } catch (g e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            try {
                setParameter(ParameterNamesIms.SESSION_CASE, str);
                return;
            } catch (ParseException e11) {
                e11.printStackTrace();
                return;
            }
        }
        throw new NullPointerException("sess-case Parameter value is null");
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }

    public PServedUser() {
        super("P-Served-User");
    }
}
