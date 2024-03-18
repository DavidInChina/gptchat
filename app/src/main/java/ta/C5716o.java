package ta;

import Z8.AbstractC1805k0;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import f9.C2959k;
import id.AbstractC3557B;
import nd.C4812a;

/* renamed from: ta.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5716o implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f45983a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f45984b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f45985c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f45986d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f45987e;

    public C5716o(C2959k c2959k, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, C2398d c2398d, AbstractC2400f abstractC2400f3) {
        this.f45983a = c2959k;
        this.f45984b = abstractC2400f;
        this.f45985c = abstractC2400f2;
        this.f45986d = c2398d;
        this.f45987e = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f45983a.get();
        AbstractC3557B.b0("get(...)", obj);
        Yg.b bVar = (Yg.b) obj;
        Object obj2 = this.f45984b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Kc.c cVar = (Kc.c) obj2;
        Object obj3 = this.f45985c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Lc.e eVar = (Lc.e) obj3;
        Object obj4 = this.f45986d.get();
        AbstractC3557B.b0("get(...)", obj4);
        C4812a c4812a = (C4812a) obj4;
        Object obj5 = this.f45987e.get();
        AbstractC3557B.b0("get(...)", obj5);
        return new C5715n(bVar, cVar, eVar, c4812a, (AbstractC1805k0) obj5);
    }
}
