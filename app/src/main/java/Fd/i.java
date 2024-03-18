package Fd;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class i implements k {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5248a;

    public i(boolean z10) {
        this.f5248a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && this.f5248a == ((i) obj).f5248a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f5248a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("MinimizeAssistantConfirmation(confirmed="), this.f5248a, Separators.RPAREN);
    }
}
