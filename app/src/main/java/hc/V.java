package hc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class V implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f32175a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f32176b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f32177c;

    public V(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f32175a = abstractC2400f;
        this.f32176b = abstractC2400f2;
        this.f32177c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f32175a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f32176b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f32177c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new U((Ba.j) obj, (xd.b) obj2, (xd.h) obj3);
    }
}
