package E2;

import p2.C5065s;

/* renamed from: E2.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480l implements L2.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4376a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4377b;

    public C0480l(int i10) {
        if ((i10 & 1) != 0) {
            this.f4377b = new L2.D(65496, 2, "image/jpeg");
        } else {
            this.f4377b = new S2.a();
        }
    }

    @Override // L2.q
    public final int a(L2.r rVar, I2.i iVar) {
        switch (this.f4376a) {
            case 0:
                if (rVar.f(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
            default:
                return ((L2.q) this.f4377b).a(rVar, iVar);
        }
    }

    @Override // L2.q
    public final void d(L2.s sVar) {
        int i10 = this.f4376a;
        Object obj = this.f4377b;
        switch (i10) {
            case 0:
                L2.G f6 = sVar.f(0, 3);
                sVar.b(new L2.u(-9223372036854775807L));
                sVar.d();
                C5065s c5065s = (C5065s) obj;
                p2.r b10 = c5065s.b();
                b10.f42237k = "text/x-unknown";
                b10.f42234h = c5065s.f42319q0;
                f6.b(new C5065s(b10));
                return;
            default:
                ((L2.q) obj).d(sVar);
                return;
        }
    }

    @Override // L2.q
    public final boolean g(L2.r rVar) {
        switch (this.f4376a) {
            case 0:
                return true;
            default:
                return ((L2.q) this.f4377b).g(rVar);
        }
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        switch (this.f4376a) {
            case 0:
                return;
            default:
                ((L2.q) this.f4377b).h(j6, j10);
                return;
        }
    }

    @Override // L2.q
    public final void release() {
        switch (this.f4376a) {
            case 0:
                return;
            default:
                ((L2.q) this.f4377b).release();
                return;
        }
    }

    @Override // L2.q
    public final L2.q b() {
        return this;
    }
}
