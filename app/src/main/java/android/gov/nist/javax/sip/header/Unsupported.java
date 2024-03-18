package android.gov.nist.javax.sip.header;

import c.e0;

/* loaded from: classes.dex */
public class Unsupported extends SIPHeader implements e0 {
    private static final long serialVersionUID = -2479414149440236199L;
    protected String optionTag;

    public Unsupported() {
        super(SIPHeaderNames.UNSUPPORTED);
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
        throw new NullPointerException("JAIN-SIP Exception,  Unsupported, setOptionTag(), The option tag parameter is null");
    }

    public Unsupported(String str) {
        super(SIPHeaderNames.UNSUPPORTED);
        this.optionTag = str;
    }
}
