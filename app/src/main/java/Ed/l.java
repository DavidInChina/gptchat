package Ed;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class l {
    public static final k Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f4687a;

    public /* synthetic */ l(String str) {
        this.f4687a = str;
    }

    public static String a(String str) {
        return android.gov.nist.core.a.A("VoiceSessionId(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f4687a, ((l) obj).f4687a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4687a.hashCode();
    }

    public final String toString() {
        return a(this.f4687a);
    }
}
