package L9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class a0 {
    public static final Z Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f10903a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10904b;

    public a0(int i10, Boolean bool, String str) {
        if ((i10 & 1) == 0) {
            this.f10903a = null;
        } else {
            this.f10903a = bool;
        }
        if ((i10 & 2) == 0) {
            this.f10904b = null;
        } else {
            this.f10904b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (AbstractC3557B.K(this.f10903a, a0Var.f10903a) && AbstractC3557B.K(this.f10904b, a0Var.f10904b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        Boolean bool = this.f10903a;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        int i12 = i10 * 31;
        String str = this.f10904b;
        if (str != null) {
            i11 = str.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "UpdateConversationResponse(success=" + this.f10903a + ", detail=" + this.f10904b + Separators.RPAREN;
    }
}
