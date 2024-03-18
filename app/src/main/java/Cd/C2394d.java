package cd;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import dd.AbstractC2625a;
import id.AbstractC3557B;

/* renamed from: cd.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2394d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f26592a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f26593b;

    public C2394d(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f26592a = abstractC2400f;
        this.f26593b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f26592a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f26593b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new C2393c((Application) obj, (AbstractC2625a) obj2);
    }
}
