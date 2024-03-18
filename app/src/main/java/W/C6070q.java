package w;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import x.AbstractC6262a;

/* renamed from: w.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6070q {

    /* renamed from: a  reason: collision with root package name */
    public long[] f47614a = AbstractC6076w.f47639a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f47615b = AbstractC6064k.f47595a;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f47616c = AbstractC6262a.f48623c;

    /* renamed from: d  reason: collision with root package name */
    public int f47617d;

    /* renamed from: e  reason: collision with root package name */
    public int f47618e;

    /* renamed from: f  reason: collision with root package name */
    public int f47619f;

    public C6070q(int i10) {
        if (i10 >= 0) {
            e(AbstractC6076w.d(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    /* renamed from: a */
    public final boolean equals(Object obj) {
        int[] iArr;
        long[] jArr;
        Object[] objArr;
        int i10;
        int i11;
        int i12;
        int[] iArr2;
        int i13;
        long[] jArr2;
        Object[] objArr2;
        long j6;
        int i14;
        int i15;
        if (obj == this) {
            return true;
        }
        int i16 = 0;
        if (!(obj instanceof C6070q)) {
            return false;
        }
        C6070q c6070q = (C6070q) obj;
        if (c6070q.f47618e != this.f47618e) {
            return false;
        }
        int[] iArr3 = this.f47615b;
        Object[] objArr3 = this.f47616c;
        long[] jArr3 = this.f47614a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i17 = 0;
            while (true) {
                long j10 = jArr3[i17];
                int i18 = 7;
                long j11 = -9187201950435737472L;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8;
                    int i20 = 8 - ((~(i17 - length)) >>> 31);
                    while (i16 < i20) {
                        if ((j10 & 255) < 128) {
                            int i21 = (i17 << 3) + i16;
                            int i22 = iArr3[i21];
                            Object obj2 = objArr3[i21];
                            if (obj2 == null) {
                                if (c6070q.c(i22) == null) {
                                    int i23 = (-862048943) * i22;
                                    int i24 = i23 ^ (i23 << 16);
                                    int i25 = i24 & 127;
                                    int i26 = c6070q.f47617d;
                                    int i27 = (i24 >>> i18) & i26;
                                    int i28 = 0;
                                    while (true) {
                                        long[] jArr4 = c6070q.f47614a;
                                        int i29 = i27 >> 3;
                                        int i30 = (i27 & 7) << 3;
                                        long j12 = jArr4[i29 + 1] << (64 - i30);
                                        objArr2 = objArr3;
                                        jArr2 = jArr3;
                                        long j13 = (jArr4[i29] >>> i30) | (j12 & ((-i30) >> 63));
                                        i15 = length;
                                        i13 = i17;
                                        long j14 = (i25 * 72340172838076673L) ^ j13;
                                        long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L);
                                        while (j15 != 0) {
                                            int numberOfTrailingZeros = (i27 + (Long.numberOfTrailingZeros(j15) >> 3)) & i26;
                                            iArr2 = iArr3;
                                            if (c6070q.f47615b[numberOfTrailingZeros] == i22) {
                                                if (numberOfTrailingZeros >= 0) {
                                                    j6 = -9187201950435737472L;
                                                } else {
                                                    return false;
                                                }
                                            } else {
                                                j15 &= j15 - 1;
                                                iArr3 = iArr2;
                                            }
                                        }
                                        int[] iArr4 = iArr3;
                                        if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                                            return false;
                                        }
                                        i28 += 8;
                                        i27 = (i27 + i28) & i26;
                                        length = i15;
                                        objArr3 = objArr2;
                                        jArr3 = jArr2;
                                        i17 = i13;
                                        iArr3 = iArr4;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                iArr2 = iArr3;
                                objArr2 = objArr3;
                                jArr2 = jArr3;
                                i15 = length;
                                i13 = i17;
                                j6 = -9187201950435737472L;
                                if (!AbstractC3557B.K(obj2, c6070q.c(i22))) {
                                    return false;
                                }
                            }
                            i14 = 8;
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i15 = length;
                            i13 = i17;
                            j6 = j11;
                            i14 = i19;
                        }
                        j10 >>= i14;
                        i16++;
                        i19 = i14;
                        j11 = j6;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        i17 = i13;
                        iArr3 = iArr2;
                        i18 = 7;
                        length = i15;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    jArr = jArr3;
                    i12 = length;
                    int i31 = i17;
                    i11 = 0;
                    if (i20 == i19) {
                        i10 = i31;
                    } else {
                        return true;
                    }
                } else {
                    iArr = iArr3;
                    i11 = i16;
                    objArr = objArr3;
                    jArr = jArr3;
                    i12 = length;
                    i10 = i17;
                }
                if (i10 == i12) {
                    return true;
                }
                i17 = i10 + 1;
                length = i12;
                i16 = i11;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            return true;
        }
    }

    public final int b(int i10) {
        int i11 = this.f47617d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f47614a;
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i10) {
        int i11;
        int i12 = (-862048943) * i10;
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 & 127;
        int i15 = this.f47617d;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f47614a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j6 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j10 = (i14 * 72340172838076673L) ^ j6;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j11) >> 3) + i16) & i15;
                if (this.f47615b[i11] == i10) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
        if (i11 >= 0) {
            return this.f47616c[i11];
        }
        return null;
    }

    /* renamed from: d */
    public final int hashCode() {
        int i10;
        int[] iArr = this.f47615b;
        Object[] objArr = this.f47616c;
        long[] jArr = this.f47614a;
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
                            int i17 = iArr[i16];
                            Object obj = objArr[i16];
                            if (obj != null) {
                                i10 = obj.hashCode();
                            } else {
                                i10 = 0;
                            }
                            i13 += i10 ^ i17;
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

    public final void e(int i10) {
        int i11;
        long[] jArr;
        if (i10 > 0) {
            i11 = Math.max(7, AbstractC6076w.c(i10));
        } else {
            i11 = 0;
        }
        this.f47617d = i11;
        if (i11 == 0) {
            jArr = AbstractC6076w.f47639a;
        } else {
            jArr = new long[((i11 + 15) & (-8)) >> 3];
            kf.q.f3(jArr);
        }
        this.f47614a = jArr;
        int i12 = i11 >> 3;
        long j6 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j6)) | j6;
        this.f47619f = AbstractC6076w.a(this.f47617d) - this.f47618e;
        this.f47615b = new int[i11];
        this.f47616c = new Object[i11];
    }

    public final void f(int i10) {
        int[] iArr;
        long[] jArr;
        long[] jArr2 = this.f47614a;
        int[] iArr2 = this.f47615b;
        Object[] objArr = this.f47616c;
        int i11 = this.f47617d;
        e(i10);
        int[] iArr3 = this.f47615b;
        Object[] objArr2 = this.f47616c;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr2[i12];
                int i14 = (-862048943) * i13;
                int i15 = i14 ^ (i14 << 16);
                int b10 = b(i15 >>> 7);
                long j6 = i15 & 127;
                long[] jArr3 = this.f47614a;
                int i16 = b10 >> 3;
                int i17 = (b10 & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                jArr3[i16] = (jArr3[i16] & (~(255 << i17))) | (j6 << i17);
                int i18 = this.f47617d;
                int i19 = ((b10 - 7) & i18) + (i18 & 7);
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                jArr3[i20] = ((~(255 << i21)) & jArr3[i20]) | (j6 << i21);
                iArr3[b10] = i13;
                objArr2[b10] = objArr[i12];
            } else {
                jArr = jArr2;
                iArr = iArr2;
            }
            i12++;
            jArr2 = jArr;
            iArr2 = iArr;
        }
    }

    /* renamed from: g */
    public final String toString() {
        if (this.f47618e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.f47615b;
        Object[] objArr = this.f47616c;
        long[] jArr = this.f47614a;
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
                            Object obj = objArr[i14];
                            sb2.append(i15);
                            sb2.append(Separators.EQUALS);
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i11++;
                            if (i11 < this.f47618e) {
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
