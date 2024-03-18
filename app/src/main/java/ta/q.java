package Ta;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class q implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f17026a;

    public q(AbstractC2400f abstractC2400f) {
        this.f17026a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f17026a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new p((Yc.a) obj);
    }
}
