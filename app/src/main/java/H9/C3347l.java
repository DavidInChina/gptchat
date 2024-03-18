package h9;

import Ng.Q;
import Z8.p1;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import id.AbstractC3557B;
import jf.y;
import nd.AbstractC4815d;
import nd.EnumC4814c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import x8.W;

/* renamed from: h9.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3347l implements AbstractC4815d {

    /* renamed from: a  reason: collision with root package name */
    public final t f31993a;

    /* renamed from: b  reason: collision with root package name */
    public final p1 f31994b;

    public C3347l(t tVar, p1 p1Var) {
        AbstractC3557B.c0("experimentManager", tVar);
        AbstractC3557B.c0("statsigAnalyticsService", p1Var);
        this.f31993a = tVar;
        this.f31994b = p1Var;
    }

    @Override // nd.AbstractC4815d
    public final EnumC4814c a() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // nd.AbstractC4815d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C3346k c3346k;
        int i10;
        p1 p1Var;
        if (abstractC4825e instanceof C3346k) {
            c3346k = (C3346k) abstractC4825e;
            int i11 = c3346k.f31992i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3346k.f31992i0 = i11 - Integer.MIN_VALUE;
                Object obj = c3346k.f31990Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c3346k.f31992i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        p1Var = c3346k.f31989Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    ExperimentKey.StatsigAnalytics statsigAnalytics = ExperimentKey.StatsigAnalytics.INSTANCE;
                    p1 p1Var2 = this.f31994b;
                    c3346k.f31989Y = p1Var2;
                    c3346k.f31992i0 = 1;
                    G g10 = (G) this.f31993a;
                    g10.getClass();
                    obj = G.d(g10, statsigAnalytics, c3346k);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    p1Var = p1Var2;
                }
                p1Var.f23400a = ((Boolean) obj).booleanValue();
                Pc.c a5 = Pc.e.a();
                boolean z10 = p1Var.f23400a;
                W.F(a5, "Statsig analytics enabled set to " + z10, null, 6);
                return y.f36177a;
            }
        }
        c3346k = new C3346k(this, abstractC4825e);
        Object obj2 = c3346k.f31990Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3346k.f31992i0;
        if (i10 == 0) {
        }
        p1Var.f23400a = ((Boolean) obj2).booleanValue();
        Pc.c a52 = Pc.e.a();
        boolean z102 = p1Var.f23400a;
        W.F(a52, "Statsig analytics enabled set to " + z102, null, 6);
        return y.f36177a;
    }

    @Override // nd.AbstractC4815d
    public final Tg.e c() {
        return Q.f12904a;
    }
}
