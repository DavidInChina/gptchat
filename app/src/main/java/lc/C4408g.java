package lc;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: lc.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4408g implements AbstractC4411j {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f38261a;

    public C4408g(Intent intent) {
        this.f38261a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4408g) && AbstractC3557B.K(this.f38261a, ((C4408g) obj).f38261a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38261a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f38261a + Separators.RPAREN;
    }
}
