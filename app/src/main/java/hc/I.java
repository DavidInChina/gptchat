package hc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import rc.C5472v;

/* loaded from: classes.dex */
public final class I implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f32147a;

    public I(AbstractC2400f abstractC2400f) {
        this.f32147a = abstractC2400f;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ad.g, hc.H, java.lang.Object, androidx.lifecycle.Y] */
    @Override // p000if.a
    public final Object get() {
        Object obj = this.f32147a.get();
        AbstractC3557B.b0("get(...)", obj);
        ?? gVar = new Ad.g(new F(false));
        L4.a.E0(L4.a.I0(new G(gVar, null), ((C5472v) ((xd.b) obj)).f44936f), AbstractC4828h.Q(gVar));
        return gVar;
    }
}
