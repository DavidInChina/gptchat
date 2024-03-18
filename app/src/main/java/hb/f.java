package hb;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32105a;

    public f(boolean z10) {
        this.f32105a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && this.f32105a == ((f) obj).f32105a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f32105a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("AutoReadClick(enable="), this.f32105a, Separators.RPAREN);
    }
}
