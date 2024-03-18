package E2;

/* loaded from: classes.dex */
public final /* synthetic */ class H implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4147Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N f4148Z;

    public /* synthetic */ H(N n10, int i10) {
        this.f4147Y = i10;
        this.f4148Z = n10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4147Y;
        N n10 = this.f4148Z;
        switch (i10) {
            case 0:
                n10.f4185L0 = true;
                return;
            case 1:
                n10.t();
                return;
            default:
                if (!n10.f4191R0) {
                    AbstractC0489v abstractC0489v = n10.f4209w0;
                    abstractC0489v.getClass();
                    abstractC0489v.b(n10);
                    return;
                }
                return;
        }
    }
}
