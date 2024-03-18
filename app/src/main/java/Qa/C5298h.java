package qa;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import p9.s;
import rc.C5472v;
import wd.m0;

/* renamed from: qa.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5298h implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44031a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f44032b;

    public C5298h(AbstractC2400f abstractC2400f, k9.b bVar) {
        this.f44031a = abstractC2400f;
        this.f44032b = bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ad.g, java.lang.Object, qa.g, androidx.lifecycle.Y] */
    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44031a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f44032b.get();
        AbstractC3557B.b0("get(...)", obj2);
        ?? gVar = new Ad.g(new C5295e(m0.f48443a));
        L4.a.E0(L4.a.I0(new C5296f(gVar, (s) obj2, null), ((C5472v) ((xd.b) obj)).f44936f), AbstractC4828h.Q(gVar));
        return gVar;
    }
}
