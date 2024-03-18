package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class r {
    public static final C6204q Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f48451a;

    public /* synthetic */ r(String str) {
        this.f48451a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f48451a, ((r) obj).f48451a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f48451a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Id(value="), this.f48451a, Separators.RPAREN);
    }
}
