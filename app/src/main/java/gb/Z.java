package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6209w;

/* loaded from: classes.dex */
public final class Z implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f31381a;

    public Z(String str) {
        AbstractC3557B.c0("image", str);
        this.f31381a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        if (AbstractC3557B.K(this.f31381a, ((Z) obj).f31381a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31381a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("ImageShare(image=", C6209w.a(this.f31381a), Separators.RPAREN);
    }
}
