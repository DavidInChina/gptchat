package Id;

import A.AbstractC0044t0;
import Ad.v;
import Df.AbstractC0405d;
import H0.E0;
import H0.Z;
import L.M;
import M3.H;
import N.C1021e;
import N.C1023g;
import W.AbstractC1522a0;
import W.P0;
import W.R0;
import W.k4;
import X.F;
import X.G;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1741v0;
import Z.o1;
import Z.r;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.e0;
import gd.AbstractC3256b;
import hc.J;
import id.AbstractC3557B;
import java.util.List;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import l0.AbstractC4326r;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import p9.AbstractC5102d;
import p9.m;
import r9.C5383F;
import r9.y;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final float f8553a = 600;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Tc.f fVar, AbstractC4326r abstractC4326r, AbstractC6216a abstractC6216a, boolean z10, Y.b bVar, g gVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC6216a abstractC6216a2;
        int i13;
        boolean z11;
        Y.b bVar2;
        g gVar2;
        r rVar;
        g gVar3;
        Y.b bVar3;
        boolean z12;
        AbstractC6216a abstractC6216a3;
        AbstractC4326r abstractC4326r3;
        int i14;
        Y.b bVar4;
        boolean z13;
        AbstractC4326r abstractC4326r4;
        AbstractC6216a abstractC6216a4;
        g gVar4;
        int i15;
        Object K10;
        Object w10;
        AbstractC6216a abstractC6216a5;
        Ad.g y02;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        AbstractC3557B.c0("appState", fVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("VoiceModeSettingsScreen");
        r rVar2 = (r) abstractC1725n;
        rVar2.X(193750028);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(fVar)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
            if ((i10 & 896) != 0) {
                if ((i11 & 4) == 0) {
                    abstractC6216a2 = abstractC6216a;
                    if (rVar2.i(abstractC6216a2)) {
                        i19 = 256;
                        i12 |= i19;
                    }
                } else {
                    abstractC6216a2 = abstractC6216a;
                }
                i19 = 128;
                i12 |= i19;
            } else {
                abstractC6216a2 = abstractC6216a;
            }
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                z11 = z10;
                if (rVar2.h(z11)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i12 |= i18;
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        bVar2 = bVar;
                        if (rVar2.g(bVar2)) {
                            i17 = 16384;
                            i12 |= i17;
                        }
                    } else {
                        bVar2 = bVar;
                    }
                    i17 = 8192;
                    i12 |= i17;
                } else {
                    bVar2 = bVar;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        gVar2 = gVar;
                        if (rVar2.g(gVar2)) {
                            i16 = 131072;
                            i12 |= i16;
                        }
                    } else {
                        gVar2 = gVar;
                    }
                    i16 = 65536;
                    i12 |= i16;
                } else {
                    gVar2 = gVar;
                }
                if ((374491 & i12) != 74898 && rVar2.B()) {
                    rVar2.P();
                    abstractC4326r3 = abstractC4326r2;
                    abstractC6216a3 = abstractC6216a2;
                    z12 = z11;
                    bVar3 = bVar2;
                    gVar3 = gVar2;
                    rVar = rVar2;
                } else {
                    rVar2.R();
                    i14 = i10 & 1;
                    io.sentry.hints.i iVar = C1723m.f22654Y;
                    if (i14 == 0 && !rVar2.A()) {
                        rVar2.P();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        abstractC4326r4 = abstractC4326r2;
                        abstractC6216a4 = abstractC6216a2;
                        z13 = z11;
                        bVar4 = bVar2;
                        gVar4 = gVar2;
                    } else {
                        if (i22 == 0) {
                            a5 = abstractC4326r2;
                        }
                        if ((i11 & 4) != 0) {
                            abstractC6216a5 = new J(fVar, 7);
                            i12 &= -897;
                        } else {
                            abstractC6216a5 = abstractC6216a2;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            bVar2 = H.D((Activity) rVar2.m(m.f42797a), rVar2);
                        }
                        if ((i11 & 32) != 0) {
                            rVar2.W(-490350905);
                            Context context = (Context) rVar2.m(Z.f6888b);
                            boolean booleanValue = ((Boolean) rVar2.m(E0.f6720a)).booleanValue();
                            List list = (List) rVar2.m(AbstractC3256b.f31580a);
                            List list2 = (List) rVar2.m(Ad.k.f814a);
                            e0 a10 = m2.b.a(rVar2);
                            if (a10 != null) {
                                v vVar = (v) ld.g.f38286a.b(v.class);
                                D d10 = C.f37623a;
                                AbstractC4326r abstractC4326r5 = a5;
                                AbstractC6216a abstractC6216a6 = abstractC6216a5;
                                AbstractC0405d b10 = d10.b(g.class);
                                boolean z14 = z11;
                                Y.b bVar5 = bVar2;
                                AbstractC0405d b11 = d10.b(l.class);
                                rVar2.W(608026872);
                                boolean g10 = rVar2.g(b10) | rVar2.g(b11) | rVar2.g(list) | rVar2.g(vVar) | rVar2.h(booleanValue);
                                Object K11 = rVar2.K();
                                if (g10 || K11 == iVar) {
                                    if (booleanValue) {
                                        y02 = AbstractC4344b.z0(d10.b(l.class), d10.b(g.class), context, list2);
                                    } else if (!booleanValue) {
                                        y02 = AbstractC4344b.y0(d10.b(g.class), a10, vVar, list);
                                    } else {
                                        throw new RuntimeException();
                                    }
                                    K11 = y02;
                                    rVar2.h0(K11);
                                }
                                rVar2.t(false);
                                rVar2.t(false);
                                i12 &= -458753;
                                abstractC4326r4 = abstractC4326r5;
                                abstractC6216a4 = abstractC6216a6;
                                z13 = z14;
                                bVar4 = bVar5;
                                gVar4 = (g) ((Ad.g) K11);
                            } else {
                                throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                            }
                        } else {
                            abstractC4326r4 = a5;
                            abstractC6216a4 = abstractC6216a5;
                            z13 = z11;
                            bVar4 = bVar2;
                            i15 = i12;
                            gVar4 = gVar2;
                            rVar2.u();
                            R4.b.x(rVar2, 0);
                            l lVar = (l) AbstractC4828h.z(gVar4.f808e, rVar2).getValue();
                            rVar2.W(-129133127);
                            K10 = rVar2.K();
                            o1 o1Var = o1.f22665a;
                            if (K10 == iVar) {
                                Ed.i iVar2 = lVar.f8559c;
                                if (iVar2 == null) {
                                    iVar2 = lVar.f8558b;
                                }
                                K10 = AbstractC4828h.Z(iVar2, o1Var);
                                rVar2.h0(K10);
                            }
                            AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
                            w10 = AbstractC0044t0.w(rVar2, false, -129133026);
                            if (w10 == iVar) {
                                w10 = AbstractC4828h.Z(Boolean.FALSE, o1Var);
                                rVar2.h0(w10);
                            }
                            rVar2.t(false);
                            int i23 = 907567112 | (i15 & 14) | (i15 & 112);
                            AbstractC4326r abstractC4326r6 = abstractC4326r4;
                            rVar = rVar2;
                            y.v(fVar, abstractC4326r6, AbstractC5102d.f42764a, null, 0, null, R4.b.X(rVar2, 626910137, new N.D(lVar, abstractC6216a4, gVar4, 27)), null, R4.b.X(rVar2, -241017225, new N.D(gVar4, abstractC6216a4, abstractC1710f0, 28)), R4.b.X(rVar2, 778658374, new M(z13, (AbstractC1710f0) w10, abstractC1710f0, bVar4, lVar, 4)), rVar2, i23, 168);
                            abstractC4326r3 = abstractC4326r4;
                            gVar3 = gVar4;
                            z12 = z13;
                            bVar3 = bVar4;
                            abstractC6216a3 = abstractC6216a4;
                        }
                    }
                    i15 = i12;
                    rVar2.u();
                    R4.b.x(rVar2, 0);
                    l lVar2 = (l) AbstractC4828h.z(gVar4.f808e, rVar2).getValue();
                    rVar2.W(-129133127);
                    K10 = rVar2.K();
                    o1 o1Var2 = o1.f22665a;
                    if (K10 == iVar) {
                    }
                    AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) K10;
                    w10 = AbstractC0044t0.w(rVar2, false, -129133026);
                    if (w10 == iVar) {
                    }
                    rVar2.t(false);
                    int i232 = 907567112 | (i15 & 14) | (i15 & 112);
                    AbstractC4326r abstractC4326r62 = abstractC4326r4;
                    rVar = rVar2;
                    y.v(fVar, abstractC4326r62, AbstractC5102d.f42764a, null, 0, null, R4.b.X(rVar2, 626910137, new N.D(lVar2, abstractC6216a4, gVar4, 27)), null, R4.b.X(rVar2, -241017225, new N.D(gVar4, abstractC6216a4, abstractC1710f02, 28)), R4.b.X(rVar2, 778658374, new M(z13, (AbstractC1710f0) w10, abstractC1710f02, bVar4, lVar2, 4)), rVar2, i232, 168);
                    abstractC4326r3 = abstractC4326r4;
                    gVar3 = gVar4;
                    z12 = z13;
                    bVar3 = bVar4;
                    abstractC6216a3 = abstractC6216a4;
                }
                C1741v0 v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new y.H(fVar, abstractC4326r3, abstractC6216a3, z12, bVar3, gVar3, i10, i11);
                    return;
                }
                return;
            }
            z11 = z10;
            if ((57344 & i10) == 0) {
            }
            if ((458752 & i10) == 0) {
            }
            if ((374491 & i12) != 74898) {
            }
            rVar2.R();
            i14 = i10 & 1;
            io.sentry.hints.i iVar3 = C1723m.f22654Y;
            if (i14 == 0) {
            }
            if (i22 == 0) {
            }
            if ((i11 & 4) != 0) {
            }
            if (i13 != 0) {
            }
            if ((i11 & 16) != 0) {
            }
            if ((i11 & 32) != 0) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 896) != 0) {
        }
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        z11 = z10;
        if ((57344 & i10) == 0) {
        }
        if ((458752 & i10) == 0) {
        }
        if ((374491 & i12) != 74898) {
        }
        rVar2.R();
        i14 = i10 & 1;
        io.sentry.hints.i iVar32 = C1723m.f22654Y;
        if (i14 == 0) {
        }
        if (i22 == 0) {
        }
        if ((i11 & 4) != 0) {
        }
        if (i13 != 0) {
        }
        if ((i11 & 16) != 0) {
        }
        if ((i11 & 32) != 0) {
        }
    }

    public static final void b(boolean z10, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        AbstractC6216a abstractC6216a3;
        long j6;
        long j10;
        long j11;
        long j12;
        int i12;
        int i13;
        int i14;
        AbstractC4326r a5 = io.sentry.compose.b.a("SettingsTopBar");
        r rVar = (r) abstractC1725n;
        rVar.X(-1660238727);
        if ((i10 & 14) == 0) {
            if (rVar.h(z10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.i(abstractC6216a)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (rVar.i(abstractC6216a2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && rVar.B()) {
            rVar.P();
            abstractC6216a3 = abstractC6216a2;
        } else {
            long j13 = AbstractC5102d.f42764a;
            long j14 = AbstractC5102d.f42765b;
            rVar.W(1896017784);
            long j15 = r0.r.f44263k;
            P0 p02 = (P0) rVar.m(R0.f19593a);
            k4 k4Var = p02.T;
            if (k4Var == null) {
                int i15 = F.f21369a;
                long d10 = R0.d(p02, 35);
                if (r0.r.c(R0.d(p02, 35), p02.f19532p)) {
                    j12 = R0.g(p02, G.f21376e);
                } else {
                    j12 = R0.d(p02, 35);
                }
                k4Var = new k4(d10, j12, R0.d(p02, F.f21370b), R0.d(p02, F.f21369a), R0.d(p02, F.f21371c));
                p02.T = k4Var;
            }
            if (j13 == j15) {
                j13 = k4Var.f20197a;
            }
            long j16 = j13;
            if (j15 != j15) {
                j6 = j15;
            } else {
                j6 = k4Var.f20198b;
            }
            int i16 = (j14 > j15 ? 1 : (j14 == j15 ? 0 : -1));
            if (i16 != 0) {
                j10 = j14;
            } else {
                j10 = k4Var.f20199c;
            }
            if (i16 != 0) {
                j11 = j14;
            } else {
                j11 = k4Var.f20200d;
            }
            if (i16 == 0) {
                j14 = k4Var.f20201e;
            }
            k4 k4Var2 = new k4(j16, j6, j10, j11, j14);
            rVar.t(false);
            abstractC6216a3 = abstractC6216a2;
            AbstractC1522a0.a(e.f8551b, a5, R4.b.X(rVar, 1668983968, new C5383F(abstractC6216a, 11)), R4.b.X(rVar, 583613577, new C1023g(abstractC6216a3, z10, 1)), null, k4Var2, null, rVar, 3462, 82);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1021e(i10, abstractC6216a, abstractC6216a3, z10);
        }
    }
}
