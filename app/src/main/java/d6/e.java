package d6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f28029a;

    /* renamed from: b  reason: collision with root package name */
    public final long f28030b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28031c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28032d;

    /* renamed from: e  reason: collision with root package name */
    public final String f28033e;

    public e(int i10, long j6, String str, String str2, String str3) {
        this.f28029a = i10;
        this.f28030b = j6;
        this.f28031c = str;
        this.f28032d = str2;
        this.f28033e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f28029a == eVar.f28029a && this.f28030b == eVar.f28030b && AbstractC3557B.K(this.f28031c, eVar.f28031c) && AbstractC3557B.K(this.f28032d, eVar.f28032d) && AbstractC3557B.K(this.f28033e, eVar.f28033e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f28030b;
        return this.f28033e.hashCode() + E9.f.v(this.f28032d, E9.f.v(this.f28031c, ((this.f28029a * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NdkCrashLog(signal=");
        sb2.append(this.f28029a);
        sb2.append(", timestamp=");
        sb2.append(this.f28030b);
        sb2.append(", signalName=");
        sb2.append(this.f28031c);
        sb2.append(", message=");
        sb2.append(this.f28032d);
        sb2.append(", stacktrace=");
        return R.a.t(sb2, this.f28033e, Separators.RPAREN);
    }
}
