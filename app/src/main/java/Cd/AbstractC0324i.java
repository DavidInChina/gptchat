package Cd;

import N.C1041z;
import W.AbstractC1523a1;
import W.C1550f3;
import W.R0;
import Z.AbstractC1725n;
import Z.C1741v0;
import aa.C1939b;
import aa.EnumC1938a;
import ca.EnumC2323o;
import ha.C3349B;
import ha.C3354G;
import ha.C3381y;
import ha.EnumC3352E;
import ha.EnumC3379w;
import id.AbstractC3557B;
import jf.C3959i;
import kf.AbstractC4268D;
import l0.AbstractC4326r;
import l8.AbstractC4344b;
import p9.AbstractC5102d;
import wf.AbstractC6216a;
import y.C6477o;

/* renamed from: Cd.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0324i {
    static {
        new ha.M("petstore.swagger.io", "findByStatus", AbstractC4268D.a1(new C3959i("status", "available"), new C3959i("limit", "1")), AbstractC4344b.G0(new C3381y("allow", EnumC3379w.f32084Z, "44c665ad-cf2c-49cc-a1ad-7213f118ecca"), new C3349B("always_allow", "44c665ad-cf2c-49cc-a1ad-7213f118ecca", "d96aeea22c22347903a5250732759d7b17863134"), new C3354G("deny", EnumC3352E.f32002Z, "44c665ad-cf2c-49cc-a1ad-7213f118ecca")), 21);
        EnumC1938a enumC1938a = EnumC1938a.f24016Y;
        EnumC2323o enumC2323o = EnumC2323o.f26406Y;
    }

    public static final void a(wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        AbstractC3557B.c0("content", nVar);
        L0.u uVar = io.sentry.compose.b.f34309a;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-241956237);
        if ((i10 & 14) == 0) {
            if (rVar.i(nVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar.B()) {
            rVar.P();
        } else {
            AbstractC1523a1.a(R0.c(r0.r.f44258f, r0.r.f44254b, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -4), null, null, nVar, rVar, (i11 << 9) & 7168, 6);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1041z(nVar, i10, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(AbstractC6216a abstractC6216a, wf.k kVar, wf.k kVar2, AbstractC4326r abstractC4326r, C1939b c1939b, C1550f3 c1550f3, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        C1939b c1939b2;
        C1550f3 c1550f32;
        C1550f3 c1550f33;
        C1939b c1939b3;
        C1550f3 c1550f34;
        AbstractC4326r abstractC4326r3;
        C1939b c1939b4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        AbstractC3557B.c0("onDismissRequest", abstractC6216a);
        AbstractC3557B.c0("onMessagesIntent", kVar);
        AbstractC3557B.c0("onActionClick", kVar2);
        AbstractC4326r a5 = io.sentry.compose.b.a("VoiceActionsBottomSheet");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1948785439);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.i(abstractC6216a)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.i(kVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.i(kVar2)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        int i20 = i11 & 8;
        if (i20 != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
            i13 = i11 & 16;
            if (i13 == 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                c1939b2 = c1939b;
                if (rVar.g(c1939b2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        c1550f32 = c1550f3;
                        if (rVar.g(c1550f32)) {
                            i14 = 131072;
                            i12 |= i14;
                        }
                    } else {
                        c1550f32 = c1550f3;
                    }
                    i14 = 65536;
                    i12 |= i14;
                } else {
                    c1550f32 = c1550f3;
                }
                if ((374491 & i12) != 74898 && rVar.B()) {
                    rVar.P();
                    c1939b3 = c1939b2;
                    c1550f33 = c1550f32;
                } else {
                    rVar.R();
                    if ((i10 & 1) == 0 && !rVar.A()) {
                        rVar.P();
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        abstractC4326r3 = abstractC4326r2;
                    } else {
                        if (i20 == 0) {
                            a5 = abstractC4326r2;
                        }
                        if (i13 != 0) {
                            c1939b2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            abstractC4326r3 = a5;
                            c1550f34 = A7.b.v1(6, 2, rVar, false);
                            c1939b4 = c1939b2;
                            rVar.u();
                            float f6 = 10;
                            A7.b.f(abstractC6216a, abstractC4326r3, K.f.b(f6, f6), AbstractC5102d.f42768e, c1550f34, null, R4.b.X(rVar, 1842680076, new ub.j(c1939b4, kVar, kVar2, 2)), rVar, 1769472 | (i12 & 14) | ((i12 >> 6) & 112) | ((i12 >> 3) & 57344), 0);
                            abstractC4326r2 = abstractC4326r3;
                            c1550f33 = c1550f34;
                            c1939b3 = c1939b4;
                        } else {
                            abstractC4326r3 = a5;
                        }
                    }
                    c1939b4 = c1939b2;
                    c1550f34 = c1550f32;
                    rVar.u();
                    float f62 = 10;
                    A7.b.f(abstractC6216a, abstractC4326r3, K.f.b(f62, f62), AbstractC5102d.f42768e, c1550f34, null, R4.b.X(rVar, 1842680076, new ub.j(c1939b4, kVar, kVar2, 2)), rVar, 1769472 | (i12 & 14) | ((i12 >> 6) & 112) | ((i12 >> 3) & 57344), 0);
                    abstractC4326r2 = abstractC4326r3;
                    c1550f33 = c1550f34;
                    c1939b3 = c1939b4;
                }
                C1741v0 v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new C6477o(abstractC6216a, kVar, kVar2, abstractC4326r2, c1939b3, c1550f33, i10, i11);
                    return;
                }
                return;
            }
            c1939b2 = c1939b;
            if ((458752 & i10) == 0) {
            }
            if ((374491 & i12) != 74898) {
            }
            rVar.R();
            if ((i10 & 1) == 0) {
            }
            if (i20 == 0) {
            }
            if (i13 != 0) {
            }
            if ((i11 & 32) != 0) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 16;
        if (i13 == 0) {
        }
        c1939b2 = c1939b;
        if ((458752 & i10) == 0) {
        }
        if ((374491 & i12) != 74898) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i20 == 0) {
        }
        if (i13 != 0) {
        }
        if ((i11 & 32) != 0) {
        }
    }
}
