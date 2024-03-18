package N0;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class H extends F {

    /* renamed from: a  reason: collision with root package name */
    public final String f12491a;

    public H(String str) {
        this.f12491a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        if (AbstractC3557B.K(this.f12491a, ((H) obj).f12491a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12491a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f12491a, ')');
    }
}
