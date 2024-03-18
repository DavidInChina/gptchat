package Y2;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import l8.AbstractC4344b;
import p2.M;
import s2.AbstractC5530A;
import s2.t;
import s2.u;
import x8.L;
import x8.N;
import x8.k0;

/* loaded from: classes2.dex */
public final class i extends r.f {

    /* renamed from: g  reason: collision with root package name */
    public static final A9.a f22080g = new A9.a(1);

    /* renamed from: f  reason: collision with root package name */
    public final g f22081f;

    public i(A9.a aVar) {
        this.f22081f = aVar;
    }

    public static a e0(int i10, int i11, u uVar) {
        String str;
        int i12;
        byte[] bArr;
        int u10 = uVar.u();
        Charset t02 = t0(u10);
        int i13 = i10 - 1;
        byte[] bArr2 = new byte[i13];
        uVar.e(bArr2, 0, i13);
        if (i11 == 2) {
            String str2 = "image/" + AbstractC4344b.k1(new String(bArr2, 0, 3, w8.e.f48220b));
            if ("image/jpg".equals(str2)) {
                str2 = "image/jpeg";
            }
            str = str2;
            i12 = 2;
        } else {
            i12 = w0(0, bArr2);
            String k12 = AbstractC4344b.k1(new String(bArr2, 0, i12, w8.e.f48220b));
            if (k12.indexOf(47) == -1) {
                str = "image/".concat(k12);
            } else {
                str = k12;
            }
        }
        int i14 = bArr2[i12 + 1] & 255;
        int i15 = i12 + 2;
        int v02 = v0(bArr2, i15, u10);
        String str3 = new String(bArr2, i15, v02 - i15, t02);
        int s02 = s0(u10) + v02;
        if (i13 <= s02) {
            bArr = AbstractC5530A.f45136f;
        } else {
            bArr = Arrays.copyOfRange(bArr2, s02, i13);
        }
        return new a(str, str3, i14, bArr);
    }

