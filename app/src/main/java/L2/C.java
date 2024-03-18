package L2;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: c  reason: collision with root package name */
    public static final C f10519c = new C(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f10520a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10521b;

    public C(long j6, long j10) {
        this.f10520a = j6;
        this.f10521b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c10 = (C) obj;
        if (this.f10520a == c10.f10520a && this.f10521b == c10.f10521b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f10520a) * 31) + ((int) this.f10521b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f10520a);
        sb2.append(", position=");
        return android.gov.nist.core.a.m(sb2, this.f10521b, "]");
    }
}
