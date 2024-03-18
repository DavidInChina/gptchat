package lh;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final int f38507a;

    public static void a(int i10) {
        if (i10 != 1 && i10 % 2 != 0) {
            throw new IllegalStateException(AbstractC4194d.v("Incorrect size = ", i10, ". BitmapRegionDecoder requires values based on powers of 2.").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        if (this.f38507a != ((t) obj).f38507a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f38507a;
    }

    public final String toString() {
        return android.gov.nist.core.a.l(new StringBuilder("BitmapSampleSize(size="), this.f38507a, Separators.RPAREN);
    }
}
