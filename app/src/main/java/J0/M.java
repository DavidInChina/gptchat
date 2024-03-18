package j0;

/* loaded from: classes.dex */
public final class M extends AbstractC3893i {

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC3893i f35866f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f35867g = false;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f35868h;

    /* renamed from: i  reason: collision with root package name */
    public final wf.k f35869i;

    public M(AbstractC3893i abstractC3893i, wf.k kVar, boolean z10) {
        super(0, n.f35909j0);
        wf.k kVar2;
        this.f35866f = abstractC3893i;
        this.f35868h = z10;
        this.f35869i = p.j(false, kVar, (abstractC3893i == null || (kVar2 = abstractC3893i.f()) == null) ? ((C3886b) p.f35925i.get()).f35874f : kVar2);
    }

    @Override // j0.AbstractC3893i
    public final void c() {
        AbstractC3893i abstractC3893i;
        this.f35894c = true;
        if (this.f35868h && (abstractC3893i = this.f35866f) != null) {
            abstractC3893i.c();
        }
    }

    @Override // j0.AbstractC3893i
    public final int d() {
        return u().d();
    }

    @Override // j0.AbstractC3893i
    public final n e() {
        return u().e();
    }

    @Override // j0.AbstractC3893i
    public final wf.k f() {
        return this.f35869i;
    }

    @Override // j0.AbstractC3893i
    public final boolean g() {
        return u().g();
    }

    @Override // j0.AbstractC3893i
    public final wf.k i() {
        return null;
    }

    @Override // j0.AbstractC3893i
    public final void k() {
        y.a();
        throw null;
    }

    @Override // j0.AbstractC3893i
    public final void l() {
        y.a();
        throw null;
    }

    @Override // j0.AbstractC3893i
    public final void m() {
        u().m();
    }

    @Override // j0.AbstractC3893i
    public final void n(AbstractC3882G abstractC3882G) {
        u().n(abstractC3882G);
    }

    @Override // j0.AbstractC3893i
    public final AbstractC3893i t(wf.k kVar) {
        wf.k j6 = p.j(true, kVar, this.f35869i);
        if (!this.f35867g) {
            return p.g(u().t(null), j6, true);
        }
        return u().t(j6);
    }

    public final AbstractC3893i u() {
        AbstractC3893i abstractC3893i = this.f35866f;
        if (abstractC3893i == null) {
            return (AbstractC3893i) p.f35925i.get();
        }
        return abstractC3893i;
    }
}
