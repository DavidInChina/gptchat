package z4;

import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public final class r implements s {

    /* renamed from: a  reason: collision with root package name */
    public final int f51709a;

    public /* synthetic */ r(int i10) {
        this.f51709a = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        if (this.f51709a != ((r) obj).f51709a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f51709a;
    }

    public final String toString() {
        return android.gov.nist.core.a.l(new StringBuilder("RawRes(resId="), this.f51709a, Separators.RPAREN);
    }
}
