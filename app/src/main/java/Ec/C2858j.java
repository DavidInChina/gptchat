package ec;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.v0;

/* renamed from: ec.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2858j implements AbstractC2860l {

    /* renamed from: a  reason: collision with root package name */
    public final v0 f29237a;

    public C2858j(v0 v0Var) {
        AbstractC3557B.c0("result", v0Var);
        this.f29237a = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2858j) && AbstractC3557B.K(this.f29237a, ((C2858j) obj).f29237a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29237a.hashCode();
    }

    public final String toString() {
        return "ShowDeleteAccountSnackbar(result=" + this.f29237a + Separators.RPAREN;
    }
}
