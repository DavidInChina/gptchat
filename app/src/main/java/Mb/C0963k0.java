package Mb;

import android.gov.nist.core.Separators;
import b5.C2127b;
import id.AbstractC3557B;

/* renamed from: Mb.k0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0963k0 implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final C2127b f11953a;

    public C0963k0(C2127b c2127b) {
        this.f11953a = c2127b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0963k0) && AbstractC3557B.K(this.f11953a, ((C0963k0) obj).f11953a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        C2127b c2127b = this.f11953a;
        if (c2127b == null) {
            return 0;
        }
        return c2127b.hashCode();
    }

    public final String toString() {
        return "ProtectAccountState(challenge=" + this.f11953a + Separators.RPAREN;
    }
}
