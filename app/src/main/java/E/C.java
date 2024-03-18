package E;

import q1.AbstractC5260f;

/* loaded from: classes.dex */
public final class C extends r.f {

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC5260f f3758f;

    public C(C0417d c0417d) {
        this.f3758f = c0417d;
    }

    @Override // r.f
    public final int f(int i10, Z0.l lVar, E0.d0 d0Var, int i11) {
        int G10 = d0Var.G(((C0417d) this.f3758f).f3853h);
        if (G10 != Integer.MIN_VALUE) {
            int i12 = i11 - G10;
            if (lVar == Z0.l.f22806Z) {
                return i10 - i12;
            }
            return i12;
        }
        return 0;
    }

    @Override // r.f
    public final Integer h(E0.d0 d0Var) {
        return Integer.valueOf(d0Var.G(((C0417d) this.f3758f).f3853h));
    }
}
