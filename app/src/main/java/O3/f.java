package O3;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f13356Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g f13357Z;

    public /* synthetic */ f(g gVar, int i10) {
        this.f13356Y = i10;
        this.f13357Z = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13356Y;
        g gVar = this.f13357Z;
        switch (i10) {
            case 0:
                g.a(gVar);
                return;
            case 1:
                g.b(gVar);
                return;
            case 2:
                g.b(gVar);
                return;
            case 3:
                g.a(gVar);
                return;
            default:
                g.a(gVar);
                return;
        }
    }
}
