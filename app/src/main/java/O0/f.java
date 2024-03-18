package O0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f13277a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13278b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13279c;

    public f(int i10, int i11, boolean z10) {
        this.f13277a = i10;
        this.f13278b = i11;
        this.f13279c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f13277a == fVar.f13277a && this.f13278b == fVar.f13278b && this.f13279c == fVar.f13279c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = ((this.f13277a * 31) + this.f13278b) * 31;
        if (this.f13279c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return i11 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BidiRun(start=");
        sb2.append(this.f13277a);
        sb2.append(", end=");
        sb2.append(this.f13278b);
        sb2.append(", isRtl=");
        return AbstractC6463a.l(sb2, this.f13279c, ')');
    }
}
