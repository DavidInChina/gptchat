package fa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class w extends AbstractC2965B {
    public static final v Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final String f30082b;

    public w(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f30082b = str;
        } else {
            R4.b.e2(i10, 1, u.f30081b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w) && AbstractC3557B.K(this.f30082b, ((w) obj).f30082b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30082b.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Spreadsheet(sandboxUrl="), this.f30082b, Separators.RPAREN);
    }

    public w(String str) {
        AbstractC3557B.c0("sandboxUrl", str);
        this.f30082b = str;
    }
}
