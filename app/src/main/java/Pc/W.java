package pc;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class W extends X {

    /* renamed from: a  reason: collision with root package name */
    public final int f42950a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f42951b;

    public W(int i10, boolean z10) {
        this.f42950a = i10;
        this.f42951b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        if (this.f42950a == w10.f42950a && this.f42951b == w10.f42951b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f42950a * 31;
        if (this.f42951b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return i11 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowErrorAlert(message=");
        sb2.append(this.f42950a);
        sb2.append(", exitOnDismiss=");
        return AbstractC4194d.w(sb2, this.f42951b, Separators.RPAREN);
    }
}
