package hb;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class h implements l {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32107a;

    public h(boolean z10) {
        this.f32107a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.f32107a == ((h) obj).f32107a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f32107a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("Pause(isPaused="), this.f32107a, Separators.RPAREN);
    }
}
