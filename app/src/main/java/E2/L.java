package E2;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a  reason: collision with root package name */
    public final int f4166a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4167b;

    public L(int i10, boolean z10) {
        this.f4166a = i10;
        this.f4167b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l10 = (L) obj;
        if (this.f4166a == l10.f4166a && this.f4167b == l10.f4167b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4166a * 31) + (this.f4167b ? 1 : 0);
    }
}
