package Cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class d0 {
    public static final c0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f2936a;

    public /* synthetic */ d0(String str) {
        this.f2936a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f2936a, ((d0) obj).f2936a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2936a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("PhoneVerificationId(value="), this.f2936a, Separators.RPAREN);
    }
}
