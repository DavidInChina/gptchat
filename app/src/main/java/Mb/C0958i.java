package Mb;

import E.AbstractC0434s;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.I2;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import y.AbstractC6463a;

/* renamed from: Mb.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958i extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Y  reason: collision with root package name */
    public static final C0958i f11948Y = new kotlin.jvm.internal.o(5);

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        E.g0 g0Var = (E.g0) obj;
        C0972p c0972p = (C0972p) obj2;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj4;
        AbstractC3557B.c0("paddings", g0Var);
        AbstractC3557B.c0("state", c0972p);
        AbstractC3557B.c0("$anonymous$parameter$2$", (wf.k) obj3);
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        if (c0972p.f11970a instanceof wd.m0) {
            AbstractC4326r g10 = androidx.compose.foundation.layout.a.q(c4323o, g0Var).g(androidx.compose.foundation.layout.e.f24739c);
            Z.r rVar = (Z.r) abstractC1725n;
            rVar.W(733328855);
            E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar);
            rVar.W(-1323940314);
            int i10 = rVar.P;
            AbstractC1732q0 p10 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i11 = androidx.compose.ui.layout.a.i(g10);
            if (rVar.f22696a instanceof AbstractC1707e) {
                rVar.Z();
                if (rVar.f22695O) {
                    rVar.o(c0582k);
                } else {
                    rVar.k0();
                }
                U3.f.n0(rVar, c10, C0583l.f5808f);
                U3.f.n0(rVar, p10, C0583l.f5807e);
                C0581j c0581j = C0583l.f5809g;
                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i10))) {
                    AbstractC6463a.q(i10, rVar, i10, c0581j);
                }
                AbstractC6463a.r(0, i11, new Z.L0(rVar), rVar, 2058660585);
                I2.b(androidx.compose.foundation.layout.b.f24731a.a(c4323o, C4310b.f37697j0), 0L, 0.0f, 0L, 0, rVar, 0, 30);
                AbstractC6463a.v(rVar, false, true, false, false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        return jf.y.f36177a;
    }
}
