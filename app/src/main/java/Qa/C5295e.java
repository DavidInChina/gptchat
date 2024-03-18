package qa;

import Ad.s;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.o0;

/* renamed from: qa.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5295e implements s {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f44027a;

    public C5295e(o0 o0Var) {
        this.f44027a = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5295e) && AbstractC3557B.K(this.f44027a, ((C5295e) obj).f44027a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44027a.hashCode();
    }

    public final String toString() {
        return "DisclosureState(content=" + this.f44027a + Separators.RPAREN;
    }
}
