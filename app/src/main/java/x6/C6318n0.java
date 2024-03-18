package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.n0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6318n0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49382a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49383b;

    public C6318n0(String str, String str2) {
        this.f49382a = str;
        this.f49383b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6318n0)) {
            return false;
        }
        C6318n0 c6318n0 = (C6318n0) obj;
        if (AbstractC3557B.K(this.f49382a, c6318n0.f49382a) && AbstractC3557B.K(this.f49383b, c6318n0.f49383b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f49382a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f49383b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cellular(technology=");
        sb2.append(this.f49382a);
        sb2.append(", carrierName=");
        return R.a.t(sb2, this.f49383b, Separators.RPAREN);
    }
}
