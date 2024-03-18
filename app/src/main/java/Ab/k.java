package Ab;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import zb.AbstractC6810a;

/* loaded from: classes.dex */
public final class k implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f767a;

    public k(AbstractC2400f abstractC2400f) {
        this.f767a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f767a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new j((AbstractC6810a) obj);
    }
}
