package Mb;

import Z8.AbstractC1805k0;
import b9.AbstractC2133b;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import f9.C2959k;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class T implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f11843a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f11844b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f11845c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f11846d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f11847e;

    public T(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, k9.b bVar, C2959k c2959k, AbstractC2400f abstractC2400f3) {
        this.f11843a = abstractC2400f;
        this.f11844b = abstractC2400f2;
        this.f11845c = bVar;
        this.f11846d = c2959k;
        this.f11847e = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f11843a.get();
        AbstractC3557B.b0("get(...)", obj);
        Cb.G g10 = (Cb.G) obj;
        Object obj2 = this.f11844b.get();
        AbstractC3557B.b0("get(...)", obj2);
        AbstractC2133b abstractC2133b = (AbstractC2133b) obj2;
        Object obj3 = this.f11845c.get();
        AbstractC3557B.b0("get(...)", obj3);
        p9.s sVar = (p9.s) obj3;
        Object obj4 = this.f11846d.get();
        AbstractC3557B.b0("get(...)", obj4);
        Yg.b bVar = (Yg.b) obj4;
        Object obj5 = this.f11847e.get();
        AbstractC3557B.b0("get(...)", obj5);
        return new S(g10, abstractC2133b, sVar, bVar, (AbstractC1805k0) obj5);
    }
}
