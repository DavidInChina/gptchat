package E2;

import android.util.Pair;

/* renamed from: E2.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487t extends k0 {

    /* renamed from: l  reason: collision with root package name */
    public final boolean f4405l;

    /* renamed from: m  reason: collision with root package name */
    public final p2.f0 f4406m;

    /* renamed from: n  reason: collision with root package name */
    public final p2.e0 f4407n;

    /* renamed from: o  reason: collision with root package name */
    public r f4408o;

    /* renamed from: p  reason: collision with root package name */
    public C0485q f4409p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4410q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4411r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4412s;

    public C0487t(AbstractC0469a abstractC0469a, boolean z10) {
        super(abstractC0469a);
        boolean z11;
        if (z10 && abstractC0469a.h()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f4405l = z11;
        this.f4406m = new p2.f0();
        this.f4407n = new p2.e0();
        p2.g0 f6 = abstractC0469a.f();
        if (f6 != null) {
            this.f4408o = new r(f6, null, null);
            this.f4412s = true;
            return;
        }
        this.f4408o = new r(new C0486s(abstractC0469a.g()), p2.f0.f42041w0, r.f4401m0);
    }

    /* renamed from: A */
    public final C0485q a(C0492y c0492y, I2.d dVar, long j6) {
        boolean z10;
        C0485q c0485q = new C0485q(c0492y, dVar, j6);
        if (c0485q.f4397i0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        AbstractC0469a abstractC0469a = this.f4375k;
        c0485q.f4397i0 = abstractC0469a;
        if (this.f4411r) {
            Object obj = this.f4408o.f4403l0;
            Object obj2 = c0492y.f4420a;
            if (obj != null && obj2.equals(r.f4401m0)) {
                obj2 = this.f4408o.f4403l0;
            }
            c0485q.d(c0492y.a(obj2));
        } else {
            this.f4409p = c0485q;
            if (!this.f4410q) {
                this.f4410q = true;
                w(null, abstractC0469a);
            }
        }
        return c0485q;
    }

    public final void B(long j6) {
        C0485q c0485q = this.f4409p;
        int c10 = this.f4408o.c(c0485q.f4394Y.f4420a);
        if (c10 == -1) {
            return;
        }
        r rVar = this.f4408o;
        p2.e0 e0Var = this.f4407n;
        rVar.h(c10, e0Var, false);
        long j10 = e0Var.f42025i0;
        if (j10 != -9223372036854775807L && j6 >= j10) {
            j6 = Math.max(0L, j10 - 1);
        }
        c0485q.f4400l0 = j6;
    }

    @Override // E2.AbstractC0469a
    public final void m(AbstractC0490w abstractC0490w) {
        ((C0485q) abstractC0490w).f();
        if (abstractC0490w == this.f4409p) {
            this.f4409p = null;
        }
    }

    @Override // E2.AbstractC0477i, E2.AbstractC0469a
    public final void o() {
        this.f4411r = false;
        this.f4410q = false;
        super.o();
    }

    @Override // E2.k0, E2.AbstractC0469a
    public final void r(p2.H h10) {
        if (this.f4412s) {
            r rVar = this.f4408o;
            this.f4408o = new r(new O(this.f4408o.f4386j0, h10), rVar.f4402k0, rVar.f4403l0);
        } else {
            this.f4408o = new r(new C0486s(h10), p2.f0.f42041w0, r.f4401m0);
        }
        this.f4375k.r(h10);
    }

    @Override // E2.k0
    public final C0492y x(C0492y c0492y) {
        Object obj = c0492y.f4420a;
        Object obj2 = this.f4408o.f4403l0;
        if (obj2 != null && obj2.equals(obj)) {
            obj = r.f4401m0;
        }
        return c0492y.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // E2.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(p2.g0 g0Var) {
        C0492y c0492y;
        long j6;
        r rVar;
        C0485q c0485q;
        r rVar2;
        if (this.f4411r) {
            r rVar3 = this.f4408o;
            this.f4408o = new r(g0Var, rVar3.f4402k0, rVar3.f4403l0);
            C0485q c0485q2 = this.f4409p;
            if (c0485q2 != null) {
                B(c0485q2.f4400l0);
            }
        } else if (g0Var.r()) {
            if (this.f4412s) {
                r rVar4 = this.f4408o;
                rVar2 = new r(g0Var, rVar4.f4402k0, rVar4.f4403l0);
            } else {
                rVar2 = new r(g0Var, p2.f0.f42041w0, r.f4401m0);
            }
            this.f4408o = rVar2;
        } else {
            p2.f0 f0Var = this.f4406m;
            g0Var.p(0, f0Var);
            long j10 = f0Var.f42057r0;
            Object obj = f0Var.f42045Y;
            C0485q c0485q3 = this.f4409p;
            if (c0485q3 != null) {
                r rVar5 = this.f4408o;
                Object obj2 = c0485q3.f4394Y.f4420a;
                p2.e0 e0Var = this.f4407n;
                rVar5.i(obj2, e0Var);
                long j11 = e0Var.f42026j0 + c0485q3.f4395Z;
                this.f4408o.o(0, f0Var, 0L);
                if (j11 != f0Var.f42057r0) {
                    j6 = j11;
                    Pair k10 = g0Var.k(this.f4406m, this.f4407n, 0, j6);
                    Object obj3 = k10.first;
                    long longValue = ((Long) k10.second).longValue();
                    if (!this.f4412s) {
                        r rVar6 = this.f4408o;
                        rVar = new r(g0Var, rVar6.f4402k0, rVar6.f4403l0);
                    } else {
                        rVar = new r(g0Var, obj, obj3);
                    }
                    this.f4408o = rVar;
                    c0485q = this.f4409p;
                    if (c0485q != null) {
                        B(longValue);
                        C0492y c0492y2 = c0485q.f4394Y;
                        Object obj4 = c0492y2.f4420a;
                        if (this.f4408o.f4403l0 != null && obj4.equals(r.f4401m0)) {
                            obj4 = this.f4408o.f4403l0;
                        }
                        c0492y = c0492y2.a(obj4);
                        this.f4412s = true;
                        this.f4411r = true;
                        l(this.f4408o);
                        if (c0492y == null) {
                            C0485q c0485q4 = this.f4409p;
                            c0485q4.getClass();
                            c0485q4.d(c0492y);
                            return;
                        }
                        return;
                    }
                }
            }
            j6 = j10;
            Pair k102 = g0Var.k(this.f4406m, this.f4407n, 0, j6);
            Object obj32 = k102.first;
            long longValue2 = ((Long) k102.second).longValue();
            if (!this.f4412s) {
            }
            this.f4408o = rVar;
            c0485q = this.f4409p;
            if (c0485q != null) {
            }
        }
        c0492y = null;
        this.f4412s = true;
        this.f4411r = true;
        l(this.f4408o);
        if (c0492y == null) {
        }
    }

    @Override // E2.k0
    public final void z() {
        if (!this.f4405l) {
            this.f4410q = true;
            w(null, this.f4375k);
        }
    }

    @Override // E2.AbstractC0477i, E2.AbstractC0469a
    public final void i() {
    }
}
