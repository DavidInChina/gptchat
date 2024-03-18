package Wd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    public final String f20938a = "Wired Headset";

    @Override // Wd.h
    public final String a() {
        return this.f20938a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                if (!AbstractC3557B.K(this.f20938a, ((g) obj).f20938a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f20938a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return R.a.t(new StringBuilder("WiredHeadset(name="), this.f20938a, Separators.RPAREN);
    }
}
