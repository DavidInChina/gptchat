package ca;

import aa.C1939b;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;

/* renamed from: ca.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2325q extends N {

    /* renamed from: g  reason: collision with root package name */
    public final C1939b f26412g;

    public C2325q(C1939b c1939b) {
        this.f26412g = c1939b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2325q) && AbstractC3557B.K(this.f26412g, ((C2325q) obj).f26412g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26412g.hashCode();
    }

    public final String toString() {
        return "CustomActionData(action=" + this.f26412g + Separators.RPAREN;
    }
}
