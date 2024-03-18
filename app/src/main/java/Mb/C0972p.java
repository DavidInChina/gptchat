package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Mb.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0972p implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final wd.o0 f11970a;

    public C0972p(wd.o0 o0Var) {
        this.f11970a = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0972p) && AbstractC3557B.K(this.f11970a, ((C0972p) obj).f11970a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        wd.o0 o0Var = this.f11970a;
        if (o0Var == null) {
            return 0;
        }
        return o0Var.hashCode();
    }

    public final String toString() {
        return "CreateAccountState(progress=" + this.f11970a + Separators.RPAREN;
    }
}
