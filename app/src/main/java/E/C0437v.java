package E;

import A.AbstractC0044t0;
import id.AbstractC3557B;
import java.util.List;
import l0.AbstractC4313e;
import y.AbstractC6463a;

/* renamed from: E.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437v implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4313e f3966a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3967b;

    public C0437v(AbstractC4313e abstractC4313e, boolean z10) {
        this.f3966a = abstractC4313e;
        this.f3967b = z10;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.jvm.internal.z] */
    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        long j10;
        int i10;
        int i11;
        C0431o c0431o;
        C0431o c0431o2;
        C0431o c0431o3;
        int i12;
        int i13;
        E0.d0 d0Var;
        boolean isEmpty = list.isEmpty();
        kf.w wVar = kf.w.f37484Y;
        if (isEmpty) {
            return p10.j0(Z0.a.j(j6), Z0.a.i(j6), wVar, C0433q.f3939h0);
        }
        if (this.f3967b) {
            j10 = j6;
        } else {
            j10 = Z0.a.a(j6, 0, 0, 0, 0, 10);
        }
        if (list.size() == 1) {
            E0.M m10 = (E0.M) list.get(0);
            Object u10 = m10.u();
            if (u10 instanceof C0431o) {
                c0431o3 = (C0431o) u10;
            } else {
                c0431o3 = null;
            }
            if (c0431o3 != null && c0431o3.f3930t0) {
                i13 = Z0.a.j(j6);
                i12 = Z0.a.i(j6);
                d0Var = m10.o(H0.B0.d(Z0.a.j(j6), Z0.a.i(j6)));
            } else {
                E0.d0 o10 = m10.o(j10);
                i13 = Math.max(Z0.a.j(j6), o10.f4053Y);
                i12 = Math.max(Z0.a.i(j6), o10.f4054Z);
                d0Var = o10;
            }
            return p10.j0(i13, i12, wVar, new C0435t(d0Var, m10, p10, i13, i12, this));
        }
        E0.d0[] d0VarArr = new E0.d0[list.size()];
        ?? obj = new Object();
        obj.f37647Y = Z0.a.j(j6);
        ?? obj2 = new Object();
        obj2.f37647Y = Z0.a.i(j6);
        int size = list.size();
        boolean z10 = false;
        for (int i14 = 0; i14 < size; i14++) {
            E0.M m11 = (E0.M) list.get(i14);
            Object u11 = m11.u();
            if (u11 instanceof C0431o) {
                c0431o2 = (C0431o) u11;
            } else {
                c0431o2 = null;
            }
            if (c0431o2 != null && c0431o2.f3930t0) {
                z10 = true;
            } else {
                E0.d0 o11 = m11.o(j10);
                d0VarArr[i14] = o11;
                obj.f37647Y = Math.max(obj.f37647Y, o11.f4053Y);
                obj2.f37647Y = Math.max(obj2.f37647Y, o11.f4054Z);
            }
        }
        if (z10) {
            int i15 = obj.f37647Y;
            if (i15 != Integer.MAX_VALUE) {
                i10 = i15;
            } else {
                i10 = 0;
            }
            int i16 = obj2.f37647Y;
            if (i16 != Integer.MAX_VALUE) {
                i11 = i16;
            } else {
                i11 = 0;
            }
            long m12 = A7.b.m(i10, i15, i11, i16);
            int size2 = list.size();
            for (int i17 = 0; i17 < size2; i17++) {
                E0.M m13 = (E0.M) list.get(i17);
                Object u12 = m13.u();
                if (u12 instanceof C0431o) {
                    c0431o = (C0431o) u12;
                } else {
                    c0431o = null;
                }
                if (c0431o != null && c0431o.f3930t0) {
                    d0VarArr[i17] = m13.o(m12);
                }
            }
        }
        return p10.j0(obj.f37647Y, obj2.f37647Y, wVar, new C0436u(d0VarArr, list, p10, obj, obj2, this, 0));
    }

    @Override // E0.N
    public final /* synthetic */ int b(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.d(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int c(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.f(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int d(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.h(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int e(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.b(this, g0Var, list, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0437v)) {
            return false;
        }
        C0437v c0437v = (C0437v) obj;
        if (AbstractC3557B.K(this.f3966a, c0437v.f3966a) && this.f3967b == c0437v.f3967b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3966a.hashCode() * 31;
        if (this.f3967b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb2.append(this.f3966a);
        sb2.append(", propagateMinConstraints=");
        return AbstractC6463a.l(sb2, this.f3967b, ')');
    }
}
