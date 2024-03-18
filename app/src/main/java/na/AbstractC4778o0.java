package na;

import A.AbstractC0044t0;
import A.C0046u0;
import Df.AbstractC0408g;
import E.AbstractC0438w;
import H0.AbstractC0701r0;
import S8.C1363g;
import W.AbstractC1522a0;
import W.AbstractC1527b0;
import W.C1568j1;
import W.S2;
import W.m4;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import android.content.Context;
import cb.C2334C;
import com.openai.chatgpt.R;
import fa.C2969F;
import gd.AbstractC3256b;
import id.AbstractC3557B;
import java.util.List;
import l0.AbstractC4326r;
import l0.C4310b;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import p9.C5100b;
import wd.C6190g0;
import wd.EnumC6212z;
import wf.AbstractC6216a;
import x9.C6383b;

/* renamed from: na.o0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4778o0 {
    static {
        fa.t tVar = new fa.t("Hello, world!");
        C6190g0.Companion.getClass();
        new C2969F("messageId", null, tVar, "text-davinci-002-render-sha", null, null, false, null, null, null, null, false, null, 8176);
        EnumC6212z enumC6212z = EnumC6212z.f48475Z;
        kf.v vVar = kf.v.f37483Y;
        new Sc.n(enumC6212z, "text-davinci-002-render-sha", 100, "Default", "Default model", vVar, vVar, null);
    }

    public static final void a(Tc.f fVar, boolean z10, wf.k kVar, AbstractC4326r abstractC4326r, E0 e02, gb.m0 m0Var, hb.u uVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        AbstractC4326r abstractC4326r2;
        Class cls;
        AbstractC4326r abstractC4326r3;
        E0 e03;
        int i12;
        E0 e04;
        gb.m0 m0Var2;
        E0 e05;
        hb.u uVar2;
        boolean z11;
        boolean z12;
        Object y02;
        Object y03;
        Object y04;
        AbstractC3557B.c0("appState", fVar);
        AbstractC3557B.c0("onMenuClick", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("ConversationScreenContent");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(868440955);
        if ((i11 & 8) != 0) {
            abstractC4326r2 = a5;
        } else {
            abstractC4326r2 = abstractC4326r;
        }
        int i13 = i11 & 16;
        Object obj = C1723m.f22654Y;
        if (i13 == 0) {
            cls = Ad.v.class;
            abstractC4326r3 = abstractC4326r2;
            e03 = e02;
            i12 = i10;
        } else {
            rVar.W(-490350905);
            Context context = (Context) rVar.m(H0.Z.f6888b);
            boolean booleanValue = ((Boolean) rVar.m(H0.E0.f6720a)).booleanValue();
            List list = (List) rVar.m(AbstractC3256b.f31580a);
            List list2 = (List) rVar.m(Ad.k.f814a);
            androidx.lifecycle.e0 a10 = m2.b.a(rVar);
            if (a10 != null) {
                Ad.v vVar = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                Object b10 = d10.b(E0.class);
                abstractC4326r3 = abstractC4326r2;
                Object b11 = d10.b(D1.class);
                cls = Ad.v.class;
                rVar.W(608026872);
                boolean g10 = rVar.g(b10) | rVar.g(b11) | rVar.g(list) | rVar.g(vVar) | rVar.h(booleanValue);
                Object K10 = rVar.K();
                if (g10 || K10 == obj) {
                    if (booleanValue) {
                        y04 = AbstractC4344b.z0(d10.b(D1.class), d10.b(E0.class), context, list2);
                    } else if (!booleanValue) {
                        y04 = AbstractC4344b.y0(d10.b(E0.class), a10, vVar, list);
                    } else {
                        throw new RuntimeException();
                    }
                    K10 = y04;
                    rVar.h0(K10);
                }
                rVar.t(false);
                rVar.t(false);
                i12 = (-57345) & i10;
                e03 = (E0) ((Ad.g) K10);
            } else {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
            }
        }
        if ((i11 & 32) != 0) {
            rVar.W(-490350905);
            Context context2 = (Context) rVar.m(H0.Z.f6888b);
            boolean booleanValue2 = ((Boolean) rVar.m(H0.E0.f6720a)).booleanValue();
            List list3 = (List) rVar.m(AbstractC3256b.f31580a);
            List list4 = (List) rVar.m(Ad.k.f814a);
            androidx.lifecycle.e0 a11 = m2.b.a(rVar);
            if (a11 != null) {
                Class cls2 = cls;
                Ad.v vVar2 = (Ad.v) ld.g.f38286a.b(cls2);
                kotlin.jvm.internal.D d11 = kotlin.jvm.internal.C.f37623a;
                Object b12 = d11.b(gb.m0.class);
                e04 = e03;
                Object b13 = d11.b(gb.l0.class);
                cls = cls2;
                rVar.W(608026872);
                boolean g11 = rVar.g(b13) | rVar.g(b12) | rVar.g(list3) | rVar.g(vVar2) | rVar.h(booleanValue2);
                Object K11 = rVar.K();
                if (g11 || K11 == obj) {
                    if (booleanValue2) {
                        y03 = AbstractC4344b.z0(d11.b(gb.l0.class), d11.b(gb.m0.class), context2, list4);
                    } else if (!booleanValue2) {
                        y03 = AbstractC4344b.y0(d11.b(gb.m0.class), a11, vVar2, list3);
                    } else {
                        throw new RuntimeException();
                    }
                    K11 = y03;
                    rVar.h0(K11);
                }
                rVar.t(false);
                rVar.t(false);
                i12 &= -458753;
                m0Var2 = (gb.m0) ((Ad.g) K11);
            } else {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
            }
        } else {
            e04 = e03;
            m0Var2 = m0Var;
        }
        if ((i11 & 64) != 0) {
            rVar.W(-490350905);
            Context context3 = (Context) rVar.m(H0.Z.f6888b);
            boolean booleanValue3 = ((Boolean) rVar.m(H0.E0.f6720a)).booleanValue();
            List list5 = (List) rVar.m(AbstractC3256b.f31580a);
            List list6 = (List) rVar.m(Ad.k.f814a);
            androidx.lifecycle.e0 a12 = m2.b.a(rVar);
            if (a12 != null) {
                Ad.v vVar3 = (Ad.v) ld.g.f38286a.b(cls);
                kotlin.jvm.internal.D d12 = kotlin.jvm.internal.C.f37623a;
                Object b14 = d12.b(hb.u.class);
                Object b15 = d12.b(hb.t.class);
                rVar.W(608026872);
                boolean g12 = rVar.g(b14) | rVar.g(b15) | rVar.g(list5) | rVar.g(vVar3) | rVar.h(booleanValue3);
                Object K12 = rVar.K();
                if (g12 || K12 == obj) {
                    if (booleanValue3) {
                        y02 = AbstractC4344b.z0(d12.b(hb.t.class), d12.b(hb.u.class), context3, list6);
                    } else if (!booleanValue3) {
                        y02 = AbstractC4344b.y0(d12.b(hb.u.class), a12, vVar3, list5);
                    } else {
                        throw new RuntimeException();
                    }
                    K12 = y02;
                    rVar.h0(K12);
                }
                rVar.t(false);
                rVar.t(false);
                i12 &= -3670017;
                e05 = e04;
                uVar2 = (hb.u) ((Ad.g) K12);
            } else {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
            }
        } else {
            e05 = e04;
            uVar2 = uVar;
        }
        int i14 = i12;
        D1 d13 = (D1) AbstractC4828h.z(e05.f808e, rVar).getValue();
        rVar.W(2132882901);
        if ((((57344 & i10) ^ 24576) > 16384 && rVar.g(e05)) || (i10 & 24576) == 16384) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object K13 = rVar.K();
        if (!z11 && K13 != obj) {
            z12 = false;
        } else {
            z12 = false;
            K13 = new C4769l0(0, e05);
            rVar.h0(K13);
        }
        AbstractC0408g abstractC0408g = (AbstractC0408g) K13;
        rVar.t(z12);
        gb.l0 l0Var = (gb.l0) AbstractC4828h.z(m0Var2.f808e, rVar).getValue();
        C4769l0 c4769l0 = new C4769l0(2, m0Var2);
        C4769l0 c4769l02 = new C4769l0(1, uVar2);
        rVar.W(773894976);
        rVar.W(-492369756);
        Object K14 = rVar.K();
        if (K14 == obj) {
            Object c10 = new Z.C(AbstractC1734s.k(rVar));
            rVar.h0(c10);
            K14 = c10;
        }
        rVar.t(false);
        Ng.F f6 = ((Z.C) K14).f22442Y;
        rVar.t(false);
        rVar.W(286497075);
        C1568j1 c1568j1 = new C1568j1(AbstractC1522a0.h(rVar), m4.f20229Y);
        rVar.t(false);
        p0.f fVar2 = (p0.f) rVar.m(AbstractC0701r0.f7003f);
        rVar.W(2132883325);
        Object K15 = rVar.K();
        if (K15 == obj) {
            K15 = new C5100b();
            rVar.h0(K15);
        }
        C5100b c5100b = (C5100b) K15;
        rVar.t(false);
        E0 e06 = e05;
        I9.B b16 = new I9.B(fVar, 2, d13);
        hb.u uVar3 = uVar2;
        AbstractC1734s.e(Boolean.valueOf(z10), new C4757h0(z10, fVar2, null), rVar);
        AbstractC4326r abstractC4326r4 = abstractC4326r3;
        AbstractC4326r a13 = androidx.compose.ui.input.nestedscroll.a.a(abstractC4326r4, c1568j1.a(), null);
        rVar.W(2132883757);
        Object K16 = rVar.K();
        if (K16 == obj) {
            K16 = new C6383b(9, c5100b);
            rVar.h0(K16);
        }
        rVar.t(false);
        S2.b(U3.f.o(a13, new C0046u0((wf.k) K16, 3, null)), R4.b.X(rVar, -549728201, new N.D(b16, f6, kVar, 13)), null, null, null, 0, 0L, 0L, null, R4.b.X(rVar, 1960885644, new C4766k0(d13, fVar, abstractC0408g, c4769l0, c4769l02, b16)), rVar, 805306416, 508);
        A7.b.r(fVar, d13, (wf.k) abstractC0408g, l0Var, c4769l0, c5100b, rVar, (i14 & 14) | 200712);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new y.I(fVar, z10, kVar, abstractC4326r4, e06, m0Var2, uVar3, i10, i11);
        }
    }

    public static final void b(AbstractC0438w abstractC0438w, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        int i14;
        AbstractC4326r a5 = io.sentry.compose.b.a("GptZeroState");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1051398472);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(abstractC0438w)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(abstractC4326r)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && rVar.B()) {
            rVar.P();
            abstractC4326r2 = abstractC4326r;
        } else {
            if (i15 == 0) {
                a5 = abstractC4326r;
            }
            K8.d.z(null, androidx.compose.foundation.layout.e.j(abstractC0438w.a(a5, C4310b.f37697j0), p9.q.f42833d), null, rVar, 6, 4);
            abstractC4326r2 = a5;
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C4772m0(abstractC0438w, abstractC4326r2, i10, i11, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        Z.r rVar;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        long j6;
        long j10;
        long j11;
        long j12;
        int i13;
        long j13;
        long j14;
        long j15;
        long j16;
        boolean z10;
        Object K10;
        int i14;
        int i15;
        AbstractC3557B.c0("onIntent", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("TopBarUpgradeToPlusButton");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(1429340793);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.i(kVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i10 | i15;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i12 & 91) != 18 && rVar2.B()) {
                rVar2.P();
                abstractC4326r3 = abstractC4326r2;
                rVar = rVar2;
            } else {
                if (i16 == 0) {
                    a5 = abstractC4326r2;
                }
                float f6 = AbstractC1527b0.f19925a;
                Z.m1 m1Var = W.R0.f19593a;
                j6 = ((W.P0) rVar2.m(m1Var)).f19534r;
                j10 = ((W.P0) rVar2.m(m1Var)).f19522f;
                j11 = ((W.P0) rVar2.m(m1Var)).f19522f;
                rVar2.W(-391745725);
                j12 = r0.r.f44263k;
                W.A0 a10 = AbstractC1527b0.a((W.P0) rVar2.m(m1Var));
                if (j6 == j12) {
                    j6 = a10.f18966a;
                }
                long j17 = j6;
                if (j10 == j12) {
                    j10 = a10.f18967b;
                }
                long j18 = j10;
                if (j11 == j12) {
                    j11 = a10.f18968c;
                }
                long j19 = j11;
                i13 = (j12 > j12 ? 1 : (j12 == j12 ? 0 : -1));
                if (i13 == 0) {
                    j13 = j12;
                } else {
                    j13 = a10.f18969d;
                }
                if (i13 == 0) {
                    j14 = j12;
                } else {
                    j14 = a10.f18970e;
                }
                if (i13 == 0) {
                    j15 = j12;
                } else {
                    j15 = a10.f18971f;
                }
                if (i13 == 0) {
                    j16 = j12;
                } else {
                    j16 = a10.f18972g;
                }
                if (i13 == 0) {
                    j12 = a10.f18973h;
                }
                W.A0 a02 = new W.A0(j17, j18, j19, j13, j14, j15, j16, j12);
                rVar2.t(false);
                rVar2.W(-467754464);
                if ((i12 & 14) != 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                K10 = rVar2.K();
                if (!z10 || K10 == C1723m.f22654Y) {
                    K10 = AbstractC0044t0.t(11, kVar, rVar2);
                }
                rVar2.t(false);
                rVar = rVar2;
                W.O0.a((AbstractC6216a) K10, AbstractC4762j.f39995a, a5, false, null, AbstractC4762j.f39996b, null, a02, null, null, null, rVar2, ((i12 << 3) & 896) | 805503024, 0, 1368);
                abstractC4326r3 = a5;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new I9.r(kVar, abstractC4326r3, i10, i11, 2);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 91) != 18) {
        }
        if (i16 == 0) {
        }
        float f62 = AbstractC1527b0.f19925a;
        Z.m1 m1Var2 = W.R0.f19593a;
        j6 = ((W.P0) rVar2.m(m1Var2)).f19534r;
        j10 = ((W.P0) rVar2.m(m1Var2)).f19522f;
        j11 = ((W.P0) rVar2.m(m1Var2)).f19522f;
        rVar2.W(-391745725);
        j12 = r0.r.f44263k;
        W.A0 a102 = AbstractC1527b0.a((W.P0) rVar2.m(m1Var2));
        if (j6 == j12) {
        }
        long j172 = j6;
        if (j10 == j12) {
        }
        long j182 = j10;
        if (j11 == j12) {
        }
        long j192 = j11;
        i13 = (j12 > j12 ? 1 : (j12 == j12 ? 0 : -1));
        if (i13 == 0) {
        }
        if (i13 == 0) {
        }
        if (i13 == 0) {
        }
        if (i13 == 0) {
        }
        if (i13 == 0) {
        }
        W.A0 a022 = new W.A0(j172, j182, j192, j13, j14, j15, j16, j12);
        rVar2.t(false);
        rVar2.W(-467754464);
        if ((i12 & 14) != 4) {
        }
        K10 = rVar2.K();
        if (!z10) {
        }
        K10 = AbstractC0044t0.t(11, kVar, rVar2);
        rVar2.t(false);
        rVar = rVar2;
        W.O0.a((AbstractC6216a) K10, AbstractC4762j.f39995a, a5, false, null, AbstractC4762j.f39996b, null, a022, null, null, null, rVar2, ((i12 << 3) & 896) | 805503024, 0, 1368);
        abstractC4326r3 = a5;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(int i10, int i11, AbstractC1725n abstractC1725n, AbstractC4326r abstractC4326r, C2334C c2334c, wf.k kVar) {
        int i12;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        boolean z10;
        String str;
        Object K10;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("onIntent", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("UpgradeToPlusButton");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1229596883);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(c2334c)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.i(kVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 731) != 146 && rVar.B()) {
                rVar.P();
            } else {
                if (i16 == 0) {
                    a5 = abstractC4326r2;
                }
                z10 = true;
                Object[] objArr = new Object[1];
                if (c2334c == null) {
                    str = c2334c.f26439b;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                String w10 = Ng.H.w(R.string.gizmo_non_plus_upsell_button, objArr, rVar);
                rVar.W(1197181568);
                if ((i12 & 112) != 32) {
                    z10 = false;
                }
                K10 = rVar.K();
                if (!z10 || K10 == C1723m.f22654Y) {
                    K10 = AbstractC0044t0.t(12, kVar, rVar);
                }
                rVar.t(false);
                Ng.H.a((AbstractC6216a) K10, androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(a5, 1.0f), p9.r.f42841e, 0.0f, 2), false, null, null, null, null, null, null, R4.b.X(rVar, -696883907, new C1363g(w10, 3)), rVar, 805306368, 508);
                abstractC4326r2 = a5;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new C4775n0(c2334c, kVar, abstractC4326r2, i10, i11);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i16 == 0) {
        }
        z10 = true;
        Object[] objArr2 = new Object[1];
        if (c2334c == null) {
        }
        if (str == null) {
        }
        objArr2[0] = str;
        String w102 = Ng.H.w(R.string.gizmo_non_plus_upsell_button, objArr2, rVar);
        rVar.W(1197181568);
        if ((i12 & 112) != 32) {
        }
        K10 = rVar.K();
        if (!z10) {
        }
        K10 = AbstractC0044t0.t(12, kVar, rVar);
        rVar.t(false);
        Ng.H.a((AbstractC6216a) K10, androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(a5, 1.0f), p9.r.f42841e, 0.0f, 2), false, null, null, null, null, null, null, R4.b.X(rVar, -696883907, new C1363g(w102, 3)), rVar, 805306368, 508);
        abstractC4326r2 = a5;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final void e(AbstractC0438w abstractC0438w, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        AbstractC4326r a5 = io.sentry.compose.b.a("DefaultZeroStateAnimation");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-75534632);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(abstractC0438w)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(abstractC4326r)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && rVar.B()) {
            rVar.P();
        } else {
            if (i15 != 0) {
                abstractC4326r = a5;
            }
            b(abstractC0438w, abstractC0438w.a(abstractC4326r, C4310b.f37697j0), rVar, 0, 0);
        }
        AbstractC4326r abstractC4326r2 = abstractC4326r;
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C4772m0(abstractC0438w, abstractC4326r2, i10, i11, 0);
        }
    }
}
