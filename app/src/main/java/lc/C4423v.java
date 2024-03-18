package lc;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: lc.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4423v implements AbstractC4380D {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f38275a;

    public C4423v(boolean z10) {
        this.f38275a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4423v) && this.f38275a == ((C4423v) obj).f38275a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f38275a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("SetHapticFeedback(value="), this.f38275a, Separators.RPAREN);
    }
}
