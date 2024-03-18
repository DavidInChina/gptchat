package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class B0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f48915a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48916b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48917c;

    /* renamed from: d  reason: collision with root package name */
    public final String f48918d;

    public B0(String str, String str2, String str3, String str4) {
        this.f48915a = str;
        this.f48916b = str2;
        this.f48917c = str3;
        this.f48918d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        if (AbstractC3557B.K(this.f48915a, b02.f48915a) && AbstractC3557B.K(this.f48916b, b02.f48916b) && AbstractC3557B.K(this.f48917c, b02.f48917c) && AbstractC3557B.K(this.f48918d, b02.f48918d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f48915a.hashCode() * 31;
        int i11 = 0;
        String str = this.f48916b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int v10 = E9.f.v(this.f48917c, (hashCode + i10) * 31, 31);
        String str2 = this.f48918d;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return v10 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LongTaskEventView(id=");
        sb2.append(this.f48915a);
        sb2.append(", referrer=");
        sb2.append(this.f48916b);
        sb2.append(", url=");
        sb2.append(this.f48917c);
        sb2.append(", name=");
        return R.a.t(sb2, this.f48918d, Separators.RPAREN);
    }
}
