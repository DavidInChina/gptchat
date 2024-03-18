package Ec;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class D implements F {

    /* renamed from: a  reason: collision with root package name */
    public final String f4603a;

    public D(String str) {
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        this.f4603a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof D) && AbstractC3557B.K(this.f4603a, ((D) obj).f4603a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4603a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Transcribed(text="), this.f4603a, Separators.RPAREN);
    }
}
