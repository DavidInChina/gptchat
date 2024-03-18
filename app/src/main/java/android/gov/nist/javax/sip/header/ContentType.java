package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import c.AbstractC2262q;

/* loaded from: classes.dex */
public class ContentType extends ParametersHeader implements AbstractC2262q {
    private static final long serialVersionUID = 8475682204373446610L;
    protected MediaRange mediaRange;

    public ContentType() {
        super(SIPHeaderNames.CONTENT_TYPE);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        ContentType contentType = (ContentType) super.clone();
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange != null) {
            contentType.mediaRange = (MediaRange) mediaRange.clone();
        }
        return contentType;
    }

    public int compareMediaRange(String str) {
        return (this.mediaRange.type + Separators.SLASH + this.mediaRange.subtype).compareToIgnoreCase(str);
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC2262q)) {
            return false;
        }
        AbstractC2262q abstractC2262q = (AbstractC2262q) obj;
        if (!getContentType().equalsIgnoreCase(abstractC2262q.getContentType()) || !getContentSubType().equalsIgnoreCase(abstractC2262q.getContentSubType()) || !equalParameters(abstractC2262q)) {
            return false;
        }
        return true;
    }

    public String getCharset() {
        return getParameter("charset");
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

    public String getMediaSubType() {
        return this.mediaRange.subtype;
    }

    public String getMediaType() {
        return this.mediaRange.type;
    }

    public void setContentSubType(String str) {
        if (str != null) {
            if (this.mediaRange == null) {
                this.mediaRange = new MediaRange();
            }
            this.mediaRange.setSubtype(str);
            return;
        }
        throw new NullPointerException("null arg");
    }

    public void setContentType(String str, String str2) {
        if (this.mediaRange == null) {
            this.mediaRange = new MediaRange();
        }
        this.mediaRange.setType(str);
        this.mediaRange.setSubtype(str2);
    }

    public void setMediaRange(MediaRange mediaRange) {
        this.mediaRange = mediaRange;
    }

    public ContentType(String str, String str2) {
        this();
        setContentType(str, str2);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        this.mediaRange.encode(sb2);
        if (hasParameters()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }

    public void setContentType(String str) {
        if (str != null) {
            if (this.mediaRange == null) {
                this.mediaRange = new MediaRange();
            }
            this.mediaRange.setType(str);
            return;
        }
        throw new NullPointerException("null arg");
    }
}
