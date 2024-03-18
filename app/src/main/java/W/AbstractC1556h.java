package W;

import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1741v0;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4323o;
import y.AbstractC6463a;

/* renamed from: W.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1556h {

    /* renamed from: a  reason: collision with root package name */
    public static final float f20102a = 280;

    /* renamed from: b  reason: collision with root package name */
    public static final float f20103b = 560;

    /* renamed from: c  reason: collision with root package name */
    public static final E.i0 f20104c;

    /* renamed from: d  reason: collision with root package name */
    public static final E.i0 f20105d;

    /* renamed from: e  reason: collision with root package name */
    public static final E.i0 f20106e;

    /* renamed from: f  reason: collision with root package name */
    public static final E.i0 f20107f;

    static {
        float f6 = 24;
        f20104c = new E.i0(f6, f6, f6, f6);
        float f10 = 16;
        f20105d = androidx.compose.foundation.layout.a.c(0.0f, 0.0f, f10, 7);
        f20106e = androidx.compose.foundation.layout.a.c(0.0f, 0.0f, f10, 7);
        f20107f = androidx.compose.foundation.layout.a.c(0.0f, 0.0f, f6, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(wf.n nVar, AbstractC4326r abstractC4326r, wf.n nVar2, wf.n nVar3, wf.n nVar4, r0.L l10, long j6, float f6, long j10, long j11, long j12, long j13, AbstractC1725n abstractC1725n, int i10, int i11, int i12) {
        int i13;
        AbstractC4326r abstractC4326r2;
        int i14;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        C4323o c4323o;
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
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1522575799);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.i(nVar)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i13 = i25 | i10;
        } else {
            i13 = i10;
        }
        int i26 = i12 & 2;
        int i27 = 32;
        if (i26 != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i13 |= i24;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i10 & 384) == 0) {
                if (rVar.i(nVar2)) {
                    i23 = 256;
                } else {
                    i23 = 128;
                }
                i13 |= i23;
            }
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (rVar.i(nVar3)) {
                    i22 = 2048;
                } else {
                    i22 = 1024;
                }
                i13 |= i22;
            }
            if ((i12 & 16) == 0) {
                i13 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (rVar.i(nVar4)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i13 |= i21;
            }
            if ((i12 & 32) == 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (rVar.g(l10)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i13 |= i20;
            }
            if ((i12 & 64) == 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (rVar.f(j6)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((i12 & 128) == 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (rVar.d(f6)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i13 |= i18;
                if ((i12 & 256) != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (rVar.f(j10)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i13 |= i17;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (rVar.f(j11)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i13 |= i16;
                }
                if ((i12 & 1024) != 0) {
                    i14 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (rVar.f(j12)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i11 | i15;
                } else {
                    i14 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i14 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (!rVar.f(j13)) {
                        i27 = 16;
                    }
                    i14 |= i27;
                }
                if ((306783379 & i13) != 306783378 && (i14 & 19) == 18 && rVar.B()) {
                    rVar.P();
                    abstractC4326r3 = abstractC4326r2;
                } else {
                    if (i26 != 0) {
                        c4323o = C4323o.f37719b;
                    } else {
                        c4323o = abstractC4326r2;
                    }
                    int i28 = i13 >> 12;
                    G3.a(c4323o, l10, j6, 0L, f6, 0.0f, null, R4.b.X(rVar, -2126308228, new C1531c(nVar2, nVar3, nVar4, j11, j12, j13, j10, nVar)), rVar, ((i13 >> 3) & 14) | 12582912 | (i28 & 112) | (i28 & 896) | ((i13 >> 9) & 57344), 104);
                    abstractC4326r3 = c4323o;
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new C1536d(nVar, abstractC4326r3, nVar2, nVar3, nVar4, l10, j6, f6, j10, j11, j12, j13, i10, i11, i12);
                    return;
                }
                return;
            }
            if ((i12 & 256) != 0) {
            }
            if ((i12 & 512) != 0) {
            }
            if ((i12 & 1024) != 0) {
            }
            if ((i12 & 2048) != 0) {
            }
            if ((306783379 & i13) != 306783378) {
            }
            if (i26 != 0) {
            }
            int i282 = i13 >> 12;
            G3.a(c4323o, l10, j6, 0L, f6, 0.0f, null, R4.b.X(rVar, -2126308228, new C1531c(nVar2, nVar3, nVar4, j11, j12, j13, j10, nVar)), rVar, ((i13 >> 3) & 14) | 12582912 | (i282 & 112) | (i282 & 896) | ((i13 >> 9) & 57344), 104);
            abstractC4326r3 = c4323o;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 4) == 0) {
        }
        if ((i12 & 8) == 0) {
        }
        if ((i12 & 16) == 0) {
        }
        if ((i12 & 32) == 0) {
        }
        if ((i12 & 64) == 0) {
        }
        if ((i12 & 128) == 0) {
        }
        if ((i12 & 256) != 0) {
        }
        if ((i12 & 512) != 0) {
        }
        if ((i12 & 1024) != 0) {
        }
        if ((i12 & 2048) != 0) {
        }
        if ((306783379 & i13) != 306783378) {
        }
        if (i26 != 0) {
        }
        int i2822 = i13 >> 12;
        G3.a(c4323o, l10, j6, 0L, f6, 0.0f, null, R4.b.X(rVar, -2126308228, new C1531c(nVar2, nVar3, nVar4, j11, j12, j13, j10, nVar)), rVar, ((i13 >> 3) & 14) | 12582912 | (i2822 & 112) | (i2822 & 896) | ((i13 >> 9) & 57344), 104);
        abstractC4326r3 = c4323o;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    public static final void b(float f6, float f10, wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(586821353);
        if ((i10 & 6) == 0) {
            if (rVar.d(f6)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.d(f10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (rVar.i(nVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && rVar.B()) {
            rVar.P();
        } else {
            rVar.W(-1133133582);
            if ((i11 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = z10 | z11;
            Object K10 = rVar.K();
            if (z12 || K10 == C1723m.f22654Y) {
                K10 = new C1546f(f6, f10);
                rVar.h0(K10);
            }
            E0.N n10 = (E0.N) K10;
            rVar.t(false);
            rVar.W(-1323940314);
            C4323o c4323o = C4323o.f37719b;
            int i15 = rVar.P;
            AbstractC1732q0 p10 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i16 = androidx.compose.ui.layout.a.i(c4323o);
            int i17 = ((((i11 >> 6) & 14) << 9) & 7168) | 6;
            if (rVar.f22696a instanceof AbstractC1707e) {
                rVar.Z();
                if (rVar.f22695O) {
                    rVar.o(c0582k);
                } else {
                    rVar.k0();
                }
                U3.f.n0(rVar, n10, C0583l.f5808f);
                U3.f.n0(rVar, p10, C0583l.f5807e);
                C0581j c0581j = C0583l.f5809g;
                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i15))) {
                    AbstractC6463a.q(i15, rVar, i15, c0581j);
                }
                AbstractC6463a.r(0, i16, new Z.L0(rVar), rVar, 2058660585);
                AbstractC6463a.s((i17 >> 9) & 14, nVar, rVar, false, true);
                rVar.t(false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1551g(f6, f10, nVar, i10);
        }
    }
}
