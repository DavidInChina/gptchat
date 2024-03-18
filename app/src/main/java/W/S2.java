package W;

import E.C0419e;
import Z.AbstractC1725n;
import Z.AbstractC1748z;
import Z.C1723m;
import Z.C1724m0;
import Z.C1741v0;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public abstract class S2 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1724m0 f19672a = AbstractC4828h.Z(Boolean.TRUE, Z.o1.f22665a);

    /* renamed from: b  reason: collision with root package name */
    public static final Z.m1 f19673b = new AbstractC1748z(Q0.f19570l0);

    /* renamed from: c  reason: collision with root package name */
    public static final float f19674c = 16;

    public static final void a(int i10, wf.n nVar, wf.o oVar, wf.n nVar2, wf.n nVar3, E.A0 a02, wf.n nVar4, AbstractC1725n abstractC1725n, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1307205667);
        if ((i11 & 6) == 0) {
            if (rVar.e(i10)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar.i(nVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i11 & 384) == 0) {
            if (rVar.i(oVar)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i11 & 3072) == 0) {
            if (rVar.i(nVar2)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((i11 & 24576) == 0) {
            if (rVar.i(nVar3)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((196608 & i11) == 0) {
            if (rVar.g(a02)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((1572864 & i11) == 0) {
            if (rVar.i(nVar4)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
        }
        if ((i12 & 599187) == 599186 && rVar.B()) {
            rVar.P();
        } else {
            rVar.W(1646578117);
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z17 = z10 | z11;
            if ((458752 & i12) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z18 = z17 | z12;
            if ((57344 & i12) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = z18 | z13;
            if ((i12 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z20 = z19 | z14;
            if ((3670016 & i12) == 1048576) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z21 = z20 | z15;
            if ((i12 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z22 = z21 | z16;
            Object K10 = rVar.K();
            if (z22 || K10 == C1723m.f22654Y) {
                K10 = new O2(nVar, nVar2, nVar3, i10, a02, nVar4, oVar, 0);
                rVar.h0(K10);
            }
            rVar.t(false);
            E0.k0.b(null, (wf.n) K10, rVar, 0, 1);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new P2(i10, nVar, oVar, nVar2, nVar3, a02, nVar4, i11, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(AbstractC4326r abstractC4326r, wf.n nVar, wf.n nVar2, wf.n nVar3, wf.n nVar4, int i10, long j6, long j10, E.A0 a02, wf.o oVar, AbstractC1725n abstractC1725n, int i11, int i12) {
        int i13;
        Object obj;
        int i14;
        Object obj2;
        int i15;
        Object obj3;
        int i16;
        Object obj4;
        int i17;
        E.A0 a03;
        long j11;
        long j12;
        int i18;
        wf.n nVar5;
        wf.n nVar6;
        wf.n nVar7;
        wf.n nVar8;
        AbstractC4326r abstractC4326r2;
        long j13;
        long j14;
        int i19;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        AbstractC4326r abstractC4326r3;
        C0419e c0419e;
        int i20;
        boolean z10;
        Object K10;
        boolean z11;
        Object K11;
        AbstractC4326r abstractC4326r4;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        int i21;
        long j15;
        long j16;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1219521777);
        int i32 = i12 & 1;
        if (i32 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (rVar.g(abstractC4326r)) {
                i31 = 4;
            } else {
                i31 = 2;
            }
            i13 = i31 | i11;
        } else {
            i13 = i11;
        }
        int i33 = i12 & 2;
        if (i33 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            obj = nVar;
            if (rVar.i(obj)) {
                i30 = 32;
            } else {
                i30 = 16;
            }
            i13 |= i30;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                obj2 = nVar2;
                if (rVar.i(obj2)) {
                    i29 = 256;
                } else {
                    i29 = 128;
                }
                i13 |= i29;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    obj3 = nVar3;
                    if (rVar.i(obj3)) {
                        i28 = 2048;
                    } else {
                        i28 = 1024;
                    }
                    i13 |= i28;
                    i16 = i12 & 16;
                    if (i16 == 0) {
                        i13 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        obj4 = nVar4;
                        if (rVar.i(obj4)) {
                            i27 = 16384;
                        } else {
                            i27 = 8192;
                        }
                        i13 |= i27;
                        i17 = i12 & 32;
                        if (i17 != 0) {
                            i13 |= 196608;
                        } else if ((i11 & 196608) == 0) {
                            if (rVar.e(i10)) {
                                i26 = 131072;
                            } else {
                                i26 = 65536;
                            }
                            i13 |= i26;
                        }
                        if ((i11 & 1572864) == 0) {
                            if ((i12 & 64) == 0 && rVar.f(j6)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i13 |= i25;
                        }
                        if ((i11 & 12582912) == 0) {
                            if ((i12 & 128) == 0 && rVar.f(j10)) {
                                i24 = 8388608;
                                i13 |= i24;
                            }
                            i24 = 4194304;
                            i13 |= i24;
                        }
                        if ((i11 & 100663296) == 0) {
                            if ((i12 & 256) == 0 && rVar.g(a02)) {
                                i23 = 67108864;
                                i13 |= i23;
                            }
                            i23 = 33554432;
                            i13 |= i23;
                        }
                        if ((i12 & 512) != 0) {
                            i13 |= 805306368;
                        } else if ((i11 & 805306368) == 0) {
                            if (rVar.i(oVar)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                            if ((i13 & 306783379) != 306783378 && rVar.B()) {
                                rVar.P();
                                abstractC4326r2 = abstractC4326r;
                                i18 = i10;
                                nVar8 = obj;
                                nVar7 = obj2;
                                nVar6 = obj3;
                                nVar5 = obj4;
                                j12 = j6;
                                j11 = j10;
                                a03 = a02;
                            } else {
                                rVar.R();
                                if ((i11 & 1) == 0 && !rVar.A()) {
                                    rVar.P();
                                    if ((i12 & 64) != 0) {
                                        i13 &= -3670017;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i13 &= -29360129;
                                    }
                                    if ((i12 & 256) != 0) {
                                        i13 &= -234881025;
                                    }
                                    abstractC4326r3 = abstractC4326r;
                                    i19 = i10;
                                    j14 = j6;
                                    j13 = j10;
                                    obj8 = obj;
                                    obj7 = obj2;
                                    obj6 = obj3;
                                    obj5 = obj4;
                                } else {
                                    if (i32 == 0) {
                                        abstractC4326r4 = C4323o.f37719b;
                                    } else {
                                        abstractC4326r4 = abstractC4326r;
                                    }
                                    if (i33 == 0) {
                                        obj9 = W0.f19794a;
                                    } else {
                                        obj9 = obj;
                                    }
                                    if (i14 == 0) {
                                        obj10 = W0.f19795b;
                                    } else {
                                        obj10 = obj2;
                                    }
                                    if (i15 == 0) {
                                        obj11 = W0.f19796c;
                                    } else {
                                        obj11 = obj3;
                                    }
                                    if (i16 == 0) {
                                        obj12 = W0.f19797d;
                                    } else {
                                        obj12 = obj4;
                                    }
                                    if (i17 == 0) {
                                        i21 = 2;
                                    } else {
                                        i21 = i10;
                                    }
                                    if ((i12 & 64) == 0) {
                                        j15 = ((P0) rVar.m(R0.f19593a)).f19530n;
                                        i13 &= -3670017;
                                    } else {
                                        j15 = j6;
                                    }
                                    if ((i12 & 128) == 0) {
                                        j16 = R0.b(j15, rVar);
                                        i13 &= -29360129;
                                    } else {
                                        j16 = j10;
                                    }
                                    if ((i12 & 256) == 0) {
                                        rVar.W(757124140);
                                        C0419e U10 = Df.H.U(rVar);
                                        rVar.t(false);
                                        i13 &= -234881025;
                                        obj8 = obj9;
                                        obj7 = obj10;
                                        obj6 = obj11;
                                        obj5 = obj12;
                                        i19 = i21;
                                        j14 = j15;
                                        j13 = j16;
                                        c0419e = U10;
                                        abstractC4326r3 = abstractC4326r4;
                                        rVar.u();
                                        rVar.W(-889185358);
                                        i20 = (234881024 & i13) ^ 100663296;
                                        boolean z12 = true;
                                        if ((i20 <= 67108864 && rVar.g(c0419e)) || (i13 & 100663296) == 67108864) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        K10 = rVar.K();
                                        Object obj13 = C1723m.f22654Y;
                                        if (!z10 || K10 == obj13) {
                                            K10 = new C1594o2(c0419e);
                                            rVar.h0(K10);
                                        }
                                        C1594o2 c1594o2 = (C1594o2) K10;
                                        rVar.t(false);
                                        rVar.W(-889185200);
                                        boolean g10 = rVar.g(c1594o2);
                                        if ((i20 > 67108864 || !rVar.g(c0419e)) && (i13 & 100663296) != 67108864) {
                                            z12 = false;
                                        }
                                        z11 = g10 | z12;
                                        K11 = rVar.K();
                                        if (!z11 || K11 == obj13) {
                                            K11 = new C1559h2(c1594o2, 2, c0419e);
                                            rVar.h0(K11);
                                        }
                                        rVar.t(false);
                                        F0.i iVar = E.D0.f3761a;
                                        int i34 = i13 >> 12;
                                        G3.a(U3.f.o(abstractC4326r3, new androidx.compose.foundation.layout.f(0, (wf.k) K11)), null, j14, j13, 0.0f, 0.0f, null, R4.b.X(rVar, -1979205334, new y.K(i19, obj8, oVar, obj6, obj5, c1594o2, obj7)), rVar, (i34 & 896) | 12582912 | (i34 & 7168), 114);
                                        abstractC4326r2 = abstractC4326r3;
                                        a03 = c0419e;
                                        nVar8 = obj8;
                                        nVar7 = obj7;
                                        nVar6 = obj6;
                                        nVar5 = obj5;
                                        i18 = i19;
                                        j12 = j14;
                                        j11 = j13;
                                    } else {
                                        abstractC4326r3 = abstractC4326r4;
                                        obj8 = obj9;
                                        obj7 = obj10;
                                        obj6 = obj11;
                                        obj5 = obj12;
                                        i19 = i21;
                                        j14 = j15;
                                        j13 = j16;
                                    }
                                }
                                c0419e = a02;
                                rVar.u();
                                rVar.W(-889185358);
                                i20 = (234881024 & i13) ^ 100663296;
                                boolean z122 = true;
                                if (i20 <= 67108864) {
                                }
                                z10 = false;
                                K10 = rVar.K();
                                Object obj132 = C1723m.f22654Y;
                                if (!z10) {
                                }
                                K10 = new C1594o2(c0419e);
                                rVar.h0(K10);
                                C1594o2 c1594o22 = (C1594o2) K10;
                                rVar.t(false);
                                rVar.W(-889185200);
                                boolean g102 = rVar.g(c1594o22);
                                if (i20 > 67108864) {
                                }
                                z122 = false;
                                z11 = g102 | z122;
                                K11 = rVar.K();
                                if (!z11) {
                                }
                                K11 = new C1559h2(c1594o22, 2, c0419e);
                                rVar.h0(K11);
                                rVar.t(false);
                                F0.i iVar2 = E.D0.f3761a;
                                int i342 = i13 >> 12;
                                G3.a(U3.f.o(abstractC4326r3, new androidx.compose.foundation.layout.f(0, (wf.k) K11)), null, j14, j13, 0.0f, 0.0f, null, R4.b.X(rVar, -1979205334, new y.K(i19, obj8, oVar, obj6, obj5, c1594o22, obj7)), rVar, (i342 & 896) | 12582912 | (i342 & 7168), 114);
                                abstractC4326r2 = abstractC4326r3;
                                a03 = c0419e;
                                nVar8 = obj8;
                                nVar7 = obj7;
                                nVar6 = obj6;
                                nVar5 = obj5;
                                i18 = i19;
                                j12 = j14;
                                j11 = j13;
                            }
                            C1741v0 v10 = rVar.v();
                            if (v10 != null) {
                                v10.f22739d = new Q2(abstractC4326r2, nVar8, nVar7, nVar6, nVar5, i18, j12, j11, a03, oVar, i11, i12);
                                return;
                            }
                            return;
                        }
                        if ((i13 & 306783379) != 306783378) {
                        }
                        rVar.R();
                        if ((i11 & 1) == 0) {
                        }
                        if (i32 == 0) {
                        }
                        if (i33 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if ((i12 & 64) == 0) {
                        }
                        if ((i12 & 128) == 0) {
                        }
                        if ((i12 & 256) == 0) {
                        }
                    }
                    obj4 = nVar4;
                    i17 = i12 & 32;
                    if (i17 != 0) {
                    }
                    if ((i11 & 1572864) == 0) {
                    }
                    if ((i11 & 12582912) == 0) {
                    }
                    if ((i11 & 100663296) == 0) {
                    }
                    if ((i12 & 512) != 0) {
                    }
                    if ((i13 & 306783379) != 306783378) {
                    }
                    rVar.R();
                    if ((i11 & 1) == 0) {
                    }
                    if (i32 == 0) {
                    }
                    if (i33 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if ((i12 & 64) == 0) {
                    }
                    if ((i12 & 128) == 0) {
                    }
                    if ((i12 & 256) == 0) {
                    }
                }
                obj3 = nVar3;
                i16 = i12 & 16;
                if (i16 == 0) {
                }
                obj4 = nVar4;
                i17 = i12 & 32;
                if (i17 != 0) {
                }
                if ((i11 & 1572864) == 0) {
                }
                if ((i11 & 12582912) == 0) {
                }
                if ((i11 & 100663296) == 0) {
                }
                if ((i12 & 512) != 0) {
                }
                if ((i13 & 306783379) != 306783378) {
                }
                rVar.R();
                if ((i11 & 1) == 0) {
                }
                if (i32 == 0) {
                }
                if (i33 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if ((i12 & 64) == 0) {
                }
                if ((i12 & 128) == 0) {
                }
                if ((i12 & 256) == 0) {
                }
            }
            obj2 = nVar2;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            obj3 = nVar3;
            i16 = i12 & 16;
            if (i16 == 0) {
            }
            obj4 = nVar4;
            i17 = i12 & 32;
            if (i17 != 0) {
            }
            if ((i11 & 1572864) == 0) {
            }
            if ((i11 & 12582912) == 0) {
            }
            if ((i11 & 100663296) == 0) {
            }
            if ((i12 & 512) != 0) {
            }
            if ((i13 & 306783379) != 306783378) {
            }
            rVar.R();
            if ((i11 & 1) == 0) {
            }
            if (i32 == 0) {
            }
            if (i33 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if ((i12 & 64) == 0) {
            }
            if ((i12 & 128) == 0) {
            }
            if ((i12 & 256) == 0) {
            }
        }
        obj = nVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        obj2 = nVar2;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        obj3 = nVar3;
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        obj4 = nVar4;
        i17 = i12 & 32;
        if (i17 != 0) {
        }
        if ((i11 & 1572864) == 0) {
        }
        if ((i11 & 12582912) == 0) {
        }
        if ((i11 & 100663296) == 0) {
        }
        if ((i12 & 512) != 0) {
        }
        if ((i13 & 306783379) != 306783378) {
        }
        rVar.R();
        if ((i11 & 1) == 0) {
        }
        if (i32 == 0) {
        }
        if (i33 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if ((i12 & 64) == 0) {
        }
        if ((i12 & 128) == 0) {
        }
        if ((i12 & 256) == 0) {
        }
    }

    public static final void c(int i10, wf.n nVar, wf.o oVar, wf.n nVar2, wf.n nVar3, E.A0 a02, wf.n nVar4, AbstractC1725n abstractC1725n, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-2037614249);
        if ((i11 & 6) == 0) {
            if (rVar.e(i10)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar.i(nVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i11 & 384) == 0) {
            if (rVar.i(oVar)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i11 & 3072) == 0) {
            if (rVar.i(nVar2)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((i11 & 24576) == 0) {
            if (rVar.i(nVar3)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((196608 & i11) == 0) {
            if (rVar.g(a02)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((1572864 & i11) == 0) {
            if (rVar.i(nVar4)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
        }
        if ((i12 & 599187) == 599186 && rVar.B()) {
            rVar.P();
        } else {
            rVar.W(-273325894);
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z17 = z10 | z11;
            if ((458752 & i12) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z18 = z17 | z12;
            if ((57344 & i12) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = z18 | z13;
            if ((i12 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z20 = z19 | z14;
            if ((3670016 & i12) == 1048576) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z21 = z20 | z15;
            if ((i12 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z22 = z21 | z16;
            Object K10 = rVar.K();
            if (z22 || K10 == C1723m.f22654Y) {
                K10 = new O2(nVar, nVar2, nVar3, i10, a02, nVar4, oVar, 1);
                rVar.h0(K10);
            }
            rVar.t(false);
            E0.k0.b(null, (wf.n) K10, rVar, 0, 1);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new P2(i10, nVar, oVar, nVar2, nVar3, a02, nVar4, i11, 2);
        }
    }

    public static final void d(int i10, wf.n nVar, wf.o oVar, wf.n nVar2, wf.n nVar3, E.A0 a02, wf.n nVar4, AbstractC1725n abstractC1725n, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-975511942);
        if ((i11 & 6) == 0) {
            if (rVar.e(i10)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar.i(nVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i11 & 384) == 0) {
            if (rVar.i(oVar)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i11 & 3072) == 0) {
            if (rVar.i(nVar2)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((i11 & 24576) == 0) {
            if (rVar.i(nVar3)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((196608 & i11) == 0) {
            if (rVar.g(a02)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((1572864 & i11) == 0) {
            if (rVar.i(nVar4)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
        }
        if ((599187 & i12) == 599186 && rVar.B()) {
            rVar.P();
        } else if (((Boolean) f19672a.getValue()).booleanValue()) {
            rVar.W(-915303637);
            c(i10, nVar, oVar, nVar2, nVar3, a02, nVar4, rVar, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016));
            rVar.t(false);
        } else {
            rVar.W(-915303332);
            a(i10, nVar, oVar, nVar2, nVar3, a02, nVar4, rVar, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016));
            rVar.t(false);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new P2(i10, nVar, oVar, nVar2, nVar3, a02, nVar4, i11, 1);
        }
    }
}
