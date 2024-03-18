package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.javax.sip.g;
import c.a0;

/* loaded from: classes2.dex */
public class SubscriptionState extends ParametersHeader implements a0 {
    private static final long serialVersionUID = -6673833053927258745L;
    protected String reasonCode;
    protected String state;
    protected int expires = -1;
    protected int retryAfter = -1;

    public SubscriptionState() {
        super(SIPHeaderNames.SUBSCRIPTION_STATE);
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    public int getExpires() {
        return this.expires;
    }

    public String getReasonCode() {
        return this.reasonCode;
    }

    public int getRetryAfter() {
        return this.retryAfter;
    }

    public String getState() {
        return this.state;
    }

    public void setExpires(int i10) {
        if (i10 >= 0) {
            this.expires = i10;
            return;
        }
        throw new g("JAIN-SIP Exception, SubscriptionState, setExpires(), the expires parameter is  < 0");
    }

    public void setReasonCode(String str) {
        if (str != null) {
            this.reasonCode = str;
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, SubscriptionState, setReasonCode(), the reasonCode parameter is null");
    }

    public void setRetryAfter(int i10) {
        if (i10 > 0) {
            this.retryAfter = i10;
            return;
        }
        throw new g("JAIN-SIP Exception, SubscriptionState, setRetryAfter(), the retryAfter parameter is <=0");
    }

    public void setState(String str) {
        if (str != null) {
            this.state = str;
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, SubscriptionState, setState(), the state parameter is null");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str = this.state;
        if (str != null) {
            sb2.append(str);
        }
        if (this.reasonCode != null) {
            sb2.append(";reason=");
            sb2.append(this.reasonCode);
        }
        if (this.expires != -1) {
            sb2.append(";expires=");
            sb2.append(this.expires);
        }
        if (this.retryAfter != -1) {
            sb2.append(";retry-after=");
            sb2.append(this.retryAfter);
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }
}
