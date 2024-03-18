package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: x6.y1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6351y1 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f49484a;

    public C6351y1(LinkedHashMap linkedHashMap) {
        this.f49484a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6351y1) && AbstractC3557B.K(this.f49484a, ((C6351y1) obj).f49484a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49484a.hashCode();
    }

    public final String toString() {
        return "CustomTimings(additionalProperties=" + this.f49484a + Separators.RPAREN;
    }
}
