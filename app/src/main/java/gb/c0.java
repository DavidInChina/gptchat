package gb;

import android.gov.nist.core.Separators;
import ha.C3370m;
import id.AbstractC3557B;
import wd.C6182c0;

/* loaded from: classes2.dex */
public final class c0 implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f31392a;

    /* renamed from: b  reason: collision with root package name */
    public final C3370m f31393b;

    public c0(String str, C3370m c3370m) {
        AbstractC3557B.c0("messageId", str);
        AbstractC3557B.c0("link", c3370m);
        this.f31392a = str;
        this.f31393b = c3370m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (AbstractC3557B.K(this.f31392a, c0Var.f31392a) && AbstractC3557B.K(this.f31393b, c0Var.f31393b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31393b.hashCode() + (this.f31392a.hashCode() * 31);
    }

    public final String toString() {
        String a5 = C6182c0.a(this.f31392a);
        return "OpenLink(messageId=" + a5 + ", link=" + this.f31393b + Separators.RPAREN;
    }
}
