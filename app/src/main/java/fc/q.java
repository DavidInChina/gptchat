package Fc;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import id.AbstractC3557B;
import ld.C4428a;
import ld.C4429b;
import nd.C4812a;

/* loaded from: classes2.dex */
public final class q implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f5229a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f5230b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f5231c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f5232d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f5233e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f5234f;

    public q(C2398d c2398d, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4, AbstractC2400f abstractC2400f5) {
        this.f5229a = c2398d;
        this.f5230b = abstractC2400f;
        this.f5231c = abstractC2400f2;
        this.f5232d = abstractC2400f3;
        this.f5233e = abstractC2400f4;
        this.f5234f = abstractC2400f5;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f5229a.get();
        AbstractC3557B.b0("get(...)", obj);
        Application application = (Application) obj;
        Object obj2 = this.f5230b.get();
        AbstractC3557B.b0("get(...)", obj2);
        xd.g gVar = (xd.g) obj2;
        Object obj3 = this.f5231c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Gc.b bVar = (Gc.b) obj3;
        Object obj4 = this.f5232d.get();
        AbstractC3557B.b0("get(...)", obj4);
        C4428a c4428a = (C4428a) obj4;
        Object obj5 = this.f5233e.get();
        AbstractC3557B.b0("get(...)", obj5);
        C4812a c4812a = (C4812a) obj5;
        Object obj6 = this.f5234f.get();
        AbstractC3557B.b0("get(...)", obj6);
        return new g(application, gVar, bVar, c4428a, c4812a, (C4429b) obj6);
    }
}
