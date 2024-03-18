package ya;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class x implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f50884a;

    /* renamed from: b  reason: collision with root package name */
    public final Ed.m f50885b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f50886c;

    public x(boolean z10, Ed.m mVar, boolean z11) {
        this.f50884a = z10;
        this.f50885b = mVar;
        this.f50886c = z11;
    }

    public static x e(x xVar, Ed.m mVar, boolean z10, int i10) {
        boolean z11 = xVar.f50884a;
        if ((i10 & 2) != 0) {
            mVar = xVar.f50885b;
        }
        if ((i10 & 4) != 0) {
            z10 = xVar.f50886c;
        }
        xVar.getClass();
        return new x(z11, mVar, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f50884a == xVar.f50884a && AbstractC3557B.K(this.f50885b, xVar.f50885b) && this.f50886c == xVar.f50886c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 1237;
        if (this.f50884a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i13 = i10 * 31;
        Ed.m mVar = this.f50885b;
        if (mVar == null) {
            i11 = 0;
        } else {
            i11 = mVar.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        if (this.f50886c) {
            i12 = 1231;
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VoiceFeedbackViewState(feedbackAvailable=");
        sb2.append(this.f50884a);
        sb2.append(", voiceSessionInformation=");
        sb2.append(this.f50885b);
        sb2.append(", promptForTraining=");
        return AbstractC4194d.w(sb2, this.f50886c, Separators.RPAREN);
    }
}
