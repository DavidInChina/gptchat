package ec;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.v0;

/* renamed from: ec.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2855g implements AbstractC2860l {

    /* renamed from: a  reason: collision with root package name */
    public final v0 f29234a;

    public C2855g(v0 v0Var) {
        AbstractC3557B.c0("result", v0Var);
        this.f29234a = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2855g) && AbstractC3557B.K(this.f29234a, ((C2855g) obj).f29234a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29234a.hashCode();
    }

    public final String toString() {
        return "ShowArchiveHistorySnackbar(result=" + this.f29234a + Separators.RPAREN;
    }
}
