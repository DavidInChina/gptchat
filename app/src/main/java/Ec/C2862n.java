package ec;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: ec.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2862n implements AbstractC2868t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29240a;

    public C2862n(boolean z10) {
        this.f29240a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2862n) && this.f29240a == ((C2862n) obj).f29240a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29240a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("AllowVoiceTraining(active="), this.f29240a, Separators.RPAREN);
    }
}
