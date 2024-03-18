package L2;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import k3.C4156a;
import p2.O;

/* renamed from: L2.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0881b {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f10550a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f10551b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f10552c = {1, 2, 3, 6};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f10553d = {48000, 44100, 32000};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f10554e = {24000, 22050, 16000};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f10555f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f10556g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f10557h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f10558i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, RCHTTPStatusCodes.BAD_REQUEST, RCHTTPStatusCodes.BAD_REQUEST, 2048};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f10559j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f10560k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f10561l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f10562m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f10563n = {44100, 48000, 32000};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f10564o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f10565p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f10566q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f10567r = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f10568s = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0 && i10 < 3 && i11 >= 0 && i12 < 19) {
            int i13 = f10553d[i10];
            if (i13 == 44100) {
                return ((i11 % 2) + f10557h[i12]) * 2;
            }
            int i14 = f10556g[i12];
            if (i13 == 32000) {
                return i14 * 6;
            }
            return i14 * 4;
        }
        return -1;
    }

    public static void b(int i10, s2.u uVar) {
        uVar.C(7);
        byte[] bArr = uVar.f45193a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    public static int c(int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i10 & (-2097152)) == -2097152) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f10563n[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = f10564o[i13 - 1];
            } else {
                i16 = f10565p[i13 - 1];
            }
            return (((i16 * 12) / i17) + i18) * 4;
        }
        if (i11 == 3) {
            if (i12 == 2) {
                i15 = f10566q[i13 - 1];
            } else {
                i15 = f10567r[i13 - 1];
            }
        } else {
            i15 = f10568s[i13 - 1];
        }
        int i19 = 144;
        if (i11 == 3) {
            return android.gov.nist.core.a.z(i15, 144, i17, i18);
        }
        if (i12 == 1) {
            i19 = 72;
        }
        return android.gov.nist.core.a.z(i19, i15, i17, i18);
    }

    public static int d(s2.t tVar) {
        int i10 = tVar.i(4);
        if (i10 == 15) {
            if (tVar.b() >= 24) {
                return tVar.i(24);
            }
            throw O.a("AAC header insufficient data", null);
        } else if (i10 < 13) {
            return f10550a[i10];
        } else {
            throw O.a("AAC header wrong Sampling Frequency Index", null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
        if (r11 != 8) goto L47;
     */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, k3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4156a e(s2.t tVar) {
        int i10;
        int i11;
        int i12;
        int i13 = tVar.i(16);
        int i14 = tVar.i(16);
        if (i14 == 65535) {
            i14 = tVar.i(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i15 = i14 + i10;
        if (i13 == 44097) {
            i15 += 2;
        }
        int i16 = tVar.i(2);
        int i17 = 0;
        if (i16 == 3) {
            int i18 = 0;
            while (true) {
                i12 = tVar.i(2) + i18;
                if (!tVar.h()) {
                    break;
                }
                i18 = (i12 + 1) << 2;
            }
            i16 += i12;
        }
        int i19 = tVar.i(10);
        if (tVar.h() && tVar.i(3) > 0) {
            tVar.s(2);
        }
        if (tVar.h()) {
            i11 = 48000;
        } else {
            i11 = 44100;
        }
        int i20 = tVar.i(4);
        int[] iArr = f10558i;
        if (i11 == 44100 && i20 == 13) {
            i17 = iArr[i20];
        } else if (i11 == 48000 && i20 < 14) {
            i17 = iArr[i20];
            int i21 = i19 % 5;
            if (i21 != 1) {
                if (i21 != 2) {
                    if (i21 != 3) {
                        if (i21 == 4) {
                            if (i20 != 3) {
                                if (i20 != 8) {
                                }
                            }
                            i17++;
                        }
                    }
                } else {
                    if (i20 != 8) {
                    }
                    i17++;
                }
            }
            if (i20 != 3) {
            }
            i17++;
        }
        ?? obj = new Object();
        obj.f36961a = i16;
        obj.f36963c = 2;
        obj.f36962b = i11;
        obj.f36964d = i15;
        obj.f36965e = i17;
        return obj;
    }

    public static C0880a f(s2.t tVar, boolean z10) {
        int i10 = tVar.i(5);
        if (i10 == 31) {
            i10 = tVar.i(6) + 32;
        }
        int d10 = d(tVar);
        int i11 = tVar.i(4);
        String e10 = android.gov.nist.core.a.e("mp4a.40.", i10);
        if (i10 == 5 || i10 == 29) {
            d10 = d(tVar);
            int i12 = tVar.i(5);
            if (i12 == 31) {
                i12 = tVar.i(6) + 32;
            }
            i10 = i12;
            if (i10 == 22) {
                i11 = tVar.i(4);
            }
        }
        if (z10) {
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 17) {
                switch (i10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw O.b("Unsupported audio object type: " + i10);
                }
            }
            if (tVar.h()) {
                s2.p.g("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (tVar.h()) {
                tVar.s(14);
            }
            boolean h10 = tVar.h();
            if (i11 != 0) {
                if (i10 == 6 || i10 == 20) {
                    tVar.s(3);
                }
                if (h10) {
                    if (i10 == 22) {
                        tVar.s(16);
                    }
                    if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                        tVar.s(3);
                    }
                    tVar.s(1);
                }
                switch (i10) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i13 = tVar.i(2);
                        if (i13 == 2 || i13 == 3) {
                            throw O.b("Unsupported epConfig: " + i13);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i14 = f10551b[i11];
        if (i14 != -1) {
            return new C0880a(d10, i14, e10);
        }
        throw O.a(null, null);
    }
}
