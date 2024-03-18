package W;

import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1741v0;
import androidx.compose.material3.MinimumInteractiveModifier;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import nf.AbstractC4828h;
import wf.AbstractC6216a;
import z.AbstractC6696f;
import z.AbstractC6704j;

/* loaded from: classes2.dex */
public abstract class K2 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f19293a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f19294b = 12;

    /* renamed from: c  reason: collision with root package name */
    public static final float f19295c;

    static {
        float f6 = 2;
        f19293a = f6;
        f19295c = f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z10, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, boolean z11, J2 j22, D.m mVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        boolean z12;
        J2 j23;
        int i14;
        D.m mVar2;
        D.m mVar3;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        int i15;
        J2 j24;
        D.m mVar4;
        J2 j25;
        AbstractC4326r abstractC4326r4;
        boolean z13;
        float f6;
        long j6;
        Z.l1 l1Var;
        J2 j26;
        Object g02;
        Object obj;
        AbstractC4326r abstractC4326r5;
        boolean g10;
        Object K10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(408580840);
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
            if (rVar.i(abstractC6216a)) {
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
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
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
                        j23 = j22;
                        if (rVar.g(j23)) {
                            i17 = 16384;
                            i12 |= i17;
                        }
                    } else {
                        j23 = j22;
                    }
                    i17 = 8192;
                    i12 |= i17;
                } else {
                    j23 = j22;
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
                    if ((i12 & 74899) != 74898 && rVar.B()) {
                        rVar.P();
                        abstractC4326r3 = abstractC4326r2;
                        mVar3 = mVar2;
                    } else {
                        rVar.R();
                        i15 = i10 & 1;
                        io.sentry.hints.i iVar = C1723m.f22654Y;
                        AbstractC4326r abstractC4326r6 = C4323o.f37719b;
                        if (i15 == 0 && !rVar.A()) {
                            rVar.P();
                            j25 = j22;
                            abstractC4326r4 = abstractC4326r2;
                            mVar4 = mVar2;
                        } else {
                            if (i22 != 0) {
                                abstractC4326r2 = abstractC4326r6;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) == 0) {
                                rVar.W(-1191566130);
                                P0 p02 = (P0) rVar.m(R0.f19593a);
                                j24 = p02.f19513Y;
                                if (j24 == null) {
                                    float f10 = X.y.f21713a;
                                    j24 = new J2(R0.d(p02, 26), R0.d(p02, 19), r0.r.b(R0.d(p02, 18), 0.38f), r0.r.b(R0.d(p02, 18), 0.38f));
                                    p02.f19513Y = j24;
                                }
                                rVar.t(false);
                            } else {
                                j24 = j22;
                            }
                            if (i14 == 0) {
                                rVar.W(735546075);
                                Object K11 = rVar.K();
                                if (K11 == iVar) {
                                    K11 = kotlin.jvm.internal.m.d();
                                    rVar.h0(K11);
                                }
                                rVar.t(false);
                                mVar4 = (D.m) K11;
                            } else {
                                mVar4 = mVar;
                            }
                            j25 = j24;
                            abstractC4326r4 = abstractC4326r2;
                        }
                        z13 = z12;
                        rVar.u();
                        if (!z10) {
                            f6 = f19294b / 2;
                        } else {
                            f6 = 0;
                        }
                        Z.l1 a5 = AbstractC6704j.a(f6, AbstractC6696f.v(100, 0, null, 6), null, rVar, 48, 12);
                        j25.getClass();
                        rVar.W(-1840145292);
                        if (!z13 && z10) {
                            j6 = j25.f19256a;
                        } else if (!z13 && !z10) {
                            j6 = j25.f19257b;
                        } else if (z13 && z10) {
                            j6 = j25.f19258c;
                        } else {
                            j6 = j25.f19259d;
                        }
                        if (!z13) {
                            rVar.W(-1943768162);
                            l1Var = a5;
                            j26 = j25;
                            g02 = y.l0.a(j6, AbstractC6696f.v(100, 0, null, 6), null, rVar, 48, 12);
                            rVar.t(false);
                        } else {
                            l1Var = a5;
                            j26 = j25;
                            rVar.W(-1943768057);
                            g02 = AbstractC4828h.g0(new r0.r(j6), rVar);
                            rVar.t(false);
                        }
                        Object obj2 = g02;
                        rVar.t(false);
                        rVar.W(735546399);
                        if (abstractC6216a == null) {
                            obj = obj2;
                            abstractC4326r5 = M3.H.p0(abstractC4326r6, z10, mVar4, V.v.a(false, X.y.f21714b / 2, rVar, 54, 4), z13, new L0.g(3), abstractC6216a);
                        } else {
                            obj = obj2;
                            abstractC4326r5 = abstractC4326r6;
                        }
                        rVar.t(false);
                        if (abstractC6216a != null) {
                            Z.m1 m1Var = AbstractC1617t1.f20423a;
                            abstractC4326r6 = MinimumInteractiveModifier.f24779b;
                        }
                        AbstractC4326r h10 = androidx.compose.foundation.layout.e.h(androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.e.p(abstractC4326r4.g(abstractC4326r6).g(abstractC4326r5), C4310b.f37697j0), f19293a), X.y.f21713a);
                        rVar.W(735547384);
                        Object obj3 = obj;
                        Z.l1 l1Var2 = l1Var;
                        g10 = rVar.g(obj3) | rVar.g(l1Var2);
                        K10 = rVar.K();
                        if (!g10 || K10 == iVar) {
                            K10 = new C1559h2(obj3, 1, l1Var2);
                            rVar.h0(K10);
                        }
                        rVar.t(false);
                        androidx.compose.foundation.a.a(h10, (wf.k) K10, rVar, 0);
                        j23 = j26;
                        abstractC4326r3 = abstractC4326r4;
                        z12 = z13;
                        mVar3 = mVar4;
                    }
                    v10 = rVar.v();
                    if (v10 == null) {
                        v10.f22739d = new C1631w0(z10, abstractC6216a, abstractC4326r3, z12, j23, mVar3, i10, i11, 1);
                        return;
                    }
                    return;
                }
                mVar2 = mVar;
                if ((i12 & 74899) != 74898) {
                }
                rVar.R();
                i15 = i10 & 1;
                io.sentry.hints.i iVar2 = C1723m.f22654Y;
                AbstractC4326r abstractC4326r62 = C4323o.f37719b;
                if (i15 == 0) {
                }
                if (i22 != 0) {
                }
                if (i13 != 0) {
                }
                if ((i11 & 16) == 0) {
                }
                if (i14 == 0) {
                }
                j25 = j24;
                abstractC4326r4 = abstractC4326r2;
                z13 = z12;
                rVar.u();
                if (!z10) {
                }
                Z.l1 a52 = AbstractC6704j.a(f6, AbstractC6696f.v(100, 0, null, 6), null, rVar, 48, 12);
                j25.getClass();
                rVar.W(-1840145292);
                if (!z13) {
                }
                if (!z13) {
                }
                if (z13) {
                }
                j6 = j25.f19259d;
                if (!z13) {
                }
                Object obj22 = g02;
                rVar.t(false);
                rVar.W(735546399);
                if (abstractC6216a == null) {
                }
                rVar.t(false);
                if (abstractC6216a != null) {
                }
                AbstractC4326r h102 = androidx.compose.foundation.layout.e.h(androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.e.p(abstractC4326r4.g(abstractC4326r62).g(abstractC4326r5), C4310b.f37697j0), f19293a), X.y.f21713a);
                rVar.W(735547384);
                Object obj32 = obj;
                Z.l1 l1Var22 = l1Var;
                g10 = rVar.g(obj32) | rVar.g(l1Var22);
                K10 = rVar.K();
                if (!g10) {
                }
                K10 = new C1559h2(obj32, 1, l1Var22);
                rVar.h0(K10);
                rVar.t(false);
                androidx.compose.foundation.a.a(h102, (wf.k) K10, rVar, 0);
                j23 = j26;
                abstractC4326r3 = abstractC4326r4;
                z12 = z13;
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
            if ((i12 & 74899) != 74898) {
            }
            rVar.R();
            i15 = i10 & 1;
            io.sentry.hints.i iVar22 = C1723m.f22654Y;
            AbstractC4326r abstractC4326r622 = C4323o.f37719b;
            if (i15 == 0) {
            }
            if (i22 != 0) {
            }
            if (i13 != 0) {
            }
            if ((i11 & 16) == 0) {
            }
            if (i14 == 0) {
            }
            j25 = j24;
            abstractC4326r4 = abstractC4326r2;
            z13 = z12;
            rVar.u();
            if (!z10) {
            }
            Z.l1 a522 = AbstractC6704j.a(f6, AbstractC6696f.v(100, 0, null, 6), null, rVar, 48, 12);
            j25.getClass();
            rVar.W(-1840145292);
            if (!z13) {
            }
            if (!z13) {
            }
            if (z13) {
            }
            j6 = j25.f19259d;
            if (!z13) {
            }
            Object obj222 = g02;
            rVar.t(false);
            rVar.W(735546399);
            if (abstractC6216a == null) {
            }
            rVar.t(false);
            if (abstractC6216a != null) {
            }
            AbstractC4326r h1022 = androidx.compose.foundation.layout.e.h(androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.e.p(abstractC4326r4.g(abstractC4326r622).g(abstractC4326r5), C4310b.f37697j0), f19293a), X.y.f21713a);
            rVar.W(735547384);
            Object obj322 = obj;
            Z.l1 l1Var222 = l1Var;
            g10 = rVar.g(obj322) | rVar.g(l1Var222);
            K10 = rVar.K();
            if (!g10) {
            }
            K10 = new C1559h2(obj322, 1, l1Var222);
            rVar.h0(K10);
            rVar.t(false);
            androidx.compose.foundation.a.a(h1022, (wf.k) K10, rVar, 0);
            j23 = j26;
            abstractC4326r3 = abstractC4326r4;
            z12 = z13;
            mVar3 = mVar4;
            v10 = rVar.v();
            if (v10 == null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
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
        if ((i12 & 74899) != 74898) {
        }
        rVar.R();
        i15 = i10 & 1;
        io.sentry.hints.i iVar222 = C1723m.f22654Y;
        AbstractC4326r abstractC4326r6222 = C4323o.f37719b;
        if (i15 == 0) {
        }
        if (i22 != 0) {
        }
        if (i13 != 0) {
        }
        if ((i11 & 16) == 0) {
        }
        if (i14 == 0) {
        }
        j25 = j24;
        abstractC4326r4 = abstractC4326r2;
        z13 = z12;
        rVar.u();
        if (!z10) {
        }
        Z.l1 a5222 = AbstractC6704j.a(f6, AbstractC6696f.v(100, 0, null, 6), null, rVar, 48, 12);
        j25.getClass();
        rVar.W(-1840145292);
        if (!z13) {
        }
        if (!z13) {
        }
        if (z13) {
        }
        j6 = j25.f19259d;
        if (!z13) {
        }
        Object obj2222 = g02;
        rVar.t(false);
        rVar.W(735546399);
        if (abstractC6216a == null) {
        }
        rVar.t(false);
        if (abstractC6216a != null) {
        }
        AbstractC4326r h10222 = androidx.compose.foundation.layout.e.h(androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.e.p(abstractC4326r4.g(abstractC4326r6222).g(abstractC4326r5), C4310b.f37697j0), f19293a), X.y.f21713a);
        rVar.W(735547384);
        Object obj3222 = obj;
        Z.l1 l1Var2222 = l1Var;
        g10 = rVar.g(obj3222) | rVar.g(l1Var2222);
        K10 = rVar.K();
        if (!g10) {
        }
        K10 = new C1559h2(obj3222, 1, l1Var2222);
        rVar.h0(K10);
        rVar.t(false);
        androidx.compose.foundation.a.a(h10222, (wf.k) K10, rVar, 0);
        j23 = j26;
        abstractC4326r3 = abstractC4326r4;
        z12 = z13;
        mVar3 = mVar4;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }
}
