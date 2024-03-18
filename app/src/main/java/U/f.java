package U;

import A.C0045u;
import E.AbstractC0434s;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.Q;
import L.C0838b;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import Z.l1;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import h.C3280f;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import nf.AbstractC4828h;
import o0.C4876k;
import r0.C5344h;
import r0.E;
import r0.r;
import r0.y;
import y.AbstractC6463a;
import z.AbstractC6657D;
import z.AbstractC6696f;
import z.AbstractC6704j;
import z.C6735y0;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final float f17342a = 40;

    /* renamed from: b  reason: collision with root package name */
    public static final K.e f17343b = K.f.f9317a;

    /* renamed from: c  reason: collision with root package name */
    public static final float f17344c = (float) 7.5d;

    /* renamed from: d  reason: collision with root package name */
    public static final float f17345d = (float) 2.5d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f17346e = 10;

    /* renamed from: f  reason: collision with root package name */
    public static final float f17347f = 5;

    /* renamed from: g  reason: collision with root package name */
    public static final float f17348g = 6;

    /* renamed from: h  reason: collision with root package name */
    public static final C6735y0 f17349h = AbstractC6696f.v(RCHTTPStatusCodes.UNSUCCESSFUL, 0, AbstractC6657D.f51128d, 2);

    public static final void a(boolean z10, n nVar, AbstractC4326r abstractC4326r, long j6, long j10, boolean z11, AbstractC1725n abstractC1725n, int i10, int i11) {
        C4323o c4323o;
        long j11;
        int i12;
        long j12;
        boolean z12;
        float f6;
        r rVar;
        long j13;
        float f10;
        int i13;
        long j14;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(308716636);
        int i14 = i11 & 4;
        C4323o c4323o2 = C4323o.f37719b;
        if (i14 != 0) {
            c4323o = c4323o2;
        } else {
            c4323o = abstractC4326r;
        }
        if ((i11 & 8) != 0) {
            i12 = i10 & (-7169);
            j11 = ((r) ((O.a) rVar2.m(O.c.f13242a)).f13229f.getValue()).f44265a;
        } else {
            j11 = j6;
            i12 = i10;
        }
        if ((i11 & 16) != 0) {
            i12 &= -57345;
            j12 = O.c.a(j11, rVar2);
        } else {
            j12 = j10;
        }
        if ((i11 & 32) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        int i15 = i12 & 14;
        rVar2.W(511388516);
        boolean g10 = rVar2.g(valueOf) | rVar2.g(nVar);
        Object K10 = rVar2.K();
        if (g10 || K10 == C1723m.f22654Y) {
            K10 = AbstractC4828h.E(new C3280f(z10, nVar, 1));
            rVar2.h0(K10);
        }
        rVar2.t(false);
        l1 l1Var = (l1) K10;
        O.f fVar = (O.f) rVar2.m(O.g.f13245a);
        rVar2.W(52228748);
        float f11 = f17348g;
        if (fVar == null) {
            f6 = f11;
            rVar = null;
        } else {
            O.a aVar = (O.a) rVar2.m(O.c.f13242a);
            if (Float.compare(f11, 0) > 0 && !((Boolean) aVar.f13236m.getValue()).booleanValue()) {
                f6 = f11;
                j14 = androidx.compose.ui.graphics.a.k(r.b(O.c.a(j11, rVar2), ((((float) Math.log(1 + f11)) * 4.5f) + 2.0f) / 100.0f), j11);
            } else {
                f6 = f11;
                j14 = j11;
            }
            rVar = new r(j14);
        }
        rVar2.t(false);
        if (rVar != null) {
            j13 = rVar.f44265a;
        } else {
            j13 = j11;
        }
        AbstractC4326r s10 = Q.s(androidx.compose.foundation.layout.e.j(c4323o, f17342a), androidx.compose.ui.graphics.a.l(androidx.compose.ui.draw.a.f(c4323o2, b.f17327h0), new g(nVar, z12)));
        if (((Boolean) l1Var.getValue()).booleanValue()) {
            f10 = f6;
            i13 = 0;
        } else {
            i13 = 0;
            f10 = 0;
        }
        long j15 = y.f44272a;
        Float.compare(f10, i13);
        K.e eVar = f17343b;
        AbstractC4326r d10 = androidx.compose.foundation.a.d(Q.s(s10, androidx.compose.ui.graphics.a.l(c4323o2, new C4876k(f10, eVar, true, j15, j15))), j13, eVar);
        rVar2.W(733328855);
        N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
        rVar2.W(-1323940314);
        int i16 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i17 = androidx.compose.ui.layout.a.i(d10);
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
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i16))) {
                AbstractC6463a.q(i16, rVar2, i16, c0581j);
            }
            AbstractC6463a.r(0, i17, new L0(rVar2), rVar2, 2058660585);
            boolean z13 = z12;
            long j16 = j12;
            A7.b.v(Boolean.valueOf(z10), null, AbstractC6696f.v(100, 0, null, 6), null, R4.b.X(rVar2, 1853731063, new d(j12, nVar)), rVar2, i15 | 24960, 10);
            rVar2.t(false);
            rVar2.t(true);
            rVar2.t(false);
            rVar2.t(false);
            C1741v0 v10 = rVar2.v();
            if (v10 != null) {
                v10.f22739d = new e(z10, nVar, c4323o, j11, j16, z13, i10, i11);
                return;
            }
            return;
        }
        R4.b.r1();
        throw null;
    }

    public static final void b(n nVar, long j6, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-486016981);
        rVar.W(-492369756);
        Object K10 = rVar.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        C5344h c5344h = K10;
        if (K10 == iVar) {
            C5344h g10 = androidx.compose.ui.graphics.a.g();
            g10.e(1);
            rVar.h0(g10);
            c5344h = g10;
        }
        rVar.t(false);
        E e10 = (E) c5344h;
        rVar.W(1157296644);
        boolean g11 = rVar.g(nVar);
        Object K11 = rVar.K();
        if (g11 || K11 == iVar) {
            K11 = AbstractC4828h.E(new c(nVar, 0));
            rVar.h0(K11);
        }
        rVar.t(false);
        androidx.compose.foundation.a.a(L0.l.a(abstractC4326r, false, b.f17326Z), new C0045u(nVar, AbstractC6704j.b(((Number) ((l1) K11).getValue()).floatValue(), f17349h, null, rVar, 48, 28), j6, e10), rVar, 0);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C0838b(nVar, j6, abstractC4326r, i10);
        }
    }
}
