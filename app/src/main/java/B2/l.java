package B2;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1808Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ n f1809Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ o f1810h0;

    public /* synthetic */ l(n nVar, o oVar, int i10) {
        this.f1808Y = i10;
        this.f1809Z = nVar;
        this.f1810h0 = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1808Y;
        o oVar = this.f1810h0;
        n nVar = this.f1809Z;
        switch (i10) {
            case 0:
                oVar.E(nVar.f1813a, nVar.f1814b);
                return;
            case 1:
                oVar.e(nVar.f1813a, nVar.f1814b);
                return;
            case 2:
                oVar.g(nVar.f1813a, nVar.f1814b);
                return;
            default:
                oVar.s(nVar.f1813a, nVar.f1814b);
                return;
        }
    }
}
