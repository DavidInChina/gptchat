package mb;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import id.AbstractC3557B;
import ld.C4429b;
import nd.C4812a;

/* renamed from: mb.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4611x implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f39111a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f39112b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f39113c;

    public C4611x(C2398d c2398d, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f39111a = c2398d;
        this.f39112b = abstractC2400f;
        this.f39113c = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f39111a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f39112b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f39113c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new C4610w((Application) obj, (C4812a) obj2, (C4429b) obj3);
    }
}
