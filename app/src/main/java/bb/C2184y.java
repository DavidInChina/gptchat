package bb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: bb.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2184y implements AbstractC2151C {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f25922a;

    public C2184y(Integer num) {
        this.f25922a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2184y) && AbstractC3557B.K(this.f25922a, ((C2184y) obj).f25922a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f25922a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Rate(rating=" + this.f25922a + Separators.RPAREN;
    }
}
