package U8;

import A.AbstractC0044t0;
import E0.M;
import E0.N;
import E0.O;
import E0.P;
import E0.d0;
import G0.g0;
import Ng.H;
import Z.AbstractC1710f0;
import id.AbstractC3557B;
import java.util.List;
import kf.w;
import y.D;

/* loaded from: classes2.dex */
public final class c implements N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f17517a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f17518b;

    public c(long j6, AbstractC1710f0 abstractC1710f0) {
        this.f17517a = j6;
        this.f17518b = abstractC1710f0;
    }

    @Override // E0.N
    public final O a(P p10, List list, long j6) {
        Z0.k kVar;
        AbstractC3557B.c0("$this$Layout", p10);
        AbstractC3557B.c0("measurables", list);
        M m10 = (M) kf.t.D2(list);
        w wVar = w.f37484Y;
        if (m10 != null) {
            d0 o10 = m10.o(this.f17517a);
            AbstractC1710f0 abstractC1710f0 = this.f17518b;
            Z0.k kVar2 = (Z0.k) abstractC1710f0.getValue();
            if (kVar2 == null || o10.f4053Y != ((int) (kVar2.f22804a >> 32)) || (kVar = (Z0.k) abstractC1710f0.getValue()) == null || o10.f4054Z != ((int) (4294967295L & kVar.f22804a))) {
                abstractC1710f0.setValue(new Z0.k(H.c(o10.f4053Y, o10.f4054Z)));
            }
            return p10.j0(o10.f4053Y, o10.f4054Z, wVar, new D(o10, 18));
        }
        return p10.j0(0, 0, wVar, b.f17514Z);
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
