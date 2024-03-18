package pc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: pc.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5138q implements r {

    /* renamed from: Y  reason: collision with root package name */
    public final C5139s f43021Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C5125d f43022Z;

    public C5138q(C5139s c5139s, C5125d c5125d) {
        this.f43021Y = c5139s;
        this.f43022Z = c5125d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5138q)) {
            return false;
        }
        C5138q c5138q = (C5138q) obj;
        if (AbstractC3557B.K(this.f43021Y, c5138q.f43021Y) && AbstractC3557B.K(this.f43022Z, c5138q.f43022Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        C5139s c5139s = this.f43021Y;
        if (c5139s == null) {
            i10 = 0;
        } else {
            i10 = c5139s.hashCode();
        }
        return this.f43022Z.hashCode() + (i10 * 31);
    }

    public final String toString() {
        return "Success(transaction=" + this.f43021Y + ", customerInfo=" + this.f43022Z + Separators.RPAREN;
    }
}
