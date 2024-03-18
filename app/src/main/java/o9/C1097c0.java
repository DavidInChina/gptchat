package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: O9.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1097c0 {
    public static final V Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final C1095b0 f13526a;

    public C1097c0(int i10, C1095b0 c1095b0) {
        if ((i10 & 1) == 0) {
            this.f13526a = null;
        } else {
            this.f13526a = c1095b0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1097c0) && AbstractC3557B.K(this.f13526a, ((C1097c0) obj).f13526a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        C1095b0 c1095b0 = this.f13526a;
        if (c1095b0 == null) {
            return 0;
        }
        return c1095b0.hashCode();
    }

    public final String toString() {
        return "FromClient(userAction=" + this.f13526a + Separators.RPAREN;
    }

    public C1097c0(C1095b0 c1095b0) {
        this.f13526a = c1095b0;
    }
}
