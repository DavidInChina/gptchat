package wd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class n0 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f48446a;

    public /* synthetic */ n0(Object obj) {
        this.f48446a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f48446a, ((n0) obj).f48446a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f48446a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.f48446a + Separators.RPAREN;
    }
}
