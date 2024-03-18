package mh;

import android.gov.nist.core.Separators;
import q0.C5251c;
import q0.C5254f;
import y.AbstractC6463a;

/* renamed from: mh.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4674d {

    /* renamed from: a  reason: collision with root package name */
    public final long f39437a;

    /* renamed from: b  reason: collision with root package name */
    public final float f39438b;

    /* renamed from: c  reason: collision with root package name */
    public final long f39439c;

    /* renamed from: d  reason: collision with root package name */
    public final long f39440d;

    public C4674d(long j6, float f6, long j10, long j11) {
        this.f39437a = j6;
        this.f39438b = f6;
        this.f39439c = j10;
        this.f39440d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4674d)) {
            return false;
        }
        C4674d c4674d = (C4674d) obj;
        if (C5251c.b(this.f39437a, c4674d.f39437a) && Float.compare(this.f39438b, c4674d.f39438b) == 0 && C5251c.b(this.f39439c, c4674d.f39439c) && C5254f.a(this.f39440d, c4674d.f39440d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int e10 = AbstractC6463a.e(this.f39438b, C5251c.f(this.f39437a) * 31, 31);
        return C5254f.e(this.f39440d) + ((C5251c.f(this.f39439c) + e10) * 31);
    }

    public final String toString() {
        String j6 = C5251c.j(this.f39439c);
        String g10 = C5254f.g(this.f39440d);
        StringBuilder t10 = android.gov.nist.core.a.t("GestureState(offset=", C5251c.j(this.f39437a), ", userZoomFactor=", "UserZoomFactor(value=" + this.f39438b + Separators.RPAREN, ", lastCentroid=");
        t10.append(j6);
        t10.append(", contentSize=");
        t10.append(g10);
        t10.append(Separators.RPAREN);
        return t10.toString();
    }
}
