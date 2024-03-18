package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.javax.sip.g;
import c.U;

/* loaded from: classes2.dex */
public class RetryAfter extends ParametersHeader implements U {
    public static final String DURATION = "duration";
    private static final long serialVersionUID = -1029458515616146140L;
    protected String comment;
    protected Integer retryAfter = new Integer(0);

    public RetryAfter() {
        super(SIPHeaderNames.RETRY_AFTER);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        Integer num = this.retryAfter;
        if (num != null) {
            sb2.append(num);
        }
        if (this.comment != null) {
            sb2.append(" (" + this.comment + Separators.RPAREN);
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }

    public String getComment() {
        return this.comment;
    }

    public int getDuration() {
        if (getParameter("duration") == null) {
            return -1;
        }
        return super.getParameterAsInt("duration");
    }

    public int getRetryAfter() {
        return this.retryAfter.intValue();
    }

    public boolean hasComment() {
        if (this.comment != null) {
            return true;
        }
        return false;
    }

    public void removeComment() {
        this.comment = null;
    }

    public void removeDuration() {
        super.removeParameter("duration");
    }

    public void setComment(String str) {
        if (str != null) {
            this.comment = str;
            return;
        }
        throw new NullPointerException("the comment parameter is null");
    }

    public void setDuration(int i10) {
        if (i10 >= 0) {
            setParameter("duration", i10);
            return;
        }
        throw new g("the duration parameter is <0");
    }

    public void setRetryAfter(int i10) {
        if (i10 >= 0) {
            this.retryAfter = Integer.valueOf(i10);
            return;
        }
        throw new g(a.e("invalid parameter ", i10));
    }
}
