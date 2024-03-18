package Cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Cb.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0302l extends Throwable {
    public static final C0301k Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public final String f2953Y;

    public C0302l(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f2953Y = str;
        } else {
            R4.b.e2(i10, 1, C0300j.f2952b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0302l) && AbstractC3557B.K(this.f2953Y, ((C0302l) obj).f2953Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2953Y.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return R.a.t(new StringBuilder("ArkoseError(error="), this.f2953Y, Separators.RPAREN);
    }
}
