package oh;

import Z.C1724m0;
import Z.o1;
import android.gov.nist.core.Separators;
import nf.AbstractC4828h;
import q0.C5254f;

/* renamed from: oh.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5020g {

    /* renamed from: a  reason: collision with root package name */
    public final long f41418a;

    /* renamed from: b  reason: collision with root package name */
    public final C1724m0 f41419b = AbstractC4828h.Z(null, o1.f22665a);

    public C5020g(long j6) {
        this.f41418a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5020g) && C5254f.a(this.f41418a, ((C5020g) obj).f41418a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C5254f.e(this.f41418a);
    }

    public final String toString() {
        return android.gov.nist.core.a.A("PlaceholderBoundsProvider(contentSize=", C5254f.g(this.f41418a), Separators.RPAREN);
    }
}
