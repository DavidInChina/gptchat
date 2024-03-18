package android.gov.nist.javax.sip.header;

import c.AbstractC2240L;

/* loaded from: classes2.dex */
public class ProxyRequire extends SIPHeader implements AbstractC2240L {
    private static final long serialVersionUID = -3269274234851067893L;
    protected String optionTag;

    public ProxyRequire() {
        super(SIPHeaderNames.PROXY_REQUIRE);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.optionTag);
        return sb2;
    }

    @Override // c.AbstractC2234F
    public String getOptionTag() {
        return this.optionTag;
    }

    public void setOptionTag(String str) {
        if (str != null) {
            this.optionTag = str;
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, ProxyRequire, setOptionTag(), the optionTag parameter is null");
    }

    public ProxyRequire(String str) {
        super(SIPHeaderNames.PROXY_REQUIRE);
        this.optionTag = str;
    }
}
