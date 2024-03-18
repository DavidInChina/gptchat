package ac;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ac.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1970c extends AbstractC1971d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f24148a;

    public C1970c(Intent intent) {
        this.f24148a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1970c) && AbstractC3557B.K(this.f24148a, ((C1970c) obj).f24148a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24148a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f24148a + Separators.RPAREN;
    }
}
