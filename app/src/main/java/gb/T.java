package gb;

import android.gov.nist.core.Separators;
import ha.C3370m;
import id.AbstractC3557B;
import wd.C6182c0;

/* loaded from: classes.dex */
public final class T implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f31373a;

    /* renamed from: b  reason: collision with root package name */
    public final C3370m f31374b;

    public T(String str, C3370m c3370m) {
        AbstractC3557B.c0("messageId", str);
        AbstractC3557B.c0("link", c3370m);
        this.f31373a = str;
        this.f31374b = c3370m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        if (AbstractC3557B.K(this.f31373a, t10.f31373a) && AbstractC3557B.K(this.f31374b, t10.f31374b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31374b.hashCode() + (this.f31373a.hashCode() * 31);
    }

    public final String toString() {
        String a5 = C6182c0.a(this.f31373a);
        return "CopyLink(messageId=" + a5 + ", link=" + this.f31374b + Separators.RPAREN;
    }
}
