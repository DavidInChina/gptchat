package W;

import E0.AbstractC0463w;
import E0.C0462v;
import N0.C1046e;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1741v0;
import h0.C3288a;
import l0.AbstractC4326r;
import l0.C4323o;

/* loaded from: classes2.dex */
public abstract class X3 {

    /* renamed from: b  reason: collision with root package name */
    public static final float f19835b;

    /* renamed from: g  reason: collision with root package name */
    public static final float f19840g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f19841h;

    /* renamed from: i  reason: collision with root package name */
    public static final AbstractC4326r f19842i;

    /* renamed from: a  reason: collision with root package name */
    public static final long f19834a = A7.b.m(0, 0, 0, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final float f19836c = 12;

    /* renamed from: d  reason: collision with root package name */
    public static final float f19837d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final float f19838e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final float f19839f = 24;

    static {
        float f6 = 16;
        f19835b = f6;
        f19840g = f6;
        f19841h = f6;
        float f10 = 48;
        f19842i = androidx.compose.foundation.layout.e.a(C4323o.f37719b, f10, f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f4 f4Var, String str, wf.n nVar, T0.I i10, wf.n nVar2, wf.n nVar3, wf.n nVar4, wf.n nVar5, wf.n nVar6, wf.n nVar7, wf.n nVar8, boolean z10, boolean z11, boolean z12, D.l lVar, E.g0 g0Var, N3 n32, wf.n nVar9, AbstractC1725n abstractC1725n, int i11, int i12, int i13) {
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
        int i25;
        boolean z13;
        boolean z14;
        boolean z15;
        wf.n nVar10;
        wf.n nVar11;
        wf.n nVar12;
        wf.n nVar13;
        wf.n nVar14;
        wf.n nVar15;
        Z.r rVar;
        C1741v0 v10;
        boolean z16;
        Object K10;
        EnumC1612s1 enumC1612s1;
        boolean z17;
        boolean z18;
        boolean z19;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-947035500);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (rVar2.g(f4Var) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= rVar2.g(str) ? 32 : 16;
        }
        int i26 = 256;
        if ((i13 & 4) != 0) {
            i14 |= 384;
        } else if ((i11 & 384) == 0) {
            i14 |= rVar2.i(nVar) ? 256 : 128;
            int i27 = 1024;
            if ((i13 & 8) == 0) {
                i14 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i14 |= rVar2.g(i10) ? 2048 : 1024;
            }
            int i28 = 16384;
            if ((i13 & 16) == 0) {
                i14 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i14 |= rVar2.i(nVar2) ? 16384 : 8192;
            }
            i15 = i13 & 32;
            if (i15 == 0) {
                i14 |= 196608;
            } else if ((i11 & 196608) == 0) {
                i14 |= rVar2.i(nVar3) ? 131072 : 65536;
            }
            i16 = i13 & 64;
            int i29 = 524288;
            if (i16 == 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                i14 |= rVar2.i(nVar4) ? 1048576 : 524288;
            }
            i17 = i13 & 128;
            int i30 = 4194304;
            if (i17 == 0) {
                i14 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                i14 |= rVar2.i(nVar5) ? 8388608 : 4194304;
            }
            i18 = i13 & 256;
            if (i18 == 0) {
                i14 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                i14 |= rVar2.i(nVar6) ? 67108864 : 33554432;
            }
            i19 = i13 & 512;
            if (i19 == 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                i14 |= rVar2.i(nVar7) ? 536870912 : 268435456;
            }
            i20 = i13 & 1024;
            if (i20 == 0) {
                i21 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                i21 = i12 | (rVar2.i(nVar8) ? 4 : 2);
            } else {
                i21 = i12;
            }
            i22 = i13 & 2048;
            if (i22 == 0) {
                i21 |= 48;
            } else if ((i12 & 48) == 0) {
                i21 |= rVar2.h(z10) ? 32 : 16;
            }
            i23 = i21;
            i24 = i13 & 4096;
            if (i24 == 0) {
                i23 |= 384;
            } else if ((i12 & 384) == 0) {
                if (!rVar2.h(z11)) {
                    i26 = 128;
                }
                i23 |= i26;
                i25 = i13 & 8192;
                if (i25 != 0) {
                    i23 |= 3072;
                } else if ((i12 & 3072) == 0) {
                    if (rVar2.h(z12)) {
                        i27 = 2048;
                    }
                    i23 |= i27;
                    if ((i13 & 16384) == 0) {
                        i23 |= 24576;
                    } else if ((i12 & 24576) == 0) {
                        if (!rVar2.g(lVar)) {
                            i28 = 8192;
                        }
                        i23 |= i28;
                    }
                    if ((32768 & i13) == 0) {
                        i23 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        i23 |= rVar2.g(g0Var) ? 131072 : 65536;
                        if ((i13 & 65536) != 0) {
                            i23 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (rVar2.g(n32)) {
                                i29 = 1048576;
                            }
                            i23 |= i29;
                        }
                        if ((i13 & 131072) != 0) {
                            i23 |= 12582912;
                        } else if ((i12 & 12582912) == 0) {
                            if (rVar2.i(nVar9)) {
                                i30 = 8388608;
                            }
                            i23 |= i30;
                        }
                        if ((i14 & 306783379) != 306783378 && (4793491 & i23) == 4793490 && rVar2.B()) {
                            rVar2.P();
                            nVar15 = nVar3;
                            nVar14 = nVar4;
                            nVar13 = nVar5;
                            nVar12 = nVar6;
                            nVar11 = nVar7;
                            nVar10 = nVar8;
                            z14 = z11;
                            z13 = z12;
                            rVar = rVar2;
                            z15 = z10;
                        } else {
                            wf.n nVar16 = null;
                            wf.n nVar17 = i15 != 0 ? null : nVar3;
                            wf.n nVar18 = i16 != 0 ? null : nVar4;
                            wf.n nVar19 = i17 != 0 ? null : nVar5;
                            wf.n nVar20 = i18 != 0 ? null : nVar6;
                            wf.n nVar21 = i19 != 0 ? null : nVar7;
                            if (i20 == 0) {
                                nVar16 = nVar8;
                            }
                            boolean z20 = i22 != 0 ? false : z10;
                            boolean z21 = i24 != 0 ? true : z11;
                            boolean z22 = i25 != 0 ? false : z12;
                            rVar2.W(-646389284);
                            z16 = ((i14 & 7168) == 2048) | ((i14 & 112) == 32);
                            K10 = rVar2.K();
                            if (!z16 || K10 == C1723m.f22654Y) {
                                C1046e c1046e = new C1046e(str, null, 6);
                                ((A9.a) i10).getClass();
                                K10 = new T0.G(c1046e, T0.r.f16811a);
                                rVar2.h0(K10);
                            }
                            rVar2.t(false);
                            String str2 = ((T0.G) K10).f16756a.f12512Y;
                            if (((Boolean) r9.y.a0(lVar, rVar2, (i23 >> 12) & 14).getValue()).booleanValue()) {
                                enumC1612s1 = EnumC1612s1.f20402Y;
                            } else {
                                enumC1612s1 = str2.length() == 0 ? EnumC1612s1.f20403Z : EnumC1612s1.f20404h0;
                            }
                            EnumC1612s1 enumC1612s12 = enumC1612s1;
                            J.b bVar = new J.b(lVar, n32, z21, z22);
                            Z.m1 m1Var = q4.f20361a;
                            p4 p4Var = (p4) rVar2.m(m1Var);
                            N0.E e10 = p4Var.f20309j;
                            long c10 = e10.c();
                            long j6 = r0.r.f44263k;
                            boolean c11 = r0.r.c(c10, j6);
                            N0.E e11 = p4Var.f20311l;
                            z17 = (!c11 && !r0.r.c(e11.c(), j6)) || (!r0.r.c(e10.c(), j6) && r0.r.c(e11.c(), j6));
                            e4 e4Var = e4.f20037a;
                            rVar2.W(-646388325);
                            long c12 = ((p4) rVar2.m(m1Var)).f20311l.c();
                            rVar2.W(-646388264);
                            if (z17 || c12 != j6) {
                                z18 = false;
                            } else {
                                z18 = false;
                                c12 = ((r0.r) bVar.invoke(enumC1612s12, rVar2, 0)).f44265a;
                            }
                            long j10 = c12;
                            rVar2.t(z18);
                            rVar2.t(z18);
                            rVar2.W(-646388132);
                            long c13 = ((p4) rVar2.m(m1Var)).f20309j.c();
                            rVar2.W(-646388071);
                            if (z17 || c13 != j6) {
                                z19 = false;
                            } else {
                                z19 = false;
                                c13 = ((r0.r) bVar.invoke(enumC1612s12, rVar2, 0)).f44265a;
                            }
                            long j11 = c13;
                            rVar2.t(z19);
                            rVar2.t(z19);
                            if (nVar2 != null) {
                                z19 = true;
                            }
                            boolean z23 = z21;
                            rVar = rVar2;
                            e4Var.a(enumC1612s12, j10, j11, bVar, z19, R4.b.X(rVar, 1290853831, new V3(nVar2, n32, z21, z22, lVar, nVar17, str2, nVar20, nVar21, nVar18, nVar19, nVar16, f4Var, nVar, z20, g0Var, z17, e10, e11, nVar9)), rVar, 1769472);
                            z14 = z23;
                            nVar10 = nVar16;
                            z13 = z22;
                            nVar14 = nVar18;
                            nVar15 = nVar17;
                            nVar13 = nVar19;
                            nVar12 = nVar20;
                            nVar11 = nVar21;
                            z15 = z20;
                        }
                        v10 = rVar.v();
                        if (v10 == null) {
                            return;
                        }
                        v10.f22739d = new C1604q2(f4Var, str, nVar, i10, nVar2, nVar15, nVar14, nVar13, nVar12, nVar11, nVar10, z15, z14, z13, lVar, g0Var, n32, nVar9, i11, i12, i13);
                        return;
                    }
                    if ((i13 & 65536) != 0) {
                    }
                    if ((i13 & 131072) != 0) {
                    }
                    if ((i14 & 306783379) != 306783378) {
                    }
                    wf.n nVar162 = null;
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    rVar2.W(-646389284);
                    if ((i14 & 112) == 32) {
                    }
                    z16 = ((i14 & 7168) == 2048) | ((i14 & 112) == 32);
                    K10 = rVar2.K();
                    if (!z16) {
                    }
                    C1046e c1046e2 = new C1046e(str, null, 6);
                    ((A9.a) i10).getClass();
                    K10 = new T0.G(c1046e2, T0.r.f16811a);
                    rVar2.h0(K10);
                    rVar2.t(false);
                    String str22 = ((T0.G) K10).f16756a.f12512Y;
                    if (((Boolean) r9.y.a0(lVar, rVar2, (i23 >> 12) & 14).getValue()).booleanValue()) {
                    }
                    EnumC1612s1 enumC1612s122 = enumC1612s1;
                    J.b bVar2 = new J.b(lVar, n32, z21, z22);
                    Z.m1 m1Var2 = q4.f20361a;
                    p4 p4Var2 = (p4) rVar2.m(m1Var2);
                    N0.E e102 = p4Var2.f20309j;
                    long c102 = e102.c();
                    long j62 = r0.r.f44263k;
                    boolean c112 = r0.r.c(c102, j62);
                    N0.E e112 = p4Var2.f20311l;
                    if (!c112) {
                    }
                    e4 e4Var2 = e4.f20037a;
                    rVar2.W(-646388325);
                    long c122 = ((p4) rVar2.m(m1Var2)).f20311l.c();
                    rVar2.W(-646388264);
                    if (z17) {
                    }
                    z18 = false;
                    long j102 = c122;
                    rVar2.t(z18);
                    rVar2.t(z18);
                    rVar2.W(-646388132);
                    long c132 = ((p4) rVar2.m(m1Var2)).f20309j.c();
                    rVar2.W(-646388071);
                    if (z17) {
                    }
                    z19 = false;
                    long j112 = c132;
                    rVar2.t(z19);
                    rVar2.t(z19);
                    if (nVar2 != null) {
                    }
                    boolean z232 = z21;
                    rVar = rVar2;
                    e4Var2.a(enumC1612s122, j102, j112, bVar2, z19, R4.b.X(rVar, 1290853831, new V3(nVar2, n32, z21, z22, lVar, nVar17, str22, nVar20, nVar21, nVar18, nVar19, nVar162, f4Var, nVar, z20, g0Var, z17, e102, e112, nVar9)), rVar, 1769472);
                    z14 = z232;
                    nVar10 = nVar162;
                    z13 = z22;
                    nVar14 = nVar18;
                    nVar15 = nVar17;
                    nVar13 = nVar19;
                    nVar12 = nVar20;
                    nVar11 = nVar21;
                    z15 = z20;
                    v10 = rVar.v();
                    if (v10 == null) {
                    }
                }
                if ((i13 & 16384) == 0) {
                }
                if ((32768 & i13) == 0) {
                }
                if ((i13 & 65536) != 0) {
                }
                if ((i13 & 131072) != 0) {
                }
                if ((i14 & 306783379) != 306783378) {
                }
                wf.n nVar1622 = null;
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 == 0) {
                }
                if (i22 != 0) {
                }
                if (i24 != 0) {
                }
                if (i25 != 0) {
                }
                rVar2.W(-646389284);
                if ((i14 & 112) == 32) {
                }
                z16 = ((i14 & 7168) == 2048) | ((i14 & 112) == 32);
                K10 = rVar2.K();
                if (!z16) {
                }
                C1046e c1046e22 = new C1046e(str, null, 6);
                ((A9.a) i10).getClass();
                K10 = new T0.G(c1046e22, T0.r.f16811a);
                rVar2.h0(K10);
                rVar2.t(false);
                String str222 = ((T0.G) K10).f16756a.f12512Y;
                if (((Boolean) r9.y.a0(lVar, rVar2, (i23 >> 12) & 14).getValue()).booleanValue()) {
                }
                EnumC1612s1 enumC1612s1222 = enumC1612s1;
                J.b bVar22 = new J.b(lVar, n32, z21, z22);
                Z.m1 m1Var22 = q4.f20361a;
                p4 p4Var22 = (p4) rVar2.m(m1Var22);
                N0.E e1022 = p4Var22.f20309j;
                long c1022 = e1022.c();
                long j622 = r0.r.f44263k;
                boolean c1122 = r0.r.c(c1022, j622);
                N0.E e1122 = p4Var22.f20311l;
                if (!c1122) {
                }
                e4 e4Var22 = e4.f20037a;
                rVar2.W(-646388325);
                long c1222 = ((p4) rVar2.m(m1Var22)).f20311l.c();
                rVar2.W(-646388264);
                if (z17) {
                }
                z18 = false;
                long j1022 = c1222;
                rVar2.t(z18);
                rVar2.t(z18);
                rVar2.W(-646388132);
                long c1322 = ((p4) rVar2.m(m1Var22)).f20309j.c();
                rVar2.W(-646388071);
                if (z17) {
                }
                z19 = false;
                long j1122 = c1322;
                rVar2.t(z19);
                rVar2.t(z19);
                if (nVar2 != null) {
                }
                boolean z2322 = z21;
                rVar = rVar2;
                e4Var22.a(enumC1612s1222, j1022, j1122, bVar22, z19, R4.b.X(rVar, 1290853831, new V3(nVar2, n32, z21, z22, lVar, nVar17, str222, nVar20, nVar21, nVar18, nVar19, nVar1622, f4Var, nVar, z20, g0Var, z17, e1022, e1122, nVar9)), rVar, 1769472);
                z14 = z2322;
                nVar10 = nVar1622;
                z13 = z22;
                nVar14 = nVar18;
                nVar15 = nVar17;
                nVar13 = nVar19;
                nVar12 = nVar20;
                nVar11 = nVar21;
                z15 = z20;
                v10 = rVar.v();
                if (v10 == null) {
                }
            }
            i25 = i13 & 8192;
            if (i25 != 0) {
            }
            if ((i13 & 16384) == 0) {
            }
            if ((32768 & i13) == 0) {
            }
            if ((i13 & 65536) != 0) {
            }
            if ((i13 & 131072) != 0) {
            }
            if ((i14 & 306783379) != 306783378) {
            }
            wf.n nVar16222 = null;
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 == 0) {
            }
            if (i22 != 0) {
            }
            if (i24 != 0) {
            }
            if (i25 != 0) {
            }
            rVar2.W(-646389284);
            if ((i14 & 112) == 32) {
            }
            z16 = ((i14 & 7168) == 2048) | ((i14 & 112) == 32);
            K10 = rVar2.K();
            if (!z16) {
            }
            C1046e c1046e222 = new C1046e(str, null, 6);
            ((A9.a) i10).getClass();
            K10 = new T0.G(c1046e222, T0.r.f16811a);
            rVar2.h0(K10);
            rVar2.t(false);
            String str2222 = ((T0.G) K10).f16756a.f12512Y;
            if (((Boolean) r9.y.a0(lVar, rVar2, (i23 >> 12) & 14).getValue()).booleanValue()) {
            }
            EnumC1612s1 enumC1612s12222 = enumC1612s1;
            J.b bVar222 = new J.b(lVar, n32, z21, z22);
            Z.m1 m1Var222 = q4.f20361a;
            p4 p4Var222 = (p4) rVar2.m(m1Var222);
            N0.E e10222 = p4Var222.f20309j;
            long c10222 = e10222.c();
            long j6222 = r0.r.f44263k;
            boolean c11222 = r0.r.c(c10222, j6222);
            N0.E e11222 = p4Var222.f20311l;
            if (!c11222) {
            }
            e4 e4Var222 = e4.f20037a;
            rVar2.W(-646388325);
            long c12222 = ((p4) rVar2.m(m1Var222)).f20311l.c();
            rVar2.W(-646388264);
            if (z17) {
            }
            z18 = false;
            long j10222 = c12222;
            rVar2.t(z18);
            rVar2.t(z18);
            rVar2.W(-646388132);
            long c13222 = ((p4) rVar2.m(m1Var222)).f20309j.c();
            rVar2.W(-646388071);
            if (z17) {
            }
            z19 = false;
            long j11222 = c13222;
            rVar2.t(z19);
            rVar2.t(z19);
            if (nVar2 != null) {
            }
            boolean z23222 = z21;
            rVar = rVar2;
            e4Var222.a(enumC1612s12222, j10222, j11222, bVar222, z19, R4.b.X(rVar, 1290853831, new V3(nVar2, n32, z21, z22, lVar, nVar17, str2222, nVar20, nVar21, nVar18, nVar19, nVar16222, f4Var, nVar, z20, g0Var, z17, e10222, e11222, nVar9)), rVar, 1769472);
            z14 = z23222;
            nVar10 = nVar16222;
            z13 = z22;
            nVar14 = nVar18;
            nVar15 = nVar17;
            nVar13 = nVar19;
            nVar12 = nVar20;
            nVar11 = nVar21;
            z15 = z20;
            v10 = rVar.v();
            if (v10 == null) {
            }
        }
        int i272 = 1024;
        if ((i13 & 8) == 0) {
        }
        int i282 = 16384;
        if ((i13 & 16) == 0) {
        }
        i15 = i13 & 32;
        if (i15 == 0) {
        }
        i16 = i13 & 64;
        int i292 = 524288;
        if (i16 == 0) {
        }
        i17 = i13 & 128;
        int i302 = 4194304;
        if (i17 == 0) {
        }
        i18 = i13 & 256;
        if (i18 == 0) {
        }
        i19 = i13 & 512;
        if (i19 == 0) {
        }
        i20 = i13 & 1024;
        if (i20 == 0) {
        }
        i22 = i13 & 2048;
        if (i22 == 0) {
        }
        i23 = i21;
        i24 = i13 & 4096;
        if (i24 == 0) {
        }
        i25 = i13 & 8192;
        if (i25 != 0) {
        }
        if ((i13 & 16384) == 0) {
        }
        if ((32768 & i13) == 0) {
        }
        if ((i13 & 65536) != 0) {
        }
        if ((i13 & 131072) != 0) {
        }
        if ((i14 & 306783379) != 306783378) {
        }
        wf.n nVar162222 = null;
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 == 0) {
        }
        if (i22 != 0) {
        }
        if (i24 != 0) {
        }
        if (i25 != 0) {
        }
        rVar2.W(-646389284);
        if ((i14 & 112) == 32) {
        }
        z16 = ((i14 & 7168) == 2048) | ((i14 & 112) == 32);
        K10 = rVar2.K();
        if (!z16) {
        }
        C1046e c1046e2222 = new C1046e(str, null, 6);
        ((A9.a) i10).getClass();
        K10 = new T0.G(c1046e2222, T0.r.f16811a);
        rVar2.h0(K10);
        rVar2.t(false);
        String str22222 = ((T0.G) K10).f16756a.f12512Y;
        if (((Boolean) r9.y.a0(lVar, rVar2, (i23 >> 12) & 14).getValue()).booleanValue()) {
        }
        EnumC1612s1 enumC1612s122222 = enumC1612s1;
        J.b bVar2222 = new J.b(lVar, n32, z21, z22);
        Z.m1 m1Var2222 = q4.f20361a;
        p4 p4Var2222 = (p4) rVar2.m(m1Var2222);
        N0.E e102222 = p4Var2222.f20309j;
        long c102222 = e102222.c();
        long j62222 = r0.r.f44263k;
        boolean c112222 = r0.r.c(c102222, j62222);
        N0.E e112222 = p4Var2222.f20311l;
        if (!c112222) {
        }
        e4 e4Var2222 = e4.f20037a;
        rVar2.W(-646388325);
        long c122222 = ((p4) rVar2.m(m1Var2222)).f20311l.c();
        rVar2.W(-646388264);
        if (z17) {
        }
        z18 = false;
        long j102222 = c122222;
        rVar2.t(z18);
        rVar2.t(z18);
        rVar2.W(-646388132);
        long c132222 = ((p4) rVar2.m(m1Var2222)).f20309j.c();
        rVar2.W(-646388071);
        if (z17) {
        }
        z19 = false;
        long j112222 = c132222;
        rVar2.t(z19);
        rVar2.t(z19);
        if (nVar2 != null) {
        }
        boolean z232222 = z21;
        rVar = rVar2;
        e4Var2222.a(enumC1612s122222, j102222, j112222, bVar2222, z19, R4.b.X(rVar, 1290853831, new V3(nVar2, n32, z21, z22, lVar, nVar17, str22222, nVar20, nVar21, nVar18, nVar19, nVar162222, f4Var, nVar, z20, g0Var, z17, e102222, e112222, nVar9)), rVar, 1769472);
        z14 = z232222;
        nVar10 = nVar162222;
        z13 = z22;
        nVar14 = nVar18;
        nVar15 = nVar17;
        nVar13 = nVar19;
        nVar12 = nVar20;
        nVar11 = nVar21;
        z15 = z20;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(long j6, N0.E e10, wf.n nVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        N0.E e11;
        C1741v0 v10;
        N0.E e12;
        int i13;
        int i14;
        int i15;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1520066345);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.f(j6)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            e11 = e10;
            if (rVar.g(e10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i11 & 4) == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                if (rVar.i(nVar)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & 147) != 146 && rVar.B()) {
                rVar.P();
            } else {
                if (i16 == 0) {
                    e12 = null;
                } else {
                    e12 = e11;
                }
                C3288a X10 = R4.b.X(rVar, 1449369305, new S3(j6, nVar, 2));
                if (e12 == null) {
                    rVar.W(1830467586);
                    r9.y.s(j6, e12, nVar, rVar, (i12 & 14) | (i12 & 112) | (i12 & 896));
                    rVar.t(false);
                } else {
                    rVar.W(1830467667);
                    X10.invoke(rVar, 6);
                    rVar.t(false);
                }
                e11 = e12;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new W3(j6, e11, nVar, i10, i11);
                return;
            }
            return;
        }
        e11 = e10;
        if ((i11 & 4) == 0) {
        }
        if ((i12 & 147) != 146) {
        }
        if (i16 == 0) {
        }
        C3288a X102 = R4.b.X(rVar, 1449369305, new S3(j6, nVar, 2));
        if (e12 == null) {
        }
        e11 = e12;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final AbstractC4326r c(AbstractC4326r abstractC4326r, boolean z10, String str) {
        if (z10) {
            return L0.l.a(abstractC4326r, false, new G(str, 4));
        }
        return abstractC4326r;
    }

    public static final Object d(E0.r rVar) {
        AbstractC0463w abstractC0463w;
        Object u10 = rVar.u();
        if (u10 instanceof AbstractC0463w) {
            abstractC0463w = (AbstractC0463w) u10;
        } else {
            abstractC0463w = null;
        }
        if (abstractC0463w == null) {
            return null;
        }
        return ((C0462v) abstractC0463w).f4091s0;
    }

    public static final int e(E0.d0 d0Var) {
        if (d0Var != null) {
            return d0Var.f4054Z;
        }
        return 0;
    }

    public static final int f(E0.d0 d0Var) {
        if (d0Var != null) {
            return d0Var.f4053Y;
        }
        return 0;
    }
}
