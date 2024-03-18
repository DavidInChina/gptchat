package fc;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: fc.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3020o implements AbstractC3022q {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30218a;

    public C3020o(boolean z10) {
        this.f30218a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3020o) && this.f30218a == ((C3020o) obj).f30218a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f30218a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("UseApiStaging(enable="), this.f30218a, Separators.RPAREN);
    }
}
