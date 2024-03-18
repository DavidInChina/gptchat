package Kb;

import A.AbstractC0044t0;
import E.AbstractC0434s;
import E0.N;
import G.I;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import T0.H;
import W.C1608r2;
import Yg.r;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import Z.o1;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import h0.C3288a;
import id.AbstractC3557B;
import jf.AbstractC3953c;
import l0.AbstractC4326r;
import l0.C4310b;
import nf.AbstractC4828h;
import t9.AbstractC5684a;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final float f9590a = (float) RCHTTPStatusCodes.SUCCESS;

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC4326r abstractC4326r, r rVar, String str, wf.k kVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        String str2;
        Z.r rVar2;
        String str3;
        r rVar3;
        AbstractC4326r abstractC4326r3;
        r rVar4;
        String str4;
        Object K10;
        io.sentry.hints.i iVar;
        Object w10;
        String str5;
        boolean z10;
        C3288a c3288a;
        String str6;
        AbstractC4326r abstractC4326r4;
        r rVar5;
        r rVar6;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("onValueChange", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("BirthdayInput");
        Z.r rVar7 = (Z.r) abstractC1725n;
        rVar7.X(958914228);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i10 & 14) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar7.g(abstractC4326r2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            abstractC4326r2 = abstractC4326r;
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 16;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            str2 = str;
            if (rVar7.g(str2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
            if ((i11 & 8) == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (rVar7.i(kVar)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if (i17 != 2 && (i12 & 5851) == 1170 && rVar7.B()) {
                rVar7.P();
                abstractC4326r3 = abstractC4326r2;
                rVar2 = rVar7;
                str3 = str2;
                rVar3 = rVar;
            } else {
                if (i16 != 0) {
                    abstractC4326r2 = a5;
                }
                if (i17 == 0) {
                    rVar4 = null;
                } else {
                    rVar4 = rVar;
                }
                if (i18 == 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                rVar7.W(-300274047);
                K10 = rVar7.K();
                iVar = C1723m.f22654Y;
                if (K10 == iVar) {
                    K10 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
                    rVar7.h0(K10);
                }
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
                w10 = AbstractC0044t0.w(rVar7, false, -300273984);
                if (w10 == iVar) {
                    w10 = R.a.o(abstractC1710f0, 29, rVar7);
                }
                rVar7.t(false);
                AbstractC4326r h10 = androidx.compose.foundation.a.h(abstractC4326r2, (AbstractC6216a) w10);
                rVar7.W(733328855);
                N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar7);
                rVar7.W(-1323940314);
                int i19 = rVar7.P;
                AbstractC1732q0 p10 = rVar7.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i20 = androidx.compose.ui.layout.a.i(h10);
                if (!(rVar7.f22696a instanceof AbstractC1707e)) {
                    rVar7.Z();
                    if (rVar7.f22695O) {
                        rVar7.o(c0582k);
                    } else {
                        rVar7.k0();
                    }
                    U3.f.n0(rVar7, c10, C0583l.f5808f);
                    U3.f.n0(rVar7, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar7.f22695O || !AbstractC3557B.K(rVar7.K(), Integer.valueOf(i19))) {
                        AbstractC6463a.q(i19, rVar7, i19, c0581j);
                    }
                    AbstractC6463a.r(0, i20, new L0(rVar7), rVar7, 2058660585);
                    if (rVar4 != null) {
                        r rVar8 = AbstractC5684a.f45797a;
                        str5 = AbstractC5684a.f45799c.format(rVar4.f22420Y);
                        AbstractC3557B.b0("format(...)", str5);
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str7 = str5;
                    C1608r2 c1608r2 = C1608r2.f20379a;
                    if (str4 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (str4 != null) {
                        c3288a = R4.b.X(rVar7, 713637480, new r9.r(str4, 6));
                    } else {
                        c3288a = null;
                    }
                    A9.a aVar = H.f16758a;
                    rVar7.W(532145937);
                    Object K11 = rVar7.K();
                    if (K11 == iVar) {
                        K11 = kotlin.jvm.internal.m.d();
                        rVar7.h0(K11);
                    }
                    rVar7.t(false);
                    c1608r2.b(str7, R4.b.X(rVar7, 1583287519, new r9.r(str7, 7)), true, false, aVar, (D.m) K11, z10, g.f9601a, null, null, g.f9602b, null, null, c3288a, null, null, null, rVar7, 12807600, 12582918, 121600);
                    AbstractC6463a.v(rVar7, false, true, false, false);
                    if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                        if (rVar4 == null) {
                            rVar6 = AbstractC5684a.f45797a;
                        } else {
                            rVar6 = rVar4;
                        }
                        rVar7.W(-300272810);
                        Object K12 = rVar7.K();
                        if (K12 == iVar) {
                            K12 = E9.f.x(abstractC1710f0, 0, rVar7);
                        }
                        rVar7.t(false);
                        str6 = str4;
                        abstractC4326r4 = abstractC4326r2;
                        r rVar9 = rVar6;
                        rVar5 = rVar4;
                        rVar2 = rVar7;
                        b(kVar, (AbstractC6216a) K12, rVar9, a5, rVar7, ((i12 >> 9) & 14) | 560, 8);
                    } else {
                        str6 = str4;
                        abstractC4326r4 = abstractC4326r2;
                        rVar5 = rVar4;
                        rVar2 = rVar7;
                    }
                    rVar3 = rVar5;
                    abstractC4326r3 = abstractC4326r4;
                    str3 = str6;
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            C1741v0 v10 = rVar2.v();
            if (v10 != null) {
                v10.f22739d = new I(abstractC4326r3, (Object) rVar3, (Object) str3, (AbstractC3953c) kVar, i10, i11, 23);
                return;
            }
            return;
        }
        str2 = str;
        if ((i11 & 8) == 0) {
        }
        if (i17 != 2) {
        }
        if (i16 != 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        rVar7.W(-300274047);
        K10 = rVar7.K();
        iVar = C1723m.f22654Y;
        if (K10 == iVar) {
        }
        AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) K10;
        w10 = AbstractC0044t0.w(rVar7, false, -300273984);
        if (w10 == iVar) {
        }
        rVar7.t(false);
        AbstractC4326r h102 = androidx.compose.foundation.a.h(abstractC4326r2, (AbstractC6216a) w10);
        rVar7.W(733328855);
        N c102 = AbstractC0434s.c(C4310b.f37693Y, false, rVar7);
        rVar7.W(-1323940314);
        int i192 = rVar7.P;
        AbstractC1732q0 p102 = rVar7.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i202 = androidx.compose.ui.layout.a.i(h102);
        if (!(rVar7.f22696a instanceof AbstractC1707e)) {
        }
    }

    public static final void b(wf.k kVar, AbstractC6216a abstractC6216a, r rVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        AbstractC4326r abstractC4326r2;
        AbstractC3557B.c0("onValueChange", kVar);
        AbstractC3557B.c0("onDismissRequest", abstractC6216a);
        AbstractC3557B.c0("selectedDate", rVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("BirthdayPicker");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(1051049201);
        if ((i11 & 8) != 0) {
            abstractC4326r2 = a5;
        } else {
            abstractC4326r2 = abstractC4326r;
        }
        A7.b.f(abstractC6216a, abstractC4326r2, null, 0L, A7.b.v1(6, 2, rVar2, true), null, R4.b.X(rVar2, 2068443102, new Q8.i(kVar, abstractC6216a, rVar, 11)), rVar2, ((i10 >> 3) & 14) | 1572864 | ((i10 >> 6) & 112), 44);
        C1741v0 v10 = rVar2.v();
        if (v10 != null) {
            v10.f22739d = new I(kVar, abstractC6216a, rVar, abstractC4326r2, i10, i11, 24);
        }
    }
}
