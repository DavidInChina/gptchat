package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.s0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6332s0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49434a;

    public C6332s0(String str) {
        this.f49434a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6332s0) && AbstractC3557B.K(this.f49434a, ((C6332s0) obj).f49434a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49434a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ContainerView(id="), this.f49434a, Separators.RPAREN);
    }
}
