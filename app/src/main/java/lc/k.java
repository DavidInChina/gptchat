package Lc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class k {
    public static final j Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f10997a;

    public k(int i10, String str) {
        if ((i10 & 1) == 0) {
            this.f10997a = null;
        } else {
            this.f10997a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && AbstractC3557B.K(this.f10997a, ((k) obj).f10997a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10997a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("DeviceSettings(deviceUUID="), this.f10997a, Separators.RPAREN);
    }

    public k(String str) {
        this.f10997a = str;
    }
}
