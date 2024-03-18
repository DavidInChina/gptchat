package android.gov.nist.javax.sip.header;

import c.AbstractC2266v;
import c.W;

/* loaded from: classes.dex */
public class SIPETag extends SIPHeader implements W, AbstractC2266v {
    private static final long serialVersionUID = 3837543366074322107L;
    protected String entityTag;

    public SIPETag() {
        super(SIPHeaderNames.SIP_ETAG);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.entityTag);
        return sb2;
    }

    public String getETag() {
        return this.entityTag;
    }

    public void setETag(String str) {
        if (str != null) {
            this.entityTag = str;
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception,SIP-ETag, setETag(), the etag parameter is null");
    }

    public void setValue(String str) {
        setETag(str);
    }

    public SIPETag(String str) {
        this();
        setETag(str);
    }
}
