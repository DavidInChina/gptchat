package mb;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import ld.C4428a;
import nd.C4812a;

/* renamed from: mb.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4608u implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f39104a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f39105b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f39106c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f39107d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f39108e;

    public C4608u(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4, AbstractC2400f abstractC2400f5) {
        this.f39104a = abstractC2400f;
        this.f39105b = abstractC2400f2;
        this.f39106c = abstractC2400f3;
        this.f39107d = abstractC2400f4;
        this.f39108e = abstractC2400f5;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f39104a.get();
        AbstractC3557B.b0("get(...)", obj);
        C4428a c4428a = (C4428a) obj;
        Object obj2 = this.f39105b.get();
        AbstractC3557B.b0("get(...)", obj2);
        nd.l lVar = (nd.l) obj2;
        Object obj3 = this.f39106c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Kc.b bVar = (Kc.b) obj3;
        Object obj4 = this.f39107d.get();
        AbstractC3557B.b0("get(...)", obj4);
        C4610w c4610w = (C4610w) obj4;
        Object obj5 = this.f39108e.get();
        AbstractC3557B.b0("get(...)", obj5);
        return new C4607t(c4428a, lVar, bVar, c4610w, (C4812a) obj5);
    }
}
