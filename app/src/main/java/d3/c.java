package d3;

import L2.A;
import L2.C;
import android.util.Pair;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f27956a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f27957b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27958c;

    public c(long j6, long[] jArr, long[] jArr2) {
        this.f27956a = jArr;
        this.f27957b = jArr2;
        this.f27958c = j6 == -9223372036854775807L ? AbstractC5530A.C(jArr2[jArr2.length - 1]) : j6;
    }

    public static Pair a(long j6, long[] jArr, long[] jArr2) {
        double d10;
        int e10 = AbstractC5530A.e(jArr, j6, true);
        long j10 = jArr[e10];
        long j11 = jArr2[e10];
        int i10 = e10 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        long j12 = jArr[i10];
        long j13 = jArr2[i10];
        if (j12 == j10) {
            d10 = 0.0d;
        } else {
            d10 = (j6 - j10) / (j12 - j10);
        }
        return Pair.create(Long.valueOf(j6), Long.valueOf(((long) (d10 * (j13 - j11))) + j11));
    }

    @Override // d3.f
    public final long c() {
        return -1L;
    }

    @Override // L2.B
    public final boolean e() {
        return true;
    }

    @Override // d3.f
    public final long f(long j6) {
        return AbstractC5530A.C(((Long) a(j6, this.f27956a, this.f27957b).second).longValue());
    }

    @Override // L2.B
    public final A i(long j6) {
        Pair a5 = a(AbstractC5530A.L(AbstractC5530A.j(j6, 0L, this.f27958c)), this.f27957b, this.f27956a);
        C c10 = new C(AbstractC5530A.C(((Long) a5.first).longValue()), ((Long) a5.second).longValue());
        return new A(c10, c10);
    }

    @Override // L2.B
    public final long j() {
        return this.f27958c;
    }
}
