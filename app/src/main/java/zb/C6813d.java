package zb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: zb.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6813d {
    public static final C6812c Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f51814a;

    public C6813d(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f51814a = str;
        } else {
            R4.b.e2(i10, 1, C6811b.f51813b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6813d) && AbstractC3557B.K(this.f51814a, ((C6813d) obj).f51814a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f51814a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("AipResponse(redirectPath="), this.f51814a, Separators.RPAREN);
    }
}
