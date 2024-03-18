package va;

import B.H;
import E.AbstractC0434s;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import I9.B;
import L0.u;
import Ng.F;
import U3.f;
import W.P0;
import W.R0;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import Z.r;
import h0.C3288a;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4310b;
import r0.G;
import wf.n;
import y.AbstractC6463a;

/* renamed from: va.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6002c extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ n f47422Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ H f47423Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f47424h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ F f47425i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6002c(n nVar, H h10, float f6, F f10) {
        super(2);
        this.f47422Y = nVar;
        this.f47423Z = h10;
        this.f47424h0 = f6;
        this.f47425i0 = f10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        int intValue = ((Number) obj2).intValue();
        u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 11) == 2) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        this.f47422Y.invoke(abstractC1725n, 0);
        H h10 = this.f47423Z;
        if (h10.f1088h.h() != 0.0f) {
            r rVar2 = (r) abstractC1725n;
            AbstractC4326r d10 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.e.f24739c, r0.r.b(((P0) rVar2.m(R0.f19593a)).f19495C, Math.min(1.0f, Math.max(0.0f, h10.f1088h.h() / this.f47424h0)) * 0.38f), G.f44171a);
            rVar2.W(-280528775);
            Object K10 = rVar2.K();
            if (K10 == C1723m.f22654Y) {
                K10 = m.d();
                rVar2.h0(K10);
            }
            rVar2.t(false);
            AbstractC4326r g10 = androidx.compose.foundation.a.g(d10, (D.m) K10, null, false, null, new B(this.f47425i0, 7, h10), 28);
            rVar2.W(733328855);
            N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
            rVar2.W(-1323940314);
            int i10 = rVar2.P;
            AbstractC1732q0 p10 = rVar2.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i11 = androidx.compose.ui.layout.a.i(g10);
            if (rVar2.f22696a instanceof AbstractC1707e) {
                rVar2.Z();
                if (rVar2.f22695O) {
                    rVar2.o(c0582k);
                } else {
                    rVar2.k0();
                }
                f.n0(rVar2, c10, C0583l.f5808f);
                f.n0(rVar2, p10, C0583l.f5807e);
                C0581j c0581j = C0583l.f5809g;
                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i10))) {
                    AbstractC6463a.q(i10, rVar2, i10, c0581j);
                }
                AbstractC6463a.r(0, i11, new L0(rVar2), rVar2, 2058660585);
                AbstractC6463a.v(rVar2, false, true, false, false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        return y.f36177a;
    }
}
