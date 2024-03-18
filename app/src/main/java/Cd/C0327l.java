package Cd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Cd.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327l implements AbstractC0330o {

    /* renamed from: a  reason: collision with root package name */
    public final Ed.m f3063a;

    public C0327l(Ed.m mVar) {
        this.f3063a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0327l) && AbstractC3557B.K(this.f3063a, ((C0327l) obj).f3063a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Ed.m mVar = this.f3063a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    public final String toString() {
        return "SessionDismissed(sessionInformation=" + this.f3063a + Separators.RPAREN;
    }
}
