package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a  reason: collision with root package name */
    public final Map f49073a;

    public S(Map map) {
        AbstractC3557B.c0("additionalProperties", map);
        this.f49073a = map;
    }

    public final I8.u a() {
        I8.u uVar = new I8.u();
        for (Map.Entry entry : this.f49073a.entrySet()) {
            uVar.U((String) entry.getKey(), Gi.e.T(entry.getValue()));
        }
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof S) && AbstractC3557B.K(this.f49073a, ((S) obj).f49073a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49073a.hashCode();
    }

    public final String toString() {
        return "Context(additionalProperties=" + this.f49073a + Separators.RPAREN;
    }
}
