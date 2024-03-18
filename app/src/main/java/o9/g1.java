package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class g1 implements h1 {
    public static final f1 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13539a;

    public /* synthetic */ g1(String str) {
        this.f13539a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f13539a, ((g1) obj).f13539a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13539a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Text(value="), this.f13539a, Separators.RPAREN);
    }
}
