package Ga;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Ga.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621d {
    public static final C0620c Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f6207a;

    public C0621d(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f6207a = str;
        } else {
            R4.b.e2(i10, 1, C0619b.f6206b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0621d) && AbstractC3557B.K(this.f6207a, ((C0621d) obj).f6207a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6207a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("BotToken(playIntegrityToken="), this.f6207a, Separators.RPAREN);
    }

    public C0621d(String str) {
        this.f6207a = str;
    }
}
