package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.javax.sip.g;
import c.AbstractC2254i;

/* loaded from: classes2.dex */
public class CSeq extends SIPHeader implements AbstractC2254i {
    private static final long serialVersionUID = -5405798080040422910L;
    protected String method;
    protected Long seqno;

    public CSeq() {
        super(SIPHeaderNames.CSEQ);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return this.headerName + ": " + encodeBody() + Separators.NEWLINE;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC2254i)) {
            return false;
        }
        AbstractC2254i abstractC2254i = (AbstractC2254i) obj;
        if (getSeqNumber() != abstractC2254i.getSeqNumber() || !getMethod().equals(abstractC2254i.getMethod())) {
            return false;
        }
        return true;
    }

    @Override // c.AbstractC2254i
    public String getMethod() {
        return this.method;
    }

    @Override // c.AbstractC2254i
    public long getSeqNumber() {
        return this.seqno.longValue();
    }

    public int getSequenceNumber() {
        Long l10 = this.seqno;
        if (l10 == null) {
            return 0;
        }
        return l10.intValue();
    }

    @Override // c.AbstractC2254i
    public void setMethod(String str) {
        if (str != null) {
            this.method = SIPRequest.getCannonicalName(str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, CSeq, setMethod(), the meth parameter is null");
    }

    @Override // c.AbstractC2254i
    public void setSeqNumber(long j6) {
        if (j6 >= 0) {
            if (j6 <= 2147483648L) {
                this.seqno = Long.valueOf(j6);
                return;
            }
            throw new g(a.f("JAIN-SIP Exception, CSeq, setSequenceNumber(), the sequence number parameter is too large : ", j6));
        }
        throw new g(a.f("JAIN-SIP Exception, CSeq, setSequenceNumber(), the sequence number parameter is < 0 : ", j6));
    }

    public void setSequenceNumber(int i10) {
        setSeqNumber(i10);
    }

    public CSeq(long j6, String str) {
        this();
        this.seqno = Long.valueOf(j6);
        this.method = SIPRequest.getCannonicalName(str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.seqno);
        sb2.append(Separators.SP);
        sb2.append(this.method.toUpperCase());
        return sb2;
    }
}
