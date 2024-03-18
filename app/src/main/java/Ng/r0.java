package Ng;

/* loaded from: classes.dex */
public final class r0 extends AbstractC1081p0 {

    /* renamed from: j0  reason: collision with root package name */
    public final v0 f12965j0;

    /* renamed from: k0  reason: collision with root package name */
    public final s0 f12966k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C1080p f12967l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Object f12968m0;

    public r0(v0 v0Var, s0 s0Var, C1080p c1080p, Object obj) {
        this.f12965j0 = v0Var;
        this.f12966k0 = s0Var;
        this.f12967l0 = c1080p;
        this.f12968m0 = obj;
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        p((Throwable) obj);
        return jf.y.f36177a;
    }

    @Override // Ng.AbstractC1081p0
    public final void p(Throwable th2) {
        v0 v0Var = this.f12965j0;
        v0Var.getClass();
        C1080p g02 = v0.g0(this.f12967l0);
        s0 s0Var = this.f12966k0;
        Object obj = this.f12968m0;
        if (g02 != null) {
            while (L4.a.C0(g02.f12962j0, false, new r0(v0Var, s0Var, g02, obj), 1) == A0.f12861Y) {
                g02 = v0.g0(g02);
                if (g02 == null) {
                    v0Var.w(v0Var.L(s0Var, obj));
                }
            }
            return;
        }
        v0Var.w(v0Var.L(s0Var, obj));
    }
}
