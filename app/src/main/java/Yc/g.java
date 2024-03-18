package Yc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class g implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f22242a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f22243b;

    public g(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f22242a = abstractC2400f;
        this.f22243b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f22242a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f22243b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new f((ge.d) obj, (l) obj2);
    }
}
