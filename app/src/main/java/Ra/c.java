package Ra;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import id.C3556A;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final C3556A f15189a;

    public c(C3556A c3556a) {
        AbstractC3557B.c0("selectionState", c3556a);
        this.f15189a = c3556a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && AbstractC3557B.K(this.f15189a, ((c) obj).f15189a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15189a.hashCode();
    }

    public final String toString() {
        return "UpdateSelectionState(selectionState=" + this.f15189a + Separators.RPAREN;
    }
}
