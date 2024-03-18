package ya;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class w implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f50881a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f50882b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f50883c;

    public w(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f50881a = abstractC2400f;
        this.f50882b = abstractC2400f2;
        this.f50883c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f50881a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f50882b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f50883c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new v((com.openai.experiment.t) obj, (xd.h) obj2, (xd.g) obj3);
    }
}
