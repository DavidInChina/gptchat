package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import o8.AbstractC4949b;

/* loaded from: classes.dex */
public final class W extends Y {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4949b f11862a;

    public W(AbstractC4949b abstractC4949b) {
        AbstractC3557B.c0("tokenResponse", abstractC4949b);
        this.f11862a = abstractC4949b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof W) && AbstractC3557B.K(this.f11862a, ((W) obj).f11862a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11862a.hashCode();
    }

    public final String toString() {
        return "ShowIntegrityRemediation(tokenResponse=" + this.f11862a + Separators.RPAREN;
    }
}
