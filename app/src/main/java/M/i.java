package M;

import E0.AbstractC0461u;
import L.x0;
import N.C1035t;
import N.C1037v;
import N.j0;
import N.m0;
import N.n0;
import q0.C5251c;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class i implements x0 {

    /* renamed from: a  reason: collision with root package name */
    public long f11316a;

    /* renamed from: b  reason: collision with root package name */
    public long f11317b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f11318c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j0 f11319d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f11320e;

    public i(long j6, j0 j0Var, g gVar) {
        this.f11318c = gVar;
        this.f11319d = j0Var;
        this.f11320e = j6;
        long j10 = C5251c.f43619b;
        this.f11316a = j10;
        this.f11317b = j10;
    }

    @Override // L.x0
    public final void b() {
        AbstractC6216a abstractC6216a;
        j0 j0Var = this.f11319d;
        if (n0.a(j0Var, this.f11320e) && (abstractC6216a = ((m0) j0Var).f12380h) != null) {
            abstractC6216a.mo122invoke();
        }
    }

    @Override // L.x0
    public final void c() {
        AbstractC6216a abstractC6216a;
        j0 j0Var = this.f11319d;
        if (n0.a(j0Var, this.f11320e) && (abstractC6216a = ((m0) j0Var).f12380h) != null) {
            abstractC6216a.mo122invoke();
        }
    }

    @Override // L.x0
    public final void d(long j6) {
        AbstractC0461u abstractC0461u = (AbstractC0461u) this.f11318c.mo122invoke();
        j0 j0Var = this.f11319d;
        if (abstractC0461u != null) {
            if (!abstractC0461u.i()) {
                return;
            }
            C1035t c1035t = C1037v.f12439b;
            wf.p pVar = ((m0) j0Var).f12378f;
            if (pVar != null) {
                pVar.h(Boolean.TRUE, abstractC0461u, new C5251c(j6), c1035t);
            }
            this.f11316a = j6;
        }
        if (!n0.a(j0Var, this.f11320e)) {
            return;
        }
        this.f11317b = C5251c.f43619b;
    }

    @Override // L.x0
    public final void g(long j6) {
        AbstractC0461u abstractC0461u = (AbstractC0461u) this.f11318c.mo122invoke();
        if (abstractC0461u == null || !abstractC0461u.i()) {
            return;
        }
        long j10 = this.f11320e;
        j0 j0Var = this.f11319d;
        if (!n0.a(j0Var, j10)) {
            return;
        }
        long h10 = C5251c.h(this.f11317b, j6);
        this.f11317b = h10;
        long h11 = C5251c.h(this.f11316a, h10);
        if (((m0) j0Var).b(h11, this.f11316a, C1037v.f12441d, abstractC0461u, true)) {
            this.f11316a = h11;
            this.f11317b = C5251c.f43619b;
        }
    }

    @Override // L.x0
    public final void e() {
    }

    @Override // L.x0
    public final void f() {
    }
}
