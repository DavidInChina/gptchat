package hc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: hc.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3401p implements AbstractC3402q {

    /* renamed from: a  reason: collision with root package name */
    public final T0.z f32215a;

    public C3401p(T0.z zVar) {
        AbstractC3557B.c0("value", zVar);
        this.f32215a = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3401p) && AbstractC3557B.K(this.f32215a, ((C3401p) obj).f32215a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32215a.hashCode();
    }

    public final String toString() {
        return "Update(value=" + this.f32215a + Separators.RPAREN;
    }
}
