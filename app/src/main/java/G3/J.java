package G3;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
public final class J implements K {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f5902a;

    public J(View view) {
        this.f5902a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof J) && ((J) obj).f5902a.equals(this.f5902a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5902a.hashCode();
    }
}
