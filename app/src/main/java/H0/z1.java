package H0;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a  reason: collision with root package name */
    public static final z1 f7152a = new Object();

    public final void a(C0714y c0714y) {
        ViewParent parent = c0714y.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(c0714y, c0714y);
        }
    }
}
