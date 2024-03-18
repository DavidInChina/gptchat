package F9;

import Jc.AbstractC0810d;
import androidx.lifecycle.P;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class n implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f5105a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f5106b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f5107c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f5108d;

    public n(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, Ua.d dVar, AbstractC2400f abstractC2400f3) {
        this.f5105a = abstractC2400f;
        this.f5106b = abstractC2400f2;
        this.f5107c = dVar;
        this.f5108d = abstractC2400f3;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f5105a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f5106b.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f5107c.get();
        AbstractC3557B.b0("get(...)", obj3);
        Object obj4 = this.f5108d.get();
        AbstractC3557B.b0("get(...)", obj4);
        return new m((P) obj, (AbstractC0810d) obj2, (Ic.a) obj3, (xd.f) obj4);
    }
}
