package Lc;

import id.AbstractC3557B;
import te.C5763g;

/* loaded from: classes.dex */
public final class b implements me.x, Xc.d, Xc.b {

    /* renamed from: a  reason: collision with root package name */
    public final e f10985a;

    /* renamed from: b  reason: collision with root package name */
    public final Fe.a f10986b = new Fe.a("DeviceId");

    public b(e eVar) {
        this.f10985a = eVar;
    }

    @Override // me.x
    public final void a(ge.d dVar, Object obj) {
        AbstractC3557B.c0("plugin", (jf.y) obj);
        AbstractC3557B.c0("scope", dVar);
        dVar.f31598k0.f(C5763g.f46139f.k(), new a(this, null));
    }

    @Override // me.x
    public final Object c(wf.k kVar) {
        return jf.y.f36177a;
    }

    @Override // me.x
    public final Fe.a getKey() {
        return this.f10986b;
    }

    @Override // Xc.c
    public final me.x b() {
        return this;
    }
}
