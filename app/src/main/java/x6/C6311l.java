package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6311l {

    /* renamed from: a  reason: collision with root package name */
    public final String f49370a;

    public C6311l(String str) {
        this.f49370a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6311l) && AbstractC3557B.K(this.f49370a, ((C6311l) obj).f49370a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49370a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ContainerView(id="), this.f49370a, Separators.RPAREN);
    }
}
