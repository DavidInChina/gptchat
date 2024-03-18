package Cb;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class T implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f2911a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f2912b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f2913c;

    public T(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f2911a = abstractC2400f;
        this.f2912b = abstractC2400f2;
        this.f2913c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f2911a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f2912b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f2913c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new S((ld.j) obj, (Z) obj2, (U) obj3);
    }
}
