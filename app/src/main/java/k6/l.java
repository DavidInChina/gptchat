package K6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f9517a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9518b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9519c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9520d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9521e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9522f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9523g;

    /* renamed from: h  reason: collision with root package name */
    public final long f9524h;

    /* renamed from: i  reason: collision with root package name */
    public final long f9525i;

    /* renamed from: j  reason: collision with root package name */
    public final e f9526j;

    /* renamed from: k  reason: collision with root package name */
    public final d f9527k;

    public l(String str, String str2, String str3, String str4, String str5, String str6, long j6, long j10, long j11, e eVar, d dVar) {
        this.f9517a = str;
        this.f9518b = str2;
        this.f9519c = str3;
        this.f9520d = str4;
        this.f9521e = str5;
        this.f9522f = str6;
        this.f9523g = j6;
        this.f9524h = j10;
        this.f9525i = j11;
        this.f9526j = eVar;
        this.f9527k = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3557B.K(this.f9517a, lVar.f9517a) && AbstractC3557B.K(this.f9518b, lVar.f9518b) && AbstractC3557B.K(this.f9519c, lVar.f9519c) && AbstractC3557B.K(this.f9520d, lVar.f9520d) && AbstractC3557B.K(this.f9521e, lVar.f9521e) && AbstractC3557B.K(this.f9522f, lVar.f9522f) && this.f9523g == lVar.f9523g && this.f9524h == lVar.f9524h && this.f9525i == lVar.f9525i && AbstractC3557B.K(this.f9526j, lVar.f9526j) && AbstractC3557B.K(this.f9527k, lVar.f9527k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = E9.f.v(this.f9522f, E9.f.v(this.f9521e, E9.f.v(this.f9520d, E9.f.v(this.f9519c, E9.f.v(this.f9518b, this.f9517a.hashCode() * 31, 31), 31), 31), 31), 31);
        long j6 = this.f9523g;
        long j10 = this.f9524h;
        long j11 = this.f9525i;
        int hashCode = this.f9526j.hashCode();
        return this.f9527k.hashCode() + ((hashCode + ((((((v10 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SpanEvent(traceId=" + this.f9517a + ", spanId=" + this.f9518b + ", parentId=" + this.f9519c + ", resource=" + this.f9520d + ", name=" + this.f9521e + ", service=" + this.f9522f + ", duration=" + this.f9523g + ", start=" + this.f9524h + ", error=" + this.f9525i + ", metrics=" + this.f9526j + ", meta=" + this.f9527k + Separators.RPAREN;
    }
}
