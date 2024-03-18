package a7;

import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class j implements l {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23922a;

    public j(boolean z10) {
        this.f23922a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && this.f23922a == ((j) obj).f23922a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.f23922a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return AbstractC6463a.l(new StringBuilder("Denied(shouldShowRationale="), this.f23922a, ')');
    }
}
