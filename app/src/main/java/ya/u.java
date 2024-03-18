package Ya;

import cb.C2362c0;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import java.util.ArrayList;
import sd.AbstractC5614c;
import sd.C5613b;
import td.C5756a;

/* loaded from: classes2.dex */
public final class u implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f22208a;

    public u(AbstractC2400f abstractC2400f) {
        this.f22208a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f22208a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new AbstractC5614c((C5613b) obj, "gizmos", new C5756a(C2362c0.Companion.serializer()), new C2362c0((ArrayList) null, 3));
    }
}
