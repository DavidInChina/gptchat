package ec;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.v0;

/* renamed from: ec.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2856h implements AbstractC2860l {

    /* renamed from: a  reason: collision with root package name */
    public final v0 f29235a;

    public C2856h(v0 v0Var) {
        AbstractC3557B.c0("result", v0Var);
        this.f29235a = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2856h) && AbstractC3557B.K(this.f29235a, ((C2856h) obj).f29235a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29235a.hashCode();
    }

    public final String toString() {
        return "ShowClearHistorySnackbar(result=" + this.f29235a + Separators.RPAREN;
    }
}
