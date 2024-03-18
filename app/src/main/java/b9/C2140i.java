package b9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: b9.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2140i implements m {

    /* renamed from: a  reason: collision with root package name */
    public final String f25665a;

    public C2140i(String str) {
        AbstractC3557B.c0("token", str);
        this.f25665a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2140i) && AbstractC3557B.K(this.f25665a, ((C2140i) obj).f25665a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25665a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Authenticated(token="), this.f25665a, Separators.RPAREN);
    }
}
