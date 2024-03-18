package b9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: b9.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2138g extends AbstractC2139h {

    /* renamed from: Y  reason: collision with root package name */
    public final String f25664Y;

    public C2138g(String str) {
        this.f25664Y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2138g) && AbstractC3557B.K(this.f25664Y, ((C2138g) obj).f25664Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f25664Y;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return R.a.t(new StringBuilder("WebAuthFailed(description="), this.f25664Y, Separators.RPAREN);
    }
}
