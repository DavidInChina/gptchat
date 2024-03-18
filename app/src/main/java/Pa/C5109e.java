package pa;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import com.openai.experiment.t;
import id.AbstractC3557B;
import ld.C4429b;
import ld.q;
import nd.C4812a;

/* renamed from: pa.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5109e implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f42865a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f42866b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f42867c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f42868d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f42869e;

    public C5109e(C2398d c2398d, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f42865a = c2398d;
        this.f42866b = abstractC2400f;
        this.f42867c = abstractC2400f2;
        this.f42868d = abstractC2400f3;
        this.f42869e = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f42865a.get();
        AbstractC3557B.b0("get(...)", obj);
        Application application = (Application) obj;
        Object obj2 = this.f42866b.get();
        AbstractC3557B.b0("get(...)", obj2);
        C4812a c4812a = (C4812a) obj2;
        Object obj3 = this.f42867c.get();
        AbstractC3557B.b0("get(...)", obj3);
        C4429b c4429b = (C4429b) obj3;
        Object obj4 = this.f42868d.get();
        AbstractC3557B.b0("get(...)", obj4);
        q qVar = (q) obj4;
        Object obj5 = this.f42869e.get();
        AbstractC3557B.b0("get(...)", obj5);
        return new C5108d(application, c4812a, c4429b, qVar, (t) obj5);
    }
}
