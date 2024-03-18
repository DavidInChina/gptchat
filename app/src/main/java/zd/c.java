package zd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

@AbstractC1998i
/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f51959a;

    public c(int i10, boolean z10) {
        if ((i10 & 1) == 0) {
            this.f51959a = false;
        } else {
            this.f51959a = z10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.f51959a == ((c) obj).f51959a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f51959a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("BetaSettings(placeholder="), this.f51959a, Separators.RPAREN);
    }
}
