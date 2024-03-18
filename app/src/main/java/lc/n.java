package Lc;

import Ng.AbstractC1073l0;
import id.AbstractC3557B;
import te.C5763g;

/* loaded from: classes.dex */
public final class n implements me.x, Xc.d, Xc.b {

    /* renamed from: a  reason: collision with root package name */
    public final Kc.b f11000a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC1073l0 f11001b;

    /* renamed from: c  reason: collision with root package name */
    public final Fe.a f11002c = new Fe.a("PlayIntegrity");

    public n(Kc.b bVar) {
        this.f11000a = bVar;
    }

    @Override // me.x
    public final void a(ge.d dVar, Object obj) {
        AbstractC3557B.c0("plugin", (jf.y) obj);
        AbstractC3557B.c0("scope", dVar);
        dVar.f31598k0.f(C5763g.f46139f.k(), new a(dVar, this, null));
    }

    @Override // me.x
    public final Object c(wf.k kVar) {
        return jf.y.f36177a;
    }

    @Override // me.x
    public final Fe.a getKey() {
        return this.f11002c;
    }

    @Override // Xc.c
    public final me.x b() {
        return this;
    }
}
