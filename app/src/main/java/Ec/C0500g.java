package Ec;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* renamed from: Ec.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0500g implements AbstractC0501h {

    /* renamed from: a  reason: collision with root package name */
    public final String f4621a;

    public C0500g(String str) {
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        this.f4621a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0500g) && AbstractC3557B.K(this.f4621a, ((C0500g) obj).f4621a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4621a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Transcribed(text="), this.f4621a, Separators.RPAREN);
    }
}
