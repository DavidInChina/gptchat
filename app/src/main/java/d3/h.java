package d3;

import L2.A;
import L2.C;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long f27983a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27984b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27985c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27986d;

    /* renamed from: e  reason: collision with root package name */
    public final long f27987e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f27988f;

    public h(long j6, int i10, long j10, long j11, long[] jArr) {
        this.f27983a = j6;
        this.f27984b = i10;
        this.f27985c = j10;
        this.f27988f = jArr;
        this.f27986d = j11;
        this.f27987e = j11 != -1 ? j6 + j11 : -1L;
    }

    @Override // d3.f
    public final long c() {
        return this.f27987e;
    }

    @Override // L2.B
    public final boolean e() {
        if (this.f27988f != null) {
            return true;
        }
        return false;
    }

    @Override // d3.f
    public final long f(long j6) {
        long j10;
        double d10;
        long j11 = j6 - this.f27983a;
        if (e() && j11 > this.f27984b) {
            long[] jArr = this.f27988f;
            Gi.e.o(jArr);
            double d11 = (j11 * 256.0d) / this.f27986d;
            int e10 = AbstractC5530A.e(jArr, (long) d11, true);
            long j12 = this.f27985c;
            long j13 = (e10 * j12) / 100;
            long j14 = jArr[e10];
            int i10 = e10 + 1;
            long j15 = (j12 * i10) / 100;
            if (e10 == 99) {
                j10 = 256;
            } else {
                j10 = jArr[i10];
            }
            if (j14 == j10) {
                d10 = 0.0d;
            } else {
                d10 = (d11 - j14) / (j10 - j14);
            }
            return Math.round(d10 * (j15 - j13)) + j13;
        }
        return 0L;
    }

    @Override // L2.B
    public final A i(long j6) {
        double d10;
        double d11;
        boolean e10 = e();
        int i10 = this.f27984b;
        long j10 = this.f27983a;
        if (!e10) {
            C c10 = new C(0L, j10 + i10);
            return new A(c10, c10);
        }
        long j11 = AbstractC5530A.j(j6, 0L, this.f27985c);
        double d12 = (j11 * 100.0d) / this.f27985c;
        double d13 = 0.0d;
        if (d12 > 0.0d) {
            if (d12 >= 100.0d) {
                d10 = 256.0d;
                d13 = 256.0d;
                double d14 = d13 / d10;
                long j12 = this.f27986d;
                C c11 = new C(j11, j10 + AbstractC5530A.j(Math.round(d14 * j12), i10, j12 - 1));
                return new A(c11, c11);
            }
            int i11 = (int) d12;
            long[] jArr = this.f27988f;
            Gi.e.o(jArr);
            double d15 = jArr[i11];
            if (i11 == 99) {
                d11 = 256.0d;
            } else {
                d11 = jArr[i11 + 1];
            }
            d13 = ((d11 - d15) * (d12 - i11)) + d15;
        }
        d10 = 256.0d;
        double d142 = d13 / d10;
        long j122 = this.f27986d;
        C c112 = new C(j11, j10 + AbstractC5530A.j(Math.round(d142 * j122), i10, j122 - 1));
        return new A(c112, c112);
    }

    @Override // L2.B
    public final long j() {
        return this.f27985c;
    }
}
