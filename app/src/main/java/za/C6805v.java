package za;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: za.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6805v implements AbstractC6806w {

    /* renamed from: a  reason: collision with root package name */
    public final T0.z f51803a;

    public C6805v(T0.z zVar) {
        AbstractC3557B.c0("value", zVar);
        this.f51803a = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6805v) && AbstractC3557B.K(this.f51803a, ((C6805v) obj).f51803a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51803a.hashCode();
    }

    public final String toString() {
        return "UpdateInput(value=" + this.f51803a + Separators.RPAREN;
    }
}
