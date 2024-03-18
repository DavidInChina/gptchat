package C8;

import U3.u;
import io.sentry.C3636c1;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final D8.a f2743a;

    public e(byte[] bArr) {
        if (!B8.a.f1987a.get()) {
            if (bArr.length == 32) {
                this.f2743a = new D8.a(bArr, bArr.length);
                return;
            }
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        long j6;
        long j10;
        byte b10;
        byte[] bArr3 = bArr;
        if (bArr3.length == 64) {
            byte[] bArr4 = this.f2743a.f3421a;
            byte[] bArr5 = new byte[bArr4.length];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            if (bArr3.length == 64) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
                int i10 = 31;
                int i11 = 31;
                while (true) {
                    if (i11 < 0) {
                        break;
                    }
                    int i12 = copyOfRange[i11] & 255;
                    int i13 = c.f2730b[i11] & 255;
                    if (i12 != i13) {
                        if (i12 < i13) {
                            MessageDigest messageDigest = (MessageDigest) h.f2746b.f2747a.e();
                            messageDigest.update(bArr3, 0, 32);
                            messageDigest.update(bArr5);
                            messageDigest.update(bArr2);
                            byte[] digest = messageDigest.digest();
                            long f6 = (c.f(47, digest) >> 2) & 2097151;
                            long g10 = (c.g(49, digest) >> 7) & 2097151;
                            long g11 = (c.g(52, digest) >> 4) & 2097151;
                            long f10 = (c.f(55, digest) >> 1) & 2097151;
                            long g12 = (c.g(57, digest) >> 6) & 2097151;
                            long g13 = c.g(60, digest) >> 3;
                            long j11 = g13 * 666643;
                            long j12 = g13 * 470296;
                            long j13 = g13 * 654183;
                            long j14 = g13 * 136657;
                            long f11 = (c.f(42, digest) & 2097151) - (g13 * 683901);
                            long f12 = (g12 * 666643) + ((c.f(26, digest) >> 2) & 2097151);
                            long g14 = (g12 * 470296) + j11 + ((c.g(28, digest) >> 7) & 2097151);
                            long g15 = (g12 * 654183) + j12 + ((c.g(i10, digest) >> 4) & 2097151);
                            long f13 = (j13 + ((c.f(34, digest) >> 1) & 2097151)) - (g12 * 997805);
                            long g16 = (g12 * 136657) + (((c.g(36, digest) >> 6) & 2097151) - (g13 * 997805));
                            long f14 = (j14 + ((c.f(39, digest) >> 3) & 2097151)) - (g12 * 683901);
                            long g17 = (f10 * 666643) + ((c.g(23, digest) >> 5) & 2097151);
                            long j15 = (f10 * 654183) + g14;
                            long j16 = g15 - (f10 * 997805);
                            long j17 = g16 - (f10 * 683901);
                            long f15 = (g11 * 666643) + (c.f(21, digest) & 2097151);
                            long j18 = (g11 * 470296) + g17;
                            long j19 = (g11 * 654183) + (f10 * 470296) + f12;
                            long j20 = j15 - (g11 * 997805);
                            long j21 = ((f10 * 136657) + f13) - (g11 * 683901);
                            long f16 = (g10 * 666643) + ((c.f(18, digest) >> 3) & 2097151);
                            long j22 = (g10 * 470296) + f15;
                            long j23 = (g10 * 654183) + j18;
                            long j24 = j19 - (g10 * 997805);
                            long j25 = (g10 * 136657) + j20;
                            long j26 = ((g11 * 136657) + j16) - (g10 * 683901);
                            long g18 = (f6 * 666643) + ((c.g(15, digest) >> 6) & 2097151);
                            long j27 = (f6 * 654183) + j22;
                            long j28 = j23 - (f6 * 997805);
                            long j29 = (f6 * 136657) + j24;
                            long j30 = j25 - (f6 * 683901);
                            long j31 = (g18 + 1048576) >> 21;
                            long j32 = (f6 * 470296) + f16 + j31;
                            long j33 = g18 - (j31 << 21);
                            long j34 = (j27 + 1048576) >> 21;
                            long j35 = j28 + j34;
                            long j36 = j27 - (j34 << 21);
                            long j37 = (j29 + 1048576) >> 21;
                            long j38 = j30 + j37;
                            long j39 = j29 - (j37 << 21);
                            long j40 = (j26 + 1048576) >> 21;
                            long j41 = j21 + j40;
                            long j42 = j26 - (j40 << 21);
                            long j43 = (j17 + 1048576) >> 21;
                            long j44 = f14 + j43;
                            long j45 = j17 - (j43 << 21);
                            long j46 = (f11 + 1048576) >> 21;
                            long g19 = ((c.g(44, digest) >> 5) & 2097151) + j46;
                            long j47 = f11 - (j46 << 21);
                            long j48 = (j32 + 1048576) >> 21;
                            long j49 = j36 + j48;
                            long j50 = j32 - (j48 << 21);
                            long j51 = (j35 + 1048576) >> 21;
                            long j52 = j39 + j51;
                            long j53 = j35 - (j51 << 21);
                            long j54 = (j38 + 1048576) >> 21;
                            long j55 = j42 + j54;
                            long j56 = j38 - (j54 << 21);
                            long j57 = (j41 + 1048576) >> 21;
                            long j58 = j45 + j57;
                            long j59 = j41 - (j57 << 21);
                            long j60 = (j44 + 1048576) >> 21;
                            long j61 = j47 + j60;
                            long j62 = j44 - (j60 << 21);
                            long f17 = (g19 * 666643) + ((c.f(13, digest) >> 1) & 2097151);
                            long j63 = (g19 * 470296) + j33;
                            long j64 = (g19 * 654183) + j50;
                            long j65 = j49 - (g19 * 997805);
                            long j66 = j52 - (g19 * 683901);
                            long g20 = (j61 * 666643) + ((c.g(10, digest) >> 4) & 2097151);
                            long j67 = (j61 * 470296) + f17;
                            long j68 = (j61 * 654183) + j63;
                            long j69 = j64 - (j61 * 997805);
                            long j70 = ((g19 * 136657) + j53) - (j61 * 683901);
                            long g21 = (j62 * 666643) + ((c.g(7, digest) >> 7) & 2097151);
                            long j71 = (j62 * 470296) + g20;
                            long j72 = (j62 * 654183) + j67;
                            long j73 = (j62 * 136657) + j69;
                            long j74 = ((j61 * 136657) + j65) - (j62 * 683901);
                            long f18 = (j58 * 666643) + ((c.f(5, digest) >> 2) & 2097151);
                            long j75 = (j58 * 470296) + g21;
                            long j76 = (j58 * 654183) + j71;
                            long j77 = (j58 * 136657) + (j68 - (j62 * 997805));
                            long g22 = (j59 * 666643) + ((c.g(2, digest) >> 5) & 2097151);
                            long j78 = (j59 * 470296) + f18;
                            long j79 = (j59 * 654183) + j75;
                            long j80 = j76 - (j59 * 997805);
                            long j81 = (j59 * 136657) + (j72 - (j58 * 997805));
                            long j82 = j77 - (j59 * 683901);
                            long f19 = (j55 * 666643) + (c.f(0, digest) & 2097151);
                            long j83 = (j55 * 654183) + j78;
                            long j84 = (j55 * 136657) + j80;
                            long j85 = (f19 + 1048576) >> 21;
                            long j86 = (j55 * 470296) + g22 + j85;
                            long j87 = f19 - (j85 << 21);
                            long j88 = (j83 + 1048576) >> 21;
                            long j89 = (j79 - (j55 * 997805)) + j88;
                            long j90 = j83 - (j88 << 21);
                            long j91 = (j84 + 1048576) >> 21;
                            long j92 = (j81 - (j55 * 683901)) + j91;
                            long j93 = j84 - (j91 << 21);
                            long j94 = (j82 + 1048576) >> 21;
                            long j95 = (j73 - (j58 * 683901)) + j94;
                            long j96 = j82 - (j94 << 21);
                            long j97 = (j74 + 1048576) >> 21;
                            long j98 = j70 + j97;
                            long j99 = j74 - (j97 << 21);
                            long j100 = (j66 + 1048576) >> 21;
                            long j101 = j56 + j100;
                            long j102 = j66 - (j100 << 21);
                            long j103 = (j86 + 1048576) >> 21;
                            long j104 = j90 + j103;
                            long j105 = j86 - (j103 << 21);
                            long j106 = (j89 + 1048576) >> 21;
                            long j107 = j93 + j106;
                            long j108 = j89 - (j106 << 21);
                            long j109 = (j92 + 1048576) >> 21;
                            long j110 = j96 + j109;
                            long j111 = j92 - (j109 << 21);
                            long j112 = (j95 + 1048576) >> 21;
                            long j113 = j99 + j112;
                            long j114 = j95 - (j112 << 21);
                            long j115 = (j98 + 1048576) >> 21;
                            long j116 = (j101 + 1048576) >> 21;
                            long j117 = j101 - (j116 << 21);
                            long j118 = (j116 * 666643) + j87;
                            long j119 = (j116 * 470296) + j105;
                            long j120 = j108 - (j116 * 997805);
                            long j121 = j111 - (j116 * 683901);
                            long j122 = j118 >> 21;
                            long j123 = j119 + j122;
                            long j124 = j118 - (j122 << 21);
                            long j125 = j123 >> 21;
                            long j126 = (j116 * 654183) + j104 + j125;
                            long j127 = j123 - (j125 << 21);
                            long j128 = j126 >> 21;
                            long j129 = j120 + j128;
                            long j130 = j126 - (j128 << 21);
                            long j131 = j129 >> 21;
                            long j132 = (j116 * 136657) + j107 + j131;
                            long j133 = j129 - (j131 << 21);
                            long j134 = j132 >> 21;
                            long j135 = j121 + j134;
                            long j136 = j132 - (j134 << 21);
                            long j137 = j135 >> 21;
                            long j138 = j110 + j137;
                            long j139 = j135 - (j137 << 21);
                            long j140 = j138 >> 21;
                            long j141 = j114 + j140;
                            long j142 = j138 - (j140 << 21);
                            long j143 = j141 >> 21;
                            long j144 = j113 + j143;
                            long j145 = j141 - (j143 << 21);
                            long j146 = j144 >> 21;
                            long j147 = (j98 - (j115 << 21)) + j146;
                            long j148 = j144 - (j146 << 21);
                            long j149 = j147 >> 21;
                            long j150 = j102 + j115 + j149;
                            long j151 = j147 - (j149 << 21);
                            long j152 = j150 >> 21;
                            long j153 = j117 + j152;
                            long j154 = j150 - (j152 << 21);
                            long j155 = j153 >> 21;
                            long j156 = j153 - (j155 << 21);
                            long j157 = (666643 * j155) + j124;
                            long j158 = (654183 * j155) + j130;
                            long j159 = j139 - (j155 * 683901);
                            long j160 = j157 >> 21;
                            long j161 = (470296 * j155) + j127 + j160;
                            long j162 = j161 >> 21;
                            long j163 = j158 + j162;
                            long j164 = j161 - (j162 << 21);
                            long j165 = j163 >> 21;
                            long j166 = (j133 - (997805 * j155)) + j165;
                            long j167 = j163 - (j165 << 21);
                            long j168 = j166 >> 21;
                            long j169 = (136657 * j155) + j136 + j168;
                            long j170 = j166 - (j168 << 21);
                            long j171 = j169 >> 21;
                            long j172 = j159 + j171;
                            long j173 = j169 - (j171 << 21);
                            long j174 = j172 >> 21;
                            long j175 = j142 + j174;
                            long j176 = j172 - (j174 << 21);
                            long j177 = j175 >> 21;
                            long j178 = j145 + j177;
                            long j179 = j175 - (j177 << 21);
                            long j180 = j178 >> 21;
                            long j181 = j148 + j180;
                            long j182 = j178 - (j180 << 21);
                            long j183 = j181 >> 21;
                            long j184 = j151 + j183;
                            long j185 = j184 >> 21;
                            long j186 = j154 + j185;
                            long j187 = j184 - (j185 << 21);
                            long j188 = j186 >> 21;
                            long j189 = j156 + j188;
                            long j190 = j186 - (j188 << 21);
                            digest[0] = (byte) (j157 - (j160 << 21));
                            digest[1] = (byte) (j6 >> 8);
                            digest[2] = (byte) ((j6 >> 16) | (j164 << 5));
                            digest[3] = (byte) (j164 >> 3);
                            digest[4] = (byte) (j164 >> 11);
                            digest[5] = (byte) ((j164 >> 19) | (j167 << 2));
                            digest[6] = (byte) (j167 >> 6);
                            digest[7] = (byte) ((j167 >> 14) | (j170 << 7));
                            digest[8] = (byte) (j170 >> 1);
                            digest[9] = (byte) (j170 >> 9);
                            digest[10] = (byte) ((j170 >> 17) | (j173 << 4));
                            digest[11] = (byte) (j173 >> 4);
                            digest[12] = (byte) (j173 >> 12);
                            digest[13] = (byte) ((j173 >> 20) | (j176 << 1));
                            digest[14] = (byte) (j176 >> 7);
                            digest[15] = (byte) ((j176 >> 15) | (j179 << 6));
                            digest[16] = (byte) (j179 >> 2);
                            digest[17] = (byte) (j179 >> 10);
                            digest[18] = (byte) ((j179 >> 18) | (j182 << 3));
                            digest[19] = (byte) (j182 >> 5);
                            digest[20] = (byte) (j182 >> 13);
                            digest[21] = (byte) (j181 - (j183 << 21));
                            digest[22] = (byte) (j10 >> 8);
                            digest[23] = (byte) ((j10 >> 16) | (j187 << 5));
                            digest[24] = (byte) (j187 >> 3);
                            digest[25] = (byte) (j187 >> 11);
                            digest[26] = (byte) ((j187 >> 19) | (j190 << 2));
                            digest[27] = (byte) (j190 >> 6);
                            digest[28] = (byte) ((j190 >> 14) | (j189 << 7));
                            digest[29] = (byte) (j189 >> 1);
                            digest[30] = (byte) (j189 >> 9);
                            digest[31] = (byte) (j189 >> 17);
                            long[] jArr = new long[10];
                            long[] e10 = c.e(bArr5);
                            long[] jArr2 = new long[10];
                            jArr2[0] = 1;
                            long[] jArr3 = new long[10];
                            long[] jArr4 = new long[10];
                            long[] jArr5 = new long[10];
                            long[] jArr6 = new long[10];
                            long[] jArr7 = new long[10];
                            c.l(jArr4, e10);
                            c.h(jArr5, jArr4, d.f2735a);
                            c.n(jArr4, jArr4, jArr2);
                            c.o(jArr5, jArr5, jArr2);
                            long[] jArr8 = new long[10];
                            c.l(jArr8, jArr5);
                            c.h(jArr8, jArr8, jArr5);
                            c.l(jArr, jArr8);
                            c.h(jArr, jArr, jArr5);
                            c.h(jArr, jArr, jArr4);
                            long[] jArr9 = new long[10];
                            long[] jArr10 = new long[10];
                            long[] jArr11 = new long[10];
                            c.l(jArr9, jArr);
                            c.l(jArr10, jArr9);
                            c.l(jArr10, jArr10);
                            c.h(jArr10, jArr, jArr10);
                            c.h(jArr9, jArr9, jArr10);
                            c.l(jArr9, jArr9);
                            c.h(jArr9, jArr10, jArr9);
                            c.l(jArr10, jArr9);
                            byte[] bArr6 = copyOfRange;
                            for (int i14 = 1; i14 < 5; i14++) {
                                c.l(jArr10, jArr10);
                            }
                            c.h(jArr9, jArr10, jArr9);
                            c.l(jArr10, jArr9);
                            for (int i15 = 1; i15 < 10; i15++) {
                                c.l(jArr10, jArr10);
                            }
                            c.h(jArr10, jArr10, jArr9);
                            c.l(jArr11, jArr10);
                            for (int i16 = 1; i16 < 20; i16++) {
                                c.l(jArr11, jArr11);
                            }
                            c.h(jArr10, jArr11, jArr10);
                            c.l(jArr10, jArr10);
                            for (int i17 = 1; i17 < 10; i17++) {
                                c.l(jArr10, jArr10);
                            }
                            c.h(jArr9, jArr10, jArr9);
                            c.l(jArr10, jArr9);
                            for (int i18 = 1; i18 < 50; i18++) {
                                c.l(jArr10, jArr10);
                            }
                            c.h(jArr10, jArr10, jArr9);
                            c.l(jArr11, jArr10);
                            for (int i19 = 1; i19 < 100; i19++) {
                                c.l(jArr11, jArr11);
                            }
                            c.h(jArr10, jArr11, jArr10);
                            c.l(jArr10, jArr10);
                            for (int i20 = 1; i20 < 50; i20++) {
                                c.l(jArr10, jArr10);
                            }
                            c.h(jArr9, jArr10, jArr9);
                            c.l(jArr9, jArr9);
                            c.l(jArr9, jArr9);
                            c.h(jArr, jArr9, jArr);
                            c.h(jArr, jArr, jArr8);
                            c.h(jArr, jArr, jArr4);
                            c.l(jArr6, jArr);
                            c.h(jArr6, jArr6, jArr5);
                            c.n(jArr7, jArr6, jArr4);
                            if (c.a(jArr7)) {
                                c.o(jArr7, jArr6, jArr4);
                                if (!c.a(jArr7)) {
                                    c.h(jArr, jArr, d.f2737c);
                                } else {
                                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                                }
                            }
                            if (!c.a(jArr) && ((bArr5[31] & 255) >> 7) != 0) {
                                throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                            }
                            if ((c.c(jArr)[0] & 1) == ((bArr5[31] & 255) >> 7)) {
                                for (int i21 = 0; i21 < 10; i21++) {
                                    jArr[i21] = -jArr[i21];
                                }
                            }
                            c.h(jArr3, jArr, e10);
                            U3.c cVar = new U3.c(new u(jArr, e10, jArr2, 28), 18, jArr3);
                            b[] bVarArr = new b[8];
                            bVarArr[0] = new b(cVar);
                            C3636c1 c3636c1 = new C3636c1(17);
                            c.d((u) cVar.f17396Z, c3636c1);
                            U3.c cVar2 = new U3.c(c3636c1);
                            for (int i22 = 1; i22 < 8; i22++) {
                                c.b(c3636c1, cVar2, bVarArr[i22 - 1]);
                                bVarArr[i22] = new b(new U3.c(c3636c1));
                            }
                            byte[] k10 = c.k(digest);
                            byte[] k11 = c.k(bArr6);
                            C3636c1 c3636c12 = new C3636c1((Object) null);
                            U3.c cVar3 = new U3.c(18);
                            int i23 = 255;
                            while (i23 >= 0 && k10[i23] == 0 && k11[i23] == 0) {
                                i23--;
                            }
                            while (i23 >= 0) {
                                c.d(new u(c3636c12), c3636c12);
                                byte b11 = k10[i23];
                                if (b11 > 0) {
                                    U3.c.m(cVar3, c3636c12);
                                    b10 = 2;
                                    c.b(c3636c12, cVar3, bVarArr[k10[i23] / 2]);
                                } else {
                                    b10 = 2;
                                    if (b11 < 0) {
                                        U3.c.m(cVar3, c3636c12);
                                        c.m(c3636c12, cVar3, bVarArr[(-k10[i23]) / 2]);
                                    }
                                }
                                byte b12 = k11[i23];
                                if (b12 > 0) {
                                    U3.c.m(cVar3, c3636c12);
                                    c.b(c3636c12, cVar3, d.f2739e[k11[i23] / b10]);
                                } else if (b12 < 0) {
                                    U3.c.m(cVar3, c3636c12);
                                    c.m(c3636c12, cVar3, d.f2739e[(-k11[i23]) / b10]);
                                }
                                i23--;
                            }
                            u uVar = new u(c3636c12);
                            long[] jArr12 = new long[10];
                            long[] jArr13 = new long[10];
                            long[] jArr14 = new long[10];
                            long[] jArr15 = (long[]) uVar.f17494i0;
                            long[] jArr16 = new long[10];
                            long[] jArr17 = new long[10];
                            long[] jArr18 = new long[10];
                            long[] jArr19 = new long[10];
                            long[] jArr20 = new long[10];
                            long[] jArr21 = new long[10];
                            long[] jArr22 = new long[10];
                            long[] jArr23 = new long[10];
                            long[] jArr24 = new long[10];
                            long[] jArr25 = new long[10];
                            c.l(jArr16, jArr15);
                            c.l(jArr25, jArr16);
                            c.l(jArr24, jArr25);
                            c.h(jArr17, jArr24, jArr15);
                            c.h(jArr18, jArr17, jArr16);
                            c.l(jArr24, jArr18);
                            c.h(jArr19, jArr24, jArr17);
                            c.l(jArr24, jArr19);
                            c.l(jArr25, jArr24);
                            c.l(jArr24, jArr25);
                            c.l(jArr25, jArr24);
                            c.l(jArr24, jArr25);
                            c.h(jArr20, jArr24, jArr19);
                            c.l(jArr24, jArr20);
                            c.l(jArr25, jArr24);
                            int i24 = 2;
                            for (int i25 = 10; i24 < i25; i25 = 10) {
                                c.l(jArr24, jArr25);
                                c.l(jArr25, jArr24);
                                i24 += 2;
                            }
                            c.h(jArr21, jArr25, jArr20);
                            c.l(jArr24, jArr21);
                            c.l(jArr25, jArr24);
                            for (int i26 = 2; i26 < 20; i26 += 2) {
                                c.l(jArr24, jArr25);
                                c.l(jArr25, jArr24);
                            }
                            c.h(jArr24, jArr25, jArr21);
                            c.l(jArr25, jArr24);
                            c.l(jArr24, jArr25);
                            for (int i27 = 2; i27 < 10; i27 += 2) {
                                c.l(jArr25, jArr24);
                                c.l(jArr24, jArr25);
                            }
                            c.h(jArr22, jArr24, jArr20);
                            c.l(jArr24, jArr22);
                            c.l(jArr25, jArr24);
                            int i28 = 2;
                            for (int i29 = 50; i28 < i29; i29 = 50) {
                                c.l(jArr24, jArr25);
                                c.l(jArr25, jArr24);
                                i28 += 2;
                            }
                            c.h(jArr23, jArr25, jArr22);
                            c.l(jArr25, jArr23);
                            c.l(jArr24, jArr25);
                            for (int i30 = 2; i30 < 100; i30 += 2) {
                                c.l(jArr25, jArr24);
                                c.l(jArr24, jArr25);
                            }
                            c.h(jArr25, jArr24, jArr23);
                            c.l(jArr24, jArr25);
                            c.l(jArr25, jArr24);
                            for (int i31 = 2; i31 < 50; i31 += 2) {
                                c.l(jArr24, jArr25);
                                c.l(jArr25, jArr24);
                            }
                            c.h(jArr24, jArr25, jArr22);
                            c.l(jArr25, jArr24);
                            c.l(jArr24, jArr25);
                            c.l(jArr25, jArr24);
                            c.l(jArr24, jArr25);
                            c.l(jArr25, jArr24);
                            c.h(jArr12, jArr25, jArr18);
                            c.h(jArr13, (long[]) uVar.f17492Z, jArr12);
                            c.h(jArr14, (long[]) uVar.f17493h0, jArr12);
                            byte[] c10 = c.c(jArr14);
                            c10[31] = (byte) (c10[31] ^ ((c.c(jArr13)[0] & 1) << 7));
                            for (int i32 = 0; i32 < 32; i32++) {
                                if (c10[i32] == bArr[i32]) {
                                }
                            }
                            return;
                        }
                    } else {
                        i11--;
                        bArr3 = bArr;
                        copyOfRange = copyOfRange;
                        i10 = i10;
                    }
                }
            }
            throw new GeneralSecurityException("Signature check failed.");
        }
        throw new GeneralSecurityException("The length of the signature is not 64.");
    }
}
