package Cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Cb.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0310u {
    public static final C0309t Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f2962a;

    public C0310u(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f2962a = str;
        } else {
            R4.b.e2(i10, 1, C0308s.f2961b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0310u) && AbstractC3557B.K(this.f2962a, ((C0310u) obj).f2962a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2962a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ArkoseTokenResponse(token="), this.f2962a, Separators.RPAREN);
    }
}
