package hc;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class D implements E {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32143a;

    public D(boolean z10) {
        this.f32143a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof D) && this.f32143a == ((D) obj).f32143a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f32143a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("SetEnabled(enabled="), this.f32143a, Separators.RPAREN);
    }
}
