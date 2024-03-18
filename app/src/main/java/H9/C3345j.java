package h9;

import Ng.Q;
import Qd.C1185d;
import Qd.m;
import Z8.n1;
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

/* renamed from: h9.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3345j implements AbstractC4815d {

    /* renamed from: a  reason: collision with root package name */
    public final t f31987a;

    /* renamed from: b  reason: collision with root package name */
    public final n1 f31988b;

    public C3345j(t tVar, n1 n1Var) {
        AbstractC3557B.c0("experimentManager", tVar);
        AbstractC3557B.c0("segmentAnalyticsService", n1Var);
        this.f31987a = tVar;
        this.f31988b = n1Var;
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
        C3344i c3344i;
        int i10;
        n1 n1Var;
        if (abstractC4825e instanceof C3344i) {
            c3344i = (C3344i) abstractC4825e;
            int i11 = c3344i.f31986i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3344i.f31986i0 = i11 - Integer.MIN_VALUE;
                Object obj = c3344i.f31984Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c3344i.f31986i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        n1Var = c3344i.f31983Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    ExperimentKey.OaiAnalyticsEnabled oaiAnalyticsEnabled = ExperimentKey.OaiAnalyticsEnabled.INSTANCE;
                    n1 n1Var2 = this.f31988b;
                    c3344i.f31983Y = n1Var2;
                    c3344i.f31986i0 = 1;
                    G g10 = (G) this.f31987a;
                    g10.getClass();
                    obj = G.d(g10, oaiAnalyticsEnabled, c3344i);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    n1Var = n1Var2;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Qd.i iVar = n1Var.f23394a;
                iVar.f14615k0 = booleanValue;
                m mVar = iVar.f14611Z;
                Ad.l.O0(mVar.b(), mVar.d(), null, new C1185d(iVar, booleanValue, null), 2);
                Pc.c a5 = Pc.e.a();
                boolean z10 = iVar.f14615k0;
                W.F(a5, "SegmentAnalytics set to " + z10, null, 6);
                return y.f36177a;
            }
        }
        c3344i = new C3344i(this, abstractC4825e);
        Object obj2 = c3344i.f31984Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3344i.f31986i0;
        if (i10 == 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        Qd.i iVar2 = n1Var.f23394a;
        iVar2.f14615k0 = booleanValue2;
        m mVar2 = iVar2.f14611Z;
        Ad.l.O0(mVar2.b(), mVar2.d(), null, new C1185d(iVar2, booleanValue2, null), 2);
        Pc.c a52 = Pc.e.a();
        boolean z102 = iVar2.f14615k0;
        W.F(a52, "SegmentAnalytics set to " + z102, null, 6);
        return y.f36177a;
    }

    @Override // nd.AbstractC4815d
    public final Tg.e c() {
        return Q.f12904a;
    }
}
