package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.javax.sip.g;
import c.AbstractC2232D;

/* loaded from: classes.dex */
public class MimeVersion extends SIPHeader implements AbstractC2232D {
    private static final long serialVersionUID = -7951589626435082068L;
    protected int majorVersion;
    protected int minorVersion;

    public MimeVersion() {
        super(SIPHeaderNames.MIME_VERSION);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(Integer.toString(this.majorVersion));
        sb2.append(Separators.DOT);
        sb2.append(Integer.toString(this.minorVersion));
        return sb2;
    }

    public int getMajorVersion() {
        return this.majorVersion;
    }

    public int getMinorVersion() {
        return this.minorVersion;
    }

    public void setMajorVersion(int i10) {
        if (i10 >= 0) {
            this.majorVersion = i10;
            return;
        }
        throw new g("JAIN-SIP Exception, MimeVersion, setMajorVersion(), the majorVersion parameter is null");
    }

    public void setMinorVersion(int i10) {
        if (i10 >= 0) {
            this.minorVersion = i10;
            return;
        }
        throw new g("JAIN-SIP Exception, MimeVersion, setMinorVersion(), the minorVersion parameter is null");
    }
}
