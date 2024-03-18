package hb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class w extends y {

    /* renamed from: a  reason: collision with root package name */
    public final String f32139a;

    public w(String str) {
        this.f32139a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w) && AbstractC3557B.K(this.f32139a, ((w) obj).f32139a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32139a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Error(message="), this.f32139a, Separators.RPAREN);
    }
}
