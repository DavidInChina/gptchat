package wd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class u0 extends v0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f48468a;

    public u0(Object obj) {
        this.f48468a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u0) && AbstractC3557B.K(this.f48468a, ((u0) obj).f48468a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f48468a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.f48468a + Separators.RPAREN;
    }
}
