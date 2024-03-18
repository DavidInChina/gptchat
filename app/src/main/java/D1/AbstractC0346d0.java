package D1;

import android.view.ViewGroup;

/* renamed from: D1.d0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0346d0 {
    public static int a(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static boolean b(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    public static void c(ViewGroup viewGroup, boolean z10) {
        viewGroup.setTransitionGroup(z10);
    }
}
