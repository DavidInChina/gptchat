package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* renamed from: x6.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6315m0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49378a;

    public C6315m0(String str) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f49378a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6315m0) && AbstractC3557B.K(this.f49378a, ((C6315m0) obj).f49378a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49378a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Application(id="), this.f49378a, Separators.RPAREN);
    }
}
