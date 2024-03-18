package N;

import N0.C1046e;
import id.AbstractC3557B;

/* renamed from: N.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1024h {

    /* renamed from: a  reason: collision with root package name */
    public final C1046e f12338a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12339b;

    /* renamed from: c  reason: collision with root package name */
    public final N0.C f12340c;

    /* renamed from: d  reason: collision with root package name */
    public final T0.s f12341d;

    /* renamed from: e  reason: collision with root package name */
    public final x0 f12342e;

    /* renamed from: f  reason: collision with root package name */
    public long f12343f;

    /* renamed from: g  reason: collision with root package name */
    public final C1046e f12344g;

    public AbstractC1024h(C1046e c1046e, long j6, N0.C c10, T0.s sVar, x0 x0Var) {
        this.f12338a = c1046e;
        this.f12339b = j6;
        this.f12340c = c10;
        this.f12341d = sVar;
        this.f12342e = x0Var;
        this.f12343f = j6;
        this.f12344g = c1046e;
    }

    public final Integer a() {
        N0.C c10 = this.f12340c;
        if (c10 != null) {
            int d10 = N0.D.d(this.f12343f);
            T0.s sVar = this.f12341d;
            return Integer.valueOf(sVar.a(c10.f(c10.g(sVar.b(d10)), true)));
        }
        return null;
    }

    public final Integer b() {
        N0.C c10 = this.f12340c;
        if (c10 != null) {
            int e10 = N0.D.e(this.f12343f);
            T0.s sVar = this.f12341d;
            return Integer.valueOf(sVar.a(c10.k(c10.g(sVar.b(e10)))));
        }
        return null;
    }

    public final Integer c() {
        int length;
        N0.C c10 = this.f12340c;
        if (c10 != null) {
            int m10 = m();
            while (true) {
                C1046e c1046e = this.f12338a;
                if (m10 >= c1046e.f12512Y.length()) {
                    length = c1046e.f12512Y.length();
                    break;
                }
                int length2 = this.f12344g.f12512Y.length() - 1;
                if (m10 <= length2) {
                    length2 = m10;
                }
                long p10 = c10.p(length2);
                int i10 = N0.D.f12484c;
                int i11 = (int) (p10 & 4294967295L);
                if (i11 <= m10) {
                    m10++;
                } else {
                    length = this.f12341d.a(i11);
                    break;
                }
            }
            return Integer.valueOf(length);
        }
        return null;
    }

    public final Integer d() {
        int i10;
        N0.C c10 = this.f12340c;
        if (c10 != null) {
            int m10 = m();
            while (true) {
                if (m10 <= 0) {
                    i10 = 0;
                    break;
                }
                int length = this.f12344g.f12512Y.length() - 1;
                if (m10 <= length) {
                    length = m10;
                }
                long p10 = c10.p(length);
                int i11 = N0.D.f12484c;
                int i12 = (int) (p10 >> 32);
                if (i12 >= m10) {
                    m10--;
                } else {
                    i10 = this.f12341d.a(i12);
                    break;
                }
            }
            return Integer.valueOf(i10);
        }
        return null;
    }

    public final boolean e() {
        Y0.h hVar;
        N0.C c10 = this.f12340c;
        if (c10 != null) {
            hVar = c10.n(m());
        } else {
            hVar = null;
        }
        if (hVar != Y0.h.f22028Z) {
            return true;
        }
        return false;
    }

    public final int f(N0.C c10, int i10) {
        int m10 = m();
        x0 x0Var = this.f12342e;
        if (x0Var.f12451a == null) {
            x0Var.f12451a = Float.valueOf(c10.c(m10).f43625a);
        }
        int g10 = c10.g(m10) + i10;
        if (g10 < 0) {
            return 0;
        }
        if (g10 >= c10.f12478b.f12529f) {
            return this.f12344g.f12512Y.length();
        }
        float e10 = c10.e(g10) - 1;
        Float f6 = x0Var.f12451a;
        AbstractC3557B.Z(f6);
        float floatValue = f6.floatValue();
        if ((e() && floatValue >= c10.j(g10)) || (!e() && floatValue <= c10.i(g10))) {
            return c10.f(g10, true);
        }
        return this.f12341d.a(c10.m(R4.b.r(f6.floatValue(), e10)));
    }

    public final void g() {
        this.f12342e.f12451a = null;
        C1046e c1046e = this.f12344g;
        if (c1046e.f12512Y.length() > 0) {
            int d10 = N0.D.d(this.f12343f);
            String str = c1046e.f12512Y;
            int w02 = R4.b.w0(d10, str);
            if (w02 == N0.D.d(this.f12343f) && w02 != str.length()) {
                w02 = R4.b.w0(w02 + 1, str);
            }
            l(w02, w02);
        }
    }

    public final void h() {
        this.f12342e.f12451a = null;
        C1046e c1046e = this.f12344g;
        if (c1046e.f12512Y.length() > 0) {
            int e10 = N0.D.e(this.f12343f);
            String str = c1046e.f12512Y;
            int x02 = R4.b.x0(e10, str);
            if (x02 == N0.D.e(this.f12343f) && x02 != 0) {
                x02 = R4.b.x0(x02 - 1, str);
            }
            l(x02, x02);
        }
    }

    public final void i() {
        Integer a5;
        this.f12342e.f12451a = null;
        if (this.f12344g.f12512Y.length() > 0 && (a5 = a()) != null) {
            int intValue = a5.intValue();
            l(intValue, intValue);
        }
    }

    public final void j() {
        Integer b10;
        this.f12342e.f12451a = null;
        if (this.f12344g.f12512Y.length() > 0 && (b10 = b()) != null) {
            int intValue = b10.intValue();
            l(intValue, intValue);
        }
    }

    public final void k() {
        if (this.f12344g.f12512Y.length() > 0) {
            int i10 = N0.D.f12484c;
            this.f12343f = U3.f.e((int) (this.f12339b >> 32), (int) (this.f12343f & 4294967295L));
        }
    }

    public final void l(int i10, int i11) {
        this.f12343f = U3.f.e(i10, i11);
    }

    public final int m() {
        long j6 = this.f12343f;
        int i10 = N0.D.f12484c;
        return this.f12341d.b((int) (j6 & 4294967295L));
    }
}
