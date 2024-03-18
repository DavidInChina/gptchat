package ca;

import android.gov.nist.core.Separators;
import fa.C2969F;
import id.AbstractC3557B;

/* renamed from: ca.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2315g extends AbstractC2313e {

    /* renamed from: a  reason: collision with root package name */
    public final C2969F f26390a;

    public C2315g(C2969F c2969f) {
        this.f26390a = c2969f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2315g) && AbstractC3557B.K(this.f26390a, ((C2315g) obj).f26390a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26390a.hashCode();
    }

    public final String toString() {
        return "PlaceholderMessage(message=" + this.f26390a + Separators.RPAREN;
    }
}
