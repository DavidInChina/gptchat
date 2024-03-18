package android.gov.nist.javax.sip.header;

import c.AbstractC2266v;
import c.X;

/* loaded from: classes.dex */
public class SIPIfMatch extends SIPHeader implements X, AbstractC2266v {
    private static final long serialVersionUID = 3833745477828359730L;
    protected String entityTag;

    public SIPIfMatch() {
        super(SIPHeaderNames.SIP_IF_MATCH);
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
        throw new NullPointerException("JAIN-SIP Exception,SIP-If-Match, setETag(), the etag parameter is null");
    }

    public void setValue(String str) {
        setETag(str);
    }

    public SIPIfMatch(String str) {
        this();
        setETag(str);
    }
}
