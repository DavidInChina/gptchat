package q5;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: q5.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5275e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f43931a;

    public C5275e(boolean z10) {
        this.f43931a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5275e) && this.f43931a == ((C5275e) obj).f43931a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.f43931a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("ProcessInfo(isMainProcess="), this.f43931a, Separators.RPAREN);
    }
}
