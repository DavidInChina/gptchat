package I9;

import id.AbstractC3557B;
import rc.C5472v;

/* loaded from: classes.dex */
public final class h1 extends f1 {

    /* renamed from: j  reason: collision with root package name */
    public final xd.b f8364j;

    public h1(xd.b bVar) {
        super(new e1(null));
        this.f8364j = bVar;
        k(G.f8171i0, ((C5472v) bVar).f44935e);
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        X0 x02 = (X0) iVar;
        AbstractC3557B.c0("intent", x02);
        if (AbstractC3557B.K(x02, U0.f8239a)) {
            f(new S0(Uc.N.f17621k.o1()));
        } else if (x02 instanceof W0) {
            h(new g1(x02, this, null));
        } else if (AbstractC3557B.K(x02, V0.f8243a)) {
            Uc.B b10 = Uc.B.f17607i;
            f(new S0("history/true"));
        }
    }
}
