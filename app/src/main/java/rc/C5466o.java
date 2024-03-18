package rc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import td.C5756a;
import wd.C6200m;

/* renamed from: rc.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5466o implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44914a;

    public C5466o(AbstractC2400f abstractC2400f) {
        this.f44914a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44914a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new sd.k((sd.j) obj, "accountstatus", new C5756a(C6200m.Companion.serializer()));
    }
}
