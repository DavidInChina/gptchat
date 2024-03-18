package cc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class j implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f26576a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f26577b;

    public j(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f26576a = abstractC2400f;
        this.f26577b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f26576a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f26577b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new i((xd.b) obj, (xd.a) obj2);
    }
}
