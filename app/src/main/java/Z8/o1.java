package Z8;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class o1 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f23396a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f23397b;

    public o1(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f23396a = abstractC2400f;
        this.f23397b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f23396a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f23397b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new n1((Application) obj, (Vc.y) obj2);
    }
}
