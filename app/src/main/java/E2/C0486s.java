package E2;

import p2.C5049b;

/* renamed from: E2.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486s extends p2.g0 {

    /* renamed from: j0  reason: collision with root package name */
    public final p2.H f4404j0;

    public C0486s(p2.H h10) {
        this.f4404j0 = h10;
    }

    @Override // p2.g0
    public final int c(Object obj) {
        if (obj == r.f4401m0) {
            return 0;
        }
        return -1;
    }

    @Override // p2.g0
    public final p2.e0 h(int i10, p2.e0 e0Var, boolean z10) {
        Integer num;
        Object obj = null;
        if (z10) {
            num = 0;
        } else {
            num = null;
        }
        if (z10) {
            obj = r.f4401m0;
        }
        e0Var.k(num, obj, 0, -9223372036854775807L, 0L, C5049b.f41981l0, true);
        return e0Var;
    }

    @Override // p2.g0
    public final int j() {
        return 1;
    }

    @Override // p2.g0
    public final Object n(int i10) {
        return r.f4401m0;
    }

    @Override // p2.g0
    public final p2.f0 o(int i10, p2.f0 f0Var, long j6) {
        f0Var.c(p2.f0.f42041w0, this.f4404j0, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        f0Var.f42056q0 = true;
        return f0Var;
    }

    @Override // p2.g0
    public final int q() {
        return 1;
    }
}
