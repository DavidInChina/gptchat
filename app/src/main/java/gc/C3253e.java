package gc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: gc.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3253e implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f31554a;

    public C3253e(String str) {
        AbstractC3557B.c0("filter", str);
        this.f31554a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3253e) && AbstractC3557B.K(this.f31554a, ((C3253e) obj).f31554a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31554a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("UpdateFilter(filter="), this.f31554a, Separators.RPAREN);
    }
}
