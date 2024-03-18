package android.gov.nist.javax.sip.header;

import c.AbstractC2235G;

/* loaded from: classes2.dex */
public class Organization extends SIPHeader implements AbstractC2235G {
    private static final long serialVersionUID = -2775003113740192712L;
    protected String organization;

    public Organization() {
        super(SIPHeaderNames.ORGANIZATION);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.organization);
        return sb2;
    }

    public String getOrganization() {
        return this.organization;
    }

    public void setOrganization(String str) {
        if (str != null) {
            this.organization = str;
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, Organization, setOrganization(), the organization parameter is null");
    }
}
