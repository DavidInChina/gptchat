package za;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.AbstractC6211y;

/* renamed from: za.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6788e implements AbstractC6790g {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6211y f51786a;

    public C6788e(AbstractC6211y abstractC6211y) {
        this.f51786a = abstractC6211y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6788e) && AbstractC3557B.K(this.f51786a, ((C6788e) obj).f51786a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51786a.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.f51786a + Separators.RPAREN;
    }
}
