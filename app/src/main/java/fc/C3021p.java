package fc;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: fc.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3021p implements AbstractC3022q {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30219a;

    public C3021p(boolean z10) {
        this.f30219a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3021p) && this.f30219a == ((C3021p) obj).f30219a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f30219a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("UseAuth0Staging(enable="), this.f30219a, Separators.RPAREN);
    }
}
