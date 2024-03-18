package E2;

import N.C1025i;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4121Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1025i f4122Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C f4123h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0484p f4124i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C0488u f4125j0;

    public /* synthetic */ A(C1025i c1025i, C c10, C0484p c0484p, C0488u c0488u, int i10) {
        this.f4121Y = i10;
        this.f4122Z = c1025i;
        this.f4123h0 = c10;
        this.f4124i0 = c0484p;
        this.f4125j0 = c0488u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4121Y;
        C0488u c0488u = this.f4125j0;
        C0484p c0484p = this.f4124i0;
        C c10 = this.f4123h0;
        C1025i c1025i = this.f4122Z;
        switch (i10) {
            case 0:
                c10.F(c1025i.f12350Z, (C0492y) c1025i.f12351h0, c0484p, c0488u);
                return;
            case 1:
                c10.D(c1025i.f12350Z, (C0492y) c1025i.f12351h0, c0484p, c0488u);
                return;
            default:
                c10.o(c1025i.f12350Z, (C0492y) c1025i.f12351h0, c0484p, c0488u);
                return;
        }
    }
}
