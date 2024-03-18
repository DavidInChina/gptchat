package kb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6209w;

/* renamed from: kb.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4226k implements AbstractC4232q {

    /* renamed from: a  reason: collision with root package name */
    public final String f37258a;

    public C4226k(String str) {
        this.f37258a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4226k)) {
            return false;
        }
        if (AbstractC3557B.K(this.f37258a, ((C4226k) obj).f37258a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37258a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("ImageDownload(image=", C6209w.a(this.f37258a), Separators.RPAREN);
    }
}
