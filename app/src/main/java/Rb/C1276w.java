package Rb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Rb.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1276w implements AbstractC1279z {

    /* renamed from: a  reason: collision with root package name */
    public final String f15377a;

    public C1276w(String str) {
        this.f15377a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1276w) && AbstractC3557B.K(this.f15377a, ((C1276w) obj).f15377a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15377a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("SelectLink(linkUrl="), this.f15377a, Separators.RPAREN);
    }
}
