package ra;

import E.AbstractC0434s;
import E.g0;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import L0.u;
import U3.f;
import W.j4;
import W.p4;
import W.q4;
import Y0.i;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import Z.r;
import androidx.compose.foundation.layout.e;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import java.util.NoSuchElementException;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import p9.n;
import y.AbstractC6463a;

/* renamed from: ra.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5397b extends o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public static final C5397b f44641Y = new o(3);

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
        r rVar2 = (r) abstractC1725n;
        Af.d dVar = (Af.d) rVar2.m(n.f42798a);
        rVar2.W(631976362);
        Object K10 = rVar2.K();
        if (K10 == C1723m.f22654Y) {
            List list = AbstractC5399d.f44644a;
            AbstractC3557B.c0("<this>", list);
            AbstractC3557B.c0("random", dVar);
            if (!list.isEmpty()) {
                K10 = (String) list.get(dVar.e(list.size()));
                rVar2.h0(K10);
            } else {
                throw new NoSuchElementException("Collection is empty.");
            }
        }
        String str = (String) K10;
        rVar2.t(false);
        AbstractC4326r g10 = androidx.compose.foundation.layout.a.q(c4323o, g0Var).g(e.f24739c);
        rVar2.W(733328855);
        N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
        rVar2.W(-1323940314);
        int i11 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i12 = androidx.compose.ui.layout.a.i(g10);
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
            j4.c(Bi.c.R1(str, true), e.d(androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.a.t(c4323o, p9.r.f42841e, 0.0f, 2), 0.0f, p9.r.f42847k, 0.0f, 0.0f, 13), 1.0f), 0L, 0L, null, null, null, 0L, null, new i(3), 0L, 0, false, 0, 0, null, null, ((p4) rVar2.m(q4.f20361a)).f20305f, rVar2, 0, 0, 130556);
            AbstractC6463a.v(rVar2, false, true, false, false);
            return y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
