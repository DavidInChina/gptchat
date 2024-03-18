package lb;

import Jc.AbstractC0810d;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import jb.AbstractC3932a;

/* renamed from: lb.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4369f implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f37996a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f37997b;

    public C4369f(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f37996a = abstractC2400f;
        this.f37997b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f37996a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f37997b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new C4368e((AbstractC3932a) obj, (AbstractC0810d) obj2);
    }
}
