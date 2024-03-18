package kb;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: kb.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4221f implements AbstractC4224i {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f37255a;

    public C4221f(Intent intent) {
        this.f37255a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4221f) && AbstractC3557B.K(this.f37255a, ((C4221f) obj).f37255a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37255a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f37255a + Separators.RPAREN;
    }
}
