package android.gov.nist.javax.sip.header;

import android.javax.sip.g;
import c.AbstractC2261p;
import livekit.org.webrtc.WebrtcBuildVersion;

/* loaded from: classes2.dex */
public class ContentLength extends SIPHeader implements AbstractC2261p {
    public static final String NAME_LOWER = SIPHeaderNames.CONTENT_LENGTH.toLowerCase();
    private static final long serialVersionUID = 1187190542411037027L;
    protected int contentLength;

    public ContentLength() {
        super(SIPHeaderNames.CONTENT_LENGTH);
        this.contentLength = -1;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC2261p) || getContentLength() != ((AbstractC2261p) obj).getContentLength()) {
            return false;
        }
        return true;
    }

    @Override // c.AbstractC2261p
    public int getContentLength() {
        return this.contentLength;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        if (obj instanceof ContentLength) {
            return true;
        }
        return false;
    }

    public void setContentLength(int i10) {
        if (i10 >= 0) {
            this.contentLength = i10;
            return;
        }
        throw new g("JAIN-SIP Exception, ContentLength, setContentLength(), the contentLength parameter is <0");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        int i10 = this.contentLength;
        if (i10 < 0) {
            sb2.append(WebrtcBuildVersion.maint_version);
        } else {
            sb2.append(i10);
        }
        return sb2;
    }

    public ContentLength(int i10) {
        super(SIPHeaderNames.CONTENT_LENGTH);
        this.contentLength = i10;
    }
}
