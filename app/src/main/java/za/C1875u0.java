package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: Za.u0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1875u0 {
    public static final C1873t0 Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f23617b = {new C2695d(K.f23477a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final List f23618a;

    public C1875u0(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f23618a = list;
        } else {
            R4.b.e2(i10, 1, C1871s0.f23612b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1875u0) && AbstractC3557B.K(this.f23618a, ((C1875u0) obj).f23618a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23618a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("BootstrapResponse(gizmos="), this.f23618a, Separators.RPAREN);
    }
}
