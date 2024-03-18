package Ve;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import io.livekit.android.room.Room$Sid$Companion;

@AbstractC1998i
/* renamed from: Ve.j0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1505j0 {
    public static final Room$Sid$Companion Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f18804a;

    public /* synthetic */ C1505j0(String str) {
        this.f18804a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1505j0)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f18804a, ((C1505j0) obj).f18804a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18804a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("Sid(sid="), this.f18804a, ')');
    }
}
