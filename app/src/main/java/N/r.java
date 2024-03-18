package N;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Y0.h f12403a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12404b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12405c;

    public r(Y0.h hVar, int i10, long j6) {
        this.f12403a = hVar;
        this.f12404b = i10;
        this.f12405c = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f12403a == rVar.f12403a && this.f12404b == rVar.f12404b && this.f12405c == rVar.f12405c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f12405c;
        return (((this.f12403a.hashCode() * 31) + this.f12404b) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f12403a + ", offset=" + this.f12404b + ", selectableId=" + this.f12405c + ')';
    }
}
