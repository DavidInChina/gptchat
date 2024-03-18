package hc;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class F implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32144a;

    public F(boolean z10) {
        this.f32144a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof F) && this.f32144a == ((F) obj).f32144a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f32144a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("CustomInstructionsIntroductionState(isWorkspace="), this.f32144a, Separators.RPAREN);
    }
}
