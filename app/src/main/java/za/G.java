package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2679E;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class G {
    public static final F Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f23457e = {null, null, null, new C2695d(C2679E.f28388a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f23458a;

    /* renamed from: b  reason: collision with root package name */
    public final long f23459b;

    /* renamed from: c  reason: collision with root package name */
    public final long f23460c;

    /* renamed from: d  reason: collision with root package name */
    public final List f23461d;

    public G(int i10, String str, long j6, long j10, List list) {
        if (15 == (i10 & 15)) {
            this.f23458a = str;
            this.f23459b = j6;
            this.f23460c = j10;
            this.f23461d = list;
            return;
        }
        R4.b.e2(i10, 15, E.f23450b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        if (AbstractC3557B.K(this.f23458a, g10.f23458a) && this.f23459b == g10.f23459b && this.f23460c == g10.f23460c && AbstractC3557B.K(this.f23461d, g10.f23461d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f23459b;
        long j10 = this.f23460c;
        return this.f23461d.hashCode() + (((((this.f23458a.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ApiGizmoAboutReviewStats(avg=" + this.f23458a + ", total=" + this.f23459b + ", count=" + this.f23460c + ", byRating=" + this.f23461d + Separators.RPAREN;
    }
}
