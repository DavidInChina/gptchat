package sc;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* renamed from: sc.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5611b implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f45529a;

    public C5611b(AbstractC2400f abstractC2400f) {
        this.f45529a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f45529a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new C5610a((Application) obj);
    }
}
