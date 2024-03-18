package V1;

import android.view.View;
import n.AbstractC4694e;

/* renamed from: V1.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1477s extends AbstractC4694e {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC1480v f18243Y;

    public C1477s(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        this.f18243Y = abstractComponentCallbacksC1480v;
    }

    @Override // n.AbstractC4694e
    public final View k(int i10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18243Y;
        View view = abstractComponentCallbacksC1480v.f18269J0;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC1480v + " does not have a view");
    }

    @Override // n.AbstractC4694e
    public final boolean l() {
        if (this.f18243Y.f18269J0 != null) {
            return true;
        }
        return false;
    }
}
