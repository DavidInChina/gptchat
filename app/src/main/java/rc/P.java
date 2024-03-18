package rc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import ld.C4428a;
import vc.C6024n;

/* loaded from: classes.dex */
public final class P implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44815a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f44816b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f44817c;

    public P(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f44815a = abstractC2400f;
        this.f44816b = abstractC2400f2;
        this.f44817c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44815a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f44816b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f44817c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new C5451O((C6024n) obj, (C5440D) obj2, (C4428a) obj3);
    }
}
