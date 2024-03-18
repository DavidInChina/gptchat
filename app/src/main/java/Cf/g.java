package Cf;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: i0  reason: collision with root package name */
    public static final g f3113i0 = new e(1, 0, 1);

    @Override // Cf.e
    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f3106Y == gVar.f3106Y) {
                    if (this.f3107Z == gVar.f3107Z) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // Cf.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f3106Y * 31) + this.f3107Z;
    }

    @Override // Cf.e
    public final boolean isEmpty() {
        if (this.f3106Y > this.f3107Z) {
            return true;
        }
        return false;
    }

    public final boolean s(int i10) {
        if (this.f3106Y <= i10 && i10 <= this.f3107Z) {
            return true;
        }
        return false;
    }

    @Override // Cf.e
    public final String toString() {
        return this.f3106Y + ".." + this.f3107Z;
    }
}
