package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Mb.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0955g0 implements AbstractC0957h0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11941a;

    public C0955g0(String str) {
        AbstractC3557B.c0("error", str);
        this.f11941a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0955g0) && AbstractC3557B.K(this.f11941a, ((C0955g0) obj).f11941a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11941a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ShowError(error="), this.f11941a, Separators.RPAREN);
    }
}
