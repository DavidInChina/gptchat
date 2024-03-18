package q4;

import id.AbstractC3557B;
import java.util.Map;
import kf.w;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final r f43893b = new r(w.f37484Y);

    /* renamed from: a  reason: collision with root package name */
    public final Map f43894a;

    public r(Map map) {
        this.f43894a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            if (AbstractC3557B.K(this.f43894a, ((r) obj).f43894a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43894a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f43894a + ')';
    }
}
