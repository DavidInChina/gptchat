package qc;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import f9.C2959k;
import id.AbstractC3557B;
import ld.C4429b;
import wd.EnumC6206t;

/* loaded from: classes2.dex */
public final class j implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44059a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f44060b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f44061c;

    public j(C2398d c2398d, C2959k c2959k, AbstractC2400f abstractC2400f) {
        this.f44059a = c2398d;
        this.f44060b = c2959k;
        this.f44061c = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44059a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f44060b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f44061c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new i((Application) obj, (EnumC6206t) obj2, (C4429b) obj3);
    }
}
