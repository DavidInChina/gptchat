package Cd;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: Cd.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334t implements y {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3071a;

    public C0334t(boolean z10) {
        this.f3071a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0334t) && this.f3071a == ((C0334t) obj).f3071a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3071a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("OpenVoiceActionsBottomSheet(show="), this.f3071a, Separators.RPAREN);
    }
}
