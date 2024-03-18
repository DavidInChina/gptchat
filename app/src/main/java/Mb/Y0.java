package Mb;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import f9.C2959k;
import id.AbstractC3557B;
import wd.EnumC6206t;

/* loaded from: classes2.dex */
public final class Y0 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f11872a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f11873b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f11874c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f11875d;

    public Y0(C2398d c2398d, AbstractC2400f abstractC2400f, k9.b bVar, C2959k c2959k) {
        this.f11872a = c2398d;
        this.f11873b = abstractC2400f;
        this.f11874c = bVar;
        this.f11875d = c2959k;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f11872a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f11873b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f11874c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f11875d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new X0((Application) obj, (Cb.G) obj2, (p9.s) obj3, (EnumC6206t) obj4);
    }
}
