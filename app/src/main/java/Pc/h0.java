package pc;

import android.content.Intent;
import android.net.Uri;
import bb.C2162e0;
import com.openai.chatgpt.R;
import com.openai.experiment.ExperimentKey;
import com.revenuecat.purchases.common.Constants;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import rc.C5472v;

/* loaded from: classes.dex */
public final class h0 extends b0 {

    /* renamed from: j  reason: collision with root package name */
    public final C5144x f42995j;

    public h0(C5144x c5144x, xd.b bVar, com.openai.experiment.t tVar, androidx.lifecycle.P p10) {
        super(k0.f43004a);
        this.f42995j = c5144x;
        Uc.Q q10 = Uc.Q.f17626i;
        Boolean bool = (Boolean) p10.b("unavailableFreeFeature");
        if (bool != null && bool.booleanValue()) {
            f(new W(R.string.subscriptions_unavailable_feature_free_user, false));
        }
        if (!((com.openai.experiment.G) tVar).c(ExperimentKey.SubscriptionsEnabled.INSTANCE)) {
            m(C5146z.f43055i0);
            return;
        }
        L4.a.E0(L4.a.I0(new d0(this, null), L4.a.q0(((C5472v) bVar).f44936f, c5144x.f43048f, c0.f42972m0)), AbstractC4828h.Q(this));
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        a0 a0Var = (a0) iVar;
        AbstractC3557B.c0("intent", a0Var);
        if (AbstractC3557B.K(a0Var, Y.f42952a)) {
            m0 m0Var = (m0) this.f808e.getValue();
            if (m0Var instanceof l0) {
                int ordinal = ((l0) m0Var).f43011d.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.f42995j.getClass();
                        f(new V(new Intent("android.intent.action.VIEW", Uri.parse(Constants.GOOGLE_PLAY_MANAGEMENT_URL))));
                        return;
                    }
                    return;
                }
                m(C5115A.f42893i0);
            }
        } else if (AbstractC3557B.K(a0Var, Z.f42953a)) {
            h(new e0(this, null));
        }
    }

    public final void m(K k10) {
        int ordinal = k10.f42908Z.ordinal();
        if (ordinal != 0) {
            int i10 = k10.f42907Y;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    f(new W(i10, true));
                    l(new f0(k10, 1));
                    return;
                }
                return;
            }
            f(new W(i10, false));
            l(new C2162e0(26, P.f42937j0));
            return;
        }
        l(new f0(k10, 0));
    }
}
