package android.gov.nist.javax.sip.header;

import c.AbstractC2250e;

/* loaded from: classes2.dex */
public final class AllowEvents extends SIPHeader implements AbstractC2250e {
    private static final long serialVersionUID = 617962431813193114L;
    protected String eventType;

    public AllowEvents() {
        super(SIPHeaderNames.ALLOW_EVENTS);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.eventType);
        return sb2;
    }

    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String str) {
        if (str != null) {
            this.eventType = str;
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception,AllowEvents, setEventType(), the eventType parameter is null");
    }

    public AllowEvents(String str) {
        super(SIPHeaderNames.ALLOW_EVENTS);
        this.eventType = str;
    }
}
