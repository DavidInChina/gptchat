package Z;

/* loaded from: classes.dex */
public final class L implements G0 {

    /* renamed from: Y  reason: collision with root package name */
    public final wf.k f22505Y;

    /* renamed from: Z  reason: collision with root package name */
    public M f22506Z;

    public L(wf.k kVar) {
        this.f22505Y = kVar;
    }

    @Override // Z.G0
    public final void c() {
        M m10 = this.f22506Z;
        if (m10 != null) {
            m10.dispose();
        }
        this.f22506Z = null;
    }

    @Override // Z.G0
    public final void d() {
        this.f22506Z = (M) this.f22505Y.invoke(AbstractC1734s.f22730g);
    }

    @Override // Z.G0
    public final void a() {
    }
}
