package Ba;

import Ca.C0290g;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import ld.C4428a;
import ld.C4429b;

/* loaded from: classes.dex */
public final class k implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f2032a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f2033b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f2034c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f2035d;

    public k(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f2032a = abstractC2400f;
        this.f2033b = abstractC2400f2;
        this.f2034c = abstractC2400f3;
        this.f2035d = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f2032a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f2033b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f2034c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f2035d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new j((l) obj, (C4429b) obj2, (C4428a) obj3, (C0290g) obj4);
    }
}
