package gb;

import android.gov.nist.core.Separators;
import ha.C3370m;
import id.AbstractC3557B;
import wd.C6182c0;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f31495a;

    /* renamed from: b  reason: collision with root package name */
    public final C3370m f31496b;

    public o0(String str, C3370m c3370m) {
        AbstractC3557B.c0("messageId", str);
        AbstractC3557B.c0("citation", c3370m);
        this.f31495a = str;
        this.f31496b = c3370m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (AbstractC3557B.K(this.f31495a, o0Var.f31495a) && AbstractC3557B.K(this.f31496b, o0Var.f31496b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31496b.hashCode() + (this.f31495a.hashCode() * 31);
    }

    public final String toString() {
        String a5 = C6182c0.a(this.f31495a);
        return "SelectedCitationState(messageId=" + a5 + ", citation=" + this.f31496b + Separators.RPAREN;
    }
}
