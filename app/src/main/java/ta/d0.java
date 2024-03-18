package ta;

import E.AbstractC0429m;
import E.AbstractC0440y;
import E.C0424h;
import E.p0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import L.C0863n0;
import L.C0865o0;
import W.G3;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.L0;
import androidx.compose.foundation.layout.LayoutWeightElement;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class d0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45926Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ T0.z f45927Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f45928h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f45929i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f45930j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ boolean f45931k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i10, T0.z zVar, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, wf.k kVar, boolean z10) {
        super(2);
        this.f45926Y = i10;
        this.f45927Z = zVar;
        this.f45928h0 = kVar;
        this.f45929i0 = abstractC6216a;
        this.f45930j0 = abstractC6216a2;
        this.f45931k0 = z10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        switch (this.f45926Y) {
            case 0:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                float f6 = p9.r.f42841e;
                AbstractC4326r v10 = androidx.compose.foundation.layout.a.v(c4323o, 0.0f, 0.0f, 0.0f, f6, 7);
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(693286680);
                E0.N a5 = p0.a(AbstractC0429m.f3907a, C4310b.f37702o0, rVar2);
                rVar2.W(-1323940314);
                int i11 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i12 = androidx.compose.ui.layout.a.i(v10);
                boolean z10 = rVar2.f22696a instanceof AbstractC1707e;
                if (z10) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    C0581j c0581j = C0583l.f5808f;
                    U3.f.n0(rVar2, a5, c0581j);
                    C0581j c0581j2 = C0583l.f5807e;
                    U3.f.n0(rVar2, p10, c0581j2);
                    C0581j c0581j3 = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i11))) {
                        AbstractC6463a.q(i11, rVar2, i11, c0581j3);
                    }
                    i12.invoke(new L0(rVar2), rVar2, 0);
                    rVar2.W(2058660585);
                    u9.b C02 = r9.y.C0();
                    AbstractC6216a abstractC6216a = this.f45929i0;
                    F.s sVar = new F.s(C02, abstractC6216a, this.f45930j0, 14);
                    rVar2.W(133782668);
                    Object K10 = rVar2.K();
                    io.sentry.hints.i iVar = C1723m.f22654Y;
                    if (K10 == iVar) {
                        K10 = new p0.l();
                        rVar2.h0(K10);
                    }
                    p0.l lVar = (p0.l) K10;
                    rVar2.t(false);
                    jf.y yVar = jf.y.f36177a;
                    rVar2.W(133782735);
                    Object K11 = rVar2.K();
                    if (K11 == iVar) {
                        K11 = new c0(lVar, null);
                        rVar2.h0(K11);
                    }
                    rVar2.t(false);
                    AbstractC1734s.e(yVar, (wf.n) K11, rVar2);
                    AbstractC4326r c10 = androidx.compose.foundation.layout.e.c(c4323o, 1.0f);
                    if (1.0f > 0.0d) {
                        AbstractC4326r j6 = androidx.compose.ui.focus.a.j(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.a.v(c10.g(new LayoutWeightElement(com.google.android.gms.internal.play_billing.N.l(1.0f, Float.MAX_VALUE), true)), f6, 0.0f, 0.0f, 0.0f, 14), 0.0f, f6, 1), lVar);
                        C0865o0 c0865o0 = new C0865o0(3, 1, 22);
                        rVar2.W(133783450);
                        boolean g10 = rVar2.g(sVar);
                        Object K12 = rVar2.K();
                        if (g10 || K12 == iVar) {
                            K12 = new G.X(sVar, 7);
                            rVar2.h0(K12);
                        }
                        rVar2.t(false);
                        A7.b.O(this.f45927Z, this.f45928h0, j6, false, false, null, c0865o0, new C0863n0(null, (wf.k) K12, 31), false, 0, 0, null, null, null, null, null, rVar2, 0, 0, 65336);
                        AbstractC4326r c11 = androidx.compose.foundation.layout.e.c(c4323o, 1.0f);
                        float f10 = p9.r.f42840d;
                        AbstractC4326r v11 = androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.a.t(c11, 0.0f, f10, 1), 0.0f, 0.0f, f10, 0.0f, 11);
                        C0424h c0424h = AbstractC0429m.f3912f;
                        rVar2.W(-483455358);
                        E0.N a10 = AbstractC0440y.a(c0424h, C4310b.f37705r0, rVar2);
                        rVar2.W(-1323940314);
                        int i13 = rVar2.P;
                        AbstractC1732q0 p11 = rVar2.p();
                        C3288a i14 = androidx.compose.ui.layout.a.i(v11);
                        if (z10) {
                            rVar2.Z();
                            if (rVar2.f22695O) {
                                rVar2.o(c0582k);
                            } else {
                                rVar2.k0();
                            }
                            U3.f.n0(rVar2, a10, c0581j);
                            U3.f.n0(rVar2, p11, c0581j2);
                            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i13))) {
                                AbstractC6463a.q(i13, rVar2, i13, c0581j3);
                            }
                            AbstractC6463a.r(0, i14, new L0(rVar2), rVar2, 2058660585);
                            AbstractC4326r a11 = io.sentry.compose.b.a("TextInputDialog");
                            R4.b.o(abstractC6216a, a11, false, null, null, AbstractC5710i.f45951a, rVar2, 196608, 30);
                            R4.b.k(sVar, a11, this.f45931k0, null, null, null, AbstractC5710i.f45952b, rVar2, 1572864, 58);
                            AbstractC6463a.v(rVar2, false, true, false, false);
                            AbstractC6463a.v(rVar2, false, true, false, false);
                            return;
                        }
                        R4.b.r1();
                        throw null;
                    }
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
                R4.b.r1();
                throw null;
            default:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                G3.a(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.e.f24739c), null, 0L, 0L, 0.0f, 0.0f, null, R4.b.X(abstractC1725n, -231765170, new d0(0, this.f45927Z, this.f45929i0, this.f45930j0, this.f45928h0, this.f45931k0)), abstractC1725n, 12582912, 126);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f45926Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
