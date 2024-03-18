package bb;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class M implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f25733a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f25734b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f25735c;

    public M(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f25733a = abstractC2400f;
        this.f25734b = abstractC2400f2;
        this.f25735c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f25733a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f25734b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f25735c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new L((androidx.lifecycle.P) obj, (Va.e) obj2, (xd.b) obj3);
    }
}
