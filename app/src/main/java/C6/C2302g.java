package c6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: c6.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2302g {

    /* renamed from: a  reason: collision with root package name */
    public final String f26304a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26305b;

    public C2302g(String str, String str2) {
        this.f26304a = str;
        this.f26305b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2302g)) {
            return false;
        }
        C2302g c2302g = (C2302g) obj;
        if (AbstractC3557B.K(this.f26304a, c2302g.f26304a) && AbstractC3557B.K(this.f26305b, c2302g.f26305b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f26304a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f26305b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimCarrier(id=");
        sb2.append(this.f26304a);
        sb2.append(", name=");
        return R.a.t(sb2, this.f26305b, Separators.RPAREN);
    }
}
