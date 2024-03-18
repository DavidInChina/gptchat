package oh;

import E0.j0;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import q0.C5251c;
import q0.C5254f;

/* loaded from: classes.dex */
public final class l implements mh.w {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f41425a;

    /* renamed from: b  reason: collision with root package name */
    public final long f41426b;

    /* renamed from: c  reason: collision with root package name */
    public final C5024k f41427c;

    /* renamed from: d  reason: collision with root package name */
    public final long f41428d;

    /* renamed from: e  reason: collision with root package name */
    public final C5251c f41429e;

    /* renamed from: f  reason: collision with root package name */
    public final long f41430f;

    /* renamed from: g  reason: collision with root package name */
    public final float f41431g = 0.0f;

    public l(boolean z10, long j6, C5024k c5024k, long j10, C5251c c5251c, long j11) {
        this.f41425a = z10;
        this.f41426b = j6;
        this.f41427c = c5024k;
        this.f41428d = j10;
        this.f41429e = c5251c;
        this.f41430f = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f41425a != lVar.f41425a) {
            return false;
        }
        int i10 = j0.f4070b;
        if (this.f41426b == lVar.f41426b && AbstractC3557B.K(this.f41427c, lVar.f41427c) && C5251c.b(this.f41428d, lVar.f41428d) && AbstractC3557B.K(this.f41429e, lVar.f41429e) && C5254f.a(this.f41430f, lVar.f41430f) && Float.compare(this.f41431g, lVar.f41431g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        if (this.f41425a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = j0.f4070b;
        long j6 = this.f41426b;
        int hashCode = this.f41427c.hashCode();
        int f6 = C5251c.f(this.f41428d);
        int i13 = (f6 + ((hashCode + ((((int) (j6 ^ (j6 >>> 32))) + (i10 * 31)) * 31)) * 31)) * 31;
        C5251c c5251c = this.f41429e;
        if (c5251c == null) {
            i11 = 0;
        } else {
            i11 = C5251c.f(c5251c.f43623a);
        }
        int e10 = C5254f.e(this.f41430f);
        return Float.floatToIntBits(this.f41431g) + ((e10 + ((i13 + i11) * 31)) * 31);
    }

    public final String toString() {
        String c10 = j0.c(this.f41426b);
        String j6 = C5251c.j(this.f41428d);
        String g10 = C5254f.g(this.f41430f);
        return "RealZoomableContentTransformation(isSpecified=" + this.f41425a + ", scale=" + c10 + ", scaleMetadata=" + this.f41427c + ", offset=" + j6 + ", centroid=" + this.f41429e + ", contentSize=" + g10 + ", rotationZ=" + this.f41431g + Separators.RPAREN;
    }
}
