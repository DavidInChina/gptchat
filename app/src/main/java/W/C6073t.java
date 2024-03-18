package w;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import x.AbstractC6262a;

/* renamed from: w.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6073t {

    /* renamed from: a  reason: collision with root package name */
    public long[] f47631a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f47632b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f47633c;

    /* renamed from: d  reason: collision with root package name */
    public int f47634d;

    /* renamed from: e  reason: collision with root package name */
    public int f47635e;

    /* renamed from: f  reason: collision with root package name */
    public int f47636f;

    public /* synthetic */ C6073t() {
        this(6);
    }

    public final void a() {
        this.f47635e = 0;
        long[] jArr = this.f47631a;
        if (jArr != AbstractC6076w.f47639a) {
            kf.q.f3(jArr);
            long[] jArr2 = this.f47631a;
            int i10 = this.f47634d;
            int i11 = i10 >> 3;
            long j6 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j6)) | j6;
        }
        kf.q.d3(0, this.f47634d, null, this.f47633c);
        kf.q.d3(0, this.f47634d, null, this.f47632b);
        this.f47636f = AbstractC6076w.a(this.f47634d) - this.f47635e;
    }

    public final boolean b(Object obj) {
        int i10;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i11 = i10 * (-862048943);
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f47634d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f47631a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j6 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j10 = (i13 * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i14;
                if (AbstractC3557B.K(this.f47632b[numberOfTrailingZeros], obj)) {
                    if (numberOfTrailingZeros < 0) {
                        return false;
                    }
                    return true;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
    }

    /* renamed from: c */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6073t)) {
            return false;
        }
        C6073t c6073t = (C6073t) obj;
        if (c6073t.f47635e != this.f47635e) {
            return false;
        }
        Object[] objArr = this.f47632b;
        Object[] objArr2 = this.f47633c;
        long[] jArr = this.f47631a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            loop0: while (true) {
                long j6 = jArr[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j6) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            Object obj3 = objArr2[i13];
                            if (obj3 == null) {
                                if (c6073t.f(obj2) != null || !c6073t.b(obj2)) {
                                    break loop0;
                                }
                            } else if (!AbstractC3557B.K(obj3, c6073t.f(obj2))) {
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
            return false;
        }
        return true;
    }

    public final int d(int i10) {
        int i11 = this.f47634d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f47631a;
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
        int i16 = this.f47634d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f47631a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j6 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j10 = i15;
            int i21 = i15;
            long j11 = j6 ^ (j10 * 72340172838076673L);
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j12) >> 3)) & i16;
                if (AbstractC3557B.K(this.f47632b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int d10 = d(i14);
                if (this.f47636f == 0 && ((this.f47631a[d10 >> 3] >> ((d10 & 7) << 3)) & 255) != 254) {
                    int i22 = this.f47634d;
                    if (i22 > 8 && Long.compare((this.f47635e * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) <= 0) {
                        k(AbstractC6076w.b(this.f47634d));
                    } else {
                        k(AbstractC6076w.b(this.f47634d));
                    }
                    d10 = d(i14);
                }
                this.f47635e++;
                int i23 = this.f47636f;
                long[] jArr2 = this.f47631a;
                int i24 = d10 >> 3;
                long j13 = jArr2[i24];
                int i25 = (d10 & 7) << 3;
                if (((j13 >> i25) & 255) == 128) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                this.f47636f = i23 - i11;
                jArr2[i24] = (j13 & (~(255 << i25))) | (j10 << i25);
                int i26 = this.f47634d;
                int i27 = ((d10 - 7) & i26) + (i26 & 7);
                int i28 = i27 >> 3;
                int i29 = (i27 & 7) << 3;
                jArr2[i28] = ((~(255 << i29)) & jArr2[i28]) | (j10 << i29);
                return ~d10;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i21;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * (-862048943);
        int i14 = i13 ^ (i13 << 16);
        int i15 = i14 & 127;
        int i16 = this.f47634d;
        int i17 = i14 >>> 7;
        loop0: while (true) {
            int i18 = i17 & i16;
            long[] jArr = this.f47631a;
            int i19 = i18 >> 3;
            int i20 = (i18 & 7) << 3;
            long j6 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j10 = (i15 * 72340172838076673L) ^ j6;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j11) >> 3) + i18) & i16;
                if (AbstractC3557B.K(this.f47632b[i11], obj)) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i12 += 8;
            i17 = i18 + i12;
        }
        if (i11 >= 0) {
            return this.f47633c[i11];
        }
        return null;
    }

    /* renamed from: g */
    public final int hashCode() {
        int i10;
        int i11;
        Object[] objArr = this.f47632b;
        Object[] objArr2 = this.f47633c;
        long[] jArr = this.f47631a;
        int length = jArr.length - 2;
        int i12 = 0;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                long j6 = jArr[i13];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j6) < 128) {
                            int i17 = (i13 << 3) + i16;
                            Object obj = objArr[i17];
                            Object obj2 = objArr2[i17];
                            if (obj != null) {
                                i10 = obj.hashCode();
                            } else {
                                i10 = 0;
                            }
                            if (obj2 != null) {
                                i11 = obj2.hashCode();
                            } else {
                                i11 = 0;
                            }
                            i14 += i11 ^ i10;
                        }
                        j6 >>= 8;
                    }
                    if (i15 != 8) {
                        return i14;
                    }
                }
                if (i13 != length) {
                    i13++;
                } else {
                    i12 = i14;
                    break;
                }
            }
        }
        return i12;
    }

    public final void h(int i10) {
        int i11;
        long[] jArr;
        if (i10 > 0) {
            i11 = Math.max(7, AbstractC6076w.c(i10));
        } else {
            i11 = 0;
        }
        this.f47634d = i11;
        if (i11 == 0) {
            jArr = AbstractC6076w.f47639a;
        } else {
            jArr = new long[((i11 + 15) & (-8)) >> 3];
            kf.q.f3(jArr);
        }
        this.f47631a = jArr;
        int i12 = i11 >> 3;
        long j6 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j6)) | j6;
        this.f47636f = AbstractC6076w.a(this.f47634d) - this.f47635e;
        this.f47632b = new Object[i11];
        this.f47633c = new Object[i11];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * (-862048943);
        int i14 = i13 ^ (i13 << 16);
        int i15 = i14 & 127;
        int i16 = this.f47634d;
        int i17 = i14 >>> 7;
        loop0: while (true) {
            int i18 = i17 & i16;
            long[] jArr = this.f47631a;
            int i19 = i18 >> 3;
            int i20 = (i18 & 7) << 3;
            long j6 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j10 = (i15 * 72340172838076673L) ^ j6;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j11) >> 3) + i18) & i16;
                if (AbstractC3557B.K(this.f47632b[i11], obj)) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i12 += 8;
            i17 = i18 + i12;
        }
        if (i11 >= 0) {
            return j(i11);
        }
        return null;
    }

    public final Object j(int i10) {
        this.f47635e--;
        long[] jArr = this.f47631a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f47634d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        this.f47632b[i10] = null;
        Object[] objArr = this.f47633c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void k(int i10) {
        int i11;
        int i12;
        long[] jArr = this.f47631a;
        Object[] objArr = this.f47632b;
        Object[] objArr2 = this.f47633c;
        int i13 = this.f47634d;
        h(i10);
        Object[] objArr3 = this.f47632b;
        Object[] objArr4 = this.f47633c;
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
                int d10 = d(i16 >>> 7);
                long j6 = i16 & 127;
                long[] jArr2 = this.f47631a;
                int i17 = d10 >> 3;
                int i18 = (d10 & 7) << 3;
                i11 = i14;
                jArr2[i17] = (jArr2[i17] & (~(255 << i18))) | (j6 << i18);
                int i19 = this.f47634d;
                int i20 = ((d10 - 7) & i19) + (i19 & 7);
                int i21 = i20 >> 3;
                int i22 = (i20 & 7) << 3;
                jArr2[i21] = (jArr2[i21] & (~(255 << i22))) | (j6 << i22);
                objArr3[d10] = obj;
                objArr4[d10] = objArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void l(Object obj, Object obj2) {
        int e10 = e(obj);
        if (e10 < 0) {
            e10 = ~e10;
        }
        this.f47632b[e10] = obj;
        this.f47633c[e10] = obj2;
    }

    /* renamed from: m */
    public final String toString() {
        if (this.f47635e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f47632b;
        Object[] objArr2 = this.f47633c;
        long[] jArr = this.f47631a;
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
                            Object obj2 = objArr2[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append(Separators.EQUALS);
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
                            i11++;
                            if (i11 < this.f47635e) {
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

    public C6073t(int i10) {
        this.f47631a = AbstractC6076w.f47639a;
        Object[] objArr = AbstractC6262a.f48623c;
        this.f47632b = objArr;
        this.f47633c = objArr;
        if (i10 >= 0) {
            h(AbstractC6076w.d(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }
}
