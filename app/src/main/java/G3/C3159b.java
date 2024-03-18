package g3;

import M3.H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p2.Y;
import s2.AbstractC5530A;
import s2.p;
import x8.C6376u;
import x8.N;
import x8.i0;
import x8.k0;

/* renamed from: g3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3159b implements AbstractC3162e {

    /* renamed from: h0  reason: collision with root package name */
    public static final C6376u f31166h0;

    /* renamed from: Y  reason: collision with root package name */
    public final N f31167Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long[] f31168Z;

    static {
        i0 i0Var = i0.f49570Y;
        Y y10 = new Y(4);
        i0Var.getClass();
        f31166h0 = new C6376u(y10, i0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3159b(k0 k0Var) {
        long j6;
        int i10 = 0;
        long j10 = -9223372036854775807L;
        if (k0Var.size() == 1) {
            C3158a c3158a = (C3158a) H.T(k0Var);
            long j11 = c3158a.f31163b;
            if (j11 == -9223372036854775807L) {
                j6 = 0;
            } else {
                j6 = j11;
            }
            long j12 = c3158a.f31164c;
            int i11 = (j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1));
            N n10 = c3158a.f31162a;
            if (i11 == 0) {
                this.f31167Y = N.u0(n10);
                this.f31168Z = new long[]{j6};
                return;
            }
            this.f31167Y = N.v0(n10, N.q0());
            this.f31168Z = new long[]{j6, j12 + j6};
            return;
        }
        long[] jArr = new long[k0Var.size() * 2];
        this.f31168Z = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        k0 B02 = N.B0(k0Var, f31166h0);
        int i12 = 0;
        while (i10 < B02.size()) {
            C3158a c3158a2 = (C3158a) B02.get(i10);
            long j13 = c3158a2.f31163b;
            j13 = j13 == j10 ? 0L : j13;
            long j14 = c3158a2.f31164c;
            long j15 = j13 + j14;
            N n11 = c3158a2.f31162a;
            if (i12 != 0) {
                int i13 = i12 - 1;
                int i14 = (this.f31168Z[i13] > j13 ? 1 : (this.f31168Z[i13] == j13 ? 0 : -1));
                if (i14 >= 0) {
                    if (i14 == 0 && ((N) arrayList.get(i13)).isEmpty()) {
                        arrayList.set(i13, n11);
                    } else {
                        p.g("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.f31168Z[i13] = j13;
                        arrayList.set(i13, n11);
                    }
                    if (j14 == -9223372036854775807L) {
                        this.f31168Z[i12] = j15;
                        arrayList.add(N.q0());
                        i12++;
                    }
                    i10++;
                    j10 = -9223372036854775807L;
                }
            }
            this.f31168Z[i12] = j13;
            arrayList.add(n11);
            i12++;
            if (j14 == -9223372036854775807L) {
            }
            i10++;
            j10 = -9223372036854775807L;
        }
        this.f31167Y = N.V(arrayList);
    }

    @Override // g3.AbstractC3162e
    public final int a(long j6) {
        int b10 = AbstractC5530A.b(this.f31168Z, j6, false);
        if (b10 >= this.f31167Y.size()) {
            return -1;
        }
        return b10;
    }

    @Override // g3.AbstractC3162e
    public final long b(int i10) {
        boolean z10;
        if (i10 < this.f31167Y.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        return this.f31168Z[i10];
    }

    @Override // g3.AbstractC3162e
    public final List c(long j6) {
        int e10 = AbstractC5530A.e(this.f31168Z, j6, false);
        if (e10 == -1) {
            return N.q0();
        }
        return (N) this.f31167Y.get(e10);
    }

    @Override // g3.AbstractC3162e
    public final int d() {
        return this.f31167Y.size();
    }
}
