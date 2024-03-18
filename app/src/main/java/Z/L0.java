package Z;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1725n f22507a;

    public /* synthetic */ L0(AbstractC1725n abstractC1725n) {
        this.f22507a = abstractC1725n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L0)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f22507a, ((L0) obj).f22507a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22507a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f22507a + ')';
    }
}
