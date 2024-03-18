package rc;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f44834a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f44835b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f44836c;

    public Z(boolean z10, boolean z11, boolean z12) {
        this.f44834a = z10;
        this.f44835b = z11;
        this.f44836c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        if (this.f44834a == z10.f44834a && this.f44835b == z10.f44835b && this.f44836c == z10.f44836c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 1237;
        if (this.f44834a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i13 = i10 * 31;
        if (this.f44835b) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i14 = (i13 + i11) * 31;
        if (this.f44836c) {
            i12 = 1231;
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAnnouncementState(remoteEligible=");
        sb2.append(this.f44834a);
        sb2.append(", remoteViewed=");
        sb2.append(this.f44835b);
        sb2.append(", localViewed=");
        return AbstractC4194d.w(sb2, this.f44836c, Separators.RPAREN);
    }
}
