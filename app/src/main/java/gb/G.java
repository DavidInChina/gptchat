package gb;

import Jc.AbstractC0809c;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class G implements L {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0809c f31362a;

    static {
        int i10 = AbstractC0809c.f9045Y;
    }

    public G(AbstractC0809c abstractC0809c) {
        AbstractC3557B.c0("error", abstractC0809c);
        this.f31362a = abstractC0809c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof G) && AbstractC3557B.K(this.f31362a, ((G) obj).f31362a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31362a.hashCode();
    }

    public final String toString() {
        return "DownloadError(error=" + this.f31362a + Separators.RPAREN;
    }
}
