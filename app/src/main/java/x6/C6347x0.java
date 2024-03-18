package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.x0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6347x0 {

    /* renamed from: a  reason: collision with root package name */
    public final G0 f49470a;

    public C6347x0(G0 g02) {
        this.f49470a = g02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6347x0) && AbstractC3557B.K(this.f49470a, ((C6347x0) obj).f49470a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        G0 g02 = this.f49470a;
        if (g02 == null) {
            return 0;
        }
        return g02.hashCode();
    }

    public final String toString() {
        return "Display(viewport=" + this.f49470a + Separators.RPAREN;
    }
}
