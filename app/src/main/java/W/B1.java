package W;

import E0.AbstractC0445d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class B1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Z0.l f18990a;

    public B1(Z0.l lVar) {
        this.f18990a = lVar;
    }

    public final E0.O a(E0.P p10, ArrayList arrayList, long j6) {
        E0.d0 d0Var;
        E0.d0 d0Var2;
        E0.d0 d0Var3;
        E0.d0 d0Var4;
        E0.d0 d0Var5;
        boolean z10;
        E0.d0 d0Var6;
        boolean z11;
        boolean z12;
        char c10;
        char c11;
        boolean z13;
        float f6;
        int f10;
        float f11;
        int i10;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(4);
        long a5 = Z0.a.a(j6, 0, 0, 0, 0, 10);
        float f12 = E1.f19082c;
        float f13 = E1.f19083d;
        float f14 = E1.f19080a;
        long n12 = A7.b.n1(a5, -p10.a0(f12 + f13), -p10.a0(2 * f14));
        E0.M m10 = (E0.M) kf.t.h2((List) arrayList.get(3));
        if (m10 != null) {
            d0Var = m10.o(n12);
        } else {
            d0Var = null;
        }
        int f15 = X3.f(d0Var);
        E0.M m11 = (E0.M) kf.t.h2(list4);
        if (m11 != null) {
            d0Var2 = m11.o(A7.b.o1(-f15, 0, 2, n12));
        } else {
            d0Var2 = null;
        }
        int f16 = X3.f(d0Var2) + f15;
        E0.M m12 = (E0.M) kf.t.h2(list);
        if (m12 != null) {
            d0Var3 = d0Var2;
            d0Var4 = m12.o(A7.b.o1(-f16, 0, 2, n12));
        } else {
            d0Var3 = d0Var2;
            d0Var4 = null;
        }
        int e10 = X3.e(d0Var4);
        E0.M m13 = (E0.M) kf.t.h2(list3);
        if (m13 != null) {
            d0Var5 = m13.o(A7.b.n1(n12, -f16, -e10));
        } else {
            d0Var5 = null;
        }
        int e11 = X3.e(d0Var5) + e10;
        if (d0Var5 != null && d0Var5.G(AbstractC0445d.f4051a) != d0Var5.G(AbstractC0445d.f4052b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        E0.M m14 = (E0.M) kf.t.h2(list2);
        if (m14 != null) {
            d0Var6 = m14.o(A7.b.n1(n12, -f16, -e11));
        } else {
            d0Var6 = null;
        }
        if (d0Var6 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (d0Var5 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((z11 && z12) || z10) {
            c11 = 3;
            c10 = 3;
        } else if (!z11 && !z12) {
            c11 = 3;
            c10 = 1;
        } else {
            c11 = 3;
            c10 = 2;
        }
        if (c10 == c11) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            f6 = E1.f19081b;
        } else {
            f6 = f14;
        }
        if (z13) {
            f14 = E1.f19081b;
        }
        float f17 = f14;
        E.i0 i0Var = new E.i0(f12, f6, f13, f17);
        if (Z0.a.d(j6)) {
            f10 = Z0.a.h(j6);
        } else {
            Z0.l lVar = this.f18990a;
            int a02 = p10.a0(i0Var.c(lVar) + i0Var.b(lVar));
            f10 = X3.f(d0Var3) + X3.f(d0Var) + a02 + Math.max(X3.f(d0Var4), Math.max(X3.f(d0Var6), X3.f(d0Var5)));
        }
        int i11 = f10;
        if (c10 == 1) {
            f11 = X.u.f21638f;
        } else if (c10 == 2) {
            f11 = X.u.f21643k;
        } else {
            f11 = X.u.f21641i;
        }
        float f18 = f17 + f6;
        int max = Math.max(Math.max(Z0.a.i(j6), p10.a0(f11)), Math.max(X3.e(d0Var), Math.max(X3.e(d0Var5) + X3.e(d0Var6) + X3.e(d0Var4), X3.e(d0Var3))) + p10.a0(f18));
        int g10 = Z0.a.g(j6);
        if (max > g10) {
            i10 = g10;
        } else {
            i10 = max;
        }
        return p10.j0(i11, i10, kf.w.f37484Y, new D1(i10, i11, i0Var, p10, d0Var, d0Var3, d0Var4, d0Var6, d0Var5, this.f18990a, z13));
    }
}
