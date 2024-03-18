package rd;

import android.app.Application;
import ce.AbstractC2397c;
import ce.C2398d;
import id.AbstractC3557B;

/* renamed from: rd.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5478b implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44948a;

    public C5478b(C2398d c2398d) {
        this.f44948a = c2398d;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44948a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C5477a((Application) obj);
    }
}
