package S8;

import A.AbstractC0044t0;
import G0.g0;
import L.C0840c;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC4194d;

/* renamed from: S8.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1375t implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16373a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f16374b;

    public C1375t(int i10, float f6) {
        this.f16373a = i10;
        this.f16374b = f6;
    }

    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        Kg.k kVar;
        Object obj;
        int i10;
        AbstractC3557B.c0("$this$Layout", p10);
        AbstractC3557B.c0("measurables", list);
        int size = list.size();
        int i11 = this.f16373a;
        if (size == i11 * 2) {
            kf.p V12 = kf.t.V1(list);
            if (i11 >= 0) {
                if (i11 == 0) {
                    kVar = Kg.d.f9815a;
                } else if (V12 instanceof Kg.c) {
                    kVar = ((Kg.c) V12).a(i11);
                } else {
                    kVar = new Kg.b(V12, i11, 1);
                }
                Kg.k g1 = Kg.m.g1(kf.t.V1(list), i11);
                List p12 = Kg.m.p1(Kg.m.n1(kVar, C1358b.f16306n0));
                Iterator it = p12.iterator();
                Object obj2 = null;
                if (!it.hasNext()) {
                    obj = null;
                } else {
                    obj = it.next();
                    if (it.hasNext()) {
                        int i12 = ((E0.d0) obj).f4053Y;
                        do {
                            Object next = it.next();
                            int i13 = ((E0.d0) next).f4053Y;
                            if (i12 < i13) {
                                obj = next;
                                i12 = i13;
                            }
                        } while (it.hasNext());
                    }
                }
                AbstractC3557B.Z(obj);
                E0.d0 d0Var = (E0.d0) obj;
                int h10 = Z0.a.h(j6) - d0Var.f4053Y;
                int i14 = 0;
                if (h10 < 0) {
                    i10 = 0;
                } else {
                    i10 = h10;
                }
                List<E0.d0> p13 = Kg.m.p1(Kg.m.n1(g1, new C0840c(Z0.a.a(j6, 0, i10, 0, 0, 13), 4)));
                Iterator it2 = p13.iterator();
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (it2.hasNext()) {
                        int i15 = ((E0.d0) obj2).f4053Y;
                        do {
                            Object next2 = it2.next();
                            int i16 = ((E0.d0) next2).f4053Y;
                            if (i15 < i16) {
                                obj2 = next2;
                                i15 = i16;
                            }
                        } while (it2.hasNext());
                    }
                }
                AbstractC3557B.Z(obj2);
                int i17 = d0Var.f4053Y + ((E0.d0) obj2).f4053Y;
                for (E0.d0 d0Var2 : p13) {
                    i14 += d0Var2.f4054Z;
                }
                return p10.j0(i17, i14 + (p10.a0(this.f16374b) * (p13.size() - 1)), kf.w.f37484Y, new C1374s(this.f16373a, p12, p13, p10, this.f16374b, d0Var));
            }
            throw new IllegalArgumentException(AbstractC4194d.v("Requested element count ", i11, " is less than zero.").toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // E0.N
    public final /* synthetic */ int b(g0 g0Var, List list, int i10) {
        return AbstractC0044t0.d(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int c(g0 g0Var, List list, int i10) {
        return AbstractC0044t0.f(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int d(g0 g0Var, List list, int i10) {
        return AbstractC0044t0.h(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int e(g0 g0Var, List list, int i10) {
        return AbstractC0044t0.b(this, g0Var, list, i10);
    }
}
