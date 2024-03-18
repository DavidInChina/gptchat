package Ad;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class w implements y {

    /* renamed from: a  reason: collision with root package name */
    public final h f828a;

    public /* synthetic */ w(h hVar) {
        this.f828a = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f828a, ((w) obj).f828a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f828a.hashCode();
    }

    public final String toString() {
        return "Custom(effect=" + this.f828a + Separators.RPAREN;
    }
}
