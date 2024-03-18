package android.gov.nist.javax.sip.header;

import c.AbstractC2259n;

/* loaded from: classes2.dex */
public class ContentEncoding extends SIPHeader implements AbstractC2259n {
    private static final long serialVersionUID = 2034230276579558857L;
    protected String contentEncoding;

    public ContentEncoding() {
        super(SIPHeaderNames.CONTENT_ENCODING);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.contentEncoding);
        return sb2;
    }

    public String getEncoding() {
        return this.contentEncoding;
    }

    public void setEncoding(String str) {
        if (str != null) {
            this.contentEncoding = str;
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception,  encoding is null");
    }

    public ContentEncoding(String str) {
        super(SIPHeaderNames.CONTENT_ENCODING);
        this.contentEncoding = str;
    }
}
