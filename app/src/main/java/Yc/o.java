package Yc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class o implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f22257a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f22258b;

    public o(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f22257a = abstractC2400f;
        this.f22258b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f22257a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f22258b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new n((ge.d) obj, (l) obj2);
    }
}
