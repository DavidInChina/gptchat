package M;

import E0.AbstractC0461u;
import N.AbstractC1028l;
import N.AbstractC1038w;
import N.C1035t;
import N.j0;
import N.m0;
import N.n0;
import q0.C5251c;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class j implements AbstractC1028l {

    /* renamed from: a  reason: collision with root package name */
    public long f11321a = C5251c.f43619b;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f11322b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j0 f11323c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f11324d;

    public j(long j6, j0 j0Var, g gVar) {
        this.f11322b = gVar;
        this.f11323c = j0Var;
        this.f11324d = j6;
    }

    @Override // N.AbstractC1028l
    public final boolean a(long j6, AbstractC1038w abstractC1038w) {
        AbstractC0461u abstractC0461u = (AbstractC0461u) this.f11322b.mo122invoke();
        if (abstractC0461u != null) {
            if (!abstractC0461u.i()) {
                return false;
            }
            long j10 = this.f11324d;
            j0 j0Var = this.f11323c;
            if (!n0.a(j0Var, j10)) {
                return false;
            }
            if (((m0) j0Var).b(j6, this.f11321a, abstractC1038w, abstractC0461u, false)) {
                this.f11321a = j6;
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // N.AbstractC1028l
    public final boolean b(long j6, C1035t c1035t) {
        AbstractC0461u abstractC0461u = (AbstractC0461u) this.f11322b.mo122invoke();
        if (abstractC0461u == null || !abstractC0461u.i()) {
            return false;
        }
        m0 m0Var = (m0) this.f11323c;
        wf.p pVar = m0Var.f12378f;
        if (pVar != null) {
            pVar.h(Boolean.FALSE, abstractC0461u, new C5251c(j6), c1035t);
        }
        this.f11321a = j6;
        return n0.a(m0Var, this.f11324d);
    }

    @Override // N.AbstractC1028l
    public final void c() {
        AbstractC6216a abstractC6216a = ((m0) this.f11323c).f12380h;
        if (abstractC6216a != null) {
            abstractC6216a.mo122invoke();
        }
    }
}
