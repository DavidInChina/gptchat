package G2;

import g3.C3158a;
import java.util.ArrayList;
import p2.Y;
import x8.C6376u;
import x8.F;
import x8.K;
import x8.N;
import x8.i0;
import x8.k0;
import x8.r0;

/* loaded from: classes2.dex */
public final class c implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final F f5855b;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5856a = new ArrayList();

    static {
        i0 i0Var = i0.f49570Y;
        Y y10 = new Y(1);
        i0Var.getClass();
        C6376u c6376u = new C6376u(y10, i0Var);
        r0 r0Var = r0.f49607Y;
        Y y11 = new Y(2);
        r0Var.getClass();
        f5855b = new F(c6376u, new C6376u(y11, r0Var));
    }

    @Override // G2.a
    public final long a(long j6) {
        int i10 = 0;
        long j10 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f5856a;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j11 = ((C3158a) arrayList.get(i10)).f31163b;
            long j12 = ((C3158a) arrayList.get(i10)).f31165d;
            if (j6 < j11) {
                if (j10 == -9223372036854775807L) {
                    j10 = j11;
                } else {
                    j10 = Math.min(j10, j11);
                }
            } else {
                if (j6 < j12) {
                    if (j10 == -9223372036854775807L) {
                        j10 = j12;
                    } else {
                        j10 = Math.min(j10, j12);
                    }
                }
                i10++;
            }
        }
        if (j10 == -9223372036854775807L) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // G2.a
    public final boolean b(C3158a c3158a, long j6) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j10 = c3158a.f31163b;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        if (c3158a.f31164c != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        Gi.e.l(z11);
        if (j10 <= j6 && j6 < c3158a.f31165d) {
            z12 = true;
        } else {
            z12 = false;
        }
        ArrayList arrayList = this.f5856a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j10 >= ((C3158a) arrayList.get(size)).f31163b) {
                arrayList.add(size + 1, c3158a);
                return z12;
            }
        }
        arrayList.add(0, c3158a);
        return z12;
    }

    @Override // G2.a
    public final N c(long j6) {
        ArrayList arrayList = this.f5856a;
        if (!arrayList.isEmpty()) {
            if (j6 >= ((C3158a) arrayList.get(0)).f31163b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    C3158a c3158a = (C3158a) arrayList.get(i10);
                    if (j6 >= c3158a.f31163b && j6 < c3158a.f31165d) {
                        arrayList2.add(c3158a);
                    }
                    if (j6 < c3158a.f31163b) {
                        break;
                    }
                }
                k0 B02 = N.B0(arrayList2, f5855b);
                K U10 = N.U();
                for (int i11 = 0; i11 < B02.size(); i11++) {
                    U10.g0(((C3158a) B02.get(i11)).f31162a);
                }
                return U10.i0();
            }
        }
        return N.q0();
    }

    @Override // G2.a
    public final void clear() {
        this.f5856a.clear();
    }

    @Override // G2.a
    public final long d(long j6) {
        ArrayList arrayList = this.f5856a;
        if (!arrayList.isEmpty()) {
            if (j6 >= ((C3158a) arrayList.get(0)).f31163b) {
                long j10 = ((C3158a) arrayList.get(0)).f31163b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long j11 = ((C3158a) arrayList.get(i10)).f31163b;
                    long j12 = ((C3158a) arrayList.get(i10)).f31165d;
                    if (j12 <= j6) {
                        j10 = Math.max(j10, j12);
                    } else if (j11 > j6) {
                        break;
                    } else {
                        j10 = Math.max(j10, j11);
                    }
                }
                return j10;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // G2.a
    public final void e(long j6) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5856a;
            if (i10 < arrayList.size()) {
                int i11 = (j6 > ((C3158a) arrayList.get(i10)).f31163b ? 1 : (j6 == ((C3158a) arrayList.get(i10)).f31163b ? 0 : -1));
                if (i11 > 0 && j6 > ((C3158a) arrayList.get(i10)).f31165d) {
                    arrayList.remove(i10);
                    i10--;
                } else if (i11 < 0) {
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
