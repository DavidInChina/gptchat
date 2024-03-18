package N;

import L.P0;

/* loaded from: classes.dex */
public final class s0 implements AbstractC1028l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t0 f12411a;

    public s0(t0 t0Var) {
        this.f12411a = t0Var;
    }

    @Override // N.AbstractC1028l
    public final boolean a(long j6, AbstractC1038w abstractC1038w) {
        P0 p02;
        t0 t0Var = this.f12411a;
        if (t0Var.j().f16830a.f12512Y.length() == 0 || (p02 = t0Var.f12416d) == null || p02.d() == null) {
            return false;
        }
        t0.b(t0Var, t0Var.j(), j6, false, false, abstractC1038w, false);
        return true;
    }

    @Override // N.AbstractC1028l
    public final boolean b(long j6, C1035t c1035t) {
        P0 p02;
        t0 t0Var = this.f12411a;
        if (t0Var.j().f16830a.f12512Y.length() == 0 || (p02 = t0Var.f12416d) == null || p02.d() == null) {
            return false;
        }
        p0.l lVar = t0Var.f12421i;
        if (lVar != null) {
            lVar.a();
        }
        t0Var.f12423k = j6;
        t0Var.f12428p = -1;
        t0Var.g(true);
        t0.b(t0Var, t0Var.j(), t0Var.f12423k, true, false, c1035t, false);
        return true;
    }

    @Override // N.AbstractC1028l
    public final void c() {
    }
}
