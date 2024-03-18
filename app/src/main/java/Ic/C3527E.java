package ic;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: ic.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3527E implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f32951a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f32952b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f32953c;

    public C3527E(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f32951a = abstractC2400f;
        this.f32952b = abstractC2400f2;
        this.f32953c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f32951a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f32952b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f32953c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new C3526D((com.openai.experiment.t) obj, (xd.h) obj2, (xd.g) obj3);
    }
}
