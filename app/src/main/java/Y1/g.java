package Y1;

import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g extends e {

    /* renamed from: a  reason: collision with root package name */
    public final Map f22053a;

    public g(LinkedHashMap linkedHashMap) {
        this.f22053a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (AbstractC3557B.K(this.f22053a, ((g) obj).f22053a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22053a.hashCode();
    }

    public final String toString() {
        return this.f22053a.toString();
    }
}
