package Z8;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import u7.C5848d;

/* loaded from: classes.dex */
public final class j1 implements AbstractC2397c {

    /* renamed from: c  reason: collision with root package name */
    public static final C5848d f23358c = new C5848d(21, 0);

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f23359a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f23360b;

    public j1(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f23359a = abstractC2400f;
        this.f23360b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f23359a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f23360b.get();
        AbstractC3557B.b0("get(...)", obj2);
        f23358c.getClass();
        return new i1((p1) obj, (n1) obj2);
    }
}
