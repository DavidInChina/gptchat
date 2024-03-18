package la;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: la.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4357a implements AbstractC4358b {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f37897a;

    public C4357a(Intent intent) {
        this.f37897a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4357a) && AbstractC3557B.K(this.f37897a, ((C4357a) obj).f37897a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37897a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f37897a + Separators.RPAREN;
    }
}
