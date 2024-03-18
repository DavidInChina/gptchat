package W;

import A.AbstractC0044t0;
import A.C0051x;
import X.AbstractC1667a;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1737t0;
import Z.C1741v0;
import h0.C3288a;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4828h;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import z.AbstractC6652A0;
import z.C6694e;
import z.C6716p;

/* loaded from: classes2.dex */
public abstract class O0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f19458a;

    /* renamed from: b  reason: collision with root package name */
    public static final E.i0 f19459b;

    /* renamed from: c  reason: collision with root package name */
    public static final E.i0 f19460c;

    static {
        float f6 = 8;
        f19458a = f6;
        f19459b = androidx.compose.foundation.layout.a.b(f6, 2);
        f19460c = androidx.compose.foundation.layout.a.b(f6, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC6216a abstractC6216a, wf.n nVar, AbstractC4326r abstractC4326r, boolean z10, wf.n nVar2, wf.n nVar3, r0.L l10, A0 a02, D0 d02, C0051x c0051x, D.m mVar, AbstractC1725n abstractC1725n, int i10, int i11, int i12) {
        int i13;
        int i14;
        AbstractC4326r abstractC4326r2;
        int i15;
        boolean z11;
        int i16;
        wf.n nVar4;
        int i17;
        wf.n nVar5;
        int i18;
        int i19;
        D.m mVar2;
        C0051x c0051x2;
        D0 d03;
        A0 a03;
        r0.L l11;
        wf.n nVar6;
        boolean z12;
        AbstractC4326r abstractC4326r3;
        A0 a04;
        int i20;
        r0.L l12;
        wf.n nVar7;
        boolean z13;
        D.m mVar3;
        C0051x c0051x3;
        AbstractC4326r abstractC4326r4;
        D0 d04;
        long j6;
        D0 d05;
        C0051x c0051x4;
        int i21;
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
        rVar.X(313450168);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.i(abstractC6216a)) {
                i31 = 4;
            } else {
                i31 = 2;
            }
            i13 = i31 | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.i(nVar)) {
                i30 = 32;
            } else {
                i30 = 16;
            }
            i13 |= i30;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i10 & 384) == 0) {
                abstractC4326r2 = abstractC4326r;
                if (rVar.g(abstractC4326r2)) {
                    i29 = 256;
                } else {
                    i29 = 128;
                }
                i13 |= i29;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (rVar.h(z11)) {
                        i28 = 2048;
                    } else {
                        i28 = 1024;
                    }
                    i13 |= i28;
                    i16 = i12 & 16;
                    if (i16 == 0) {
                        i13 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        nVar4 = nVar2;
                        if (rVar.i(nVar4)) {
                            i27 = 16384;
                        } else {
                            i27 = 8192;
                        }
                        i13 |= i27;
                        i17 = i12 & 32;
                        if (i17 != 0) {
                            i13 |= 196608;
                        } else if ((196608 & i10) == 0) {
                            nVar5 = nVar3;
                            if (rVar.i(nVar5)) {
                                i26 = 131072;
                            } else {
                                i26 = 65536;
                            }
                            i13 |= i26;
                            if ((i10 & 1572864) == 0) {
                                if ((i12 & 64) == 0 && rVar.g(l10)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i13 |= i25;
                            }
                            if ((i10 & 12582912) == 0) {
                                if ((i12 & 128) == 0 && rVar.g(a02)) {
                                    i24 = 8388608;
                                    i13 |= i24;
                                }
                                i24 = 4194304;
                                i13 |= i24;
                            }
                            if ((i10 & 100663296) == 0) {
                                if ((i12 & 256) == 0 && rVar.g(d02)) {
                                    i23 = 67108864;
                                    i13 |= i23;
                                }
                                i23 = 33554432;
                                i13 |= i23;
                            }
                            if ((i10 & 805306368) == 0) {
                                if ((i12 & 512) == 0 && rVar.g(c0051x)) {
                                    i22 = 536870912;
                                    i13 |= i22;
                                }
                                i22 = 268435456;
                                i13 |= i22;
                            }
                            i18 = i12 & 1024;
                            if (i18 == 0) {
                                i19 = i11 | 6;
                            } else if ((i11 & 6) == 0) {
                                if (rVar.g(mVar)) {
                                    i21 = 4;
                                } else {
                                    i21 = 2;
                                }
                                i19 = i11 | i21;
                            } else {
                                i19 = i11;
                            }
                            if ((i13 & 306783379) != 306783378 && (i19 & 3) == 2 && rVar.B()) {
                                rVar.P();
                                a03 = a02;
                                c0051x2 = c0051x;
                                mVar2 = mVar;
                                abstractC4326r3 = abstractC4326r2;
                                z12 = z11;
                                nVar6 = nVar5;
                                l11 = l10;
                                d03 = d02;
                            } else {
                                rVar.R();
                                if ((i10 & 1) == 0 && !rVar.A()) {
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
                                    if ((i12 & 512) != 0) {
                                        i13 &= -1879048193;
                                    }
                                    l12 = l10;
                                    a04 = a02;
                                    d04 = d02;
                                    c0051x3 = c0051x;
                                    abstractC4326r4 = abstractC4326r2;
                                    z13 = z11;
                                    nVar7 = nVar5;
                                    i20 = i13;
                                } else {
                                    if (i14 == 0) {
                                        abstractC4326r4 = C4323o.f37719b;
                                    } else {
                                        abstractC4326r4 = abstractC4326r2;
                                    }
                                    if (i15 == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z11;
                                    }
                                    nVar7 = null;
                                    if (i16 != 0) {
                                        nVar4 = null;
                                    }
                                    if (i17 == 0) {
                                        nVar7 = nVar5;
                                    }
                                    if ((i12 & 64) == 0) {
                                        float f6 = AbstractC1527b0.f19925a;
                                        rVar.W(1988153916);
                                        float f10 = AbstractC1667a.f21475a;
                                        l12 = AbstractC1530b3.a(11, rVar);
                                        rVar.t(false);
                                        i13 &= -3670017;
                                    } else {
                                        l12 = l10;
                                    }
                                    if ((i12 & 128) == 0) {
                                        float f11 = AbstractC1527b0.f19925a;
                                        rVar.W(1961061417);
                                        a04 = AbstractC1527b0.a((P0) rVar.m(R0.f19593a));
                                        rVar.t(false);
                                        i13 &= -29360129;
                                    } else {
                                        a04 = a02;
                                    }
                                    if ((i12 & 256) == 0) {
                                        float f12 = AbstractC1527b0.f19925a;
                                        rVar.W(245366099);
                                        float f13 = AbstractC1667a.f21477c;
                                        d05 = new D0(f13, f13, f13, f13, AbstractC1667a.f21476b, f13);
                                        rVar.t(false);
                                        i13 &= -234881025;
                                    } else {
                                        d05 = d02;
                                    }
                                    if ((i12 & 512) == 0) {
                                        float f14 = AbstractC1527b0.f19925a;
                                        rVar.W(-1458649561);
                                        long e10 = R0.e(AbstractC1667a.f21481g, rVar);
                                        int i32 = i13;
                                        long b10 = r0.r.b(R0.e(AbstractC1667a.f21480f, rVar), 0.12f);
                                        float f15 = AbstractC1667a.f21478d;
                                        if (z13) {
                                            b10 = e10;
                                        }
                                        c0051x4 = new C0051x(f15, new r0.N(b10));
                                        rVar.t(false);
                                        i13 = i32 & (-1879048193);
                                    } else {
                                        c0051x4 = c0051x;
                                    }
                                    if (i18 == 0) {
                                        rVar.W(839902005);
                                        Object K10 = rVar.K();
                                        if (K10 == C1723m.f22654Y) {
                                            K10 = kotlin.jvm.internal.m.d();
                                            rVar.h0(K10);
                                        }
                                        rVar.t(false);
                                        i20 = i13;
                                        c0051x3 = c0051x4;
                                        mVar3 = (D.m) K10;
                                        d04 = d05;
                                        rVar.u();
                                        N0.E a5 = q4.a((p4) rVar.m(q4.f20361a), AbstractC1667a.f21479e);
                                        if (!z13) {
                                            j6 = a04.f18967b;
                                        } else {
                                            j6 = a04.f18971f;
                                        }
                                        long j10 = j6;
                                        int i33 = ((i20 >> 6) & 14) | ((i20 << 3) & 112) | ((i20 >> 3) & 896);
                                        int i34 = i20 << 6;
                                        int i35 = i20 >> 24;
                                        AbstractC4326r abstractC4326r5 = abstractC4326r4;
                                        boolean z14 = z13;
                                        wf.n nVar8 = nVar4;
                                        wf.n nVar9 = nVar7;
                                        r0.L l13 = l12;
                                        A0 a05 = a04;
                                        D0 d06 = d04;
                                        C0051x c0051x5 = c0051x3;
                                        b(abstractC4326r5, abstractC6216a, z14, nVar, a5, j10, nVar8, nVar9, l13, a05, d06, c0051x5, AbstractC1527b0.f19925a, f19459b, mVar3, rVar, i33 | (i34 & 7168) | (3670016 & i34) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), (i35 & 112) | (i35 & 14) | 3456 | ((i19 << 12) & 57344));
                                        d03 = d04;
                                        mVar2 = mVar3;
                                        z12 = z13;
                                        nVar6 = nVar7;
                                        l11 = l12;
                                        a03 = a04;
                                        c0051x2 = c0051x3;
                                        abstractC4326r3 = abstractC4326r4;
                                    } else {
                                        i20 = i13;
                                        c0051x3 = c0051x4;
                                        d04 = d05;
                                    }
                                }
                                mVar3 = mVar;
                                rVar.u();
                                N0.E a52 = q4.a((p4) rVar.m(q4.f20361a), AbstractC1667a.f21479e);
                                if (!z13) {
                                }
                                long j102 = j6;
                                int i332 = ((i20 >> 6) & 14) | ((i20 << 3) & 112) | ((i20 >> 3) & 896);
                                int i342 = i20 << 6;
                                int i352 = i20 >> 24;
                                AbstractC4326r abstractC4326r52 = abstractC4326r4;
                                boolean z142 = z13;
                                wf.n nVar82 = nVar4;
                                wf.n nVar92 = nVar7;
                                r0.L l132 = l12;
                                A0 a052 = a04;
                                D0 d062 = d04;
                                C0051x c0051x52 = c0051x3;
                                b(abstractC4326r52, abstractC6216a, z142, nVar, a52, j102, nVar82, nVar92, l132, a052, d062, c0051x52, AbstractC1527b0.f19925a, f19459b, mVar3, rVar, i332 | (i342 & 7168) | (3670016 & i342) | (29360128 & i342) | (234881024 & i342) | (i342 & 1879048192), (i352 & 112) | (i352 & 14) | 3456 | ((i19 << 12) & 57344));
                                d03 = d04;
                                mVar2 = mVar3;
                                z12 = z13;
                                nVar6 = nVar7;
                                l11 = l12;
                                a03 = a04;
                                c0051x2 = c0051x3;
                                abstractC4326r3 = abstractC4326r4;
                            }
                            C1741v0 v10 = rVar.v();
                            if (v10 != null) {
                                v10.f22739d = new E0(abstractC6216a, nVar, abstractC4326r3, z12, nVar4, nVar6, l11, a03, d03, c0051x2, mVar2, i10, i11, i12);
                                return;
                            }
                            return;
                        }
                        nVar5 = nVar3;
                        if ((i10 & 1572864) == 0) {
                        }
                        if ((i10 & 12582912) == 0) {
                        }
                        if ((i10 & 100663296) == 0) {
                        }
                        if ((i10 & 805306368) == 0) {
                        }
                        i18 = i12 & 1024;
                        if (i18 == 0) {
                        }
                        if ((i13 & 306783379) != 306783378) {
                        }
                        rVar.R();
                        if ((i10 & 1) == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        nVar7 = null;
                        if (i16 != 0) {
                        }
                        if (i17 == 0) {
                        }
                        if ((i12 & 64) == 0) {
                        }
                        if ((i12 & 128) == 0) {
                        }
                        if ((i12 & 256) == 0) {
                        }
                        if ((i12 & 512) == 0) {
                        }
                        if (i18 == 0) {
                        }
                    }
                    nVar4 = nVar2;
                    i17 = i12 & 32;
                    if (i17 != 0) {
                    }
                    nVar5 = nVar3;
                    if ((i10 & 1572864) == 0) {
                    }
                    if ((i10 & 12582912) == 0) {
                    }
                    if ((i10 & 100663296) == 0) {
                    }
                    if ((i10 & 805306368) == 0) {
                    }
                    i18 = i12 & 1024;
                    if (i18 == 0) {
                    }
                    if ((i13 & 306783379) != 306783378) {
                    }
                    rVar.R();
                    if ((i10 & 1) == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    nVar7 = null;
                    if (i16 != 0) {
                    }
                    if (i17 == 0) {
                    }
                    if ((i12 & 64) == 0) {
                    }
                    if ((i12 & 128) == 0) {
                    }
                    if ((i12 & 256) == 0) {
                    }
                    if ((i12 & 512) == 0) {
                    }
                    if (i18 == 0) {
                    }
                }
                z11 = z10;
                i16 = i12 & 16;
                if (i16 == 0) {
                }
                nVar4 = nVar2;
                i17 = i12 & 32;
                if (i17 != 0) {
                }
                nVar5 = nVar3;
                if ((i10 & 1572864) == 0) {
                }
                if ((i10 & 12582912) == 0) {
                }
                if ((i10 & 100663296) == 0) {
                }
                if ((i10 & 805306368) == 0) {
                }
                i18 = i12 & 1024;
                if (i18 == 0) {
                }
                if ((i13 & 306783379) != 306783378) {
                }
                rVar.R();
                if ((i10 & 1) == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                nVar7 = null;
                if (i16 != 0) {
                }
                if (i17 == 0) {
                }
                if ((i12 & 64) == 0) {
                }
                if ((i12 & 128) == 0) {
                }
                if ((i12 & 256) == 0) {
                }
                if ((i12 & 512) == 0) {
                }
                if (i18 == 0) {
                }
            }
            abstractC4326r2 = abstractC4326r;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            z11 = z10;
            i16 = i12 & 16;
            if (i16 == 0) {
            }
            nVar4 = nVar2;
            i17 = i12 & 32;
            if (i17 != 0) {
            }
            nVar5 = nVar3;
            if ((i10 & 1572864) == 0) {
            }
            if ((i10 & 12582912) == 0) {
            }
            if ((i10 & 100663296) == 0) {
            }
            if ((i10 & 805306368) == 0) {
            }
            i18 = i12 & 1024;
            if (i18 == 0) {
            }
            if ((i13 & 306783379) != 306783378) {
            }
            rVar.R();
            if ((i10 & 1) == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            nVar7 = null;
            if (i16 != 0) {
            }
            if (i17 == 0) {
            }
            if ((i12 & 64) == 0) {
            }
            if ((i12 & 128) == 0) {
            }
            if ((i12 & 256) == 0) {
            }
            if ((i12 & 512) == 0) {
            }
            if (i18 == 0) {
            }
        }
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        abstractC4326r2 = abstractC4326r;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        z11 = z10;
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        nVar4 = nVar2;
        i17 = i12 & 32;
        if (i17 != 0) {
        }
        nVar5 = nVar3;
        if ((i10 & 1572864) == 0) {
        }
        if ((i10 & 12582912) == 0) {
        }
        if ((i10 & 100663296) == 0) {
        }
        if ((i10 & 805306368) == 0) {
        }
        i18 = i12 & 1024;
        if (i18 == 0) {
        }
        if ((i13 & 306783379) != 306783378) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        nVar7 = null;
        if (i16 != 0) {
        }
        if (i17 == 0) {
        }
        if ((i12 & 64) == 0) {
        }
        if ((i12 & 128) == 0) {
        }
        if ((i12 & 256) == 0) {
        }
        if ((i12 & 512) == 0) {
        }
        if (i18 == 0) {
        }
    }

    public static final void b(AbstractC4326r abstractC4326r, AbstractC6216a abstractC6216a, boolean z10, wf.n nVar, N0.E e10, long j6, wf.n nVar2, wf.n nVar3, r0.L l10, A0 a02, D0 d02, C0051x c0051x, float f6, E.g0 g0Var, D.m mVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        Z.r rVar;
        float f10;
        int i14;
        C6716p c6716p;
        boolean z11;
        int i15;
        float f11;
        float f12;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(1400504719);
        if ((i10 & 6) == 0) {
            i12 = (rVar2.g(abstractC4326r) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = 16;
        if ((i10 & 48) == 0) {
            i12 |= rVar2.i(abstractC6216a) ? 32 : 16;
        }
        int i17 = 256;
        if ((i10 & 384) == 0) {
            i12 |= rVar2.h(z10) ? 256 : 128;
        }
        int i18 = 1024;
        if ((i10 & 3072) == 0) {
            i12 |= rVar2.i(nVar) ? 2048 : 1024;
        }
        int i19 = 8192;
        if ((i10 & 24576) == 0) {
            i12 |= rVar2.g(e10) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= rVar2.f(j6) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= rVar2.i(nVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= rVar2.i(nVar3) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= rVar2.g(l10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= rVar2.g(a02) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (rVar2.g(d02) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar2.g(c0051x)) {
                i16 = 32;
            }
            i13 |= i16;
        }
        if ((i11 & 384) == 0) {
            if (!rVar2.d(f6)) {
                i17 = 128;
            }
            i13 |= i17;
        }
        if ((i11 & 3072) == 0) {
            if (rVar2.g(g0Var)) {
                i18 = 2048;
            }
            i13 |= i18;
        }
        if ((i11 & 24576) == 0) {
            if (rVar2.g(mVar)) {
                i19 = 16384;
            }
            i13 |= i19;
        }
        int i20 = i13;
        if ((i12 & 306783379) == 306783378 && (i20 & 9363) == 9362 && rVar2.B()) {
            rVar2.P();
            rVar = rVar2;
        } else {
            AbstractC4326r a5 = L0.l.a(abstractC4326r, false, S.f19624i0);
            long j10 = z10 ? a02.f18966a : a02.f18970e;
            if (d02 != null) {
                f10 = z10 ? d02.f19023a : d02.f19028f;
            } else {
                f10 = 0;
            }
            rVar2.W(64045604);
            if (d02 == null) {
                i15 = i12;
                i14 = i20;
                z11 = false;
                c6716p = null;
            } else {
                int i21 = ((i12 >> 6) & 14) | ((i20 >> 9) & 112) | ((i20 << 6) & 896);
                rVar2.W(1881877139);
                int i22 = (i21 & 896) | (i21 & 14) | (i21 & 112);
                Object i23 = AbstractC6463a.i(rVar2, -2071499570, -1373742275);
                io.sentry.hints.i iVar = C1723m.f22654Y;
                if (i23 == iVar) {
                    i23 = new j0.u();
                    rVar2.h0(i23);
                }
                j0.u uVar = (j0.u) i23;
                int i24 = i12;
                Object w10 = AbstractC0044t0.w(rVar2, false, -1373742197);
                if (w10 == iVar) {
                    w10 = AbstractC4828h.Z(null, Z.o1.f22665a);
                    rVar2.h0(w10);
                }
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) w10;
                rVar2.t(false);
                rVar2.W(-1373742107);
                boolean z12 = true;
                boolean z13 = (((i22 & 112) ^ 48) > 32 && rVar2.g(mVar)) || (i22 & 48) == 32;
                Object K10 = rVar2.K();
                if (z13 || K10 == iVar) {
                    K10 = new B0(mVar, uVar, null);
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                AbstractC1734s.e(mVar, (wf.n) K10, rVar2);
                D.k kVar = (D.k) kf.t.p2(uVar);
                if (!z10) {
                    f12 = d02.f19028f;
                } else if (kVar instanceof D.p) {
                    f12 = d02.f19024b;
                } else if (kVar instanceof D.h) {
                    f12 = d02.f19026d;
                } else if (kVar instanceof D.d) {
                    f12 = d02.f19025c;
                } else {
                    f12 = kVar instanceof D.b ? d02.f19027e : d02.f19023a;
                }
                float f13 = f12;
                rVar2.W(-1373740122);
                Object K11 = rVar2.K();
                if (K11 == iVar) {
                    i14 = i20;
                    K11 = new C6694e(new Z0.e(f13), AbstractC6652A0.f51118c, null, 12);
                    rVar2.h0(K11);
                } else {
                    i14 = i20;
                }
                C6694e c6694e = (C6694e) K11;
                rVar2.t(false);
                Z0.e eVar = new Z0.e(f13);
                rVar2.W(-1373740038);
                boolean i25 = rVar2.i(c6694e) | rVar2.d(f13);
                if ((((i22 & 14) ^ 6) <= 4 || !rVar2.h(z10)) && (i22 & 6) != 4) {
                    z12 = false;
                }
                boolean i26 = i25 | z12 | rVar2.i(kVar);
                Object K12 = rVar2.K();
                if (i26 || K12 == iVar) {
                    i15 = i24;
                    C0 c02 = new C0(c6694e, f13, z10, kVar, abstractC1710f0, null);
                    rVar2.h0(c02);
                    K12 = c02;
                } else {
                    i15 = i24;
                }
                z11 = false;
                rVar2.t(false);
                AbstractC1734s.e(eVar, (wf.n) K12, rVar2);
                c6716p = c6694e.f51230c;
                rVar2.t(false);
                rVar2.t(false);
            }
            rVar2.t(z11);
            if (c6716p != null) {
                f11 = ((Z0.e) c6716p.f51346Z.getValue()).f22788Y;
            } else {
                f11 = z11 ? 1.0f : 0.0f;
            }
            float f14 = f11;
            rVar = rVar2;
            G3.b(abstractC6216a, a5, z10, l10, j10, 0L, f10, f14, c0051x, mVar, R4.b.X(rVar2, -1985962652, new F0(nVar, e10, j6, nVar2, nVar3, a02, z10, f6, g0Var)), rVar2, ((i15 >> 15) & 7168) | ((i15 >> 3) & 14) | (i15 & 896) | ((i14 << 21) & 234881024) | ((i14 << 15) & 1879048192), 32);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new G0(abstractC4326r, abstractC6216a, z10, nVar, e10, j6, nVar2, nVar3, l10, a02, d02, c0051x, f6, g0Var, mVar, i10, i11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x028c, code lost:
        if (r31 != false) goto L182;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(boolean z10, AbstractC6216a abstractC6216a, wf.n nVar, AbstractC4326r abstractC4326r, boolean z11, wf.n nVar2, wf.n nVar3, r0.L l10, V2 v22, Y2 y22, C0051x c0051x, D.m mVar, AbstractC1725n abstractC1725n, int i10, int i11, int i12) {
        int i13;
        AbstractC4326r abstractC4326r2;
        int i14;
        boolean z12;
        int i15;
        int i16;
        V2 v23;
        int i17;
        int i18;
        Z.r rVar;
        D.m mVar2;
        C0051x c0051x2;
        Y2 y23;
        V2 v24;
        r0.L l11;
        wf.n nVar4;
        wf.n nVar5;
        boolean z13;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        D.m mVar3;
        C0051x c0051x3;
        Y2 y24;
        V2 v25;
        r0.L l12;
        wf.n nVar6;
        wf.n nVar7;
        boolean z14;
        AbstractC4326r abstractC4326r4;
        int i19;
        r0.L l13;
        V2 v26;
        Y2 y25;
        AbstractC4326r abstractC4326r5;
        int i20;
        C0051x c0051x4;
        int i21;
        int i22;
        int i23;
        int i24;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-1711985619);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (rVar2.h(z10) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= rVar2.i(abstractC6216a) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i10 & 384) == 0) {
            i13 |= rVar2.i(nVar) ? 256 : 128;
        }
        int i25 = i12 & 8;
        if (i25 != 0) {
            i13 |= 3072;
        } else if ((i10 & 3072) == 0) {
            abstractC4326r2 = abstractC4326r;
            i13 |= rVar2.g(abstractC4326r2) ? 2048 : 1024;
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i10 & 24576) == 0) {
                z12 = z11;
                i13 |= rVar2.h(z12) ? 16384 : 8192;
                i15 = i12 & 32;
                if (i15 != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    i13 |= rVar2.i(nVar2) ? 131072 : 65536;
                }
                i16 = i12 & 64;
                if (i16 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    i13 |= rVar2.i(nVar3) ? 1048576 : 524288;
                }
                if ((i10 & 12582912) == 0) {
                    if ((i12 & 128) == 0 && rVar2.g(l10)) {
                        i24 = 8388608;
                        i13 |= i24;
                    }
                    i24 = 4194304;
                    i13 |= i24;
                }
                if ((i10 & 100663296) == 0) {
                    if ((i12 & 256) == 0) {
                        v23 = v22;
                        if (rVar2.g(v23)) {
                            i23 = 67108864;
                            i13 |= i23;
                        }
                    } else {
                        v23 = v22;
                    }
                    i23 = 33554432;
                    i13 |= i23;
                } else {
                    v23 = v22;
                }
                if ((i10 & 805306368) == 0) {
                    if ((i12 & 512) == 0 && rVar2.g(y22)) {
                        i22 = 536870912;
                        i13 |= i22;
                    }
                    i22 = 268435456;
                    i13 |= i22;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 1024) == 0 && rVar2.g(c0051x)) {
                        i21 = 4;
                        i17 = i11 | i21;
                    }
                    i21 = 2;
                    i17 = i11 | i21;
                } else {
                    i17 = i11;
                }
                i18 = i12 & 2048;
                if (i18 != 0) {
                    i17 |= 48;
                } else if ((i11 & 48) == 0) {
                    i17 |= rVar2.g(mVar) ? 32 : 16;
                }
                if ((i13 & 306783379) != 306783378 && (i17 & 19) == 18 && rVar2.B()) {
                    rVar2.P();
                    nVar4 = nVar3;
                    y23 = y22;
                    mVar2 = mVar;
                    v24 = v23;
                    abstractC4326r3 = abstractC4326r2;
                    z13 = z12;
                    rVar = rVar2;
                    nVar5 = nVar2;
                    l11 = l10;
                    c0051x2 = c0051x;
                } else {
                    rVar2.R();
                    if ((i10 & 1) == 0 && !rVar2.A()) {
                        rVar2.P();
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
                            i17 &= -15;
                        }
                        nVar7 = nVar2;
                        nVar6 = nVar3;
                        l12 = l10;
                        y24 = y22;
                        c0051x3 = c0051x;
                        mVar3 = mVar;
                        v25 = v23;
                        abstractC4326r4 = abstractC4326r2;
                        z14 = z12;
                        i19 = i17;
                    } else {
                        AbstractC4326r abstractC4326r6 = i25 != 0 ? C4323o.f37719b : abstractC4326r2;
                        boolean z15 = i14 != 0 ? true : z12;
                        wf.n nVar8 = null;
                        wf.n nVar9 = i15 != 0 ? null : nVar2;
                        if (i16 == 0) {
                            nVar8 = nVar3;
                        }
                        if ((i12 & 128) != 0) {
                            float f6 = AbstractC1583m1.f20223a;
                            rVar2.W(-1598643637);
                            float f10 = X.r.f21612a;
                            l13 = AbstractC1530b3.a(11, rVar2);
                            rVar2.t(false);
                            i13 &= -29360129;
                        } else {
                            l13 = l10;
                        }
                        if ((i12 & 256) != 0) {
                            float f11 = AbstractC1583m1.f20223a;
                            rVar2.W(-1743772077);
                            v26 = AbstractC1583m1.a((P0) rVar2.m(R0.f19593a));
                            rVar2.t(false);
                            i13 &= -234881025;
                        } else {
                            v26 = v23;
                        }
                        if ((i12 & 512) != 0) {
                            float f12 = AbstractC1583m1.f20223a;
                            rVar2.W(-757972185);
                            float f13 = X.r.f21614c;
                            y25 = new Y2(f13, X.r.f21618g, X.r.f21615d, X.r.f21616e, X.r.f21613b, f13);
                            rVar2.t(false);
                            i13 &= -1879048193;
                        } else {
                            y25 = y22;
                        }
                        if ((i12 & 1024) != 0) {
                            float f14 = AbstractC1583m1.f20223a;
                            rVar2.W(-1138342447);
                            long e10 = R0.e(X.r.f21624m, rVar2);
                            long j6 = r0.r.f44262j;
                            long b10 = r0.r.b(R0.e(X.r.f21622k, rVar2), 0.12f);
                            float f15 = X.r.f21619h;
                            float f16 = X.r.f21617f;
                            if (z15) {
                                if (!z10) {
                                    b10 = e10;
                                    i20 = i13;
                                    if (z10) {
                                        f15 = f16;
                                    }
                                    abstractC4326r5 = abstractC4326r6;
                                    c0051x4 = new C0051x(f15, new r0.N(b10));
                                    rVar2.t(false);
                                    i17 &= -15;
                                }
                                b10 = j6;
                                i20 = i13;
                                if (z10) {
                                }
                                abstractC4326r5 = abstractC4326r6;
                                c0051x4 = new C0051x(f15, new r0.N(b10));
                                rVar2.t(false);
                                i17 &= -15;
                            }
                        } else {
                            i20 = i13;
                            abstractC4326r5 = abstractC4326r6;
                            c0051x4 = c0051x;
                        }
                        if (i18 != 0) {
                            rVar2.W(276179389);
                            Object K10 = rVar2.K();
                            if (K10 == C1723m.f22654Y) {
                                K10 = kotlin.jvm.internal.m.d();
                                rVar2.h0(K10);
                            }
                            rVar2.t(false);
                            abstractC4326r4 = abstractC4326r5;
                            c0051x3 = c0051x4;
                            mVar3 = (D.m) K10;
                        } else {
                            mVar3 = mVar;
                            abstractC4326r4 = abstractC4326r5;
                            c0051x3 = c0051x4;
                        }
                        z14 = z15;
                        v25 = v26;
                        nVar7 = nVar9;
                        l12 = l13;
                        i19 = i17;
                        y24 = y25;
                        i13 = i20;
                        nVar6 = nVar8;
                    }
                    rVar2.u();
                    int i26 = i13 << 3;
                    int i27 = i13 << 6;
                    int i28 = (i13 & 14) | 12582912 | ((i13 >> 6) & 112) | (i26 & 896) | ((i13 >> 3) & 7168) | (57344 & i27) | (i26 & 3670016) | (234881024 & i27) | (1879048192 & i27);
                    int i29 = i13 >> 24;
                    rVar = rVar2;
                    d(z10, abstractC4326r4, abstractC6216a, z14, nVar, q4.a((p4) rVar2.m(q4.f20361a), X.r.f21620i), nVar7, null, nVar6, l12, v25, y24, c0051x3, AbstractC1583m1.f20223a, f19460c, mVar3, rVar, i28, (i29 & 112) | (i29 & 14) | 27648 | ((i19 << 6) & 896) | ((i19 << 12) & 458752));
                    abstractC4326r3 = abstractC4326r4;
                    z13 = z14;
                    nVar5 = nVar7;
                    nVar4 = nVar6;
                    l11 = l12;
                    v24 = v25;
                    y23 = y24;
                    c0051x2 = c0051x3;
                    mVar2 = mVar3;
                }
                v10 = rVar.v();
                if (v10 == null) {
                    return;
                }
                v10.f22739d = new L0(z10, abstractC6216a, nVar, abstractC4326r3, z13, nVar5, nVar4, l11, v24, y23, c0051x2, mVar2, i10, i11, i12);
                return;
            }
            z12 = z11;
            i15 = i12 & 32;
            if (i15 != 0) {
            }
            i16 = i12 & 64;
            if (i16 != 0) {
            }
            if ((i10 & 12582912) == 0) {
            }
            if ((i10 & 100663296) == 0) {
            }
            if ((i10 & 805306368) == 0) {
            }
            if ((i11 & 6) == 0) {
            }
            i18 = i12 & 2048;
            if (i18 != 0) {
            }
            if ((i13 & 306783379) != 306783378) {
            }
            rVar2.R();
            if ((i10 & 1) == 0) {
            }
            if (i25 != 0) {
            }
            if (i14 != 0) {
            }
            wf.n nVar82 = null;
            if (i15 != 0) {
            }
            if (i16 == 0) {
            }
            if ((i12 & 128) != 0) {
            }
            if ((i12 & 256) != 0) {
            }
            if ((i12 & 512) != 0) {
            }
            if ((i12 & 1024) != 0) {
            }
            if (i18 != 0) {
            }
            z14 = z15;
            v25 = v26;
            nVar7 = nVar9;
            l12 = l13;
            i19 = i17;
            y24 = y25;
            i13 = i20;
            nVar6 = nVar82;
            rVar2.u();
            int i262 = i13 << 3;
            int i272 = i13 << 6;
            int i282 = (i13 & 14) | 12582912 | ((i13 >> 6) & 112) | (i262 & 896) | ((i13 >> 3) & 7168) | (57344 & i272) | (i262 & 3670016) | (234881024 & i272) | (1879048192 & i272);
            int i292 = i13 >> 24;
            rVar = rVar2;
            d(z10, abstractC4326r4, abstractC6216a, z14, nVar, q4.a((p4) rVar2.m(q4.f20361a), X.r.f21620i), nVar7, null, nVar6, l12, v25, y24, c0051x3, AbstractC1583m1.f20223a, f19460c, mVar3, rVar, i282, (i292 & 112) | (i292 & 14) | 27648 | ((i19 << 6) & 896) | ((i19 << 12) & 458752));
            abstractC4326r3 = abstractC4326r4;
            z13 = z14;
            nVar5 = nVar7;
            nVar4 = nVar6;
            l11 = l12;
            v24 = v25;
            y23 = y24;
            c0051x2 = c0051x3;
            mVar2 = mVar3;
            v10 = rVar.v();
            if (v10 == null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        z12 = z11;
        i15 = i12 & 32;
        if (i15 != 0) {
        }
        i16 = i12 & 64;
        if (i16 != 0) {
        }
        if ((i10 & 12582912) == 0) {
        }
        if ((i10 & 100663296) == 0) {
        }
        if ((i10 & 805306368) == 0) {
        }
        if ((i11 & 6) == 0) {
        }
        i18 = i12 & 2048;
        if (i18 != 0) {
        }
        if ((i13 & 306783379) != 306783378) {
        }
        rVar2.R();
        if ((i10 & 1) == 0) {
        }
        if (i25 != 0) {
        }
        if (i14 != 0) {
        }
        wf.n nVar822 = null;
        if (i15 != 0) {
        }
        if (i16 == 0) {
        }
        if ((i12 & 128) != 0) {
        }
        if ((i12 & 256) != 0) {
        }
        if ((i12 & 512) != 0) {
        }
        if ((i12 & 1024) != 0) {
        }
        if (i18 != 0) {
        }
        z14 = z15;
        v25 = v26;
        nVar7 = nVar9;
        l12 = l13;
        i19 = i17;
        y24 = y25;
        i13 = i20;
        nVar6 = nVar822;
        rVar2.u();
        int i2622 = i13 << 3;
        int i2722 = i13 << 6;
        int i2822 = (i13 & 14) | 12582912 | ((i13 >> 6) & 112) | (i2622 & 896) | ((i13 >> 3) & 7168) | (57344 & i2722) | (i2622 & 3670016) | (234881024 & i2722) | (1879048192 & i2722);
        int i2922 = i13 >> 24;
        rVar = rVar2;
        d(z10, abstractC4326r4, abstractC6216a, z14, nVar, q4.a((p4) rVar2.m(q4.f20361a), X.r.f21620i), nVar7, null, nVar6, l12, v25, y24, c0051x3, AbstractC1583m1.f20223a, f19460c, mVar3, rVar, i2822, (i2922 & 112) | (i2922 & 14) | 27648 | ((i19 << 6) & 896) | ((i19 << 12) & 458752));
        abstractC4326r3 = abstractC4326r4;
        z13 = z14;
        nVar5 = nVar7;
        nVar4 = nVar6;
        l11 = l12;
        v24 = v25;
        y23 = y24;
        c0051x2 = c0051x3;
        mVar2 = mVar3;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final void d(boolean z10, AbstractC4326r abstractC4326r, AbstractC6216a abstractC6216a, boolean z11, wf.n nVar, N0.E e10, wf.n nVar2, wf.n nVar3, wf.n nVar4, r0.L l10, V2 v22, Y2 y22, C0051x c0051x, float f6, E.g0 g0Var, D.m mVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        Z.r rVar;
        long j6;
        float f10;
        long j10;
        long j11;
        boolean z12;
        C6716p c6716p;
        float f11;
        float f12;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(402951308);
        if ((i10 & 6) == 0) {
            i12 = (rVar2.h(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = 16;
        if ((i10 & 48) == 0) {
            i12 |= rVar2.g(abstractC4326r) ? 32 : 16;
        }
        int i15 = 128;
        if ((i10 & 384) == 0) {
            i12 |= rVar2.i(abstractC6216a) ? 256 : 128;
        }
        int i16 = 1024;
        if ((i10 & 3072) == 0) {
            i12 |= rVar2.h(z11) ? 2048 : 1024;
        }
        int i17 = 8192;
        if ((i10 & 24576) == 0) {
            i12 |= rVar2.i(nVar) ? 16384 : 8192;
        }
        int i18 = 65536;
        if ((i10 & 196608) == 0) {
            i12 |= rVar2.g(e10) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= rVar2.i(nVar2) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= rVar2.i(nVar3) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= rVar2.i(nVar4) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= rVar2.g(l10) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (rVar2.g(v22) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar2.g(y22)) {
                i14 = 32;
            }
            i13 |= i14;
        }
        if ((i11 & 384) == 0) {
            if (rVar2.g(c0051x)) {
                i15 = 256;
            }
            i13 |= i15;
        }
        if ((i11 & 3072) == 0) {
            if (rVar2.d(f6)) {
                i16 = 2048;
            }
            i13 |= i16;
        }
        if ((i11 & 24576) == 0) {
            if (rVar2.g(g0Var)) {
                i17 = 16384;
            }
            i13 |= i17;
        }
        if ((i11 & 196608) == 0) {
            if (rVar2.g(mVar)) {
                i18 = 131072;
            }
            i13 |= i18;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 74899) == 74898 && rVar2.B()) {
            rVar2.P();
            rVar = rVar2;
        } else {
            AbstractC4326r a5 = L0.l.a(abstractC4326r, false, S.f19625j0);
            int i19 = (i12 >> 9) & 14;
            v22.getClass();
            rVar2.W(-2126903408);
            if (z11) {
                if (!z10) {
                    j6 = v22.f19745a;
                } else {
                    j6 = v22.f19753i;
                }
            } else {
                j6 = z10 ? v22.f19754j : v22.f19749e;
            }
            AbstractC1710f0 g02 = AbstractC4828h.g0(new r0.r(j6), rVar2);
            rVar2.t(false);
            long j12 = ((r0.r) g02.getValue()).f44265a;
            if (y22 != null) {
                f10 = z11 ? y22.f19849a : y22.f19854f;
                j10 = j12;
            } else {
                j10 = j12;
                f10 = 0;
            }
            rVar2.W(1036687729);
            if (y22 == null) {
                rVar = rVar2;
                j11 = j10;
                c6716p = null;
                z12 = false;
            } else {
                int i20 = i19 | ((i13 >> 12) & 112) | ((i13 << 3) & 896);
                rVar2.W(-1888175651);
                int i21 = (i20 & 896) | (i20 & 14) | (i20 & 112);
                Object i22 = AbstractC6463a.i(rVar2, 664514136, -699454716);
                io.sentry.hints.i iVar = C1723m.f22654Y;
                if (i22 == iVar) {
                    i22 = new j0.u();
                    rVar2.h0(i22);
                }
                j0.u uVar = (j0.u) i22;
                Object w10 = AbstractC0044t0.w(rVar2, false, -699454638);
                if (w10 == iVar) {
                    w10 = AbstractC4828h.Z(null, Z.o1.f22665a);
                    rVar2.h0(w10);
                }
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) w10;
                rVar2.t(false);
                rVar2.W(-699454548);
                boolean z13 = (((i21 & 112) ^ 48) > 32 && rVar2.g(mVar)) || (i21 & 48) == 32;
                Object K10 = rVar2.K();
                if (z13 || K10 == iVar) {
                    K10 = new W2(mVar, uVar, null);
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                AbstractC1734s.e(mVar, (wf.n) K10, rVar2);
                D.k kVar = (D.k) kf.t.p2(uVar);
                if (!z11) {
                    f12 = y22.f19854f;
                } else if (kVar instanceof D.p) {
                    f12 = y22.f19850b;
                } else if (kVar instanceof D.h) {
                    f12 = y22.f19852d;
                } else if (kVar instanceof D.d) {
                    f12 = y22.f19851c;
                } else {
                    f12 = kVar instanceof D.b ? y22.f19853e : y22.f19849a;
                }
                float f13 = f12;
                rVar2.W(-699452563);
                Object K11 = rVar2.K();
                if (K11 == iVar) {
                    K11 = new C6694e(new Z0.e(f13), AbstractC6652A0.f51118c, null, 12);
                    rVar2.h0(K11);
                }
                C6694e c6694e = (C6694e) K11;
                rVar2.t(false);
                Z0.e eVar = new Z0.e(f13);
                rVar2.W(-699452479);
                boolean i23 = ((((i21 & 14) ^ 6) > 4 && rVar2.h(z11)) || (i21 & 6) == 4) | rVar2.i(c6694e) | rVar2.d(f13) | rVar2.i(kVar);
                Object K12 = rVar2.K();
                if (i23 || K12 == iVar) {
                    j11 = j10;
                    rVar = rVar2;
                    X2 x22 = new X2(c6694e, f13, z11, kVar, abstractC1710f0, null);
                    rVar.h0(x22);
                    K12 = x22;
                } else {
                    rVar = rVar2;
                    j11 = j10;
                }
                z12 = false;
                rVar.t(false);
                AbstractC1734s.e(eVar, (wf.n) K12, rVar);
                c6716p = c6694e.f51230c;
                rVar.t(false);
                rVar.t(false);
            }
            rVar.t(z12);
            if (c6716p != null) {
                f11 = ((Z0.e) c6716p.f51346Z.getValue()).f22788Y;
            } else {
                f11 = z12 ? 1.0f : 0.0f;
            }
            float f14 = f11;
            char c10 = z12 ? 1 : 0;
            Object[] objArr = z12 ? 1 : 0;
            C3288a X10 = R4.b.X(rVar, -577614814, new M0(v22, z11, z10, nVar, e10, nVar2, nVar3, nVar4, f6, g0Var));
            Z.O o10 = G3.f19172a;
            rVar.W(540296512);
            long j13 = j11;
            long b10 = R0.b(j13, rVar);
            Z.O o11 = G3.f19172a;
            float f15 = ((Z0.e) rVar.m(o11)).f22788Y + f10;
            C1737t0 q10 = R.a.q(b10, Z0.f19875a);
            C1737t0 b11 = o11.b(new Z0.e(f15));
            C1737t0[] c1737t0Arr = new C1737t0[2];
            c1737t0Arr[c10] = q10;
            c1737t0Arr[1] = b11;
            A7.b.l(c1737t0Arr, R4.b.X(rVar, -1164547968, new F3(a5, l10, j13, f15, c0051x, z10, mVar, z11, abstractC6216a, f14, X10)), rVar, 48);
            rVar.t(false);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new N0(z10, abstractC4326r, abstractC6216a, z11, nVar, e10, nVar2, nVar3, nVar4, l10, v22, y22, c0051x, f6, g0Var, mVar, i10, i11);
        }
    }

    public static final void e(wf.n nVar, N0.E e10, long j6, wf.n nVar2, wf.n nVar3, wf.n nVar4, long j10, long j11, float f6, E.g0 g0Var, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-782878228);
        if ((i10 & 6) == 0) {
            if (rVar.i(nVar)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i11 = i21 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.g(e10)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i11 |= i20;
        }
        if ((i10 & 384) == 0) {
            if (rVar.f(j6)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i11 |= i19;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.i(nVar2)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i11 |= i18;
        }
        if ((i10 & 24576) == 0) {
            if (rVar.i(nVar3)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i11 |= i17;
        }
        if ((196608 & i10) == 0) {
            if (rVar.i(nVar4)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i11 |= i16;
        }
        if ((1572864 & i10) == 0) {
            if (rVar.f(j10)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i11 |= i15;
        }
        if ((12582912 & i10) == 0) {
            if (rVar.f(j11)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i11 |= i14;
        }
        if ((i10 & 100663296) == 0) {
            if (rVar.d(f6)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i11 |= i13;
        }
        if ((i10 & 805306368) == 0) {
            if (rVar.g(g0Var)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i11 |= i12;
        }
        if ((i11 & 306783379) == 306783378 && rVar.B()) {
            rVar.P();
        } else {
            A7.b.l(new C1737t0[]{R.a.q(j6, Z0.f19875a), j4.f20182a.b(e10)}, R4.b.X(rVar, 1748799148, new J0(f6, g0Var, nVar3, nVar2, nVar4, j10, nVar, j11)), rVar, 48);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new K0(nVar, e10, j6, nVar2, nVar3, nVar4, j10, j11, f6, g0Var, i10);
        }
    }
}
