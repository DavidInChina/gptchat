package Ga;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import jd.AbstractC3949a;

/* loaded from: classes.dex */
public final class G implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f6200a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f6201b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f6202c;

    public G(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, AbstractC2400f abstractC2400f3) {
        this.f6200a = abstractC2400f;
        this.f6201b = abstractC2400f2;
        this.f6202c = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f6200a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f6201b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f6202c.get();
        AbstractC3557B.b0("get(...)", obj3);
        return new E((ge.d) obj, (Yc.a) obj2, (AbstractC3949a) obj3);
    }
}
