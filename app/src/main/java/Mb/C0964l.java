package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Mb.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0964l implements AbstractC0966m {

    /* renamed from: a  reason: collision with root package name */
    public final String f11954a;

    public C0964l(String str) {
        AbstractC3557B.c0("error", str);
        this.f11954a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0964l) && AbstractC3557B.K(this.f11954a, ((C0964l) obj).f11954a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11954a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ShowError(error="), this.f11954a, Separators.RPAREN);
    }
}
