package android.gov.nist.javax.sip.header;

import c.T;

/* loaded from: classes2.dex */
public class Require extends SIPHeader implements T {
    private static final long serialVersionUID = -3743425404884053281L;
    protected String optionTag;

    public Require() {
        super(SIPHeaderNames.REQUIRE);
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
        throw new NullPointerException("JAIN-SIP Exception, Require, setOptionTag(), the optionTag parameter is null");
    }

    public Require(String str) {
        super(SIPHeaderNames.REQUIRE);
        this.optionTag = str;
    }
}
