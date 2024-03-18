package ca;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;

/* renamed from: ca.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2329u extends N {

    /* renamed from: g  reason: collision with root package name */
    public final String f26421g;

    public C2329u(String str) {
        this.f26421g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2329u) && AbstractC3557B.K(this.f26421g, ((C2329u) obj).f26421g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f26421g;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Python(code="), this.f26421g, Separators.RPAREN);
    }
}
