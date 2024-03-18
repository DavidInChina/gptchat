package Wh;

import V1.C1464e;
import id.AbstractC3557B;
import io.sentry.AbstractC3632b0;
import io.sentry.AbstractC3635c0;
import io.sentry.AbstractC3638d0;
import io.sentry.C3641e0;
import io.sentry.C3644f0;
import io.sentry.C3647g0;
import io.sentry.C3650h0;
import io.sentry.C3653i0;
import java.util.ArrayList;
import jh.H1;
import v0.C5937A;
import v0.C5956i;
import v0.C5957j;
import v0.C5958k;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f21239a;

    public p(int i10) {
        if (i10 != 1) {
            this.f21239a = new ArrayList(32);
        } else {
            this.f21239a = new ArrayList();
        }
    }

    public void a(String str, String str2) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("value", str2);
        ArrayList arrayList = this.f21239a;
        arrayList.add(str);
        arrayList.add(Lg.n.U2(str2).toString());
    }

    public void b(String str, String str2) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("value", str2);
        H1.i(str);
        a(str, str2);
    }

    public void c(float f6, float f10, boolean z10, float f11, float f12) {
        this.f21239a.add(new C5956i(f6, f10, 0.0f, false, z10, f11, f12));
    }

    public void d(float f6, float f10, boolean z10, float f11, float f12) {
        this.f21239a.add(new v0.r(f6, f10, 0.0f, false, z10, f11, f12));
    }

    public q e() {
        return new q((String[]) this.f21239a.toArray(new String[0]));
    }

    public void f() {
        this.f21239a.add(C5957j.f46979c);
    }

    public void g(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f21239a.add(new C5958k(f6, f10, f11, f12, f13, f14));
    }

    public void h(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f21239a.add(new v0.s(f6, f10, f11, f12, f13, f14));
    }

    public AbstractC3638d0 i() {
        ArrayList arrayList = this.f21239a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (AbstractC3638d0) arrayList.get(arrayList.size() - 1);
    }

    public boolean j() {
        if (this.f21239a.size() == 1) {
            return true;
        }
        AbstractC3638d0 i10 = i();
        s();
        if (i() instanceof C3647g0) {
            C3647g0 c3647g0 = (C3647g0) i();
            s();
            C3644f0 c3644f0 = (C3644f0) i();
            if (c3647g0 != null && i10 != null && c3644f0 != null) {
                c3644f0.f34334a.put(c3647g0.f34346a, i10.getValue());
                return false;
            }
            return false;
        } else if (i() instanceof C3641e0) {
            C3641e0 c3641e0 = (C3641e0) i();
            if (i10 != null && c3641e0 != null) {
                c3641e0.f34325a.add(i10.getValue());
                return false;
            }
            return false;
        } else {
            return false;
        }
    }

    public boolean k(AbstractC3635c0 abstractC3635c0) {
        Object e10 = abstractC3635c0.e();
        if (i() == null && e10 != null) {
            this.f21239a.add(new C3650h0(e10));
            return true;
        } else if (i() instanceof C3647g0) {
            s();
            ((C3644f0) i()).f34334a.put(((C3647g0) i()).f34346a, e10);
            return false;
        } else if (i() instanceof C3641e0) {
            ((C3641e0) i()).f34325a.add(e10);
            return false;
        } else {
            return false;
        }
    }

    public void l(float f6) {
        this.f21239a.add(new v0.l(f6));
    }

    public void m(float f6) {
        this.f21239a.add(new v0.t(f6));
    }

    public void n(float f6, float f10) {
        this.f21239a.add(new v0.m(f6, f10));
    }

    public void o(float f6, float f10) {
        this.f21239a.add(new v0.u(f6, f10));
    }

    public void p(float f6, float f10) {
        this.f21239a.add(new v0.n(f6, f10));
    }

    public void q(float f6, float f10) {
        this.f21239a.add(new v0.v(f6, f10));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(final C3653i0 c3653i0) {
        boolean z10;
        int i10 = AbstractC3632b0.f34276a[c3653i0.a1().ordinal()];
        ArrayList arrayList = this.f21239a;
        switch (i10) {
            case 1:
                c3653i0.a();
                arrayList.add(new C3641e0());
                r(c3653i0);
                return;
            case 2:
                c3653i0.m();
                z10 = j();
                if (z10) {
                    return;
                }
                r(c3653i0);
                return;
            case 3:
                c3653i0.h();
                arrayList.add(new C3644f0());
                r(c3653i0);
                return;
            case 4:
                c3653i0.p();
                z10 = j();
                if (z10) {
                }
                r(c3653i0);
                return;
            case 5:
                arrayList.add(new C3647g0(c3653i0.P0()));
                r(c3653i0);
                return;
            case 6:
                z10 = k(new AbstractC3635c0() { // from class: io.sentry.a0
                    @Override // io.sentry.AbstractC3635c0
                    public final Object e() {
                        int i11 = r2;
                        C3653i0 c3653i02 = c3653i0;
                        switch (i11) {
                            case 0:
                                return c3653i02.W0();
                            default:
                                return Boolean.valueOf(c3653i02.P());
                        }
                    }
                });
                if (z10) {
                }
                r(c3653i0);
                return;
            case 7:
                z10 = k(new C1464e(this, 16, c3653i0));
                if (z10) {
                }
                r(c3653i0);
                return;
            case 8:
                z10 = k(new AbstractC3635c0() { // from class: io.sentry.a0
                    @Override // io.sentry.AbstractC3635c0
                    public final Object e() {
                        int i11 = r2;
                        C3653i0 c3653i02 = c3653i0;
                        switch (i11) {
                            case 0:
                                return c3653i02.W0();
                            default:
                                return Boolean.valueOf(c3653i02.P());
                        }
                    }
                });
                if (z10) {
                }
                r(c3653i0);
                return;
            case 9:
                c3653i0.S0();
                z10 = k(new A9.a(23));
                if (z10) {
                }
                r(c3653i0);
                return;
            case 10:
                return;
            default:
                r(c3653i0);
                return;
        }
    }

    public void s() {
        ArrayList arrayList = this.f21239a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public void t(float f6, float f10, float f11, float f12) {
        this.f21239a.add(new v0.p(f6, f10, f11, f12));
    }

    public void u(float f6, float f10, float f11, float f12) {
        this.f21239a.add(new v0.x(f6, f10, f11, f12));
    }

    public void v(String str) {
        AbstractC3557B.c0("name", str);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f21239a;
            if (i10 < arrayList.size()) {
                if (Lg.n.f2(str, (String) arrayList.get(i10))) {
                    arrayList.remove(i10);
                    arrayList.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            } else {
                return;
            }
        }
    }

    public void w(float f6) {
        this.f21239a.add(new C5937A(f6));
    }

    public void x(float f6) {
        this.f21239a.add(new v0.z(f6));
    }

    public p() {
        this.f21239a = new ArrayList(20);
    }
}
