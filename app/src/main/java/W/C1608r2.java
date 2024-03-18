package W;

import A.C0051x;
import E.AbstractC0434s;
import N.C1018b;
import Z.AbstractC1725n;
import Z.C1741v0;
import androidx.compose.foundation.BorderModifierNodeElement;
import h0.C3288a;

/* renamed from: W.r2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1608r2 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1608r2 f20379a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final float f20380b = 56;

    /* renamed from: c  reason: collision with root package name */
    public static final float f20381c = 280;

    /* renamed from: d  reason: collision with root package name */
    public static final float f20382d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final float f20383e = 2;

    public static N3 c(AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-471651810);
        P0 p02 = (P0) rVar.m(R0.f19593a);
        rVar.W(-292363577);
        N3 n32 = p02.f19516a0;
        if (n32 == null) {
            long d10 = R0.d(p02, 18);
            long d11 = R0.d(p02, 18);
            long b10 = r0.r.b(R0.d(p02, 18), 0.38f);
            long d12 = R0.d(p02, 18);
            long j6 = r0.r.f44262j;
            n32 = new N3(d10, d11, b10, d12, j6, j6, j6, j6, R0.d(p02, 26), R0.d(p02, 2), (N.y0) rVar.m(N.z0.f12460a), R0.d(p02, 26), R0.d(p02, 24), r0.r.b(R0.d(p02, 18), 0.12f), R0.d(p02, 2), R0.d(p02, 19), R0.d(p02, 19), r0.r.b(R0.d(p02, 18), 0.38f), R0.d(p02, 19), R0.d(p02, 19), R0.d(p02, 19), r0.r.b(R0.d(p02, 18), 0.38f), R0.d(p02, 2), R0.d(p02, 26), R0.d(p02, 19), r0.r.b(R0.d(p02, 18), 0.38f), R0.d(p02, 2), R0.d(p02, 19), R0.d(p02, 19), r0.r.b(R0.d(p02, 18), 0.38f), R0.d(p02, 19), R0.d(p02, 19), R0.d(p02, 19), r0.r.b(R0.e(18, rVar), 0.38f), R0.d(p02, 2), R0.d(p02, 19), R0.d(p02, 19), r0.r.b(R0.d(p02, 19), 0.38f), R0.d(p02, 19), R0.d(p02, 19), R0.d(p02, 19), r0.r.b(R0.d(p02, 19), 0.38f), R0.d(p02, 19));
            p02.f19516a0 = n32;
        }
        rVar.t(false);
        rVar.t(false);
        return n32;
    }

    public final void a(boolean z10, boolean z11, D.l lVar, N3 n32, r0.L l10, float f6, float f10, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        r0.L l11;
        float f11;
        float f12;
        float f13;
        float f14;
        r0.L l12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1461761386);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.h(z10)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.h(z11)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (rVar.g(lVar)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (rVar.g(n32)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i12 |= i17;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                l11 = l10;
                if (rVar.g(l11)) {
                    i16 = 16384;
                    i12 |= i16;
                }
            } else {
                l11 = l10;
            }
            i16 = 8192;
            i12 |= i16;
        } else {
            l11 = l10;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                f11 = f6;
                if (rVar.d(f11)) {
                    i15 = 131072;
                    i12 |= i15;
                }
            } else {
                f11 = f6;
            }
            i15 = 65536;
            i12 |= i15;
        } else {
            f11 = f6;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                f12 = f10;
                if (rVar.d(f12)) {
                    i14 = 1048576;
                    i12 |= i14;
                }
            } else {
                f12 = f10;
            }
            i14 = 524288;
            i12 |= i14;
        } else {
            f12 = f10;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (rVar.g(this)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i12 |= i13;
        }
        if ((4793491 & i12) == 4793490 && rVar.B()) {
            rVar.P();
            l12 = l11;
            f14 = f11;
            f13 = f12;
        } else {
            rVar.R();
            if ((i10 & 1) != 0 && !rVar.A()) {
                rVar.P();
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                }
            } else {
                if ((i11 & 16) != 0) {
                    l11 = AbstractC1530b3.a(3, rVar);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    f11 = f20383e;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    f12 = f20382d;
                }
            }
            r0.L l13 = l11;
            float f15 = f11;
            f13 = f12;
            rVar.u();
            int i21 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
            int i22 = i12 >> 3;
            C0051x c0051x = (C0051x) Ng.H.h(z10, z11, lVar, n32, f15, f13, rVar, i21 | (57344 & i22) | (i22 & 458752)).getValue();
            AbstractC0434s.a(androidx.compose.foundation.a.d(new BorderModifierNodeElement(c0051x.f321a, c0051x.f322b, l13), ((r0.r) n32.a(z10, z11, lVar, rVar, i21).getValue()).f44265a, l13), rVar, 0);
            l12 = l13;
            f14 = f15;
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1599p2(this, z10, z11, lVar, n32, l12, f14, f13, i10, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str, wf.n nVar, boolean z10, boolean z11, T0.I i10, D.l lVar, boolean z12, wf.n nVar2, wf.n nVar3, wf.n nVar4, wf.n nVar5, wf.n nVar6, wf.n nVar7, wf.n nVar8, N3 n32, E.g0 g0Var, wf.n nVar9, AbstractC1725n abstractC1725n, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Z.r rVar;
        wf.n nVar10;
        E.g0 g0Var2;
        N3 n33;
        wf.n nVar11;
        wf.n nVar12;
        wf.n nVar13;
        wf.n nVar14;
        wf.n nVar15;
        wf.n nVar16;
        wf.n nVar17;
        boolean z13;
        C1741v0 v10;
        C3288a c3288a;
        E.g0 g0Var3;
        N3 n34;
        wf.n nVar18;
        wf.n nVar19;
        wf.n nVar20;
        wf.n nVar21;
        wf.n nVar22;
        wf.n nVar23;
        wf.n nVar24;
        boolean z14;
        N3 n35;
        wf.n nVar25;
        E.g0 g0Var4;
        boolean z15;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-350442135);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (rVar2.g(str) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= rVar2.i(nVar) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= 384;
        } else if ((i11 & 384) == 0) {
            i14 |= rVar2.h(z10) ? 256 : 128;
        }
        int i25 = 2048;
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i14 |= rVar2.h(z11) ? 2048 : 1024;
            int i26 = 8192;
            if ((i13 & 16) == 0) {
                i14 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i14 |= rVar2.g(i10) ? 16384 : 8192;
                if ((i13 & 32) != 0) {
                    i14 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    i14 |= rVar2.g(lVar) ? 131072 : 65536;
                }
                i15 = i13 & 64;
                int i27 = 524288;
                if (i15 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    i14 |= rVar2.h(z12) ? 1048576 : 524288;
                }
                i16 = i13 & 128;
                int i28 = 4194304;
                if (i16 != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    i14 |= rVar2.i(nVar2) ? 8388608 : 4194304;
                }
                i17 = i13 & 256;
                if (i17 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i14 |= rVar2.i(nVar3) ? 67108864 : 33554432;
                }
                i18 = i13 & 512;
                if (i18 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    i14 |= rVar2.i(nVar4) ? 536870912 : 268435456;
                }
                i19 = i13 & 1024;
                if (i19 != 0) {
                    i20 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    i20 = i12 | (rVar2.i(nVar5) ? 4 : 2);
                } else {
                    i20 = i12;
                }
                i21 = i13 & 2048;
                if (i21 != 0) {
                    i20 |= 48;
                } else if ((i12 & 48) == 0) {
                    i20 |= rVar2.i(nVar6) ? 32 : 16;
                }
                int i29 = i20;
                i22 = i13 & 4096;
                if (i22 != 0) {
                    i29 |= 384;
                } else if ((i12 & 384) == 0) {
                    i29 |= rVar2.i(nVar7) ? 256 : 128;
                    i23 = i13 & 8192;
                    if (i23 == 0) {
                        i29 |= 3072;
                    } else if ((i12 & 3072) == 0) {
                        if (!rVar2.i(nVar8)) {
                            i25 = 1024;
                        }
                        i29 |= i25;
                        if ((i12 & 24576) == 0) {
                            if ((i13 & 16384) == 0 && rVar2.g(n32)) {
                                i26 = 16384;
                            }
                            i29 |= i26;
                        }
                        if ((i12 & 196608) == 0) {
                            i29 |= ((i13 & 32768) != 0 || !rVar2.g(g0Var)) ? 65536 : 131072;
                        }
                        i24 = i13 & 65536;
                        if (i24 != 0) {
                            i29 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (rVar2.i(nVar9)) {
                                i27 = 1048576;
                            }
                            i29 |= i27;
                        }
                        if ((i13 & 131072) != 0) {
                            i29 |= 12582912;
                        } else if ((i12 & 12582912) == 0) {
                            if (rVar2.g(this)) {
                                i28 = 8388608;
                            }
                            i29 |= i28;
                        }
                        int i30 = i14;
                        if ((i14 & 306783379) != 306783378 && (4793491 & i29) == 4793490 && rVar2.B()) {
                            rVar2.P();
                            z13 = z12;
                            nVar17 = nVar2;
                            nVar15 = nVar4;
                            nVar14 = nVar5;
                            nVar13 = nVar6;
                            nVar12 = nVar7;
                            nVar11 = nVar8;
                            n33 = n32;
                            g0Var2 = g0Var;
                            nVar10 = nVar9;
                            rVar = rVar2;
                            nVar16 = nVar3;
                        } else {
                            rVar2.R();
                            if ((i11 & 1) != 0 || rVar2.A()) {
                                boolean z16 = i15 != 0 ? false : z12;
                                wf.n nVar26 = null;
                                wf.n nVar27 = i16 != 0 ? null : nVar2;
                                wf.n nVar28 = i17 != 0 ? null : nVar3;
                                wf.n nVar29 = i18 != 0 ? null : nVar4;
                                wf.n nVar30 = i19 != 0 ? null : nVar5;
                                wf.n nVar31 = i21 != 0 ? null : nVar6;
                                wf.n nVar32 = i22 != 0 ? null : nVar7;
                                if (i23 == 0) {
                                    nVar26 = nVar8;
                                }
                                if ((i13 & 16384) != 0) {
                                    n35 = c(rVar2);
                                    i29 &= -57345;
                                } else {
                                    n35 = n32;
                                }
                                wf.n nVar33 = nVar29;
                                if ((i13 & 32768) != 0) {
                                    float f6 = X3.f19835b;
                                    nVar25 = nVar30;
                                    g0Var4 = new E.i0(f6, f6, f6, f6);
                                    i29 = (-458753) & i29;
                                } else {
                                    nVar25 = nVar30;
                                    g0Var4 = g0Var;
                                }
                                if (i24 != 0) {
                                    z15 = z16;
                                    nVar22 = nVar33;
                                    nVar21 = nVar25;
                                    c3288a = R4.b.X(rVar2, -1448570018, new C1018b(lVar, n35, z10, z16));
                                } else {
                                    z15 = z16;
                                    nVar22 = nVar33;
                                    nVar21 = nVar25;
                                    c3288a = nVar9;
                                }
                                g0Var3 = g0Var4;
                                nVar20 = nVar31;
                                nVar24 = nVar27;
                                nVar23 = nVar28;
                                nVar19 = nVar32;
                                n34 = n35;
                                nVar18 = nVar26;
                                z14 = z15;
                            } else {
                                rVar2.P();
                                if ((i13 & 16384) != 0) {
                                    i29 &= -57345;
                                }
                                if ((i13 & 32768) != 0) {
                                    i29 &= -458753;
                                }
                                z14 = z12;
                                nVar24 = nVar2;
                                nVar23 = nVar3;
                                nVar22 = nVar4;
                                nVar21 = nVar5;
                                nVar20 = nVar6;
                                nVar19 = nVar7;
                                nVar18 = nVar8;
                                n34 = n32;
                                g0Var3 = g0Var;
                                c3288a = nVar9;
                            }
                            rVar2.u();
                            int i31 = i30 << 3;
                            int i32 = i30 >> 3;
                            int i33 = i30 >> 9;
                            int i34 = i29 << 21;
                            rVar = rVar2;
                            X3.a(f4.f20065Z, str, nVar, i10, nVar24, nVar23, nVar22, nVar21, nVar20, nVar19, nVar18, z11, z10, z14, lVar, g0Var3, n34, c3288a, rVar, (i31 & 896) | (i31 & 112) | 6 | (i32 & 7168) | (57344 & i33) | (458752 & i33) | (3670016 & i33) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), (i30 & 896) | ((i29 >> 9) & 14) | ((i30 >> 6) & 112) | (i33 & 7168) | (57344 & i32) | (458752 & i29) | ((i29 << 6) & 3670016) | ((i29 << 3) & 29360128), 0);
                            z13 = z14;
                            nVar17 = nVar24;
                            nVar16 = nVar23;
                            nVar15 = nVar22;
                            nVar14 = nVar21;
                            nVar13 = nVar20;
                            nVar12 = nVar19;
                            nVar11 = nVar18;
                            n33 = n34;
                            g0Var2 = g0Var3;
                            nVar10 = c3288a;
                        }
                        v10 = rVar.v();
                        if (v10 == null) {
                            return;
                        }
                        v10.f22739d = new C1604q2(this, str, nVar, z10, z11, i10, lVar, z13, nVar17, nVar16, nVar15, nVar14, nVar13, nVar12, nVar11, n33, g0Var2, nVar10, i11, i12, i13);
                        return;
                    }
                    if ((i12 & 24576) == 0) {
                    }
                    if ((i12 & 196608) == 0) {
                    }
                    i24 = i13 & 65536;
                    if (i24 != 0) {
                    }
                    if ((i13 & 131072) != 0) {
                    }
                    int i302 = i14;
                    if ((i14 & 306783379) != 306783378) {
                    }
                    rVar2.R();
                    if ((i11 & 1) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    wf.n nVar262 = null;
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i23 == 0) {
                    }
                    if ((i13 & 16384) != 0) {
                    }
                    wf.n nVar332 = nVar29;
                    if ((i13 & 32768) != 0) {
                    }
                    if (i24 != 0) {
                    }
                    g0Var3 = g0Var4;
                    nVar20 = nVar31;
                    nVar24 = nVar27;
                    nVar23 = nVar28;
                    nVar19 = nVar32;
                    n34 = n35;
                    nVar18 = nVar262;
                    z14 = z15;
                    rVar2.u();
                    int i312 = i302 << 3;
                    int i322 = i302 >> 3;
                    int i332 = i302 >> 9;
                    int i342 = i29 << 21;
                    rVar = rVar2;
                    X3.a(f4.f20065Z, str, nVar, i10, nVar24, nVar23, nVar22, nVar21, nVar20, nVar19, nVar18, z11, z10, z14, lVar, g0Var3, n34, c3288a, rVar, (i312 & 896) | (i312 & 112) | 6 | (i322 & 7168) | (57344 & i332) | (458752 & i332) | (3670016 & i332) | (29360128 & i342) | (234881024 & i342) | (i342 & 1879048192), (i302 & 896) | ((i29 >> 9) & 14) | ((i302 >> 6) & 112) | (i332 & 7168) | (57344 & i322) | (458752 & i29) | ((i29 << 6) & 3670016) | ((i29 << 3) & 29360128), 0);
                    z13 = z14;
                    nVar17 = nVar24;
                    nVar16 = nVar23;
                    nVar15 = nVar22;
                    nVar14 = nVar21;
                    nVar13 = nVar20;
                    nVar12 = nVar19;
                    nVar11 = nVar18;
                    n33 = n34;
                    g0Var2 = g0Var3;
                    nVar10 = c3288a;
                    v10 = rVar.v();
                    if (v10 == null) {
                    }
                }
                i23 = i13 & 8192;
                if (i23 == 0) {
                }
                if ((i12 & 24576) == 0) {
                }
                if ((i12 & 196608) == 0) {
                }
                i24 = i13 & 65536;
                if (i24 != 0) {
                }
                if ((i13 & 131072) != 0) {
                }
                int i3022 = i14;
                if ((i14 & 306783379) != 306783378) {
                }
                rVar2.R();
                if ((i11 & 1) != 0) {
                }
                if (i15 != 0) {
                }
                wf.n nVar2622 = null;
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if (i23 == 0) {
                }
                if ((i13 & 16384) != 0) {
                }
                wf.n nVar3322 = nVar29;
                if ((i13 & 32768) != 0) {
                }
                if (i24 != 0) {
                }
                g0Var3 = g0Var4;
                nVar20 = nVar31;
                nVar24 = nVar27;
                nVar23 = nVar28;
                nVar19 = nVar32;
                n34 = n35;
                nVar18 = nVar2622;
                z14 = z15;
                rVar2.u();
                int i3122 = i3022 << 3;
                int i3222 = i3022 >> 3;
                int i3322 = i3022 >> 9;
                int i3422 = i29 << 21;
                rVar = rVar2;
                X3.a(f4.f20065Z, str, nVar, i10, nVar24, nVar23, nVar22, nVar21, nVar20, nVar19, nVar18, z11, z10, z14, lVar, g0Var3, n34, c3288a, rVar, (i3122 & 896) | (i3122 & 112) | 6 | (i3222 & 7168) | (57344 & i3322) | (458752 & i3322) | (3670016 & i3322) | (29360128 & i3422) | (234881024 & i3422) | (i3422 & 1879048192), (i3022 & 896) | ((i29 >> 9) & 14) | ((i3022 >> 6) & 112) | (i3322 & 7168) | (57344 & i3222) | (458752 & i29) | ((i29 << 6) & 3670016) | ((i29 << 3) & 29360128), 0);
                z13 = z14;
                nVar17 = nVar24;
                nVar16 = nVar23;
                nVar15 = nVar22;
                nVar14 = nVar21;
                nVar13 = nVar20;
                nVar12 = nVar19;
                nVar11 = nVar18;
                n33 = n34;
                g0Var2 = g0Var3;
                nVar10 = c3288a;
                v10 = rVar.v();
                if (v10 == null) {
                }
            }
            if ((i13 & 32) != 0) {
            }
            i15 = i13 & 64;
            int i272 = 524288;
            if (i15 != 0) {
            }
            i16 = i13 & 128;
            int i282 = 4194304;
            if (i16 != 0) {
            }
            i17 = i13 & 256;
            if (i17 != 0) {
            }
            i18 = i13 & 512;
            if (i18 != 0) {
            }
            i19 = i13 & 1024;
            if (i19 != 0) {
            }
            i21 = i13 & 2048;
            if (i21 != 0) {
            }
            int i292 = i20;
            i22 = i13 & 4096;
            if (i22 != 0) {
            }
            i23 = i13 & 8192;
            if (i23 == 0) {
            }
            if ((i12 & 24576) == 0) {
            }
            if ((i12 & 196608) == 0) {
            }
            i24 = i13 & 65536;
            if (i24 != 0) {
            }
            if ((i13 & 131072) != 0) {
            }
            int i30222 = i14;
            if ((i14 & 306783379) != 306783378) {
            }
            rVar2.R();
            if ((i11 & 1) != 0) {
            }
            if (i15 != 0) {
            }
            wf.n nVar26222 = null;
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            if (i23 == 0) {
            }
            if ((i13 & 16384) != 0) {
            }
            wf.n nVar33222 = nVar29;
            if ((i13 & 32768) != 0) {
            }
            if (i24 != 0) {
            }
            g0Var3 = g0Var4;
            nVar20 = nVar31;
            nVar24 = nVar27;
            nVar23 = nVar28;
            nVar19 = nVar32;
            n34 = n35;
            nVar18 = nVar26222;
            z14 = z15;
            rVar2.u();
            int i31222 = i30222 << 3;
            int i32222 = i30222 >> 3;
            int i33222 = i30222 >> 9;
            int i34222 = i292 << 21;
            rVar = rVar2;
            X3.a(f4.f20065Z, str, nVar, i10, nVar24, nVar23, nVar22, nVar21, nVar20, nVar19, nVar18, z11, z10, z14, lVar, g0Var3, n34, c3288a, rVar, (i31222 & 896) | (i31222 & 112) | 6 | (i32222 & 7168) | (57344 & i33222) | (458752 & i33222) | (3670016 & i33222) | (29360128 & i34222) | (234881024 & i34222) | (i34222 & 1879048192), (i30222 & 896) | ((i292 >> 9) & 14) | ((i30222 >> 6) & 112) | (i33222 & 7168) | (57344 & i32222) | (458752 & i292) | ((i292 << 6) & 3670016) | ((i292 << 3) & 29360128), 0);
            z13 = z14;
            nVar17 = nVar24;
            nVar16 = nVar23;
            nVar15 = nVar22;
            nVar14 = nVar21;
            nVar13 = nVar20;
            nVar12 = nVar19;
            nVar11 = nVar18;
            n33 = n34;
            g0Var2 = g0Var3;
            nVar10 = c3288a;
            v10 = rVar.v();
            if (v10 == null) {
            }
        }
        int i262 = 8192;
        if ((i13 & 16) == 0) {
        }
        if ((i13 & 32) != 0) {
        }
        i15 = i13 & 64;
        int i2722 = 524288;
        if (i15 != 0) {
        }
        i16 = i13 & 128;
        int i2822 = 4194304;
        if (i16 != 0) {
        }
        i17 = i13 & 256;
        if (i17 != 0) {
        }
        i18 = i13 & 512;
        if (i18 != 0) {
        }
        i19 = i13 & 1024;
        if (i19 != 0) {
        }
        i21 = i13 & 2048;
        if (i21 != 0) {
        }
        int i2922 = i20;
        i22 = i13 & 4096;
        if (i22 != 0) {
        }
        i23 = i13 & 8192;
        if (i23 == 0) {
        }
        if ((i12 & 24576) == 0) {
        }
        if ((i12 & 196608) == 0) {
        }
        i24 = i13 & 65536;
        if (i24 != 0) {
        }
        if ((i13 & 131072) != 0) {
        }
        int i302222 = i14;
        if ((i14 & 306783379) != 306783378) {
        }
        rVar2.R();
        if ((i11 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        wf.n nVar262222 = null;
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if (i23 == 0) {
        }
        if ((i13 & 16384) != 0) {
        }
        wf.n nVar332222 = nVar29;
        if ((i13 & 32768) != 0) {
        }
        if (i24 != 0) {
        }
        g0Var3 = g0Var4;
        nVar20 = nVar31;
        nVar24 = nVar27;
        nVar23 = nVar28;
        nVar19 = nVar32;
        n34 = n35;
        nVar18 = nVar262222;
        z14 = z15;
        rVar2.u();
        int i312222 = i302222 << 3;
        int i322222 = i302222 >> 3;
        int i332222 = i302222 >> 9;
        int i342222 = i2922 << 21;
        rVar = rVar2;
        X3.a(f4.f20065Z, str, nVar, i10, nVar24, nVar23, nVar22, nVar21, nVar20, nVar19, nVar18, z11, z10, z14, lVar, g0Var3, n34, c3288a, rVar, (i312222 & 896) | (i312222 & 112) | 6 | (i322222 & 7168) | (57344 & i332222) | (458752 & i332222) | (3670016 & i332222) | (29360128 & i342222) | (234881024 & i342222) | (i342222 & 1879048192), (i302222 & 896) | ((i2922 >> 9) & 14) | ((i302222 >> 6) & 112) | (i332222 & 7168) | (57344 & i322222) | (458752 & i2922) | ((i2922 << 6) & 3670016) | ((i2922 << 3) & 29360128), 0);
        z13 = z14;
        nVar17 = nVar24;
        nVar16 = nVar23;
        nVar15 = nVar22;
        nVar14 = nVar21;
        nVar13 = nVar20;
        nVar12 = nVar19;
        nVar11 = nVar18;
        n33 = n34;
        g0Var2 = g0Var3;
        nVar10 = c3288a;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }
}
