package na;

import A.AbstractC0044t0;
import A.C0046u0;
import Df.AbstractC0405d;
import Df.AbstractC0408g;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0441z;
import E.C0421f;
import E.C0426j;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1741v0;
import android.content.Context;
import com.openai.chatgpt.R;
import gd.AbstractC3256b;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4323o;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import r9.C5388e;
import wd.EnumC6212z;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public abstract class D0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f39745a = 18;

    /* JADX WARN: Removed duplicated region for block: B:111:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC4326r abstractC4326r, E0 e02, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        E0 e03;
        Z.r rVar;
        E0 e04;
        AbstractC4326r abstractC4326r3;
        int i13;
        AbstractC4326r abstractC4326r4;
        E0 e05;
        int i14;
        boolean z10;
        AbstractC4326r abstractC4326r5;
        D1 d12;
        boolean z11;
        Object K10;
        AbstractC1710f0 abstractC1710f0;
        AbstractC1710f0 abstractC1710f02;
        boolean z12;
        E0 e06;
        io.sentry.hints.i iVar;
        Z.r rVar2;
        Ad.g gVar;
        int i15;
        int i16;
        int i17;
        int i18;
        AbstractC3557B.c0("onDetailsClick", abstractC6216a);
        AbstractC3557B.c0("onMenu", abstractC6216a2);
        AbstractC4326r a5 = io.sentry.compose.b.a("ConversationTopBar");
        Z.r rVar3 = (Z.r) abstractC1725n;
        rVar3.X(-1624313768);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar3.i(abstractC6216a)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar3.i(abstractC6216a2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        int i19 = i11 & 4;
        if (i19 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar3.g(abstractC4326r2)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
            if ((i10 & 7168) != 0) {
                if ((i11 & 8) == 0) {
                    e03 = e02;
                    if (rVar3.g(e03)) {
                        i15 = 2048;
                        i12 |= i15;
                    }
                } else {
                    e03 = e02;
                }
                i15 = 1024;
                i12 |= i15;
            } else {
                e03 = e02;
            }
            if ((i12 & 5851) != 1170 && rVar3.B()) {
                rVar3.P();
                e04 = e03;
                rVar = rVar3;
                abstractC4326r3 = abstractC4326r2;
            } else {
                rVar3.R();
                i13 = i10 & 1;
                io.sentry.hints.i iVar2 = C1723m.f22654Y;
                if (i13 == 0 && !rVar3.A()) {
                    rVar3.P();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    i14 = i12;
                    abstractC4326r5 = abstractC4326r2;
                    abstractC4326r4 = a5;
                    z10 = true;
                } else {
                    if (i19 != 0) {
                        abstractC4326r2 = a5;
                    }
                    if ((i11 & 8) == 0) {
                        rVar3.W(-490350905);
                        Context context = (Context) rVar3.m(H0.Z.f6888b);
                        boolean booleanValue = ((Boolean) rVar3.m(H0.E0.f6720a)).booleanValue();
                        List list = (List) rVar3.m(AbstractC3256b.f31580a);
                        List list2 = (List) rVar3.m(Ad.k.f814a);
                        androidx.lifecycle.e0 a10 = m2.b.a(rVar3);
                        if (a10 != null) {
                            Ad.v vVar = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                            AbstractC4326r abstractC4326r6 = abstractC4326r2;
                            AbstractC0405d b10 = d10.b(E0.class);
                            AbstractC0405d b11 = d10.b(D1.class);
                            abstractC4326r4 = a5;
                            rVar3.W(608026872);
                            boolean g10 = rVar3.g(b10) | rVar3.g(b11) | rVar3.g(list) | rVar3.g(vVar) | rVar3.h(booleanValue);
                            Object K11 = rVar3.K();
                            if (g10 || K11 == iVar2) {
                                z10 = true;
                                if (booleanValue) {
                                    gVar = AbstractC4344b.z0(d10.b(D1.class), d10.b(E0.class), context, list2);
                                } else if (!booleanValue) {
                                    gVar = AbstractC4344b.y0(d10.b(E0.class), a10, vVar, list);
                                } else {
                                    throw new RuntimeException();
                                }
                                rVar3.h0(gVar);
                            } else {
                                gVar = K11;
                                z10 = true;
                            }
                            rVar3.t(false);
                            rVar3.t(false);
                            abstractC4326r5 = abstractC4326r6;
                            i14 = i12 & (-7169);
                            e05 = (E0) gVar;
                            rVar3.u();
                            d12 = (D1) AbstractC4828h.z(e05.f808e, rVar3).getValue();
                            rVar3.W(817591517);
                            if ((((i14 & 7168) ^ 3072) <= 2048 && rVar3.g(e05)) || (i14 & 3072) == 2048) {
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            K10 = rVar3.K();
                            if (!z11 || K10 == iVar2) {
                                K10 = new C4769l0(5, e05);
                                rVar3.h0(K10);
                            }
                            AbstractC0408g abstractC0408g = (AbstractC0408g) K10;
                            rVar3.t(false);
                            abstractC1710f0 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, C4777o.f40074i0, rVar3, 6);
                            abstractC1710f02 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, C4777o.f40073h0, rVar3, 6);
                            C3288a X10 = R4.b.X(rVar3, -94076900, new androidx.compose.foundation.layout.c(d12, 17, abstractC0408g));
                            C3288a X11 = R4.b.X(rVar3, 1505072158, new androidx.compose.foundation.layout.c(abstractC6216a2, 18, d12));
                            C3288a X12 = R4.b.X(rVar3, 1944512967, new r9.H(abstractC0408g, d12, abstractC1710f0, abstractC1710f02, abstractC6216a));
                            if (d12.f() != S1.f39868Z) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            r9.y.z(X10, abstractC4326r5, X11, X12, z12, rVar3, ((i14 >> 3) & 112) | 3462, 0);
                            rVar3.W(817593507);
                            if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                                String str = d12.f39770i;
                                if (str == null) {
                                    str = "";
                                }
                                String str2 = str;
                                rVar3.W(817593638);
                                boolean g11 = rVar3.g(abstractC1710f0);
                                Object K12 = rVar3.K();
                                if (g11 || K12 == iVar2) {
                                    K12 = R.a.o(abstractC1710f0, 11, rVar3);
                                }
                                AbstractC6216a abstractC6216a3 = (AbstractC6216a) K12;
                                rVar3.t(false);
                                rVar3.W(817593692);
                                boolean g12 = rVar3.g(abstractC0408g) | rVar3.g(abstractC1710f0);
                                Object K13 = rVar3.K();
                                if (g12 || K13 == iVar2) {
                                    K13 = new s3.r(abstractC0408g, 24, abstractC1710f0);
                                    rVar3.h0(K13);
                                }
                                rVar3.t(false);
                                iVar = iVar2;
                                rVar2 = rVar3;
                                e06 = e05;
                                x8.W.c(str2, abstractC6216a3, (wf.k) K13, abstractC4326r4, rVar2, 0, 8);
                            } else {
                                iVar = iVar2;
                                rVar2 = rVar3;
                                e06 = e05;
                            }
                            rVar2.t(false);
                            if (!((Boolean) abstractC1710f02.getValue()).booleanValue()) {
                                rVar2.W(817593936);
                                boolean g13 = rVar2.g(abstractC1710f02);
                                Object K14 = rVar2.K();
                                if (g13 || K14 == iVar) {
                                    K14 = R.a.o(abstractC1710f02, 12, rVar2);
                                }
                                AbstractC6216a abstractC6216a4 = (AbstractC6216a) K14;
                                rVar2.t(false);
                                rVar2.W(817593990);
                                boolean g14 = rVar2.g(abstractC0408g);
                                Object K15 = rVar2.K();
                                if (g14 || K15 == iVar) {
                                    K15 = AbstractC6463a.g(abstractC0408g, 10, rVar2);
                                }
                                AbstractC6216a abstractC6216a5 = (AbstractC6216a) K15;
                                rVar2.t(false);
                                rVar2.W(817594068);
                                boolean g15 = rVar2.g(abstractC0408g);
                                Object K16 = rVar2.K();
                                if (g15 || K16 == iVar) {
                                    K16 = AbstractC6463a.g(abstractC0408g, 11, rVar2);
                                }
                                rVar2.t(false);
                                rVar = rVar2;
                                A7.b.A(abstractC6216a4, abstractC6216a5, (AbstractC6216a) K16, d12.f39753H, rVar2, 0);
                            } else {
                                rVar = rVar2;
                            }
                            abstractC4326r3 = abstractC4326r5;
                            e04 = e06;
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    } else {
                        abstractC4326r4 = a5;
                        z10 = true;
                        abstractC4326r5 = abstractC4326r2;
                        i14 = i12;
                    }
                }
                e05 = e03;
                rVar3.u();
                d12 = (D1) AbstractC4828h.z(e05.f808e, rVar3).getValue();
                rVar3.W(817591517);
                if (((i14 & 7168) ^ 3072) <= 2048) {
                }
                z11 = false;
                K10 = rVar3.K();
                if (!z11) {
                }
                K10 = new C4769l0(5, e05);
                rVar3.h0(K10);
                AbstractC0408g abstractC0408g2 = (AbstractC0408g) K10;
                rVar3.t(false);
                abstractC1710f0 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, C4777o.f40074i0, rVar3, 6);
                abstractC1710f02 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, C4777o.f40073h0, rVar3, 6);
                C3288a X102 = R4.b.X(rVar3, -94076900, new androidx.compose.foundation.layout.c(d12, 17, abstractC0408g2));
                C3288a X112 = R4.b.X(rVar3, 1505072158, new androidx.compose.foundation.layout.c(abstractC6216a2, 18, d12));
                C3288a X122 = R4.b.X(rVar3, 1944512967, new r9.H(abstractC0408g2, d12, abstractC1710f0, abstractC1710f02, abstractC6216a));
                if (d12.f() != S1.f39868Z) {
                }
                r9.y.z(X102, abstractC4326r5, X112, X122, z12, rVar3, ((i14 >> 3) & 112) | 3462, 0);
                rVar3.W(817593507);
                if (!((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                }
                rVar2.t(false);
                if (!((Boolean) abstractC1710f02.getValue()).booleanValue()) {
                }
                abstractC4326r3 = abstractC4326r5;
                e04 = e06;
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new G.I(abstractC6216a, abstractC6216a2, abstractC4326r3, e04, i10, i11, 10);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 7168) != 0) {
        }
        if ((i12 & 5851) != 1170) {
        }
        rVar3.R();
        i13 = i10 & 1;
        io.sentry.hints.i iVar22 = C1723m.f22654Y;
        if (i13 == 0) {
        }
        if (i19 != 0) {
        }
        if ((i11 & 8) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC6216a abstractC6216a3, AbstractC4326r abstractC4326r, E0 e02, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        Object obj;
        Object obj2;
        E0 e03;
        AbstractC4326r abstractC4326r2;
        int i13;
        boolean z10;
        E0 e04;
        AbstractC4326r abstractC4326r3;
        boolean z11;
        Object K10;
        Object y02;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        AbstractC4326r a5 = io.sentry.compose.b.a("ConversationMenu");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-683937083);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.i(abstractC6216a)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.i(abstractC6216a2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.i(abstractC6216a3)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        int i19 = i11 & 8;
        if (i19 != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            obj = abstractC4326r;
            if (rVar.g(obj)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
            if ((i10 & 57344) != 0) {
                if ((i11 & 16) == 0) {
                    obj2 = e02;
                    if (rVar.g(obj2)) {
                        i14 = 16384;
                        i12 |= i14;
                    }
                } else {
                    obj2 = e02;
                }
                i14 = 8192;
                i12 |= i14;
            } else {
                obj2 = e02;
            }
            if ((46811 & i12) != 9362 && rVar.B()) {
                rVar.P();
                abstractC4326r2 = obj;
                e03 = obj2;
            } else {
                rVar.R();
                i13 = i10 & 1;
                Object obj3 = C1723m.f22654Y;
                if (i13 == 0 && !rVar.A()) {
                    rVar.P();
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    abstractC4326r3 = obj;
                    e04 = obj2;
                    z10 = true;
                } else {
                    if (i19 != 0) {
                        obj = a5;
                    }
                    if ((i11 & 16) == 0) {
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
                            Object b11 = d10.b(D1.class);
                            AbstractC4326r abstractC4326r4 = obj;
                            rVar.W(608026872);
                            boolean g10 = rVar.g(b11) | rVar.g(b10) | rVar.g(list) | rVar.g(vVar) | rVar.h(booleanValue);
                            Object K11 = rVar.K();
                            if (g10 || K11 == obj3) {
                                z10 = true;
                                if (booleanValue) {
                                    y02 = AbstractC4344b.z0(d10.b(D1.class), d10.b(E0.class), context, list2);
                                } else if (!booleanValue) {
                                    y02 = AbstractC4344b.y0(d10.b(E0.class), a10, vVar, list);
                                } else {
                                    throw new RuntimeException();
                                }
                                K11 = y02;
                                rVar.h0(K11);
                            } else {
                                z10 = true;
                            }
                            rVar.t(false);
                            rVar.t(false);
                            i12 &= -57345;
                            e04 = (E0) ((Ad.g) K11);
                            abstractC4326r3 = abstractC4326r4;
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    } else {
                        z10 = true;
                        abstractC4326r3 = obj;
                        e04 = obj2;
                    }
                }
                rVar.u();
                D1 d12 = (D1) AbstractC4828h.z(e04.f808e, rVar).getValue();
                rVar.W(-1141099393);
                if ((((57344 & i12) ^ 24576) <= 16384 && rVar.g(e04)) || (i12 & 24576) == 16384) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                K10 = rVar.K();
                if (!z11 || K10 == obj3) {
                    K10 = new C4769l0(4, e04);
                    rVar.h0(K10);
                }
                AbstractC0408g abstractC0408g = (AbstractC0408g) K10;
                rVar.t(false);
                rVar.W(733328855);
                E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar);
                rVar.W(-1323940314);
                int i20 = rVar.P;
                AbstractC1732q0 p10 = rVar.p();
                AbstractC0584m.f5811i.getClass();
                AbstractC6216a abstractC6216a4 = C0583l.f5804b;
                C3288a i21 = androidx.compose.ui.layout.a.i(abstractC4326r3);
                if (!(rVar.f22696a instanceof AbstractC1707e)) {
                    rVar.Z();
                    if (rVar.f22695O) {
                        rVar.o(abstractC6216a4);
                    } else {
                        rVar.k0();
                    }
                    U3.f.n0(rVar, c10, C0583l.f5808f);
                    U3.f.n0(rVar, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i20))) {
                        AbstractC6463a.q(i20, rVar, i20, c0581j);
                    }
                    AbstractC6463a.r(0, i21, new Z.L0(rVar), rVar, 2058660585);
                    AbstractC4326r a11 = io.sentry.compose.b.a("ConversationMenu");
                    rVar.W(-876086042);
                    Object K12 = rVar.K();
                    if (K12 == obj3) {
                        K12 = AbstractC4828h.Z(Boolean.FALSE, Z.o1.f22665a);
                        rVar.h0(K12);
                    }
                    AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K12;
                    Object w10 = AbstractC0044t0.w(rVar, false, -876085984);
                    if (w10 == obj3) {
                        w10 = R.a.o(abstractC1710f0, 8, rVar);
                    }
                    AbstractC6216a abstractC6216a5 = (AbstractC6216a) w10;
                    Object w11 = AbstractC0044t0.w(rVar, false, -876085934);
                    if (w11 == obj3) {
                        w11 = R.a.o(abstractC1710f0, 6, rVar);
                    }
                    rVar.t(false);
                    AbstractC4326r abstractC4326r5 = abstractC4326r3;
                    R4.b.o((AbstractC6216a) w11, a11, false, null, null, AbstractC4768l.f40021c, rVar, 196614, 30);
                    boolean booleanValue2 = ((Boolean) abstractC1710f0.getValue()).booleanValue();
                    rVar.W(-876085635);
                    Object K13 = rVar.K();
                    if (K13 == obj3) {
                        K13 = R.a.o(abstractC1710f0, 7, rVar);
                    }
                    rVar.t(false);
                    Df.H.f(booleanValue2, (AbstractC6216a) K13, a11, 0L, null, null, R4.b.X(rVar, -1346349332, new C4766k0(abstractC6216a3, d12, abstractC0408g, abstractC6216a, abstractC6216a2, abstractC6216a5)), rVar, 1572912, 60);
                    AbstractC6463a.v(rVar, false, true, false, false);
                    abstractC4326r2 = abstractC4326r5;
                    e03 = e04;
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new y.P(abstractC6216a, abstractC6216a2, abstractC6216a3, abstractC4326r2, e03, i10, i11, 12);
                return;
            }
            return;
        }
        obj = abstractC4326r;
        if ((i10 & 57344) != 0) {
        }
        if ((46811 & i12) != 9362) {
        }
        rVar.R();
        i13 = i10 & 1;
        Object obj32 = C1723m.f22654Y;
        if (i13 == 0) {
        }
        if (i19 != 0) {
        }
        if ((i11 & 16) == 0) {
        }
        rVar.u();
        D1 d122 = (D1) AbstractC4828h.z(e04.f808e, rVar).getValue();
        rVar.W(-1141099393);
        if (((57344 & i12) ^ 24576) <= 16384) {
        }
        z11 = false;
        K10 = rVar.K();
        if (!z11) {
        }
        K10 = new C4769l0(4, e04);
        rVar.h0(K10);
        AbstractC0408g abstractC0408g2 = (AbstractC0408g) K10;
        rVar.t(false);
        rVar.W(733328855);
        E0.N c102 = AbstractC0434s.c(C4310b.f37693Y, false, rVar);
        rVar.W(-1323940314);
        int i202 = rVar.P;
        AbstractC1732q0 p102 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        AbstractC6216a abstractC6216a42 = C0583l.f5804b;
        C3288a i212 = androidx.compose.ui.layout.a.i(abstractC4326r3);
        if (!(rVar.f22696a instanceof AbstractC1707e)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(AbstractC6216a abstractC6216a, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        C1741v0 v10;
        boolean z10;
        int i13;
        int i14;
        AbstractC4326r a5 = io.sentry.compose.b.a("HistoryDisabledButton");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1693342369);
        if ((i10 & 14) == 0) {
            if (rVar.i(abstractC6216a)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar.B()) {
            rVar.P();
        } else {
            AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, C4777o.f40075j0, rVar, 6);
            rVar.W(-1604140350);
            boolean g10 = rVar.g(abstractC1710f0);
            Object K10 = rVar.K();
            io.sentry.hints.i iVar = C1723m.f22654Y;
            if (g10 || K10 == iVar) {
                K10 = R.a.o(abstractC1710f0, 13, rVar);
            }
            rVar.t(false);
            R4.b.o(K10, a5, false, null, null, AbstractC4768l.f40020b, rVar, 196608, 30);
            if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                String v11 = Ng.H.v(R.string.conversations_history_disabled_title, rVar);
                String v12 = Ng.H.v(R.string.conversations_history_disabled_description, rVar);
                String v13 = Ng.H.v(R.string.conversations_history_enable, rVar);
                rVar.W(-1604140034);
                boolean g11 = rVar.g(abstractC1710f0);
                Object K11 = rVar.K();
                if (g11 || K11 == iVar) {
                    K11 = R.a.o(abstractC1710f0, 14, rVar);
                }
                AbstractC6216a abstractC6216a2 = (AbstractC6216a) K11;
                rVar.t(false);
                rVar.W(-1604139973);
                boolean g12 = rVar.g(abstractC1710f0);
                if ((14 & i11) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = g12 | z10;
                Object K12 = rVar.K();
                if (!z11 && K12 != iVar) {
                    i13 = 1;
                } else {
                    i13 = 1;
                    K12 = new C5388e(abstractC6216a, abstractC1710f0, 1);
                    rVar.h0(K12);
                }
                rVar.t(false);
                i12 = i13;
                K8.d.j(abstractC6216a2, (AbstractC6216a) K12, v12, v13, 0L, v11, false, null, rVar, 0, 208);
                v10 = rVar.v();
                if (v10 == null) {
                    v10.f22739d = new G9.h(i10, i12, abstractC6216a);
                    return;
                }
                return;
            }
        }
        i12 = 1;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, boolean z10, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        boolean z11;
        boolean z12;
        C1741v0 v10;
        boolean z13;
        int i14;
        int i15;
        int i16;
        AbstractC4326r a5 = io.sentry.compose.b.a("MenuIcon");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(49290012);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.i(abstractC6216a)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                z11 = z10;
                if (rVar.h(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
                if ((i12 & 731) != 146 && rVar.B()) {
                    rVar.P();
                    z12 = z11;
                } else {
                    if (i17 == 0) {
                        a5 = abstractC4326r2;
                    }
                    if (i13 != 0) {
                        z13 = false;
                    } else {
                        z13 = z11;
                    }
                    R4.b.o(abstractC6216a, a5, false, null, null, R4.b.X(rVar, 1341577183, new C4805z0(0, z13)), rVar, 196608 | (i12 & 14) | (i12 & 112), 28);
                    abstractC4326r2 = a5;
                    z12 = z13;
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new A0(abstractC6216a, abstractC4326r2, z12, i10, i11, 0);
                    return;
                }
                return;
            }
            z11 = z10;
            if ((i12 & 731) != 146) {
            }
            if (i17 == 0) {
            }
            if (i13 != 0) {
            }
            R4.b.o(abstractC6216a, a5, false, null, null, R4.b.X(rVar, 1341577183, new C4805z0(0, z13)), rVar, 196608 | (i12 & 14) | (i12 & 112), 28);
            abstractC4326r2 = a5;
            z12 = z13;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        z11 = z10;
        if ((i12 & 731) != 146) {
        }
        if (i17 == 0) {
        }
        if (i13 != 0) {
        }
        R4.b.o(abstractC6216a, a5, false, null, null, R4.b.X(rVar, 1341577183, new C4805z0(0, z13)), rVar, 196608 | (i12 & 14) | (i12 & 112), 28);
        abstractC4326r2 = a5;
        z12 = z13;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    public static final void e(AbstractC0441z abstractC0441z, D1 d12, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC6216a abstractC6216a3, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        EnumC6212z enumC6212z;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        int i14;
        int i15;
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("NewChatSwitcherMenuOption");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1392038863);
        if ((i10 & 112) == 0) {
            if (rVar.g(d12)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 896) == 0) {
            if (rVar.i(abstractC6216a)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 7168) == 0) {
            if (rVar.i(abstractC6216a2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i11 |= i13;
        }
        if ((i10 & 57344) == 0) {
            if (rVar.i(abstractC6216a3)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i11 |= i12;
        }
        int i16 = i11;
        if ((46801 & i16) == 9360 && rVar.B()) {
            rVar.P();
        } else {
            U3.f.c(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), 0.0f, p9.r.f42839c, 1), 0.0f, 0L, rVar, 0, 6);
            Sc.n a10 = d12.f39767f.a();
            if (a10 != null) {
                enumC6212z = a10.f16533a;
            } else {
                enumC6212z = null;
            }
            if (enumC6212z == EnumC6212z.f48474Y) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3288a c3288a = AbstractC4768l.f40041w;
            rVar.W(-603853356);
            int i17 = i16 & 896;
            if (i17 == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean h10 = rVar.h(z10) | z11;
            if ((i16 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z15 = h10 | z12;
            Object K10 = rVar.K();
            io.sentry.hints.i iVar = C1723m.f22654Y;
            if (z15 || K10 == iVar) {
                K10 = new B0(0, abstractC6216a, abstractC6216a2, z10);
                rVar.h0(K10);
            }
            rVar.t(false);
            boolean z16 = z10;
            Df.H.g(c3288a, (AbstractC6216a) K10, a5, AbstractC4768l.f40042x, R4.b.X(rVar, 1911816157, new C4805z0(1, z10)), false, null, null, null, rVar, 27654, 484);
            C3288a c3288a2 = AbstractC4768l.f40043y;
            rVar.W(-603852849);
            if (i17 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean h11 = rVar.h(z16) | z13;
            if ((i16 & 57344) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z17 = h11 | z14;
            Object K11 = rVar.K();
            if (z17 || K11 == iVar) {
                K11 = new B0(1, abstractC6216a, abstractC6216a3, z16);
                rVar.h0(K11);
            }
            rVar.t(false);
            Df.H.g(c3288a2, (AbstractC6216a) K11, a5, AbstractC4768l.f40044z, R4.b.X(rVar, -759189050, new C4805z0(2, z16)), false, null, null, null, rVar, 27654, 484);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new W.C1(i10, 2, abstractC0441z, d12, abstractC6216a, abstractC6216a2, abstractC6216a3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(D1 d12, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4326r abstractC4326r3;
        Z.r rVar;
        C1741v0 v10;
        EnumC6212z enumC6212z;
        boolean z10;
        int i13;
        int i14;
        AbstractC4326r a5 = io.sentry.compose.b.a("TitleHeadlineContent");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-876473186);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(d12)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 91) != 18 && rVar2.B()) {
                rVar2.P();
                abstractC4326r3 = abstractC4326r2;
                rVar = rVar2;
            } else {
                if (i15 == 0) {
                    abstractC4326r3 = a5;
                } else {
                    abstractC4326r3 = abstractC4326r2;
                }
                if (d12.f39759N == null) {
                    rVar2.W(1456830339);
                    j4.b(d12.f39759N.f26439b, a5, 0L, 0L, null, S0.D.f15972k0, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, rVar2, 196608, 3120, 120798);
                    rVar = rVar2;
                    rVar.t(false);
                } else {
                    rVar = rVar2;
                    rVar.W(1456830537);
                    C0421f c0421f = AbstractC0429m.f3907a;
                    C0426j g10 = AbstractC0429m.g(p9.r.f42840d);
                    C4317i c4317i = C4310b.f37704q0;
                    rVar.W(693286680);
                    E0.N a10 = E.p0.a(g10, c4317i, rVar);
                    rVar.W(-1323940314);
                    int i16 = rVar.P;
                    AbstractC1732q0 p10 = rVar.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k = C0583l.f5804b;
                    C3288a i17 = androidx.compose.ui.layout.a.i(abstractC4326r3);
                    if (rVar.f22696a instanceof AbstractC1707e) {
                        rVar.Z();
                        if (rVar.f22695O) {
                            rVar.o(c0582k);
                        } else {
                            rVar.k0();
                        }
                        U3.f.n0(rVar, a10, C0583l.f5808f);
                        U3.f.n0(rVar, p10, C0583l.f5807e);
                        C0581j c0581j = C0583l.f5809g;
                        if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i16))) {
                            AbstractC6463a.q(i16, rVar, i16, c0581j);
                        }
                        AbstractC6463a.r(0, i17, new Z.L0(rVar), rVar, 2058660585);
                        E.r0 r0Var = E.r0.f3944a;
                        AbstractC4326r a11 = io.sentry.compose.b.a("TitleHeadlineContent");
                        j4.b(Ng.H.v(R.string.conversations_role_assistant, rVar), r0Var.a(), 0L, 0L, null, S0.D.f15972k0, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 196608, 0, 131036);
                        Sc.n a12 = d12.f39767f.a();
                        if (a12 != null) {
                            enumC6212z = a12.f16533a;
                        } else {
                            enumC6212z = null;
                        }
                        if (enumC6212z != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        R4.b.e(r0Var, z10, a11, androidx.compose.animation.b.c(null, 3), androidx.compose.animation.b.d(null, 3), null, R4.b.X(rVar, -1632780610, new C0046u0(enumC6212z, 9, r0Var)), rVar, 1600518, 18);
                        AbstractC6463a.v(rVar, false, true, false, false);
                        rVar.t(false);
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                }
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new F.o(d12, abstractC4326r3, i10, i11, 9);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 91) != 18) {
        }
        if (i15 == 0) {
        }
        if (d12.f39759N == null) {
        }
        v10 = rVar.v();
        if (v10 == null) {
        }
    }
}
