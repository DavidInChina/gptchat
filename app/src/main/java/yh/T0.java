package yh;

import Bh.AbstractC0265q;
import java.util.List;
import k6.AbstractC4194d;
import yh.l1;

/* loaded from: classes.dex */
public final class T0 implements k1 {

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f50970Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f50971Z;

    public T0(AbstractC0265q abstractC0265q, List list) {
        this.f50970Y = abstractC0265q;
        this.f50971Z = list;
    }

    @Override // yh.k1
    public final Object a(l1.a aVar) {
        l1.a aVar2 = aVar;
        int i10 = 0;
        do {
            aVar2 = aVar2.mo119g();
            i10++;
        } while (aVar2.T0());
        boolean c10 = aVar2.c().c();
        l1 l1Var = this.f50970Y;
        if (c10) {
            for (I1 i12 : this.f50971Z) {
                if (aVar2.A0().equals(i12.f50947a)) {
                    return C6637t.l1((l1) ((l1.a) new t1(i12.f50948b).get(0)).k(this), i10);
                }
            }
            return zh.H.a(C6637t.l1(l1Var.O0(aVar2.A0()).l0(), i10), l1Var);
        }
        return zh.H.a(aVar.l0(), l1Var);
    }

    @Override // yh.k1
    public final Object b(l1.a aVar) {
        return zh.H.a(aVar.l0(), this.f50970Y);
    }

    @Override // yh.k1
    public final Object c(l1.a aVar) {
        return zh.H.a(aVar.l0(), this.f50970Y);
    }

    @Override // yh.k1
    public final Object d(l1.a aVar) {
        throw new IllegalStateException("A wildcard cannot be a top-level type: " + aVar);
    }

    @Override // yh.k1
    public final Object e(l1.a aVar) {
        for (I1 i12 : this.f50971Z) {
            if (aVar.A0().equals(i12.f50947a)) {
                return (l1) ((l1.a) new t1(i12.f50948b).get(0)).k(this);
            }
        }
        String A02 = aVar.A0();
        l1 l1Var = this.f50970Y;
        return zh.H.a(l1Var.O0(A02).l0(), l1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T0.class != obj.getClass()) {
            return false;
        }
        T0 t02 = (T0) obj;
        if (this.f50970Y.equals(t02.f50970Y) && this.f50971Z.equals(t02.f50971Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50971Z.hashCode() + AbstractC4194d.t(this.f50970Y, T0.class.hashCode() * 31, 31);
    }
}
