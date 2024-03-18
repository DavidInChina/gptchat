package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class W0 {
    public static final V0 Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f13506b = {new C2695d(T0.f13499d, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final List f13507a;

    public W0(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f13507a = list;
        } else {
            R4.b.e2(i10, 1, U0.f13503b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof W0) && AbstractC3557B.K(this.f13507a, ((W0) obj).f13507a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13507a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("ApiMessageTetherCitationData(metadataList="), this.f13507a, Separators.RPAREN);
    }
}
