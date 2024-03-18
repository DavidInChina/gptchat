package V1;

import io.sentry.android.core.AbstractC3612c;
import j.AbstractC3873c;
import j.C3872b;

/* loaded from: classes.dex */
public final class F implements AbstractC3873c {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ K f18023Y;

    public /* synthetic */ F(K k10) {
        this.f18023Y = k10;
    }

    @Override // j.AbstractC3873c
    public final void d(Object obj) {
        C3872b c3872b = (C3872b) obj;
        K k10 = this.f18023Y;
        H h10 = (H) k10.f18033D.pollFirst();
        if (h10 == null) {
            AbstractC3612c.r("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        U3.i iVar = k10.f18046c;
        String str = h10.f18025Y;
        AbstractComponentCallbacksC1480v t10 = iVar.t(str);
        if (t10 == null) {
            AbstractC3612c.r("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            return;
        }
        t10.w(h10.f18026Z, c3872b.f35796Y, c3872b.f35797Z);
    }
}
