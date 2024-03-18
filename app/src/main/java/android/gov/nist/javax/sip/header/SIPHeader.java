package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import c.AbstractC2268x;

/* loaded from: classes.dex */
public abstract class SIPHeader extends SIPObject implements SIPHeaderNames, AbstractC2268x, HeaderExt {
    protected String headerName;

    public SIPHeader(String str) {
        this.headerName = str.intern();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    public abstract StringBuilder encodeBody(StringBuilder sb2);

    public String getHeaderName() {
        return this.headerName;
    }

    public String getHeaderValue() {
        return encodeBody(new StringBuilder()).toString();
    }

    public String getName() {
        return this.headerName;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderExt
    public String getValue() {
        return getHeaderValue();
    }

    public int hashCode() {
        return this.headerName.hashCode();
    }

    public boolean isHeaderList() {
        return false;
    }

    public void setHeaderName(String str) {
        this.headerName = str;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, c.AbstractC2268x
    public final String toString() {
        return encode();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        sb2.append(this.headerName);
        sb2.append(":");
        sb2.append(Separators.SP);
        encodeBody(sb2);
        sb2.append(Separators.NEWLINE);
        return sb2;
    }

    public SIPHeader() {
    }
}
