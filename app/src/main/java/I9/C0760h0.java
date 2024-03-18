package I9;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import nd.AbstractC4816e;

/* renamed from: I9.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760h0 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f8357a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f8358b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f8359c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f8360d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f8361e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f8362f;

    /* renamed from: g  reason: collision with root package name */
    public final p000if.a f8363g;

    public C0760h0(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4, AbstractC2400f abstractC2400f5, AbstractC2400f abstractC2400f6, AbstractC2400f abstractC2400f7) {
        this.f8357a = abstractC2400f;
        this.f8358b = abstractC2400f2;
        this.f8359c = abstractC2400f3;
        this.f8360d = abstractC2400f4;
        this.f8361e = abstractC2400f5;
        this.f8362f = abstractC2400f6;
        this.f8363g = abstractC2400f7;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f8357a.get();
        AbstractC3557B.b0("get(...)", obj);
        Ea.b bVar = (Ea.b) obj;
        Object obj2 = this.f8358b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Ea.a aVar = (Ea.a) obj2;
        Object obj3 = this.f8359c.get();
        AbstractC3557B.b0("get(...)", obj3);
        xd.h hVar = (xd.h) obj3;
        Object obj4 = this.f8360d.get();
        AbstractC3557B.b0("get(...)", obj4);
        Va.e eVar = (Va.e) obj4;
        androidx.lifecycle.P p10 = (androidx.lifecycle.P) this.f8361e.get();
        Object obj5 = this.f8362f.get();
        AbstractC3557B.b0("get(...)", obj5);
        com.openai.experiment.t tVar = (com.openai.experiment.t) obj5;
        Object obj6 = this.f8363g.get();
        AbstractC3557B.b0("get(...)", obj6);
        return new C0758g0(bVar, aVar, hVar, eVar, p10, tVar, (AbstractC4816e) obj6);
    }
}
