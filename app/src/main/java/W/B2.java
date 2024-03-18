package W;

import nf.AbstractC4825e;
import q0.C5251c;

/* loaded from: classes.dex */
public final class B2 implements A0.a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1568j1 f18991Y;

    public B2(C1568j1 c1568j1) {
        this.f18991Y = c1568j1;
    }

    @Override // A0.a
    public final long F(int i10, long j6) {
        return C5251c.f43619b;
    }

    @Override // A0.a
    public final Object T(long j6, AbstractC4825e abstractC4825e) {
        return new Z0.p(Z0.p.f22813b);
    }

    @Override // A0.a
    public final Object l(long j6, long j10, AbstractC4825e abstractC4825e) {
        return new Z0.p(Z0.p.f22813b);
    }

    @Override // A0.a
    public final long u(long j6, int i10, long j10) {
        C1568j1 c1568j1 = this.f18991Y;
        int i11 = c1568j1.f20168a;
        if (!((Boolean) c1568j1.f20170c.mo122invoke()).booleanValue()) {
            return C5251c.f43619b;
        }
        int i12 = (C5251c.e(j6) > 0.0f ? 1 : (C5251c.e(j6) == 0.0f ? 0 : -1));
        o4 o4Var = c1568j1.f20169b;
        if (i12 == 0 && C5251c.e(j10) > 0.0f) {
            o4Var.f20267b.i(0.0f);
        } else {
            float h10 = o4Var.f20267b.h();
            o4Var.f20267b.i(C5251c.e(j6) + h10);
        }
        return C5251c.f43619b;
    }
}
