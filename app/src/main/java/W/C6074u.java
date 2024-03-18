package w;

import id.AbstractC3557B;
import x.AbstractC6262a;

/* renamed from: w.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6074u extends AbstractC6078y {

    /* renamed from: e  reason: collision with root package name */
    public int f47637e;

    public /* synthetic */ C6074u() {
        this(6);
    }

    public final void c(Object obj) {
        this.f47643b[e(obj)] = obj;
    }

    public final void d() {
        this.f47645d = 0;
        long[] jArr = this.f47642a;
        if (jArr != AbstractC6076w.f47639a) {
            kf.q.f3(jArr);
            long[] jArr2 = this.f47642a;
            int i10 = this.f47644c;
            int i11 = i10 >> 3;
            long j6 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j6)) | j6;
        }
        kf.q.d3(0, this.f47644c, null, this.f47643b);
        this.f47637e = AbstractC6076w.a(this.f47644c) - this.f47645d;
    }

    public final int e(Object obj) {
        int i10;
        int i11;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * (-862048943);
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f47644c;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f47642a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j6 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j10 = i15;
            int i21 = i15;
            long j11 = j6 ^ (j10 * 72340172838076673L);
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j12) >> 3)) & i16;
                if (AbstractC3557B.K(this.f47643b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int f6 = f(i14);
                if (this.f47637e == 0 && ((this.f47642a[f6 >> 3] >> ((f6 & 7) << 3)) & 255) != 254) {
                    int i22 = this.f47644c;
                    if (i22 > 8 && Long.compare((this.f47645d * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) <= 0) {
                        i(AbstractC6076w.b(this.f47644c));
                    } else {
                        i(AbstractC6076w.b(this.f47644c));
                    }
                    f6 = f(i14);
                }
                this.f47645d++;
                int i23 = this.f47637e;
                long[] jArr2 = this.f47642a;
                int i24 = f6 >> 3;
                long j13 = jArr2[i24];
                int i25 = (f6 & 7) << 3;
                if (((j13 >> i25) & 255) == 128) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                this.f47637e = i23 - i11;
                jArr2[i24] = (j13 & (~(255 << i25))) | (j10 << i25);
                int i26 = this.f47644c;
                int i27 = ((f6 - 7) & i26) + (i26 & 7);
                int i28 = i27 >> 3;
                int i29 = (i27 & 7) << 3;
                jArr2[i28] = ((~(255 << i29)) & jArr2[i28]) | (j10 << i29);
                return f6;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i21;
        }
    }

    public final int f(int i10) {
        int i11 = this.f47644c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f47642a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = j6 & ((~j6) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j10) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final void g(int i10) {
        int i11;
        long[] jArr;
        if (i10 > 0) {
            i11 = Math.max(7, AbstractC6076w.c(i10));
        } else {
            i11 = 0;
        }
        this.f47644c = i11;
        if (i11 == 0) {
            jArr = AbstractC6076w.f47639a;
        } else {
            jArr = new long[((i11 + 15) & (-8)) >> 3];
            kf.q.f3(jArr);
        }
        this.f47642a = jArr;
        int i12 = i11 >> 3;
        long j6 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j6)) | j6;
        this.f47637e = AbstractC6076w.a(this.f47644c) - this.f47645d;
        this.f47643b = new Object[i11];
    }

    public final void h(int i10) {
        this.f47645d--;
        long[] jArr = this.f47642a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f47644c;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        this.f47643b[i10] = null;
    }

    public final void i(int i10) {
        int i11;
        int i12;
        long[] jArr = this.f47642a;
        Object[] objArr = this.f47643b;
        int i13 = this.f47644c;
        g(i10);
        Object[] objArr2 = this.f47643b;
        int i14 = 0;
        while (i14 < i13) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                if (obj != null) {
                    i12 = obj.hashCode();
                } else {
                    i12 = 0;
                }
                int i15 = i12 * (-862048943);
                int i16 = i15 ^ (i15 << 16);
                int f6 = f(i16 >>> 7);
                long j6 = i16 & 127;
                long[] jArr2 = this.f47642a;
                int i17 = f6 >> 3;
                int i18 = (f6 & 7) << 3;
                i11 = i14;
                jArr2[i17] = (jArr2[i17] & (~(255 << i18))) | (j6 << i18);
                int i19 = this.f47644c;
                int i20 = ((f6 - 7) & i19) + (i19 & 7);
                int i21 = i20 >> 3;
                int i22 = (i20 & 7) << 3;
                jArr2[i21] = ((~(255 << i22)) & jArr2[i21]) | (j6 << i22);
                objArr2[f6] = obj;
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public C6074u(int i10) {
        this.f47642a = AbstractC6076w.f47639a;
        this.f47643b = AbstractC6262a.f48623c;
        if (i10 >= 0) {
            g(AbstractC6076w.d(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }
}
