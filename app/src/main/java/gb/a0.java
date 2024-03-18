package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6182c0;

/* loaded from: classes2.dex */
public final class a0 implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f31384a;

    public a0(String str) {
        AbstractC3557B.c0("messageId", str);
        this.f31384a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        if (AbstractC3557B.K(this.f31384a, ((a0) obj).f31384a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31384a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("LogImpression(messageId=", C6182c0.a(this.f31384a), Separators.RPAREN);
    }
}
