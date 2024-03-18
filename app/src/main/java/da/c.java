package da;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.O;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class c implements e {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f28169a;

    public c(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f28169a = str;
        } else {
            R4.b.e2(i10, 1, C2612a.f28168b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        if (AbstractC3557B.K(this.f28169a, ((c) obj).f28169a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28169a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("ConversationGizmoRatingElement(gizmoId=", O.a(this.f28169a), Separators.RPAREN);
    }

    public c(String str) {
        AbstractC3557B.c0("gizmoId", str);
        this.f28169a = str;
    }
}
