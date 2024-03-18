package F9;

import E.AbstractC0434s;
import E.g0;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import W.I2;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import Z.r;
import h0.C3288a;
import id.AbstractC3557B;
import id.x;
import jf.y;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4318j;
import l0.C4323o;
import wf.q;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.o implements q {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f5070Y = new kotlin.jvm.internal.o(5);

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        int i10;
        int i11;
        int i12;
        g0 g0Var = (g0) obj;
        i iVar = (i) obj2;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj4;
        int intValue = num.intValue();
        AbstractC3557B.c0("paddingValues", g0Var);
        AbstractC3557B.c0("state", iVar);
        AbstractC3557B.c0("$anonymous$parameter$2$", (wf.k) obj3);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
        if ((intValue & 14) == 0) {
            if (((r) abstractC1725n).g(g0Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | intValue;
        } else {
            i10 = intValue;
        }
        if ((intValue & 112) == 0) {
            if (((r) abstractC1725n).g(iVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 5211) == 1042) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        C4318j c4318j = C4310b.f37697j0;
        AbstractC4326r a10 = AbstractC4194d.a((X) a5, androidx.compose.foundation.layout.a.q(c4323o, g0Var).g(androidx.compose.foundation.layout.e.f24739c));
        r rVar2 = (r) abstractC1725n;
        rVar2.W(733328855);
        N c10 = AbstractC0434s.c(c4318j, false, rVar2);
        rVar2.W(-1323940314);
        int i13 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i14 = androidx.compose.ui.layout.a.i(a10);
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
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i13))) {
                AbstractC6463a.q(i13, rVar2, i13, c0581j);
            }
            AbstractC6463a.r(0, i14, new L0(rVar2), rVar2, 2058660585);
            AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
            x xVar = iVar.f5089c;
            if (xVar == null) {
                rVar2.W(-1582350549);
                I2.b(a11, 0L, 0.0f, 0L, 0, rVar2, 0, 31);
                rVar2.t(false);
            } else {
                rVar2.W(-1582350497);
                Bi.c.w(xVar, rVar2, 0);
                rVar2.t(false);
            }
            AbstractC6463a.v(rVar2, false, true, false, false);
            return y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
