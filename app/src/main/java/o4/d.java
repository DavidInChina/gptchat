package o4;

import android.graphics.Bitmap;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f40582a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f40583b;

    public d(Bitmap bitmap, Map map) {
        this.f40582a = bitmap;
        this.f40583b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (AbstractC3557B.K(this.f40582a, dVar.f40582a) && AbstractC3557B.K(this.f40583b, dVar.f40583b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f40583b.hashCode() + (this.f40582a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f40582a + ", extras=" + this.f40583b + ')';
    }
}
