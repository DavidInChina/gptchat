package w;

import id.AbstractC3557B;

/* renamed from: w.r  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6071r {

    /* renamed from: a  reason: collision with root package name */
    public long[] f47620a = AbstractC6076w.f47639a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f47621b = AbstractC6065l.f47596a;

    /* renamed from: c  reason: collision with root package name */
    public int f47622c;

    /* renamed from: d  reason: collision with root package name */
    public int f47623d;

    /* renamed from: e  reason: collision with root package name */
    public int f47624e;

    public C6071r(int i10) {
        if (i10 >= 0) {
            e(AbstractC6076w.d(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final boolean a(long j6) {
        int i10 = ((int) (j6 ^ (j6 >>> 32))) * (-862048943);
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f47622c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f47620a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f47621b[numberOfTrailingZeros] == j6) {
                    if (numberOfTrailingZeros < 0) {
                        return false;
                    }
                    return true;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    /* renamed from: b */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6071r)) {
            return false;
        }
        C6071r c6071r = (C6071r) obj;
        if (c6071r.f47623d != this.f47623d) {
            return false;
        }
        long[] jArr = this.f47621b;
        long[] jArr2 = this.f47620a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j6 = jArr2[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j6) < 128 && !c6071r.a(jArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j6 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return true;
    }

    public final int c(int i10) {
        int i11 = this.f47622c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f47620a;
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

    /* renamed from: d */
    public final int hashCode() {
        long[] jArr = this.f47621b;
        long[] jArr2 = this.f47620a;
        int length = jArr2.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j6 = jArr2[i11];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j6) < 128) {
                            long j10 = jArr[(i11 << 3) + i14];
                            i12 += (int) (j10 ^ (j10 >>> 32));
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        return i12;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = i12;
                    break;
                }
            }
        }
        return i10;
    }

    public final void e(int i10) {
        int i11;
        long[] jArr;
        if (i10 > 0) {
            i11 = Math.max(7, AbstractC6076w.c(i10));
        } else {
            i11 = 0;
        }
        this.f47622c = i11;
        if (i11 == 0) {
            jArr = AbstractC6076w.f47639a;
        } else {
            jArr = new long[((i11 + 15) & (-8)) >> 3];
            kf.q.f3(jArr);
        }
        this.f47620a = jArr;
        int i12 = i11 >> 3;
        long j6 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j6)) | j6;
        this.f47624e = AbstractC6076w.a(this.f47622c) - this.f47623d;
        this.f47621b = new long[i11];
    }

    public final void f(int i10) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3 = this.f47620a;
        long[] jArr4 = this.f47621b;
        int i11 = this.f47622c;
        e(i10);
        long[] jArr5 = this.f47621b;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr3[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                long j6 = jArr4[i12];
                int i13 = ((int) ((j6 >>> 32) ^ j6)) * (-862048943);
                int i14 = i13 ^ (i13 << 16);
                int c10 = c(i14 >>> 7);
                long j10 = i14 & 127;
                long[] jArr6 = this.f47620a;
                int i15 = c10 >> 3;
                int i16 = (c10 & 7) << 3;
                jArr2 = jArr3;
                jArr = jArr4;
                jArr6[i15] = (jArr6[i15] & (~(255 << i16))) | (j10 << i16);
                int i17 = this.f47622c;
                int i18 = ((c10 - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr6[i19] = ((~(255 << i20)) & jArr6[i19]) | (j10 << i20);
                jArr5[c10] = j6;
            } else {
                jArr2 = jArr3;
                jArr = jArr4;
            }
            i12++;
            jArr3 = jArr2;
            jArr4 = jArr;
        }
    }

    /* renamed from: g */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f47621b;
        long[] jArr2 = this.f47620a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j6 = jArr2[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j6) < 128) {
                            long j10 = jArr[(i10 << 3) + i13];
                            if (i11 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i11 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(j10);
                            i11++;
                        }
                        j6 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        sb2.append((CharSequence) "]");
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        return sb3;
    }
}
