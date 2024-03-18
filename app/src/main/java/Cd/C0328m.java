package Cd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* renamed from: Cd.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328m implements AbstractC0330o {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f3064a;

    public C0328m(q0 q0Var) {
        this.f3064a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0328m) && AbstractC3557B.K(this.f3064a, ((C0328m) obj).f3064a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3064a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f3064a, Separators.RPAREN);
    }
}
