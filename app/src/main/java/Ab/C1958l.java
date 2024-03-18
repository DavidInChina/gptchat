package ab;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ab.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1958l implements AbstractC1960n {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f24116a;

    public C1958l(Intent intent) {
        this.f24116a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1958l) && AbstractC3557B.K(this.f24116a, ((C1958l) obj).f24116a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24116a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f24116a + Separators.RPAREN;
    }
}
