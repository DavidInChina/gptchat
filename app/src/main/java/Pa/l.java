package Pa;

import Ga.E;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class l implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f13913a;

    public l(AbstractC2400f abstractC2400f) {
        this.f13913a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f13913a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new k((E) obj);
    }
}
