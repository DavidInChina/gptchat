package E1;

import H0.D;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public class q extends D {
    @Override // H0.D, android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        p L10 = ((J0.a) this.f6717b).L(i10);
        if (L10 == null) {
            return null;
        }
        return L10.f4118a;
    }
}
