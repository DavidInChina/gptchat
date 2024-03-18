package C8;

import U3.u;
import io.sentry.C3636c1;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final C3636c1 f2729a = new C3636c1(new u(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 28), 17, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f2730b = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2731c = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2732d = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f2733e = {67108863, 33554431};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f2734f = {26, 25};

    public static boolean a(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        j(jArr2);
        byte[] c10 = c(jArr2);
        for (int i10 = 0; i10 < 32; i10++) {
            if (c10[i10] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void b(C3636c1 c3636c1, U3.c cVar, a aVar) {
        long[] jArr = new long[10];
        u uVar = (u) cVar.f17396Z;
        o((long[]) ((u) c3636c1.f34285Z).f17492Z, (long[]) uVar.f17493h0, (long[]) uVar.f17492Z);
        u uVar2 = (u) cVar.f17396Z;
        n((long[]) ((u) c3636c1.f34285Z).f17493h0, (long[]) uVar2.f17493h0, (long[]) uVar2.f17492Z);
        Object obj = ((u) c3636c1.f34285Z).f17493h0;
        h((long[]) obj, (long[]) obj, aVar.f2726b);
        u uVar3 = (u) c3636c1.f34285Z;
        h((long[]) uVar3.f17494i0, (long[]) uVar3.f17492Z, aVar.f2725a);
        h((long[]) c3636c1.f34286h0, (long[]) cVar.f17397h0, aVar.f2727c);
        aVar.a((long[]) ((u) c3636c1.f34285Z).f17492Z, (long[]) ((u) cVar.f17396Z).f17494i0);
        Object obj2 = ((u) c3636c1.f34285Z).f17492Z;
        o(jArr, (long[]) obj2, (long[]) obj2);
        u uVar4 = (u) c3636c1.f34285Z;
        n((long[]) uVar4.f17492Z, (long[]) uVar4.f17494i0, (long[]) uVar4.f17493h0);
        u uVar5 = (u) c3636c1.f34285Z;
        Object obj3 = uVar5.f17493h0;
        o((long[]) obj3, (long[]) uVar5.f17494i0, (long[]) obj3);
        o((long[]) ((u) c3636c1.f34285Z).f17494i0, jArr, (long[]) c3636c1.f34286h0);
        long[] jArr2 = (long[]) c3636c1.f34286h0;
        n(jArr2, jArr, jArr2);
    }

    public static byte[] c(long[] jArr) {
        int[] iArr;
        int i10;
        int i11;
        int[] iArr2;
        long j6;
        int i12;
        int i13;
        int i14;
        long j10;
        int i15;
        int i16;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i17 = 0;
        while (true) {
            iArr = f2734f;
            i10 = 2;
            if (i17 >= 2) {
                break;
            }
            int i18 = 0;
            while (i18 < 9) {
                long j11 = copyOf[i18];
                copyOf[i18] = j11 + (i16 << i15);
                i18++;
                copyOf[i18] = copyOf[i18] - (-((int) (((j11 >> 31) & j11) >> iArr[i18 & 1])));
            }
            long j12 = copyOf[9];
            int i19 = -((int) (((j12 >> 31) & j12) >> 25));
            copyOf[9] = j12 + (i19 << 25);
            copyOf[0] = copyOf[0] - (i19 * 19);
            i17++;
        }
        long j13 = copyOf[0];
        copyOf[0] = j13 + (i11 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j13 >> 31) & j13) >> 26)));
        int i20 = 0;
        while (true) {
            iArr2 = f2733e;
            if (i20 >= i10) {
                break;
            }
            int i21 = 0;
            while (i21 < 9) {
                int i22 = i21 & 1;
                copyOf[i21] = copyOf[i21] & iArr2[i22];
                i21++;
                copyOf[i21] = copyOf[i21] + ((int) (j10 >> iArr[i22]));
            }
            i20++;
            i10 = 2;
        }
        copyOf[9] = copyOf[9] & 33554431;
        long j14 = copyOf[0] + (((int) (j6 >> 25)) * 19);
        copyOf[0] = j14;
        int i23 = ~((((int) j14) - 67108845) >> 31);
        for (int i24 = 1; i24 < 10; i24++) {
            int i25 = ~(((int) copyOf[i24]) ^ iArr2[i24 & 1]);
            int i26 = i25 & (i25 << 16);
            int i27 = i26 & (i26 << 8);
            int i28 = i27 & (i27 << 4);
            int i29 = i28 & (i28 << 2);
            i23 &= (i29 & (i29 << 1)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i23);
        long j15 = 33554431 & i23;
        copyOf[1] = copyOf[1] - j15;
        for (int i30 = 2; i30 < 10; i30 += 2) {
            copyOf[i30] = copyOf[i30] - (67108863 & i23);
            int i31 = i30 + 1;
            copyOf[i31] = copyOf[i31] - j15;
        }
        for (int i32 = 0; i32 < 10; i32++) {
            copyOf[i32] = copyOf[i32] << f2732d[i32];
        }
        byte[] bArr = new byte[32];
        for (int i33 = 0; i33 < 10; i33++) {
            int i34 = f2731c[i33];
            long j16 = copyOf[i33];
            bArr[i34] = (byte) (bArr[i34] | (j16 & 255));
            bArr[i34 + 1] = (byte) (bArr[i12] | ((j16 >> 8) & 255));
            bArr[i34 + 2] = (byte) (bArr[i13] | ((j16 >> 16) & 255));
            bArr[i34 + 3] = (byte) (bArr[i14] | ((j16 >> 24) & 255));
        }
        return bArr;
    }

    public static void d(u uVar, C3636c1 c3636c1) {
        long[] jArr = new long[10];
        l((long[]) ((u) c3636c1.f34285Z).f17492Z, (long[]) uVar.f17492Z);
        l((long[]) ((u) c3636c1.f34285Z).f17494i0, (long[]) uVar.f17493h0);
        l((long[]) c3636c1.f34286h0, (long[]) uVar.f17494i0);
        long[] jArr2 = (long[]) c3636c1.f34286h0;
        o(jArr2, jArr2, jArr2);
        o((long[]) ((u) c3636c1.f34285Z).f17493h0, (long[]) uVar.f17492Z, (long[]) uVar.f17493h0);
        l(jArr, (long[]) ((u) c3636c1.f34285Z).f17493h0);
        u uVar2 = (u) c3636c1.f34285Z;
        o((long[]) uVar2.f17493h0, (long[]) uVar2.f17494i0, (long[]) uVar2.f17492Z);
        u uVar3 = (u) c3636c1.f34285Z;
        Object obj = uVar3.f17494i0;
        n((long[]) obj, (long[]) obj, (long[]) uVar3.f17492Z);
        u uVar4 = (u) c3636c1.f34285Z;
        n((long[]) uVar4.f17492Z, jArr, (long[]) uVar4.f17493h0);
        long[] jArr3 = (long[]) c3636c1.f34286h0;
        n(jArr3, jArr3, (long[]) ((u) c3636c1.f34285Z).f17494i0);
    }

    public static long[] e(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = f2731c[i10];
            jArr[i10] = (((((bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8)) | ((bArr[i11 + 2] & 255) << 16)) | ((bArr[i11 + 3] & 255) << 24)) >> f2732d[i10]) & f2733e[i10 & 1];
        }
        return jArr;
    }

    public static long f(int i10, byte[] bArr) {
        return ((bArr[i10 + 2] & 255) << 16) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8);
    }

    public static long g(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | f(i10, bArr);
    }

    public static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        long j6 = jArr2[0];
        long j10 = jArr3[0];
        long j11 = j6 * j10;
        long j12 = jArr3[1];
        long j13 = jArr2[1];
        long j14 = j13 * j10;
        long j15 = jArr3[2];
        long j16 = jArr2[2];
        long j17 = (j16 * j10) + (j6 * j15) + (j13 * 2 * j12);
        long j18 = jArr3[3];
        long j19 = jArr2[3];
        long j20 = (j19 * j10) + (j6 * j18) + (j16 * j12) + (j13 * j15);
        long j21 = jArr3[4];
        long j22 = jArr2[4];
        long j23 = (j22 * j10) + (j6 * j21) + (((j19 * j12) + (j13 * j18)) * 2) + (j16 * j15);
        long j24 = jArr3[5];
        long j25 = (j6 * j24) + (j22 * j12) + (j13 * j21) + (j19 * j15) + (j16 * j18);
        long j26 = jArr2[5];
        long j27 = (j26 * j10) + j25;
        long j28 = (j22 * j15) + (j16 * j21) + (((j26 * j12) + (j13 * j24) + (j19 * j18)) * 2);
        long j29 = jArr3[6];
        long j30 = (j6 * j29) + j28;
        long j31 = jArr2[6];
        long j32 = (j31 * j10) + j30;
        long j33 = jArr3[7];
        long j34 = (j6 * j33) + (j31 * j12) + (j13 * j29) + (j26 * j15) + (j16 * j24) + (j22 * j18) + (j19 * j21);
        long j35 = jArr2[7];
        long j36 = (j35 * j10) + j34;
        long j37 = jArr3[8];
        long j38 = (j6 * j37) + (j31 * j15) + (j16 * j29) + (((j35 * j12) + (j13 * j33) + (j26 * j18) + (j19 * j24)) * 2) + (j22 * j21);
        long j39 = jArr2[8];
        long j40 = (j39 * j10) + j38;
        long j41 = jArr3[9];
        long j42 = (j6 * j41) + (j39 * j12) + (j13 * j37) + (j35 * j15) + (j16 * j33) + (j31 * j18) + (j19 * j29) + (j26 * j21) + (j22 * j24);
        long j43 = jArr2[9];
        long j44 = (j10 * j43) + j42;
        long j45 = j12 * j43;
        long j46 = j22 * j29;
        long j47 = (j39 * j15) + (j16 * j37) + (j31 * j21) + j46 + ((j45 + (j13 * j41) + (j35 * j18) + (j19 * j33) + (j26 * j24)) * 2);
        long j48 = j15 * j43;
        long j49 = j18 * j43;
        long j50 = j39 * j21;
        long j51 = j21 * j43;
        long j52 = j31 * j37;
        long j53 = j39 * j29;
        long j54 = j53 + j52 + (((j24 * j43) + (j26 * j41) + (j35 * j33)) * 2);
        long j55 = j39 * j33;
        long j56 = (((j33 * j43) + (j35 * j41)) * 2) + (j39 * j37);
        i(new long[]{j11, j14 + (j6 * j12), j17, j20, j23, j27, j32, j36, j40, j44, j47, j48 + (j16 * j41) + (j39 * j18) + (j19 * j37) + (j35 * j21) + (j22 * j33) + (j31 * j24) + (j26 * j29), j50 + (j22 * j37) + ((j49 + (j19 * j41) + (j35 * j24) + (j26 * j33)) * 2) + (j31 * j29), j51 + (j22 * j41) + (j39 * j24) + (j26 * j37) + (j35 * j29) + (j31 * j33), j54, (j29 * j43) + (j31 * j41) + j55 + (j35 * j37), j56, (j37 * j43) + (j39 * j41), j43 * 2 * j41}, jArr);
    }

    public static void i(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        long j6 = jArr[8];
        long j10 = jArr[18];
        long j11 = j6 + (j10 << 4);
        jArr[8] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[8] = j12;
        jArr[8] = j12 + j10;
        long j13 = jArr[7];
        long j14 = jArr[17];
        long j15 = j13 + (j14 << 4);
        jArr[7] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[7] = j16;
        jArr[7] = j16 + j14;
        long j17 = jArr[6];
        long j18 = jArr[16];
        long j19 = j17 + (j18 << 4);
        jArr[6] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[6] = j20;
        jArr[6] = j20 + j18;
        long j21 = jArr[5];
        long j22 = jArr[15];
        long j23 = j21 + (j22 << 4);
        jArr[5] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[5] = j24;
        jArr[5] = j24 + j22;
        long j25 = jArr[4];
        long j26 = jArr[14];
        long j27 = j25 + (j26 << 4);
        jArr[4] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[4] = j28;
        jArr[4] = j28 + j26;
        long j29 = jArr[3];
        long j30 = jArr[13];
        long j31 = j29 + (j30 << 4);
        jArr[3] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[3] = j32;
        jArr[3] = j32 + j30;
        long j33 = jArr[2];
        long j34 = jArr[12];
        long j35 = j33 + (j34 << 4);
        jArr[2] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[2] = j36;
        jArr[2] = j36 + j34;
        long j37 = jArr[1];
        long j38 = jArr[11];
        long j39 = j37 + (j38 << 4);
        jArr[1] = j39;
        long j40 = j39 + (j38 << 1);
        jArr[1] = j40;
        jArr[1] = j40 + j38;
        long j41 = jArr[0];
        long j42 = jArr[10];
        long j43 = j41 + (j42 << 4);
        jArr[0] = j43;
        long j44 = j43 + (j42 << 1);
        jArr[0] = j44;
        jArr[0] = j44 + j42;
        j(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void j(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j6 = jArr[i10];
            long j10 = j6 / 67108864;
            jArr[i10] = j6 - (j10 << 26);
            int i11 = i10 + 1;
            long j11 = jArr[i11] + j10;
            jArr[i11] = j11;
            long j12 = j11 / 33554432;
            jArr[i11] = j11 - (j12 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j12;
        }
        long j13 = jArr[0];
        long j14 = jArr[10];
        long j15 = j13 + (j14 << 4);
        jArr[0] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[0] = j16;
        long j17 = j16 + j14;
        jArr[0] = j17;
        jArr[10] = 0;
        long j18 = j17 / 67108864;
        jArr[0] = j17 - (j18 << 26);
        jArr[1] = jArr[1] + j18;
    }

    public static byte[] k(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = (byte) (1 & ((bArr[i11 >> 3] & 255) >> (i11 & 7)));
        }
        for (int i12 = 0; i12 < 256; i12++) {
            if (bArr2[i12] != 0) {
                for (int i13 = 1; i13 <= 6 && (i10 = i12 + i13) < 256; i13++) {
                    byte b10 = bArr2[i10];
                    if (b10 != 0) {
                        byte b11 = bArr2[i12];
                        if ((b10 << i13) + b11 <= 15) {
                            bArr2[i12] = (byte) (b11 + (b10 << i13));
                            bArr2[i10] = 0;
                        } else if (b11 - (b10 << i13) >= -15) {
                            bArr2[i12] = (byte) (b11 - (b10 << i13));
                            while (true) {
                                if (i10 >= 256) {
                                    break;
                                } else if (bArr2[i10] == 0) {
                                    bArr2[i10] = 1;
                                    break;
                                } else {
                                    bArr2[i10] = 0;
                                    i10++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static void l(long[] jArr, long[] jArr2) {
        long j6 = jArr2[0];
        long j10 = j6 * 2;
        long j11 = jArr2[1];
        long j12 = jArr2[2];
        long j13 = jArr2[3];
        long j14 = jArr2[4];
        long j15 = jArr2[5];
        long j16 = jArr2[6];
        long j17 = jArr2[7];
        long j18 = jArr2[8];
        long j19 = (((((j13 * j15) + (j11 * j17)) * 2) + (j6 * j18) + (j12 * j16)) * 2) + (j14 * j14);
        long j20 = jArr2[9];
        long j21 = (((((j13 * j20) + (j15 * j17)) * 2) + (j14 * j18)) * 2) + (j16 * j16);
        i(new long[]{j6 * j6, j10 * j11, ((j6 * j12) + (j11 * j11)) * 2, ((j6 * j13) + (j11 * j12)) * 2, (j10 * j14) + (j11 * 4 * j13) + (j12 * j12), ((j6 * j15) + (j11 * j14) + (j12 * j13)) * 2, ((j11 * 2 * j15) + (j6 * j16) + (j12 * j14) + (j13 * j13)) * 2, ((j6 * j17) + (j11 * j16) + (j12 * j15) + (j13 * j14)) * 2, j19, ((j6 * j20) + (j11 * j18) + (j12 * j17) + (j13 * j16) + (j14 * j15)) * 2, ((((j11 * j20) + (j13 * j17)) * 2) + (j12 * j18) + (j14 * j16) + (j15 * j15)) * 2, ((j12 * j20) + (j13 * j18) + (j14 * j17) + (j15 * j16)) * 2, j21, ((j14 * j20) + (j15 * j18) + (j16 * j17)) * 2, ((j15 * 2 * j20) + (j16 * j18) + (j17 * j17)) * 2, ((j16 * j20) + (j17 * j18)) * 2, (j17 * 4 * j20) + (j18 * j18), j18 * 2 * j20, 2 * j20 * j20}, jArr);
    }

    public static void m(C3636c1 c3636c1, U3.c cVar, a aVar) {
        long[] jArr = new long[10];
        u uVar = (u) cVar.f17396Z;
        o((long[]) ((u) c3636c1.f34285Z).f17492Z, (long[]) uVar.f17493h0, (long[]) uVar.f17492Z);
        u uVar2 = (u) cVar.f17396Z;
        n((long[]) ((u) c3636c1.f34285Z).f17493h0, (long[]) uVar2.f17493h0, (long[]) uVar2.f17492Z);
        Object obj = ((u) c3636c1.f34285Z).f17493h0;
        h((long[]) obj, (long[]) obj, aVar.f2725a);
        u uVar3 = (u) c3636c1.f34285Z;
        h((long[]) uVar3.f17494i0, (long[]) uVar3.f17492Z, aVar.f2726b);
        h((long[]) c3636c1.f34286h0, (long[]) cVar.f17397h0, aVar.f2727c);
        aVar.a((long[]) ((u) c3636c1.f34285Z).f17492Z, (long[]) ((u) cVar.f17396Z).f17494i0);
        Object obj2 = ((u) c3636c1.f34285Z).f17492Z;
        o(jArr, (long[]) obj2, (long[]) obj2);
        u uVar4 = (u) c3636c1.f34285Z;
        n((long[]) uVar4.f17492Z, (long[]) uVar4.f17494i0, (long[]) uVar4.f17493h0);
        u uVar5 = (u) c3636c1.f34285Z;
        Object obj3 = uVar5.f17493h0;
        o((long[]) obj3, (long[]) uVar5.f17494i0, (long[]) obj3);
        n((long[]) ((u) c3636c1.f34285Z).f17494i0, jArr, (long[]) c3636c1.f34286h0);
        long[] jArr2 = (long[]) c3636c1.f34286h0;
        o(jArr2, jArr, jArr2);
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    public static void o(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }
}
