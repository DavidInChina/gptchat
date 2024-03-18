package L;

import A.AbstractC0040r0;
import A.AbstractC0048v0;
import B.C0176x0;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E.AbstractC0441z;
import E.C0420e0;
import E.C0426j;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.AbstractC0701r0;
import I9.C0780s;
import N0.C1046e;
import W.AbstractC1523a1;
import W.AbstractC1577l0;
import W.C1611s0;
import W.C1637x1;
import W.E1;
import W.G3;
import W.I2;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1724m0;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.FillElement;
import cb.C2334C;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import lc.C4385I;
import nf.AbstractC4828h;
import p9.AbstractC5102d;
import p9.C5100b;
import r9.C5389f;
import va.AbstractC6003d;
import va.C6002c;
import wf.AbstractC6216a;
import x9.C6383b;
import y.AbstractC6463a;
import z.C6723s0;

/* loaded from: classes2.dex */
public final class M extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9993Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f9994Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f9995h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f9996i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f9997j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f9998k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i10) {
        super(3);
        this.f9993Y = i10;
        this.f9995h0 = obj;
        this.f9994Z = z10;
        this.f9996i0 = obj2;
        this.f9997j0 = obj3;
        this.f9998k0 = obj4;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z10;
        boolean z11;
        AbstractC4326r i10;
        float f6;
        Object obj4;
        Object obj5;
        jf.y yVar;
        Object obj6;
        int i11;
        Ed.i iVar;
        boolean z12;
        boolean z13;
        boolean z14;
        AbstractC4326r abstractC4326r;
        boolean z15;
        float f10;
        long j6;
        long j10;
        int i12;
        io.sentry.hints.i iVar2 = C1723m.f22654Y;
        jf.y yVar2 = jf.y.f36177a;
        C4323o c4323o = C4323o.f37719b;
        int i13 = this.f9993Y;
        boolean z16 = this.f9994Z;
        Object obj7 = this.f9998k0;
        Object obj8 = this.f9997j0;
        Object obj9 = this.f9996i0;
        Object obj10 = this.f9995h0;
        switch (i13) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue = ((T0.s) obj10).a(intValue);
                }
                if (!booleanValue) {
                    intValue2 = ((T0.s) obj10).a(intValue2);
                }
                if (z16) {
                    T0.z zVar = (T0.z) obj9;
                    long j11 = zVar.f16831b;
                    int i14 = N0.D.f12484c;
                    if (intValue != ((int) (j11 >> 32)) || intValue2 != ((int) (j11 & 4294967295L))) {
                        int min = Math.min(intValue, intValue2);
                        Z z17 = Z.f10085Y;
                        if (min >= 0) {
                            int max = Math.max(intValue, intValue2);
                            C1046e c1046e = zVar.f16830a;
                            if (max <= c1046e.f12512Y.length()) {
                                if (booleanValue || intValue == intValue2) {
                                    z11 = true;
                                    N.t0 t0Var = (N.t0) obj8;
                                    t0Var.o(false);
                                    t0Var.m(z17);
                                } else {
                                    z11 = true;
                                    ((N.t0) obj8).g(true);
                                }
                                ((P0) obj7).f10048t.invoke(new T0.z(c1046e, U3.f.e(intValue, intValue2), (N0.D) null));
                                z10 = z11;
                                return Boolean.valueOf(z10);
                            }
                        }
                        N.t0 t0Var2 = (N.t0) obj8;
                        t0Var2.o(false);
                        t0Var2.m(z17);
                        z10 = false;
                        return Boolean.valueOf(z10);
                    }
                }
                z10 = false;
                return Boolean.valueOf(z10);
            case 1:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$AnimatedVisibility", (y.L) obj);
                AbstractC4326r a5 = io.sentry.compose.b.a("GizmoListItem");
                C1637x1 c02 = L4.a.c0(z16, abstractC1725n);
                C5100b c5100b = (C5100b) obj10;
                Z.r rVar = (Z.r) abstractC1725n;
                AbstractC0040r0 abstractC0040r0 = (AbstractC0040r0) rVar.m(AbstractC0048v0.f314a);
                C0780s c0780s = new C0780s(c5100b, (w9.j) obj7, 0);
                rVar.W(1395006417);
                wf.k kVar = (wf.k) obj9;
                C2334C c2334c = (C2334C) obj8;
                boolean g10 = rVar.g(kVar) | rVar.g(c2334c);
                Object K10 = rVar.K();
                if (g10 || K10 == iVar2) {
                    K10 = new G9.l(2, c2334c, kVar);
                    rVar.h0(K10);
                }
                rVar.t(false);
                i10 = androidx.compose.foundation.a.i(c4323o, c5100b, abstractC0040r0, true, null, null, null, c0780s, null, (AbstractC6216a) K10);
                if (!c2334c.d()) {
                    i10 = androidx.compose.ui.draw.a.a(i10, 0.5f);
                }
                E1.a(R4.b.X(rVar, -1190988883, new G9.n(c2334c, 1)), AbstractC4194d.a((G0.X) a5, i10), null, null, R4.b.X(rVar, -1494343127, new G9.n(c2334c, 2)), null, c02, 0.0f, 0.0f, rVar, 24582, 428);
                return yVar2;
            case 2:
                androidx.compose.foundation.layout.d dVar = (androidx.compose.foundation.layout.d) obj;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue3 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$BoxWithConstraints", dVar);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue3 & 14) == 0) {
                    if (((Z.r) abstractC1725n2).g(dVar)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    intValue3 |= i11;
                }
                if ((intValue3 & 91) == 18) {
                    Z.r rVar2 = (Z.r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar2;
                    }
                }
                Z.r rVar3 = (Z.r) abstractC1725n2;
                Z0.b bVar = (Z0.b) rVar3.m(AbstractC0701r0.f7002e);
                float f11 = ((Configuration) rVar3.m(H0.Z.f6887a)).screenWidthDp;
                long j12 = dVar.f24736b;
                if (Z0.a.d(j12)) {
                    f6 = dVar.f24735a.J(Z0.a.h(j12));
                } else {
                    f6 = Float.POSITIVE_INFINITY;
                }
                float min2 = Math.min(f6 - AbstractC6003d.f47426a, f11 * 0.8f);
                float R10 = bVar.R(min2);
                rVar3.W(1050002087);
                boolean d10 = rVar3.d(R10);
                Object K11 = rVar3.K();
                if (d10 || K11 == iVar2) {
                    C0420e0 c0420e0 = new C0420e0(6, R10);
                    C0176x0 c0176x0 = new C0176x0();
                    c0420e0.invoke(c0176x0);
                    K11 = new B.P0(c0176x0.f1552a);
                    rVar3.h0(K11);
                }
                B.P0 p02 = (B.P0) K11;
                rVar3.t(false);
                B.H h10 = (B.H) obj10;
                boolean isNaN = Float.isNaN(h10.f1088h.h());
                Z.I i15 = h10.f1086f;
                if (!isNaN) {
                    obj4 = p02.a(h10.f1088h.h());
                    if (obj4 == null) {
                        obj4 = i15.getValue();
                    }
                } else {
                    obj4 = i15.getValue();
                }
                if (!AbstractC3557B.K(h10.d(), p02)) {
                    h10.f1091k.setValue(p02);
                    A.F0 f02 = h10.f1083c;
                    Wg.d dVar2 = f02.f67b;
                    Wg.d dVar3 = f02.f67b;
                    boolean f12 = dVar2.f(null);
                    C1724m0 c1724m0 = h10.f1090j;
                    if (f12) {
                        yVar = yVar2;
                        try {
                            B.C c10 = h10.f1092l;
                            obj6 = obj7;
                            float c11 = h10.d().c(obj4);
                            if (!Float.isNaN(c11)) {
                                B.H h11 = c10.f1039a;
                                obj5 = obj8;
                                h11.f1088h.i(c11);
                                h11.f1089i.i(0.0f);
                                c1724m0.setValue(null);
                            } else {
                                obj5 = obj8;
                            }
                            h10.f(obj4);
                            dVar3.g(null);
                        } catch (Throwable th2) {
                            dVar3.g(null);
                            throw th2;
                        }
                    } else {
                        obj5 = obj8;
                        yVar = yVar2;
                        obj6 = obj7;
                    }
                    if (!f12) {
                        c1724m0.setValue(obj4);
                    }
                } else {
                    obj5 = obj8;
                    yVar = yVar2;
                    obj6 = obj7;
                }
                AbstractC4326r m10 = androidx.compose.foundation.layout.e.m(androidx.compose.foundation.layout.e.c(c4323o, 1.0f), min2);
                rVar3.W(1050002394);
                boolean g11 = rVar3.g(h10) | rVar3.d(R10);
                Object K12 = rVar3.K();
                if (g11 || K12 == iVar2) {
                    K12 = new C6723s0(R10, 1, h10);
                    rVar3.h0(K12);
                }
                rVar3.t(false);
                AbstractC4326r q10 = AbstractC4828h.q(androidx.compose.foundation.layout.a.o(m10, (wf.k) K12), h10, z16);
                wf.n nVar = (wf.n) obj9;
                rVar3.W(733328855);
                E0.N c12 = AbstractC0434s.c(C4310b.f37693Y, false, rVar3);
                rVar3.W(-1323940314);
                int i16 = rVar3.P;
                AbstractC1732q0 p10 = rVar3.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i17 = androidx.compose.ui.layout.a.i(q10);
                if (rVar3.f22696a instanceof AbstractC1707e) {
                    rVar3.Z();
                    if (rVar3.f22695O) {
                        rVar3.o(c0582k);
                    } else {
                        rVar3.k0();
                    }
                    U3.f.n0(rVar3, c12, C0583l.f5808f);
                    U3.f.n0(rVar3, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i16))) {
                        AbstractC6463a.q(i16, rVar3, i16, c0581j);
                    }
                    AbstractC6463a.t(rVar3, i17, rVar3, 0, 2058660585);
                    nVar.invoke(rVar3, 0);
                    rVar3.t(false);
                    rVar3.t(true);
                    rVar3.t(false);
                    rVar3.t(false);
                    FillElement fillElement = androidx.compose.foundation.layout.e.f24739c;
                    rVar3.W(1050002797);
                    boolean g12 = rVar3.g(h10);
                    Object K13 = rVar3.K();
                    if (g12 || K13 == iVar2) {
                        K13 = new C6383b(20, h10);
                        rVar3.h0(K13);
                    }
                    rVar3.t(false);
                    G3.a(AbstractC4828h.q(androidx.compose.foundation.layout.a.o(fillElement, (wf.k) K13), h10, z16), null, 0L, 0L, 0.0f, p9.i.f42784c, null, R4.b.X(rVar3, -44078507, new C6002c((wf.n) obj5, h10, R10, (Ng.F) obj6)), rVar3, 12582912, 94);
                    return yVar;
                }
                R4.b.r1();
                throw null;
            case 3:
                AbstractC1725n abstractC1725n3 = (AbstractC1725n) obj2;
                int intValue4 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$TopAppBar", (E.q0) obj);
                AbstractC4326r a10 = io.sentry.compose.b.a("ImagesDialog");
                if ((intValue4 & 81) == 16) {
                    Z.r rVar4 = (Z.r) abstractC1725n3;
                    if (rVar4.B()) {
                        rVar4.P();
                        return yVar2;
                    }
                }
                if (z16) {
                    Z.r rVar5 = (Z.r) abstractC1725n3;
                    rVar5.W(-372030211);
                    I2.b(androidx.compose.foundation.layout.e.j(androidx.compose.foundation.layout.a.t(c4323o, p9.r.f42842f, 0.0f, 2), p9.q.f42831b), 0L, p9.u.f42856a, 0L, 0, rVar5, 0, 26);
                    rVar5.t(false);
                } else {
                    Z.r rVar6 = (Z.r) abstractC1725n3;
                    rVar6.W(-372029827);
                    List list = (List) obj9;
                    H.F f13 = (H.F) obj8;
                    R4.b.o(new ib.i((wf.k) obj10, list, f13, 0), a10, false, null, null, ib.d.f32918c, rVar6, 196608, 30);
                    R4.b.o(new ib.i((wf.k) obj7, list, f13, 1), a10, false, null, null, ib.d.f32919d, rVar6, 196608, 30);
                    rVar6.t(false);
                }
                return yVar2;
            default:
                AbstractC0441z abstractC0441z = (AbstractC0441z) obj;
                AbstractC1725n abstractC1725n4 = (AbstractC1725n) obj2;
                int intValue5 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$ScrollableContentScreen", abstractC0441z);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((intValue5 & 14) == 0) {
                    if (((Z.r) abstractC1725n4).g(abstractC0441z)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    intValue5 |= i12;
                }
                if ((intValue5 & 91) == 18) {
                    Z.r rVar7 = (Z.r) abstractC1725n4;
                    if (rVar7.B()) {
                        rVar7.P();
                        return yVar2;
                    }
                }
                AbstractC4326r a11 = ((E.A) abstractC0441z).a(c4323o, C4310b.f37706s0);
                float f14 = p9.r.f42840d;
                AbstractC4326r n10 = androidx.compose.foundation.layout.e.n(L0.l.a(androidx.compose.foundation.layout.a.v(a11, 0.0f, 0.0f, 0.0f, f14, 7), false, J.a.f8713Y), 0.0f, Id.f.f8553a, 1);
                C0426j g13 = AbstractC0429m.g(f14);
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj10;
                AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) obj9;
                Y.b bVar2 = (Y.b) obj8;
                Id.l lVar = (Id.l) obj7;
                Z.r rVar8 = (Z.r) abstractC1725n4;
                rVar8.W(-483455358);
                E0.N a12 = AbstractC0440y.a(g13, C4310b.f37705r0, rVar8);
                rVar8.W(-1323940314);
                int i18 = rVar8.P;
                AbstractC1732q0 p11 = rVar8.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i19 = androidx.compose.ui.layout.a.i(n10);
                if (rVar8.f22696a instanceof AbstractC1707e) {
                    rVar8.Z();
                    if (rVar8.f22695O) {
                        rVar8.o(c0582k2);
                    } else {
                        rVar8.k0();
                    }
                    U3.f.n0(rVar8, a12, C0583l.f5808f);
                    U3.f.n0(rVar8, p11, C0583l.f5807e);
                    C0581j c0581j2 = C0583l.f5809g;
                    if (rVar8.f22695O || !AbstractC3557B.K(rVar8.K(), Integer.valueOf(i18))) {
                        AbstractC6463a.q(i18, rVar8, i18, c0581j2);
                    }
                    AbstractC6463a.t(rVar8, i19, rVar8, 0, 2058660585);
                    AbstractC4326r a13 = io.sentry.compose.b.a("VoiceModeSettingsScreen");
                    if (!z16 && !((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                        iVar = null;
                    } else {
                        iVar = (Ed.i) abstractC1710f02.getValue();
                    }
                    int i20 = bVar2.f22008a;
                    f8.e eVar = Y.c.f22010Z;
                    if (Float.compare(f8.e.j(i20), f8.e.j(1)) >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    f8.e eVar2 = Y.a.f22003Z;
                    if (Float.compare(f8.e.k(bVar2.f22009b), f8.e.k(1)) < 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z12 && z13) {
                        abstractC4326r = androidx.compose.foundation.layout.e.j(c4323o, 0);
                        z14 = true;
                    } else {
                        z14 = true;
                        abstractC4326r = androidx.compose.foundation.layout.e.l(c4323o, 0.0f, 0.0f, 0.0f, (float) RCHTTPStatusCodes.BAD_REQUEST, 7);
                    }
                    R4.b.y(iVar, lVar.f8560d, AbstractC4194d.a((G0.X) a13, abstractC4326r), rVar8, 0, 0);
                    rVar8.W(-1726966295);
                    for (Ed.i iVar3 : lVar.f8557a) {
                        if (iVar3 == abstractC1710f02.getValue()) {
                            z15 = z14;
                            f10 = 1.0f;
                        } else {
                            f10 = 1.0f;
                            z15 = false;
                        }
                        AbstractC4326r b10 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.e.d(c4323o, f10), AbstractC1577l0.f(rVar8));
                        L0.g gVar = new L0.g(3);
                        rVar8.W(-1550300400);
                        boolean g14 = rVar8.g(iVar3);
                        Object K14 = rVar8.K();
                        if (g14 || K14 == iVar2) {
                            K14 = new C4385I(abstractC1710f0, (Object) abstractC1710f02, (Object) iVar3, 7);
                            rVar8.h0(K14);
                        }
                        rVar8.t(false);
                        AbstractC4326r q02 = M3.H.q0(b10, z15, gVar, (AbstractC6216a) K14, 2);
                        r0.L f15 = AbstractC1577l0.f(rVar8);
                        long j13 = AbstractC5102d.f42767d;
                        rVar8.W(-1589582123);
                        AbstractC1710f0 abstractC1710f03 = abstractC1710f02;
                        long b11 = W.R0.b(j13, rVar8);
                        long j14 = r0.r.f44263k;
                        long b12 = r0.r.b(b11, 0.38f);
                        C1611s0 f16 = AbstractC1523a1.f((W.P0) rVar8.m(W.R0.f19593a));
                        if (j13 == j14) {
                            j13 = f16.f20398a;
                        }
                        long j15 = j13;
                        if (b11 == j14) {
                            b11 = f16.f20399b;
                        }
                        long j16 = b11;
                        if (j14 != j14) {
                            j6 = j14;
                        } else {
                            j6 = f16.f20400c;
                        }
                        if (b12 != j14) {
                            j10 = b12;
                        } else {
                            j10 = f16.f20401d;
                        }
                        C1611s0 c1611s0 = new C1611s0(j15, j16, j6, j10);
                        rVar8.t(false);
                        M3.H.b(q02, f15, c1611s0, null, null, R4.b.X(rVar8, 1225154147, new C5389f(iVar3, z15, 5)), rVar8, 196608, 24);
                        abstractC1710f02 = abstractC1710f03;
                        z14 = true;
                    }
                    AbstractC6463a.v(rVar8, false, false, z14, false);
                    rVar8.t(false);
                    return yVar2;
                }
                R4.b.r1();
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(boolean z10, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(3);
        this.f9993Y = i10;
        this.f9994Z = z10;
        this.f9995h0 = obj;
        this.f9996i0 = obj2;
        this.f9997j0 = obj3;
        this.f9998k0 = obj4;
    }
}
