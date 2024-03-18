package L;

import A.C0053y;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import N0.C1045d;
import N0.C1046e;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1741v0;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import jf.C3959i;
import l0.C4323o;
import y.AbstractC6463a;

/* renamed from: L.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0848g {

    /* renamed from: a  reason: collision with root package name */
    public static final C3959i f10171a;

    static {
        kf.v vVar = kf.v.f37483Y;
        f10171a = new C3959i(vVar, vVar);
    }

    public static final void a(C1046e c1046e, List list, AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1794596951);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1045d c1045d = (C1045d) list.get(i11);
            wf.o oVar = (wf.o) c1045d.f12508a;
            C0846f c0846f = C0846f.f10122a;
            rVar.W(-1323940314);
            C4323o c4323o = C4323o.f37719b;
            int i12 = rVar.P;
            AbstractC1732q0 p10 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i13 = androidx.compose.ui.layout.a.i(c4323o);
            if (rVar.f22696a instanceof AbstractC1707e) {
                rVar.Z();
                if (rVar.f22695O) {
                    rVar.o(c0582k);
                } else {
                    rVar.k0();
                }
                U3.f.n0(rVar, c0846f, C0583l.f5808f);
                U3.f.n0(rVar, p10, C0583l.f5807e);
                C0581j c0581j = C0583l.f5809g;
                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i12))) {
                    AbstractC6463a.q(i12, rVar, i12, c0581j);
                }
                AbstractC6463a.r(0, i13, new Z.L0(rVar), rVar, 2058660585);
                oVar.invoke(c1046e.subSequence(c1045d.f12509b, c1045d.f12510c).f12512Y, rVar, 0);
                rVar.t(false);
                rVar.t(true);
                rVar.t(false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C0053y(c1046e, list, i10, 2);
        }
    }
}
