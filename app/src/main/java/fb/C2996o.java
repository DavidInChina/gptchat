package fb;

import Ad.s;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fb.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2996o implements s {

    /* renamed from: a  reason: collision with root package name */
    public final List f30105a;

    public C2996o(ArrayList arrayList) {
        this.f30105a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2996o) && AbstractC3557B.K(this.f30105a, ((C2996o) obj).f30105a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30105a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("LicensesViewState(artifacts="), this.f30105a, Separators.RPAREN);
    }
}
