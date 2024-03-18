package We;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import io.livekit.android.room.participant.Participant$Sid$Companion;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class n {
    public static final Participant$Sid$Companion Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f21041a;

    public /* synthetic */ n(String str) {
        this.f21041a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f21041a, ((n) obj).f21041a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f21041a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("Sid(value="), this.f21041a, ')');
    }
}
