package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* renamed from: x6.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6293f {

    /* renamed from: a  reason: collision with root package name */
    public final String f49292a;

    public C6293f(String str) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f49292a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6293f) && AbstractC3557B.K(this.f49292a, ((C6293f) obj).f49292a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49292a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Application(id="), this.f49292a, Separators.RPAREN);
    }
}
