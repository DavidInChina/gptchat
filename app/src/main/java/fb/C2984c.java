package fb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: fb.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2984c implements AbstractC2985d {

    /* renamed from: a  reason: collision with root package name */
    public final String f30088a;

    public C2984c(String str) {
        AbstractC3557B.c0("url", str);
        this.f30088a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2984c) && AbstractC3557B.K(this.f30088a, ((C2984c) obj).f30088a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30088a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("OpenUrl(url="), this.f30088a, Separators.RPAREN);
    }
}
