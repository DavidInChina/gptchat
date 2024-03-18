package oh;

import android.gov.nist.core.Separators;
import q0.C5251c;

/* renamed from: oh.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5022i implements AbstractC5023j {

    /* renamed from: a  reason: collision with root package name */
    public final long f41421a;

    /* renamed from: b  reason: collision with root package name */
    public final float f41422b;

    public C5022i(long j6, float f6) {
        this.f41421a = j6;
        this.f41422b = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5022i)) {
            return false;
        }
        C5022i c5022i = (C5022i) obj;
        if (C5251c.b(this.f41421a, c5022i.f41421a) && Float.compare(this.f41422b, c5022i.f41422b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f41422b) + (C5251c.f(this.f41421a) * 31);
    }

    public final String toString() {
        String j6 = C5251c.j(this.f41421a);
        return "Zooming(centroid=" + j6 + ", zoomDelta=" + this.f41422b + Separators.RPAREN;
    }
}
