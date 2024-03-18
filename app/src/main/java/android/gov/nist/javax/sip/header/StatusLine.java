package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Match;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.SIPConstants;

/* loaded from: classes.dex */
public final class StatusLine extends SIPObject implements SipStatusLine {
    private static final long serialVersionUID = -4738092215519950414L;
    protected boolean matchStatusClass;
    protected String reasonPhrase = null;
    protected String sipVersion = SIPConstants.SIP_VERSION_STRING;
    protected int statusCode;

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = "SIP/2.0 " + this.statusCode;
        if (this.reasonPhrase != null) {
            StringBuilder r10 = a.r(str, Separators.SP);
            r10.append(this.reasonPhrase);
            str = r10.toString();
        }
        return a.g(str, Separators.NEWLINE);
    }

    @Override // android.gov.nist.javax.sip.header.SipStatusLine
    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    @Override // android.gov.nist.javax.sip.header.SipStatusLine
    public String getSipVersion() {
        return this.sipVersion;
    }

    @Override // android.gov.nist.javax.sip.header.SipStatusLine
    public int getStatusCode() {
        return this.statusCode;
    }

    @Override // android.gov.nist.javax.sip.header.SipStatusLine
    public String getVersionMajor() {
        String str = null;
        if (this.sipVersion == null) {
            return null;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < this.sipVersion.length(); i10++) {
            if (this.sipVersion.charAt(i10) == '.') {
                z10 = false;
            }
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

    @Override // android.gov.nist.javax.sip.header.SipStatusLine
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

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        String str;
        if (!(obj instanceof StatusLine)) {
            return false;
        }
        StatusLine statusLine = (StatusLine) obj;
        Match match = statusLine.matchExpression;
        if (match != null) {
            return match.match(encode());
        }
        String str2 = statusLine.sipVersion;
        if (str2 != null && !str2.equals(this.sipVersion)) {
            return false;
        }
        int i10 = statusLine.statusCode;
        if (i10 != 0) {
            if (this.matchStatusClass) {
                if (Integer.toString(i10).charAt(0) != Integer.toString(this.statusCode).charAt(0)) {
                    return false;
                }
            } else if (this.statusCode != i10) {
                return false;
            }
        }
        String str3 = statusLine.reasonPhrase;
        if (str3 != null && (str = this.reasonPhrase) != str3) {
            return str.equals(str3);
        }
        return true;
    }

    public void setMatchStatusClass(boolean z10) {
        this.matchStatusClass = z10;
    }

    @Override // android.gov.nist.javax.sip.header.SipStatusLine
    public void setReasonPhrase(String str) {
        this.reasonPhrase = str;
    }

    @Override // android.gov.nist.javax.sip.header.SipStatusLine
    public void setSipVersion(String str) {
        this.sipVersion = str;
    }

    @Override // android.gov.nist.javax.sip.header.SipStatusLine
    public void setStatusCode(int i10) {
        this.statusCode = i10;
    }
}