    public static c f0(u uVar, int i10, int i11, boolean z10, int i12, g gVar) {
        long j6;
        long j10;
        int i13 = uVar.f45194b;
        int w02 = w0(i13, uVar.f45193a);
        String str = new String(uVar.f45193a, i13, w02 - i13, w8.e.f48220b);
        uVar.F(w02 + 1);
        int g10 = uVar.g();
        int g11 = uVar.g();
        long v10 = uVar.v();
        if (v10 == 4294967295L) {
            j6 = -1;
        } else {
            j6 = v10;
        }
        long v11 = uVar.v();
        if (v11 == 4294967295L) {
            j10 = -1;
        } else {
            j10 = v11;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (uVar.f45194b < i14) {
            j i02 = i0(i11, uVar, z10, i12, gVar);
            if (i02 != null) {
                arrayList.add(i02);
            }
        }
        return new c(str, g10, g11, j6, j10, (j[]) arrayList.toArray(new j[0]));
    }

    public static d g0(u uVar, int i10, int i11, boolean z10, int i12, g gVar) {
        boolean z11;
        boolean z12;
        int i13 = uVar.f45194b;
        int w02 = w0(i13, uVar.f45193a);
        String str = new String(uVar.f45193a, i13, w02 - i13, w8.e.f48220b);
        uVar.F(w02 + 1);
        int u10 = uVar.u();
        if ((u10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((u10 & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int u11 = uVar.u();
        String[] strArr = new String[u11];
        for (int i14 = 0; i14 < u11; i14++) {
            int i15 = uVar.f45194b;
            int w03 = w0(i15, uVar.f45193a);
            strArr[i14] = new String(uVar.f45193a, i15, w03 - i15, w8.e.f48220b);
            uVar.F(w03 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (uVar.f45194b < i16) {
            j i02 = i0(i11, uVar, z10, i12, gVar);
            if (i02 != null) {
                arrayList.add(i02);
            }
        }
        return new d(str, z11, z12, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e h0(int i10, u uVar) {
        if (i10 < 4) {
            return null;
        }
        int u10 = uVar.u();
        Charset t02 = t0(u10);
        byte[] bArr = new byte[3];
        uVar.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        uVar.e(bArr2, 0, i11);
        int v02 = v0(bArr2, 0, u10);
        String str2 = new String(bArr2, 0, v02, t02);
        int s02 = s0(u10) + v02;
        return new e(str, str2, m0(bArr2, s02, v0(bArr2, s02, u10), t02));
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x01a3, code lost:
        if (r12 == 67) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
        if (r20 == 2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
        if (r20 == 2) goto L47;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j i0(int i10, u uVar, boolean z10, int i11, g gVar) {
        int i12;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Throwable th2;
        j jVar;
        Throwable e10;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int u10 = uVar.u();
        int u11 = uVar.u();
        int u12 = uVar.u();
        if (i10 >= 3) {
            i12 = uVar.u();
        } else {
            i12 = 0;
        }
        if (i10 == 4) {
            i13 = uVar.x();
            if (!z10) {
                i13 = (((i13 >> 24) & 255) << 21) | (i13 & 255) | (((i13 >> 8) & 255) << 7) | (((i13 >> 16) & 255) << 14);
            }
        } else if (i10 == 3) {
            i13 = uVar.x();
        } else {
            i13 = uVar.w();
        }
        if (i10 >= 3) {
            i14 = uVar.z();
        } else {
            i14 = 0;
        }
        if (u10 == 0 && u11 == 0 && u12 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            uVar.F(uVar.f45195c);
            return null;
        }
        int i15 = uVar.f45194b + i13;
        if (i15 > uVar.f45195c) {
            s2.p.g("Id3Decoder", "Frame size exceeds remaining tag data");
            uVar.F(uVar.f45195c);
            return null;
        }
        int i16 = 67;
        if (gVar != null) {
            switch (((A9.a) gVar).f730Y) {
                case 1:
                    break;
                default:
                    if (u10 == 67) {
                        if (u11 == 79) {
                            if (u12 == 77) {
                                if (i12 != 77) {
                                }
                            }
                        }
                    }
                    if (u10 == 77) {
                        if (u11 == 76) {
                            if (u12 == 76) {
                                if (i12 != 84) {
                                }
                            }
                        }
                    }
                    break;
            }
            uVar.F(i15);
            return null;
        }
        if (i10 == 3) {
            if ((i14 & 128) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i14 & 64) != 0) {
                z19 = true;
            } else {
                z19 = false;
            }
            if ((i14 & 32) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            z12 = z19;
            z11 = false;
            z13 = z14;
        } else if (i10 == 4) {
            if ((i14 & 64) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i14 & 8) != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((i14 & 4) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((i14 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i14 & 1) != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z20 = z17;
            z13 = z18;
            z15 = z16;
            z14 = z20;
        } else {
            z15 = false;
            z14 = false;
            z13 = false;
            z12 = false;
            z11 = false;
        }
        if (!z14 && !z12) {
            if (z15) {
                i13--;
                uVar.G(1);
            }
            if (z13) {
                i13 -= 4;
                uVar.G(4);
            }
            if (z11) {
                i13 = x0(i13, uVar);
            }
            int i17 = i13;
            int i18 = 84;
            try {
                try {
                } catch (Throwable th3) {
                    uVar.F(i15);
                    throw th3;
                }
            } catch (Exception e11) {
                e10 = e11;
                i16 = i17;
                uVar.F(i15);
                th2 = e10;
                jVar = null;
                if (jVar == null) {
                }
                return jVar;
            } catch (OutOfMemoryError e12) {
                e10 = e12;
                i16 = i17;
                uVar.F(i15);
                th2 = e10;
                jVar = null;
                if (jVar == null) {
                }
                return jVar;
            }
            if (u10 == 84) {
                if (u11 != 88 || u12 != 88 || (i10 != 2 && i12 != 88)) {
                    i18 = 84;
                } else {
                    jVar = p0(i17, uVar);
                    i16 = i17;
                    uVar.F(i15);
                    th2 = null;
                    if (jVar == null) {
                        s2.p.h("Id3Decoder", "Failed to decode frame: id=" + u0(i10, u10, u11, u12, i12) + ", frameSize=" + i16, th2);
                    }
                    return jVar;
                }
            }
            if (u10 == i18) {
                jVar = n0(i17, uVar, u0(i10, u10, u11, u12, i12));
            } else if (u10 == 87 && u11 == 88 && u12 == 88 && (i10 == 2 || i12 == 88)) {
                jVar = r0(i17, uVar);
            } else if (u10 == 87) {
                jVar = q0(i17, uVar, u0(i10, u10, u11, u12, i12));
            } else if (u10 == 80 && u11 == 82 && u12 == 73 && i12 == 86) {
                jVar = l0(i17, uVar);
            } else if (u10 == 71 && u11 == 69 && u12 == 79 && (i12 == 66 || i10 == 2)) {
                jVar = j0(i17, uVar);
            } else if (i10 == 2) {
                if (u10 == 80 && u11 == 73 && u12 == 67) {
                    jVar = e0(i17, i10, uVar);
                }
                if (u10 != 67 && u11 == 79 && u12 == 77 && (i12 == 77 || i10 == 2)) {
                    jVar = h0(i17, uVar);
                } else {
                    try {
                        if (u10 != 67 && u11 == 72 && u12 == 65 && i12 == 80) {
                            i16 = i17;
                            jVar = f0(uVar, i17, i10, z10, i11, gVar);
                        } else if (u10 != 67 && u11 == 84 && u12 == 79 && i12 == 67) {
                            i16 = i17;
                            jVar = g0(uVar, i17, i10, z10, i11, gVar);
                        } else {
                            i16 = i17;
                            if (u10 != 77 && u11 == 76 && u12 == 76 && i12 == 84) {
                                jVar = k0(i16, uVar);
                            } else {
                                String u02 = u0(i10, u10, u11, u12, i12);
                                byte[] bArr = new byte[i16];
                                uVar.e(bArr, 0, i16);
                                jVar = new b(u02, bArr);
                            }
                        }
                        uVar.F(i15);
                        th2 = null;
                    } catch (Exception e13) {
                        e10 = e13;
                        uVar.F(i15);
                        th2 = e10;
                        jVar = null;
                        if (jVar == null) {
                        }
                        return jVar;
                    } catch (OutOfMemoryError e14) {
                        e10 = e14;
                        uVar.F(i15);
                        th2 = e10;
                        jVar = null;
                        if (jVar == null) {
                        }
                        return jVar;
                    }
                    if (jVar == null) {
                    }
                    return jVar;
                }
            } else {
                if (u10 == 65) {
                    if (u11 == 80) {
                        if (u12 == 73) {
                        }
                    }
                }
                if (u10 != 67) {
                }
                if (u10 != 67) {
                }
                if (u10 != 67) {
                }
                i16 = i17;
                if (u10 != 77) {
                }
                String u022 = u0(i10, u10, u11, u12, i12);
                byte[] bArr2 = new byte[i16];
                uVar.e(bArr2, 0, i16);
                jVar = new b(u022, bArr2);
                uVar.F(i15);
                th2 = null;
                if (jVar == null) {
                }
                return jVar;
            }
            i16 = i17;
            uVar.F(i15);
            th2 = null;
            if (jVar == null) {
            }
            return jVar;
        }
        s2.p.g("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
        uVar.F(i15);
        return null;
    }

    public static f j0(int i10, u uVar) {
        byte[] bArr;
        int u10 = uVar.u();
        Charset t02 = t0(u10);
        int i11 = i10 - 1;
        byte[] bArr2 = new byte[i11];
        uVar.e(bArr2, 0, i11);
        int w02 = w0(0, bArr2);
        String str = new String(bArr2, 0, w02, w8.e.f48220b);
        int i12 = w02 + 1;
        int v02 = v0(bArr2, i12, u10);
        String m02 = m0(bArr2, i12, v02, t02);
        int s02 = s0(u10) + v02;
        int v03 = v0(bArr2, s02, u10);
        String m03 = m0(bArr2, s02, v03, t02);
        int s03 = s0(u10) + v03;
        if (i11 <= s03) {
            bArr = AbstractC5530A.f45136f;
        } else {
            bArr = Arrays.copyOfRange(bArr2, s03, i11);
        }
        return new f(str, m02, m03, bArr);
    }

    public static l k0(int i10, u uVar) {
        int z10 = uVar.z();
        int w10 = uVar.w();
        int w11 = uVar.w();
        int u10 = uVar.u();
        int u11 = uVar.u();
        t tVar = new t();
        tVar.o(uVar);
        int i11 = ((i10 - 10) * 8) / (u10 + u11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = tVar.i(u10);
            int i14 = tVar.i(u11);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new l(z10, w10, w11, iArr, iArr2);
    }

    public static m l0(int i10, u uVar) {
        byte[] bArr;
        byte[] bArr2 = new byte[i10];
        uVar.e(bArr2, 0, i10);
        int w02 = w0(0, bArr2);
        String str = new String(bArr2, 0, w02, w8.e.f48220b);
        int i11 = w02 + 1;
        if (i10 <= i11) {
            bArr = AbstractC5530A.f45136f;
        } else {
            bArr = Arrays.copyOfRange(bArr2, i11, i10);
        }
        return new m(str, bArr);
    }

    public static String m0(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, charset);
        }
        return "";
    }

    public static o n0(int i10, u uVar, String str) {
        if (i10 < 1) {
            return null;
        }
        int u10 = uVar.u();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        uVar.e(bArr, 0, i11);
        return new o(str, null, o0(bArr, u10, 0));
    }

    public static k0 o0(byte[] bArr, int i10, int i11) {
        Object[] objArr;
        if (i11 >= bArr.length) {
            return N.u0("");
        }
        L l10 = N.f49523Z;
        AbstractC4344b.T(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        int v02 = v0(bArr, i11, i10);
        int i12 = 0;
        boolean z10 = false;
        while (i11 < v02) {
            String str = new String(bArr, i11, v02 - i11, t0(i10));
            int i13 = i12 + 1;
            if (objArr2.length < i13) {
                objArr = Arrays.copyOf(objArr2, r.f.x(objArr2.length, i13));
            } else if (z10) {
                objArr = (Object[]) objArr2.clone();
            } else {
                objArr2[i12] = str;
                int s02 = v02 + s0(i10);
                i12++;
                i11 = s02;
                v02 = v0(bArr, s02, i10);
            }
            objArr2 = objArr;
            z10 = false;
            objArr2[i12] = str;
            int s022 = v02 + s0(i10);
            i12++;
            i11 = s022;
            v02 = v0(bArr, s022, i10);
        }
        k0 T = N.T(i12, objArr2);
        if (T.isEmpty()) {
            return N.u0("");
        }
        return T;
    }

    public static o p0(int i10, u uVar) {
        if (i10 < 1) {
            return null;
        }
        int u10 = uVar.u();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        uVar.e(bArr, 0, i11);
        int v02 = v0(bArr, 0, u10);
        return new o("TXXX", new String(bArr, 0, v02, t0(u10)), o0(bArr, u10, s0(u10) + v02));
    }

    public static p q0(int i10, u uVar, String str) {
        byte[] bArr = new byte[i10];
        uVar.e(bArr, 0, i10);
        return new p(str, null, new String(bArr, 0, w0(0, bArr), w8.e.f48220b));
    }

    public static p r0(int i10, u uVar) {
        if (i10 < 1) {
            return null;
        }
        int u10 = uVar.u();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        uVar.e(bArr, 0, i11);
        int v02 = v0(bArr, 0, u10);
        String str = new String(bArr, 0, v02, t0(u10));
        int s02 = s0(u10) + v02;
        return new p("WXXX", str, m0(bArr, s02, w0(s02, bArr), w8.e.f48220b));
    }

    public static int s0(int i10) {
        if (i10 != 0 && i10 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset t0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return w8.e.f48220b;
                }
                return w8.e.f48221c;
            }
            return w8.e.f48222d;
        }
        return w8.e.f48224f;
    }

    public static String u0(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int v0(byte[] bArr, int i10, int i11) {
        int w02 = w0(i10, bArr);
        if (i11 != 0 && i11 != 3) {
            while (w02 < bArr.length - 1) {
                if ((w02 - i10) % 2 == 0 && bArr[w02 + 1] == 0) {
                    return w02;
                }
                w02 = w0(w02 + 1, bArr);
            }
            return bArr.length;
        }
        return w02;
    }

    public static int w0(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int x0(int i10, u uVar) {
        byte[] bArr = uVar.f45193a;
        int i11 = uVar.f45194b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 < i11 + i10) {
                if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                    System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                    i10--;
                }
                i12 = i13;
            } else {
                return i10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
        if ((r10 & 128) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean y0(u uVar, int i10, int i11, boolean z10) {
        int i12;
        long j6;
        int i13;
        int i14;
        int i15 = uVar.f45194b;
        while (true) {
            try {
                boolean z11 = true;
                if (uVar.a() >= i11) {
                    if (i10 >= 3) {
                        i13 = uVar.g();
                        j6 = uVar.v();
                        i12 = uVar.z();
                    } else {
                        i13 = uVar.w();
                        j6 = uVar.w();
                        i12 = 0;
                    }
                    if (i13 == 0 && j6 == 0 && i12 == 0) {
                        uVar.F(i15);
                        return true;
                    }
                    if (i10 == 4 && !z10) {
                        if ((8421504 & j6) != 0) {
                            uVar.F(i15);
                            return false;
                        }
                        j6 = (((j6 >> 24) & 255) << 21) | (j6 & 255) | (((j6 >> 8) & 255) << 7) | (((j6 >> 16) & 255) << 14);
                    }
                    if (i10 == 4) {
                        if ((i12 & 64) != 0) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                    } else {
                        if (i10 == 3) {
                            if ((i12 & 32) != 0) {
                                i14 = 1;
                            } else {
                                i14 = 0;
                            }
                        } else {
                            i14 = 0;
                            z11 = false;
                        }
                        if (z11) {
                            i14 += 4;
                        }
                        if (j6 < i14) {
                            uVar.F(i15);
                            return false;
                        } else if (uVar.a() < j6) {
                            uVar.F(i15);
                            return false;
                        } else {
                            uVar.G((int) j6);
                        }
                    }
                } else {
                    uVar.F(i15);
                    return true;
                }
            } catch (Throwable th2) {
                uVar.F(i15);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M d0(int i10, byte[] bArr) {
        h hVar;
        boolean z10;
        boolean z11 = true;
        ArrayList arrayList = new ArrayList();
        u uVar = new u(i10, bArr);
        int i11 = 10;
        if (uVar.a() < 10) {
            s2.p.g("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int w10 = uVar.w();
            if (w10 != 4801587) {
                s2.p.g("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(w10))));
            } else {
                int u10 = uVar.u();
                uVar.G(1);
                int u11 = uVar.u();
                int t10 = uVar.t();
                if (u10 == 2) {
                    if ((u11 & 64) != 0) {
                        s2.p.g("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    if (u10 >= 4 && (u11 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hVar = new h(u10, t10, z10);
                } else {
                    if (u10 == 3) {
                        if ((u11 & 64) != 0) {
                            int g10 = uVar.g();
                            uVar.G(g10);
                            t10 -= g10 + 4;
                        }
                    } else if (u10 == 4) {
                        if ((u11 & 64) != 0) {
                            int t11 = uVar.t();
                            uVar.G(t11 - 4);
                            t10 -= t11;
                        }
                        if ((u11 & 16) != 0) {
                            t10 -= 10;
                        }
                    } else {
                        android.gov.nist.core.a.v("Skipped ID3 tag with unsupported majorVersion=", u10, "Id3Decoder");
                    }
                    if (u10 >= 4) {
                    }
                    z10 = false;
                    hVar = new h(u10, t10, z10);
                }
                if (hVar != null) {
                    return null;
                }
                int i12 = uVar.f45194b;
                int i13 = hVar.f22077a;
                if (i13 == 2) {
                    i11 = 6;
                }
                int i14 = hVar.f22079c;
                if (hVar.f22078b) {
                    i14 = x0(i14, uVar);
                }
                uVar.E(i12 + i14);
                if (!y0(uVar, i13, i11, false)) {
                    if (i13 != 4 || !y0(uVar, 4, i11, true)) {
                        android.gov.nist.core.a.v("Failed to validate ID3 tag with majorVersion=", i13, "Id3Decoder");
                        return null;
                    }
                } else {
                    z11 = false;
                }
                while (uVar.a() >= i11) {
                    j i02 = i0(i13, uVar, z11, i11, this.f22081f);
                    if (i02 != null) {
                        arrayList.add(i02);
                    }
                }
                return new M(arrayList);
            }
        }
        hVar = null;
        if (hVar != null) {
        }
    }

    @Override // r.f
    public final M u(T2.a aVar, ByteBuffer byteBuffer) {
        return d0(byteBuffer.limit(), byteBuffer.array());
    }
}
