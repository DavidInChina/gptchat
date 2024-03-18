package Lc;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class u implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f11021a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f11022b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f11023c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f11024d;

    public u(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f11021a = abstractC2400f;
        this.f11022b = abstractC2400f2;
        this.f11023c = abstractC2400f3;
        this.f11024d = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f11021a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f11022b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f11023c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f11024d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new s((Application) obj, (Mc.c) obj2, (Kc.c) obj3, (Yc.t) obj4);
    }
}
