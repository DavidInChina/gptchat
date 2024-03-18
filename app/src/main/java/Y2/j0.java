package y2;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: c  reason: collision with root package name */
    public static final j0 f50642c = new j0(0, false);

    /* renamed from: a  reason: collision with root package name */
    public final int f50643a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f50644b;

    public j0(int i10, boolean z10) {
        this.f50643a = i10;
        this.f50644b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f50643a == j0Var.f50643a && this.f50644b == j0Var.f50644b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f50643a << 1) + (this.f50644b ? 1 : 0);
    }
}
