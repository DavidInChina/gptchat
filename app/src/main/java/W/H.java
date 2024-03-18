package W;

import X.AbstractC1674h;
import Z.AbstractC1725n;
import Z.C1741v0;
import d1.C2580o;
import l0.AbstractC4326r;
import l0.C4323o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a  reason: collision with root package name */
    public static final float f19173a = 8;

    /* renamed from: b  reason: collision with root package name */
    public static final float f19174b = 12;

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC6216a abstractC6216a, wf.n nVar, AbstractC4326r abstractC4326r, wf.n nVar2, wf.n nVar3, wf.n nVar4, wf.n nVar5, r0.L l10, long j6, long j10, long j11, long j12, float f6, C2580o c2580o, AbstractC1725n abstractC1725n, int i10, int i11, int i12) {
        int i13;
        int i14;
        C4323o c4323o;
        int i15;
        int i16;
        int i17;
        wf.n nVar6;
        int i18;
        wf.n nVar7;
        r0.L l11;
        int i19;
        int i20;
        int i21;
        long j13;
        long j14;
        C2580o c2580o2;
        float f10;
        long j15;
        long j16;
        r0.L l12;
        wf.n nVar8;
        wf.n nVar9;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        long j17;
        long j18;
        wf.n nVar10;
        wf.n nVar11;
        r0.L l13;
        wf.n nVar12;
        C2580o c2580o3;
        float f11;
        int i22;
        int i23;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-2081346864);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (rVar.i(abstractC6216a) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= rVar.i(nVar) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i10 & 384) == 0) {
                c4323o = abstractC4326r;
                i13 |= rVar.g(c4323o) ? 256 : 128;
                i15 = i12 & 8;
                int i24 = 2048;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    i13 |= rVar.i(nVar2) ? 2048 : 1024;
                    i16 = i12 & 16;
                    if (i16 == 0) {
                        i13 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        i13 |= rVar.i(nVar3) ? 16384 : 8192;
                        i17 = i12 & 32;
                        if (i17 != 0) {
                            i13 |= 196608;
                            nVar6 = nVar4;
                        } else {
                            nVar6 = nVar4;
                            if ((i10 & 196608) == 0) {
                                i13 |= rVar.i(nVar6) ? 131072 : 65536;
                            }
                        }
                        i18 = i12 & 64;
                        if (i18 != 0) {
                            i13 |= 1572864;
                            nVar7 = nVar5;
                        } else {
                            nVar7 = nVar5;
                            if ((i10 & 1572864) == 0) {
                                i13 |= rVar.i(nVar7) ? 1048576 : 524288;
                            }
                        }
                        if ((i10 & 12582912) == 0) {
                            if ((i12 & 128) == 0) {
                                l11 = l10;
                                if (rVar.g(l11)) {
                                    i23 = 8388608;
                                    i13 |= i23;
                                }
                            } else {
                                l11 = l10;
                            }
                            i23 = 4194304;
                            i13 |= i23;
                        } else {
                            l11 = l10;
                        }
                        if ((i10 & 100663296) == 0) {
                            i13 |= ((i12 & 256) != 0 || !rVar.f(j6)) ? 33554432 : 67108864;
                        }
                        if ((805306368 & i10) == 0) {
                            i13 |= ((i12 & 512) != 0 || !rVar.f(j10)) ? 268435456 : 536870912;
                        }
                        if ((i11 & 6) == 0) {
                            i19 = i11 | (((i12 & 1024) != 0 || !rVar.f(j11)) ? 2 : 4);
                        } else {
                            i19 = i11;
                        }
                        if ((i11 & 48) == 0) {
                            if ((i12 & 2048) == 0 && rVar.f(j12)) {
                                i22 = 32;
                                i19 |= i22;
                            }
                            i22 = 16;
                            i19 |= i22;
                        }
                        i20 = i12 & 4096;
                        if (i20 != 0) {
                            i19 |= 384;
                        } else if ((i11 & 384) == 0) {
                            i19 |= rVar.d(f6) ? 256 : 128;
                            i21 = i12 & 8192;
                            if (i21 == 0) {
                                i19 |= 3072;
                            } else if ((i11 & 3072) == 0) {
                                if (!rVar.g(c2580o)) {
                                    i24 = 1024;
                                }
                                i19 |= i24;
                                if ((i13 & 306783379) != 306783378 && (i19 & 1171) == 1170 && rVar.B()) {
                                    rVar.P();
                                    nVar9 = nVar2;
                                    nVar8 = nVar3;
                                    j14 = j11;
                                    j13 = j12;
                                    f10 = f6;
                                    c2580o2 = c2580o;
                                    l12 = l11;
                                    abstractC4326r2 = c4323o;
                                    j16 = j6;
                                    j15 = j10;
                                } else {
                                    rVar.R();
                                    if ((i10 & 1) == 0 && !rVar.A()) {
                                        rVar.P();
                                        if ((i12 & 128) != 0) {
                                            i13 &= -29360129;
                                        }
                                        if ((i12 & 256) != 0) {
                                            i13 &= -234881025;
                                        }
                                        if ((i12 & 512) != 0) {
                                            i13 &= -1879048193;
                                        }
                                        if ((i12 & 1024) != 0) {
                                            i19 &= -15;
                                        }
                                        if ((i12 & 2048) != 0) {
                                            i19 &= -113;
                                        }
                                        nVar11 = nVar2;
                                        nVar10 = nVar3;
                                        j18 = j6;
                                        j17 = j10;
                                        j14 = j11;
                                        j13 = j12;
                                        f11 = f6;
                                        c2580o3 = c2580o;
                                        nVar12 = nVar7;
                                        l13 = l11;
                                    } else {
                                        if (i14 != 0) {
                                            c4323o = C4323o.f37719b;
                                        }
                                        nVar12 = null;
                                        nVar11 = i15 != 0 ? null : nVar2;
                                        nVar10 = i16 != 0 ? null : nVar3;
                                        if (i17 != 0) {
                                            nVar6 = null;
                                        }
                                        if (i18 == 0) {
                                            nVar12 = nVar7;
                                        }
                                        if ((i12 & 128) != 0) {
                                            l13 = AbstractC1521a.a(rVar);
                                            i13 &= -29360129;
                                        } else {
                                            l13 = l11;
                                        }
                                        if ((i12 & 256) != 0) {
                                            float f12 = AbstractC1521a.f19884a;
                                            rVar.W(-285850401);
                                            float f13 = AbstractC1674h.f21564a;
                                            j18 = R0.e(35, rVar);
                                            rVar.t(false);
                                            i13 &= -234881025;
                                        } else {
                                            j18 = j6;
                                        }
                                        if ((i12 & 512) != 0) {
                                            float f14 = AbstractC1521a.f19884a;
                                            rVar.W(1074292351);
                                            j17 = R0.e(AbstractC1674h.f21570g, rVar);
                                            rVar.t(false);
                                            i13 &= -1879048193;
                                        } else {
                                            j17 = j10;
                                        }
                                        if ((i12 & 1024) != 0) {
                                            j14 = AbstractC1521a.c(rVar);
                                            i19 &= -15;
                                        } else {
                                            j14 = j11;
                                        }
                                        if ((i12 & 2048) != 0) {
                                            j13 = AbstractC1521a.b(rVar);
                                            i19 &= -113;
                                        } else {
                                            j13 = j12;
                                        }
                                        f11 = i20 != 0 ? AbstractC1521a.f19884a : f6;
                                        c2580o3 = i21 != 0 ? new C2580o() : c2580o;
                                    }
                                    rVar.u();
                                    b(abstractC6216a, c4323o, c2580o3, R4.b.X(rVar, 461081686, new E(nVar10, nVar6, nVar12, l13, j18, f11, j17, j14, j13, nVar11, nVar)), rVar, ((i13 >> 3) & 112) | (i13 & 14) | 3072 | ((i19 >> 3) & 896), 0);
                                    nVar9 = nVar11;
                                    nVar8 = nVar10;
                                    j16 = j18;
                                    f10 = f11;
                                    c2580o2 = c2580o3;
                                    l12 = l13;
                                    nVar7 = nVar12;
                                    abstractC4326r2 = c4323o;
                                    j15 = j17;
                                }
                                v10 = rVar.v();
                                if (v10 == null) {
                                    return;
                                }
                                v10.f22739d = new F(abstractC6216a, nVar, abstractC4326r2, nVar9, nVar8, nVar6, nVar7, l12, j16, j15, j14, j13, f10, c2580o2, i10, i11, i12);
                                return;
                            }
                            if ((i13 & 306783379) != 306783378) {
                            }
                            rVar.R();
                            if ((i10 & 1) == 0) {
                            }
                            if (i14 != 0) {
                            }
                            nVar12 = null;
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 == 0) {
                            }
                            if ((i12 & 128) != 0) {
                            }
                            if ((i12 & 256) != 0) {
                            }
                            if ((i12 & 512) != 0) {
                            }
                            if ((i12 & 1024) != 0) {
                            }
                            if ((i12 & 2048) != 0) {
                            }
                            if (i20 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            rVar.u();
                            b(abstractC6216a, c4323o, c2580o3, R4.b.X(rVar, 461081686, new E(nVar10, nVar6, nVar12, l13, j18, f11, j17, j14, j13, nVar11, nVar)), rVar, ((i13 >> 3) & 112) | (i13 & 14) | 3072 | ((i19 >> 3) & 896), 0);
                            nVar9 = nVar11;
                            nVar8 = nVar10;
                            j16 = j18;
                            f10 = f11;
                            c2580o2 = c2580o3;
                            l12 = l13;
                            nVar7 = nVar12;
                            abstractC4326r2 = c4323o;
                            j15 = j17;
                            v10 = rVar.v();
                            if (v10 == null) {
                            }
                        }
                        i21 = i12 & 8192;
                        if (i21 == 0) {
                        }
                        if ((i13 & 306783379) != 306783378) {
                        }
                        rVar.R();
                        if ((i10 & 1) == 0) {
                        }
                        if (i14 != 0) {
                        }
                        nVar12 = null;
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 == 0) {
                        }
                        if ((i12 & 128) != 0) {
                        }
                        if ((i12 & 256) != 0) {
                        }
                        if ((i12 & 512) != 0) {
                        }
                        if ((i12 & 1024) != 0) {
                        }
                        if ((i12 & 2048) != 0) {
                        }
                        if (i20 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        rVar.u();
                        b(abstractC6216a, c4323o, c2580o3, R4.b.X(rVar, 461081686, new E(nVar10, nVar6, nVar12, l13, j18, f11, j17, j14, j13, nVar11, nVar)), rVar, ((i13 >> 3) & 112) | (i13 & 14) | 3072 | ((i19 >> 3) & 896), 0);
                        nVar9 = nVar11;
                        nVar8 = nVar10;
                        j16 = j18;
                        f10 = f11;
                        c2580o2 = c2580o3;
                        l12 = l13;
                        nVar7 = nVar12;
                        abstractC4326r2 = c4323o;
                        j15 = j17;
                        v10 = rVar.v();
                        if (v10 == null) {
                        }
                    }
                    i17 = i12 & 32;
                    if (i17 != 0) {
                    }
                    i18 = i12 & 64;
                    if (i18 != 0) {
                    }
                    if ((i10 & 12582912) == 0) {
                    }
                    if ((i10 & 100663296) == 0) {
                    }
                    if ((805306368 & i10) == 0) {
                    }
                    if ((i11 & 6) == 0) {
                    }
                    if ((i11 & 48) == 0) {
                    }
                    i20 = i12 & 4096;
                    if (i20 != 0) {
                    }
                    i21 = i12 & 8192;
                    if (i21 == 0) {
                    }
                    if ((i13 & 306783379) != 306783378) {
                    }
                    rVar.R();
                    if ((i10 & 1) == 0) {
                    }
                    if (i14 != 0) {
                    }
                    nVar12 = null;
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 == 0) {
                    }
                    if ((i12 & 128) != 0) {
                    }
                    if ((i12 & 256) != 0) {
                    }
                    if ((i12 & 512) != 0) {
                    }
                    if ((i12 & 1024) != 0) {
                    }
                    if ((i12 & 2048) != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    rVar.u();
                    b(abstractC6216a, c4323o, c2580o3, R4.b.X(rVar, 461081686, new E(nVar10, nVar6, nVar12, l13, j18, f11, j17, j14, j13, nVar11, nVar)), rVar, ((i13 >> 3) & 112) | (i13 & 14) | 3072 | ((i19 >> 3) & 896), 0);
                    nVar9 = nVar11;
                    nVar8 = nVar10;
                    j16 = j18;
                    f10 = f11;
                    c2580o2 = c2580o3;
                    l12 = l13;
                    nVar7 = nVar12;
                    abstractC4326r2 = c4323o;
                    j15 = j17;
                    v10 = rVar.v();
                    if (v10 == null) {
                    }
                }
                i16 = i12 & 16;
                if (i16 == 0) {
                }
                i17 = i12 & 32;
                if (i17 != 0) {
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                }
                if ((i10 & 12582912) == 0) {
                }
                if ((i10 & 100663296) == 0) {
                }
                if ((805306368 & i10) == 0) {
                }
                if ((i11 & 6) == 0) {
                }
                if ((i11 & 48) == 0) {
                }
                i20 = i12 & 4096;
                if (i20 != 0) {
                }
                i21 = i12 & 8192;
                if (i21 == 0) {
                }
                if ((i13 & 306783379) != 306783378) {
                }
                rVar.R();
                if ((i10 & 1) == 0) {
                }
                if (i14 != 0) {
                }
                nVar12 = null;
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 == 0) {
                }
                if ((i12 & 128) != 0) {
                }
                if ((i12 & 256) != 0) {
                }
                if ((i12 & 512) != 0) {
                }
                if ((i12 & 1024) != 0) {
                }
                if ((i12 & 2048) != 0) {
                }
                if (i20 != 0) {
                }
                if (i21 != 0) {
                }
                rVar.u();
                b(abstractC6216a, c4323o, c2580o3, R4.b.X(rVar, 461081686, new E(nVar10, nVar6, nVar12, l13, j18, f11, j17, j14, j13, nVar11, nVar)), rVar, ((i13 >> 3) & 112) | (i13 & 14) | 3072 | ((i19 >> 3) & 896), 0);
                nVar9 = nVar11;
                nVar8 = nVar10;
                j16 = j18;
                f10 = f11;
                c2580o2 = c2580o3;
                l12 = l13;
                nVar7 = nVar12;
                abstractC4326r2 = c4323o;
                j15 = j17;
                v10 = rVar.v();
                if (v10 == null) {
                }
            }
            c4323o = abstractC4326r;
            i15 = i12 & 8;
            int i242 = 2048;
            if (i15 != 0) {
            }
            i16 = i12 & 16;
            if (i16 == 0) {
            }
            i17 = i12 & 32;
            if (i17 != 0) {
            }
            i18 = i12 & 64;
            if (i18 != 0) {
            }
            if ((i10 & 12582912) == 0) {
            }
            if ((i10 & 100663296) == 0) {
            }
            if ((805306368 & i10) == 0) {
            }
            if ((i11 & 6) == 0) {
            }
            if ((i11 & 48) == 0) {
            }
            i20 = i12 & 4096;
            if (i20 != 0) {
            }
            i21 = i12 & 8192;
            if (i21 == 0) {
            }
            if ((i13 & 306783379) != 306783378) {
            }
            rVar.R();
            if ((i10 & 1) == 0) {
            }
            if (i14 != 0) {
            }
            nVar12 = null;
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 == 0) {
            }
            if ((i12 & 128) != 0) {
            }
            if ((i12 & 256) != 0) {
            }
            if ((i12 & 512) != 0) {
            }
            if ((i12 & 1024) != 0) {
            }
            if ((i12 & 2048) != 0) {
            }
            if (i20 != 0) {
            }
            if (i21 != 0) {
            }
            rVar.u();
            b(abstractC6216a, c4323o, c2580o3, R4.b.X(rVar, 461081686, new E(nVar10, nVar6, nVar12, l13, j18, f11, j17, j14, j13, nVar11, nVar)), rVar, ((i13 >> 3) & 112) | (i13 & 14) | 3072 | ((i19 >> 3) & 896), 0);
            nVar9 = nVar11;
            nVar8 = nVar10;
            j16 = j18;
            f10 = f11;
            c2580o2 = c2580o3;
            l12 = l13;
            nVar7 = nVar12;
            abstractC4326r2 = c4323o;
            j15 = j17;
            v10 = rVar.v();
            if (v10 == null) {
            }
        }
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        c4323o = abstractC4326r;
        i15 = i12 & 8;
        int i2422 = 2048;
        if (i15 != 0) {
        }
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        i17 = i12 & 32;
        if (i17 != 0) {
        }
        i18 = i12 & 64;
        if (i18 != 0) {
        }
        if ((i10 & 12582912) == 0) {
        }
        if ((i10 & 100663296) == 0) {
        }
        if ((805306368 & i10) == 0) {
        }
        if ((i11 & 6) == 0) {
        }
        if ((i11 & 48) == 0) {
        }
        i20 = i12 & 4096;
        if (i20 != 0) {
        }
        i21 = i12 & 8192;
        if (i21 == 0) {
        }
        if ((i13 & 306783379) != 306783378) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i14 != 0) {
        }
        nVar12 = null;
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 == 0) {
        }
        if ((i12 & 128) != 0) {
        }
        if ((i12 & 256) != 0) {
        }
        if ((i12 & 512) != 0) {
        }
        if ((i12 & 1024) != 0) {
        }
        if ((i12 & 2048) != 0) {
        }
        if (i20 != 0) {
        }
        if (i21 != 0) {
        }
        rVar.u();
        b(abstractC6216a, c4323o, c2580o3, R4.b.X(rVar, 461081686, new E(nVar10, nVar6, nVar12, l13, j18, f11, j17, j14, j13, nVar11, nVar)), rVar, ((i13 >> 3) & 112) | (i13 & 14) | 3072 | ((i19 >> 3) & 896), 0);
        nVar9 = nVar11;
        nVar8 = nVar10;
        j16 = j18;
        f10 = f11;
        c2580o2 = c2580o3;
        l12 = l13;
        nVar7 = nVar12;
        abstractC4326r2 = c4323o;
        j15 = j17;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, C2580o c2580o, wf.n nVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        C2580o c2580o2;
        C2580o c2580o3;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        C2580o c2580o4;
        int i14;
        int i15;
        int i16;
        int i17;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-543157267);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.i(abstractC6216a)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                c2580o2 = c2580o;
                if (rVar.g(c2580o)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (rVar.i(nVar)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i12 & 1171) != 1170 && rVar.B()) {
                    rVar.P();
                    abstractC4326r3 = abstractC4326r2;
                    c2580o3 = c2580o2;
                } else {
                    if (i18 != 0) {
                        abstractC4326r4 = C4323o.f37719b;
                    } else {
                        abstractC4326r4 = abstractC4326r2;
                    }
                    if (i13 != 0) {
                        c2580o4 = new C2580o();
                    } else {
                        c2580o4 = c2580o2;
                    }
                    r9.y.e(abstractC6216a, c2580o4, R4.b.X(rVar, -777289724, new C1581m(abstractC4326r4, 1, nVar)), rVar, (i12 & 14) | 384 | ((i12 >> 3) & 112), 0);
                    abstractC4326r3 = abstractC4326r4;
                    c2580o3 = c2580o4;
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new G.I(abstractC6216a, abstractC4326r3, c2580o3, nVar, i10, i11, 3);
                    return;
                }
                return;
            }
            c2580o2 = c2580o;
            if ((i11 & 8) != 0) {
            }
            if ((i12 & 1171) != 1170) {
            }
            if (i18 != 0) {
            }
            if (i13 != 0) {
            }
            r9.y.e(abstractC6216a, c2580o4, R4.b.X(rVar, -777289724, new C1581m(abstractC4326r4, 1, nVar)), rVar, (i12 & 14) | 384 | ((i12 >> 3) & 112), 0);
            abstractC4326r3 = abstractC4326r4;
            c2580o3 = c2580o4;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        c2580o2 = c2580o;
        if ((i11 & 8) != 0) {
        }
        if ((i12 & 1171) != 1170) {
        }
        if (i18 != 0) {
        }
        if (i13 != 0) {
        }
        r9.y.e(abstractC6216a, c2580o4, R4.b.X(rVar, -777289724, new C1581m(abstractC4326r4, 1, nVar)), rVar, (i12 & 14) | 384 | ((i12 >> 3) & 112), 0);
        abstractC4326r3 = abstractC4326r4;
        c2580o3 = c2580o4;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }
}
