package mb;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import id.AbstractC3557B;
import ld.C4428a;
import ld.C4429b;

/* renamed from: mb.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4604q implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f39086a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f39087b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f39088c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f39089d;

    public C4604q(C2398d c2398d, C2398d c2398d2, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f39086a = c2398d;
        this.f39087b = c2398d2;
        this.f39088c = abstractC2400f;
        this.f39089d = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f39086a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f39087b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f39088c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f39089d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new C4603p((Application) obj, (C4428a) obj2, (C4429b) obj3, (C4607t) obj4);
    }
}
