package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: cb.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2367h {
    public static final C2366g Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f26518a;

    public C2367h(int i10, String str) {
        if ((i10 & 1) == 0) {
            this.f26518a = null;
        } else {
            this.f26518a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2367h) && AbstractC3557B.K(this.f26518a, ((C2367h) obj).f26518a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f26518a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("GizmoIcon(url="), this.f26518a, Separators.RPAREN);
    }

    public C2367h(String str) {
        this.f26518a = str;
    }
}
