package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Mb.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0987x implements AbstractC0989y {

    /* renamed from: a  reason: collision with root package name */
    public final String f11999a;

    public C0987x(String str) {
        this.f11999a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0987x) && AbstractC3557B.K(this.f11999a, ((C0987x) obj).f11999a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11999a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ShowError(error="), this.f11999a, Separators.RPAREN);
    }
}
