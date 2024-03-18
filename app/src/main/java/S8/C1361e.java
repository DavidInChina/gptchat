package S8;

import A.AbstractC0044t0;
import A.a1;
import G0.g0;
import id.AbstractC3557B;
import java.util.List;

/* renamed from: S8.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1361e implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public static final C1361e f16319a = new Object();

    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        AbstractC3557B.c0("$this$Layout", p10);
        AbstractC3557B.c0("measurables", list);
        E0.M m10 = (E0.M) list.get(0);
        int l10 = m10.l(Z0.a.g(j6));
        E0.d0 o10 = ((E0.M) list.get(1)).o(A7.b.o1(-l10, 0, 2, j6));
        int i10 = o10.f4054Z;
        return p10.j0(o10.f4053Y + l10, i10, kf.w.f37484Y, new a1(m10.o(Z0.a.a(j6, 0, l10, i10, i10, 1)), o10, l10));
    }

    @Override // E0.N
    public final /* synthetic */ int b(g0 g0Var, List list, int i10) {
        return AbstractC0044t0.d(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int c(g0 g0Var, List list, int i10) {
        return AbstractC0044t0.f(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int d(g0 g0Var, List list, int i10) {
        return AbstractC0044t0.h(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int e(g0 g0Var, List list, int i10) {
        return AbstractC0044t0.b(this, g0Var, list, i10);
    }
}
