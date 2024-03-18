package Xb;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import id.AbstractC3557B;
import pd.t;

/* loaded from: classes.dex */
public final class o implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f21836a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f21837b;

    public o(C2398d c2398d, AbstractC2400f abstractC2400f) {
        AbstractC3557B.c0("context", c2398d);
        AbstractC3557B.c0("serverStatusService", abstractC2400f);
        this.f21836a = c2398d;
        this.f21837b = abstractC2400f;
    }

    public static final o a(C2398d c2398d, AbstractC2400f abstractC2400f) {
        AbstractC3557B.c0("context", c2398d);
        AbstractC3557B.c0("serverStatusService", abstractC2400f);
        return new o(c2398d, abstractC2400f);
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f21836a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f21837b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new n((Application) obj, (t) obj2);
    }
}
