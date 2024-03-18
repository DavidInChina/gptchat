package W1;

import V1.AbstractComponentCallbacksC1480v;
import android.view.ViewGroup;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class d extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v, ViewGroup viewGroup, int i10) {
        super(abstractComponentCallbacksC1480v, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC1480v + " to container " + viewGroup);
        if (i10 != 1) {
            return;
        }
        AbstractC3557B.c0("container", viewGroup);
        super(abstractComponentCallbacksC1480v, "Attempting to add fragment " + abstractComponentCallbacksC1480v + " to container " + viewGroup + " which is not a FragmentContainerView");
    }
}
