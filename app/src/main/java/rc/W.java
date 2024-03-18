package rc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import sd.AbstractC5614c;
import sd.C5613b;
import td.C5756a;

/* loaded from: classes.dex */
public final class W implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44826a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f44827b;

    public W(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f44826a = abstractC2400f;
        this.f44827b = abstractC2400f2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [sd.c, java.lang.Object, rc.V] */
    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44826a.get();
        AbstractC3557B.b0("get(...)", obj);
        C5613b c5613b = (C5613b) obj;
        Object obj2 = this.f44827b.get();
        AbstractC3557B.b0("get(...)", obj2);
        ?? abstractC5614c = new AbstractC5614c(c5613b, "user_settings", new C5756a(zd.n.Companion.serializer()), new zd.n(false, null, zd.d.f51960Y, false, false, false, false, false, false, false, null, true));
        Ad.l.O0(c5613b.f45532b, null, null, new U(abstractC5614c, (xd.g) obj2, null), 3);
        return abstractC5614c;
    }
}
