package ic;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import kc.C4235c;

/* loaded from: classes.dex */
public final class h0 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f33045a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f33046b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f33047c;

    public h0(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f33045a = abstractC2400f;
        this.f33046b = abstractC2400f2;
        this.f33047c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f33045a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f33046b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f33047c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new g0((C4235c) obj, (xd.g) obj2, (Va.e) obj3);
    }
}
