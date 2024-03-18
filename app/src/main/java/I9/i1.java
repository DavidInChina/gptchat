package I9;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class i1 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f8369a;

    public i1(AbstractC2400f abstractC2400f) {
        this.f8369a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f8369a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new h1((xd.b) obj);
    }
}
