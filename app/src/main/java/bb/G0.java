package bb;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class G0 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f25715a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f25716b;

    public G0(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f25715a = abstractC2400f;
        this.f25716b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f25715a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f25716b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new F0((Va.e) obj, (com.openai.experiment.t) obj2);
    }
}
