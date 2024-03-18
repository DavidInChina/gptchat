package ya;

import Dd.O;
import Z8.AbstractC1809m0;
import Z8.Y0;
import Z8.a1;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import rc.C5451O;
import rc.Q;
import x8.W;
import x9.C6383b;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class v extends AbstractC6572t {

    /* renamed from: j  reason: collision with root package name */
    public final Pc.g f50880j = Bi.c.i1(Pc.b.f13932j0);

    public v(com.openai.experiment.t tVar, xd.h hVar, xd.g gVar) {
        super(new x(((G) tVar).c(ExperimentKey.BreezeFeedbackEnabled.INSTANCE), null, false));
        k(new C6573u(tVar), L4.a.q0(((Q) hVar).f44819b, ((C5451O) gVar).f44814c, new Q3.h(6, null)));
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC6569q abstractC6569q = (AbstractC6569q) iVar;
        AbstractC3557B.c0("intent", abstractC6569q);
        boolean z10 = abstractC6569q instanceof C6564l;
        kf.w wVar = kf.w.f37484Y;
        C6554b c6554b = C6554b.f50850h0;
        if (z10) {
            if (((x) this.f808e.getValue()).f50884a) {
                Y0 y02 = Y0.f23297j;
                Ed.m mVar = ((C6564l) abstractC6569q).f50867a;
                m(mVar, y02, wVar);
                l(c6554b);
                if (mVar.f4688a != null && mVar.f4689b != null) {
                    f(new C6562j(mVar));
                    return;
                }
                return;
            }
            return;
        }
        boolean z11 = abstractC6569q instanceof C6568p;
        C6561i c6561i = C6561i.f50865a;
        if (z11) {
            m(((C6568p) abstractC6569q).f50872a, Y0.f23299l, wVar);
            l(c6554b);
            if (((x) e()).f50886c) {
                f(c6561i);
            } else {
                f(C6560h.f50864a);
            }
        } else if (abstractC6569q instanceof C6567o) {
            m(((C6567o) abstractC6569q).f50871a, Y0.f23298k, wVar);
            l(new C6383b(21, abstractC6569q));
        } else if (abstractC6569q instanceof C6565m) {
            C6565m c6565m = (C6565m) abstractC6569q;
            Y0 y03 = Y0.f23296i;
            List<EnumC6570r> list = c6565m.f50869b;
            int n02 = P4.a.n0(AbstractC6583a.H1(list, 10));
            if (n02 < 16) {
                n02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
            for (EnumC6570r enumC6570r : list) {
                linkedHashMap.put(enumC6570r.f50876Z, Boolean.TRUE);
            }
            m(c6565m.f50868a, y03, linkedHashMap);
            l(c6554b);
            if (((x) e()).f50886c) {
                f(c6561i);
            }
        } else if (abstractC6569q instanceof C6566n) {
            l(c6554b);
        }
    }

    public final void m(Ed.m mVar, a1 a1Var, Map map) {
        String str = mVar.f4689b;
        if (str == null) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        LinkedHashMap e12 = AbstractC4268D.e1(map, P4.a.o0(new C3959i("voice_session_id", str)));
        AbstractC1809m0.a().b(a1Var, e12);
        if (O.f3530a.contains(a1Var)) {
            W.W(this.f50880j, a1Var.toString(), null, e12, 2);
        }
    }
}
