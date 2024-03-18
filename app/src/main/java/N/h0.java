package N;

import E0.AbstractC0461u;
import id.AbstractC3557B;
import q0.C5251c;
import q0.C5252d;
import r0.AbstractC5352p;
import t0.C5644c;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C5252d f12345a = new C5252d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: b  reason: collision with root package name */
    public static r0.z f12346b;

    /* renamed from: c  reason: collision with root package name */
    public static AbstractC5352p f12347c;

    /* renamed from: d  reason: collision with root package name */
    public static C5644c f12348d;

    public static final boolean a(long j6, C5252d c5252d) {
        float d10 = C5251c.d(j6);
        if (c5252d.f43625a <= d10 && d10 <= c5252d.f43627c) {
            float e10 = C5251c.e(j6);
            if (c5252d.f43626b <= e10 && e10 <= c5252d.f43628d) {
                return true;
            }
        }
        return false;
    }

    public static final long b(f0 f0Var, long j6, r rVar) {
        int i10;
        long j10;
        float f6;
        float f10;
        int g10;
        float f11;
        float f12;
        int g11;
        int g12;
        int g13;
        AbstractC1032p c10 = f0Var.c(rVar);
        if (c10 == null) {
            return C5251c.f43621d;
        }
        AbstractC0461u abstractC0461u = f0Var.f12325k;
        if (abstractC0461u == null) {
            return C5251c.f43621d;
        }
        C1030n c1030n = (C1030n) c10;
        AbstractC0461u c11 = c1030n.c();
        if (c11 == null) {
            return C5251c.f43621d;
        }
        AbstractC6216a abstractC6216a = c1030n.f12385c;
        N0.C c12 = (N0.C) abstractC6216a.mo122invoke();
        if (c12 == null) {
            i10 = 0;
        } else {
            i10 = c1030n.b(c12);
        }
        int i11 = rVar.f12404b;
        if (i11 > i10) {
            return C5251c.f43621d;
        }
        C5251c c5251c = (C5251c) f0Var.f12331q.getValue();
        AbstractC3557B.Z(c5251c);
        float d10 = C5251c.d(c11.B(abstractC0461u, c5251c.f43623a));
        N0.C c13 = (N0.C) abstractC6216a.mo122invoke();
        if (c13 == null) {
            j10 = N0.D.f12483b;
        } else {
            int b10 = c1030n.b(c13);
            if (b10 < 1) {
                j10 = N0.D.f12483b;
            } else {
                int g14 = c13.g(com.google.android.gms.internal.play_billing.N.p(i11, 0, b10 - 1));
                j10 = U3.f.e(c13.k(g14), c13.f(g14, true));
            }
        }
        if (N0.D.b(j10)) {
            N0.C c14 = (N0.C) abstractC6216a.mo122invoke();
            if (c14 == null || (g13 = c14.g(i11)) >= c14.f12478b.f12529f) {
                f6 = -1.0f;
            } else {
                f6 = c14.i(g13);
            }
        } else {
            int i12 = (int) (j10 >> 32);
            N0.C c15 = (N0.C) abstractC6216a.mo122invoke();
            if (c15 == null || (g12 = c15.g(i12)) >= c15.f12478b.f12529f) {
                f11 = -1.0f;
            } else {
                f11 = c15.i(g12);
            }
            int i13 = ((int) (j10 & 4294967295L)) - 1;
            N0.C c16 = (N0.C) abstractC6216a.mo122invoke();
            if (c16 == null || (g11 = c16.g(i13)) >= c16.f12478b.f12529f) {
                f12 = -1.0f;
            } else {
                f12 = c16.j(g11);
            }
            f6 = com.google.android.gms.internal.play_billing.N.o(d10, Math.min(f11, f12), Math.max(f11, f12));
        }
        if (f6 == -1.0f) {
            return C5251c.f43621d;
        }
        if (Math.abs(d10 - f6) > ((int) (j6 >> 32)) / 2) {
            return C5251c.f43621d;
        }
        N0.C c17 = (N0.C) abstractC6216a.mo122invoke();
        if (c17 == null || (g10 = c17.g(i11)) >= c17.f12478b.f12529f) {
            f10 = -1.0f;
        } else {
            float l10 = c17.l(g10);
            f10 = ((c17.e(g10) - l10) / 2) + l10;
        }
        if (f10 == -1.0f) {
            return C5251c.f43621d;
        }
        return abstractC0461u.B(c11, R4.b.r(f6, f10));
    }

    public static final C5252d c(AbstractC0461u abstractC0461u) {
        C5252d c10 = androidx.compose.ui.layout.a.c(abstractC0461u);
        long s10 = abstractC0461u.s(c10.e());
        long s11 = abstractC0461u.s(R4.b.r(c10.f43627c, c10.f43628d));
        return new C5252d(C5251c.d(s10), C5251c.e(s10), C5251c.d(s11), C5251c.e(s11));
    }
}
