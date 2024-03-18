package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public final U f49090a;

    /* renamed from: b  reason: collision with root package name */
    public final N f49091b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49092c;

    public T(U u10, N n10, String str) {
        this.f49090a = u10;
        this.f49091b = n10;
        this.f49092c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        if (AbstractC3557B.K(this.f49090a, t10.f49090a) && AbstractC3557B.K(this.f49091b, t10.f49091b) && AbstractC3557B.K(this.f49092c, t10.f49092c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        U u10 = this.f49090a;
        if (u10 == null) {
            i10 = 0;
        } else {
            i10 = u10.hashCode();
        }
        int i13 = i10 * 31;
        N n10 = this.f49091b;
        if (n10 == null) {
            i11 = 0;
        } else {
            i11 = n10.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str = this.f49092c;
        if (str != null) {
            i12 = str.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Dd(session=");
        sb2.append(this.f49090a);
        sb2.append(", configuration=");
        sb2.append(this.f49091b);
        sb2.append(", browserSdkVersion=");
        return R.a.t(sb2, this.f49092c, Separators.RPAREN);
    }
}
