package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.address.GenericURI;
import b.AbstractC2096f;

/* loaded from: classes.dex */
public class RequestLine extends SIPObject implements SipRequestLine {
    private static final long serialVersionUID = -3286426172326043129L;
    protected String method;
    protected String sipVersion = SIPConstants.SIP_VERSION_STRING;
    protected GenericURI uri;

    public RequestLine() {
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        RequestLine requestLine = (RequestLine) super.clone();
        GenericURI genericURI = this.uri;
        if (genericURI != null) {
            requestLine.uri = (GenericURI) genericURI.clone();
        }
        return requestLine;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        RequestLine requestLine = (RequestLine) obj;
        String str = this.method;
        if (str == null) {
            if (requestLine.method != null) {
                return false;
            }
        } else if (!str.equals(requestLine.method)) {
            return false;
        }
        String str2 = this.sipVersion;
        if (str2 == null) {
            if (requestLine.sipVersion != null) {
                return false;
            }
        } else if (!str2.equals(requestLine.sipVersion)) {
            return false;
        }
        GenericURI genericURI = this.uri;
        if (genericURI == null) {
            if (requestLine.uri != null) {
                return false;
            }
        } else if (!genericURI.equals(requestLine.uri)) {
            return false;
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.header.SipRequestLine
    public String getMethod() {
        return this.method;
    }

    @Override // android.gov.nist.javax.sip.header.SipRequestLine
    public String getSipVersion() {
        return this.sipVersion;
    }

    @Override // android.gov.nist.javax.sip.header.SipRequestLine
    public String getVersionMajor() {
        if (this.sipVersion == null) {
            return null;
        }
        String str = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < this.sipVersion.length() && this.sipVersion.charAt(i10) != '.'; i10++) {
            if (z10) {
                if (str == null) {
                    str = "" + this.sipVersion.charAt(i10);
                } else {
                    StringBuilder p10 = a.p(str);
                    p10.append(this.sipVersion.charAt(i10));
                    str = p10.toString();
                }
            }
            if (this.sipVersion.charAt(i10) == '/') {
                z10 = true;
            }
        }
        return str;
    }

    @Override // android.gov.nist.javax.sip.header.SipRequestLine
    public String getVersionMinor() {
        if (this.sipVersion == null) {
            return null;
        }
        String str = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < this.sipVersion.length(); i10++) {
            if (z10) {
                if (str == null) {
                    str = "" + this.sipVersion.charAt(i10);
                } else {
                    StringBuilder p10 = a.p(str);
                    p10.append(this.sipVersion.charAt(i10));
                    str = p10.toString();
                }
            }
            if (this.sipVersion.charAt(i10) == '.') {
                z10 = true;
            }
        }
        return str;
    }

    @Override // android.gov.nist.javax.sip.header.SipRequestLine
    public void setMethod(String str) {
        this.method = str;
    }

    @Override // android.gov.nist.javax.sip.header.SipRequestLine
    public void setSipVersion(String str) {
        this.sipVersion = str;
    }

    @Override // android.gov.nist.javax.sip.header.SipRequestLine
    public void setUri(AbstractC2096f abstractC2096f) {
        this.uri = (GenericURI) abstractC2096f;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        String str = this.method;
        if (str != null) {
            sb2.append(str);
            sb2.append(Separators.SP);
        }
        GenericURI genericURI = this.uri;
        if (genericURI != null) {
            genericURI.encode(sb2);
            sb2.append(Separators.SP);
        }
        sb2.append(this.sipVersion);
        sb2.append(Separators.NEWLINE);
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.SipRequestLine
    public GenericURI getUri() {
        return this.uri;
    }

    public RequestLine(GenericURI genericURI, String str) {
        this.uri = genericURI;
        this.method = str;
    }
}
