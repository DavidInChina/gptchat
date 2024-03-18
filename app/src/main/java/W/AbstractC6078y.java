package w;

import id.AbstractC3557B;

/* renamed from: w.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6078y {

    /* renamed from: a  reason: collision with root package name */
    public long[] f47642a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f47643b;

    /* renamed from: c  reason: collision with root package name */
    public int f47644c;

    /* renamed from: d  reason: collision with root package name */
    public int f47645d;

    public final boolean a(Object obj) {
        int i10;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i11 = i10 * (-862048943);
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f47644c;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f47642a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j6 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j10 = (i13 * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i14;
                if (AbstractC3557B.K(this.f47643b[numberOfTrailingZeros], obj)) {
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

    public final boolean b() {
        if (this.f47645d == 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6078y)) {
            return false;
        }
        AbstractC6078y abstractC6078y = (AbstractC6078y) obj;
        if (abstractC6078y.f47645d != this.f47645d) {
            return false;
        }
        Object[] objArr = this.f47643b;
        long[] jArr = this.f47642a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j6 = jArr[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j6) < 128 && !abstractC6078y.a(objArr[(i10 << 3) + i12])) {
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

    public final int hashCode() {
        int i10;
        Object[] objArr = this.f47643b;
        long[] jArr = this.f47642a;
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
                            Object obj = objArr[(i12 << 3) + i15];
                            if (obj != null) {
                                i10 = obj.hashCode();
                            } else {
                                i10 = 0;
                            }
                            i13 += i10;
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

    public final String toString() {
        C6077x c6077x = new C6077x(0, this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        Object[] objArr = this.f47643b;
        long[] jArr = this.f47642a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j6 = jArr[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j6) < 128) {
                            Object obj = objArr[(i10 << 3) + i13];
                            if (i11 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i11 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append((CharSequence) c6077x.invoke(obj));
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
            String sb3 = sb2.toString();
            AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
            return sb3;
        }
        sb2.append((CharSequence) "]");
        String sb32 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb32);
        return sb32;
    }
}
