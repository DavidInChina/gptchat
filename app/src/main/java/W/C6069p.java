package w;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.NoSuchElementException;

/* renamed from: w.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6069p {

    /* renamed from: a  reason: collision with root package name */
    public long[] f47608a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f47609b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f47610c;

    /* renamed from: d  reason: collision with root package name */
    public int f47611d;

    /* renamed from: e  reason: collision with root package name */
    public int f47612e;

    /* renamed from: f  reason: collision with root package name */
    public int f47613f;

    /* renamed from: a */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6069p)) {
            return false;
        }
        C6069p c6069p = (C6069p) obj;
        if (c6069p.f47612e != this.f47612e) {
            return false;
        }
        int[] iArr = this.f47609b;
        int[] iArr2 = this.f47610c;
        long[] jArr = this.f47608a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j6 = jArr[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j6) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (iArr2[i13] != c6069p.d(iArr[i13])) {
                                return false;
                            }
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

    public final int b(int i10) {
        int i11 = this.f47611d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f47608a;
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

    public final int c(int i10) {
        int i11 = (-862048943) * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f47611d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f47608a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j6 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j10 = (i13 * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i14;
                if (this.f47609b[numberOfTrailingZeros] == i10) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
    }

    public final int d(int i10) {
        int c10 = c(i10);
        if (c10 >= 0) {
            return this.f47610c[c10];
        }
        throw new NoSuchElementException(android.gov.nist.core.a.e("Cannot find value for key ", i10));
    }

    /* renamed from: e */
    public final int hashCode() {
        int[] iArr = this.f47609b;
        int[] iArr2 = this.f47610c;
        long[] jArr = this.f47608a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j6 = jArr[i11];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j6) < 128) {
                            int i15 = (i11 << 3) + i14;
                            i12 += iArr2[i15] ^ iArr[i15];
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

    public final void f(int i10) {
        int i11;
        long[] jArr;
        if (i10 > 0) {
            i11 = Math.max(7, AbstractC6076w.c(i10));
        } else {
            i11 = 0;
        }
        this.f47611d = i11;
        if (i11 == 0) {
            jArr = AbstractC6076w.f47639a;
        } else {
            jArr = new long[((i11 + 15) & (-8)) >> 3];
            kf.q.f3(jArr);
        }
        this.f47608a = jArr;
        int i12 = i11 >> 3;
        long j6 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j6)) | j6;
        this.f47613f = AbstractC6076w.a(this.f47611d) - this.f47612e;
        this.f47609b = new int[i11];
        this.f47610c = new int[i11];
    }

    public final void g(int i10) {
        int[] iArr;
        long[] jArr;
        long[] jArr2 = this.f47608a;
        int[] iArr2 = this.f47609b;
        int[] iArr3 = this.f47610c;
        int i11 = this.f47611d;
        f(i10);
        int[] iArr4 = this.f47609b;
        int[] iArr5 = this.f47610c;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr2[i12];
                int i14 = (-862048943) * i13;
                int i15 = i14 ^ (i14 << 16);
                int b10 = b(i15 >>> 7);
                long j6 = i15 & 127;
                long[] jArr3 = this.f47608a;
                int i16 = b10 >> 3;
                int i17 = (b10 & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                jArr3[i16] = (jArr3[i16] & (~(255 << i17))) | (j6 << i17);
                int i18 = this.f47611d;
                int i19 = ((b10 - 7) & i18) + (i18 & 7);
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                jArr3[i20] = ((~(255 << i21)) & jArr3[i20]) | (j6 << i21);
                iArr4[b10] = i13;
                iArr5[b10] = iArr3[i12];
            } else {
                jArr = jArr2;
                iArr = iArr2;
            }
            i12++;
            jArr2 = jArr;
            iArr2 = iArr;
        }
    }

    /* renamed from: h */
    public final String toString() {
        if (this.f47612e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.f47609b;
        int[] iArr2 = this.f47610c;
        long[] jArr = this.f47608a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j6 = jArr[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j6) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr[i14];
                            int i16 = iArr2[i14];
                            sb2.append(i15);
                            sb2.append(Separators.EQUALS);
                            sb2.append(i16);
                            i11++;
                            if (i11 < this.f47612e) {
                                sb2.append(", ");
                            }
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
        sb2.append('}');
        String sb3 = sb2.toString();
        AbstractC3557B.b0("s.append('}').toString()", sb3);
        return sb3;
    }
}
