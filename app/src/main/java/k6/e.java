package K6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f9503c = {"_top_level"};

    /* renamed from: a  reason: collision with root package name */
    public final Long f9504a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f9505b;

    public e(Long l10, Map map) {
        this.f9504a = l10;
        this.f9505b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3557B.K(this.f9504a, eVar.f9504a) && AbstractC3557B.K(this.f9505b, eVar.f9505b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Long l10 = this.f9504a;
        if (l10 == null) {
            i10 = 0;
        } else {
            i10 = l10.hashCode();
        }
        return this.f9505b.hashCode() + (i10 * 31);
    }

    public final String toString() {
        return "Metrics(topLevel=" + this.f9504a + ", additionalProperties=" + this.f9505b + Separators.RPAREN;
    }
}
