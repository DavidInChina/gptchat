package lc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6205s;

/* renamed from: lc.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4427z implements AbstractC4380D {

    /* renamed from: a  reason: collision with root package name */
    public final C6205s f38279a;

    public C4427z(C6205s c6205s) {
        AbstractC3557B.c0("accountUser", c6205s);
        this.f38279a = c6205s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4427z) && AbstractC3557B.K(this.f38279a, ((C4427z) obj).f38279a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38279a.hashCode();
    }

    public final String toString() {
        return "SwitchAccount(accountUser=" + this.f38279a + Separators.RPAREN;
    }
}
