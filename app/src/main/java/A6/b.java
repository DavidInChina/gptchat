package A6;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f701a;

    /* renamed from: b  reason: collision with root package name */
    public final long f702b;

    /* renamed from: c  reason: collision with root package name */
    public final long f703c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f704d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f705e;

    /* renamed from: f  reason: collision with root package name */
    public final int f706f;

    public b(boolean z10, long j6, long j10, boolean z11, boolean z12, int i10) {
        this.f701a = z10;
        this.f702b = j6;
        this.f703c = j10;
        this.f704d = z11;
        this.f705e = z12;
        this.f706f = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f701a == bVar.f701a && this.f702b == bVar.f702b && this.f703c == bVar.f703c && this.f704d == bVar.f704d && this.f705e == bVar.f705e && this.f706f == bVar.f706f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1;
        boolean z10 = this.f701a;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        long j6 = this.f702b;
        long j10 = this.f703c;
        int i13 = ((((i11 * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        boolean z11 = this.f704d;
        if (z11) {
            z11 = true;
        }
        int i14 = z11 ? 1 : 0;
        int i15 = z11 ? 1 : 0;
        int i16 = (i13 + i14) * 31;
        boolean z12 = this.f705e;
        if (!z12) {
            i10 = z12 ? 1 : 0;
        }
        return ((i16 + i10) * 31) + this.f706f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TelemetryCoreConfiguration(trackErrors=");
        sb2.append(this.f701a);
        sb2.append(", batchSize=");
        sb2.append(this.f702b);
        sb2.append(", batchUploadFrequency=");
        sb2.append(this.f703c);
        sb2.append(", useProxy=");
        sb2.append(this.f704d);
        sb2.append(", useLocalEncryption=");
        sb2.append(this.f705e);
        sb2.append(", batchProcessingLevel=");
        return android.gov.nist.core.a.l(sb2, this.f706f, Separators.RPAREN);
    }
}
