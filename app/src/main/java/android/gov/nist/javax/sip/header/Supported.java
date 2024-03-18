package android.gov.nist.javax.sip.header;

import R.a;
import android.gov.nist.core.Separators;
import c.b0;

/* loaded from: classes.dex */
public class Supported extends SIPHeader implements b0 {
    private static final long serialVersionUID = -7679667592702854542L;
    protected String optionTag;

    public Supported() {
        super(SIPHeaderNames.SUPPORTED);
        this.optionTag = null;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String t10 = a.t(new StringBuilder(), this.headerName, ":");
        if (this.optionTag != null) {
            StringBuilder r10 = android.gov.nist.core.a.r(t10, Separators.SP);
            r10.append(this.optionTag);
            t10 = r10.toString();
        }
        return android.gov.nist.core.a.g(t10, Separators.NEWLINE);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str = this.optionTag;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
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
        throw new NullPointerException("JAIN-SIP Exception, Supported, setOptionTag(), the optionTag parameter is null");
    }

    public Supported(String str) {
        super(SIPHeaderNames.SUPPORTED);
        this.optionTag = str;
    }
}
