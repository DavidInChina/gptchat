package android.gov.nist.javax.sip.header;

import c.AbstractC2251f;

/* loaded from: classes.dex */
public final class Allow extends SIPHeader implements AbstractC2251f {
    private static final long serialVersionUID = -3105079479020693930L;
    protected String method;

    public Allow() {
        super(SIPHeaderNames.ALLOW);
        this.method = "";
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.method);
        return sb2;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String str) {
        if (str != null) {
            this.method = str;
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, Allow, setMethod(), the method parameter is null.");
    }

    public Allow(String str) {
        super(SIPHeaderNames.ALLOW);
        this.method = str;
    }
}
