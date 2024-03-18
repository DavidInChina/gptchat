package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;

/* renamed from: x6.t0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6335t0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f49439a;

    public C6335t0(Map map) {
        AbstractC3557B.c0("additionalProperties", map);
        this.f49439a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6335t0) && AbstractC3557B.K(this.f49439a, ((C6335t0) obj).f49439a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49439a.hashCode();
    }

    public final String toString() {
        return "Context(additionalProperties=" + this.f49439a + Separators.RPAREN;
    }
}
