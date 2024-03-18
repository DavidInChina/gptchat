package ed;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: ed.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2878d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f29283a;

    public C2878d(AbstractC2400f abstractC2400f) {
        this.f29283a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f29283a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C2877c((Application) obj);
    }
}
