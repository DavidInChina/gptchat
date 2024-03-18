package Dd;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3531a;

    public P(boolean z10) {
        this.f3531a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof P) && this.f3531a == ((P) obj).f3531a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3531a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("VoiceSessionState(hasActiveVoiceSession="), this.f3531a, Separators.RPAREN);
    }
}
