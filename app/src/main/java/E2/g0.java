package E2;

import io.sentry.C3636c1;

/* loaded from: classes2.dex */
public final class g0 implements Y {

    /* renamed from: Y  reason: collision with root package name */
    public final Y f4348Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f4349Z;

    public g0(Y y10, long j6) {
        this.f4348Y = y10;
        this.f4349Z = j6;
    }

    @Override // E2.Y
    public final boolean j() {
        return this.f4348Y.j();
    }

    @Override // E2.Y
    public final void m() {
        this.f4348Y.m();
    }

    @Override // E2.Y
    public final int o(long j6) {
        return this.f4348Y.o(j6 - this.f4349Z);
    }

    @Override // E2.Y
    public final int q(C3636c1 c3636c1, x2.h hVar, int i10) {
        int q10 = this.f4348Y.q(c3636c1, hVar, i10);
        if (q10 == -4) {
            hVar.f48643l0 += this.f4349Z;
        }
        return q10;
    }
}
