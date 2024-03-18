package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeader;
import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PAssertedService extends SIPHeader implements PAssertedServiceHeader, SIPHeaderNamesIms, AbstractC2266v {
    private String subAppIds;
    private String subServiceIds;

    public PAssertedService(String str) {
        super("P-Asserted-Service");
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        return (PAssertedService) super.clone();
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
        if ((obj instanceof PAssertedServiceHeader) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader
    public String getApplicationIdentifiers() {
        if (this.subAppIds.charAt(0) == '.') {
            return this.subAppIds.substring(1).trim();
        }
        return this.subAppIds;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader
    public String getSubserviceIdentifiers() {
        if (this.subServiceIds.charAt(0) == '.') {
            return this.subServiceIds.substring(1).trim();
        }
        return this.subServiceIds;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader
    public void setApplicationIdentifiers(String str) {
        this.subAppIds = str;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader
    public void setSubserviceIdentifiers(String str) {
        this.subServiceIds = str;
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }

    public PAssertedService() {
        super("P-Asserted-Service");
    }
}
