package android.gov.nist.javax.sip.address;

import android.gov.nist.core.NameValueList;
import b.AbstractC2095e;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class TelURLImpl extends GenericURI implements AbstractC2095e {
    private static final long serialVersionUID = 5873527320305915954L;
    protected TelephoneNumber telephoneNumber;

    public TelURLImpl() {
        this.scheme = "tel";
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        TelURLImpl telURLImpl = (TelURLImpl) super.clone();
        TelephoneNumber telephoneNumber = this.telephoneNumber;
        if (telephoneNumber != null) {
            telURLImpl.telephoneNumber = (TelephoneNumber) telephoneNumber.clone();
        }
        return telURLImpl;
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    public String getIsdnSubAddress() {
        return this.telephoneNumber.getIsdnSubaddress();
    }

    @Override // c.AbstractC2236H
    public String getParameter(String str) {
        return this.telephoneNumber.getParameter(str);
    }

    @Override // c.AbstractC2236H
    public Iterator<String> getParameterNames() {
        return this.telephoneNumber.getParameterNames();
    }

    public NameValueList getParameters() {
        return this.telephoneNumber.getParameters();
    }

    public String getPhoneContext() {
        return getParameter("phone-context");
    }

    public String getPhoneNumber() {
        return this.telephoneNumber.getPhoneNumber();
    }

    public String getPostDial() {
        return this.telephoneNumber.getPostDial();
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, b.AbstractC2096f
    public String getScheme() {
        return this.scheme;
    }

    public boolean isGlobal() {
        return this.telephoneNumber.isGlobal();
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, b.AbstractC2096f
    public boolean isSipURI() {
        return false;
    }

    @Override // c.AbstractC2236H
    public void removeParameter(String str) {
        this.telephoneNumber.removeParameter(str);
    }

    public void setGlobal(boolean z10) {
        this.telephoneNumber.setGlobal(z10);
    }

    public void setIsdnSubAddress(String str) {
        this.telephoneNumber.setIsdnSubaddress(str);
    }

    @Override // c.AbstractC2236H
    public void setParameter(String str, String str2) {
        this.telephoneNumber.setParameter(str, str2);
    }

    public void setPhoneContext(String str) {
        if (str == null) {
            removeParameter("phone-context");
        } else {
            setParameter("phone-context", str);
        }
    }

    public void setPhoneNumber(String str) {
        this.telephoneNumber.setPhoneNumber(str);
    }

    public void setPostDial(String str) {
        this.telephoneNumber.setPostDial(str);
    }

    public void setTelephoneNumber(TelephoneNumber telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.javax.sip.address.NetObject, b.AbstractC2096f
    public String toString() {
        return this.scheme + ":" + this.telephoneNumber.encode();
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        sb2.append(this.scheme);
        sb2.append(':');
        this.telephoneNumber.encode(sb2);
        return sb2;
    }
}
