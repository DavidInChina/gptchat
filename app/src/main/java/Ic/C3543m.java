package ic;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ic.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3543m implements AbstractC3545o {

    /* renamed from: a  reason: collision with root package name */
    public final String f33059a;

    public C3543m(String str) {
        this.f33059a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3543m)) {
            return false;
        }
        if (AbstractC3557B.K(this.f33059a, ((C3543m) obj).f33059a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33059a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("NavigateTo(route=", AbstractC3557B.F2(this.f33059a), Separators.RPAREN);
    }
}
