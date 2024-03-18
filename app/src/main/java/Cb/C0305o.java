package Cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Cb.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0305o {
    public static final C0304n Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final C0302l f2956a;

    public C0305o(int i10, C0302l c0302l) {
        if (1 == (i10 & 1)) {
            this.f2956a = c0302l;
        } else {
            R4.b.e2(i10, 1, C0303m.f2955b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0305o) && AbstractC3557B.K(this.f2956a, ((C0305o) obj).f2956a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2956a.f2953Y.hashCode();
    }

    public final String toString() {
        return "ArkoseErrorResponse(error=" + this.f2956a + Separators.RPAREN;
    }
}
