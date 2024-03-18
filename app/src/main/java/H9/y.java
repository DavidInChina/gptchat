package H9;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import nd.AbstractC4816e;

/* loaded from: classes.dex */
public final class y implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f7562a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f7563b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f7564c;

    public y(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f7562a = abstractC2400f;
        this.f7563b = abstractC2400f2;
        this.f7564c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f7562a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f7563b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f7564c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new x((m) obj, (Ea.a) obj2, (AbstractC4816e) obj3);
    }
}
