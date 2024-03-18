package W;

import A.AbstractC0048v0;
import X.AbstractC1670d;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1737t0;
import Z.C1741v0;
import z.AbstractC6696f;

/* renamed from: W.a1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1523a1 {

    /* renamed from: a  reason: collision with root package name */
    public static final N0.u f19889a = new N0.u(null, new N0.s());

    /* renamed from: b  reason: collision with root package name */
    public static final V.h f19890b = new V.h(0.16f, 0.12f, 0.08f, 0.12f);

    public static final void a(P0 p02, C1525a3 c1525a3, p4 p4Var, wf.n nVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        P0 p03;
        C1525a3 c1525a32;
        p4 p4Var2;
        C1525a3 c1525a33;
        P0 p04;
        C1525a3 c1525a34;
        int i13;
        int i14;
        int i15;
        int i16;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-2127166334);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0) {
                p03 = p02;
                if (rVar.g(p03)) {
                    i16 = 4;
                    i12 = i16 | i10;
                }
            } else {
                p03 = p02;
            }
            i16 = 2;
            i12 = i16 | i10;
        } else {
            p03 = p02;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                c1525a32 = c1525a3;
                if (rVar.g(c1525a32)) {
                    i15 = 32;
                    i12 |= i15;
                }
            } else {
                c1525a32 = c1525a3;
            }
            i15 = 16;
            i12 |= i15;
        } else {
            c1525a32 = c1525a3;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                p4Var2 = p4Var;
                if (rVar.g(p4Var2)) {
                    i14 = 256;
                    i12 |= i14;
                }
            } else {
                p4Var2 = p4Var;
            }
            i14 = 128;
            i12 |= i14;
        } else {
            p4Var2 = p4Var;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (rVar.i(nVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) == 1170 && rVar.B()) {
            rVar.P();
            p04 = p03;
            c1525a34 = c1525a32;
        } else {
            rVar.R();
            if ((i10 & 1) != 0 && !rVar.A()) {
                rVar.P();
                c1525a33 = c1525a32;
            } else {
                if ((i11 & 1) != 0) {
                    p03 = (P0) rVar.m(R0.f19593a);
                }
                if ((i11 & 2) != 0) {
                    c1525a33 = (C1525a3) rVar.m(AbstractC1530b3.f19940a);
                } else {
                    c1525a33 = c1525a32;
                }
                if ((i11 & 4) != 0) {
                    p4Var2 = (p4) rVar.m(q4.f20361a);
                }
            }
            rVar.u();
            V.e a5 = V.v.a(false, 0.0f, rVar, 0, 7);
            rVar.W(1866455512);
            long j6 = p03.f19515a;
            rVar.W(-314518050);
            boolean f6 = rVar.f(j6);
            Object K10 = rVar.K();
            if (f6 || K10 == C1723m.f22654Y) {
                K10 = new N.y0(j6, r0.r.b(j6, 0.4f));
                rVar.h0(K10);
            }
            rVar.t(false);
            rVar.t(false);
            A7.b.l(new C1737t0[]{R0.f19593a.b(p03), AbstractC0048v0.f314a.b(a5), V.y.f17982a.b(G1.f19164a), AbstractC1530b3.f19940a.b(c1525a33), N.z0.f12460a.b((N.y0) K10), q4.f20361a.b(p4Var2)}, R4.b.X(rVar, -1066563262, new C1581m(p4Var2, 4, nVar)), rVar, 48);
            p04 = p03;
            c1525a34 = c1525a33;
        }
        p4 p4Var3 = p4Var2;
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new G.I(p04, c1525a34, p4Var3, nVar, i10, i11, 4);
        }
    }

    public static C1626v0 b(AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-9530498);
        P0 p02 = (P0) rVar.m(R0.f19593a);
        C1626v0 c1626v0 = p02.f19510V;
        if (c1626v0 == null) {
            long d10 = R0.d(p02, AbstractC1670d.f21491d);
            long j6 = r0.r.f44262j;
            int i10 = AbstractC1670d.f21489b;
            long d11 = R0.d(p02, i10);
            int i11 = AbstractC1670d.f21490c;
            c1626v0 = new C1626v0(d10, j6, d11, j6, r0.r.b(R0.d(p02, i11), 0.38f), j6, r0.r.b(R0.d(p02, i11), 0.38f), R0.d(p02, i10), R0.d(p02, AbstractC1670d.f21493f), r0.r.b(R0.d(p02, i11), 0.38f), r0.r.b(R0.d(p02, AbstractC1670d.f21492e), 0.38f), r0.r.b(R0.d(p02, i11), 0.38f));
            p02.f19510V = c1626v0;
        }
        rVar.t(false);
        return c1626v0;
    }

    public static final boolean c(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static C1568j1 d(AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-1757023234);
        C1568j1 c1568j1 = new C1568j1(AbstractC1522a0.h(rVar), AbstractC6696f.u(0.0f, 400.0f, null, 5), y.s0.a(rVar), l4.f20217Y);
        rVar.t(false);
        return c1568j1;
    }

    public static C1588n1 e(long j6, AbstractC1725n abstractC1725n, int i10, int i11) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-18532843);
        if ((i11 & 1) != 0) {
            float f6 = X.q.f21611a;
            j6 = R0.e(32, rVar);
        }
        long j10 = j6;
        long b10 = R0.b(j10, rVar);
        float f10 = X.q.f21611a;
        C1588n1 c1588n1 = new C1588n1(j10, b10, r0.r.b(R0.e(18, rVar), 0.12f), r0.r.b(R0.e(18, rVar), 0.38f));
        rVar.t(false);
        return c1588n1;
    }

    public static C1611s0 f(P0 p02) {
        C1611s0 c1611s0 = p02.f19507O;
        if (c1611s0 == null) {
            float f6 = X.n.f21599a;
            C1611s0 c1611s02 = new C1611s0(R0.d(p02, 44), R0.a(p02, R0.d(p02, 44)), androidx.compose.ui.graphics.a.k(r0.r.b(R0.d(p02, X.n.f21601c), 0.38f), R0.g(p02, X.n.f21602d)), r0.r.b(R0.a(p02, R0.d(p02, 44)), 0.38f));
            p02.f19507O = c1611s02;
            return c1611s02;
        }
        return c1611s0;
    }

    public static C1588n1 g(long j6, long j10, long j11, AbstractC1725n abstractC1725n, int i10, int i11) {
        long j12;
        long j13;
        long j14;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(999008085);
        if ((i11 & 1) != 0) {
            j12 = r0.r.f44263k;
        } else {
            j12 = j6;
        }
        if ((i11 & 2) != 0) {
            j13 = ((r0.r) rVar.m(Z0.f19875a)).f44265a;
        } else {
            j13 = j10;
        }
        if ((i11 & 4) != 0) {
            j14 = r0.r.f44263k;
        } else {
            j14 = j11;
        }
        long b10 = r0.r.b(j13, 0.38f);
        P0 p02 = (P0) rVar.m(R0.f19593a);
        rVar.W(1437915677);
        C1588n1 c1588n1 = p02.f19511W;
        if (c1588n1 == null) {
            long j15 = ((r0.r) rVar.m(Z0.f19875a)).f44265a;
            long j16 = r0.r.f44262j;
            C1588n1 c1588n12 = new C1588n1(j16, j15, j16, r0.r.b(j15, 0.38f));
            p02.f19511W = c1588n12;
            c1588n1 = c1588n12;
        }
        rVar.t(false);
        C1588n1 a5 = c1588n1.a(j12, j13, j14, b10);
        rVar.t(false);
        return a5;
    }
}
