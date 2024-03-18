package Z1;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f23123a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23124b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23125c;

    public x0(q0 q0Var, boolean z10, boolean z11) {
        this.f23123a = q0Var;
        this.f23124b = z10;
        this.f23125c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f23123a == x0Var.f23123a && this.f23124b == x0Var.f23124b && this.f23125c == x0Var.f23125c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f23123a.hashCode() * 31;
        int i10 = 1;
        boolean z10 = this.f23124b;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = (hashCode + i11) * 31;
        boolean z11 = this.f23125c;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return i13 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RowColumnChildSelector(type=");
        sb2.append(this.f23123a);
        sb2.append(", expandWidth=");
        sb2.append(this.f23124b);
        sb2.append(", expandHeight=");
        return AbstractC6463a.l(sb2, this.f23125c, ')');
    }
}
