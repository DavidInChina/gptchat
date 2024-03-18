package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class O1 {

    /* renamed from: a  reason: collision with root package name */
    public final Long f49057a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f49058b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f49059c;

    public O1(Long l10, Long l11, Long l12) {
        this.f49057a = l10;
        this.f49058b = l11;
        this.f49059c = l12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O1)) {
            return false;
        }
        O1 o12 = (O1) obj;
        if (AbstractC3557B.K(this.f49057a, o12.f49057a) && AbstractC3557B.K(this.f49058b, o12.f49058b) && AbstractC3557B.K(this.f49059c, o12.f49059c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        Long l10 = this.f49057a;
        if (l10 == null) {
            i10 = 0;
        } else {
            i10 = l10.hashCode();
        }
        int i13 = i10 * 31;
        Long l11 = this.f49058b;
        if (l11 == null) {
            i11 = 0;
        } else {
            i11 = l11.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        Long l12 = this.f49059c;
        if (l12 != null) {
            i12 = l12.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "ReplayStats(recordsCount=" + this.f49057a + ", segmentsCount=" + this.f49058b + ", segmentsTotalRawSize=" + this.f49059c + Separators.RPAREN;
    }
}
