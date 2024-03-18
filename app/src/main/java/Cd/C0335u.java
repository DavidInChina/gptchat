package Cd;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: Cd.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335u implements y {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3072a;

    public C0335u(boolean z10) {
        this.f3072a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0335u) && this.f3072a == ((C0335u) obj).f3072a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3072a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("OpenVoiceMediaBottomSheet(show="), this.f3072a, Separators.RPAREN);
    }
}
