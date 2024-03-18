package me;

import e9.C2813f;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class O implements x, je.e {
    @Override // me.x
    public final void a(ge.d dVar, Object obj) {
        P p10 = (P) obj;
        AbstractC3557B.c0("plugin", p10);
        AbstractC3557B.c0("scope", dVar);
        ((L) y.a(dVar, L.f39171c)).f39174b.add(new C2813f(p10, dVar, null, 5));
    }

    @Override // me.x
    public final Object c(wf.k kVar) {
        M m10 = new M();
        kVar.invoke(m10);
        return new P(m10.f39175a, m10.f39176b, m10.f39177c);
    }

    @Override // me.x
    public final Fe.a getKey() {
        return P.f39183e;
    }
}
