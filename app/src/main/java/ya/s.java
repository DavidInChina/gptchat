package Ya;

import Za.T0;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class s implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f22206a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f22207b;

    public s(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f22206a = abstractC2400f;
        this.f22207b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f22206a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f22207b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new r((T0) obj, (t) obj2);
    }
}
