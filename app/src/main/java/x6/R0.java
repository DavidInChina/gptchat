package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes.dex */
public final class R0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f49071a;

    public R0(Map map) {
        AbstractC3557B.c0("additionalProperties", map);
        this.f49071a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof R0) && AbstractC3557B.K(this.f49071a, ((R0) obj).f49071a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49071a.hashCode();
    }

    public final String toString() {
        return "Context(additionalProperties=" + this.f49071a + Separators.RPAREN;
    }
}
