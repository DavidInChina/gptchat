package j0;

import b0.C2099c;

/* loaded from: classes.dex */
public final class L extends C3887c {

    /* renamed from: p  reason: collision with root package name */
    public final C3887c f35863p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f35864q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f35865r;

    public L(C3887c c3887c, wf.k kVar, wf.k kVar2, boolean z10, boolean z11) {
        super(0, n.f35909j0, p.j(z10, kVar, (c3887c == null || (r1 = c3887c.f35874f) == null) ? ((C3886b) p.f35925i.get()).f35874f : r1), p.a(kVar2, (c3887c == null || (r1 = c3887c.f35875g) == null) ? ((C3886b) p.f35925i.get()).f35875g : r1));
        wf.k kVar3;
        wf.k kVar4;
        this.f35863p = c3887c;
        this.f35864q = z10;
        this.f35865r = z11;
    }

    @Override // j0.C3887c
    public final void A(C2099c c2099c) {
        y.a();
        throw null;
    }

    @Override // j0.C3887c
    public final C3887c B(wf.k kVar, wf.k kVar2) {
        wf.k j6 = p.j(true, kVar, this.f35874f);
        wf.k a5 = p.a(kVar2, this.f35875g);
        if (!this.f35864q) {
            return new L(C().B(null, a5), j6, a5, false, true);
        }
        return C().B(j6, a5);
    }

    public final C3887c C() {
        C3887c c3887c = this.f35863p;
        if (c3887c == null) {
            return (C3887c) p.f35925i.get();
        }
        return c3887c;
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final void c() {
        C3887c c3887c;
        this.f35894c = true;
        if (this.f35865r && (c3887c = this.f35863p) != null) {
            c3887c.c();
        }
    }

    @Override // j0.AbstractC3893i
    public final int d() {
        return C().d();
    }

    @Override // j0.AbstractC3893i
    public final n e() {
        return C().e();
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final boolean g() {
        return C().g();
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final int h() {
        return C().h();
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final void k() {
        y.a();
        throw null;
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final void l() {
        y.a();
        throw null;
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final void m() {
        C().m();
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final void n(AbstractC3882G abstractC3882G) {
        C().n(abstractC3882G);
    }

    @Override // j0.AbstractC3893i
    public final void q(int i10) {
        y.a();
        throw null;
    }

    @Override // j0.AbstractC3893i
    public final void r(n nVar) {
        y.a();
        throw null;
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final void s(int i10) {
        C().s(i10);
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final AbstractC3893i t(wf.k kVar) {
        wf.k j6 = p.j(true, kVar, this.f35874f);
        if (!this.f35864q) {
            return p.g(C().t(null), j6, true);
        }
        return C().t(j6);
    }

    @Override // j0.C3887c
    public final L4.a v() {
        return C().v();
    }

    @Override // j0.C3887c
    public final C2099c w() {
        return C().w();
    }
}
