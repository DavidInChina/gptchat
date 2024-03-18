package ca;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;

/* renamed from: ca.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2330v extends N {

    /* renamed from: g  reason: collision with root package name */
    public final String f26422g;

    public C2330v(String str) {
        AbstractC3557B.c0("sandboxUrl", str);
        this.f26422g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2330v) && AbstractC3557B.K(this.f26422g, ((C2330v) obj).f26422g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26422g.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Spreadsheet(sandboxUrl="), this.f26422g, Separators.RPAREN);
    }
}
