package W;

import A.C0051x;
import E.AbstractC0434s;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.AbstractC0701r0;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import androidx.compose.material3.MinimumInteractiveModifier;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class F3 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f19134Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r0.L f19135Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f19136h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f19137i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C0051x f19138j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ boolean f19139k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ D.m f19140l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ boolean f19141m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f19142n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ float f19143o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19144p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F3(AbstractC4326r abstractC4326r, r0.L l10, long j6, float f6, C0051x c0051x, boolean z10, D.m mVar, boolean z11, AbstractC6216a abstractC6216a, float f10, C3288a c3288a) {
        super(2);
        this.f19134Y = abstractC4326r;
        this.f19135Z = l10;
        this.f19136h0 = j6;
        this.f19137i0 = f6;
        this.f19138j0 = c0051x;
        this.f19139k0 = z10;
        this.f19140l0 = mVar;
        this.f19141m0 = z11;
        this.f19142n0 = abstractC6216a;
        this.f19143o0 = f10;
        this.f19144p0 = c3288a;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        Z.m1 m1Var = AbstractC1617t1.f20423a;
        AbstractC4326r g10 = this.f19134Y.g(MinimumInteractiveModifier.f24779b);
        long d10 = G3.d(this.f19136h0, this.f19137i0, abstractC1725n);
        Z.r rVar2 = (Z.r) abstractC1725n;
        AbstractC4326r c10 = G3.c(g10, this.f19135Z, d10, this.f19138j0, ((Z0.b) rVar2.m(AbstractC0701r0.f7002e)).R(this.f19143o0));
        V.e a5 = V.v.a(false, 0.0f, rVar2, 0, 7);
        AbstractC4326r p02 = M3.H.p0(c10, this.f19139k0, this.f19140l0, a5, this.f19141m0, null, this.f19142n0);
        rVar2.W(733328855);
        E0.N c11 = AbstractC0434s.c(C4310b.f37693Y, true, rVar2);
        rVar2.W(-1323940314);
        int i10 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i11 = androidx.compose.ui.layout.a.i(p02);
        if (rVar2.f22696a instanceof AbstractC1707e) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            U3.f.n0(rVar2, c11, C0583l.f5808f);
            U3.f.n0(rVar2, p10, C0583l.f5807e);
            C0581j c0581j = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i10))) {
                AbstractC6463a.q(i10, rVar2, i10, c0581j);
            }
            AbstractC6463a.r(0, i11, new Z.L0(rVar2), rVar2, 2058660585);
            this.f19144p0.invoke(rVar2, 0);
            rVar2.t(false);
            rVar2.t(true);
            rVar2.t(false);
            rVar2.t(false);
            return jf.y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
