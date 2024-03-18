package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class A implements F {

    /* renamed from: a  reason: collision with root package name */
    public final Yg.r f11754a;

    public A(Yg.r rVar) {
        AbstractC3557B.c0("value", rVar);
        this.f11754a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof A) && AbstractC3557B.K(this.f11754a, ((A) obj).f11754a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11754a.f22420Y.hashCode();
    }

    public final String toString() {
        return "UpdateBirthday(value=" + this.f11754a + Separators.RPAREN;
    }
}
