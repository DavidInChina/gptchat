package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import c.AbstractC2247b;

/* loaded from: classes2.dex */
public final class Accept extends ParametersHeader implements AbstractC2247b {
    private static final long serialVersionUID = -7866187924308658151L;
    protected MediaRange mediaRange;

    public Accept() {
        super(SIPHeaderNames.ACCEPT);
    }

    public boolean allowsAllContentSubTypes() {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null || mediaRange.getSubtype().compareTo(Separators.STAR) != 0) {
            return false;
        }
        return true;
    }

    public boolean allowsAllContentTypes() {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null || mediaRange.type.compareTo(Separators.STAR) != 0) {
            return false;
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        Accept accept = (Accept) super.clone();
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange != null) {
            accept.mediaRange = (MediaRange) mediaRange.clone();
        }
        return accept;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // c.AbstractC2231C
    public String getContentSubType() {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null) {
            return null;
        }
        return mediaRange.getSubtype();
    }

    @Override // c.AbstractC2231C
    public String getContentType() {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null) {
            return null;
        }
        return mediaRange.getType();
    }

    public MediaRange getMediaRange() {
        return this.mediaRange;
    }

    public float getQValue() {
        return getParameterAsFloat("q");
    }

    public boolean hasQValue() {
        return super.hasParameter("q");
    }

    public void removeQValue() {
        super.removeParameter("q");
    }

    public void setContentSubType(String str) {
        if (this.mediaRange == null) {
            this.mediaRange = new MediaRange();
        }
        this.mediaRange.setSubtype(str);
    }

    public void setContentType(String str) {
        if (this.mediaRange == null) {
            this.mediaRange = new MediaRange();
        }
        this.mediaRange.setType(str);
    }

    public void setMediaRange(MediaRange mediaRange) {
        this.mediaRange = mediaRange;
    }

    public void setQValue(float f6) {
        if (f6 == -1.0f) {
            super.removeParameter("q");
        }
        super.setParameter("q", f6);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange != null) {
            mediaRange.encode(sb2);
        }
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null && !nameValueList.isEmpty()) {
            sb2.append(';');
            this.parameters.encode(sb2);
        }
        return sb2;
    }
}
