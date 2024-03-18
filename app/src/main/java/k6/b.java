package K6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final h f9486a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9487b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9488c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9489d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9490e;

    public b(h hVar, String str, String str2, String str3, String str4) {
        this.f9486a = hVar;
        this.f9487b = str;
        this.f9488c = str2;
        this.f9489d = str3;
        this.f9490e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3557B.K(this.f9486a, bVar.f9486a) && AbstractC3557B.K(this.f9487b, bVar.f9487b) && AbstractC3557B.K(this.f9488c, bVar.f9488c) && AbstractC3557B.K(this.f9489d, bVar.f9489d) && AbstractC3557B.K(this.f9490e, bVar.f9490e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        h hVar = this.f9486a;
        if (hVar == null) {
            i10 = 0;
        } else {
            i10 = hVar.hashCode();
        }
        int i15 = i10 * 31;
        String str = this.f9487b;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        String str2 = this.f9488c;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        String str3 = this.f9489d;
        if (str3 == null) {
            i13 = 0;
        } else {
            i13 = str3.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        String str4 = this.f9490e;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i18 + i14;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Client(simCarrier=");
        sb2.append(this.f9486a);
        sb2.append(", signalStrength=");
        sb2.append(this.f9487b);
        sb2.append(", downlinkKbps=");
        sb2.append(this.f9488c);
        sb2.append(", uplinkKbps=");
        sb2.append(this.f9489d);
        sb2.append(", connectivity=");
        return R.a.t(sb2, this.f9490e, Separators.RPAREN);
    }
}
