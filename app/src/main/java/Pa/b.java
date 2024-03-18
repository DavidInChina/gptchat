package Pa;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List f13891a;

    public b(List list) {
        AbstractC3557B.c0("suggestedReplies", list);
        this.f13891a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && AbstractC3557B.K(this.f13891a, ((b) obj).f13891a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13891a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("SuggestedReplies(suggestedReplies="), this.f13891a, Separators.RPAREN);
    }
}
