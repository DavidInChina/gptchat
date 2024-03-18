package rc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import td.C5756a;
import wd.K0;

/* loaded from: classes2.dex */
public final class k0 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44903a;

    public k0(AbstractC2400f abstractC2400f) {
        this.f44903a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44903a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new sd.k((sd.j) obj, "user", new C5756a(K0.Companion.serializer()));
    }
}
