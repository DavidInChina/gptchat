package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class d1 implements h1 {
    public static final c1 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final wd.Y f13530a;

    public /* synthetic */ d1(wd.Y y10) {
        this.f13530a = y10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d1)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f13530a, ((d1) obj).f13530a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13530a.hashCode();
    }

    public final String toString() {
        return "Image(value=" + this.f13530a + Separators.RPAREN;
    }
}
