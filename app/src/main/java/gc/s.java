package gc;

import Df.AbstractC0405d;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.ArrayList;
import kf.v;
import kotlin.jvm.internal.C;
import y.C6461B;

/* loaded from: classes.dex */
public final class s extends p {

    /* renamed from: j  reason: collision with root package name */
    public final com.openai.experiment.t f31577j;

    public s(com.openai.experiment.t tVar) {
        super(new o("", v.f37483Y));
        this.f31577j = tVar;
        ArrayList arrayList = new ArrayList();
        for (AbstractC0405d abstractC0405d : C.f37623a.b(ExperimentKey.BooleanKey.class).i()) {
            ExperimentKey.BooleanKey booleanKey = (ExperimentKey.BooleanKey) abstractC0405d.q();
            if (booleanKey != null) {
                boolean c10 = ((G) this.f31577j).c(booleanKey);
                G g10 = (G) this.f31577j;
                g10.getClass();
                arrayList.add(new C3251c(booleanKey, c10, g10.f27672a.f27663e.getAllOverrides().getGates().containsKey(booleanKey.getKey())));
            }
        }
        l(new C6461B(10, arrayList));
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        g gVar = (g) iVar;
        AbstractC3557B.c0("intent", gVar);
        if (gVar instanceof C3253e) {
            l(new nb.d(14, gVar));
            return;
        }
        boolean z10 = gVar instanceof C3252d;
        com.openai.experiment.t tVar = this.f31577j;
        if (z10) {
            ((G) tVar).f27672a.f27663e.removeAllOverrides();
            l(new q(this));
        } else if (gVar instanceof C3254f) {
            C3254f c3254f = (C3254f) gVar;
            G g10 = (G) tVar;
            g10.getClass();
            ExperimentKey.BooleanKey booleanKey = c3254f.f31555a;
            AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, booleanKey);
            g10.f27672a.f27663e.overrideGate(booleanKey.getKey(), c3254f.f31556b);
            l(new r(gVar));
        }
    }
}
