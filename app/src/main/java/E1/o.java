package E1;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4116a;

    public o(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f4116a = collectionItemInfo;
    }

    public static o a(int i10, int i11, int i12, int i13, boolean z10) {
        return new o(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, false, z10));
    }
}
