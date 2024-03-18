package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class H0 implements K0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11796a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11797b;

    public H0(String str, boolean z10) {
        this.f11796a = str;
        this.f11797b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        if (AbstractC3557B.K(this.f11796a, h02.f11796a) && this.f11797b == h02.f11797b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f11796a.hashCode() * 31;
        if (this.f11797b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        String F22 = AbstractC3557B.F2(this.f11796a);
        return "NavigateTo(route=" + F22 + ", replace=" + this.f11797b + Separators.RPAREN;
    }
}
