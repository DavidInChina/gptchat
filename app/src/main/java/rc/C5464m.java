package rc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import yd.AbstractC6580a;

/* renamed from: rc.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5464m implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44909a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f44910b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f44911c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f44912d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f44913e;

    public C5464m(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4, AbstractC2400f abstractC2400f5) {
        this.f44909a = abstractC2400f;
        this.f44910b = abstractC2400f2;
        this.f44911c = abstractC2400f3;
        this.f44912d = abstractC2400f4;
        this.f44913e = abstractC2400f5;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44909a.get();
        AbstractC3557B.b0("get(...)", obj);
        C5465n c5465n = (C5465n) obj;
        Object obj2 = this.f44910b.get();
        AbstractC3557B.b0("get(...)", obj2);
        C5438B c5438b = (C5438B) obj2;
        Object obj3 = this.f44911c.get();
        AbstractC3557B.b0("get(...)", obj3);
        nd.l lVar = (nd.l) obj3;
        Object obj4 = this.f44912d.get();
        AbstractC3557B.b0("get(...)", obj4);
        AbstractC6580a abstractC6580a = (AbstractC6580a) obj4;
        Object obj5 = this.f44913e.get();
        AbstractC3557B.b0("get(...)", obj5);
        return new C5463l(c5465n, c5438b, lVar, abstractC6580a, (ld.p) obj5);
    }
}
