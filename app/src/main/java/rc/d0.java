package rc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import ld.C4428a;
import vc.C6024n;

/* loaded from: classes.dex */
public final class d0 implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f44856a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f44857b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f44858c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f44859d;

    public d0(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f44856a = abstractC2400f;
        this.f44857b = abstractC2400f2;
        this.f44858c = abstractC2400f3;
        this.f44859d = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f44856a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f44857b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f44858c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f44859d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new c0((C6024n) obj, (xd.g) obj2, (xd.h) obj3, (C4428a) obj4);
    }
}
