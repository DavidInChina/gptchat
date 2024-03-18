package Zc;

import Ii.q;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2401g;
import id.AbstractC3557B;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final q f23667a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f23668b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f23669c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f23670d;

    public b(q qVar, AbstractC2400f abstractC2400f, C2401g c2401g, C2401g c2401g2) {
        this.f23667a = qVar;
        this.f23668b = abstractC2400f;
        this.f23669c = c2401g;
        this.f23670d = c2401g2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f23668b.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f23669c.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = this.f23670d.get();
        AbstractC3557B.b0("get(...)", obj3);
        q qVar = this.f23667a;
        AbstractC3557B.c0("module", qVar);
        return qVar.m((ge.d) obj, (Set) obj2, (Set) obj3);
    }
}
