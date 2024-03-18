package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6209w;

/* loaded from: classes.dex */
public final class Y implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f31380a;

    public Y(String str) {
        AbstractC3557B.c0("image", str);
        this.f31380a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        if (AbstractC3557B.K(this.f31380a, ((Y) obj).f31380a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31380a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("ImageDownload(image=", C6209w.a(this.f31380a), Separators.RPAREN);
    }
}
