package eb;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: eb.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2830f implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f29121a;

    public C2830f(AbstractC2400f abstractC2400f) {
        this.f29121a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f29121a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C2829e((Application) obj);
    }
}
