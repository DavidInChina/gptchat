package Cd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Cd.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329n implements AbstractC0330o {

    /* renamed from: a  reason: collision with root package name */
    public final Yg.p f3065a;

    public C0329n(Yg.p pVar) {
        this.f3065a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0329n) && AbstractC3557B.K(this.f3065a, ((C0329n) obj).f3065a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3065a.f22419Y.hashCode();
    }

    public final String toString() {
        return "StartService(startTime=" + this.f3065a + Separators.RPAREN;
    }
}
