package la;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import id.AbstractC3557B;
import m9.AbstractC4569a;

/* loaded from: classes.dex */
public final class j implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f37907a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f37908b;

    public j(AbstractC2400f abstractC2400f, C2398d c2398d) {
        this.f37907a = abstractC2400f;
        this.f37908b = c2398d;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f37907a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f37908b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new i((AbstractC4569a) obj, (ld.p) obj2);
    }
}
