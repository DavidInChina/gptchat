package p2;

import android.os.Bundle;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class e0 implements AbstractC5057j {

    /* renamed from: m0  reason: collision with root package name */
    public static final String f42017m0 = Integer.toString(0, 36);

    /* renamed from: n0  reason: collision with root package name */
    public static final String f42018n0 = Integer.toString(1, 36);

    /* renamed from: o0  reason: collision with root package name */
    public static final String f42019o0 = Integer.toString(2, 36);

    /* renamed from: p0  reason: collision with root package name */
    public static final String f42020p0 = Integer.toString(3, 36);

    /* renamed from: q0  reason: collision with root package name */
    public static final String f42021q0 = Integer.toString(4, 36);

    /* renamed from: Y  reason: collision with root package name */
    public Object f42022Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f42023Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f42024h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f42025i0;

    /* renamed from: j0  reason: collision with root package name */
    public long f42026j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f42027k0;

    /* renamed from: l0  reason: collision with root package name */
    public C5049b f42028l0 = C5049b.f41981l0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        int i10 = this.f42024h0;
        if (i10 != 0) {
            bundle.putInt(f42017m0, i10);
        }
        long j6 = this.f42025i0;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(f42018n0, j6);
        }
        long j10 = this.f42026j0;
        if (j10 != 0) {
            bundle.putLong(f42019o0, j10);
        }
        boolean z10 = this.f42027k0;
        if (z10) {
            bundle.putBoolean(f42020p0, z10);
        }
        if (!this.f42028l0.equals(C5049b.f41981l0)) {
            bundle.putBundle(f42021q0, this.f42028l0.a());
        }
        return bundle;
    }

    public final long b(int i10, int i11) {
        C5048a b10 = this.f42028l0.b(i10);
        if (b10.f41969Z != -1) {
            return b10.f41973k0[i11];
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(long j6) {
        C5048a b10;
        int i10;
        C5049b c5049b = this.f42028l0;
        long j10 = this.f42025i0;
        c5049b.getClass();
        if (j6 == Long.MIN_VALUE) {
            return -1;
        }
        if (j10 != -9223372036854775807L && j6 >= j10) {
            return -1;
        }
        int i11 = c5049b.f41992j0;
        while (true) {
            int i12 = c5049b.f41989Z;
            if (i11 >= i12 || ((c5049b.b(i11).f41968Y == Long.MIN_VALUE || c5049b.b(i11).f41968Y > j6) && ((i10 = (b10 = c5049b.b(i11)).f41969Z) == -1 || b10.b(-1) < i10))) {
                break;
            }
            i11++;
        }
        return -1;
    }

    public final int d(long j6) {
        C5049b c5049b = this.f42028l0;
        long j10 = this.f42025i0;
        int i10 = c5049b.f41989Z - 1;
        int i11 = i10 - (c5049b.c(i10) ? 1 : 0);
        while (i11 >= 0 && j6 != Long.MIN_VALUE) {
            C5048a b10 = c5049b.b(i11);
            long j11 = b10.f41968Y;
            if (j11 == Long.MIN_VALUE) {
                if (j10 != -9223372036854775807L && ((!b10.f41975m0 || b10.f41969Z != -1) && j6 >= j10)) {
                    break;
                }
                i11--;
            } else if (j6 >= j11) {
                break;
            } else {
                i11--;
            }
        }
        if (i11 >= 0) {
            C5048a b11 = c5049b.b(i11);
            int i12 = b11.f41969Z;
            if (i12 != -1) {
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = b11.f41972j0[i13];
                    if (i14 == 0 || i14 == 1) {
                        return i11;
                    }
                }
            } else {
                return i11;
            }
        }
        return -1;
    }

    public final long e(int i10) {
        return this.f42028l0.b(i10).f41968Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !e0.class.equals(obj.getClass())) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (AbstractC5530A.a(this.f42022Y, e0Var.f42022Y) && AbstractC5530A.a(this.f42023Z, e0Var.f42023Z) && this.f42024h0 == e0Var.f42024h0 && this.f42025i0 == e0Var.f42025i0 && this.f42026j0 == e0Var.f42026j0 && this.f42027k0 == e0Var.f42027k0 && AbstractC5530A.a(this.f42028l0, e0Var.f42028l0)) {
            return true;
        }
        return false;
    }

    public final int f(int i10, int i11) {
        C5048a b10 = this.f42028l0.b(i10);
        if (b10.f41969Z != -1) {
            return b10.f41972j0[i11];
        }
        return 0;
    }

    public final int g(int i10) {
        return this.f42028l0.b(i10).b(-1);
    }

    public final long h() {
        return this.f42026j0;
    }

    public final int hashCode() {
        int i10;
        Object obj = this.f42022Y;
        int i11 = 0;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int i12 = (217 + i10) * 31;
        Object obj2 = this.f42023Z;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        long j6 = this.f42025i0;
        long j10 = this.f42026j0;
        return this.f42028l0.hashCode() + ((((((((((i12 + i11) * 31) + this.f42024h0) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f42027k0 ? 1 : 0)) * 31);
    }

    public final boolean i(int i10) {
        C5049b c5049b = this.f42028l0;
        if (i10 == c5049b.f41989Z - 1 && c5049b.c(i10)) {
            return true;
        }
        return false;
    }

    public final boolean j(int i10) {
        return this.f42028l0.b(i10).f41975m0;
    }

    public final void k(Object obj, Object obj2, int i10, long j6, long j10, C5049b c5049b, boolean z10) {
        this.f42022Y = obj;
        this.f42023Z = obj2;
        this.f42024h0 = i10;
        this.f42025i0 = j6;
        this.f42026j0 = j10;
        this.f42028l0 = c5049b;
        this.f42027k0 = z10;
    }
}
