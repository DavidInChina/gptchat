package Na;

import Z8.AbstractC1805k0;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class b implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f12764a;

    public b(AbstractC2400f abstractC2400f) {
        this.f12764a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f12764a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new a((AbstractC1805k0) obj);
    }
}
