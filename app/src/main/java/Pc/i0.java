package pc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class i0 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f42997a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f42998b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f42999c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f43000d;

    public i0(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f42997a = abstractC2400f;
        this.f42998b = abstractC2400f2;
        this.f42999c = abstractC2400f3;
        this.f43000d = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f42997a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f42998b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f42999c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f43000d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new h0((C5144x) obj, (xd.b) obj2, (com.openai.experiment.t) obj3, (androidx.lifecycle.P) obj4);
    }
}
