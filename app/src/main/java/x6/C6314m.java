package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;

/* renamed from: x6.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6314m {

    /* renamed from: a  reason: collision with root package name */
    public final Map f49377a;

    public C6314m(Map map) {
        AbstractC3557B.c0("additionalProperties", map);
        this.f49377a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6314m) && AbstractC3557B.K(this.f49377a, ((C6314m) obj).f49377a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49377a.hashCode();
    }

    public final String toString() {
        return "Context(additionalProperties=" + this.f49377a + Separators.RPAREN;
    }
}
