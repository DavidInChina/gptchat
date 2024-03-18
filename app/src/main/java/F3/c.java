package f3;

import L2.B;
import L2.r;
import L2.u;
import L2.v;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: Y  reason: collision with root package name */
    public v f29539Y;

    /* renamed from: Z  reason: collision with root package name */
    public U3.c f29540Z;

    /* renamed from: h0  reason: collision with root package name */
    public long f29541h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f29542i0;

    @Override // f3.h
    public final B m() {
        boolean z10;
        if (this.f29541h0 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        return new u(this.f29539Y, this.f29541h0, 0);
    }

    @Override // f3.h
    public final long n(r rVar) {
        long j6 = this.f29542i0;
        if (j6 < 0) {
            return -1L;
        }
        long j10 = -(j6 + 2);
        this.f29542i0 = -1L;
        return j10;
    }

    @Override // f3.h
    public final void q(long j6) {
        long[] jArr = (long[]) this.f29540Z.f17396Z;
        this.f29542i0 = jArr[AbstractC5530A.e(jArr, j6, true)];
    }
}
