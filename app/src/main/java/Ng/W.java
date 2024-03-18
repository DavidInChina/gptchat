package Ng;

/* loaded from: classes.dex */
public final class W extends Y {

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC1070k f12913h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1051a0 f12914i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(AbstractC1051a0 abstractC1051a0, long j6, C1072l c1072l) {
        super(j6);
        this.f12914i0 = abstractC1051a0;
        this.f12913h0 = c1072l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12913h0.q(this.f12914i0);
    }

    @Override // Ng.Y
    public final String toString() {
        return super.toString() + this.f12913h0;
    }
}
