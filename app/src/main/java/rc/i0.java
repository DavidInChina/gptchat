package rc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import wc.C6161c;

/* loaded from: classes2.dex */
public final class i0 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44891a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f44892b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f44893c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f44894d;

    public i0(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f44891a = abstractC2400f;
        this.f44892b = abstractC2400f2;
        this.f44893c = abstractC2400f3;
        this.f44894d = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44891a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f44892b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f44893c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f44894d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new h0((j0) obj, (nd.l) obj2, (C6161c) obj3, (ld.p) obj4);
    }
}
