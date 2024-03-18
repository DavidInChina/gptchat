package We;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import io.livekit.android.room.participant.Participant$Identity$Companion;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class m {
    public static final Participant$Identity$Companion Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f21040a;

    public /* synthetic */ m(String str) {
        this.f21040a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f21040a, ((m) obj).f21040a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f21040a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("Identity(value="), this.f21040a, ')');
    }
}
