package ic;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import jc.C3942j;

/* loaded from: classes.dex */
public final class I implements O {

    /* renamed from: a  reason: collision with root package name */
    public final C3942j f32956a;

    public I(C3942j c3942j) {
        AbstractC3557B.c0("memory", c3942j);
        this.f32956a = c3942j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof I) && AbstractC3557B.K(this.f32956a, ((I) obj).f32956a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32956a.hashCode();
    }

    public final String toString() {
        return "OnDelete(memory=" + this.f32956a + Separators.RPAREN;
    }
}
