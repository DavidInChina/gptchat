package Yb;

import Z8.AbstractC1809m0;
import Z8.C1799h0;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import kf.w;
import nf.AbstractC4828h;
import qd.AbstractC5304a;
import rb.C5426p;

/* loaded from: classes2.dex */
public final class l implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f22225a;

    public l(AbstractC2400f abstractC2400f) {
        this.f22225a = abstractC2400f;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ad.g, java.lang.Object, androidx.lifecycle.Y, Yb.k] */
    @Override // p000if.a
    public final Object get() {
        Object obj = this.f22225a.get();
        AbstractC3557B.b0("get(...)", obj);
        ?? gVar = new Ad.g(new m(null, null, null));
        AbstractC1809m0.a().b(C1799h0.f23351c, w.f37484Y);
        L4.a.E0(L4.a.I0(new i(gVar, null), new C5426p(((f) ((AbstractC5304a) obj)).f22216b, 4)), AbstractC4828h.Q(gVar));
        return gVar;
    }
}
