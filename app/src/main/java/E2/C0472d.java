package E2;

import p2.C5049b;
import s2.AbstractC5530A;

/* renamed from: E2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472d extends AbstractC0482n {

    /* renamed from: k0  reason: collision with root package name */
    public final long f4304k0;

    /* renamed from: l0  reason: collision with root package name */
    public final long f4305l0;

    /* renamed from: m0  reason: collision with root package name */
    public final long f4306m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f4307n0;

    public C0472d(p2.g0 g0Var, long j6, long j10) {
        super(g0Var);
        long j11;
        long j12;
        boolean z10 = false;
        if (g0Var.j() == 1) {
            p2.f0 o10 = g0Var.o(0, new p2.f0(), 0L);
            long max = Math.max(0L, j6);
            if (!o10.f42056q0 && max != 0 && !o10.f42052m0) {
                throw new C0473e(1);
            }
            if (j10 == Long.MIN_VALUE) {
                j11 = o10.f42058s0;
            } else {
                j11 = Math.max(0L, j10);
            }
            long j13 = o10.f42058s0;
            if (j13 != -9223372036854775807L) {
                j11 = j11 > j13 ? j13 : j11;
                if (max > j11) {
                    throw new C0473e(2);
                }
            }
            this.f4304k0 = max;
            this.f4305l0 = j11;
            int i10 = (j11 > (-9223372036854775807L) ? 1 : (j11 == (-9223372036854775807L) ? 0 : -1));
            if (i10 == 0) {
                j12 = -9223372036854775807L;
            } else {
                j12 = j11 - max;
            }
            this.f4306m0 = j12;
            if (o10.f42053n0 && (i10 == 0 || (j13 != -9223372036854775807L && j11 == j13))) {
                z10 = true;
            }
            this.f4307n0 = z10;
            return;
        }
        throw new C0473e(0);
    }

    @Override // E2.AbstractC0482n, p2.g0
    public final p2.e0 h(int i10, p2.e0 e0Var, boolean z10) {
        long j6;
        this.f4386j0.h(0, e0Var, z10);
        long j10 = e0Var.f42026j0 - this.f4304k0;
        long j11 = this.f4306m0;
        if (j11 == -9223372036854775807L) {
            j6 = -9223372036854775807L;
        } else {
            j6 = j11 - j10;
        }
        e0Var.k(e0Var.f42022Y, e0Var.f42023Z, 0, j6, j10, C5049b.f41981l0, false);
        return e0Var;
    }

    @Override // E2.AbstractC0482n, p2.g0
    public final p2.f0 o(int i10, p2.f0 f0Var, long j6) {
        this.f4386j0.o(0, f0Var, 0L);
        long j10 = f0Var.f42061v0;
        long j11 = this.f4304k0;
        f0Var.f42061v0 = j10 + j11;
        f0Var.f42058s0 = this.f4306m0;
        f0Var.f42053n0 = this.f4307n0;
        long j12 = f0Var.f42057r0;
        if (j12 != -9223372036854775807L) {
            long max = Math.max(j12, j11);
            f0Var.f42057r0 = max;
            long j13 = this.f4305l0;
            if (j13 != -9223372036854775807L) {
                max = Math.min(max, j13);
            }
            f0Var.f42057r0 = max - j11;
        }
        long L10 = AbstractC5530A.L(j11);
        long j14 = f0Var.f42049j0;
        if (j14 != -9223372036854775807L) {
            f0Var.f42049j0 = j14 + L10;
        }
        long j15 = f0Var.f42050k0;
        if (j15 != -9223372036854775807L) {
            f0Var.f42050k0 = j15 + L10;
        }
        return f0Var;
    }
}
