package Kf;

import Bg.AbstractC0209b;
import Bg.C0213f;
import Bg.Q;
import Jf.q;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.B;
import Mf.Y;
import Mf.Z;
import Mf.b0;
import Pf.I;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k6.AbstractC4194d;
import kf.t;
import kf.v;
import kg.C4290b;
import l8.AbstractC4344b;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class b extends AbstractC0209b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f9789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar.f9792j0);
        this.f9789c = cVar;
    }

    @Override // Bg.AbstractC0218k
    public final Collection b() {
        List<C4290b> list;
        Iterable<b0> iterable;
        c cVar = this.f9789c;
        k kVar = cVar.f9794l0;
        g gVar = g.f9801c;
        if (AbstractC3557B.K(kVar, gVar)) {
            list = AbstractC4344b.F0(c.f9790q0);
        } else if (AbstractC3557B.K(kVar, h.f9802c)) {
            list = AbstractC4344b.G0(c.f9791r0, new C4290b(q.f9204k, gVar.a(cVar.f9795m0)));
        } else {
            j jVar = j.f9804c;
            if (AbstractC3557B.K(kVar, jVar)) {
                list = AbstractC4344b.F0(c.f9790q0);
            } else if (AbstractC3557B.K(kVar, i.f9803c)) {
                list = AbstractC4344b.G0(c.f9791r0, new C4290b(q.f9199f, jVar.a(cVar.f9795m0)));
            } else {
                int i10 = Jg.a.f9225a;
                throw new IllegalStateException("should not be called".toString());
            }
        }
        B mo20k = ((I) cVar.f9793k0).mo20k();
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (C4290b c4290b : list) {
            AbstractC0997f s02 = R4.b.s0(mo20k, c4290b);
            if (s02 != null) {
                List list2 = cVar.f9798p0;
                int size = s02.f().getParameters().size();
                AbstractC3557B.c0("<this>", list2);
                if (size >= 0) {
                    if (size == 0) {
                        iterable = v.f37483Y;
                    } else {
                        int size2 = list2.size();
                        if (size >= size2) {
                            iterable = t.K2(list2);
                        } else if (size == 1) {
                            iterable = AbstractC4344b.F0(t.o2(list2));
                        } else {
                            ArrayList arrayList2 = new ArrayList(size);
                            if (list2 instanceof RandomAccess) {
                                for (int i11 = size2 - size; i11 < size2; i11++) {
                                    arrayList2.add(list2.get(i11));
                                }
                            } else {
                                ListIterator listIterator = list2.listIterator(size2 - size);
                                while (listIterator.hasNext()) {
                                    arrayList2.add(listIterator.next());
                                }
                            }
                            iterable = arrayList2;
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(iterable, 10));
                    for (b0 b0Var : iterable) {
                        arrayList3.add(new Bg.I(b0Var.n()));
                    }
                    Q.f2084Z.getClass();
                    arrayList.add(C0213f.l(Q.f2085h0, s02, arrayList3));
                } else {
                    throw new IllegalArgumentException(AbstractC4194d.v("Requested element count ", size, " is less than zero.").toString());
                }
            } else {
                throw new IllegalStateException(("Built-in class " + c4290b + " not found").toString());
            }
        }
        return t.K2(arrayList);
    }

    @Override // Bg.AbstractC0218k
    public final Z f() {
        return Y.f12077a;
    }

    @Override // Bg.Y
    public final List getParameters() {
        return this.f9789c.f9798p0;
    }

    @Override // Bg.AbstractC0209b, Bg.Y
    public final AbstractC1000i k() {
        return this.f9789c;
    }

    @Override // Bg.Y
    public final boolean m() {
        return true;
    }

    @Override // Bg.AbstractC0209b
    public final AbstractC0997f q() {
        return this.f9789c;
    }

    public final String toString() {
        return this.f9789c.toString();
    }
}
