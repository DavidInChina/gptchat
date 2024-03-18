package oh;

import E0.j0;
import android.gov.nist.core.Separators;

/* renamed from: oh.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5024k {

    /* renamed from: a  reason: collision with root package name */
    public final long f41423a;

    /* renamed from: b  reason: collision with root package name */
    public final float f41424b;

    public C5024k(long j6, float f6) {
        this.f41423a = j6;
        this.f41424b = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5024k)) {
            return false;
        }
        C5024k c5024k = (C5024k) obj;
        long j6 = c5024k.f41423a;
        int i10 = j0.f4070b;
        if (this.f41423a == j6 && Float.compare(this.f41424b, c5024k.f41424b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = j0.f4070b;
        long j6 = this.f41423a;
        return Float.floatToIntBits(this.f41424b) + (((int) (j6 ^ (j6 >>> 32))) * 31);
    }

    public final String toString() {
        String c10 = j0.c(this.f41423a);
        return "ScaleMetadata(initialScale=" + c10 + ", userZoom=" + this.f41424b + Separators.RPAREN;
    }
}
