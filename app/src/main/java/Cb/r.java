package Cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class r {
    public static final C0307q Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f2959a;

    public /* synthetic */ r(String str) {
        this.f2959a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f2959a, ((r) obj).f2959a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2959a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ArkoseToken(value="), this.f2959a, Separators.RPAREN);
    }
}
