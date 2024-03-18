package Sa;

import Jc.AbstractC0810d;
import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import id.AbstractC3557B;
import ld.C4429b;
import nd.C4812a;
import o9.AbstractC4954b;
import o9.C4953a;

/* loaded from: classes2.dex */
public final class g implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f16470a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f16471b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f16472c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f16473d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f16474e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f16475f;

    public g(C2398d c2398d, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        j9.g gVar = AbstractC4954b.f40985a;
        this.f16470a = c2398d;
        this.f16471b = abstractC2400f;
        this.f16472c = abstractC2400f2;
        this.f16473d = abstractC2400f3;
        this.f16474e = abstractC2400f4;
        this.f16475f = gVar;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f16470a.get();
        AbstractC3557B.b0("get(...)", obj);
        Application application = (Application) obj;
        Object obj2 = this.f16471b.get();
        AbstractC3557B.b0("get(...)", obj2);
        AbstractC0810d abstractC0810d = (AbstractC0810d) obj2;
        Object obj3 = this.f16472c.get();
        AbstractC3557B.b0("get(...)", obj3);
        i iVar = (i) obj3;
        Object obj4 = this.f16473d.get();
        AbstractC3557B.b0("get(...)", obj4);
        C4812a c4812a = (C4812a) obj4;
        Object obj5 = this.f16474e.get();
        AbstractC3557B.b0("get(...)", obj5);
        C4429b c4429b = (C4429b) obj5;
        Object obj6 = this.f16475f.get();
        AbstractC3557B.b0("get(...)", obj6);
        return new f(application, abstractC0810d, iVar, c4812a, c4429b, (C4953a) obj6);
    }
}
