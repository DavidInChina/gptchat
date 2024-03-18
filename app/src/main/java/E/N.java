package E;

import A.AbstractC0044t0;
import b0.C2104h;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.List;
import java.util.NoSuchElementException;
import w.C6077x;
import y.AbstractC6463a;
import z.AbstractC6708l;
import z.C6686a;

/* loaded from: classes.dex */
public final class N implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0425i f3797a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0427k f3798b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3799c;

    /* renamed from: d  reason: collision with root package name */
    public final r.f f3800d;

    /* renamed from: e  reason: collision with root package name */
    public final float f3801e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3802f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public final M f3803g = M.f3785Z;

    /* renamed from: h  reason: collision with root package name */
    public final M f3804h = M.f3786h0;

    /* renamed from: i  reason: collision with root package name */
    public final M f3805i = M.f3787i0;

    public N(C0426j c0426j, float f6, E e10, float f10) {
        C0423g c0423g = AbstractC0429m.f3909c;
        this.f3797a = c0426j;
        this.f3798b = c0423g;
        this.f3799c = f6;
        this.f3800d = e10;
        this.f3801e = f10;
    }

    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        float f6;
        Integer num;
        Integer num2;
        int i10;
        List list2 = list;
        boolean isEmpty = list.isEmpty();
        kf.w wVar = kf.w.f37484Y;
        if (isEmpty) {
            return p10.j0(0, 0, wVar, C0433q.f3940i0);
        }
        E0.d0[] d0VarArr = new E0.d0[list.size()];
        kf.w wVar2 = wVar;
        n0 n0Var = new n0(1, this.f3797a, this.f3798b, this.f3799c, this.f3800d, list, d0VarArr);
        long i11 = androidx.compose.foundation.layout.a.i(j6, 1);
        C2104h c2104h = new C2104h(new l0[16]);
        int h10 = Z0.a.h(i11);
        int j10 = Z0.a.j(i11);
        int ceil = (int) Math.ceil(p10.R(f6));
        long m10 = A7.b.m(j10, h10, 0, Z0.a.g(i11));
        E0.M m11 = (E0.M) kf.t.i2(0, list2);
        if (m11 != null) {
            num = Integer.valueOf(L.b(m11, m10, new C6077x(8, d0VarArr)));
        } else {
            num = null;
        }
        Integer[] numArr = new Integer[list.size()];
        int size = list.size();
        int i12 = h10;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i13 < size) {
            AbstractC3557B.Z(num);
            int intValue = num.intValue();
            i14 += intValue;
            i12 -= intValue;
            int i17 = i13 + 1;
            E0.M m12 = (E0.M) kf.t.i2(i17, list2);
            int i18 = size;
            if (m12 != null) {
                num2 = Integer.valueOf(L.b(m12, m10, new J(d0VarArr, i13, 0)) + ceil);
            } else {
                num2 = null;
            }
            if (i17 < list.size() && i17 - i15 < this.f3802f) {
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = 0;
                }
                if (i12 - i10 >= 0) {
                    i13 = i17;
                    size = i18;
                    num = num2;
                    list2 = list;
                }
            }
            int min = Math.min(Math.max(j10, i14), h10);
            numArr[i16] = Integer.valueOf(i17);
            i16++;
            if (num2 != null) {
                num2 = Integer.valueOf(num2.intValue() - ceil);
            } else {
                num2 = null;
            }
            j10 = min;
            i12 = h10;
            i15 = i17;
            i14 = 0;
            i13 = i17;
            size = i18;
            num = num2;
            list2 = list;
        }
        int i19 = 0;
        long x10 = androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.a.j(m10, j10, 0, 14), 1);
        Integer num3 = (Integer) kf.q.n3(0, numArr);
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (num3 != null) {
            l0 c10 = n0Var.c(p10, x10, i20, num3.intValue());
            i21 += c10.f3901a;
            j10 = Math.max(j10, c10.f3902b);
            c2104h.b(c10);
            i20 = num3.intValue();
            i22++;
            num3 = (Integer) kf.q.n3(i22, numArr);
            i19 = i19;
            wVar2 = wVar2;
        }
        kf.w wVar3 = wVar2;
        O o10 = new O(Math.max(j10, Z0.a.j(i11)), Math.max(i21, Z0.a.i(i11)), c2104h);
        int i23 = c2104h.f25569h0;
        int[] iArr = new int[i23];
        for (int i24 = i19; i24 < i23; i24++) {
            iArr[i24] = ((l0) c2104h.f25567Y[i24]).f3901a;
        }
        int[] iArr2 = new int[i23];
        int a02 = ((c2104h.f25569h0 - 1) * p10.a0(this.f3801e)) + o10.f3807b;
        AbstractC0427k abstractC0427k = this.f3798b;
        if (abstractC0427k != null) {
            abstractC0427k.c(p10, a02, iArr, iArr2);
            return p10.j0(A7.b.t0(o10.f3806a, j6), A7.b.s0(a02, j6), wVar3, new C6686a(o10, n0Var, iArr2, p10, 3));
        }
        throw new IllegalArgumentException("null verticalArrangement".toString());
    }

    @Override // E0.N
    public final int b(G0.g0 g0Var, List list, int i10) {
        g0Var.getClass();
        return f(list, i10, R.a.b(this.f3799c, g0Var));
    }

    @Override // E0.N
    public final int c(G0.g0 g0Var, List list, int i10) {
        g0Var.getClass();
        return L.a(list, this.f3805i, this.f3804h, i10, R.a.b(this.f3799c, g0Var), R.a.b(this.f3801e, g0Var), this.f3802f);
    }

    @Override // E0.N
    public final int d(G0.g0 g0Var, List list, int i10) {
        g0Var.getClass();
        return g(list, i10, R.a.b(this.f3799c, g0Var), R.a.b(this.f3801e, g0Var));
    }

    @Override // E0.N
    public final int e(G0.g0 g0Var, List list, int i10) {
        g0Var.getClass();
        return L.a(list, this.f3805i, this.f3804h, i10, R.a.b(this.f3799c, g0Var), R.a.b(this.f3801e, g0Var), this.f3802f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        n10.getClass();
        if (AbstractC3557B.K(this.f3797a, n10.f3797a) && AbstractC3557B.K(this.f3798b, n10.f3798b) && Z0.e.a(this.f3799c, n10.f3799c) && AbstractC3557B.K(this.f3800d, n10.f3800d) && Z0.e.a(this.f3801e, n10.f3801e) && this.f3802f == n10.f3802f) {
            return true;
        }
        return false;
    }

    public final int f(List list, int i10, int i11) {
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i12 < size) {
            int intValue = ((Number) this.f3803g.invoke((E0.r) list.get(i12), Integer.valueOf(i12), Integer.valueOf(i10))).intValue() + i11;
            int i16 = i12 + 1;
            if (i16 - i14 != this.f3802f && i16 != list.size()) {
                i15 += intValue;
            } else {
                i13 = Math.max(i13, (i15 + intValue) - i11);
                i15 = 0;
                i14 = i12;
            }
            i12 = i16;
        }
        return i13;
    }

    public final int g(List list, int i10, int i11, int i12) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            iArr2[i14] = 0;
        }
        int size3 = list.size();
        for (int i15 = 0; i15 < size3; i15++) {
            E0.r rVar = (E0.r) list.get(i15);
            int intValue = ((Number) this.f3805i.invoke(rVar, Integer.valueOf(i15), Integer.valueOf(i10))).intValue();
            iArr[i15] = intValue;
            iArr2[i15] = ((Number) this.f3804h.invoke(rVar, Integer.valueOf(i15), Integer.valueOf(intValue))).intValue();
        }
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            i16 += iArr[i17];
        }
        if (size2 != 0) {
            int i18 = iArr2[0];
            int i19 = 1;
            Cf.f it = new Cf.e(1, size2 - 1, 1).iterator();
            while (it.f3111h0) {
                int i20 = iArr2[it.a()];
                if (i18 < i20) {
                    i18 = i20;
                }
            }
            if (size != 0) {
                int i21 = iArr[0];
                Cf.f it2 = new Cf.e(1, size - 1, 1).iterator();
                while (it2.f3111h0) {
                    int i22 = iArr[it2.a()];
                    if (i21 < i22) {
                        i21 = i22;
                    }
                }
                int i23 = i16;
                while (i21 < i16 && i18 != i10) {
                    i23 = (i21 + i16) / 2;
                    int i24 = i19;
                    i18 = L.a(list, new K(iArr, 0), new K(iArr2, i19), i23, i11, i12, this.f3802f);
                    if (i18 == i10) {
                        break;
                    }
                    if (i18 > i10) {
                        i21 = i23 + 1;
                    } else {
                        i16 = i23 - 1;
                    }
                    i19 = i24;
                }
                return i23;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public final int hashCode() {
        int i10;
        int f6 = AbstractC6708l.f(1) * 31;
        int i11 = 0;
        AbstractC0425i abstractC0425i = this.f3797a;
        if (abstractC0425i == null) {
            i10 = 0;
        } else {
            i10 = abstractC0425i.hashCode();
        }
        int i12 = (f6 + i10) * 31;
        AbstractC0427k abstractC0427k = this.f3798b;
        if (abstractC0427k != null) {
            i11 = abstractC0427k.hashCode();
        }
        return AbstractC6463a.e(this.f3801e, (this.f3800d.hashCode() + AbstractC6708l.d(1, AbstractC6463a.e(this.f3799c, (i12 + i11) * 31, 31), 31)) * 31, 31) + this.f3802f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlowMeasurePolicy(orientation=");
        sb2.append(AbstractC0044t0.M(1));
        sb2.append(", horizontalArrangement=");
        sb2.append(this.f3797a);
        sb2.append(", verticalArrangement=");
        sb2.append(this.f3798b);
        sb2.append(", mainAxisArrangementSpacing=");
        sb2.append((Object) Z0.e.b(this.f3799c));
        sb2.append(", crossAxisSize=");
        sb2.append(AbstractC0044t0.N(1));
        sb2.append(", crossAxisAlignment=");
        sb2.append(this.f3800d);
        sb2.append(", crossAxisArrangementSpacing=");
        sb2.append((Object) Z0.e.b(this.f3801e));
        sb2.append(", maxItemsInMainAxis=");
        return AbstractC2469q0.j(sb2, this.f3802f, ')');
    }
}
