package ec;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.v0;

/* renamed from: ec.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2857i implements AbstractC2860l {

    /* renamed from: a  reason: collision with root package name */
    public final v0 f29236a;

    public C2857i(v0 v0Var) {
        AbstractC3557B.c0("result", v0Var);
        this.f29236a = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2857i) && AbstractC3557B.K(this.f29236a, ((C2857i) obj).f29236a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29236a.hashCode();
    }

    public final String toString() {
        return "ShowDataExportSnackbar(result=" + this.f29236a + Separators.RPAREN;
    }
}
