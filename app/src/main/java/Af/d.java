package Af;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import q1.AbstractC5260f;
import tf.AbstractC5767a;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: Y  reason: collision with root package name */
    public static final c f840Y = new d();

    /* renamed from: Z  reason: collision with root package name */
    public static final a f841Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Af.d, Af.c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [Af.d] */
    static {
        b bVar;
        Integer num = AbstractC5767a.f46161a;
        if (num != null && num.intValue() < 34) {
            bVar = new b();
        } else {
            bVar = new d();
        }
        f841Z = bVar;
    }

    public abstract int a(int i10);

    public void b(byte[] bArr) {
        AbstractC3557B.c0("array", bArr);
        c(bArr, bArr.length);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Cf.g, Cf.e] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Cf.g, Cf.e] */
    public byte[] c(byte[] bArr, int i10) {
        AbstractC3557B.c0("array", bArr);
        if (new Cf.e(0, bArr.length, 1).s(0) && new Cf.e(0, bArr.length, 1).s(i10)) {
            if (i10 >= 0) {
                int i11 = i10 / 4;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    int d10 = d();
                    bArr[i12] = (byte) d10;
                    bArr[i12 + 1] = (byte) (d10 >>> 8);
                    bArr[i12 + 2] = (byte) (d10 >>> 16);
                    bArr[i12 + 3] = (byte) (d10 >>> 24);
                    i12 += 4;
                }
                int i14 = i10 - i12;
                int a5 = a(i14 * 8);
                for (int i15 = 0; i15 < i14; i15++) {
                    bArr[i12 + i15] = (byte) (a5 >>> (i15 * 8));
                }
                return bArr;
            }
            throw new IllegalArgumentException(AbstractC4194d.v("fromIndex (0) must be not greater than toIndex (", i10, ").").toString());
        }
        throw new IllegalArgumentException(AbstractC2469q0.j(android.gov.nist.core.a.q("fromIndex (0) or toIndex (", i10, ") are out of range: 0.."), bArr.length, '.').toString());
    }

    public abstract int d();

    public int e(int i10) {
        return f(i10);
    }

    public int f(int i10) {
        int d10;
        int i11;
        if (i10 > 0) {
            if (i10 > 0 || i10 == Integer.MIN_VALUE) {
                if (((-i10) & i10) == i10) {
                    return a(31 - Integer.numberOfLeadingZeros(i10));
                }
                do {
                    d10 = d() >>> 1;
                    i11 = d10 % i10;
                } while ((i10 - 1) + (d10 - i11) < 0);
                return i11;
            }
            while (true) {
                int d11 = d();
                if (d11 >= 0 && d11 < i10) {
                    return d11;
                }
            }
        } else {
            throw new IllegalArgumentException(AbstractC5260f.h(0, Integer.valueOf(i10)).toString());
        }
    }

    public long g() {
        return (d() << 32) + d();
    }

    public long h(long j6, long j10) {
        long j11;
        long g10;
        long j12;
        int d10;
        if (j10 > j6) {
            long j13 = j10 - j6;
            if (j13 > 0) {
                if (((-j13) & j13) == j13) {
                    int i10 = (int) j13;
                    int i11 = (int) (j13 >>> 32);
                    if (i10 != 0) {
                        d10 = a(31 - Integer.numberOfLeadingZeros(i10));
                    } else if (i11 == 1) {
                        d10 = d();
                    } else {
                        j11 = (a(31 - Integer.numberOfLeadingZeros(i11)) << 32) + (d() & 4294967295L);
                    }
                    j11 = d10 & 4294967295L;
                } else {
                    do {
                        g10 = g() >>> 1;
                        j12 = g10 % j13;
                    } while ((j13 - 1) + (g10 - j12) < 0);
                    j11 = j12;
                }
                return j6 + j11;
            }
            while (true) {
                long g11 = g();
                if (j6 <= g11 && g11 < j10) {
                    return g11;
                }
            }
        } else {
            throw new IllegalArgumentException(AbstractC5260f.h(Long.valueOf(j6), Long.valueOf(j10)).toString());
        }
    }
}
