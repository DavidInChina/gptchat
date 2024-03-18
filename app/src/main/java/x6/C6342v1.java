package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.v1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6342v1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49454a;

    public C6342v1(String str) {
        this.f49454a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6342v1) && AbstractC3557B.K(this.f49454a, ((C6342v1) obj).f49454a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49454a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ContainerView(id="), this.f49454a, Separators.RPAREN);
    }
}
