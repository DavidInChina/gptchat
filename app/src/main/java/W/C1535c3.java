package W;

import Z.C1718j0;
import nf.AbstractC4825e;
import q0.C5251c;

/* renamed from: W.c3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1535c3 implements A0.a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1550f3 f19963Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f19964Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B.W0 f19965h0;

    public C1535c3(C1550f3 c1550f3, wf.k kVar) {
        B.W0 w02 = B.W0.f1213Y;
        this.f19963Y = c1550f3;
        this.f19964Z = kVar;
        this.f19965h0 = w02;
    }

    @Override // A0.a
    public final long F(int i10, long j6) {
        float f6;
        float f10;
        float f11;
        B.W0 w02 = B.W0.f1214Z;
        B.W0 w03 = this.f19965h0;
        if (w03 == w02) {
            f6 = C5251c.d(j6);
        } else {
            f6 = C5251c.e(j6);
        }
        float f12 = 0.0f;
        if (f6 < 0.0f && Ad.l.k0(i10, 1)) {
            C c10 = this.f19963Y.f20062c;
            float f13 = c10.f(f6);
            C1718j0 c1718j0 = c10.f19000i;
            if (Float.isNaN(c1718j0.h())) {
                f10 = 0.0f;
            } else {
                f10 = c1718j0.h();
            }
            c1718j0.i(f13);
            float f14 = f13 - f10;
            if (w03 == w02) {
                f11 = f14;
            } else {
                f11 = 0.0f;
            }
            if (w03 == B.W0.f1213Y) {
                f12 = f14;
            }
            return R4.b.r(f11, f12);
        }
        return C5251c.f43619b;
    }

    @Override // A0.a
    public final Object T(long j6, AbstractC4825e abstractC4825e) {
        float f6;
        float f10;
        if (this.f19965h0 == B.W0.f1214Z) {
            f6 = Z0.p.b(j6);
        } else {
            f6 = Z0.p.c(j6);
        }
        C1550f3 c1550f3 = this.f19963Y;
        float g10 = c1550f3.f20062c.g();
        Float s22 = kf.t.s2(c1550f3.f20062c.d().f19126a.values());
        if (s22 != null) {
            f10 = s22.floatValue();
        } else {
            f10 = Float.NaN;
        }
        if (f6 < 0.0f && g10 > f10) {
            this.f19964Z.invoke(new Float(f6));
        } else {
            j6 = Z0.p.f22813b;
        }
        return new Z0.p(j6);
    }

    @Override // A0.a
    public final Object l(long j6, long j10, AbstractC4825e abstractC4825e) {
        float f6;
        if (this.f19965h0 == B.W0.f1214Z) {
            f6 = Z0.p.b(j10);
        } else {
            f6 = Z0.p.c(j10);
        }
        this.f19964Z.invoke(new Float(f6));
        return new Z0.p(j10);
    }

    @Override // A0.a
    public final long u(long j6, int i10, long j10) {
        float f6;
        float f10;
        float f11;
        if (Ad.l.k0(i10, 1)) {
            C c10 = this.f19963Y.f20062c;
            B.W0 w02 = B.W0.f1214Z;
            B.W0 w03 = this.f19965h0;
            if (w03 == w02) {
                f6 = C5251c.d(j10);
            } else {
                f6 = C5251c.e(j10);
            }
            float f12 = c10.f(f6);
            C1718j0 c1718j0 = c10.f19000i;
            float f13 = 0.0f;
            if (Float.isNaN(c1718j0.h())) {
                f10 = 0.0f;
            } else {
                f10 = c1718j0.h();
            }
            c1718j0.i(f12);
            float f14 = f12 - f10;
            if (w03 == w02) {
                f11 = f14;
            } else {
                f11 = 0.0f;
            }
            if (w03 == B.W0.f1213Y) {
                f13 = f14;
            }
            return R4.b.r(f11, f13);
        }
        return C5251c.f43619b;
    }
}
