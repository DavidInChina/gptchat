package Bg;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class A implements Nf.a, Eg.f {

    /* renamed from: Y  reason: collision with root package name */
    public int f2058Y;

    public abstract A A0(Cg.i iVar);

    public abstract o0 B0();

    public abstract ug.n R();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a5 = (A) obj;
        if (z0() == a5.z0()) {
            if (AbstractC0210c.d(Cg.p.f3146a, B0(), a5.B0())) {
                return true;
            }
        }
        return false;
    }

    @Override // Nf.a
    public final Nf.i getAnnotations() {
        return AbstractC0220m.a(x0());
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f2058Y;
        if (i11 != 0) {
            return i11;
        }
        if (Bi.c.g1(this)) {
            i10 = super.hashCode();
        } else {
            int hashCode = w0().hashCode();
            i10 = (z0() ? 1 : 0) + ((hashCode + (y0().hashCode() * 31)) * 31);
        }
        this.f2058Y = i10;
        return i10;
    }

    public abstract List w0();

    public abstract Q x0();

    public abstract Y y0();

    public abstract boolean z0();
}
