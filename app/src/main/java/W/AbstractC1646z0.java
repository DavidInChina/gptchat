package W;

import E.C0436u;
import X.AbstractC1670d;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1724m0;
import Z.C1741v0;
import androidx.compose.material3.MinimumInteractiveModifier;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import nf.AbstractC4828h;
import wf.AbstractC6216a;
import z.AbstractC6652A0;
import z.AbstractC6659E;
import z.AbstractC6696f;
import z.C6721r0;
import z.C6729v0;
import z.C6737z0;

/* renamed from: W.z0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1646z0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f20635a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f20636b = 20;

    /* renamed from: c  reason: collision with root package name */
    public static final float f20637c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f20638d;

    static {
        float f6 = 2;
        f20635a = f6;
        f20637c = f6;
        f20638d = f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z10, wf.k kVar, AbstractC4326r abstractC4326r, boolean z11, C1626v0 c1626v0, D.m mVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        C4323o c4323o;
        int i13;
        boolean z12;
        C1626v0 c1626v02;
        int i14;
        D.m mVar2;
        D.m mVar3;
        C1626v0 c1626v03;
        boolean z13;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        int i15;
        D.m mVar4;
        boolean z14;
        C1626v0 c1626v04;
        M0.a aVar;
        AbstractC6216a abstractC6216a;
        boolean z15;
        boolean z16;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1406741137);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.h(z10)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.i(kVar)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
        }
        int i22 = i11 & 4;
        if (i22 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            c4323o = abstractC4326r;
            if (rVar.g(c4323o)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i12 |= i19;
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                z12 = z11;
                if (rVar.h(z12)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i12 |= i18;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        c1626v02 = c1626v0;
                        if (rVar.g(c1626v02)) {
                            i17 = 16384;
                            i12 |= i17;
                        }
                    } else {
                        c1626v02 = c1626v0;
                    }
                    i17 = 8192;
                    i12 |= i17;
                } else {
                    c1626v02 = c1626v0;
                }
                i14 = i11 & 32;
                if (i14 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    mVar2 = mVar;
                    if (rVar.g(mVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                    if ((74899 & i12) != 74898 && rVar.B()) {
                        rVar.P();
                        abstractC4326r2 = c4323o;
                        z13 = z12;
                        c1626v03 = c1626v02;
                        mVar3 = mVar2;
                    } else {
                        rVar.R();
                        i15 = i10 & 1;
                        io.sentry.hints.i iVar = C1723m.f22654Y;
                        if (i15 == 0 && !rVar.A()) {
                            rVar.P();
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                        } else {
                            if (i22 != 0) {
                                c4323o = C4323o.f37719b;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                c1626v02 = AbstractC1523a1.b(rVar);
                            }
                            if (i14 != 0) {
                                rVar.W(1557792488);
                                Object K10 = rVar.K();
                                if (K10 == iVar) {
                                    K10 = kotlin.jvm.internal.m.d();
                                    rVar.h0(K10);
                                }
                                rVar.t(false);
                                mVar4 = (D.m) K10;
                                z14 = z12;
                                c1626v04 = c1626v02;
                                AbstractC4326r abstractC4326r3 = c4323o;
                                int i23 = i12;
                                abstractC4326r2 = abstractC4326r3;
                                rVar.u();
                                if (z10) {
                                    aVar = M0.a.f11366Y;
                                } else {
                                    aVar = M0.a.f11367Z;
                                }
                                rVar.W(1557792614);
                                if (kVar != null) {
                                    rVar.W(1557792657);
                                    if ((i23 & 112) == 32) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if ((i23 & 14) == 4) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    boolean z17 = z15 | z16;
                                    Object K11 = rVar.K();
                                    if (z17 || K11 == iVar) {
                                        K11 = new J.e(kVar, z10, 1);
                                        rVar.h0(K11);
                                    }
                                    abstractC6216a = (AbstractC6216a) K11;
                                    rVar.t(false);
                                } else {
                                    abstractC6216a = null;
                                }
                                rVar.t(false);
                                c(aVar, abstractC6216a, abstractC4326r2, z14, c1626v04, mVar4, rVar, (i23 & 896) | (i23 & 7168) | (57344 & i23) | (458752 & i23), 0);
                                z13 = z14;
                                c1626v03 = c1626v04;
                                mVar3 = mVar4;
                            }
                        }
                        z14 = z12;
                        c1626v04 = c1626v02;
                        mVar4 = mVar2;
                        AbstractC4326r abstractC4326r32 = c4323o;
                        int i232 = i12;
                        abstractC4326r2 = abstractC4326r32;
                        rVar.u();
                        if (z10) {
                        }
                        rVar.W(1557792614);
                        if (kVar != null) {
                        }
                        rVar.t(false);
                        c(aVar, abstractC6216a, abstractC4326r2, z14, c1626v04, mVar4, rVar, (i232 & 896) | (i232 & 7168) | (57344 & i232) | (458752 & i232), 0);
                        z13 = z14;
                        c1626v03 = c1626v04;
                        mVar3 = mVar4;
                    }
                    v10 = rVar.v();
                    if (v10 == null) {
                        v10.f22739d = new C1631w0(z10, kVar, abstractC4326r2, z13, c1626v03, mVar3, i10, i11, 0);
                        return;
                    }
                    return;
                }
                mVar2 = mVar;
                if ((74899 & i12) != 74898) {
                }
                rVar.R();
                i15 = i10 & 1;
                io.sentry.hints.i iVar2 = C1723m.f22654Y;
                if (i15 == 0) {
                }
                if (i22 != 0) {
                }
                if (i13 != 0) {
                }
                if ((i11 & 16) != 0) {
                }
                if (i14 != 0) {
                }
                z14 = z12;
                c1626v04 = c1626v02;
                mVar4 = mVar2;
                AbstractC4326r abstractC4326r322 = c4323o;
                int i2322 = i12;
                abstractC4326r2 = abstractC4326r322;
                rVar.u();
                if (z10) {
                }
                rVar.W(1557792614);
                if (kVar != null) {
                }
                rVar.t(false);
                c(aVar, abstractC6216a, abstractC4326r2, z14, c1626v04, mVar4, rVar, (i2322 & 896) | (i2322 & 7168) | (57344 & i2322) | (458752 & i2322), 0);
                z13 = z14;
                c1626v03 = c1626v04;
                mVar3 = mVar4;
                v10 = rVar.v();
                if (v10 == null) {
                }
            }
            z12 = z11;
            if ((i10 & 24576) == 0) {
            }
            i14 = i11 & 32;
            if (i14 != 0) {
            }
            mVar2 = mVar;
            if ((74899 & i12) != 74898) {
            }
            rVar.R();
            i15 = i10 & 1;
            io.sentry.hints.i iVar22 = C1723m.f22654Y;
            if (i15 == 0) {
            }
            if (i22 != 0) {
            }
            if (i13 != 0) {
            }
            if ((i11 & 16) != 0) {
            }
            if (i14 != 0) {
            }
            z14 = z12;
            c1626v04 = c1626v02;
            mVar4 = mVar2;
            AbstractC4326r abstractC4326r3222 = c4323o;
            int i23222 = i12;
            abstractC4326r2 = abstractC4326r3222;
            rVar.u();
            if (z10) {
            }
            rVar.W(1557792614);
            if (kVar != null) {
            }
            rVar.t(false);
            c(aVar, abstractC6216a, abstractC4326r2, z14, c1626v04, mVar4, rVar, (i23222 & 896) | (i23222 & 7168) | (57344 & i23222) | (458752 & i23222), 0);
            z13 = z14;
            c1626v03 = c1626v04;
            mVar3 = mVar4;
            v10 = rVar.v();
            if (v10 == null) {
            }
        }
        c4323o = abstractC4326r;
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        z12 = z11;
        if ((i10 & 24576) == 0) {
        }
        i14 = i11 & 32;
        if (i14 != 0) {
        }
        mVar2 = mVar;
        if ((74899 & i12) != 74898) {
        }
        rVar.R();
        i15 = i10 & 1;
        io.sentry.hints.i iVar222 = C1723m.f22654Y;
        if (i15 == 0) {
        }
        if (i22 != 0) {
        }
        if (i13 != 0) {
        }
        if ((i11 & 16) != 0) {
        }
        if (i14 != 0) {
        }
        z14 = z12;
        c1626v04 = c1626v02;
        mVar4 = mVar2;
        AbstractC4326r abstractC4326r32222 = c4323o;
        int i232222 = i12;
        abstractC4326r2 = abstractC4326r32222;
        rVar.u();
        if (z10) {
        }
        rVar.W(1557792614);
        if (kVar != null) {
        }
        rVar.t(false);
        c(aVar, abstractC6216a, abstractC4326r2, z14, c1626v04, mVar4, rVar, (i232222 & 896) | (i232222 & 7168) | (57344 & i232222) | (458752 & i232222), 0);
        z13 = z14;
        c1626v03 = c1626v04;
        mVar3 = mVar4;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z10, M0.a aVar, AbstractC4326r abstractC4326r, C1626v0 c1626v0, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        float f6;
        int ordinal;
        float f10;
        int ordinal2;
        float f11;
        int ordinal3;
        Object K10;
        io.sentry.hints.i iVar;
        M0.a aVar2;
        long j6;
        int i12;
        long j10;
        Z.l1 l1Var;
        M0.a aVar3;
        Object g02;
        long j11;
        Object obj;
        Object obj2;
        boolean g10;
        Object K11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(2007131616);
        if ((i10 & 6) == 0) {
            if (rVar.h(z10)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i11 = i18 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.g(aVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i11 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (rVar.g(abstractC4326r)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i11 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.g(c1626v0)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i11 |= i15;
        }
        if ((i11 & 1171) == 1170 && rVar.B()) {
            rVar.P();
        } else {
            C6729v0 x10 = AbstractC6696f.x(aVar, null, rVar, (i11 >> 3) & 14, 2);
            C1641y0 c1641y0 = C1641y0.f20616h0;
            rVar.W(-1338768149);
            C6737z0 c6737z0 = AbstractC6652A0.f51116a;
            rVar.W(-142660079);
            rVar.W(1800065638);
            int ordinal4 = ((M0.a) x10.b()).ordinal();
            float f12 = 0.0f;
            if (ordinal4 != 0) {
                if (ordinal4 != 1) {
                    if (ordinal4 != 2) {
                        throw new RuntimeException();
                    }
                } else {
                    f6 = 0.0f;
                    rVar.t(false);
                    Float valueOf = Float.valueOf(f6);
                    C1724m0 c1724m0 = x10.f51386c;
                    rVar.W(1800065638);
                    ordinal = ((M0.a) c1724m0.getValue()).ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                throw new RuntimeException();
                            }
                        } else {
                            f10 = 0.0f;
                            rVar.t(false);
                            C6721r0 n10 = AbstractC6696f.n(x10, valueOf, Float.valueOf(f10), (AbstractC6659E) c1641y0.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                            rVar.t(false);
                            rVar.t(false);
                            C1641y0 c1641y02 = C1641y0.f20615Z;
                            rVar.W(-1338768149);
                            rVar.W(-142660079);
                            rVar.W(-1426969489);
                            ordinal2 = ((M0.a) x10.b()).ordinal();
                            if (ordinal2 == 0 && ordinal2 != 1) {
                                if (ordinal2 == 2) {
                                    f11 = 1.0f;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                f11 = 0.0f;
                            }
                            rVar.t(false);
                            Float valueOf2 = Float.valueOf(f11);
                            rVar.W(-1426969489);
                            ordinal3 = ((M0.a) c1724m0.getValue()).ordinal();
                            if (ordinal3 != 0 && ordinal3 != 1) {
                                if (ordinal3 != 2) {
                                    f12 = 1.0f;
                                } else {
                                    throw new RuntimeException();
                                }
                            }
                            rVar.t(false);
                            C6721r0 n11 = AbstractC6696f.n(x10, valueOf2, Float.valueOf(f12), (AbstractC6659E) c1641y02.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                            rVar.t(false);
                            rVar.t(false);
                            rVar.W(-661291556);
                            K10 = rVar.K();
                            iVar = C1723m.f22654Y;
                            if (K10 == iVar) {
                                K10 = new C1621u0();
                                rVar.h0(K10);
                            }
                            C1621u0 c1621u0 = (C1621u0) K10;
                            rVar.t(false);
                            c1626v0.getClass();
                            rVar.W(-507585681);
                            aVar2 = M0.a.f11367Z;
                            if (aVar == aVar2) {
                                j6 = c1626v0.f20491b;
                            } else {
                                j6 = c1626v0.f20490a;
                            }
                            if (aVar == aVar2) {
                                i12 = 100;
                            } else {
                                i12 = 50;
                            }
                            Z.l1 a5 = y.l0.a(j6, AbstractC6696f.v(i12, 0, null, 6), null, rVar, 0, 12);
                            rVar.t(false);
                            rVar.W(360729865);
                            if (z10) {
                                int ordinal5 = aVar.ordinal();
                                if (ordinal5 != 0) {
                                    if (ordinal5 != 1) {
                                        if (ordinal5 != 2) {
                                            throw new RuntimeException();
                                        }
                                    } else {
                                        j10 = c1626v0.f20493d;
                                    }
                                }
                                j10 = c1626v0.f20492c;
                            } else {
                                int ordinal6 = aVar.ordinal();
                                if (ordinal6 != 0) {
                                    if (ordinal6 != 1) {
                                        if (ordinal6 == 2) {
                                            j10 = c1626v0.f20496g;
                                        } else {
                                            throw new RuntimeException();
                                        }
                                    } else {
                                        j10 = c1626v0.f20495f;
                                    }
                                } else {
                                    j10 = c1626v0.f20494e;
                                }
                            }
                            if (z10) {
                                rVar.W(1143723294);
                                if (aVar == aVar2) {
                                    i14 = 100;
                                } else {
                                    i14 = 50;
                                }
                                aVar3 = aVar2;
                                l1Var = a5;
                                g02 = y.l0.a(j10, AbstractC6696f.v(i14, 0, null, 6), null, rVar, 0, 12);
                                rVar.t(false);
                            } else {
                                l1Var = a5;
                                aVar3 = aVar2;
                                rVar.W(1143723480);
                                g02 = AbstractC4828h.g0(new r0.r(j10), rVar);
                                rVar.t(false);
                            }
                            Object obj3 = g02;
                            rVar.t(false);
                            rVar.W(1009643462);
                            if (z10) {
                                int ordinal7 = aVar.ordinal();
                                if (ordinal7 != 0) {
                                    if (ordinal7 != 1) {
                                        if (ordinal7 != 2) {
                                            throw new RuntimeException();
                                        }
                                    } else {
                                        j11 = c1626v0.f20498i;
                                    }
                                }
                                j11 = c1626v0.f20497h;
                            } else {
                                int ordinal8 = aVar.ordinal();
                                if (ordinal8 != 0) {
                                    if (ordinal8 != 1) {
                                        if (ordinal8 == 2) {
                                            j11 = c1626v0.f20501l;
                                        } else {
                                            throw new RuntimeException();
                                        }
                                    } else {
                                        j11 = c1626v0.f20500k;
                                    }
                                } else {
                                    j11 = c1626v0.f20499j;
                                }
                            }
                            if (z10) {
                                rVar.W(1209374481);
                                if (aVar == aVar3) {
                                    i13 = 100;
                                } else {
                                    i13 = 50;
                                }
                                obj = obj3;
                                obj2 = y.l0.a(j11, AbstractC6696f.v(i13, 0, null, 6), null, rVar, 0, 12);
                                rVar.t(false);
                            } else {
                                obj = obj3;
                                rVar.W(1209374667);
                                obj2 = AbstractC4828h.g0(new r0.r(j11), rVar);
                                rVar.t(false);
                            }
                            rVar.t(false);
                            AbstractC4326r h10 = androidx.compose.foundation.layout.e.h(androidx.compose.foundation.layout.e.p(abstractC4326r, C4310b.f37697j0), f20636b);
                            rVar.W(-661291243);
                            Object obj4 = obj;
                            Z.l1 l1Var2 = l1Var;
                            g10 = rVar.g(obj4) | rVar.g(obj2) | rVar.g(l1Var2) | rVar.g(n10) | rVar.g(n11);
                            K11 = rVar.K();
                            if (!g10 || K11 == iVar) {
                                K11 = new C0436u(obj4, obj2, l1Var2, n10, n11, c1621u0, 1);
                                rVar.h0(K11);
                            }
                            rVar.t(false);
                            androidx.compose.foundation.a.a(h10, (wf.k) K11, rVar, 0);
                        }
                    }
                    f10 = 1.0f;
                    rVar.t(false);
                    C6721r0 n102 = AbstractC6696f.n(x10, valueOf, Float.valueOf(f10), (AbstractC6659E) c1641y0.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                    rVar.t(false);
                    rVar.t(false);
                    C1641y0 c1641y022 = C1641y0.f20615Z;
                    rVar.W(-1338768149);
                    rVar.W(-142660079);
                    rVar.W(-1426969489);
                    ordinal2 = ((M0.a) x10.b()).ordinal();
                    if (ordinal2 == 0) {
                    }
                    f11 = 0.0f;
                    rVar.t(false);
                    Float valueOf22 = Float.valueOf(f11);
                    rVar.W(-1426969489);
                    ordinal3 = ((M0.a) c1724m0.getValue()).ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 2) {
                        }
                    }
                    rVar.t(false);
                    C6721r0 n112 = AbstractC6696f.n(x10, valueOf22, Float.valueOf(f12), (AbstractC6659E) c1641y022.invoke(x10.c(), rVar, 0), c6737z0, rVar);
                    rVar.t(false);
                    rVar.t(false);
                    rVar.W(-661291556);
                    K10 = rVar.K();
                    iVar = C1723m.f22654Y;
                    if (K10 == iVar) {
                    }
                    C1621u0 c1621u02 = (C1621u0) K10;
                    rVar.t(false);
                    c1626v0.getClass();
                    rVar.W(-507585681);
                    aVar2 = M0.a.f11367Z;
                    if (aVar == aVar2) {
                    }
                    if (aVar == aVar2) {
                    }
                    Z.l1 a52 = y.l0.a(j6, AbstractC6696f.v(i12, 0, null, 6), null, rVar, 0, 12);
                    rVar.t(false);
                    rVar.W(360729865);
                    if (z10) {
                    }
                    if (z10) {
                    }
                    Object obj32 = g02;
                    rVar.t(false);
                    rVar.W(1009643462);
                    if (z10) {
                    }
                    if (z10) {
                    }
                    rVar.t(false);
                    AbstractC4326r h102 = androidx.compose.foundation.layout.e.h(androidx.compose.foundation.layout.e.p(abstractC4326r, C4310b.f37697j0), f20636b);
                    rVar.W(-661291243);
                    Object obj42 = obj;
                    Z.l1 l1Var22 = l1Var;
                    g10 = rVar.g(obj42) | rVar.g(obj2) | rVar.g(l1Var22) | rVar.g(n102) | rVar.g(n112);
                    K11 = rVar.K();
                    if (!g10) {
                    }
                    K11 = new C0436u(obj42, obj2, l1Var22, n102, n112, c1621u02, 1);
                    rVar.h0(K11);
                    rVar.t(false);
                    androidx.compose.foundation.a.a(h102, (wf.k) K11, rVar, 0);
                }
            }
            f6 = 1.0f;
            rVar.t(false);
            Float valueOf3 = Float.valueOf(f6);
            C1724m0 c1724m02 = x10.f51386c;
            rVar.W(1800065638);
            ordinal = ((M0.a) c1724m02.getValue()).ordinal();
            if (ordinal != 0) {
            }
            f10 = 1.0f;
            rVar.t(false);
            C6721r0 n1022 = AbstractC6696f.n(x10, valueOf3, Float.valueOf(f10), (AbstractC6659E) c1641y0.invoke(x10.c(), rVar, 0), c6737z0, rVar);
            rVar.t(false);
            rVar.t(false);
            C1641y0 c1641y0222 = C1641y0.f20615Z;
            rVar.W(-1338768149);
            rVar.W(-142660079);
            rVar.W(-1426969489);
            ordinal2 = ((M0.a) x10.b()).ordinal();
            if (ordinal2 == 0) {
            }
            f11 = 0.0f;
            rVar.t(false);
            Float valueOf222 = Float.valueOf(f11);
            rVar.W(-1426969489);
            ordinal3 = ((M0.a) c1724m02.getValue()).ordinal();
            if (ordinal3 != 0) {
            }
            rVar.t(false);
            C6721r0 n1122 = AbstractC6696f.n(x10, valueOf222, Float.valueOf(f12), (AbstractC6659E) c1641y0222.invoke(x10.c(), rVar, 0), c6737z0, rVar);
            rVar.t(false);
            rVar.t(false);
            rVar.W(-661291556);
            K10 = rVar.K();
            iVar = C1723m.f22654Y;
            if (K10 == iVar) {
            }
            C1621u0 c1621u022 = (C1621u0) K10;
            rVar.t(false);
            c1626v0.getClass();
            rVar.W(-507585681);
            aVar2 = M0.a.f11367Z;
            if (aVar == aVar2) {
            }
            if (aVar == aVar2) {
            }
            Z.l1 a522 = y.l0.a(j6, AbstractC6696f.v(i12, 0, null, 6), null, rVar, 0, 12);
            rVar.t(false);
            rVar.W(360729865);
            if (z10) {
            }
            if (z10) {
            }
            Object obj322 = g02;
            rVar.t(false);
            rVar.W(1009643462);
            if (z10) {
            }
            if (z10) {
            }
            rVar.t(false);
            AbstractC4326r h1022 = androidx.compose.foundation.layout.e.h(androidx.compose.foundation.layout.e.p(abstractC4326r, C4310b.f37697j0), f20636b);
            rVar.W(-661291243);
            Object obj422 = obj;
            Z.l1 l1Var222 = l1Var;
            g10 = rVar.g(obj422) | rVar.g(obj2) | rVar.g(l1Var222) | rVar.g(n1022) | rVar.g(n1122);
            K11 = rVar.K();
            if (!g10) {
            }
            K11 = new C0436u(obj422, obj2, l1Var222, n1022, n1122, c1621u022, 1);
            rVar.h0(K11);
            rVar.t(false);
            androidx.compose.foundation.a.a(h1022, (wf.k) K11, rVar, 0);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1636x0(z10, aVar, abstractC4326r, c1626v0, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(M0.a aVar, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, boolean z10, C1626v0 c1626v0, D.m mVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        boolean z11;
        C1626v0 c1626v02;
        int i14;
        D.m mVar2;
        C1626v0 c1626v03;
        boolean z12;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        int i15;
        int i16;
        boolean z13;
        AbstractC4326r abstractC4326r4;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1608358065);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.g(aVar)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i12 = i22 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.i(abstractC6216a)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i12 |= i21;
        }
        int i23 = i11 & 4;
        if (i23 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i20 = 256;
            } else {
                i20 = 128;
            }
            i12 |= i20;
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                z11 = z10;
                if (rVar.h(z11)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i12 |= i19;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        c1626v02 = c1626v0;
                        if (rVar.g(c1626v02)) {
                            i18 = 16384;
                            i12 |= i18;
                        }
                    } else {
                        c1626v02 = c1626v0;
                    }
                    i18 = 8192;
                    i12 |= i18;
                } else {
                    c1626v02 = c1626v0;
                }
                i14 = i11 & 32;
                if (i14 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    mVar2 = mVar;
                    if (rVar.g(mVar2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                    if ((74899 & i12) != 74898 && rVar.B()) {
                        rVar.P();
                        abstractC4326r3 = abstractC4326r2;
                        z12 = z11;
                        c1626v03 = c1626v02;
                    } else {
                        rVar.R();
                        i15 = i10 & 1;
                        AbstractC4326r abstractC4326r5 = C4323o.f37719b;
                        if (i15 == 0 && !rVar.A()) {
                            rVar.P();
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                        } else {
                            if (i23 != 0) {
                                abstractC4326r2 = abstractC4326r5;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                c1626v02 = AbstractC1523a1.b(rVar);
                            }
                            if (i14 != 0) {
                                rVar.W(1797978171);
                                Object K10 = rVar.K();
                                if (K10 == C1723m.f22654Y) {
                                    K10 = kotlin.jvm.internal.m.d();
                                    rVar.h0(K10);
                                }
                                rVar.t(false);
                                i16 = i12;
                                mVar2 = (D.m) K10;
                                C1626v0 c1626v04 = c1626v02;
                                boolean z14 = z11;
                                AbstractC4326r abstractC4326r6 = abstractC4326r2;
                                rVar.u();
                                rVar.W(1797978252);
                                if (abstractC6216a != null) {
                                    z13 = false;
                                    abstractC4326r4 = U3.f.p0(aVar, mVar2, V.v.a(false, AbstractC1670d.f21488a / 2, rVar, 54, 4), z14, new L0.g(1), abstractC6216a);
                                } else {
                                    z13 = false;
                                    abstractC4326r4 = abstractC4326r5;
                                }
                                rVar.t(z13);
                                if (abstractC6216a != null) {
                                    Z.m1 m1Var = AbstractC1617t1.f20423a;
                                    abstractC4326r5 = MinimumInteractiveModifier.f24779b;
                                }
                                b(z14, aVar, androidx.compose.foundation.layout.a.r(abstractC4326r6.g(abstractC4326r5).g(abstractC4326r4), f20635a), c1626v04, rVar, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                                abstractC4326r3 = abstractC4326r6;
                                z12 = z14;
                                c1626v03 = c1626v04;
                            }
                        }
                        i16 = i12;
                        C1626v0 c1626v042 = c1626v02;
                        boolean z142 = z11;
                        AbstractC4326r abstractC4326r62 = abstractC4326r2;
                        rVar.u();
                        rVar.W(1797978252);
                        if (abstractC6216a != null) {
                        }
                        rVar.t(z13);
                        if (abstractC6216a != null) {
                        }
                        b(z142, aVar, androidx.compose.foundation.layout.a.r(abstractC4326r62.g(abstractC4326r5).g(abstractC4326r4), f20635a), c1626v042, rVar, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                        abstractC4326r3 = abstractC4326r62;
                        z12 = z142;
                        c1626v03 = c1626v042;
                    }
                    v10 = rVar.v();
                    if (v10 == null) {
                        v10.f22739d = new y.H(aVar, abstractC6216a, abstractC4326r3, z12, c1626v03, mVar2, i10, i11);
                        return;
                    }
                    return;
                }
                mVar2 = mVar;
                if ((74899 & i12) != 74898) {
                }
                rVar.R();
                i15 = i10 & 1;
                AbstractC4326r abstractC4326r52 = C4323o.f37719b;
                if (i15 == 0) {
                }
                if (i23 != 0) {
                }
                if (i13 != 0) {
                }
                if ((i11 & 16) != 0) {
                }
                if (i14 != 0) {
                }
                i16 = i12;
                C1626v0 c1626v0422 = c1626v02;
                boolean z1422 = z11;
                AbstractC4326r abstractC4326r622 = abstractC4326r2;
                rVar.u();
                rVar.W(1797978252);
                if (abstractC6216a != null) {
                }
                rVar.t(z13);
                if (abstractC6216a != null) {
                }
                b(z1422, aVar, androidx.compose.foundation.layout.a.r(abstractC4326r622.g(abstractC4326r52).g(abstractC4326r4), f20635a), c1626v0422, rVar, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
                abstractC4326r3 = abstractC4326r622;
                z12 = z1422;
                c1626v03 = c1626v0422;
                v10 = rVar.v();
                if (v10 == null) {
                }
            }
            z11 = z10;
            if ((i10 & 24576) == 0) {
            }
            i14 = i11 & 32;
            if (i14 != 0) {
            }
            mVar2 = mVar;
            if ((74899 & i12) != 74898) {
            }
            rVar.R();
            i15 = i10 & 1;
            AbstractC4326r abstractC4326r522 = C4323o.f37719b;
            if (i15 == 0) {
            }
            if (i23 != 0) {
            }
            if (i13 != 0) {
            }
            if ((i11 & 16) != 0) {
            }
            if (i14 != 0) {
            }
            i16 = i12;
            C1626v0 c1626v04222 = c1626v02;
            boolean z14222 = z11;
            AbstractC4326r abstractC4326r6222 = abstractC4326r2;
            rVar.u();
            rVar.W(1797978252);
            if (abstractC6216a != null) {
            }
            rVar.t(z13);
            if (abstractC6216a != null) {
            }
            b(z14222, aVar, androidx.compose.foundation.layout.a.r(abstractC4326r6222.g(abstractC4326r522).g(abstractC4326r4), f20635a), c1626v04222, rVar, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
            abstractC4326r3 = abstractC4326r6222;
            z12 = z14222;
            c1626v03 = c1626v04222;
            v10 = rVar.v();
            if (v10 == null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        z11 = z10;
        if ((i10 & 24576) == 0) {
        }
        i14 = i11 & 32;
        if (i14 != 0) {
        }
        mVar2 = mVar;
        if ((74899 & i12) != 74898) {
        }
        rVar.R();
        i15 = i10 & 1;
        AbstractC4326r abstractC4326r5222 = C4323o.f37719b;
        if (i15 == 0) {
        }
        if (i23 != 0) {
        }
        if (i13 != 0) {
        }
        if ((i11 & 16) != 0) {
        }
        if (i14 != 0) {
        }
        i16 = i12;
        C1626v0 c1626v042222 = c1626v02;
        boolean z142222 = z11;
        AbstractC4326r abstractC4326r62222 = abstractC4326r2;
        rVar.u();
        rVar.W(1797978252);
        if (abstractC6216a != null) {
        }
        rVar.t(z13);
        if (abstractC6216a != null) {
        }
        b(z142222, aVar, androidx.compose.foundation.layout.a.r(abstractC4326r62222.g(abstractC4326r5222).g(abstractC4326r4), f20635a), c1626v042222, rVar, ((i16 >> 9) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 7168));
        abstractC4326r3 = abstractC4326r62222;
        z12 = z142222;
        c1626v03 = c1626v042222;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }
}
