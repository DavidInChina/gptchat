package k7;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.statsig.androidsdk.ErrorBoundaryKt;
import s3.z;

/* renamed from: k7.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4200a {

    /* renamed from: f  reason: collision with root package name */
    public static final C4200a f37166f;

    /* renamed from: a  reason: collision with root package name */
    public final long f37167a;

    /* renamed from: b  reason: collision with root package name */
    public final int f37168b;

    /* renamed from: c  reason: collision with root package name */
    public final int f37169c;

    /* renamed from: d  reason: collision with root package name */
    public final long f37170d;

    /* renamed from: e  reason: collision with root package name */
    public final int f37171e;

    static {
        String str;
        z zVar = new z(4);
        zVar.f45394a = 10485760L;
        zVar.f45395b = Integer.valueOf((int) RCHTTPStatusCodes.SUCCESS);
        zVar.f45396c = Integer.valueOf((int) ErrorBoundaryKt.SAMPLING_RATE);
        zVar.f45397d = 604800000L;
        zVar.f45398e = 81920;
        if (((Long) zVar.f45394a) == null) {
            str = " maxStorageSizeInBytes";
        } else {
            str = "";
        }
        if (((Integer) zVar.f45395b) == null) {
            str = str.concat(" loadBatchSize");
        }
        if (((Integer) zVar.f45396c) == null) {
            str = android.gov.nist.core.a.g(str, " criticalSectionEnterTimeoutMs");
        }
        if (((Long) zVar.f45397d) == null) {
            str = android.gov.nist.core.a.g(str, " eventCleanUpAge");
        }
        if (((Integer) zVar.f45398e) == null) {
            str = android.gov.nist.core.a.g(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f37166f = new C4200a(((Long) zVar.f45394a).longValue(), ((Integer) zVar.f45395b).intValue(), ((Integer) zVar.f45396c).intValue(), ((Long) zVar.f45397d).longValue(), ((Integer) zVar.f45398e).intValue());
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public C4200a(long j6, int i10, int i11, long j10, int i12) {
        this.f37167a = j6;
        this.f37168b = i10;
        this.f37169c = i11;
        this.f37170d = j10;
        this.f37171e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4200a)) {
            return false;
        }
        C4200a c4200a = (C4200a) obj;
        if (this.f37167a == c4200a.f37167a && this.f37168b == c4200a.f37168b && this.f37169c == c4200a.f37169c && this.f37170d == c4200a.f37170d && this.f37171e == c4200a.f37171e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f37167a;
        long j10 = this.f37170d;
        return ((((((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f37168b) * 1000003) ^ this.f37169c) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f37171e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f37167a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f37168b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f37169c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f37170d);
        sb2.append(", maxBlobByteSizePerRow=");
        return android.gov.nist.core.a.l(sb2, this.f37171e, "}");
    }
}
