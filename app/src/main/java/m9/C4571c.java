package m9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: m9.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4571c extends A7.b {

    /* renamed from: m  reason: collision with root package name */
    public final String f39000m;

    public C4571c(String str) {
        this.f39000m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4571c) && AbstractC3557B.K(this.f39000m, ((C4571c) obj).f39000m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39000m.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("OpenUrl(url="), this.f39000m, Separators.RPAREN);
    }
}
