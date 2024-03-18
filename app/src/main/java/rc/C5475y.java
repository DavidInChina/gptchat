package rc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import td.C5756a;

/* renamed from: rc.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5475y implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44944a;

    public C5475y(AbstractC2400f abstractC2400f) {
        this.f44944a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44944a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new sd.k((sd.j) obj, "accountuser_state", new C5756a(xd.e.Companion.serializer()));
    }
}
