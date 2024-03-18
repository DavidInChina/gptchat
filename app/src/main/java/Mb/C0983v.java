package Mb;

import b9.AbstractC2133b;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import f9.C2959k;
import id.AbstractC3557B;
import wd.EnumC6206t;

/* renamed from: Mb.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0983v implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f11990a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f11991b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f11992c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f11993d;

    public C0983v(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, k9.b bVar, C2959k c2959k) {
        this.f11990a = abstractC2400f;
        this.f11991b = abstractC2400f2;
        this.f11992c = bVar;
        this.f11993d = c2959k;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f11990a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f11991b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f11992c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f11993d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new C0981u((Cb.G) obj, (AbstractC2133b) obj2, (p9.s) obj3, (EnumC6206t) obj4);
    }
}
