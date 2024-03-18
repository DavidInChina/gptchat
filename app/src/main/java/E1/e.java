package E1;

import D1.H;
import D1.Z;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import i8.C3493k;
import i8.C3494l;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final d f4099a;

    public e(d dVar) {
        this.f4099a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f4099a.equals(((e) obj).f4099a);
    }

    public final int hashCode() {
        return this.f4099a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        int i10;
        C3494l c3494l = (C3494l) ((C3493k) this.f4099a).f32774Z;
        AutoCompleteTextView autoCompleteTextView = c3494l.f32778h;
        if (autoCompleteTextView != null && !U3.f.c0(autoCompleteTextView)) {
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            WeakHashMap weakHashMap = Z.f3247a;
            H.s(c3494l.f32817d, i10);
        }
    }
}
