package na;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: na.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4734G implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f39797a;

    public C4734G(boolean z10) {
        this.f39797a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4734G) && this.f39797a == ((C4734G) obj).f39797a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f39797a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("ModelsDialog(show="), this.f39797a, Separators.RPAREN);
    }
}
