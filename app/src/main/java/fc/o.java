package Fc;

import Ec.A;
import Ec.G;
import Ec.H;
import id.AbstractC3557B;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class o extends G {

    /* renamed from: j  reason: collision with root package name */
    public final g f5227j;

    public o(g gVar) {
        super(new H(A.f4599c));
        this.f5227j = gVar;
        a(gVar);
        L4.a.E0(L4.a.I0(new j(this, null), gVar.f5209j0), AbstractC4828h.Q(this));
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        Ec.m mVar = (Ec.m) iVar;
        AbstractC3557B.c0("intent", mVar);
        if (mVar instanceof Ec.j) {
            h(new k(this, null));
        } else if (mVar instanceof Ec.l) {
            h(new l(this, null));
        } else if (AbstractC3557B.K(mVar, Ec.k.f4624a)) {
            h(new m(this, null));
        } else if (AbstractC3557B.K(mVar, Ec.i.f4622a)) {
            h(new n(this, null));
        }
    }
}
