package oc;

import Uc.V;
import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.P;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import id.AbstractC3557B;
import kf.v;
import nc.AbstractC4808A;
import nc.w;
import nc.x;
import nc.z;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class o extends AbstractC4808A {

    /* renamed from: j  reason: collision with root package name */
    public final Application f41289j;

    /* renamed from: k  reason: collision with root package name */
    public final String f41290k;

    public o(P p10, Q9.j jVar, Va.e eVar, N9.c cVar, t tVar, Application application) {
        super(new z(true, null, null, null, false, null, v.f37483Y, null, null, ((G) tVar).c(ExperimentKey.ConversationsAreReportable.INSTANCE)));
        this.f41289j = application;
        V v10 = V.f17631i;
        Object b10 = p10.b("sharedId");
        if (b10 != null) {
            this.f41290k = (String) b10;
            Ad.l.O0(AbstractC4828h.Q(this), null, null, new n(jVar, this, cVar, eVar, null), 3);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        x xVar = (x) iVar;
        AbstractC3557B.c0("intent", xVar);
        if (AbstractC3557B.K(xVar, w.f40261a)) {
            Intent intent = new Intent();
            A7.b.G0(intent, "https://help.openai.com/en/articles/7925741-chatgpt-shared-links-faq");
            f(new nc.t(intent));
        }
    }
}
