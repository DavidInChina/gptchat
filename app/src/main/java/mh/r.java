package mh;

import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final float f39501a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public final float f39502b;

    public r(float f6) {
        this.f39502b = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Float.compare(this.f39501a, rVar.f39501a) == 0 && Float.compare(this.f39502b, rVar.f39502b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f39502b) + (Float.floatToIntBits(this.f39501a) * 31);
    }

    public final String toString() {
        return "ZoomRange(minZoomAsRatioOfBaseZoom=" + this.f39501a + ", maxZoomAsRatioOfSize=" + this.f39502b + Separators.RPAREN;
    }
}
