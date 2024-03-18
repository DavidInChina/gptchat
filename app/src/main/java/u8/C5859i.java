package u8;

/* renamed from: u8.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5859i {

    /* renamed from: a  reason: collision with root package name */
    public final int f46492a;

    /* renamed from: b  reason: collision with root package name */
    public final long f46493b;

    public C5859i(int i10, long j6) {
        this.f46492a = i10;
        this.f46493b = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5859i) {
            C5859i c5859i = (C5859i) obj;
            if (this.f46492a == c5859i.f46492a && this.f46493b == c5859i.f46493b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f46493b;
        return ((int) ((j6 >>> 32) ^ j6)) ^ ((this.f46492a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f46492a);
        sb2.append(", eventTimestamp=");
        return android.gov.nist.core.a.m(sb2, this.f46493b, "}");
    }
}
