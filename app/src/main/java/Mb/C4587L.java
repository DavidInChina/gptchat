package mb;

import Dd.W;
import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import id.AbstractC3557B;

/* renamed from: mb.L  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4587L implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f39045a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f39046b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f39047c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f39048d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f39049e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f39050f;

    public C4587L(C2398d c2398d, k9.b bVar, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f39045a = c2398d;
        this.f39046b = bVar;
        this.f39047c = abstractC2400f;
        this.f39048d = abstractC2400f2;
        this.f39049e = abstractC2400f3;
        this.f39050f = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f39045a.get();
        AbstractC3557B.b0("get(...)", obj);
        Application application = (Application) obj;
        Object obj2 = this.f39046b.get();
        AbstractC3557B.b0("get(...)", obj2);
        p9.s sVar = (p9.s) obj2;
        Object obj3 = this.f39048d.get();
        AbstractC3557B.b0("get(...)", obj3);
        W w10 = (W) obj3;
        Object obj4 = this.f39049e.get();
        AbstractC3557B.b0("get(...)", obj4);
        T9.a aVar = (T9.a) obj4;
        Object obj5 = this.f39050f.get();
        AbstractC3557B.b0("get(...)", obj5);
        p000if.a aVar2 = this.f39047c;
        AbstractC3557B.c0("provider", aVar2);
        return new C4586K(application, sVar, aVar2, w10, aVar, (com.openai.experiment.t) obj5);
    }
}
