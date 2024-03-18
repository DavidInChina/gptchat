package V1;

import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Iterator;
import y1.C6497g;

/* loaded from: classes2.dex */
public final class d0 extends e0 {

    /* renamed from: h  reason: collision with root package name */
    public final P f18179h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d0(int i10, int i11, P p10, C6497g c6497g) {
        super(i10, i11, r1, c6497g);
        AbstractC2469q0.q("finalState", i10);
        AbstractC2469q0.q("lifecycleImpact", i11);
        AbstractC3557B.c0("fragmentStateManager", p10);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = p10.f18101c;
        AbstractC3557B.b0("fragmentStateManager.fragment", abstractComponentCallbacksC1480v);
        this.f18179h = p10;
    }

    @Override // V1.e0
    public final void b() {
        if (!this.f18189g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f18189g = true;
            Iterator it = this.f18186d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f18179h.k();
    }

    @Override // V1.e0
    public final void d() {
        float f6;
        int i10 = this.f18184b;
        P p10 = this.f18179h;
        if (i10 == 2) {
            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = p10.f18101c;
            AbstractC3557B.b0("fragmentStateManager.fragment", abstractComponentCallbacksC1480v);
            View findFocus = abstractComponentCallbacksC1480v.f18269J0.findFocus();
            if (findFocus != null) {
                abstractComponentCallbacksC1480v.j().f18258m = findFocus;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC1480v);
                }
            }
            View L10 = this.f18185c.L();
            if (L10.getParent() == null) {
                p10.b();
                L10.setAlpha(0.0f);
            }
            if (L10.getAlpha() == 0.0f && L10.getVisibility() == 0) {
                L10.setVisibility(4);
            }
            C1479u c1479u = abstractComponentCallbacksC1480v.f18272M0;
            if (c1479u == null) {
                f6 = 1.0f;
            } else {
                f6 = c1479u.f18257l;
            }
            L10.setAlpha(f6);
        } else if (i10 == 3) {
            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = p10.f18101c;
            AbstractC3557B.b0("fragmentStateManager.fragment", abstractComponentCallbacksC1480v2);
            View L11 = abstractComponentCallbacksC1480v2.L();
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Clearing focus " + L11.findFocus() + " on view " + L11 + " for Fragment " + abstractComponentCallbacksC1480v2);
            }
            L11.clearFocus();
        }
    }
}
