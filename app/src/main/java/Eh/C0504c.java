package Eh;

import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import wh.AbstractC6250o;
import yh.C6633q0;
import yh.l1;

/* renamed from: Eh.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504c implements Hh.b {

    /* renamed from: Y  reason: collision with root package name */
    public final Mh.b f4774Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0505d f4775Z;

    public C0504c(C0505d c0505d, l1 l1Var) {
        Mh.c cVar;
        this.f4775Z = c0505d;
        vh.c cVar2 = (vh.c) ((AbstractC1239q) ((vh.l) ((AbstractC1239q) l1Var.U0()).f(AbstractC1235m.c(c0505d.f4776h0)))).r();
        Mh.d dVar = Mh.d.STATIC;
        if (cVar2.h1(8)) {
            cVar = new Mh.c(Mh.d.STATIC, cVar2);
        } else {
            cVar = new Mh.c(Mh.d.INSTANCE, cVar2);
        }
        this.f4774Y = new Mh.b(cVar);
    }

    @Override // Hh.b
    public final Hh.a a(Nh.l lVar, AbstractC0511j abstractC0511j, AbstractC6250o abstractC6250o) {
        C0505d c0505d = this.f4775Z;
        return c0505d.f(lVar, abstractC0511j, abstractC6250o, C6633q0.i1(c0505d.f4777i0.getClass()), this.f4774Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0504c.class != obj.getClass()) {
            return false;
        }
        if (this.f4774Y.equals(((C0504c) obj).f4774Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4774Y.hashCode() + (C0504c.class.hashCode() * 31);
    }
}
