package e9;

import Qg.AbstractC1206i;
import Qg.n0;
import Rg.o;
import Z8.AbstractC1809m0;
import Z8.C1787b0;
import android.app.Application;
import g9.AbstractC3215f;
import g9.C3220k;
import id.AbstractC3557B;
import jf.C3959i;
import nf.AbstractC4828h;
import p9.s;
import pd.C5148a;
import pd.t;
import qd.AbstractC5304a;
import wd.EnumC6206t;

/* renamed from: e9.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2815h extends pd.g {

    /* renamed from: j  reason: collision with root package name */
    public final C3220k f29065j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2815h(Application application, s sVar, AbstractC5304a abstractC5304a, t tVar, EnumC6206t enumC6206t, C3220k c3220k) {
        super(AbstractC2811d.a(enumC6206t, (AbstractC3215f) r11.f14881Y.getValue(), null, null));
        AbstractC3557B.c0("context", application);
        AbstractC3557B.c0("resolver", sVar);
        AbstractC3557B.c0("sunsetService", abstractC5304a);
        AbstractC3557B.c0("serverStatusService", tVar);
        AbstractC3557B.c0("appType", enumC6206t);
        AbstractC3557B.c0("userComponentManager", c3220k);
        n0 n0Var = c3220k.f31338g;
        this.f29065j = c3220k;
        AbstractC1809m0.a().b(C1787b0.f23333c, P4.a.o0(new C3959i("HapticsAvailable", Boolean.valueOf(L4.a.w0(application)))));
        o V02 = L4.a.V0(n0Var, new Q3.h(1, null));
        o V03 = L4.a.V0(n0Var, new Q3.h(2, null));
        L4.a.E0(new C2814g(new AbstractC1206i[]{((Ub.e) tVar).f17604c, ((Yb.f) abstractC5304a).f22216b, n0Var, V02, L4.a.V0(V02, new Q3.h(3, null)), V03}, this, enumC6206t, 0), AbstractC4828h.Q(this));
        L4.a.E0(L4.a.I0(new C2810c(this, sVar, enumC6206t, null), L4.a.V0(L4.a.l0(c3220k.f31339h), new Q3.h(4, null))), AbstractC4828h.Q(this));
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        pd.f fVar = (pd.f) iVar;
        AbstractC3557B.c0("intent", fVar);
        if (fVar instanceof pd.d) {
            f(new C5148a(((pd.d) fVar).f43058a));
        } else if (fVar instanceof pd.e) {
            h(new C2812e(this, null));
        }
    }
}
