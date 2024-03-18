package g3;

/* renamed from: g3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3160c extends AbstractC3168k {

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3161d f31169k0;

    public C3160c(AbstractC3161d abstractC3161d) {
        this.f31169k0 = abstractC3161d;
    }

    @Override // x2.i
    public final void i() {
        AbstractC3161d abstractC3161d = this.f31169k0;
        synchronized (abstractC3161d.f31171b) {
            this.f48626Z = 0;
            this.f48647h0 = 0L;
            this.f31185i0 = null;
            int i10 = abstractC3161d.f31177h;
            abstractC3161d.f31177h = i10 + 1;
            abstractC3161d.f31175f[i10] = this;
            if (!abstractC3161d.f31172c.isEmpty() && abstractC3161d.f31177h > 0) {
                abstractC3161d.f31171b.notify();
            }
        }
    }
}
