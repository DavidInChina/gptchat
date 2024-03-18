package N0;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a  reason: collision with root package name */
    public final String f12490a;

    public G(String str) {
        this.f12490a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        if (AbstractC3557B.K(this.f12490a, ((G) obj).f12490a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12490a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("UrlAnnotation(url="), this.f12490a, ')');
    }
}
