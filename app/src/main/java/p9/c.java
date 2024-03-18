package P9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13879a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13880b;

    public c(int i10, boolean z10, boolean z11) {
        if (3 == (i10 & 3)) {
            this.f13879a = z10;
            this.f13880b = z11;
            return;
        }
        R4.b.e2(i10, 3, a.f13878b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f13879a == cVar.f13879a && this.f13880b == cVar.f13880b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 1237;
        if (this.f13879a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = i10 * 31;
        if (this.f13880b) {
            i11 = 1231;
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ApiModerationResponse(flagged=" + this.f13879a + ", blocked=" + this.f13880b + Separators.RPAREN;
    }
}
