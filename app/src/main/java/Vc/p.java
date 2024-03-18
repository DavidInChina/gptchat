package Vc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class p {
    public static final o Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f18558b = {new C2695d(u0.f28491a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final List f18559a;

    public p(List list) {
        AbstractC3557B.c0("cookieHeaders", list);
        this.f18559a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && AbstractC3557B.K(this.f18559a, ((p) obj).f18559a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18559a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("CookiePreferences(cookieHeaders="), this.f18559a, Separators.RPAREN);
    }

    public p(int i10, List list) {
        if ((i10 & 1) == 0) {
            this.f18559a = kf.v.f37483Y;
        } else {
            this.f18559a = list;
        }
    }
}
