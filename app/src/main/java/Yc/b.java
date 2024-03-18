package Yc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class b implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f22231a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f22232b;

    public b(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f22231a = abstractC2400f;
        this.f22232b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f22231a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f22232b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new a((ge.d) obj, (l) obj2);
    }
}
