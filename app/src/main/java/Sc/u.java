package Sc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class u {
    public static final t Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final s f16554a;

    public u(int i10, s sVar) {
        if ((i10 & 1) == 0) {
            this.f16554a = null;
        } else {
            this.f16554a = sVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u) && AbstractC3557B.K(this.f16554a, ((u) obj).f16554a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        s sVar = this.f16554a;
        if (sVar == null) {
            return 0;
        }
        return sVar.hashCode();
    }

    public final String toString() {
        return "ProductFeatures(attachments=" + this.f16554a + Separators.RPAREN;
    }

    public u(s sVar) {
        this.f16554a = sVar;
    }
}
