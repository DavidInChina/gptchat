package wa;

import androidx.lifecycle.P;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import id.AbstractC3557B;

/* renamed from: wa.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6152d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f48262a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f48263b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f48264c;

    public C6152d(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, C2398d c2398d) {
        this.f48262a = abstractC2400f;
        this.f48263b = abstractC2400f2;
        this.f48264c = c2398d;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f48262a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f48263b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f48264c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new C6151c((Qc.b) obj, (T9.a) obj2, (P) obj3);
    }
}
