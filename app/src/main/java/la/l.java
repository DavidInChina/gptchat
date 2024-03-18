package la;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import m9.C4573e;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a  reason: collision with root package name */
    public final C4573e f37910a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f37911b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f37912c;

    public l(C4573e c4573e, boolean z10, boolean z11) {
        this.f37910a = c4573e;
        this.f37911b = z10;
        this.f37912c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3557B.K(this.f37910a, lVar.f37910a) && this.f37911b == lVar.f37911b && this.f37912c == lVar.f37912c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f37910a.hashCode() * 31;
        int i11 = 1237;
        if (this.f37911b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (hashCode + i10) * 31;
        if (this.f37912c) {
            i11 = 1231;
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NonCompliant(warning=");
        sb2.append(this.f37910a);
        sb2.append(", error=");
        sb2.append(this.f37911b);
        sb2.append(", loading=");
        return AbstractC4194d.w(sb2, this.f37912c, Separators.RPAREN);
    }
}
