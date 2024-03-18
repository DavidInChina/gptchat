package L;

import E0.AbstractC0461u;
import q0.C5251c;
import q0.C5252d;

/* loaded from: classes2.dex */
public final class Q0 {

    /* renamed from: a  reason: collision with root package name */
    public final N0.C f10054a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC0461u f10055b;

    /* renamed from: c  reason: collision with root package name */
    public AbstractC0461u f10056c;

    public Q0(N0.C c10) {
        this.f10054a = c10;
    }

    public final long a(long j6) {
        C5252d c5252d;
        AbstractC0461u abstractC0461u = this.f10055b;
        C5252d c5252d2 = C5252d.f43624e;
        if (abstractC0461u != null) {
            if (abstractC0461u.i()) {
                AbstractC0461u abstractC0461u2 = this.f10056c;
                if (abstractC0461u2 != null) {
                    c5252d = abstractC0461u2.F(abstractC0461u, true);
                } else {
                    c5252d = null;
                }
            } else {
                c5252d = c5252d2;
            }
            if (c5252d != null) {
                c5252d2 = c5252d;
            }
        }
        float d10 = C5251c.d(j6);
        float f6 = c5252d2.f43625a;
        if (d10 >= f6) {
            float d11 = C5251c.d(j6);
            f6 = c5252d2.f43627c;
            if (d11 <= f6) {
                f6 = C5251c.d(j6);
            }
        }
        float e10 = C5251c.e(j6);
        float f10 = c5252d2.f43626b;
        if (e10 >= f10) {
            float e11 = C5251c.e(j6);
            f10 = c5252d2.f43628d;
            if (e11 <= f10) {
                f10 = C5251c.e(j6);
            }
        }
        return R4.b.r(f6, f10);
    }

    public final int b(long j6, boolean z10) {
        if (z10) {
            j6 = a(j6);
        }
        return this.f10054a.m(d(j6));
    }

    public final boolean c(long j6) {
        long d10 = d(a(j6));
        float e10 = C5251c.e(d10);
        N0.C c10 = this.f10054a;
        int h10 = c10.h(e10);
        if (C5251c.d(d10) >= c10.i(h10) && C5251c.d(d10) <= c10.j(h10)) {
            return true;
        }
        return false;
    }

    public final long d(long j6) {
        AbstractC0461u abstractC0461u;
        AbstractC0461u abstractC0461u2 = this.f10055b;
        if (abstractC0461u2 != null) {
            AbstractC0461u abstractC0461u3 = null;
            if (!abstractC0461u2.i()) {
                abstractC0461u2 = null;
            }
            if (abstractC0461u2 != null && (abstractC0461u = this.f10056c) != null) {
                if (abstractC0461u.i()) {
                    abstractC0461u3 = abstractC0461u;
                }
                if (abstractC0461u3 != null) {
                    return abstractC0461u2.B(abstractC0461u3, j6);
                }
                return j6;
            }
            return j6;
        }
        return j6;
    }

    public final long e(long j6) {
        AbstractC0461u abstractC0461u;
        AbstractC0461u abstractC0461u2 = this.f10055b;
        if (abstractC0461u2 != null) {
            AbstractC0461u abstractC0461u3 = null;
            if (!abstractC0461u2.i()) {
                abstractC0461u2 = null;
            }
            if (abstractC0461u2 != null && (abstractC0461u = this.f10056c) != null) {
                if (abstractC0461u.i()) {
                    abstractC0461u3 = abstractC0461u;
                }
                if (abstractC0461u3 != null) {
                    return abstractC0461u3.B(abstractC0461u2, j6);
                }
                return j6;
            }
            return j6;
        }
        return j6;
    }
}
