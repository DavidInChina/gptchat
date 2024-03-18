package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.javax.sip.g;
import c.AbstractC2241M;

/* loaded from: classes.dex */
public class RAck extends SIPHeader implements AbstractC2241M {
    private static final long serialVersionUID = 743999286077404118L;
    protected long cSeqNumber;
    protected String method;
    protected long rSeqNumber;

    public RAck() {
        super(SIPHeaderNames.RACK);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.rSeqNumber);
        sb2.append(Separators.SP);
        sb2.append(this.cSeqNumber);
        sb2.append(Separators.SP);
        sb2.append(this.method);
        return sb2;
    }

    public int getCSeqNumber() {
        return (int) this.cSeqNumber;
    }

    public long getCSeqNumberLong() {
        return this.cSeqNumber;
    }

    public long getCSequenceNumber() {
        return this.cSeqNumber;
    }

    public String getMethod() {
        return this.method;
    }

    public int getRSeqNumber() {
        return (int) this.rSeqNumber;
    }

    public long getRSequenceNumber() {
        return this.rSeqNumber;
    }

    public void setCSeqNumber(int i10) {
        setCSequenceNumber(i10);
    }

    public void setCSequenceNumber(long j6) {
        if (j6 > 0 && j6 <= 2147483648L) {
            this.cSeqNumber = j6;
            return;
        }
        throw new g(a.f("Bad CSeq # ", j6));
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setRSeqNumber(int i10) {
        setRSequenceNumber(i10);
    }

    public void setRSequenceNumber(long j6) {
        if (j6 > 0 && this.cSeqNumber <= 2147483648L) {
            this.rSeqNumber = j6;
            return;
        }
        throw new g(a.f("Bad rSeq # ", j6));
    }
}
