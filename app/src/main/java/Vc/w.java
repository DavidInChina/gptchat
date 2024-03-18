package Vc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class w extends x {

    /* renamed from: a  reason: collision with root package name */
    public final Object f18565a;

    public w(Object obj) {
        this.f18565a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w) && AbstractC3557B.K(this.f18565a, ((w) obj).f18565a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f18565a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.f18565a + Separators.RPAREN;
    }
}
