package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Mb.q0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0975q0 implements AbstractC0976r0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11972a;

    public C0975q0(String str) {
        AbstractC3557B.c0("error", str);
        this.f11972a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0975q0) && AbstractC3557B.K(this.f11972a, ((C0975q0) obj).f11972a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11972a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ShowError(error="), this.f11972a, Separators.RPAREN);
    }
}
