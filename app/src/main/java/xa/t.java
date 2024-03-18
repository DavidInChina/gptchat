package xa;

import L9.AbstractC0904j;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import ld.C4428a;

/* loaded from: classes.dex */
public final class t implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f49772a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f49773b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f49774c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f49775d;

    public t(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3, AbstractC2400f abstractC2400f4) {
        this.f49772a = abstractC2400f;
        this.f49773b = abstractC2400f2;
        this.f49774c = abstractC2400f3;
        this.f49775d = abstractC2400f4;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f49772a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f49773b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f49774c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f49775d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new s((AbstractC0904j) obj, (U9.a) obj2, (xd.h) obj3, (C4428a) obj4);
    }
}
