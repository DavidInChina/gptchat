package rc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import td.C5756a;
import wd.C6189g;

/* renamed from: rc.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5439C implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44775a;

    public C5439C(AbstractC2400f abstractC2400f) {
        this.f44775a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44775a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new sd.k((sd.j) obj, "account", new C5756a(C6189g.Companion.serializer()));
    }
}
