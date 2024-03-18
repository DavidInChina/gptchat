package h4;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f31884a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f31885b;

    public g(BitmapDrawable bitmapDrawable, boolean z10) {
        this.f31884a = bitmapDrawable;
        this.f31885b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (AbstractC3557B.K(this.f31884a, gVar.f31884a) && this.f31885b == gVar.f31885b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f31884a.hashCode() * 31;
        if (this.f31885b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }
}
