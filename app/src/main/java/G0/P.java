package G0;

import E0.AbstractC0442a;
import id.AbstractC3557B;
import java.util.Map;
import q0.C5251c;

/* loaded from: classes2.dex */
public final class P extends AbstractC0573b {
    @Override // G0.AbstractC0573b
    public final long b(g0 g0Var, long j6) {
        T E02 = g0Var.E0();
        AbstractC3557B.Z(E02);
        long j10 = E02.f5674o0;
        int i10 = Z0.i.f22798c;
        return C5251c.h(R4.b.r((int) (j10 >> 32), (int) (j10 & 4294967295L)), j6);
    }

    @Override // G0.AbstractC0573b
    public final Map c(g0 g0Var) {
        T E02 = g0Var.E0();
        AbstractC3557B.Z(E02);
        return E02.p0().a();
    }

    @Override // G0.AbstractC0573b
    public final int d(g0 g0Var, AbstractC0442a abstractC0442a) {
        T E02 = g0Var.E0();
        AbstractC3557B.Z(E02);
        return E02.G(abstractC0442a);
    }
}
