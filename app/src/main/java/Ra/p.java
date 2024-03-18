package Ra;

import androidx.lifecycle.P;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2395a;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class p implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f15232a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f15233b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f15234c;

    public p(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, C2395a c2395a) {
        this.f15232a = abstractC2400f;
        this.f15233b = abstractC2400f2;
        this.f15234c = c2395a;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f15232a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f15233b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f15234c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new o((P) obj, (xd.f) obj2, (g) obj3);
    }
}
