package bb;

import Uc.AbstractC1438x;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: bb.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2180u implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f25904a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f25905b;

    public C2180u(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f25904a = abstractC2400f;
        this.f25905b = abstractC2400f2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ad.g, bb.t, java.lang.Object] */
    @Override // p000if.a
    public final Object get() {
        Object obj = this.f25904a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f25905b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Uc.y.f17703l.getClass();
        ?? gVar = new Ad.g(new C2177q(AbstractC1438x.o1((androidx.lifecycle.P) obj), null));
        gVar.h(new C2178s((Va.e) obj2, gVar, null));
        return gVar;
    }
}
