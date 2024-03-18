package zg;

import Bg.p0;
import M3.I;
import Mf.AbstractC1003l;
import Mf.Y;
import Pf.AbstractC1145c;
import Uf.A;
import fg.Q;
import fg.V;
import fg.W;
import hg.C3430i;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kg.C4294f;
import l8.AbstractC4344b;
import rg.AbstractC5493d;
import xg.K;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class u extends AbstractC1145c {

    /* renamed from: p0  reason: collision with root package name */
    public final I f52101p0;

    /* renamed from: q0  reason: collision with root package name */
    public final W f52102q0;

    /* renamed from: r0  reason: collision with root package name */
    public final C6854a f52103r0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(I i10, W w10, int i11) {
        super(r2, r3, r4, r5, r0, w10.f30456k0, i11, Y.f12077a);
        p0 p0Var;
        AbstractC3557B.c0("c", i10);
        Ag.u c10 = i10.c();
        AbstractC1003l abstractC1003l = (AbstractC1003l) i10.f11538c;
        Nf.g gVar = Nf.h.f12822a;
        C4294f o12 = R4.b.o1(i10.f11537b, w10.f30455j0);
        V v10 = w10.f30457l0;
        AbstractC3557B.b0("getVariance(...)", v10);
        int ordinal = v10.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    p0Var = p0.f2146h0;
                } else {
                    throw new RuntimeException();
                }
            } else {
                p0Var = p0.f2148j0;
            }
        } else {
            p0Var = p0.f2147i0;
        }
        this.f52101p0 = i10;
        this.f52102q0 = w10;
        this.f52103r0 = new C6854a(i10.c(), new A(13, this));
    }

    @Override // Nf.b, Nf.a
    public final Nf.i getAnnotations() {
        return this.f52103r0;
    }

    @Override // Pf.AbstractC1153k
    public final void x0(Bg.A a5) {
        AbstractC3557B.c0("type", a5);
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // Pf.AbstractC1153k
    public final List y0() {
        I i10 = this.f52101p0;
        C3430i c3430i = (C3430i) i10.f11539d;
        W w10 = this.f52102q0;
        AbstractC3557B.c0("<this>", w10);
        AbstractC3557B.c0("typeTable", c3430i);
        List<Q> list = w10.f30458m0;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = w10.f30459n0;
            AbstractC3557B.b0("getUpperBoundIdList(...)", list2);
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list2, 10));
            for (Integer num : list2) {
                AbstractC3557B.Z(num);
                arrayList.add(c3430i.a(num.intValue()));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return AbstractC4344b.F0(AbstractC5493d.e(this).m());
        }
        K k10 = (K) i10.f11543h;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
        for (Q q10 : list) {
            arrayList2.add(k10.g(q10));
        }
        return arrayList2;
    }
}
