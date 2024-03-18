package d3;

import L2.A;
import L2.C;
import m.C4528h;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long f27952a;

    /* renamed from: b  reason: collision with root package name */
    public final C4528h f27953b;

    /* renamed from: c  reason: collision with root package name */
    public final C4528h f27954c;

    /* renamed from: d  reason: collision with root package name */
    public long f27955d;

    public b(long j6, long j10, long j11) {
        this.f27955d = j6;
        this.f27952a = j11;
        C4528h c4528h = new C4528h(3);
        this.f27953b = c4528h;
        C4528h c4528h2 = new C4528h(3);
        this.f27954c = c4528h2;
        c4528h.g(0L);
        c4528h2.g(j10);
    }

    public final boolean a(long j6) {
        C4528h c4528h = this.f27953b;
        if (j6 - c4528h.m(c4528h.f38769Y - 1) < 100000) {
            return true;
        }
        return false;
    }

    @Override // d3.f
    public final long c() {
        return this.f27952a;
    }

    @Override // L2.B
    public final boolean e() {
        return true;
    }

    @Override // d3.f
    public final long f(long j6) {
        return this.f27953b.m(AbstractC5530A.c(this.f27954c, j6));
    }

    @Override // L2.B
    public final A i(long j6) {
        C4528h c4528h = this.f27953b;
        int c10 = AbstractC5530A.c(c4528h, j6);
        long m10 = c4528h.m(c10);
        C4528h c4528h2 = this.f27954c;
        C c11 = new C(m10, c4528h2.m(c10));
        if (m10 != j6 && c10 != c4528h.f38769Y - 1) {
            int i10 = c10 + 1;
            return new A(c11, new C(c4528h.m(i10), c4528h2.m(i10)));
        }
        return new A(c11, c11);
    }

    @Override // L2.B
    public final long j() {
        return this.f27955d;
    }
}
