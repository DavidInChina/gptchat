package L9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class d0 implements X {
    public static final c0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f10920a;

    public d0(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f10920a = str;
        } else {
            R4.b.e2(i10, 1, b0.f10906b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d0) && AbstractC3557B.K(this.f10920a, ((d0) obj).f10920a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10920a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("UpdateConversationTitleRequest(title="), this.f10920a, Separators.RPAREN);
    }

    public d0(String str) {
        AbstractC3557B.c0("title", str);
        this.f10920a = str;
    }
}
