package fc;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import id.AbstractC3557B;
import mc.AbstractC4617d;
import qd.AbstractC5304a;

/* renamed from: fc.I  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3005I implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f30124a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f30125b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f30126c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f30127d;

    public C3005I(C2398d c2398d, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        AbstractC3557B.c0("context", c2398d);
        AbstractC3557B.c0("developerSettingsStore", abstractC2400f);
        AbstractC3557B.c0("serverStatusService", abstractC2400f2);
        AbstractC3557B.c0("sunsetService", abstractC2400f3);
        this.f30124a = c2398d;
        this.f30125b = abstractC2400f;
        this.f30126c = abstractC2400f2;
        this.f30127d = abstractC2400f3;
    }

    public static final C3005I a(C2398d c2398d, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        AbstractC3557B.c0("context", c2398d);
        AbstractC3557B.c0("developerSettingsStore", abstractC2400f);
        AbstractC3557B.c0("serverStatusService", abstractC2400f2);
        AbstractC3557B.c0("sunsetService", abstractC2400f3);
        return new C3005I(c2398d, abstractC2400f, abstractC2400f2, abstractC2400f3);
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f30124a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f30125b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f30126c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f30127d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new C3004H((Application) obj, (AbstractC4617d) obj2, (pd.t) obj3, (AbstractC5304a) obj4);
    }
}
