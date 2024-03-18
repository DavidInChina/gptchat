package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.z0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6353z0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49488a;

    /* renamed from: b  reason: collision with root package name */
    public final long f49489b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f49490c;

    public C6353z0(String str, long j6, Boolean bool) {
        this.f49488a = str;
        this.f49489b = j6;
        this.f49490c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6353z0)) {
            return false;
        }
        C6353z0 c6353z0 = (C6353z0) obj;
        if (AbstractC3557B.K(this.f49488a, c6353z0.f49488a) && this.f49489b == c6353z0.f49489b && AbstractC3557B.K(this.f49490c, c6353z0.f49490c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f49488a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        long j6 = this.f49489b;
        int i12 = ((i10 * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        Boolean bool = this.f49490c;
        if (bool != null) {
            i11 = bool.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "LongTask(id=" + this.f49488a + ", duration=" + this.f49489b + ", isFrozenFrame=" + this.f49490c + Separators.RPAREN;
    }
}
