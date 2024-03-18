package rb;

import android.app.Application;
import ce.AbstractC2397c;
import ce.C2398d;
import id.AbstractC3557B;

/* renamed from: rb.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5403D implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44654a;

    public C5403D(C2398d c2398d) {
        this.f44654a = c2398d;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44654a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C5402C((Application) obj);
    }
}
