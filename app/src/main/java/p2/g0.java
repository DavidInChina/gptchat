package p2;

import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public abstract class g0 implements AbstractC5057j {

    /* renamed from: Y  reason: collision with root package name */
    public static final d0 f42063Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final String f42064Z = Integer.toString(0, 36);

    /* renamed from: h0  reason: collision with root package name */
    public static final String f42065h0 = Integer.toString(1, 36);

    /* renamed from: i0  reason: collision with root package name */
    public static final String f42066i0 = Integer.toString(2, 36);

    /* JADX WARN: Type inference failed for: r0v0, types: [p2.d0, java.lang.Object] */
    static {
        int i10 = AbstractC5530A.f45131a;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        ArrayList arrayList = new ArrayList();
        int q10 = q();
        f0 f0Var = new f0();
        for (int i10 = 0; i10 < q10; i10++) {
            arrayList.add(o(i10, f0Var, 0L).a());
        }
        ArrayList arrayList2 = new ArrayList();
        int j6 = j();
        e0 e0Var = new e0();
        for (int i11 = 0; i11 < j6; i11++) {
            arrayList2.add(h(i11, e0Var, false).a());
        }
        int[] iArr = new int[q10];
        if (q10 > 0) {
            iArr[0] = b(true);
        }
        for (int i12 = 1; i12 < q10; i12++) {
            iArr[i12] = f(iArr[i12 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        K4.J.Q(bundle, f42064Z, new BinderC5055h(arrayList));
        K4.J.Q(bundle, f42065h0, new BinderC5055h(arrayList2));
        bundle.putIntArray(f42066i0, iArr);
        return bundle;
    }

    public int b(boolean z10) {
        if (r()) {
            return -1;
        }
        return 0;
    }

    public abstract int c(Object obj);

    public int d(boolean z10) {
        if (r()) {
            return -1;
        }
        return q() - 1;
    }

    public final int e(int i10, e0 e0Var, f0 f0Var, int i11, boolean z10) {
        int i12 = h(i10, e0Var, false).f42024h0;
        if (o(i12, f0Var, 0L).f42060u0 == i10) {
            int f6 = f(i12, i11, z10);
            if (f6 == -1) {
                return -1;
            }
            return o(f6, f0Var, 0L).f42059t0;
        }
        return i10 + 1;
    }

    public final boolean equals(Object obj) {
        int d10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (g0Var.q() != q() || g0Var.j() != j()) {
            return false;
        }
        f0 f0Var = new f0();
        e0 e0Var = new e0();
        f0 f0Var2 = new f0();
        e0 e0Var2 = new e0();
        for (int i10 = 0; i10 < q(); i10++) {
            if (!o(i10, f0Var, 0L).equals(g0Var.o(i10, f0Var2, 0L))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < j(); i11++) {
            if (!h(i11, e0Var, true).equals(g0Var.h(i11, e0Var2, true))) {
                return false;
            }
        }
        int b10 = b(true);
        if (b10 != g0Var.b(true) || (d10 = d(true)) != g0Var.d(true)) {
            return false;
        }
        while (b10 != d10) {
            int f6 = f(b10, 0, true);
            if (f6 != g0Var.f(b10, 0, true)) {
                return false;
            }
            b10 = f6;
        }
        return true;
    }

    public int f(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == d(z10)) {
                        return b(z10);
                    }
                    return i10 + 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        } else if (i10 == d(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public final e0 g(int i10, e0 e0Var) {
        return h(i10, e0Var, false);
    }

    public abstract e0 h(int i10, e0 e0Var, boolean z10);

    public final int hashCode() {
        f0 f0Var = new f0();
        e0 e0Var = new e0();
        int q10 = q() + 217;
        for (int i10 = 0; i10 < q(); i10++) {
            q10 = (q10 * 31) + o(i10, f0Var, 0L).hashCode();
        }
        int j6 = j() + (q10 * 31);
        for (int i11 = 0; i11 < j(); i11++) {
            j6 = (j6 * 31) + h(i11, e0Var, true).hashCode();
        }
        int b10 = b(true);
        while (b10 != -1) {
            j6 = (j6 * 31) + b10;
            b10 = f(b10, 0, true);
        }
        return j6;
    }

    public e0 i(Object obj, e0 e0Var) {
        return h(c(obj), e0Var, true);
    }

    public abstract int j();

    public final Pair k(f0 f0Var, e0 e0Var, int i10, long j6) {
        Pair l10 = l(f0Var, e0Var, i10, j6, 0L);
        l10.getClass();
        return l10;
    }

    public final Pair l(f0 f0Var, e0 e0Var, int i10, long j6, long j10) {
        Gi.e.m(i10, q());
        o(i10, f0Var, j10);
        if (j6 == -9223372036854775807L) {
            j6 = f0Var.f42057r0;
            if (j6 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = f0Var.f42059t0;
        h(i11, e0Var, false);
        while (i11 < f0Var.f42060u0 && e0Var.f42026j0 != j6) {
            int i12 = i11 + 1;
            if (h(i12, e0Var, false).f42026j0 > j6) {
                break;
            }
            i11 = i12;
        }
        h(i11, e0Var, true);
        long j11 = j6 - e0Var.f42026j0;
        long j12 = e0Var.f42025i0;
        if (j12 != -9223372036854775807L) {
            j11 = Math.min(j11, j12 - 1);
        }
        long max = Math.max(0L, j11);
        Object obj = e0Var.f42023Z;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int m(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == b(z10)) {
                        return d(z10);
                    }
                    return i10 - 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        } else if (i10 == b(z10)) {
            return -1;
        } else {
            return i10 - 1;
        }
    }

    public abstract Object n(int i10);

    public abstract f0 o(int i10, f0 f0Var, long j6);

    public final void p(int i10, f0 f0Var) {
        o(i10, f0Var, 0L);
    }

    public abstract int q();

    public final boolean r() {
        if (q() == 0) {
            return true;
        }
        return false;
    }
}
