package gc;

import W.P0;
import W.R0;
import W.j4;
import Z.AbstractC1725n;
import jf.y;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C3251c f31561Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C3251c c3251c) {
        super(2);
        this.f31561Y = c3251c;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        long j6;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        int intValue = ((Number) obj2).intValue();
        AbstractC4326r a5 = io.sentry.compose.b.a("ExperimentOverrideScreen");
        if ((intValue & 11) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        C3251c c3251c = this.f31561Y;
        String key = c3251c.f31550a.getKey();
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-1539088741);
        if (c3251c.f31552c) {
            j6 = ((P0) rVar2.m(R0.f19593a)).f19526j;
        } else {
            j6 = r0.r.f44263k;
        }
        rVar2.t(false);
        j4.b(key, a5, j6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131066);
        return y.f36177a;
    }
}
