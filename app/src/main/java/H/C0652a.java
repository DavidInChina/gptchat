package H;

import B.W0;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import q0.C5251c;

/* renamed from: H.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0652a implements A0.a {

    /* renamed from: Y  reason: collision with root package name */
    public final F f6590Y;

    /* renamed from: Z  reason: collision with root package name */
    public final W0 f6591Z;

    public C0652a(F f6) {
        W0 w02 = W0.f1214Z;
        this.f6590Y = f6;
        this.f6591Z = w02;
    }

    @Override // A0.a
    public final long F(int i10, long j6) {
        float f6;
        float f10;
        if (Ad.l.k0(i10, 1)) {
            F f11 = this.f6590Y;
            if (Math.abs(f11.f6549d.b()) > 0.0d) {
                float b10 = f11.f6549d.b() * f11.i();
                float f12 = ((((x) f11.g()).f6695b + ((x) f11.g()).f6696c) * (-Math.signum(f11.f6549d.b()))) + b10;
                if (f11.f6549d.b() > 0.0f) {
                    f12 = b10;
                    b10 = f12;
                }
                W0 w02 = W0.f1214Z;
                W0 w03 = this.f6591Z;
                if (w03 == w02) {
                    f6 = C5251c.d(j6);
                } else {
                    f6 = C5251c.e(j6);
                }
                float f13 = -f11.e(-com.google.android.gms.internal.play_billing.N.o(f6, b10, f12));
                if (w03 == w02) {
                    f10 = f13;
                } else {
                    f10 = C5251c.d(j6);
                }
                if (w03 != W0.f1213Y) {
                    f13 = C5251c.e(j6);
                }
                return R4.b.r(f10, f13);
            }
        }
        int i11 = C5251c.f43622e;
        return C5251c.f43619b;
    }

    @Override // A0.a
    public final Object T(long j6, AbstractC4825e abstractC4825e) {
        return new Z0.p(Z0.p.f22813b);
    }

    @Override // A0.a
    public final Object l(long j6, long j10, AbstractC4825e abstractC4825e) {
        long j11;
        if (this.f6591Z == W0.f1213Y) {
            j11 = Z0.p.a(j10, 0.0f, 0.0f, 2);
        } else {
            j11 = Z0.p.a(j10, 0.0f, 0.0f, 1);
        }
        return new Z0.p(j11);
    }

    @Override // A0.a
    public final long u(long j6, int i10, long j10) {
        if (Ad.l.k0(i10, 2)) {
            int i11 = C5251c.f43622e;
            if (!C5251c.b(j10, C5251c.f43619b)) {
                throw new CancellationException();
            }
        }
        int i12 = C5251c.f43622e;
        return C5251c.f43619b;
    }
}
