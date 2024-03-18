package hd;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import ld.C4431d;

/* renamed from: hd.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3415i implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f32258a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f32259b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f32260c;

    public C3415i(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f32258a = abstractC2400f;
        this.f32259b = abstractC2400f2;
        this.f32260c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f32258a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f32259b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f32260c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new C3414h((C4431d) obj, (Pc.a) obj2, (Lc.e) obj3);
    }
}
