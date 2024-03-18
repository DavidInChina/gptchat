package w;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.NoSuchElementException;
import x.AbstractC6262a;

/* renamed from: w.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6072s {

    /* renamed from: a  reason: collision with root package name */
    public long[] f47625a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f47626b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f47627c;

    /* renamed from: d  reason: collision with root package name */
    public int f47628d;

    /* renamed from: e  reason: collision with root package name */
    public int f47629e;

    /* renamed from: f  reason: collision with root package name */
    public int f47630f;

    public /* synthetic */ C6072s() {
        this(6);
    }

    /* renamed from: a */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6072s)) {
            return false;
        }
        C6072s c6072s = (C6072s) obj;
        if (c6072s.f47629e != this.f47629e) {
            return false;
        }
        Object[] objArr = this.f47626b;
        int[] iArr = this.f47627c;
        long[] jArr = this.f47625a;
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
                            Object obj2 = objArr[i13];
                            int i14 = iArr[i13];
                            int d10 = c6072s.d(obj2);
                            if (d10 >= 0) {
                                if (i14 != c6072s.f47627c[d10]) {
                                    return false;
                                }
                            } else {
                                throw new NoSuchElementException("There is no key " + obj2 + " in the map");
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
        int i11 = this.f47628d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f47625a;
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

    public final int c(Object obj) {
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
        int i16 = this.f47628d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f47625a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j6 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j10 = i15;
            int i21 = i15;
            long j11 = j6 ^ (j10 * 72340172838076673L);
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j12) >> 3)) & i16;
                if (AbstractC3557B.K(this.f47626b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int b10 = b(i14);
                if (this.f47630f == 0 && ((this.f47625a[b10 >> 3] >> ((b10 & 7) << 3)) & 255) != 254) {
                    int i22 = this.f47628d;
                    if (i22 > 8 && Long.compare((this.f47629e * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) <= 0) {
                        h(AbstractC6076w.b(this.f47628d));
                    } else {
                        h(AbstractC6076w.b(this.f47628d));
                    }
                    b10 = b(i14);
                }
                this.f47629e++;
                int i23 = this.f47630f;
                long[] jArr2 = this.f47625a;
                int i24 = b10 >> 3;
                long j13 = jArr2[i24];
                int i25 = (b10 & 7) << 3;
                if (((j13 >> i25) & 255) == 128) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                this.f47630f = i23 - i11;
                jArr2[i24] = (j13 & (~(255 << i25))) | (j10 << i25);
                int i26 = this.f47628d;
                int i27 = ((b10 - 7) & i26) + (i26 & 7);
                int i28 = i27 >> 3;
                int i29 = (i27 & 7) << 3;
                jArr2[i28] = ((~(255 << i29)) & jArr2[i28]) | (j10 << i29);
                return ~b10;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i21;
        }
    }

    public final int d(Object obj) {
        int i10;
        int i11 = 0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * (-862048943);
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 & 127;
        int i15 = this.f47628d;
        int i16 = i13 >>> 7;
        while (true) {
            int i17 = i16 & i15;
            long[] jArr = this.f47625a;
            int i18 = i17 >> 3;
            int i19 = (i17 & 7) << 3;
            long j6 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j10 = (i14 * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i17) & i15;
                if (AbstractC3557B.K(this.f47626b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i11 += 8;
            i16 = i17 + i11;
        }
    }

    /* renamed from: e */
    public final int hashCode() {
        int i10;
        Object[] objArr = this.f47626b;
        int[] iArr = this.f47627c;
        long[] jArr = this.f47625a;
        int length = jArr.length - 2;
        int i11 = 0;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j6 = jArr[i12];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j6) < 128) {
                            int i16 = (i12 << 3) + i15;
                            Object obj = objArr[i16];
                            int i17 = iArr[i16];
                            if (obj != null) {
                                i10 = obj.hashCode();
                            } else {
                                i10 = 0;
                            }
                            i13 += i17 ^ i10;
                        }
                        j6 >>= 8;
                    }
                    if (i14 != 8) {
                        return i13;
                    }
                }
                if (i12 != length) {
                    i12++;
                } else {
                    i11 = i13;
                    break;
                }
            }
        }
        return i11;
    }

    public final void f(int i10) {
        int i11;
        long[] jArr;
        if (i10 > 0) {
            i11 = Math.max(7, AbstractC6076w.c(i10));
        } else {
            i11 = 0;
        }
        this.f47628d = i11;
        if (i11 == 0) {
            jArr = AbstractC6076w.f47639a;
        } else {
            jArr = new long[((i11 + 15) & (-8)) >> 3];
            kf.q.f3(jArr);
        }
        this.f47625a = jArr;
        int i12 = i11 >> 3;
        long j6 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j6)) | j6;
        this.f47630f = AbstractC6076w.a(this.f47628d) - this.f47629e;
        this.f47626b = new Object[i11];
        this.f47627c = new int[i11];
    }

    public final void g(int i10) {
        this.f47629e--;
        long[] jArr = this.f47625a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f47628d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        this.f47626b[i10] = null;
    }

    public final void h(int i10) {
        int i11;
        int i12;
        long[] jArr = this.f47625a;
        Object[] objArr = this.f47626b;
        int[] iArr = this.f47627c;
        int i13 = this.f47628d;
        f(i10);
        Object[] objArr2 = this.f47626b;
        int[] iArr2 = this.f47627c;
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
                int b10 = b(i16 >>> 7);
                long j6 = i16 & 127;
                long[] jArr2 = this.f47625a;
                int i17 = b10 >> 3;
                int i18 = (b10 & 7) << 3;
                i11 = i14;
                jArr2[i17] = (jArr2[i17] & (~(255 << i18))) | (j6 << i18);
                int i19 = this.f47628d;
                int i20 = ((b10 - 7) & i19) + (i19 & 7);
                int i21 = i20 >> 3;
                int i22 = (i20 & 7) << 3;
                jArr2[i21] = (jArr2[i21] & (~(255 << i22))) | (j6 << i22);
                objArr2[b10] = obj;
                iArr2[b10] = iArr[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    /* renamed from: i */
    public final String toString() {
        if (this.f47629e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f47626b;
        int[] iArr = this.f47627c;
        long[] jArr = this.f47625a;
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
                            Object obj = objArr[i14];
                            int i15 = iArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append(Separators.EQUALS);
                            sb2.append(i15);
                            i11++;
                            if (i11 < this.f47629e) {
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

    public C6072s(int i10) {
        this.f47625a = AbstractC6076w.f47639a;
        this.f47626b = AbstractC6262a.f48623c;
        this.f47627c = AbstractC6064k.f47595a;
        if (i10 >= 0) {
            f(AbstractC6076w.d(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }
}
