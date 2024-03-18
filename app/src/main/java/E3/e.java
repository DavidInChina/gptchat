package e3;

import E2.S;
import L2.AbstractC0881b;
import L2.C0880a;
import L2.C0883d;
import L2.x;
import M3.H;
import android.util.Pair;
import c1.AbstractC2279d;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nf.AbstractC4828h;
import p2.C5059l;
import p2.C5063p;
import p2.C5065s;
import p2.N;
import p2.O;
import s2.AbstractC5530A;
import s2.t;
import s2.u;
import x2.AbstractC6266a;
import x8.k0;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f28811a = "OpusHead".getBytes(w8.e.f48221c);

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public static Pair a(C2791a c2791a) {
        long j6;
        long j10;
        C2792b j11 = c2791a.j(1701606260);
        if (j11 == null) {
            return null;
        }
        u uVar = j11.f28801h0;
        uVar.F(8);
        int h10 = AbstractC6266a.h(uVar.g());
        int x10 = uVar.x();
        long[] jArr = new long[x10];
        long[] jArr2 = new long[x10];
        for (int i10 = 0; i10 < x10; i10++) {
            if (h10 == 1) {
                j6 = uVar.y();
            } else {
                j6 = uVar.v();
            }
            jArr[i10] = j6;
            if (h10 == 1) {
                j10 = uVar.o();
            } else {
                j10 = uVar.g();
            }
            jArr2[i10] = j10;
            if (uVar.r() == 1) {
                uVar.G(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    public static S b(int i10, u uVar) {
        long j6;
        long j10;
        uVar.F(i10 + 12);
        uVar.G(1);
        c(uVar);
        uVar.G(2);
        int u10 = uVar.u();
        if ((u10 & 128) != 0) {
            uVar.G(2);
        }
        if ((u10 & 64) != 0) {
            uVar.G(uVar.u());
        }
        if ((u10 & 32) != 0) {
            uVar.G(2);
        }
        uVar.G(1);
        c(uVar);
        String c10 = N.c(uVar.u());
        if (!"audio/mpeg".equals(c10) && !"audio/vnd.dts".equals(c10) && !"audio/vnd.dts.hd".equals(c10)) {
            uVar.G(4);
            long v10 = uVar.v();
            long v11 = uVar.v();
            uVar.G(1);
            int c11 = c(uVar);
            byte[] bArr = new byte[c11];
            uVar.e(bArr, 0, c11);
            if (v11 > 0) {
                j6 = v11;
            } else {
                j6 = -1;
            }
            if (v10 > 0) {
                j10 = v10;
            } else {
                j10 = -1;
            }
            return new S(c10, bArr, j6, j10);
        }
        return new S(c10, null, -1L, -1L);
    }

    public static int c(u uVar) {
        int u10 = uVar.u();
        int i10 = u10 & 127;
        while ((u10 & 128) == 128) {
            u10 = uVar.u();
            i10 = (i10 << 7) | (u10 & 127);
        }
        return i10;
    }

    public static t2.c d(u uVar) {
        long o10;
        long o11;
        uVar.F(8);
        if (AbstractC6266a.h(uVar.g()) == 0) {
            o10 = uVar.v();
            o11 = uVar.v();
        } else {
            o10 = uVar.o();
            o11 = uVar.o();
        }
        return new t2.c(o10, o11, uVar.v());
    }

    public static Pair e(int i10, int i11, u uVar) {
        boolean z10;
        Pair pair;
        boolean z11;
        boolean z12;
        Integer num;
        q qVar;
        int i12;
        int i13;
        boolean z13;
        byte[] bArr;
        int i14 = uVar.f45194b;
        while (i14 - i10 < i11) {
            uVar.F(i14);
            int g10 = uVar.g();
            boolean z14 = false;
            if (g10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC4828h.u("childAtomSize must be positive", z10);
            if (uVar.g() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                String str = null;
                Integer num2 = null;
                while (i15 - i14 < g10) {
                    uVar.F(i15);
                    int g11 = uVar.g();
                    int g12 = uVar.g();
                    if (g12 == 1718775137) {
                        num2 = Integer.valueOf(uVar.g());
                    } else if (g12 == 1935894637) {
                        uVar.G(4);
                        str = uVar.s(4, w8.e.f48221c);
                    } else if (g12 == 1935894633) {
                        i17 = i15;
                        i16 = g11;
                    }
                    i15 += g11;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    pair = null;
                } else {
                    if (num2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC4828h.u("frma atom is mandatory", z11);
                    if (i17 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    AbstractC4828h.u("schi atom is mandatory", z12);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 < i16) {
                            uVar.F(i18);
                            int g13 = uVar.g();
                            if (uVar.g() == 1952804451) {
                                int h10 = AbstractC6266a.h(uVar.g());
                                uVar.G(1);
                                if (h10 == 0) {
                                    uVar.G(1);
                                    i13 = 0;
                                    i12 = 0;
                                } else {
                                    int u10 = uVar.u();
                                    i13 = u10 & 15;
                                    i12 = (u10 & 240) >> 4;
                                }
                                if (uVar.u() == 1) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                int u11 = uVar.u();
                                byte[] bArr2 = new byte[16];
                                uVar.e(bArr2, 0, 16);
                                if (z13 && u11 == 0) {
                                    int u12 = uVar.u();
                                    byte[] bArr3 = new byte[u12];
                                    uVar.e(bArr3, 0, u12);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                qVar = new q(z13, str, u11, bArr2, i12, i13, bArr);
                            } else {
                                i18 += g13;
                            }
                        } else {
                            num = num2;
                            qVar = null;
                            break;
                        }
                    }
                    if (qVar != null) {
                        z14 = true;
                    }
                    AbstractC4828h.u("tenc atom is mandatory", z14);
                    int i19 = AbstractC5530A.f45131a;
                    pair = Pair.create(num, qVar);
                }
                if (pair != null) {
                    return pair;
                }
            }
            i14 += g10;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04d1  */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v39, types: [s2.q, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s f(p pVar, C2791a c2791a, x xVar) {
        S1.b bVar;
        boolean z10;
        u uVar;
        u uVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        C5065s c5065s;
        long j6;
        p pVar2;
        int[] iArr;
        long[] jArr;
        int i14;
        int[] iArr2;
        long[] jArr2;
        int i15;
        int[] iArr3;
        int i16;
        int i17;
        long[] jArr3;
        long[] jArr4;
        long j10;
        int i18;
        long[] jArr5;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        long[] jArr6;
        int[] iArr4;
        int[] iArr5;
        int i27;
        long[] jArr7;
        int[] iArr6;
        int[] iArr7;
        long[] jArr8;
        int i28;
        boolean z12;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z13;
        int i33;
        String str;
        int i34;
        long[] jArr9;
        int i35;
        int i36;
        C2792b j11 = c2791a.j(1937011578);
        C5065s c5065s2 = pVar.f28908f;
        if (j11 != null) {
            bVar = new S1.b(j11, c5065s2);
        } else {
            C2792b j12 = c2791a.j(1937013298);
            if (j12 != null) {
                ?? obj = new Object();
                u uVar3 = j12.f28801h0;
                obj.f45178e = uVar3;
                uVar3.F(12);
                obj.f45175b = uVar3.x() & 255;
                obj.f45174a = uVar3.x();
                bVar = obj;
            } else {
                throw O.a("Track has no sample table size information", null);
            }
        }
        int b10 = bVar.b();
        if (b10 == 0) {
            return new s(pVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        C2792b j13 = c2791a.j(1937007471);
        if (j13 == null) {
            j13 = c2791a.j(1668232756);
            j13.getClass();
            z10 = true;
        } else {
            z10 = false;
        }
        C2792b j14 = c2791a.j(1937011555);
        j14.getClass();
        C2792b j15 = c2791a.j(1937011827);
        j15.getClass();
        C2792b j16 = c2791a.j(1937011571);
        if (j16 != null) {
            uVar = j16.f28801h0;
        } else {
            uVar = null;
        }
        C2792b j17 = c2791a.j(1668576371);
        if (j17 != null) {
            uVar2 = j17.f28801h0;
        } else {
            uVar2 = null;
        }
        c cVar = new c(j14.f28801h0, j13.f28801h0, z10);
        u uVar4 = j15.f28801h0;
        uVar4.F(12);
        int x10 = uVar4.x() - 1;
        int x11 = uVar4.x();
        int x12 = uVar4.x();
        if (uVar2 != null) {
            uVar2.F(12);
            i10 = uVar2.x();
        } else {
            i10 = 0;
        }
        if (uVar != null) {
            uVar.F(12);
            i12 = uVar.x();
            if (i12 > 0) {
                i11 = uVar.x() - 1;
            } else {
                i11 = -1;
                uVar = null;
            }
        } else {
            i11 = -1;
            i12 = 0;
        }
        int a5 = bVar.a();
        String str2 = c5065s2.f42319q0;
        if (a5 != -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && x10 == 0 && i10 == 0 && i12 == 0)) {
            i13 = x10;
            z11 = true;
        } else {
            i13 = x10;
            z11 = false;
        }
        if (z11) {
            int i37 = cVar.f28802a;
            long[] jArr10 = new long[i37];
            int[] iArr8 = new int[i37];
            while (cVar.a()) {
                int i38 = cVar.f28803b;
                jArr10[i38] = cVar.f28805d;
                iArr8[i38] = cVar.f28804c;
            }
            long j18 = x12;
            int i39 = 8192 / a5;
            int i40 = 0;
            for (int i41 = 0; i41 < i37; i41++) {
                i40 += AbstractC5530A.f(iArr8[i41], i39);
            }
            long[] jArr11 = new long[i40];
            int[] iArr9 = new int[i40];
            long[] jArr12 = new long[i40];
            int[] iArr10 = new int[i40];
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            while (i43 < i37) {
                int i46 = iArr8[i43];
                long j19 = jArr10[i43];
                int i47 = i45;
                int i48 = i37;
                int i49 = i44;
                int i50 = i47;
                long[] jArr13 = jArr10;
                int i51 = i46;
                while (i51 > 0) {
                    int min = Math.min(i39, i51);
                    jArr11[i50] = j19;
                    int[] iArr11 = iArr8;
                    int i52 = a5 * min;
                    iArr9[i50] = i52;
                    i49 = Math.max(i49, i52);
                    jArr12[i50] = i42 * j18;
                    iArr10[i50] = 1;
                    j19 += iArr9[i50];
                    i42 += min;
                    i51 -= min;
                    i50++;
                    iArr8 = iArr11;
                    i39 = i39;
                }
                i43++;
                jArr10 = jArr13;
                int i53 = i50;
                i44 = i49;
                i37 = i48;
                i45 = i53;
            }
            long j20 = j18 * i42;
            i15 = b10;
            c5065s = c5065s2;
            jArr2 = jArr11;
            iArr = iArr10;
            iArr2 = iArr9;
            jArr = jArr12;
            i14 = i44;
            pVar2 = pVar;
            j6 = j20;
        } else {
            jArr2 = new long[b10];
            int[] iArr12 = new int[b10];
            long[] jArr14 = new long[b10];
            int[] iArr13 = new int[b10];
            c5065s = c5065s2;
            int i54 = i11;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            long j21 = 0;
            int i58 = 0;
            int i59 = 0;
            long j22 = 0;
            while (true) {
                if (i55 < b10) {
                    boolean z14 = true;
                    while (i57 == 0) {
                        z14 = cVar.a();
                        if (!z14) {
                            break;
                        }
                        int i60 = x11;
                        long j23 = cVar.f28805d;
                        i57 = cVar.f28804c;
                        j22 = j23;
                        x11 = i60;
                        x12 = x12;
                        b10 = b10;
                    }
                    int i61 = b10;
                    i32 = x11;
                    int i62 = x12;
                    if (!z14) {
                        s2.p.g("AtomParsers", "Unexpected end of chunk data");
                        jArr2 = Arrays.copyOf(jArr2, i55);
                        iArr12 = Arrays.copyOf(iArr12, i55);
                        jArr14 = Arrays.copyOf(jArr14, i55);
                        iArr13 = Arrays.copyOf(iArr13, i55);
                        b10 = i55;
                        break;
                    }
                    if (uVar2 != null) {
                        while (i59 == 0 && i10 > 0) {
                            i59 = uVar2.x();
                            i58 = uVar2.g();
                            i10--;
                        }
                        i59--;
                    }
                    int i63 = i58;
                    jArr2[i55] = j22;
                    int c10 = bVar.c();
                    iArr12[i55] = c10;
                    if (c10 > i56) {
                        i56 = c10;
                    }
                    jArr14[i55] = j21 + i63;
                    if (uVar == null) {
                        i34 = 1;
                    } else {
                        i34 = 0;
                    }
                    iArr13[i55] = i34;
                    if (i55 == i54) {
                        iArr13[i55] = 1;
                        i12--;
                        if (i12 > 0) {
                            uVar.getClass();
                            i54 = uVar.x() - 1;
                        }
                    }
                    j21 += i62;
                    x11 = i32 - 1;
                    if (x11 == 0 && i13 > 0) {
                        i35 = i13 - 1;
                        jArr9 = jArr2;
                        x11 = uVar4.x();
                        i36 = uVar4.g();
                    } else {
                        jArr9 = jArr2;
                        i36 = i62;
                        i35 = i13;
                    }
                    i58 = i63;
                    j22 += iArr12[i55];
                    i57--;
                    i55++;
                    i13 = i35;
                    jArr2 = jArr9;
                    b10 = i61;
                    x12 = i36;
                } else {
                    i32 = x11;
                    break;
                }
            }
            int i64 = i57;
            long j24 = j21 + i58;
            if (uVar2 != null) {
                while (i10 > 0) {
                    if (uVar2.x() != 0) {
                        z13 = false;
                        break;
                    }
                    uVar2.g();
                    i10--;
                }
            }
            z13 = true;
            if (i12 == 0 && i32 == 0 && i64 == 0 && i13 == 0) {
                i33 = i59;
                if (i33 == 0 && z13) {
                    pVar2 = pVar;
                    i15 = b10;
                    iArr2 = iArr12;
                    jArr = jArr14;
                    i14 = i56;
                    iArr = iArr13;
                    j6 = j24;
                }
            } else {
                i33 = i59;
            }
            StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
            pVar2 = pVar;
            sb2.append(pVar2.f28903a);
            sb2.append(": remainingSynchronizationSamples ");
            sb2.append(i12);
            sb2.append(", remainingSamplesAtTimestampDelta ");
            sb2.append(i32);
            sb2.append(", remainingSamplesInChunk ");
            sb2.append(i64);
            sb2.append(", remainingTimestampDeltaChanges ");
            sb2.append(i13);
            sb2.append(", remainingSamplesAtTimestampOffset ");
            sb2.append(i33);
            if (!z13) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            sb2.append(str);
            s2.p.g("AtomParsers", sb2.toString());
            i15 = b10;
            iArr2 = iArr12;
            jArr = jArr14;
            i14 = i56;
            iArr = iArr13;
            j6 = j24;
        }
        RoundingMode roundingMode = RoundingMode.FLOOR;
        long I10 = AbstractC5530A.I(j6, 1000000L, pVar2.f28905c, roundingMode);
        long j25 = pVar2.f28905c;
        long[] jArr15 = pVar2.f28910h;
        if (jArr15 == null) {
            AbstractC5530A.H(jArr, j25);
            return new s(pVar, jArr2, iArr2, i14, jArr, iArr, I10);
        }
        int length = jArr15.length;
        int i65 = pVar2.f28904b;
        long[] jArr16 = pVar2.f28911i;
        if (length == 1 && i65 == 1 && jArr.length >= 2) {
            jArr16.getClass();
            long j26 = jArr16[0];
            i18 = i15;
            jArr3 = jArr16;
            iArr3 = iArr2;
            i17 = i14;
            i16 = i65;
            jArr5 = jArr15;
            long I11 = j26 + AbstractC5530A.I(jArr15[0], pVar2.f28905c, pVar2.f28906d, roundingMode);
            int length2 = jArr.length - 1;
            int i66 = AbstractC5530A.i(4, 0, length2);
            int i67 = AbstractC5530A.i(jArr.length - 4, 0, length2);
            long j27 = jArr[0];
            if (j27 <= j26 && j26 < jArr[i66] && jArr[i67] < I11 && I11 <= j6) {
                C5065s c5065s3 = c5065s;
                j10 = j6;
                long I12 = AbstractC5530A.I(j26 - j27, c5065s3.f42298E0, pVar2.f28905c, roundingMode);
                jArr4 = jArr2;
                long I13 = AbstractC5530A.I(j6 - I11, c5065s3.f42298E0, pVar2.f28905c, roundingMode);
                if ((I12 != 0 || I13 != 0) && I12 <= 2147483647L && I13 <= 2147483647L) {
                    xVar.f10656a = (int) I12;
                    xVar.f10657b = (int) I13;
                    AbstractC5530A.H(jArr, j25);
                    return new s(pVar, jArr4, iArr3, i17, jArr, iArr, AbstractC5530A.I(jArr5[0], 1000000L, pVar2.f28906d, roundingMode));
                }
                i19 = 1;
                if (jArr5.length != 1) {
                    i21 = 0;
                    if (jArr5[0] == 0) {
                        jArr3.getClass();
                        long j28 = jArr3[0];
                        for (int i68 = 0; i68 < jArr.length; i68++) {
                            jArr[i68] = AbstractC5530A.I(jArr[i68] - j28, 1000000L, pVar2.f28905c, RoundingMode.FLOOR);
                        }
                        return new s(pVar, jArr4, iArr3, i17, jArr, iArr, AbstractC5530A.I(j10 - j28, 1000000L, pVar2.f28905c, RoundingMode.FLOOR));
                    }
                    i20 = i16;
                    i19 = 1;
                } else {
                    i21 = 0;
                    i20 = i16;
                }
                if (i20 != i19) {
                    i22 = 1;
                } else {
                    i22 = i21;
                }
                int[] iArr14 = new int[jArr5.length];
                int[] iArr15 = new int[jArr5.length];
                jArr3.getClass();
                i23 = i21;
                int i69 = i23;
                i24 = i69;
                int i70 = i24;
                while (i23 < jArr5.length) {
                    long j29 = jArr3[i23];
                    if (j29 != -1) {
                        int i71 = i69;
                        int i72 = i24;
                        long I14 = AbstractC5530A.I(jArr5[i23], pVar2.f28905c, pVar2.f28906d, RoundingMode.FLOOR);
                        int i73 = 1;
                        iArr14[i23] = AbstractC5530A.e(jArr, j29, true);
                        long j30 = j29 + I14;
                        z12 = i22;
                        iArr15[i23] = AbstractC5530A.b(jArr, j30, z12);
                        while (true) {
                            i29 = iArr14[i23];
                            i30 = iArr15[i23];
                            if (i29 >= i30 || (iArr[i29] & i73) != 0) {
                                break;
                            }
                            iArr14[i23] = i29 + 1;
                            i73 = 1;
                        }
                        int i74 = (i30 - i29) + i72;
                        if (i70 != i29) {
                            i31 = 1;
                        } else {
                            i31 = 0;
                        }
                        i70 = i30;
                        i24 = i74;
                        i69 = i71 | i31;
                    } else {
                        z12 = i22;
                    }
                    i23++;
                    int i75 = z12 == true ? 1 : 0;
                    boolean z15 = z12 == true ? 1 : 0;
                    i22 = i75;
                }
                int i76 = i69;
                if (i24 == i18) {
                    i25 = 1;
                } else {
                    i25 = 0;
                }
                i26 = i76 | i25;
                if (i26 == 0) {
                    jArr6 = new long[i24];
                } else {
                    jArr6 = jArr4;
                }
                if (i26 == 0) {
                    iArr4 = new int[i24];
                } else {
                    iArr4 = iArr3;
                }
                if (i26 != 0) {
                    i17 = 0;
                }
                if (i26 == 0) {
                    iArr5 = new int[i24];
                } else {
                    iArr5 = iArr;
                }
                long[] jArr17 = new long[i24];
                i27 = 0;
                int i77 = 0;
                long j31 = 0;
                while (i27 < jArr5.length) {
                    long j32 = jArr3[i27];
                    int i78 = iArr14[i27];
                    int[] iArr16 = iArr14;
                    int i79 = iArr15[i27];
                    if (i26 != 0) {
                        iArr6 = iArr15;
                        int i80 = i79 - i78;
                        jArr7 = jArr5;
                        System.arraycopy(jArr4, i78, jArr6, i77, i80);
                        iArr7 = iArr3;
                        System.arraycopy(iArr7, i78, iArr4, i77, i80);
                        System.arraycopy(iArr, i78, iArr5, i77, i80);
                    } else {
                        jArr7 = jArr5;
                        iArr6 = iArr15;
                        iArr7 = iArr3;
                    }
                    int i81 = i17;
                    while (i78 < i79) {
                        RoundingMode roundingMode2 = RoundingMode.FLOOR;
                        int[] iArr17 = iArr;
                        int i82 = i81;
                        long I15 = AbstractC5530A.I(j31, 1000000L, pVar2.f28906d, roundingMode2);
                        int i83 = i79;
                        long[] jArr18 = jArr;
                        long I16 = AbstractC5530A.I(jArr[i78] - j32, 1000000L, pVar2.f28905c, roundingMode2);
                        int[] iArr18 = iArr5;
                        if (i20 != 1) {
                            jArr8 = jArr17;
                            I16 = Math.max(0L, I16);
                        } else {
                            jArr8 = jArr17;
                        }
                        jArr8[i77] = I15 + I16;
                        if (i26 != 0) {
                            i28 = i82;
                            if (iArr4[i77] > i28) {
                                i81 = iArr7[i78];
                                i77++;
                                i78++;
                                iArr = iArr17;
                                jArr17 = jArr8;
                                jArr = jArr18;
                                iArr5 = iArr18;
                                i79 = i83;
                            }
                        } else {
                            i28 = i82;
                        }
                        i81 = i28;
                        i77++;
                        i78++;
                        iArr = iArr17;
                        jArr17 = jArr8;
                        jArr = jArr18;
                        iArr5 = iArr18;
                        i79 = i83;
                    }
                    j31 += jArr7[i27];
                    i27++;
                    iArr = iArr;
                    iArr3 = iArr7;
                    i17 = i81;
                    jArr17 = jArr17;
                    iArr14 = iArr16;
                    iArr15 = iArr6;
                    jArr = jArr;
                    jArr5 = jArr7;
                    iArr5 = iArr5;
                }
                return new s(pVar, jArr6, iArr4, i17, jArr17, iArr5, AbstractC5530A.I(j31, 1000000L, pVar2.f28906d, RoundingMode.FLOOR));
            }
            jArr4 = jArr2;
        } else {
            i18 = i15;
            jArr4 = jArr2;
            iArr3 = iArr2;
            i17 = i14;
            i16 = i65;
            jArr3 = jArr16;
            jArr5 = jArr15;
        }
        j10 = j6;
        i19 = 1;
        if (jArr5.length != 1) {
        }
        if (i20 != i19) {
        }
        int[] iArr142 = new int[jArr5.length];
        int[] iArr152 = new int[jArr5.length];
        jArr3.getClass();
        i23 = i21;
        int i692 = i23;
        i24 = i692;
        int i702 = i24;
        while (i23 < jArr5.length) {
        }
        int i762 = i692;
        if (i24 == i18) {
        }
        i26 = i762 | i25;
        if (i26 == 0) {
        }
        if (i26 == 0) {
        }
        if (i26 != 0) {
        }
        if (i26 == 0) {
        }
        long[] jArr172 = new long[i24];
        i27 = 0;
        int i772 = 0;
        long j312 = 0;
        while (i27 < jArr5.length) {
        }
        return new s(pVar, jArr6, iArr4, i17, jArr172, iArr5, AbstractC5530A.I(j312, 1000000L, pVar2.f28906d, RoundingMode.FLOOR));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
        if (r11 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
        r11 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:693:0x0f34  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0f36  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x0f9b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList g(C2791a c2791a, x xVar, long j6, C5063p c5063p, boolean z10, boolean z11, w8.f fVar) {
        int i10;
        ArrayList arrayList;
        p pVar;
        w8.f fVar2;
        long j10;
        long j11;
        int i11;
        int i12;
        C2792b j12;
        long[] jArr;
        long[] jArr2;
        Pair a5;
        C2791a c2791a2;
        int i13;
        Pair pair;
        int i14;
        int i15;
        int i16;
        q[] qVarArr;
        int i17;
        String str;
        int i18;
        C5063p c5063p2;
        int i19;
        int i20;
        String str2;
        byte[] bArr;
        int i21;
        int i22;
        float f6;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        String str3;
        byte[] bArr2;
        boolean z12;
        int i29;
        List list;
        String str4;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        C5063p c5063p3;
        String str5;
        int i43;
        String str6;
        String str7;
        String str8;
        int i44;
        String str9;
        int i45;
        k0 k0Var;
        S s10;
        String str10;
        int i46;
        List u02;
        String str11;
        int i47;
        C5063p c5063p4;
        int i48;
        long j13;
        k0 k0Var2;
        int i49;
        C2791a c2791a3 = c2791a;
        C5063p c5063p5 = c5063p;
        ArrayList arrayList2 = new ArrayList();
        int i50 = 0;
        while (true) {
            ArrayList arrayList3 = c2791a3.f28800j0;
            if (i50 < arrayList3.size()) {
                C2791a c2791a4 = (C2791a) arrayList3.get(i50);
                if (c2791a4.f48626Z != 1953653099) {
                    i10 = i50;
                } else {
                    C2792b j14 = c2791a3.j(1836476516);
                    j14.getClass();
                    C2791a i51 = c2791a4.i(1835297121);
                    i51.getClass();
                    C2792b j15 = i51.j(1751411826);
                    j15.getClass();
                    u uVar = j15.f28801h0;
                    uVar.F(16);
                    int g10 = uVar.g();
                    int i52 = g10 == 1936684398 ? 1 : g10 == 1986618469 ? 2 : (g10 == 1952807028 || g10 == 1935832172 || g10 == 1937072756 || g10 == 1668047728) ? 3 : g10 == 1835365473 ? 5 : -1;
                    if (i52 == -1) {
                        fVar2 = fVar;
                        arrayList = arrayList2;
                        i10 = i50;
                        pVar = null;
                    } else {
                        C2792b j16 = c2791a4.j(1953196132);
                        j16.getClass();
                        u uVar2 = j16.f28801h0;
                        uVar2.F(8);
                        int h10 = AbstractC6266a.h(uVar2.g());
                        uVar2.G(h10 == 0 ? 8 : 16);
                        int g11 = uVar2.g();
                        uVar2.G(4);
                        int i53 = uVar2.f45194b;
                        int i54 = h10 == 0 ? 4 : 8;
                        int i55 = 0;
                        while (true) {
                            j10 = -9223372036854775807L;
                            if (i55 < i54) {
                                if (uVar2.f45193a[i53 + i55] != -1) {
                                    j11 = h10 == 0 ? uVar2.v() : uVar2.y();
                                } else {
                                    i55++;
                                }
                            } else {
                                uVar2.G(i54);
                                break;
                            }
                        }
                        uVar2.G(16);
                        int g12 = uVar2.g();
                        int g13 = uVar2.g();
                        uVar2.G(4);
                        int g14 = uVar2.g();
                        int g15 = uVar2.g();
                        if (g12 == 0 && g13 == 65536) {
                            i49 = -65536;
                            if (g14 == -65536 && g15 == 0) {
                                i11 = 90;
                                long j17 = j6 == -9223372036854775807L ? j11 : j6;
                                i12 = (j17 > (-9223372036854775807L) ? 1 : (j17 == (-9223372036854775807L) ? 0 : -1));
                                long j18 = d(j14.f28801h0).f45635h0;
                                if (i12 != 0) {
                                    int i56 = AbstractC5530A.f45131a;
                                    j10 = AbstractC5530A.I(j17, 1000000L, j18, RoundingMode.FLOOR);
                                }
                                C2791a i57 = i51.i(1835626086);
                                i57.getClass();
                                C2791a i58 = i57.i(1937007212);
                                i58.getClass();
                                C2792b j19 = i51.j(1835296868);
                                j19.getClass();
                                u uVar3 = j19.f28801h0;
                                uVar3.F(8);
                                int h11 = AbstractC6266a.h(uVar3.g());
                                uVar3.G(h11 == 0 ? 8 : 16);
                                long v10 = uVar3.v();
                                uVar3.G(h11 == 0 ? 4 : 8);
                                int z13 = uVar3.z();
                                Pair create = Pair.create(Long.valueOf(v10), "" + ((char) (((z13 >> 10) & 31) + 96)) + ((char) (((z13 >> 5) & 31) + 96)) + ((char) ((z13 & 31) + 96)));
                                j12 = i58.j(1937011556);
                                if (j12 != null) {
                                    String str12 = (String) create.second;
                                    u uVar4 = j12.f28801h0;
                                    uVar4.F(12);
                                    int g16 = uVar4.g();
                                    q[] qVarArr2 = new q[g16];
                                    int i59 = 0;
                                    C5065s c5065s = null;
                                    int i60 = 0;
                                    int i61 = 0;
                                    while (i59 < g16) {
                                        int i62 = uVar4.f45194b;
                                        int i63 = g16;
                                        int g17 = uVar4.g();
                                        ArrayList arrayList4 = arrayList2;
                                        int i64 = i50;
                                        String str13 = "childAtomSize must be positive";
                                        AbstractC4828h.u(str13, g17 > 0);
                                        int g18 = uVar4.g();
                                        long j20 = j18;
                                        if (g18 == 1635148593 || g18 == 1635148595 || g18 == 1701733238 || g18 == 1831958048 || g18 == 1836070006 || g18 == 1752589105 || g18 == 1751479857 || g18 == 1932670515 || g18 == 1211250227 || g18 == 1987063864 || g18 == 1987063865 || g18 == 1635135537 || g18 == 1685479798 || g18 == 1685479729 || g18 == 1685481573 || g18 == 1685481521) {
                                            int i65 = i11;
                                            c2791a2 = c2791a4;
                                            pair = create;
                                            i14 = i52;
                                            i17 = i59;
                                            qVarArr = qVarArr2;
                                            String str14 = str13;
                                            uVar4.F(i62 + 16);
                                            uVar4.G(16);
                                            int z14 = uVar4.z();
                                            int z15 = uVar4.z();
                                            uVar4.G(50);
                                            int i66 = uVar4.f45194b;
                                            if (g18 == 1701733238) {
                                                i19 = g17;
                                                i20 = i62;
                                                Pair e10 = e(i20, i19, uVar4);
                                                if (e10 != null) {
                                                    g18 = ((Integer) e10.first).intValue();
                                                    c5063p2 = c5063p == null ? null : c5063p.a(((q) e10.second).f28915b);
                                                    qVarArr[i17] = (q) e10.second;
                                                } else {
                                                    c5063p2 = c5063p;
                                                }
                                                uVar4.F(i66);
                                            } else {
                                                i19 = g17;
                                                i20 = i62;
                                                c5063p2 = c5063p;
                                            }
                                            if (g18 != 1831958048) {
                                                str2 = g18 == 1211250227 ? "video/3gpp" : null;
                                            } else {
                                                str2 = "video/mpeg";
                                            }
                                            str = str12;
                                            C5063p c5063p6 = c5063p2;
                                            float f10 = 1.0f;
                                            int i67 = i61;
                                            byte[] bArr3 = null;
                                            int i68 = -1;
                                            ByteBuffer byteBuffer = null;
                                            S s11 = null;
                                            k0 k0Var3 = null;
                                            int i69 = -1;
                                            int i70 = -1;
                                            int i71 = 8;
                                            int i72 = 8;
                                            int i73 = i66;
                                            boolean z16 = false;
                                            String str15 = str2;
                                            int i74 = -1;
                                            String str16 = null;
                                            while (true) {
                                                if (i73 - i20 >= i19) {
                                                    i16 = i20;
                                                    bArr = bArr3;
                                                    i21 = z14;
                                                    i22 = z15;
                                                    i15 = i19;
                                                    i13 = g11;
                                                    f6 = f10;
                                                    break;
                                                }
                                                uVar4.F(i73);
                                                int i75 = uVar4.f45194b;
                                                bArr = bArr3;
                                                int g19 = uVar4.g();
                                                f6 = f10;
                                                if (g19 == 0 && uVar4.f45194b - i20 == i19) {
                                                    i16 = i20;
                                                    i21 = z14;
                                                    i22 = z15;
                                                    i15 = i19;
                                                    i13 = g11;
                                                    break;
                                                }
                                                AbstractC4828h.u(str14, g19 > 0);
                                                int g20 = uVar4.g();
                                                String str17 = str14;
                                                if (g20 == 1635148611) {
                                                    AbstractC4828h.u(null, str15 == null);
                                                    uVar4.F(i75 + 8);
                                                    C0883d a10 = C0883d.a(uVar4);
                                                    f10 = !z16 ? a10.f10585j : f6;
                                                    int i76 = a10.f10577b;
                                                    str15 = "video/avc";
                                                    list = a10.f10576a;
                                                    str4 = a10.f10586k;
                                                    i30 = a10.f10582g;
                                                    i67 = i76;
                                                    i31 = a10.f10583h;
                                                    i32 = a10.f10584i;
                                                    i33 = a10.f10580e;
                                                    i34 = a10.f10581f;
                                                } else if (g20 == 1752589123) {
                                                    AbstractC4828h.u(null, str15 == null);
                                                    uVar4.F(i75 + 8);
                                                    C0883d b10 = C0883d.b(uVar4);
                                                    f10 = !z16 ? b10.f10585j : f6;
                                                    int i77 = b10.f10577b;
                                                    str15 = "video/hevc";
                                                    list = b10.f10576a;
                                                    str4 = b10.f10586k;
                                                    i30 = b10.f10582g;
                                                    i67 = i77;
                                                    i31 = b10.f10583h;
                                                    i32 = b10.f10584i;
                                                    i33 = b10.f10580e;
                                                    i34 = b10.f10581f;
                                                } else {
                                                    if (g20 == 1685480259 || g20 == 1685485123) {
                                                        i26 = i20;
                                                        i24 = z14;
                                                        i27 = z15;
                                                        i28 = g18;
                                                        i25 = i19;
                                                        i23 = g11;
                                                        String str18 = str16;
                                                        C0880a a11 = C0880a.a(uVar4);
                                                        if (a11 != null) {
                                                            str16 = a11.f10549c;
                                                            str15 = "video/dolby-vision";
                                                        } else {
                                                            str16 = str18;
                                                        }
                                                    } else if (g20 == 1987076931) {
                                                        AbstractC4828h.u(null, str15 == null);
                                                        String str19 = g18 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                        uVar4.F(i75 + 12);
                                                        uVar4.G(2);
                                                        int u10 = uVar4.u();
                                                        int i78 = u10 >> 4;
                                                        boolean z17 = (u10 & 1) != 0;
                                                        int u11 = uVar4.u();
                                                        int u12 = uVar4.u();
                                                        int c10 = C5059l.c(u11);
                                                        i26 = i20;
                                                        i24 = z14;
                                                        i27 = z15;
                                                        i28 = g18;
                                                        i25 = i19;
                                                        i70 = z17 ? 1 : 2;
                                                        i71 = i78;
                                                        i72 = i71;
                                                        i68 = c10;
                                                        i23 = g11;
                                                        str15 = str19;
                                                        i74 = C5059l.d(u12);
                                                    } else {
                                                        if (g20 == 1635135811) {
                                                            AbstractC4828h.u(null, str15 == null);
                                                            uVar4.F(i75 + 8);
                                                            uVar4.G(1);
                                                            int u13 = uVar4.u() >> 5;
                                                            int u14 = uVar4.u();
                                                            if (((u14 >> 6) & 1) != 0) {
                                                                z12 = true;
                                                                i29 = 2;
                                                            } else {
                                                                i29 = 2;
                                                                z12 = false;
                                                            }
                                                            if (u13 == i29 && z12) {
                                                                i71 = ((u14 >> 5) & 1) != 0 ? 12 : 10;
                                                            } else if (u13 <= i29) {
                                                                i71 = z12 ? 10 : 8;
                                                            }
                                                            str15 = "video/av01";
                                                            i26 = i20;
                                                            i24 = z14;
                                                            i27 = z15;
                                                            i28 = g18;
                                                            i25 = i19;
                                                            i23 = g11;
                                                            f10 = f6;
                                                            i72 = i71;
                                                        } else if (g20 == 1668050025) {
                                                            if (byteBuffer == null) {
                                                                byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                            }
                                                            ByteBuffer byteBuffer2 = byteBuffer;
                                                            byteBuffer2.position(21);
                                                            byteBuffer2.putShort(uVar4.r());
                                                            byteBuffer2.putShort(uVar4.r());
                                                            i26 = i20;
                                                            i24 = z14;
                                                            i27 = z15;
                                                            i28 = g18;
                                                            i25 = i19;
                                                            byteBuffer = byteBuffer2;
                                                            i23 = g11;
                                                            f10 = f6;
                                                        } else {
                                                            if (g20 == 1835295606) {
                                                                if (byteBuffer == null) {
                                                                    byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                }
                                                                ByteBuffer byteBuffer3 = byteBuffer;
                                                                short r10 = uVar4.r();
                                                                short r11 = uVar4.r();
                                                                i28 = g18;
                                                                short r12 = uVar4.r();
                                                                i26 = i20;
                                                                short r13 = uVar4.r();
                                                                i25 = i19;
                                                                short r14 = uVar4.r();
                                                                i27 = z15;
                                                                short r15 = uVar4.r();
                                                                i24 = z14;
                                                                short r16 = uVar4.r();
                                                                str3 = str16;
                                                                short r17 = uVar4.r();
                                                                long v11 = uVar4.v();
                                                                long v12 = uVar4.v();
                                                                i23 = g11;
                                                                byteBuffer3.position(1);
                                                                byteBuffer3.putShort(r14);
                                                                byteBuffer3.putShort(r15);
                                                                byteBuffer3.putShort(r10);
                                                                byteBuffer3.putShort(r11);
                                                                byteBuffer3.putShort(r12);
                                                                byteBuffer3.putShort(r13);
                                                                byteBuffer3.putShort(r16);
                                                                byteBuffer3.putShort(r17);
                                                                byteBuffer3.putShort((short) (v11 / 10000));
                                                                byteBuffer3.putShort((short) (v12 / 10000));
                                                                byteBuffer = byteBuffer3;
                                                            } else {
                                                                i26 = i20;
                                                                i24 = z14;
                                                                i27 = z15;
                                                                i28 = g18;
                                                                i25 = i19;
                                                                i23 = g11;
                                                                str3 = str16;
                                                                if (g20 == 1681012275) {
                                                                    AbstractC4828h.u(null, str15 == null);
                                                                    str15 = "video/3gpp";
                                                                } else if (g20 == 1702061171) {
                                                                    AbstractC4828h.u(null, str15 == null);
                                                                    S b11 = b(i75, uVar4);
                                                                    String str20 = (String) b11.f4233c;
                                                                    byte[] bArr4 = (byte[]) b11.f4234d;
                                                                    if (bArr4 != null) {
                                                                        k0Var3 = x8.N.u0(bArr4);
                                                                    }
                                                                    s11 = b11;
                                                                    str15 = str20;
                                                                } else {
                                                                    if (g20 == 1885434736) {
                                                                        uVar4.F(i75 + 8);
                                                                        f10 = uVar4.x() / uVar4.x();
                                                                        str16 = str3;
                                                                        z16 = true;
                                                                    } else if (g20 == 1937126244) {
                                                                        int i79 = i75 + 8;
                                                                        while (true) {
                                                                            if (i79 - i75 >= g19) {
                                                                                bArr2 = null;
                                                                                break;
                                                                            }
                                                                            uVar4.F(i79);
                                                                            int g21 = uVar4.g();
                                                                            if (uVar4.g() == 1886547818) {
                                                                                bArr2 = Arrays.copyOfRange(uVar4.f45193a, i79, g21 + i79);
                                                                                break;
                                                                            }
                                                                            i79 += g21;
                                                                        }
                                                                        bArr = bArr2;
                                                                    } else if (g20 == 1936995172) {
                                                                        int u15 = uVar4.u();
                                                                        uVar4.G(3);
                                                                        if (u15 == 0) {
                                                                            int u16 = uVar4.u();
                                                                            if (u16 == 0) {
                                                                                i69 = 0;
                                                                            } else if (u16 == 1) {
                                                                                i69 = 1;
                                                                            } else if (u16 == 2) {
                                                                                i69 = 2;
                                                                            } else if (u16 == 3) {
                                                                                i69 = 3;
                                                                            }
                                                                        }
                                                                        f10 = f6;
                                                                        str16 = str3;
                                                                    } else {
                                                                        if (g20 == 1668246642 && i68 == -1 && i74 == -1) {
                                                                            int g22 = uVar4.g();
                                                                            if (g22 != 1852009592 && g22 != 1852009571) {
                                                                                s2.p.g("AtomParsers", "Unsupported color type: " + AbstractC6266a.f(g22));
                                                                            } else {
                                                                                int z18 = uVar4.z();
                                                                                int z19 = uVar4.z();
                                                                                uVar4.G(2);
                                                                                boolean z20 = g19 == 19 && (uVar4.u() & 128) != 0;
                                                                                int c11 = C5059l.c(z18);
                                                                                int i80 = z20 ? 1 : 2;
                                                                                i74 = C5059l.d(z19);
                                                                                i70 = i80;
                                                                                f10 = f6;
                                                                                str16 = str3;
                                                                                i68 = c11;
                                                                            }
                                                                        }
                                                                        f10 = f6;
                                                                        str16 = str3;
                                                                    }
                                                                    i73 += g19;
                                                                    g18 = i28;
                                                                    bArr3 = bArr;
                                                                    str14 = str17;
                                                                    z15 = i27;
                                                                    i20 = i26;
                                                                    i19 = i25;
                                                                    z14 = i24;
                                                                    g11 = i23;
                                                                }
                                                            }
                                                            f10 = f6;
                                                            str16 = str3;
                                                        }
                                                        i73 += g19;
                                                        g18 = i28;
                                                        bArr3 = bArr;
                                                        str14 = str17;
                                                        z15 = i27;
                                                        i20 = i26;
                                                        i19 = i25;
                                                        z14 = i24;
                                                        g11 = i23;
                                                    }
                                                    f10 = f6;
                                                    i73 += g19;
                                                    g18 = i28;
                                                    bArr3 = bArr;
                                                    str14 = str17;
                                                    z15 = i27;
                                                    i20 = i26;
                                                    i19 = i25;
                                                    z14 = i24;
                                                    g11 = i23;
                                                }
                                                i26 = i20;
                                                i24 = z14;
                                                i27 = z15;
                                                i28 = g18;
                                                i72 = i34;
                                                i25 = i19;
                                                i71 = i33;
                                                i23 = g11;
                                                i68 = i30;
                                                i70 = i31;
                                                i74 = i32;
                                                k0Var3 = list;
                                                str16 = str4;
                                                i73 += g19;
                                                g18 = i28;
                                                bArr3 = bArr;
                                                str14 = str17;
                                                z15 = i27;
                                                i20 = i26;
                                                i19 = i25;
                                                z14 = i24;
                                                g11 = i23;
                                            }
                                            String str21 = str16;
                                            if (str15 == null) {
                                                i18 = i65;
                                            } else {
                                                p2.r rVar = new p2.r();
                                                rVar.f42227a = Integer.toString(i13);
                                                rVar.f42237k = str15;
                                                rVar.f42234h = str21;
                                                rVar.f42242p = i21;
                                                rVar.f42243q = i22;
                                                rVar.f42246t = f6;
                                                i18 = i65;
                                                rVar.f42245s = i18;
                                                rVar.f42247u = bArr;
                                                rVar.f42248v = i69;
                                                rVar.f42239m = k0Var3;
                                                rVar.f42240n = c5063p6;
                                                rVar.f42249w = new C5059l(i68, i70, i74, i71, i72, byteBuffer != null ? byteBuffer.array() : null);
                                                if (s11 != null) {
                                                    S s12 = s11;
                                                    rVar.f42232f = H.m0(s12.f4231a);
                                                    rVar.f42233g = H.m0(s12.f4232b);
                                                }
                                                c5065s = new C5065s(rVar);
                                            }
                                            i61 = i67;
                                        } else if (g18 == 1836069985 || g18 == 1701733217 || g18 == 1633889587 || g18 == 1700998451 || g18 == 1633889588 || g18 == 1835823201 || g18 == 1685353315 || g18 == 1685353317 || g18 == 1685353320 || g18 == 1685353324 || g18 == 1685353336 || g18 == 1935764850 || g18 == 1935767394 || g18 == 1819304813 || g18 == 1936684916 || g18 == 1953984371 || g18 == 778924082 || g18 == 778924083 || g18 == 1835557169 || g18 == 1835560241 || g18 == 1634492771 || g18 == 1634492791 || g18 == 1970037111 || g18 == 1332770163 || g18 == 1716281667) {
                                            pair = create;
                                            i14 = i52;
                                            uVar4.F(i62 + 16);
                                            if (z11) {
                                                i35 = uVar4.z();
                                                uVar4.G(6);
                                            } else {
                                                uVar4.G(8);
                                                i35 = 0;
                                            }
                                            if (i35 == 0 || i35 == 1) {
                                                int z21 = uVar4.z();
                                                uVar4.G(6);
                                                byte[] bArr5 = uVar4.f45193a;
                                                int i81 = uVar4.f45194b;
                                                i39 = z21;
                                                c2791a2 = c2791a4;
                                                int i82 = ((bArr5[i81] & 255) << 8) | (bArr5[i81 + 1] & 255);
                                                uVar4.f45194b = i81 + 4;
                                                uVar4.F(i81);
                                                int g23 = uVar4.g();
                                                if (i35 == 1) {
                                                    uVar4.G(16);
                                                }
                                                i41 = i82;
                                                i40 = g23;
                                                i42 = -1;
                                            } else if (i35 == 2) {
                                                uVar4.G(16);
                                                i41 = (int) Math.round(Double.longBitsToDouble(uVar4.o()));
                                                int x10 = uVar4.x();
                                                uVar4.G(4);
                                                int x11 = uVar4.x();
                                                int x12 = uVar4.x();
                                                boolean z22 = (x12 & 1) != 0;
                                                boolean z23 = (x12 & 2) != 0;
                                                if (!z22) {
                                                    i48 = 8;
                                                    if (x11 == 8) {
                                                        i42 = 3;
                                                        uVar4.G(i48);
                                                        c2791a2 = c2791a4;
                                                        i39 = x10;
                                                        i40 = 0;
                                                    } else {
                                                        if (x11 == 16) {
                                                            i42 = z23 ? 268435456 : 2;
                                                        } else if (x11 == 24) {
                                                            i42 = z23 ? 1342177280 : 536870912;
                                                        } else {
                                                            if (x11 == 32) {
                                                                i42 = z23 ? 1610612736 : 805306368;
                                                            }
                                                            i42 = -1;
                                                        }
                                                        i48 = 8;
                                                        uVar4.G(i48);
                                                        c2791a2 = c2791a4;
                                                        i39 = x10;
                                                        i40 = 0;
                                                    }
                                                } else {
                                                    if (x11 == 32) {
                                                        i42 = 4;
                                                        i48 = 8;
                                                        uVar4.G(i48);
                                                        c2791a2 = c2791a4;
                                                        i39 = x10;
                                                        i40 = 0;
                                                    }
                                                    i42 = -1;
                                                    i48 = 8;
                                                    uVar4.G(i48);
                                                    c2791a2 = c2791a4;
                                                    i39 = x10;
                                                    i40 = 0;
                                                }
                                            } else {
                                                i37 = i62;
                                                i36 = i11;
                                                c2791a2 = c2791a4;
                                                i17 = i59;
                                                i38 = g17;
                                                qVarArr = qVarArr2;
                                                str = str12;
                                                i13 = g11;
                                                i15 = i38;
                                                i16 = i37;
                                                i18 = i36;
                                            }
                                            int i83 = uVar4.f45194b;
                                            if (g18 == 1701733217) {
                                                Pair e11 = e(i62, g17, uVar4);
                                                if (e11 != null) {
                                                    int intValue = ((Integer) e11.first).intValue();
                                                    if (c5063p5 == null) {
                                                        i47 = intValue;
                                                        c5063p4 = null;
                                                    } else {
                                                        i47 = intValue;
                                                        c5063p4 = c5063p5.a(((q) e11.second).f28915b);
                                                    }
                                                    qVarArr2[i59] = (q) e11.second;
                                                    c5063p3 = c5063p4;
                                                    g18 = i47;
                                                } else {
                                                    c5063p3 = c5063p5;
                                                }
                                                uVar4.F(i83);
                                            } else {
                                                c5063p3 = c5063p5;
                                            }
                                            String str22 = "audio/ac4";
                                            int i84 = i41;
                                            String str23 = "audio/ac3";
                                            i36 = i11;
                                            if (g18 == 1633889587) {
                                                str5 = str23;
                                            } else if (g18 == 1700998451) {
                                                str5 = "audio/eac3";
                                            } else if (g18 == 1633889588) {
                                                str5 = str22;
                                            } else if (g18 == 1685353315) {
                                                str5 = "audio/vnd.dts";
                                            } else if (g18 == 1685353320 || g18 == 1685353324) {
                                                str5 = "audio/vnd.dts.hd";
                                            } else if (g18 == 1685353317) {
                                                str5 = "audio/vnd.dts.hd;profile=lbr";
                                            } else if (g18 == 1685353336) {
                                                str5 = "audio/vnd.dts.uhd;profile=p2";
                                            } else if (g18 == 1935764850) {
                                                str5 = "audio/3gpp";
                                            } else if (g18 == 1935767394) {
                                                str5 = "audio/amr-wb";
                                            } else {
                                                if (g18 != 1936684916) {
                                                    if (g18 == 1953984371) {
                                                        str5 = "audio/raw";
                                                        i42 = 268435456;
                                                    } else if (g18 != 1819304813) {
                                                        str5 = (g18 == 778924082 || g18 == 778924083) ? "audio/mpeg" : g18 == 1835557169 ? "audio/mha1" : g18 == 1835560241 ? "audio/mhm1" : g18 == 1634492771 ? "audio/alac" : g18 == 1634492791 ? "audio/g711-alaw" : g18 == 1970037111 ? "audio/g711-mlaw" : g18 == 1332770163 ? "audio/opus" : g18 == 1716281667 ? "audio/flac" : g18 == 1835823201 ? "audio/true-hd" : null;
                                                    } else if (i42 != -1) {
                                                        str5 = "audio/raw";
                                                    }
                                                }
                                                str5 = "audio/raw";
                                                i42 = 2;
                                            }
                                            int i85 = i42;
                                            i17 = i59;
                                            qVarArr = qVarArr2;
                                            C5065s c5065s2 = c5065s;
                                            int i86 = i83;
                                            int i87 = i39;
                                            int i88 = i84;
                                            String str24 = null;
                                            k0 k0Var4 = null;
                                            S s13 = null;
                                            while (i86 - i62 < g17) {
                                                uVar4.F(i86);
                                                int g24 = uVar4.g();
                                                int i89 = g17;
                                                AbstractC4828h.u(str13, g24 > 0);
                                                int g25 = uVar4.g();
                                                int i90 = i62;
                                                if (g25 == 1835557187) {
                                                    int i91 = g24 - 13;
                                                    byte[] bArr6 = new byte[i91];
                                                    str7 = str24;
                                                    uVar4.F(i86 + 13);
                                                    uVar4.e(bArr6, 0, i91);
                                                    k0Var4 = x8.N.u0(bArr6);
                                                    str6 = str22;
                                                    str8 = str23;
                                                    i43 = i40;
                                                    i44 = i88;
                                                    str9 = str13;
                                                } else {
                                                    str7 = str24;
                                                    if (g25 == 1702061171 || (z11 && g25 == 2002876005)) {
                                                        String str25 = str13;
                                                        str8 = str23;
                                                        i44 = i88;
                                                        int i92 = i87;
                                                        if (g25 != 1702061171) {
                                                            i45 = uVar4.f45194b;
                                                            AbstractC4828h.u(null, i45 >= i86);
                                                            while (true) {
                                                                if (i45 - i86 >= g24) {
                                                                    str9 = str25;
                                                                    i45 = -1;
                                                                    break;
                                                                }
                                                                uVar4.F(i45);
                                                                int g26 = uVar4.g();
                                                                str9 = str25;
                                                                AbstractC4828h.u(str9, g26 > 0);
                                                                if (uVar4.g() == 1702061171) {
                                                                    break;
                                                                }
                                                                i45 += g26;
                                                                str25 = str9;
                                                            }
                                                        } else {
                                                            i45 = i86;
                                                            str9 = str25;
                                                        }
                                                        if (i45 != -1) {
                                                            S b12 = b(i45, uVar4);
                                                            str5 = (String) b12.f4233c;
                                                            byte[] bArr7 = (byte[]) b12.f4234d;
                                                            if (bArr7 != null) {
                                                                if ("audio/vorbis".equals(str5)) {
                                                                    u uVar5 = new u(bArr7);
                                                                    uVar5.G(1);
                                                                    int i93 = 0;
                                                                    while (true) {
                                                                        if (uVar5.a() <= 0) {
                                                                            s10 = b12;
                                                                            str6 = str22;
                                                                            break;
                                                                        }
                                                                        s10 = b12;
                                                                        str6 = str22;
                                                                        if ((uVar5.f45193a[uVar5.f45194b] & 255) != 255) {
                                                                            break;
                                                                        }
                                                                        i93 += 255;
                                                                        uVar5.G(1);
                                                                        b12 = s10;
                                                                        str22 = str6;
                                                                    }
                                                                    int u17 = uVar5.u() + i93;
                                                                    int i94 = 0;
                                                                    while (true) {
                                                                        if (uVar5.a() <= 0) {
                                                                            i43 = i40;
                                                                            break;
                                                                        }
                                                                        i43 = i40;
                                                                        if ((uVar5.f45193a[uVar5.f45194b] & 255) != 255) {
                                                                            break;
                                                                        }
                                                                        i94 += 255;
                                                                        uVar5.G(1);
                                                                        i40 = i43;
                                                                    }
                                                                    int u18 = uVar5.u() + i94;
                                                                    byte[] bArr8 = new byte[u17];
                                                                    int i95 = uVar5.f45194b;
                                                                    System.arraycopy(bArr7, i95, bArr8, 0, u17);
                                                                    int i96 = i95 + u17 + u18;
                                                                    int length = bArr7.length - i96;
                                                                    byte[] bArr9 = new byte[length];
                                                                    System.arraycopy(bArr7, i96, bArr9, 0, length);
                                                                    k0Var = x8.N.v0(bArr8, bArr9);
                                                                } else {
                                                                    s10 = b12;
                                                                    str6 = str22;
                                                                    i43 = i40;
                                                                    if ("audio/mp4a-latm".equals(str5)) {
                                                                        C0880a f11 = AbstractC0881b.f(new t(bArr7, 0), false);
                                                                        int i97 = f11.f10547a;
                                                                        i92 = f11.f10548b;
                                                                        str7 = f11.f10549c;
                                                                        i44 = i97;
                                                                    }
                                                                    k0Var = x8.N.u0(bArr7);
                                                                }
                                                                s13 = s10;
                                                                k0Var4 = k0Var;
                                                                i87 = i92;
                                                            } else {
                                                                str6 = str22;
                                                                i43 = i40;
                                                                s13 = b12;
                                                            }
                                                        } else {
                                                            str6 = str22;
                                                            i43 = i40;
                                                        }
                                                        k0Var = k0Var4;
                                                        k0Var4 = k0Var;
                                                        i87 = i92;
                                                    } else {
                                                        if (g25 == 1684103987) {
                                                            uVar4.F(i86 + 8);
                                                            String num = Integer.toString(g11);
                                                            t tVar = new t();
                                                            tVar.o(uVar4);
                                                            int i98 = AbstractC0881b.f10553d[tVar.i(2)];
                                                            str10 = str13;
                                                            tVar.s(8);
                                                            int i99 = AbstractC0881b.f10555f[tVar.i(3)];
                                                            int i100 = i88;
                                                            if (tVar.i(1) != 0) {
                                                                i99++;
                                                            }
                                                            int i101 = AbstractC0881b.f10556g[tVar.i(5)] * 1000;
                                                            tVar.c();
                                                            uVar4.F(tVar.f());
                                                            p2.r rVar2 = new p2.r();
                                                            rVar2.f42227a = num;
                                                            rVar2.f42237k = str23;
                                                            rVar2.f42250x = i99;
                                                            rVar2.f42251y = i98;
                                                            rVar2.f42240n = c5063p3;
                                                            rVar2.f42229c = str12;
                                                            rVar2.f42232f = i101;
                                                            rVar2.f42233g = i101;
                                                            c5065s2 = new C5065s(rVar2);
                                                            i46 = i87;
                                                            str8 = str23;
                                                            i44 = i100;
                                                        } else {
                                                            str10 = str13;
                                                            int i102 = i88;
                                                            if (g25 == 1684366131) {
                                                                uVar4.F(i86 + 8);
                                                                String num2 = Integer.toString(g11);
                                                                t tVar2 = new t();
                                                                tVar2.o(uVar4);
                                                                int i103 = tVar2.i(13) * 1000;
                                                                tVar2.s(3);
                                                                int i104 = AbstractC0881b.f10553d[tVar2.i(2)];
                                                                tVar2.s(10);
                                                                int i105 = AbstractC0881b.f10555f[tVar2.i(3)];
                                                                if (tVar2.i(1) != 0) {
                                                                    i105++;
                                                                }
                                                                int i106 = i105;
                                                                tVar2.s(3);
                                                                int i107 = tVar2.i(4);
                                                                tVar2.s(1);
                                                                str8 = str23;
                                                                if (i107 > 0) {
                                                                    tVar2.s(6);
                                                                    if (tVar2.i(1) != 0) {
                                                                        i106 += 2;
                                                                    }
                                                                    tVar2.s(1);
                                                                }
                                                                int i108 = i106;
                                                                int i109 = i87;
                                                                if (tVar2.b() > 7) {
                                                                    tVar2.s(7);
                                                                    if (tVar2.i(1) != 0) {
                                                                        str11 = "audio/eac3-joc";
                                                                        tVar2.c();
                                                                        uVar4.F(tVar2.f());
                                                                        p2.r rVar3 = new p2.r();
                                                                        rVar3.f42227a = num2;
                                                                        rVar3.f42237k = str11;
                                                                        rVar3.f42250x = i108;
                                                                        rVar3.f42251y = i104;
                                                                        rVar3.f42240n = c5063p3;
                                                                        rVar3.f42229c = str12;
                                                                        rVar3.f42233g = i103;
                                                                        c5065s2 = new C5065s(rVar3);
                                                                        i44 = i102;
                                                                        i46 = i109;
                                                                    }
                                                                }
                                                                str11 = "audio/eac3";
                                                                tVar2.c();
                                                                uVar4.F(tVar2.f());
                                                                p2.r rVar32 = new p2.r();
                                                                rVar32.f42227a = num2;
                                                                rVar32.f42237k = str11;
                                                                rVar32.f42250x = i108;
                                                                rVar32.f42251y = i104;
                                                                rVar32.f42240n = c5063p3;
                                                                rVar32.f42229c = str12;
                                                                rVar32.f42233g = i103;
                                                                c5065s2 = new C5065s(rVar32);
                                                                i44 = i102;
                                                                i46 = i109;
                                                            } else {
                                                                int i110 = i87;
                                                                str8 = str23;
                                                                if (g25 == 1684103988) {
                                                                    uVar4.F(i86 + 8);
                                                                    String num3 = Integer.toString(g11);
                                                                    uVar4.G(1);
                                                                    int i111 = ((uVar4.u() & 32) >> 5) == 1 ? 48000 : 44100;
                                                                    p2.r rVar4 = new p2.r();
                                                                    rVar4.f42227a = num3;
                                                                    rVar4.f42237k = str22;
                                                                    rVar4.f42250x = 2;
                                                                    rVar4.f42251y = i111;
                                                                    rVar4.f42240n = c5063p3;
                                                                    rVar4.f42229c = str12;
                                                                    c5065s2 = new C5065s(rVar4);
                                                                    i44 = i102;
                                                                    i46 = i110;
                                                                    i43 = i40;
                                                                    i87 = i46;
                                                                    str9 = str10;
                                                                    str6 = str22;
                                                                } else if (g25 != 1684892784) {
                                                                    if (g25 == 1684305011 || g25 == 1969517683) {
                                                                        p2.r rVar5 = new p2.r();
                                                                        rVar5.f42227a = Integer.toString(g11);
                                                                        rVar5.f42237k = str5;
                                                                        i46 = i110;
                                                                        rVar5.f42250x = i46;
                                                                        i44 = i102;
                                                                        rVar5.f42251y = i44;
                                                                        rVar5.f42240n = c5063p3;
                                                                        rVar5.f42229c = str12;
                                                                        c5065s2 = new C5065s(rVar5);
                                                                    } else {
                                                                        if (g25 == 1682927731) {
                                                                            int i112 = g24 - 8;
                                                                            byte[] bArr10 = f28811a;
                                                                            byte[] copyOf = Arrays.copyOf(bArr10, bArr10.length + i112);
                                                                            uVar4.F(i86 + 8);
                                                                            uVar4.e(copyOf, bArr10.length, i112);
                                                                            u02 = AbstractC2279d.i(copyOf);
                                                                        } else if (g25 == 1684425825) {
                                                                            byte[] bArr11 = new byte[g24 - 8];
                                                                            bArr11[0] = 102;
                                                                            bArr11[1] = 76;
                                                                            bArr11[2] = 97;
                                                                            bArr11[3] = 67;
                                                                            uVar4.F(i86 + 12);
                                                                            uVar4.e(bArr11, 4, g24 - 12);
                                                                            u02 = x8.N.u0(bArr11);
                                                                        } else if (g25 == 1634492771) {
                                                                            int i113 = g24 - 12;
                                                                            byte[] bArr12 = new byte[i113];
                                                                            uVar4.F(i86 + 12);
                                                                            uVar4.e(bArr12, 0, i113);
                                                                            u uVar6 = new u(bArr12);
                                                                            uVar6.F(9);
                                                                            int u19 = uVar6.u();
                                                                            uVar6.F(20);
                                                                            Pair create2 = Pair.create(Integer.valueOf(uVar6.x()), Integer.valueOf(u19));
                                                                            int intValue2 = ((Integer) create2.first).intValue();
                                                                            int intValue3 = ((Integer) create2.second).intValue();
                                                                            k0Var4 = x8.N.u0(bArr12);
                                                                            i43 = i40;
                                                                            i44 = intValue2;
                                                                            str9 = str10;
                                                                            i87 = intValue3;
                                                                            str6 = str22;
                                                                        } else {
                                                                            i44 = i102;
                                                                            i46 = i110;
                                                                        }
                                                                        k0Var4 = u02;
                                                                        i44 = i102;
                                                                        str9 = str10;
                                                                        i87 = i110;
                                                                        str6 = str22;
                                                                        i43 = i40;
                                                                    }
                                                                    i43 = i40;
                                                                    i87 = i46;
                                                                    str9 = str10;
                                                                    str6 = str22;
                                                                } else if (i40 <= 0) {
                                                                    throw O.a("Invalid sample rate for Dolby TrueHD MLP stream: " + i40, null);
                                                                } else {
                                                                    i44 = i40;
                                                                    i43 = i44;
                                                                    str9 = str10;
                                                                    i87 = 2;
                                                                    str6 = str22;
                                                                }
                                                            }
                                                        }
                                                        i43 = i40;
                                                        i87 = i46;
                                                        str9 = str10;
                                                        str6 = str22;
                                                    }
                                                }
                                                i86 += g24;
                                                str13 = str9;
                                                i88 = i44;
                                                str23 = str8;
                                                str24 = str7;
                                                g17 = i89;
                                                i62 = i90;
                                                str22 = str6;
                                                i40 = i43;
                                            }
                                            i37 = i62;
                                            i38 = g17;
                                            String str26 = str24;
                                            int i114 = i87;
                                            int i115 = i88;
                                            if (c5065s2 != null || str5 == null) {
                                                c5065s = c5065s2;
                                            } else {
                                                p2.r rVar6 = new p2.r();
                                                rVar6.f42227a = Integer.toString(g11);
                                                rVar6.f42237k = str5;
                                                rVar6.f42234h = str26;
                                                rVar6.f42250x = i114;
                                                rVar6.f42251y = i115;
                                                rVar6.f42252z = i85;
                                                rVar6.f42239m = k0Var4;
                                                rVar6.f42240n = c5063p3;
                                                rVar6.f42229c = str12;
                                                S s14 = s13;
                                                if (s14 != null) {
                                                    rVar6.f42232f = H.m0(s14.f4231a);
                                                    rVar6.f42233g = H.m0(s14.f4232b);
                                                }
                                                c5065s = new C5065s(rVar6);
                                            }
                                            str = str12;
                                            i13 = g11;
                                            i15 = i38;
                                            i16 = i37;
                                            i18 = i36;
                                        } else {
                                            if (g18 == 1414810956 || g18 == 1954034535 || g18 == 2004251764 || g18 == 1937010800 || g18 == 1664495672) {
                                                uVar4.F(i62 + 16);
                                                String str27 = "application/ttml+xml";
                                                if (g18 != 1414810956) {
                                                    if (g18 == 1954034535) {
                                                        int i116 = g17 - 16;
                                                        byte[] bArr13 = new byte[i116];
                                                        uVar4.e(bArr13, 0, i116);
                                                        k0Var2 = x8.N.u0(bArr13);
                                                        str27 = "application/x-quicktime-tx3g";
                                                        i14 = i52;
                                                        j13 = Long.MAX_VALUE;
                                                    } else if (g18 == 2004251764) {
                                                        str27 = "application/x-mp4-vtt";
                                                    } else if (g18 == 1937010800) {
                                                        i14 = i52;
                                                        j13 = 0;
                                                        k0Var2 = null;
                                                    } else if (g18 == 1664495672) {
                                                        str27 = "application/x-mp4-cea-608";
                                                        i14 = i52;
                                                        j13 = Long.MAX_VALUE;
                                                        k0Var2 = null;
                                                        i60 = 1;
                                                    } else {
                                                        throw new IllegalStateException();
                                                    }
                                                    p2.r rVar7 = new p2.r();
                                                    pair = create;
                                                    rVar7.f42227a = Integer.toString(g11);
                                                    rVar7.f42237k = str27;
                                                    rVar7.f42229c = str12;
                                                    rVar7.f42241o = j13;
                                                    rVar7.f42239m = k0Var2;
                                                    i16 = i62;
                                                    c5065s = new C5065s(rVar7);
                                                    i18 = i11;
                                                    c2791a2 = c2791a4;
                                                    str = str12;
                                                }
                                                i14 = i52;
                                                j13 = Long.MAX_VALUE;
                                                k0Var2 = null;
                                                p2.r rVar72 = new p2.r();
                                                pair = create;
                                                rVar72.f42227a = Integer.toString(g11);
                                                rVar72.f42237k = str27;
                                                rVar72.f42229c = str12;
                                                rVar72.f42241o = j13;
                                                rVar72.f42239m = k0Var2;
                                                i16 = i62;
                                                c5065s = new C5065s(rVar72);
                                                i18 = i11;
                                                c2791a2 = c2791a4;
                                                str = str12;
                                            } else {
                                                if (g18 == 1835365492) {
                                                    uVar4.F(i62 + 16);
                                                    if (g18 == 1835365492) {
                                                        uVar4.p();
                                                        String p10 = uVar4.p();
                                                        if (p10 != null) {
                                                            p2.r rVar8 = new p2.r();
                                                            rVar8.f42227a = Integer.toString(g11);
                                                            rVar8.f42237k = p10;
                                                            c5065s = new C5065s(rVar8);
                                                        }
                                                    }
                                                } else if (g18 == 1667329389) {
                                                    p2.r rVar9 = new p2.r();
                                                    rVar9.f42227a = Integer.toString(g11);
                                                    rVar9.f42237k = "application/x-camera-motion";
                                                    i16 = i62;
                                                    c5065s = new C5065s(rVar9);
                                                    c2791a2 = c2791a4;
                                                    pair = create;
                                                    str = str12;
                                                    i14 = i52;
                                                    i17 = i59;
                                                    i13 = g11;
                                                    i15 = g17;
                                                    qVarArr = qVarArr2;
                                                    i18 = i11;
                                                }
                                                i16 = i62;
                                                i18 = i11;
                                                c2791a2 = c2791a4;
                                                pair = create;
                                                str = str12;
                                                i14 = i52;
                                            }
                                            i17 = i59;
                                            i13 = g11;
                                            i15 = g17;
                                            qVarArr = qVarArr2;
                                        }
                                        uVar4.F(i16 + i15);
                                        i59 = i17 + 1;
                                        c5063p5 = c5063p;
                                        i11 = i18;
                                        g16 = i63;
                                        i50 = i64;
                                        arrayList2 = arrayList4;
                                        j18 = j20;
                                        str12 = str;
                                        qVarArr2 = qVarArr;
                                        i52 = i14;
                                        create = pair;
                                        g11 = i13;
                                        c2791a4 = c2791a2;
                                    }
                                    arrayList = arrayList2;
                                    i10 = i50;
                                    C2791a c2791a5 = c2791a4;
                                    Pair pair2 = create;
                                    int i117 = i52;
                                    long j21 = j18;
                                    int i118 = g11;
                                    q[] qVarArr3 = qVarArr2;
                                    if (!z10) {
                                        c2791a4 = c2791a5;
                                        C2791a i119 = c2791a4.i(1701082227);
                                        if (i119 != null && (a5 = a(i119)) != null) {
                                            jArr = (long[]) a5.first;
                                            jArr2 = (long[]) a5.second;
                                            pVar = c5065s != null ? null : new p(i118, i117, ((Long) pair2.first).longValue(), j21, j10, c5065s, i60, qVarArr3, i61, jArr, jArr2);
                                            fVar2 = fVar;
                                        }
                                    } else {
                                        c2791a4 = c2791a5;
                                    }
                                    jArr2 = null;
                                    jArr = null;
                                    if (c5065s != null) {
                                    }
                                    fVar2 = fVar;
                                } else {
                                    throw O.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                                }
                            }
                        } else {
                            i49 = -65536;
                        }
                        if (g12 == 0 && g13 == i49) {
                            if (g14 == 65536 && g15 == 0) {
                                i11 = 270;
                                if (j6 == -9223372036854775807L) {
                                }
                                i12 = (j17 > (-9223372036854775807L) ? 1 : (j17 == (-9223372036854775807L) ? 0 : -1));
                                long j182 = d(j14.f28801h0).f45635h0;
                                if (i12 != 0) {
                                }
                                C2791a i572 = i51.i(1835626086);
                                i572.getClass();
                                C2791a i582 = i572.i(1937007212);
                                i582.getClass();
                                C2792b j192 = i51.j(1835296868);
                                j192.getClass();
                                u uVar32 = j192.f28801h0;
                                uVar32.F(8);
                                int h112 = AbstractC6266a.h(uVar32.g());
                                uVar32.G(h112 == 0 ? 8 : 16);
                                long v102 = uVar32.v();
                                uVar32.G(h112 == 0 ? 4 : 8);
                                int z132 = uVar32.z();
                                Pair create3 = Pair.create(Long.valueOf(v102), "" + ((char) (((z132 >> 10) & 31) + 96)) + ((char) (((z132 >> 5) & 31) + 96)) + ((char) ((z132 & 31) + 96)));
                                j12 = i582.j(1937011556);
                                if (j12 != null) {
                                }
                            } else {
                                i49 = -65536;
                            }
                        }
                        i11 = (g12 == i49 && g13 == 0 && g14 == 0 && g15 == i49) ? 180 : 0;
                        if (j6 == -9223372036854775807L) {
                        }
                        i12 = (j17 > (-9223372036854775807L) ? 1 : (j17 == (-9223372036854775807L) ? 0 : -1));
                        long j1822 = d(j14.f28801h0).f45635h0;
                        if (i12 != 0) {
                        }
                        C2791a i5722 = i51.i(1835626086);
                        i5722.getClass();
                        C2791a i5822 = i5722.i(1937007212);
                        i5822.getClass();
                        C2792b j1922 = i51.j(1835296868);
                        j1922.getClass();
                        u uVar322 = j1922.f28801h0;
                        uVar322.F(8);
                        int h1122 = AbstractC6266a.h(uVar322.g());
                        uVar322.G(h1122 == 0 ? 8 : 16);
                        long v1022 = uVar322.v();
                        uVar322.G(h1122 == 0 ? 4 : 8);
                        int z1322 = uVar322.z();
                        Pair create32 = Pair.create(Long.valueOf(v1022), "" + ((char) (((z1322 >> 10) & 31) + 96)) + ((char) (((z1322 >> 5) & 31) + 96)) + ((char) ((z1322 & 31) + 96)));
                        j12 = i5822.j(1937011556);
                        if (j12 != null) {
                        }
                    }
                    p pVar2 = (p) fVar2.apply(pVar);
                    if (pVar2 == null) {
                        arrayList2 = arrayList;
                    } else {
                        C2791a i120 = c2791a4.i(1835297121);
                        i120.getClass();
                        C2791a i121 = i120.i(1835626086);
                        i121.getClass();
                        C2791a i122 = i121.i(1937007212);
                        i122.getClass();
                        s f12 = f(pVar2, i122, xVar);
                        arrayList2 = arrayList;
                        arrayList2.add(f12);
                    }
                }
                i50 = i10 + 1;
                c2791a3 = c2791a;
                c5063p5 = c5063p;
            } else {
                return arrayList2;
            }
        }
    }
}
