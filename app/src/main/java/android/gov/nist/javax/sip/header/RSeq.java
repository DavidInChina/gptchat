package android.gov.nist.javax.sip.header;

import android.gov.nist.core.a;
import android.javax.sip.g;
import c.AbstractC2242N;

/* loaded from: classes2.dex */
public class RSeq extends SIPHeader implements AbstractC2242N {
    private static final long serialVersionUID = 8765762413224043394L;
    protected long sequenceNumber;

    public RSeq() {
        super(SIPHeaderNames.RSEQ);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(Long.toString(this.sequenceNumber));
        return sb2;
    }

    public long getSeqNumber() {
        return this.sequenceNumber;
    }

    public int getSequenceNumber() {
        return (int) this.sequenceNumber;
    }

    public void setSeqNumber(long j6) {
        if (j6 > 0 && j6 <= 2147483648L) {
            this.sequenceNumber = j6;
            return;
        }
        throw new g(a.f("Bad seq number ", j6));
    }

    public void setSequenceNumber(int i10) {
        setSeqNumber(i10);
    }
}
