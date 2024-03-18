package W8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f20821a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f20822b;

    public c(long j6, Long l10) {
        this.f20821a = j6;
        this.f20822b = l10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f20821a != cVar.f20821a || !AbstractC3557B.K(this.f20822b, cVar.f20822b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        long j6 = this.f20821a;
        int i11 = ((int) (j6 ^ (j6 >>> 32))) * 31;
        Long l10 = this.f20822b;
        if (l10 != null) {
            i10 = l10.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final String toString() {
        return "KronosTime(posixTimeMs=" + this.f20821a + ", timeSinceLastNtpSyncMs=" + this.f20822b + Separators.RPAREN;
    }
}
