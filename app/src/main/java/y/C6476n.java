package y;

import A.AbstractC0044t0;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.AbstractC0701r0;
import Mb.C0951e0;
import W.G3;
import W.P0;
import W.R0;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1724m0;
import Z.l1;
import d1.C2568c;
import h0.C3288a;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import wd.EnumC6206t;
import wf.AbstractC6216a;
import z.C6729v0;

/* renamed from: y.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6476n extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50242Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f50243Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f50244h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f50245i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f50246j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f50247k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f50248l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6476n(Object obj, Object obj2, wf.k kVar, Object obj3, Object obj4, Object obj5, int i10) {
        super(2);
        this.f50242Y = i10;
        this.f50244h0 = obj;
        this.f50245i0 = obj2;
        this.f50243Z = kVar;
        this.f50246j0 = obj3;
        this.f50247k0 = obj4;
        this.f50248l0 = obj5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00be, code lost:
        if (id.AbstractC3557B.K(r15.K(), java.lang.Integer.valueOf(r13)) == false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [Z.n, Z.r] */
    /* JADX WARN: Type inference failed for: r13v5, types: [l0.r] */
    /* JADX WARN: Type inference failed for: r2v6, types: [y.v, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(AbstractC1725n abstractC1725n, int i10) {
        e0 e0Var;
        Hb.a aVar;
        C0582k c0582k;
        String str;
        boolean z10;
        int i11;
        Z.r rVar;
        C0581j c0581j;
        C4323o c4323o;
        boolean z11;
        Object obj = C1723m.f22654Y;
        C4323o c4323o2 = C4323o.f37719b;
        int i12 = this.f50242Y;
        wf.k kVar = this.f50243Z;
        Object obj2 = this.f50248l0;
        Object obj3 = this.f50247k0;
        Object obj4 = this.f50246j0;
        Object obj5 = this.f50245i0;
        Object obj6 = this.f50244h0;
        switch (i12) {
            case 0:
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                C6460A c6460a = (C6460A) obj4;
                ?? r02 = (Z.r) abstractC1725n;
                r02.W(-492369756);
                Object K10 = r02.K();
                if (K10 == obj) {
                    K10 = (O) kVar.invoke(c6460a);
                    r02.h0(K10);
                }
                r02.t(false);
                O o10 = (O) K10;
                C6729v0 c6729v0 = (C6729v0) obj6;
                Boolean valueOf = Boolean.valueOf(AbstractC3557B.K(c6729v0.c().c(), obj5));
                r02.W(1157296644);
                boolean g10 = r02.g(valueOf);
                Object K11 = r02.K();
                if (g10 || K11 == obj) {
                    if (AbstractC3557B.K(c6729v0.c().c(), obj5)) {
                        e0Var = e0.f50199b;
                    } else {
                        e0Var = ((O) kVar.invoke(c6460a)).f50135b;
                    }
                    K11 = e0Var;
                    r02.h0(K11);
                }
                r02.t(false);
                e0 e0Var2 = (e0) K11;
                r02.W(-492369756);
                Object K12 = r02.K();
                C1724m0 c1724m0 = c6729v0.f51386c;
                Object obj7 = K12;
                if (K12 == obj) {
                    boolean K13 = AbstractC3557B.K(obj5, c1724m0.getValue());
                    ?? obj8 = new Object();
                    obj8.f50306b = K13;
                    r02.h0(obj8);
                    obj7 = obj8;
                }
                r02.t(false);
                C6483v c6483v = (C6483v) obj7;
                d0 d0Var = o10.f50134a;
                AbstractC4326r g11 = androidx.compose.ui.layout.a.g(c4323o2, new C6471i(0, o10));
                c6483v.f50306b = AbstractC3557B.K(obj5, c1724m0.getValue());
                AbstractC4326r g12 = g11.g(c6483v);
                C6472j c6472j = new C6472j(0, obj5);
                r02.W(664245165);
                boolean g13 = r02.g(e0Var2);
                Object K14 = r02.K();
                if (g13 || K14 == obj) {
                    K14 = new C6473k(0, e0Var2);
                    r02.h0(K14);
                }
                r02.t(false);
                R4.b.d(c6729v0, c6472j, g12, d0Var, e0Var2, (wf.n) K14, R4.b.X(r02, -616195562, new C6475m(c6460a, this.f50245i0, (j0.u) obj3, (wf.p) obj2, 0)), r02, 12582912, 64);
                return;
            default:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Z.r rVar4 = (Z.r) abstractC1725n;
                Z0.l lVar = (Z0.l) rVar4.m(AbstractC0701r0.f7008k);
                E.g0 g0Var = (E.g0) obj6;
                AbstractC4326r g14 = androidx.compose.foundation.layout.a.u(c4323o2, androidx.compose.foundation.layout.a.h(g0Var, lVar), g0Var.d(), androidx.compose.foundation.layout.a.g(g0Var, lVar), p9.r.f42837a).g(androidx.compose.foundation.layout.e.f24739c);
                Tc.f fVar = (Tc.f) obj5;
                l1 l1Var = (l1) obj4;
                Hb.a aVar2 = (Hb.a) obj3;
                C0951e0 c0951e0 = (C0951e0) obj2;
                rVar4.W(-483455358);
                E0.N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar4);
                rVar4.W(-1323940314);
                int i13 = rVar4.P;
                AbstractC1732q0 p10 = rVar4.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i14 = androidx.compose.ui.layout.a.i(g14);
                boolean z12 = rVar4.f22696a instanceof AbstractC1707e;
                if (z12) {
                    rVar4.Z();
                    if (rVar4.f22695O) {
                        rVar4.o(c0582k2);
                    } else {
                        rVar4.k0();
                    }
                    C0581j c0581j2 = C0583l.f5808f;
                    U3.f.n0(rVar4, a5, c0581j2);
                    C0581j c0581j3 = C0583l.f5807e;
                    U3.f.n0(rVar4, p10, c0581j3);
                    C0581j c0581j4 = C0583l.f5809g;
                    if (!rVar4.f22695O) {
                        aVar = aVar2;
                        break;
                    } else {
                        aVar = aVar2;
                    }
                    AbstractC6463a.q(i13, rVar4, i13, c0581j4);
                    AbstractC6463a.t(rVar4, i14, rVar4, 0, 2058660585);
                    E.A a10 = E.A.f3733a;
                    ?? a11 = io.sentry.compose.b.a("LoginScreenContent");
                    rVar4.W(-1947622034);
                    if (fVar.f17056a != EnumC6206t.f48461h0) {
                        rVar4.W(693286680);
                        E0.N a12 = E.p0.a(AbstractC0429m.f3907a, C4310b.f37702o0, rVar4);
                        rVar4.W(-1323940314);
                        int i15 = rVar4.P;
                        AbstractC1732q0 p11 = rVar4.p();
                        C3288a i16 = androidx.compose.ui.layout.a.i(c4323o2);
                        if (z12) {
                            rVar4.Z();
                            z10 = z12;
                            if (rVar4.f22695O) {
                                rVar4.o(c0582k2);
                            } else {
                                rVar4.k0();
                            }
                            U3.f.n0(rVar4, a12, c0581j2);
                            U3.f.n0(rVar4, p11, c0581j3);
                            if (rVar4.f22695O || !AbstractC3557B.K(rVar4.K(), Integer.valueOf(i15))) {
                                AbstractC6463a.q(i15, rVar4, i15, c0581j4);
                            }
                            AbstractC6463a.t(rVar4, i16, rVar4, 0, 2058660585);
                            AbstractC4326r a13 = io.sentry.compose.b.a("LoginScreenContent");
                            rVar4.W(2142415661);
                            boolean g15 = rVar4.g(kVar);
                            Object K15 = rVar4.K();
                            if (g15 || K15 == obj) {
                                K15 = AbstractC6463a.o(5, kVar, rVar4);
                            }
                            rVar4.t(false);
                            c0581j = c0581j3;
                            str = "LoginScreenContent";
                            c0582k = c0582k2;
                            i11 = -1323940314;
                            rVar = rVar4;
                            R4.b.o((AbstractC6216a) K15, a13, false, null, null, R4.b.X(rVar4, 1641907384, new C2568c(l1Var, 5)), rVar, 196608, 30);
                            rVar.W(2142416149);
                            boolean g16 = rVar.g(kVar);
                            Object K16 = rVar.K();
                            if (g16 || K16 == obj) {
                                K16 = AbstractC6463a.o(6, kVar, rVar);
                            }
                            rVar.t(false);
                            R4.b.o((AbstractC6216a) K16, a13, false, null, null, R4.b.X(rVar, -1511437713, new C2568c(l1Var, 6)), rVar, 196608, 30);
                            z11 = false;
                            AbstractC6463a.v(rVar, false, true, false, false);
                            c4323o = c4323o2;
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    } else {
                        z10 = z12;
                        str = "LoginScreenContent";
                        c0581j = c0581j3;
                        c0582k = c0582k2;
                        rVar = rVar4;
                        z11 = false;
                        i11 = -1323940314;
                        c4323o = a11;
                    }
                    rVar.t(z11);
                    AbstractC4326r d10 = androidx.compose.foundation.layout.e.d(AbstractC0044t0.P(a10, c4323o2), 1.0f);
                    rVar.W(733328855);
                    E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, z11, rVar);
                    rVar.W(i11);
                    int i17 = rVar.P;
                    AbstractC1732q0 p12 = rVar.p();
                    C3288a i18 = androidx.compose.ui.layout.a.i(d10);
                    if (z10) {
                        rVar.Z();
                        if (rVar.f22695O) {
                            rVar.o(c0582k);
                        } else {
                            rVar.k0();
                        }
                        U3.f.n0(rVar, c10, c0581j2);
                        U3.f.n0(rVar, p12, c0581j);
                        if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i17))) {
                            AbstractC6463a.q(i17, rVar, i17, c0581j4);
                        }
                        AbstractC6463a.t(rVar, i18, rVar, 0, 2058660585);
                        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
                        AbstractC4326r a14 = io.sentry.compose.b.a(str);
                        x8.W.k(aVar.f7590a, AbstractC4194d.a((G0.X) a14, bVar.a(c4323o2, C4310b.f37697j0)), ((r0.r) l1Var.getValue()).f44265a, ((r0.r) l1Var.getValue()).f44265a, null, rVar, 0, 16);
                        AbstractC6463a.v(rVar, false, true, false, false);
                        C4323o c4323o3 = c4323o;
                        G3.a(c4323o3, p9.p.f42829a, ((P0) rVar.m(R0.f19593a)).f19537u, 0L, 0.0f, 0.0f, null, R4.b.X(rVar, 1725148279, new N.D(c0951e0, kVar, g0Var, 20)), rVar, 12582912, 121);
                        AbstractC6463a.v(rVar, false, true, false, false);
                        return;
                    }
                    R4.b.r1();
                    throw null;
                }
                R4.b.r1();
                throw null;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f50242Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
