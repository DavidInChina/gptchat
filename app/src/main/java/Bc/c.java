package Bc;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import id.AbstractC3557B;
import nd.AbstractC4816e;

/* loaded from: classes.dex */
public final class c implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f2052a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f2053b;

    public c(C2398d c2398d, AbstractC2400f abstractC2400f) {
        this.f2052a = c2398d;
        this.f2053b = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f2052a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f2053b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new b((Application) obj, (AbstractC4816e) obj2);
    }
}
