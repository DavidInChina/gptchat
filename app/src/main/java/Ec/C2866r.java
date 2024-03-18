package ec;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: ec.r  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2866r implements AbstractC2868t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29244a;

    public C2866r(boolean z10) {
        this.f29244a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2866r) && this.f29244a == ((C2866r) obj).f29244a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29244a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("DisableHistory(disable="), this.f29244a, Separators.RPAREN);
    }
}
