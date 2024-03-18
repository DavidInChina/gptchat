package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* renamed from: x6.p1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6325p1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49414a;

    public C6325p1(String str) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f49414a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6325p1) && AbstractC3557B.K(this.f49414a, ((C6325p1) obj).f49414a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49414a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Application(id="), this.f49414a, Separators.RPAREN);
    }
}
