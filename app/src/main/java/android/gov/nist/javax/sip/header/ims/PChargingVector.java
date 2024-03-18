package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.n;
import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PChargingVector extends ParametersHeader implements PChargingVectorHeader, SIPHeaderNamesIms, AbstractC2266v {
    public PChargingVector() {
        super("P-Charging-Vector");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        if (getNameValue(ParameterNamesIms.ICID_VALUE) != null) {
            this.parameters.encode(sb2);
        } else {
            try {
                throw new n("icid-value is mandatory");
            } catch (n e10) {
                e10.printStackTrace();
            }
        }
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getICID() {
        return getParameter(ParameterNamesIms.ICID_VALUE);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getICIDGeneratedAt() {
        return getParameter(ParameterNamesIms.ICID_GENERATED_AT);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getOriginatingIOI() {
        return getParameter(ParameterNamesIms.ORIG_IOI);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getTerminatingIOI() {
        return getParameter(ParameterNamesIms.TERM_IOI);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setICID(String str) {
        if (str != null) {
            setParameter(ParameterNamesIms.ICID_VALUE, str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Charging-Vector, setICID(), the icid parameter is null.");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setICIDGeneratedAt(String str) {
        if (str != null) {
            setParameter(ParameterNamesIms.ICID_GENERATED_AT, str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Charging-Vector, setICIDGeneratedAt(), the host parameter is null.");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setOriginatingIOI(String str) {
        if (str != null && str.length() != 0) {
            this.parameters.set(ParameterNamesIms.ORIG_IOI, str);
        } else {
            removeParameter(ParameterNamesIms.ORIG_IOI);
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setTerminatingIOI(String str) {
        if (str != null && str.length() != 0) {
            this.parameters.set(ParameterNamesIms.TERM_IOI, str);
        } else {
            removeParameter(ParameterNamesIms.TERM_IOI);
        }
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }
}
