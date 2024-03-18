package rc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import sd.AbstractC5614c;
import sd.C5613b;
import td.C5756a;

/* renamed from: rc.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5441E implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44776a;

    public C5441E(AbstractC2400f abstractC2400f) {
        this.f44776a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44776a.get();
        AbstractC3557B.b0("get(...)", obj);
        C5756a c5756a = new C5756a(zd.g.Companion.serializer());
        kf.x xVar = kf.x.f37485Y;
        return new AbstractC5614c((C5613b) obj, "remote_settings", c5756a, new zd.g(null, null, null, null, null, null, xVar, xVar));
    }
}
