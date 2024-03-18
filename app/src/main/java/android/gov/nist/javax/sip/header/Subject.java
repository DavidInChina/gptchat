package android.gov.nist.javax.sip.header;

import c.Z;

/* loaded from: classes2.dex */
public class Subject extends SIPHeader implements Z {
    private static final long serialVersionUID = -6479220126758862528L;
    protected String subject;

    public Subject() {
        super(SIPHeaderNames.SUBJECT);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str = this.subject;
        if (str != null) {
            sb2.append(str);
            return sb2;
        }
        sb2.append("");
        return sb2;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String str) {
        if (str != null) {
            this.subject = str;
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception,  Subject, setSubject(), the subject parameter is null");
    }
}
