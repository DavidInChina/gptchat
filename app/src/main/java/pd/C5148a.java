package pd;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: pd.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5148a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f43056a;

    public C5148a(Intent intent) {
        this.f43056a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5148a) && AbstractC3557B.K(this.f43056a, ((C5148a) obj).f43056a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.f43056a;
        if (intent == null) {
            return 0;
        }
        return intent.hashCode();
    }

    public final String toString() {
        return "DeepLink(intent=" + this.f43056a + Separators.RPAREN;
    }
}
