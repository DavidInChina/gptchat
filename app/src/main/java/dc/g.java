package dc;

import Ad.s;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements s {

    /* renamed from: a  reason: collision with root package name */
    public final List f28205a;

    public g(ArrayList arrayList) {
        this.f28205a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && AbstractC3557B.K(this.f28205a, ((g) obj).f28205a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28205a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("BetaSettingsState(features="), this.f28205a, Separators.RPAREN);
    }
}
