package Ac;

import Ad.i;
import B9.j;
import Fd.f;
import Fd.k;
import Fd.u;
import Fd.v;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import id.AbstractC3557B;
import pf.AbstractC5163j;
import rc.Q;
import xd.h;
import zc.C6821H;

/* loaded from: classes.dex */
public final class d extends v {

    /* renamed from: j  reason: collision with root package name */
    public final j f787j;

    /* JADX WARN: Type inference failed for: r8v1, types: [pf.j, wf.n] */
    public d(j jVar, h hVar, t tVar) {
        super(new u(null, null, false, false, ((G) tVar).c(ExperimentKey.AssistantMinimizerEnabled.INSTANCE)));
        this.f787j = jVar;
        k(b.f785Y, K8.d.G0(new AbstractC5163j(2, null), ((Q) hVar).f44819b));
    }

    @Override // androidx.lifecycle.Y
    public final void c() {
        this.f787j.getClass();
    }

    @Override // Ad.g
    public final void i(i iVar) {
        k kVar = (k) iVar;
        AbstractC3557B.c0("intent", kVar);
        if (kVar instanceof Fd.h) {
            l(c.f786Y);
        } else if (kVar instanceof Fd.i) {
            l(new C6821H(1, kVar));
            if (((Fd.i) kVar).f5248a) {
                f(Fd.e.f5245a);
            }
        } else if (kVar instanceof Fd.j) {
            f(f.f5246a);
        }
    }
}
