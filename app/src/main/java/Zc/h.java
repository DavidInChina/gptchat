package Zc;

import Ii.q;
import b4.C2120a;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2401g;
import id.AbstractC3557B;
import java.util.Set;

/* loaded from: classes2.dex */
public final class h implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final q f23689a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f23690b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f23691c;

    public h(q qVar, AbstractC2400f abstractC2400f, C2401g c2401g) {
        this.f23689a = qVar;
        this.f23690b = abstractC2400f;
        this.f23691c = c2401g;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f23690b.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f23691c.get();
        AbstractC3557B.b0("get(...)", obj2);
        AbstractC3557B.c0("module", this.f23689a);
        return ((ge.d) obj).a(new C2120a((Set) obj2, 3));
    }
}
