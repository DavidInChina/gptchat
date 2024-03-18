package android.gov.nist.javax.sip.address;

import b.AbstractC2096f;
import java.text.ParseException;

/* loaded from: classes2.dex */
public class GenericURI extends NetObject implements AbstractC2096f {
    public static final String ISUB = "isub";
    public static final String PHONE_CONTEXT_TAG = "context-tag";
    public static final String POSTDIAL = "postdial";
    public static final String PROVIDER_TAG = "provider-tag";
    public static final String SIP = "sip";
    public static final String SIPS = "sips";
    public static final String TEL = "tel";
    private static final long serialVersionUID = 3237685256878068790L;
    protected String scheme;
    protected String uriString;

    public GenericURI() {
    }

    @Override // android.gov.nist.core.GenericObject
    public String encode() {
        return this.uriString;
    }

    @Override // android.gov.nist.javax.sip.address.NetObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC2096f) {
            return toString().equalsIgnoreCase(((AbstractC2096f) obj).toString());
        }
        return false;
    }

    @Override // b.AbstractC2096f
    public String getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // b.AbstractC2096f
    public boolean isSipURI() {
        return this instanceof SipUri;
    }

    @Override // android.gov.nist.javax.sip.address.NetObject, b.AbstractC2096f
    public String toString() {
        return encode();
    }

    public GenericURI(String str) {
        try {
            this.uriString = str;
            this.scheme = str.substring(0, str.indexOf(":"));
        } catch (Exception unused) {
            throw new ParseException("GenericURI, Bad URI format", 0);
        }
    }

    @Override // android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        sb2.append(this.uriString);
        return sb2;
    }
}
