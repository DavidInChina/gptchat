package r4;

import android.content.Context;
import android.util.DisplayMetrics;
import id.AbstractC3557B;
import nf.AbstractC4825e;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: b  reason: collision with root package name */
    public final Context f44431b;

    public c(Context context) {
        this.f44431b = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            if (AbstractC3557B.K(this.f44431b, ((c) obj).f44431b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f44431b.hashCode();
    }

    @Override // r4.i
    public final Object j(AbstractC4825e abstractC4825e) {
        DisplayMetrics displayMetrics = this.f44431b.getResources().getDisplayMetrics();
        C5364a c5364a = new C5364a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(c5364a, c5364a);
    }
}
