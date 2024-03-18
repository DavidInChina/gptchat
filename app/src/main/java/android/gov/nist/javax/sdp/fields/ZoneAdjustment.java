package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Separators;
import android.gov.nist.core.a;

/* loaded from: classes.dex */
public class ZoneAdjustment extends SDPObject {
    protected TypedTime offset;
    protected String sign;
    protected long time;

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ZoneAdjustment zoneAdjustment = (ZoneAdjustment) super.clone();
        TypedTime typedTime = this.offset;
        if (typedTime != null) {
            zoneAdjustment.offset = (TypedTime) typedTime.clone();
        }
        return zoneAdjustment;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String g10 = a.g(Long.toString(this.time), Separators.SP);
        if (this.sign != null) {
            StringBuilder p10 = a.p(g10);
            p10.append(this.sign);
            g10 = p10.toString();
        }
        StringBuilder p11 = a.p(g10);
        p11.append(this.offset.encode());
        return p11.toString();
    }

    public TypedTime getOffset() {
        return this.offset;
    }

    public long getTime() {
        return this.time;
    }

    public void setOffset(TypedTime typedTime) {
        this.offset = typedTime;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setTime(long j6) {
        this.time = j6;
    }
}
