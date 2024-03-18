package Nh;

import N.C1025i;
import android.gov.nist.javax.sip.parser.TokenNames;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: n  reason: collision with root package name */
    public static final k f13095n = new Object();

    /* renamed from: a  reason: collision with root package name */
    public short f13096a;

    /* renamed from: b  reason: collision with root package name */
    public short f13097b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f13098c;

    /* renamed from: d  reason: collision with root package name */
    public int f13099d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f13100e;

    /* renamed from: f  reason: collision with root package name */
    public short f13101f;

    /* renamed from: g  reason: collision with root package name */
    public short f13102g;

    /* renamed from: h  reason: collision with root package name */
    public short f13103h;

    /* renamed from: i  reason: collision with root package name */
    public short f13104i;

    /* renamed from: j  reason: collision with root package name */
    public i f13105j;

    /* renamed from: k  reason: collision with root package name */
    public k f13106k;

    /* renamed from: l  reason: collision with root package name */
    public C1025i f13107l;

    /* renamed from: m  reason: collision with root package name */
    public k f13108m;

    public final void a(int i10, int i11, int i12) {
        if (this.f13100e == null) {
            this.f13100e = new int[6];
        }
        int[] iArr = this.f13100e;
        int i13 = iArr[0];
        int i14 = i13 + 2;
        if (i14 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f13100e = iArr2;
        }
        int[] iArr3 = this.f13100e;
        iArr3[i13 + 1] = i10;
        iArr3[i14] = i11 | i12;
        iArr3[0] = i14;
    }

    public final k b() {
        i iVar = this.f13105j;
        if (iVar == null) {
            return this;
        }
        return iVar.f13081a;
    }

    public final k c(k kVar) {
        for (C1025i c1025i = this.f13107l; c1025i != null; c1025i = (C1025i) c1025i.f12352i0) {
            if ((this.f13096a & 16) == 0 || c1025i != ((C1025i) this.f13107l.f12352i0)) {
                Object obj = c1025i.f12351h0;
                if (((k) obj).f13108m == null) {
                    ((k) obj).f13108m = kVar;
                    kVar = (k) obj;
                }
            }
        }
        return kVar;
    }

    public final void d(I5.h hVar, int i10, boolean z10) {
        if ((this.f13096a & 4) == 0) {
            if (z10) {
                a(i10, 536870912, hVar.f8084c);
                hVar.j(-1);
                return;
            }
            a(i10, 268435456, hVar.f8084c);
            hVar.k(-1);
        } else if (z10) {
            hVar.j(this.f13099d - i10);
        } else {
            hVar.k(this.f13099d - i10);
        }
    }

    public final boolean e(byte[] bArr, I5.h hVar, int i10) {
        this.f13096a = (short) (this.f13096a | 4);
        this.f13099d = i10;
        int[] iArr = this.f13100e;
        boolean z10 = false;
        if (iArr == null) {
            return false;
        }
        for (int i11 = iArr[0]; i11 > 0; i11 -= 2) {
            int[] iArr2 = this.f13100e;
            int i12 = iArr2[i11 - 1];
            int i13 = iArr2[i11];
            int i14 = i10 - i12;
            int i15 = 268435455 & i13;
            int i16 = i13 & (-268435456);
            if (i16 == 268435456) {
                if (i14 < -32768 || i14 > 32767) {
                    int i17 = bArr[i12] & 255;
                    if (i17 < 198) {
                        bArr[i12] = (byte) (i17 + 49);
                    } else {
                        bArr[i12] = (byte) (i17 + 20);
                    }
                    z10 = true;
                }
                bArr[i15] = (byte) (i14 >>> 8);
                bArr[i15 + 1] = (byte) i14;
            } else if (i16 == 536870912) {
                bArr[i15] = (byte) (i14 >>> 24);
                bArr[i15 + 1] = (byte) (i14 >>> 16);
                bArr[i15 + 2] = (byte) (i14 >>> 8);
                bArr[i15 + 3] = (byte) i14;
            } else {
                byte[] bArr2 = hVar.f8083b;
                bArr2[i15] = (byte) (i10 >>> 8);
                bArr2[i15 + 1] = (byte) i10;
            }
        }
        return z10;
    }

    public final String toString() {
        return TokenNames.f24315L + System.identityHashCode(this);
    }
}
