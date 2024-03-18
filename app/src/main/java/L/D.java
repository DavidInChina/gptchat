package L;

import E0.AbstractC0461u;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import h0.C3288a;
import id.AbstractC3557B;
import l0.C4323o;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ N.t0 f9877Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ P0 f9878Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f9879h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f9880i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f9881j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ T0.z f9882k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ T0.s f9883l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Z0.b f9884m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f9885n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(N.t0 t0Var, P0 p02, boolean z10, boolean z11, wf.k kVar, T0.z zVar, T0.s sVar, Z0.b bVar, int i10) {
        super(2);
        this.f9877Y = t0Var;
        this.f9878Z = p02;
        this.f9879h0 = z10;
        this.f9880i0 = z11;
        this.f9881j0 = kVar;
        this.f9882k0 = zVar;
        this.f9883l0 = sVar;
        this.f9884m0 = bVar;
        this.f9885n0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        C c10 = new C(this.f9878Z, this.f9881j0, this.f9882k0, this.f9883l0, this.f9884m0, this.f9885n0);
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-1323940314);
        C4323o c4323o = C4323o.f37719b;
        int i10 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i11 = androidx.compose.ui.layout.a.i(c4323o);
        if (rVar2.f22696a instanceof AbstractC1707e) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            U3.f.n0(rVar2, c10, C0583l.f5808f);
            U3.f.n0(rVar2, p10, C0583l.f5807e);
            C0581j c0581j = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i10))) {
                AbstractC6463a.q(i10, rVar2, i10, c0581j);
            }
            boolean z10 = false;
            AbstractC6463a.r(0, i11, new Z.L0(rVar2), rVar2, 2058660585);
            AbstractC6463a.u(rVar2, false, true, false);
            P0 p02 = this.f9878Z;
            Z a5 = p02.a();
            Z z11 = Z.f10085Y;
            boolean z12 = this.f9879h0;
            if (a5 != z11 && p02.c() != null) {
                AbstractC0461u c11 = p02.c();
                AbstractC3557B.Z(c11);
                if (c11.i() && z12) {
                    z10 = true;
                }
            }
            N.t0 t0Var = this.f9877Y;
            kotlin.jvm.internal.m.f(t0Var, z10, rVar2, 8);
            if (p02.a() == Z.f10087h0 && !this.f9880i0 && z12) {
                kotlin.jvm.internal.m.e(t0Var, rVar2, 8);
            }
            return jf.y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
