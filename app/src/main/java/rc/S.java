package rc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class S implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44820a;

    public S(AbstractC2400f abstractC2400f) {
        this.f44820a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44820a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new Q((V) obj);
    }
}
