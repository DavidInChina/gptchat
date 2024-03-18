package y2;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class h0 extends p2.g0 {

    /* renamed from: s0  reason: collision with root package name */
    public static final /* synthetic */ int f50608s0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f50609j0;

    /* renamed from: k0  reason: collision with root package name */
    public final E2.a0 f50610k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f50611l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f50612m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int[] f50613n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int[] f50614o0;

    /* renamed from: p0  reason: collision with root package name */
    public final p2.g0[] f50615p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Object[] f50616q0;

    /* renamed from: r0  reason: collision with root package name */
    public final HashMap f50617r0;

    public h0(p2.g0[] g0VarArr, Object[] objArr, E2.a0 a0Var) {
        this.f50610k0 = a0Var;
        this.f50609j0 = a0Var.f4283b.length;
        int length = g0VarArr.length;
        this.f50615p0 = g0VarArr;
        this.f50613n0 = new int[length];
        this.f50614o0 = new int[length];
        this.f50616q0 = objArr;
        this.f50617r0 = new HashMap();
        int length2 = g0VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            p2.g0 g0Var = g0VarArr[i10];
            this.f50615p0[i13] = g0Var;
            this.f50614o0[i13] = i11;
            this.f50613n0[i13] = i12;
            i11 += g0Var.q();
            i12 += this.f50615p0[i13].j();
            this.f50617r0.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.f50611l0 = i11;
        this.f50612m0 = i12;
    }

    @Override // p2.g0
    public final int b(boolean z10) {
        if (this.f50609j0 == 0) {
            return -1;
        }
        int i10 = 0;
        if (z10) {
            int[] iArr = this.f50610k0.f4283b;
            if (iArr.length > 0) {
                i10 = iArr[0];
            } else {
                i10 = -1;
            }
        }
        do {
            p2.g0[] g0VarArr = this.f50615p0;
            if (g0VarArr[i10].r()) {
                i10 = s(i10, z10);
            } else {
                return this.f50614o0[i10] + g0VarArr[i10].b(z10);
            }
        } while (i10 != -1);
        return -1;
    }

    @Override // p2.g0
    public final int c(Object obj) {
        int i10;
        int c10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f50617r0.get(obj2);
        if (num == null) {
            i10 = -1;
        } else {
            i10 = num.intValue();
        }
        if (i10 == -1 || (c10 = this.f50615p0[i10].c(obj3)) == -1) {
            return -1;
        }
        return this.f50613n0[i10] + c10;
    }

    @Override // p2.g0
    public final int d(boolean z10) {
        int i10;
        int i11 = this.f50609j0;
        if (i11 == 0) {
            return -1;
        }
        if (z10) {
            int[] iArr = this.f50610k0.f4283b;
            if (iArr.length > 0) {
                i10 = iArr[iArr.length - 1];
            } else {
                i10 = -1;
            }
        } else {
            i10 = i11 - 1;
        }
        do {
            p2.g0[] g0VarArr = this.f50615p0;
            if (g0VarArr[i10].r()) {
                i10 = t(i10, z10);
            } else {
                return this.f50614o0[i10] + g0VarArr[i10].d(z10);
            }
        } while (i10 != -1);
        return -1;
    }

    @Override // p2.g0
    public final int f(int i10, int i11, boolean z10) {
        int[] iArr = this.f50614o0;
        int i12 = 0;
        int d10 = AbstractC5530A.d(iArr, i10 + 1, false, false);
        int i13 = iArr[d10];
        p2.g0[] g0VarArr = this.f50615p0;
        p2.g0 g0Var = g0VarArr[d10];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int f6 = g0Var.f(i14, i12, z10);
        if (f6 != -1) {
            return i13 + f6;
        }
        int s10 = s(d10, z10);
        while (s10 != -1 && g0VarArr[s10].r()) {
            s10 = s(s10, z10);
        }
        if (s10 != -1) {
            return g0VarArr[s10].b(z10) + iArr[s10];
        } else if (i11 != 2) {
            return -1;
        } else {
            return b(z10);
        }
    }

    @Override // p2.g0
    public final p2.e0 h(int i10, p2.e0 e0Var, boolean z10) {
        int[] iArr = this.f50613n0;
        int d10 = AbstractC5530A.d(iArr, i10 + 1, false, false);
        int i11 = this.f50614o0[d10];
        this.f50615p0[d10].h(i10 - iArr[d10], e0Var, z10);
        e0Var.f42024h0 += i11;
        if (z10) {
            Object obj = this.f50616q0[d10];
            Object obj2 = e0Var.f42023Z;
            obj2.getClass();
            e0Var.f42023Z = Pair.create(obj, obj2);
        }
        return e0Var;
    }

    @Override // p2.g0
    public final p2.e0 i(Object obj, p2.e0 e0Var) {
        int i10;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f50617r0.get(obj2);
        if (num == null) {
            i10 = -1;
        } else {
            i10 = num.intValue();
        }
        int i11 = this.f50614o0[i10];
        this.f50615p0[i10].i(obj3, e0Var);
        e0Var.f42024h0 += i11;
        e0Var.f42023Z = obj;
        return e0Var;
    }

    @Override // p2.g0
    public final int j() {
        return this.f50612m0;
    }

    @Override // p2.g0
    public final int m(int i10, int i11, boolean z10) {
        int[] iArr = this.f50614o0;
        int i12 = 0;
        int d10 = AbstractC5530A.d(iArr, i10 + 1, false, false);
        int i13 = iArr[d10];
        p2.g0[] g0VarArr = this.f50615p0;
        p2.g0 g0Var = g0VarArr[d10];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int m10 = g0Var.m(i14, i12, z10);
        if (m10 != -1) {
            return i13 + m10;
        }
        int t10 = t(d10, z10);
        while (t10 != -1 && g0VarArr[t10].r()) {
            t10 = t(t10, z10);
        }
        if (t10 != -1) {
            return g0VarArr[t10].d(z10) + iArr[t10];
        } else if (i11 != 2) {
            return -1;
        } else {
            return d(z10);
        }
    }

    @Override // p2.g0
    public final Object n(int i10) {
        int[] iArr = this.f50613n0;
        int d10 = AbstractC5530A.d(iArr, i10 + 1, false, false);
        return Pair.create(this.f50616q0[d10], this.f50615p0[d10].n(i10 - iArr[d10]));
    }

    @Override // p2.g0
    public final p2.f0 o(int i10, p2.f0 f0Var, long j6) {
        int[] iArr = this.f50614o0;
        int d10 = AbstractC5530A.d(iArr, i10 + 1, false, false);
        int i11 = iArr[d10];
        int i12 = this.f50613n0[d10];
        this.f50615p0[d10].o(i10 - i11, f0Var, j6);
        Object obj = this.f50616q0[d10];
        if (!p2.f0.f42041w0.equals(f0Var.f42045Y)) {
            obj = Pair.create(obj, f0Var.f42045Y);
        }
        f0Var.f42045Y = obj;
        f0Var.f42059t0 += i12;
        f0Var.f42060u0 += i12;
        return f0Var;
    }

    @Override // p2.g0
    public final int q() {
        return this.f50611l0;
    }

    public final int s(int i10, boolean z10) {
        if (z10) {
            E2.a0 a0Var = this.f50610k0;
            int i11 = a0Var.f4284c[i10] + 1;
            int[] iArr = a0Var.f4283b;
            if (i11 >= iArr.length) {
                return -1;
            }
            return iArr[i11];
        } else if (i10 >= this.f50609j0 - 1) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public final int t(int i10, boolean z10) {
        if (z10) {
            E2.a0 a0Var = this.f50610k0;
            int i11 = a0Var.f4284c[i10] - 1;
            if (i11 < 0) {
                return -1;
            }
            return a0Var.f4283b[i11];
        } else if (i10 <= 0) {
            return -1;
        } else {
            return i10 - 1;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0(List list, E2.a0 a0Var) {
        this(r0, r1, a0Var);
        p2.g0[] g0VarArr = new p2.g0[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            g0VarArr[i11] = ((V) it.next()).b();
            i11++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((V) it2.next()).a();
            i10++;
        }
    }
}
