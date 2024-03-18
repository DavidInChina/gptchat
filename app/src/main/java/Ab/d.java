package Ab;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f757a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f758b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f759c;

    public d(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f757a = abstractC2400f;
        this.f758b = abstractC2400f2;
        this.f759c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f757a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f759c.get();
        AbstractC3557B.b0("get(...)", obj2);
        p000if.a aVar = this.f758b;
        AbstractC3557B.c0("provider", aVar);
        return new c((T9.a) obj, aVar, (ld.i) obj2);
    }
}
