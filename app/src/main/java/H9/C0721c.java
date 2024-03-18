package H9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: H9.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721c implements AbstractC0723e {

    /* renamed from: a  reason: collision with root package name */
    public final String f7513a;

    public C0721c(String str) {
        this.f7513a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0721c)) {
            return false;
        }
        if (AbstractC3557B.K(this.f7513a, ((C0721c) obj).f7513a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7513a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("NavigateTo(route=", AbstractC3557B.F2(this.f7513a), Separators.RPAREN);
    }
}
