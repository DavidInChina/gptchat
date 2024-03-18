package ab;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ab.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1961o implements AbstractC1964r {

    /* renamed from: a  reason: collision with root package name */
    public final String f24118a;

    public C1961o(String str) {
        AbstractC3557B.c0("actionId", str);
        this.f24118a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1961o) && AbstractC3557B.K(this.f24118a, ((C1961o) obj).f24118a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24118a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("AccountLogout(actionId="), this.f24118a, Separators.RPAREN);
    }
}
