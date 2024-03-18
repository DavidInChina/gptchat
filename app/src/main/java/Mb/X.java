package Mb;

import android.gov.nist.core.Separators;
import b9.EnumC2132a;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class X extends Y {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC2132a f11868a;

    public X(EnumC2132a enumC2132a) {
        AbstractC3557B.c0("provider", enumC2132a);
        this.f11868a = enumC2132a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof X) && this.f11868a == ((X) obj).f11868a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11868a.hashCode();
    }

    public final String toString() {
        return "StartAuth0(provider=" + this.f11868a + Separators.RPAREN;
    }
}
