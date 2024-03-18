package Mb;

import Z8.AbstractC1805k0;
import b9.AbstractC2133b;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import f9.C2959k;
import id.AbstractC3557B;
import wd.EnumC6206t;

/* loaded from: classes.dex */
public final class G0 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f11790a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f11791b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f11792c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f11793d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f11794e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f11795f;

    public G0(C2398d c2398d, AbstractC2400f abstractC2400f, k9.b bVar, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, C2959k c2959k) {
        this.f11790a = c2398d;
        this.f11791b = abstractC2400f;
        this.f11792c = bVar;
        this.f11793d = abstractC2400f2;
        this.f11794e = abstractC2400f3;
        this.f11795f = c2959k;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f11790a.get();
        AbstractC3557B.b0("get(...)", obj);
        androidx.lifecycle.P p10 = (androidx.lifecycle.P) obj;
        Object obj2 = this.f11791b.get();
        AbstractC3557B.b0("get(...)", obj2);
        AbstractC1805k0 abstractC1805k0 = (AbstractC1805k0) obj2;
        Object obj3 = this.f11792c.get();
        AbstractC3557B.b0("get(...)", obj3);
        p9.s sVar = (p9.s) obj3;
        Object obj4 = this.f11793d.get();
        AbstractC3557B.b0("get(...)", obj4);
        Cb.G g10 = (Cb.G) obj4;
        Object obj5 = this.f11794e.get();
        AbstractC3557B.b0("get(...)", obj5);
        AbstractC2133b abstractC2133b = (AbstractC2133b) obj5;
        Object obj6 = this.f11795f.get();
        AbstractC3557B.b0("get(...)", obj6);
        return new F0(p10, abstractC1805k0, sVar, g10, abstractC2133b, (EnumC6206t) obj6);
    }
}
