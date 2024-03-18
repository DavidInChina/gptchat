package Lc;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class z implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f11041a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f11042b;

    public z(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f11041a = abstractC2400f;
        this.f11042b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f11041a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f11042b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new y((Application) obj, (e) obj2);
    }
}
