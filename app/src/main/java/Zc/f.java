package Zc;

import Ii.q;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2401g;
import id.AbstractC3557B;
import java.util.Set;

/* loaded from: classes2.dex */
public final class f implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final q f23684a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f23685b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f23686c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f23687d;

    public f(q qVar, AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2, C2401g c2401g) {
        this.f23684a = qVar;
        this.f23685b = abstractC2400f;
        this.f23686c = abstractC2400f2;
        this.f23687d = c2401g;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f23685b.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f23686c.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f23687d.get();
        AbstractC3557B.b0("get(...)", obj3);
        q qVar = this.f23684a;
        AbstractC3557B.c0("module", qVar);
        return qVar.m((ge.d) obj, (Set) obj2, (Set) obj3);
    }
}
