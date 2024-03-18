package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeader;
import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PPreferredService extends SIPHeader implements PPreferredServiceHeader, SIPHeaderNamesIms, AbstractC2266v {
    private String subAppIds;
    private String subServiceIds;

    public PPreferredService(String str) {
        super("P-Preferred-Service");
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        return (PPreferredService) super.clone();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(ParameterNamesIms.SERVICE_ID);
        if (this.subServiceIds != null) {
            sb2.append(ParameterNamesIms.SERVICE_ID_LABEL);
            sb2.append(Separators.DOT);
            sb2.append(getSubserviceIdentifiers());
        } else if (this.subAppIds != null) {
            sb2.append(ParameterNamesIms.APPLICATION_ID_LABEL);
            sb2.append(Separators.DOT);
            sb2.append(getApplicationIdentifiers());
        }
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if ((obj instanceof PPreferredServiceHeader) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader
    public String getApplicationIdentifiers() {
        if (this.subAppIds.charAt(0) == '.') {
            return this.subAppIds.substring(1).trim();
        }
        return this.subAppIds;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader
    public String getSubserviceIdentifiers() {
        if (this.subServiceIds.charAt(0) == '.') {
            return this.subServiceIds.substring(1).trim();
        }
        return this.subServiceIds;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader
    public void setApplicationIdentifiers(String str) {
        this.subAppIds = str;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader
    public void setSubserviceIdentifiers(String str) {
        this.subServiceIds = Separators.DOT.concat(str);
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }

    public PPreferredService() {
        super("P-Preferred-Service");
    }
}
