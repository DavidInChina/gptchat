package E2;

import N.C1025i;
import io.sentry.C3636c1;
import java.io.IOException;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class c0 implements Y {

    /* renamed from: Y  reason: collision with root package name */
    public int f4301Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f4302Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ e0 f4303h0;

    public c0(e0 e0Var) {
        this.f4303h0 = e0Var;
    }

    public final void a() {
        if (!this.f4302Z) {
            e0 e0Var = this.f4303h0;
            C1025i c1025i = e0Var.f4316j0;
            int f6 = p2.N.f(e0Var.f4321o0.f42319q0);
            c1025i.getClass();
            c1025i.d(new C0488u(1, f6, e0Var.f4321o0, 0, null, AbstractC5530A.L(0L), -9223372036854775807L));
            this.f4302Z = true;
        }
    }

    @Override // E2.Y
    public final boolean j() {
        return this.f4303h0.f4323q0;
    }

    @Override // E2.Y
    public final void m() {
        IOException iOException;
        e0 e0Var = this.f4303h0;
        if (!e0Var.f4322p0) {
            I2.n nVar = e0Var.f4320n0;
            IOException iOException2 = nVar.f8010c;
            if (iOException2 == null) {
                I2.j jVar = nVar.f8009b;
                if (jVar != null && (iOException = jVar.f8000j0) != null && jVar.f8001k0 > jVar.f7996Y) {
                    throw iOException;
                }
                return;
            }
            throw iOException2;
        }
    }

    @Override // E2.Y
    public final int o(long j6) {
        a();
        if (j6 > 0 && this.f4301Y != 2) {
            this.f4301Y = 2;
            return 1;
        }
        return 0;
    }

    @Override // E2.Y
    public final int q(C3636c1 c3636c1, x2.h hVar, int i10) {
        a();
        e0 e0Var = this.f4303h0;
        boolean z10 = e0Var.f4323q0;
        if (z10 && e0Var.f4324r0 == null) {
            this.f4301Y = 2;
        }
        int i11 = this.f4301Y;
        if (i11 == 2) {
            hVar.e(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            e0Var.f4324r0.getClass();
            hVar.e(1);
            hVar.f48643l0 = 0L;
            if ((i10 & 4) == 0) {
                hVar.k(e0Var.f4325s0);
                hVar.f48641j0.put(e0Var.f4324r0, 0, e0Var.f4325s0);
            }
            if ((i10 & 1) == 0) {
                this.f4301Y = 2;
            }
            return -4;
        } else {
            c3636c1.f34286h0 = e0Var.f4321o0;
            this.f4301Y = 1;
            return -5;
        }
    }
}
