package Ib;

import E.AbstractC0434s;
import E.g0;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import L0.u;
import U3.f;
import W.I2;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import Z.r;
import androidx.compose.foundation.layout.e;
import h0.C3288a;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class a extends o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f8536Y = new o(3);

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        g0 g0Var = (g0) obj;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3557B.c0("paddings", g0Var);
        C4323o c4323o = C4323o.f37719b;
        u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 14) == 0) {
            if (((r) abstractC1725n).g(g0Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue |= i10;
        }
        if ((intValue & 91) == 18) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(e.f24739c, g0Var);
        r rVar2 = (r) abstractC1725n;
        rVar2.W(733328855);
        N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
        rVar2.W(-1323940314);
        int i11 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i12 = androidx.compose.ui.layout.a.i(q10);
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
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i11))) {
                AbstractC6463a.q(i11, rVar2, i11, c0581j);
            }
            AbstractC6463a.r(0, i12, new L0(rVar2), rVar2, 2058660585);
            I2.b(androidx.compose.foundation.layout.b.f24731a.a(c4323o, C4310b.f37697j0), 0L, 0.0f, 0L, 0, rVar2, 0, 30);
            AbstractC6463a.v(rVar2, false, true, false, false);
            return y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
