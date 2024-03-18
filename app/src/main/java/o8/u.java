package o8;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final long f40984a;

    public u(long j6) {
        this.f40984a = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            if (this.f40984a == ((u) obj).f40984a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f40984a;
        return (((int) ((j6 >>> 32) ^ j6)) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return android.gov.nist.core.a.m(new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="), this.f40984a, ", webViewRequestMode=0}");
    }
}
