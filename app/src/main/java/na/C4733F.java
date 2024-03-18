package na;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: na.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4733F implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f39791a;

    public C4733F(boolean z10) {
        this.f39791a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4733F) && this.f39791a == ((C4733F) obj).f39791a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f39791a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("FullscreenMode(fullscreen="), this.f39791a, Separators.RPAREN);
    }
}
