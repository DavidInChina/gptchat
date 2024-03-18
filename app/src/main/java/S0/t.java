package S0;

import A.C0043t;
import G0.C0571a;

/* loaded from: classes2.dex */
public final class t implements r {

    /* renamed from: a  reason: collision with root package name */
    public final G f16045a;

    /* renamed from: b  reason: collision with root package name */
    public final H f16046b;

    /* renamed from: c  reason: collision with root package name */
    public final N f16047c;

    /* renamed from: d  reason: collision with root package name */
    public final y f16048d;

    /* renamed from: e  reason: collision with root package name */
    public final F f16049e;

    /* renamed from: f  reason: collision with root package name */
    public final C0571a f16050f = new C0571a(5, this);

    public t(C1341b c1341b, C1343d c1343d) {
        N n10 = u.f16051a;
        y yVar = new y(u.f16052b);
        F f6 = new F();
        this.f16045a = c1341b;
        this.f16046b = c1343d;
        this.f16047c = n10;
        this.f16048d = yVar;
        this.f16049e = f6;
    }

    public final Q a(M m10) {
        Q q10;
        N n10 = this.f16047c;
        C0043t c0043t = new C0043t(this, 24, m10);
        synchronized (n10.f15991a) {
            q10 = (Q) n10.f15992b.a(m10);
            if (q10 != null) {
                if (!q10.a()) {
                    Q q11 = (Q) n10.f15992b.c(m10);
                }
            }
            try {
                q10 = (Q) c0043t.invoke(new C0043t(n10, 25, m10));
                synchronized (n10.f15991a) {
                    if (n10.f15992b.a(m10) == null && q10.a()) {
                        n10.f15992b.b(m10, q10);
                    }
                }
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
        return q10;
    }

    public final Q b(s sVar, D d10, int i10, int i11) {
        H h10 = this.f16046b;
        h10.d(sVar);
        D b10 = h10.b(d10);
        h10.a(i10);
        h10.c(i11);
        this.f16045a.getClass();
        return a(new M(sVar, b10, i10, i11, null));
    }
}
