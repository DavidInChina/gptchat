package rc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: rc.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5473w implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44940a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f44941b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f44942c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f44943d;

    public C5473w(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f44940a = abstractC2400f;
        this.f44941b = abstractC2400f2;
        this.f44942c = abstractC2400f3;
        this.f44943d = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44940a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f44941b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f44942c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f44943d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new C5472v((C5474x) obj, (ld.p) obj2, (xd.j) obj3, (xd.a) obj4);
    }
}
