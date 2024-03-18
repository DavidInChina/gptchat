package Cb;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import rd.AbstractC5482f;
import sd.C5617f;
import sd.C5618g;
import td.C5756a;

/* loaded from: classes.dex */
public final class a0 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f2928a;

    public a0(AbstractC2400f abstractC2400f) {
        this.f2928a = abstractC2400f;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, sd.h, rd.f] */
    @Override // p000if.a
    public final Object get() {
        String concat;
        Object obj = this.f2928a.get();
        AbstractC3557B.b0("get(...)", obj);
        C5618g c5618g = (C5618g) obj;
        C5756a c5756a = new C5756a(Y.Companion.serializer());
        Y y10 = new Y(g0.f2942Z, null, null, null, null, null, null);
        nd.k kVar = c5618g.f45540c;
        AbstractC3557B.c0("authSession", kVar);
        if (kVar instanceof nd.i) {
            concat = "onboarding_".concat("onboarding");
        } else {
            concat = "unauthenticated_".concat("onboarding");
        }
        ?? abstractC5482f = new AbstractC5482f(c5618g.f45538a, c5618g.f45539b, concat, c5756a, y10);
        c5618g.f45541d.a(new C5617f(abstractC5482f, null));
        return abstractC5482f;
    }
}
