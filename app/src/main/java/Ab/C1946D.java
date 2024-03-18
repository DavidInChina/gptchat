package ab;

import androidx.lifecycle.P;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import zb.AbstractC6810a;

/* renamed from: ab.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1946D implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f24063a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f24064b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f24065c;

    public C1946D(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f24063a = abstractC2400f;
        this.f24064b = abstractC2400f2;
        this.f24065c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f24063a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f24064b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f24065c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new C1945C((P) obj, (Va.e) obj2, (AbstractC6810a) obj3);
    }
}
