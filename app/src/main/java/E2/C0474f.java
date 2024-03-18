package E2;

import java.util.ArrayList;

/* renamed from: E2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474f extends k0 {

    /* renamed from: l  reason: collision with root package name */
    public final long f4326l;

    /* renamed from: m  reason: collision with root package name */
    public final long f4327m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f4328n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f4329o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f4330p;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f4331q;

    /* renamed from: r  reason: collision with root package name */
    public final p2.f0 f4332r;

    /* renamed from: s  reason: collision with root package name */
    public C0472d f4333s;

    /* renamed from: t  reason: collision with root package name */
    public C0473e f4334t;

    /* renamed from: u  reason: collision with root package name */
    public long f4335u;

    /* renamed from: v  reason: collision with root package name */
    public long f4336v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0474f(AbstractC0469a abstractC0469a, long j6, long j10, boolean z10, boolean z11, boolean z12) {
        super(abstractC0469a);
        boolean z13;
        abstractC0469a.getClass();
        if (j6 >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        Gi.e.l(z13);
        this.f4326l = j6;
        this.f4327m = j10;
        this.f4328n = z10;
        this.f4329o = z11;
        this.f4330p = z12;
        this.f4331q = new ArrayList();
        this.f4332r = new p2.f0();
    }

    public final void A(p2.g0 g0Var) {
        long j6;
        long j10;
        long j11;
        p2.f0 f0Var = this.f4332r;
        g0Var.p(0, f0Var);
        long j12 = f0Var.f42061v0;
        C0472d c0472d = this.f4333s;
        ArrayList arrayList = this.f4331q;
        long j13 = this.f4327m;
        long j14 = Long.MIN_VALUE;
        if (c0472d != null && !arrayList.isEmpty() && !this.f4329o) {
            long j15 = this.f4335u - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f4336v - j12;
            }
            j6 = j14;
            j10 = j15;
        } else {
            boolean z10 = this.f4330p;
            long j16 = this.f4326l;
            if (z10) {
                long j17 = f0Var.f42057r0;
                j16 += j17;
                j11 = j17 + j13;
            } else {
                j11 = j13;
            }
            this.f4335u = j12 + j16;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j11;
            }
            this.f4336v = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0471c c0471c = (C0471c) arrayList.get(i10);
                long j18 = this.f4335u;
                long j19 = this.f4336v;
                c0471c.f4298j0 = j18;
                c0471c.f4299k0 = j19;
            }
            j10 = j16;
            j6 = j11;
        }
        try {
            C0472d c0472d2 = new C0472d(g0Var, j10, j6);
            this.f4333s = c0472d2;
            l(c0472d2);
        } catch (C0473e e10) {
            this.f4334t = e10;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((C0471c) arrayList.get(i11)).f4300l0 = this.f4334t;
            }
        }
    }

    @Override // E2.AbstractC0469a
    public final AbstractC0490w a(C0492y c0492y, I2.d dVar, long j6) {
        C0471c c0471c = new C0471c(this.f4375k.a(c0492y, dVar, j6), this.f4328n, this.f4335u, this.f4336v);
        this.f4331q.add(c0471c);
        return c0471c;
    }

    @Override // E2.AbstractC0477i, E2.AbstractC0469a
    public final void i() {
        C0473e c0473e = this.f4334t;
        if (c0473e == null) {
            super.i();
            return;
        }
        throw c0473e;
    }

    @Override // E2.AbstractC0469a
    public final void m(AbstractC0490w abstractC0490w) {
        ArrayList arrayList = this.f4331q;
        Gi.e.n(arrayList.remove(abstractC0490w));
        this.f4375k.m(((C0471c) abstractC0490w).f4294Y);
        if (arrayList.isEmpty() && !this.f4329o) {
            C0472d c0472d = this.f4333s;
            c0472d.getClass();
            A(c0472d.f4386j0);
        }
    }

    @Override // E2.AbstractC0477i, E2.AbstractC0469a
    public final void o() {
        super.o();
        this.f4334t = null;
        this.f4333s = null;
    }

    @Override // E2.k0
    public final void y(p2.g0 g0Var) {
        if (this.f4334t != null) {
            return;
        }
        A(g0Var);
    }
}
