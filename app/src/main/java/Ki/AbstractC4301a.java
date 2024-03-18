package ki;

import id.AbstractC3557B;
import ji.C4112A;
import ji.C4117F;
import ji.C4135j;

/* renamed from: ki.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4301a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f37593a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Lg.a.f11131a);
        AbstractC3557B.b0("getBytes(...)", bytes);
        f37593a = bytes;
    }

    public static final String a(C4135j c4135j, long j6) {
        AbstractC3557B.c0("<this>", c4135j);
        if (j6 > 0) {
            long j10 = j6 - 1;
            if (c4135j.k(j10) == 13) {
                String S = c4135j.S(j10, Lg.a.f11131a);
                c4135j.skip(2L);
                return S;
            }
        }
        String S10 = c4135j.S(j6, Lg.a.f11131a);
        c4135j.skip(1L);
        return S10;
    }

    public static final int b(C4135j c4135j, C4112A c4112a, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        byte[] bArr;
        C4117F c4117f;
        int i12;
        AbstractC3557B.c0("<this>", c4135j);
        AbstractC3557B.c0("options", c4112a);
        C4117F c4117f2 = c4135j.f36720Y;
        int i13 = -2;
        if (c4117f2 == null) {
            if (z10) {
                return -2;
            }
            return -1;
        }
        int i14 = c4117f2.f36675b;
        int i15 = c4117f2.f36676c;
        byte[] bArr2 = c4117f2.f36674a;
        C4117F c4117f3 = c4117f2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int[] iArr = c4112a.f36659Z;
            int i19 = iArr[i17];
            int i20 = i17 + 2;
            int i21 = iArr[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (c4117f3 == null) {
                break;
            }
            if (i19 < 0) {
                int i22 = (i19 * (-1)) + i20;
                while (true) {
                    int i23 = i14 + 1;
                    int i24 = i20 + 1;
                    if ((bArr2[i14] & 255) != iArr[i20]) {
                        return i16;
                    }
                    if (i24 == i22) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i23 == i15) {
                        AbstractC3557B.Z(c4117f3);
                        C4117F c4117f4 = c4117f3.f36679f;
                        AbstractC3557B.Z(c4117f4);
                        i12 = c4117f4.f36675b;
                        int i25 = c4117f4.f36676c;
                        bArr = c4117f4.f36674a;
                        if (c4117f4 == c4117f2) {
                            if (!z11) {
                                break loop0;
                            }
                            i15 = i25;
                            c4117f = null;
                        } else {
                            c4117f = c4117f4;
                            i15 = i25;
                        }
                    } else {
                        c4117f = c4117f3;
                        bArr = bArr2;
                        i12 = i23;
                    }
                    if (z11) {
                        i10 = iArr[i24];
                        i11 = i12;
                        bArr2 = bArr;
                        c4117f3 = c4117f;
                        break;
                    }
                    i14 = i12;
                    bArr2 = bArr;
                    c4117f3 = c4117f;
                    i20 = i24;
                }
            } else {
                int i26 = i14 + 1;
                int i27 = bArr2[i14] & 255;
                int i28 = i20 + i19;
                while (i20 != i28) {
                    if (i27 == iArr[i20]) {
                        i10 = iArr[i20 + i19];
                        if (i26 == i15) {
                            c4117f3 = c4117f3.f36679f;
                            AbstractC3557B.Z(c4117f3);
                            i11 = c4117f3.f36675b;
                            i15 = c4117f3.f36676c;
                            bArr2 = c4117f3.f36674a;
                            if (c4117f3 == c4117f2) {
                                c4117f3 = null;
                            }
                        } else {
                            i11 = i26;
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            if (i10 >= 0) {
                return i10;
            }
            i17 = -i10;
            i14 = i11;
            i13 = -2;
        }
        if (z10) {
            return i13;
        }
        return i16;
    }
}
