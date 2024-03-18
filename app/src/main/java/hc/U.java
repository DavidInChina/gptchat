package hc;

import id.AbstractC3557B;
import nf.AbstractC4828h;
import rc.C5472v;

/* loaded from: classes.dex */
public final class U extends M {

    /* renamed from: j  reason: collision with root package name */
    public final Ba.j f32173j;

    /* renamed from: k  reason: collision with root package name */
    public final xd.h f32174k;

    public U(Ba.j jVar, xd.b bVar, xd.h hVar) {
        super(new L(false, false, true, null));
        this.f32173j = jVar;
        this.f32174k = hVar;
        L4.a.E0(L4.a.I0(new N(this, null), jVar.f2031c), AbstractC4828h.Q(this));
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new O(this, null), 3);
        L4.a.E0(L4.a.I0(new P(this, null), ((rc.Q) hVar).f44819b), AbstractC4828h.Q(this));
        L4.a.E0(L4.a.I0(new Q(this, null), ((C5472v) bVar).f44936f), AbstractC4828h.Q(this));
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        E e10 = (E) iVar;
        AbstractC3557B.c0("intent", e10);
        if (e10 instanceof D) {
            h(new S(this, e10, null));
        } else if (e10 instanceof C3385C) {
            h(new T(this, null));
        }
    }
}
