package wb;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import sd.AbstractC5614c;
import sd.C5613b;
import td.C5756a;

/* loaded from: classes.dex */
public final class f implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f48295a;

    public f(AbstractC2400f abstractC2400f) {
        this.f48295a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f48295a.get();
        AbstractC3557B.b0("get(...)", obj);
        C5756a c5756a = new C5756a(Sc.c.Companion.serializer());
        Qc.b.f14570a.getClass();
        return new AbstractC5614c((C5613b) obj, "models", c5756a, Qc.a.f14569c);
    }
}
