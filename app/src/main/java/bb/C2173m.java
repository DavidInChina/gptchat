package bb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: bb.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2173m implements AbstractC2174n {

    /* renamed from: a  reason: collision with root package name */
    public final String f25871a;

    public C2173m(String str) {
        this.f25871a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2173m) && AbstractC3557B.K(this.f25871a, ((C2173m) obj).f25871a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f25871a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("StartConversation(prompt="), this.f25871a, Separators.RPAREN);
    }
}
