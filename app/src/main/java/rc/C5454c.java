package rc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: rc.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5454c implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44847a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f44848b;

    public C5454c(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f44847a = abstractC2400f;
        this.f44848b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44847a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f44848b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new C5453b((nd.h) obj, (C5474x) obj2);
    }
}
