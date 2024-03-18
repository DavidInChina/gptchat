package W;

import E.AbstractC0434s;
import E0.C0453l;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1741v0;
import l0.AbstractC4326r;
import l0.C4323o;
import n0.C4707f;
import q0.C5254f;
import r0.C5347k;
import u0.AbstractC5824b;
import v0.C5953f;

/* renamed from: W.r1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1607r1 {

    /* renamed from: a  reason: collision with root package name */
    public static final AbstractC4326r f20378a;

    static {
        C4323o c4323o = C4323o.f37719b;
        float f6 = X.s.f21630a;
        f20378a = androidx.compose.foundation.layout.e.j(c4323o, X.s.f21630a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a3, code lost:
        if ((r24 & 8) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0156, code lost:
        if (java.lang.Float.isInfinite(q0.C5254f.b(r7)) != false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC5824b abstractC5824b, String str, AbstractC4326r abstractC4326r, long j6, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        long j10;
        long j11;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        int i13;
        AbstractC4326r abstractC4326r4;
        int i14;
        long j12;
        boolean z10;
        Object K10;
        AbstractC4326r abstractC4326r5;
        boolean z11;
        C5347k a5;
        int i15;
        int i16;
        int i17;
        int i18;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-2142239481);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.i(abstractC5824b)) {
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
        } else if ((i10 & 48) == 0) {
            if (rVar.g(str)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        int i19 = i11 & 4;
        if (i19 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
            if ((i10 & 3072) != 0) {
                j10 = j6;
                if ((i11 & 8) == 0 && rVar.f(j10)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            } else {
                j10 = j6;
            }
            if ((i12 & 1171) != 1170 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
                j11 = j10;
            } else {
                rVar.R();
                i13 = i10 & 1;
                abstractC4326r4 = C4323o.f37719b;
                if (i13 == 0 && !rVar.A()) {
                    rVar.P();
                } else {
                    if (i19 != 0) {
                        abstractC4326r2 = abstractC4326r4;
                    }
                    if ((i11 & 8) != 0) {
                        j10 = ((r0.r) rVar.m(Z0.f19875a)).f44265a;
                        i12 &= -7169;
                    }
                    i14 = i12;
                    AbstractC4326r abstractC4326r6 = abstractC4326r2;
                    j12 = j10;
                    rVar.u();
                    rVar.W(69356724);
                    if ((((i14 & 7168) ^ 3072) <= 2048 && rVar.f(j12)) || (i14 & 3072) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    K10 = rVar.K();
                    io.sentry.hints.i iVar = C1723m.f22654Y;
                    if (!z10 || K10 == iVar) {
                        if (!r0.r.c(j12, r0.r.f44263k)) {
                            a5 = null;
                        } else {
                            int i20 = C5347k.f44246d;
                            a5 = C4707f.a(5, j12);
                        }
                        K10 = a5;
                        rVar.h0(K10);
                    }
                    C5347k c5347k = (C5347k) K10;
                    rVar.t(false);
                    rVar.W(69356847);
                    if (str == null) {
                        rVar.W(69356912);
                        if ((i14 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Object K11 = rVar.K();
                        if (z11 || K11 == iVar) {
                            K11 = new G(str, 2);
                            rVar.h0(K11);
                        }
                        rVar.t(false);
                        abstractC4326r5 = L0.l.a(abstractC4326r4, false, (wf.k) K11);
                    } else {
                        abstractC4326r5 = abstractC4326r4;
                    }
                    rVar.t(false);
                    if (!C5254f.a(abstractC5824b.h(), C5254f.f43638c)) {
                        long h10 = abstractC5824b.h();
                        if (Float.isInfinite(C5254f.d(h10))) {
                        }
                        AbstractC0434s.a(androidx.compose.ui.draw.a.g(abstractC4326r6.g(abstractC4326r4), abstractC5824b, null, C0453l.f4074b, 0.0f, c5347k, 22).g(abstractC4326r5), rVar, 0);
                        abstractC4326r3 = abstractC4326r6;
                        j11 = j12;
                    }
                    abstractC4326r4 = f20378a;
                    AbstractC0434s.a(androidx.compose.ui.draw.a.g(abstractC4326r6.g(abstractC4326r4), abstractC5824b, null, C0453l.f4074b, 0.0f, c5347k, 22).g(abstractC4326r5), rVar, 0);
                    abstractC4326r3 = abstractC4326r6;
                    j11 = j12;
                }
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new C1603q1(abstractC5824b, str, abstractC4326r3, j11, i10, i11, 1);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 3072) != 0) {
        }
        if ((i12 & 1171) != 1170) {
        }
        rVar.R();
        i13 = i10 & 1;
        abstractC4326r4 = C4323o.f37719b;
        if (i13 == 0) {
        }
        if (i19 != 0) {
        }
        if ((i11 & 8) != 0) {
        }
        i14 = i12;
        AbstractC4326r abstractC4326r62 = abstractC4326r2;
        j12 = j10;
        rVar.u();
        rVar.W(69356724);
        if (((i14 & 7168) ^ 3072) <= 2048) {
        }
        z10 = false;
        K10 = rVar.K();
        io.sentry.hints.i iVar2 = C1723m.f22654Y;
        if (!z10) {
        }
        if (!r0.r.c(j12, r0.r.f44263k)) {
        }
        K10 = a5;
        rVar.h0(K10);
        C5347k c5347k2 = (C5347k) K10;
        rVar.t(false);
        rVar.W(69356847);
        if (str == null) {
        }
        rVar.t(false);
        if (!C5254f.a(abstractC5824b.h(), C5254f.f43638c)) {
        }
        abstractC4326r4 = f20378a;
        AbstractC0434s.a(androidx.compose.ui.draw.a.g(abstractC4326r62.g(abstractC4326r4), abstractC5824b, null, C0453l.f4074b, 0.0f, c5347k2, 22).g(abstractC4326r5), rVar, 0);
        abstractC4326r3 = abstractC4326r62;
        j11 = j12;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C5953f c5953f, String str, AbstractC4326r abstractC4326r, long j6, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        AbstractC4326r abstractC4326r2;
        long j10;
        long j11;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        int i14;
        int i15;
        int i16;
        int i17;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-126890956);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.g(c5953f)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.g(str)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                abstractC4326r2 = abstractC4326r;
                if (rVar.g(abstractC4326r2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        j10 = j6;
                        if (rVar.f(j10)) {
                            i14 = 2048;
                            i12 |= i14;
                        }
                    } else {
                        j10 = j6;
                    }
                    i14 = 1024;
                    i12 |= i14;
                } else {
                    j10 = j6;
                }
                if ((i12 & 1171) != 1170 && rVar.B()) {
                    rVar.P();
                    abstractC4326r3 = abstractC4326r2;
                    j11 = j10;
                } else {
                    rVar.R();
                    if ((i10 & 1) == 0 && !rVar.A()) {
                        rVar.P();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        abstractC4326r3 = abstractC4326r2;
                    } else {
                        if (i13 != 0) {
                            abstractC4326r3 = C4323o.f37719b;
                        } else {
                            abstractC4326r3 = abstractC4326r2;
                        }
                        if ((i11 & 8) != 0) {
                            j10 = ((r0.r) rVar.m(Z0.f19875a)).f44265a;
                            i12 &= -7169;
                        }
                    }
                    j11 = j10;
                    rVar.u();
                    a(R4.b.R1(c5953f, rVar), str, abstractC4326r3, j11, rVar, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new C1603q1(c5953f, str, abstractC4326r3, j11, i10, i11, 0);
                    return;
                }
                return;
            }
            abstractC4326r2 = abstractC4326r;
            if ((i10 & 3072) == 0) {
            }
            if ((i12 & 1171) != 1170) {
            }
            rVar.R();
            if ((i10 & 1) == 0) {
            }
            if (i13 != 0) {
            }
            if ((i11 & 8) != 0) {
            }
            j11 = j10;
            rVar.u();
            a(R4.b.R1(c5953f, rVar), str, abstractC4326r3, j11, rVar, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 3072) == 0) {
        }
        if ((i12 & 1171) != 1170) {
        }
        rVar.R();
        if ((i10 & 1) == 0) {
        }
        if (i13 != 0) {
        }
        if ((i11 & 8) != 0) {
        }
        j11 = j10;
        rVar.u();
        a(R4.b.R1(c5953f, rVar), str, abstractC4326r3, j11, rVar, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
        v10 = rVar.v();
        if (v10 != null) {
        }
    }
}
