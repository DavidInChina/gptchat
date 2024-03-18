package na;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class V implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC4797v0 f39882a;

    public V(EnumC4797v0 enumC4797v0) {
        this.f39882a = enumC4797v0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof V) && this.f39882a == ((V) obj).f39882a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39882a.hashCode();
    }

    public final String toString() {
        return "UpdateScrollState(newState=" + this.f39882a + Separators.RPAREN;
    }
}
