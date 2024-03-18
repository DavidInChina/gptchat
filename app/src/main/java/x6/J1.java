package x6;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class J1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49022a;

    public J1(long j6) {
        this.f49022a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof J1) && this.f49022a == ((J1) obj).f49022a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49022a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return android.gov.nist.core.a.m(new StringBuilder("LongTask(count="), this.f49022a, Separators.RPAREN);
    }
}
