package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParametersHeader;
import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PAccessNetworkInfo extends ParametersHeader implements PAccessNetworkInfoHeader, AbstractC2266v {
    private String accessType;
    private Object extendAccessInfo;

    public PAccessNetworkInfo() {
        super("P-Access-Network-Info");
        this.parameters.setSeparator(Separators.SEMICOLON);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        return (PAccessNetworkInfo) super.clone();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        if (getAccessType() != null) {
            sb2.append(getAccessType());
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            sb2.append(Separators.SP);
            sb2 = this.parameters.encode(sb2);
        }
        if (getExtensionAccessInfo() != null) {
            sb2.append("; ");
            sb2.append(getExtensionAccessInfo().toString());
        }
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if ((obj instanceof PAccessNetworkInfoHeader) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader
    public String getAccessType() {
        return this.accessType;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader
    public String getCGI3GPP() {
        return getParameter(ParameterNamesIms.CGI_3GPP);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader
    public String getCI3GPP2() {
        return getParameter(ParameterNamesIms.CI_3GPP2);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader
    public String getDSLLocation() {
        return getParameter(ParameterNamesIms.DSL_LOCATION);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader
    public Object getExtensionAccessInfo() {
        return this.extendAccessInfo;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader
    public String getUtranCellID3GPP() {
        return getParameter(ParameterNamesIms.UTRAN_CELL_ID_3GPP);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader
    public void setAccessType(String str) {
        if (str != null) {
            this.accessType = str;
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Access-Network-Info, setAccessType(), the accessType parameter is null.");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader
    public void setCGI3GPP(String str) {
        if (str != null) {
            setParameter(ParameterNamesIms.CGI_3GPP, str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Access-Network-Info, setCGI3GPP(), the cgi parameter is null.");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader
    public void setCI3GPP2(String str) {
        if (str != null) {
            setParameter(ParameterNamesIms.CI_3GPP2, str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Access-Network-Info, setCI3GPP2(), the ci3Gpp2 parameter is null.");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader
    public void setDSLLocation(String str) {
        if (str != null) {
            setParameter(ParameterNamesIms.DSL_LOCATION, str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Access-Network-Info, setDSLLocation(), the dslLocation parameter is null.");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader
    public void setExtensionAccessInfo(Object obj) {
        if (obj != null) {
            this.extendAccessInfo = obj;
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Access-Network-Info, setExtendAccessInfo(), the extendAccessInfo parameter is null.");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader
    public void setParameter(String str, Object obj) {
        if (!str.equalsIgnoreCase(ParameterNamesIms.CGI_3GPP) && !str.equalsIgnoreCase(ParameterNamesIms.UTRAN_CELL_ID_3GPP) && !str.equalsIgnoreCase(ParameterNamesIms.DSL_LOCATION) && !str.equalsIgnoreCase(ParameterNamesIms.CI_3GPP2)) {
            super.setParameter(str, obj);
            return;
        }
        try {
            super.setQuotedParameter(str, obj.toString());
        } catch (ParseException unused) {
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader
    public void setUtranCellID3GPP(String str) {
        if (str != null) {
            setParameter(ParameterNamesIms.UTRAN_CELL_ID_3GPP, str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Access-Network-Info, setUtranCellID3GPP(), the utranCellID parameter is null.");
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }

    public PAccessNetworkInfo(String str) {
        this();
        setAccessType(str);
    }
}
