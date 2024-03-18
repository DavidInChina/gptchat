package L9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: L9.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0906l implements AbstractC0905k {

    /* renamed from: a  reason: collision with root package name */
    public final IllegalArgumentException f10940a;

    public C0906l(IllegalArgumentException illegalArgumentException) {
        this.f10940a = illegalArgumentException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0906l) && AbstractC3557B.K(this.f10940a, ((C0906l) obj).f10940a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10940a.hashCode();
    }

    public final String toString() {
        return "ConversationStreamDecodingError(cause=" + this.f10940a + Separators.RPAREN;
    }
}
