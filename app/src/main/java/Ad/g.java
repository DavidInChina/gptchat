package Ad;

import Ng.F;
import Pg.EnumC1170c;
import Qg.AbstractC1206i;
import Qg.F0;
import Qg.m0;
import Qg.r0;
import Qg.s0;
import Qg.v0;
import Qg.x0;
import androidx.lifecycle.Y;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import rb.C5426p;

/* loaded from: classes2.dex */
public abstract class g extends Y {

    /* renamed from: d  reason: collision with root package name */
    public final F0 f807d;

    /* renamed from: e  reason: collision with root package name */
    public final F0 f808e;

    /* renamed from: f  reason: collision with root package name */
    public final r0 f809f;

    /* renamed from: g  reason: collision with root package name */
    public final r0 f810g;

    /* renamed from: h  reason: collision with root package name */
    public final m0 f811h;

    /* renamed from: i  reason: collision with root package name */
    public final C5426p f812i;

    public g(s sVar) {
        AbstractC3557B.c0("initialState", sVar);
        F0 c10 = s0.c(sVar);
        this.f807d = c10;
        this.f808e = c10;
        EnumC1170c enumC1170c = EnumC1170c.f14193Z;
        r0 b10 = s0.b(1, 0, enumC1170c, 2);
        this.f809f = b10;
        r0 b11 = s0.b(1, 0, enumC1170c, 2);
        this.f810g = b11;
        F Q = AbstractC4828h.Q(this);
        x0 x0Var = v0.f14936b;
        m0 P02 = L4.a.P0(b10, Q, x0Var);
        m0 P03 = L4.a.P0(b11, AbstractC4828h.Q(this), x0Var);
        this.f811h = P03;
        this.f812i = new C5426p(P03, 17);
        L4.a.E0(L4.a.I0(new a(this, null), P02), AbstractC4828h.Q(this));
    }

    public final s e() {
        return (s) this.f807d.getValue();
    }

    public final void f(h hVar) {
        AbstractC3557B.c0("effect", hVar);
        h(new c(this, hVar, null));
    }

    public final void g(r rVar) {
        AbstractC3557B.c0("effect", rVar);
        h(new b(this, rVar, null));
    }

    public final void h(wf.k kVar) {
        l.O0(AbstractC4828h.Q(this), null, null, new d(kVar, null), 3);
    }

    public abstract void i(i iVar);

    public final void j(i iVar) {
        AbstractC3557B.c0("intent", iVar);
        this.f809f.g(iVar);
    }

    public final void k(wf.n nVar, AbstractC1206i abstractC1206i) {
        AbstractC3557B.c0("<this>", abstractC1206i);
        L4.a.E0(L4.a.I0(new e(this, nVar, null), abstractC1206i), AbstractC4828h.Q(this));
    }

    public final void l(wf.k kVar) {
        F0 f02;
        Object value;
        AbstractC3557B.c0("reducer", kVar);
        do {
            f02 = this.f807d;
            value = f02.getValue();
        } while (!f02.e(value, kVar.invoke(value)));
    }
}
