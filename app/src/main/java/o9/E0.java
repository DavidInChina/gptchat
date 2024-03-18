package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class E0 {
    public static final D0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13453a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f13454b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f13455c;

    public E0(int i10, String str, Integer num, Integer num2) {
        if ((i10 & 1) == 0) {
            this.f13453a = null;
        } else {
            this.f13453a = str;
        }
        if ((i10 & 2) == 0) {
            this.f13454b = null;
        } else {
            this.f13454b = num;
        }
        if ((i10 & 4) == 0) {
            this.f13455c = null;
        } else {
            this.f13455c = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (AbstractC3557B.K(this.f13453a, e02.f13453a) && AbstractC3557B.K(this.f13454b, e02.f13454b) && AbstractC3557B.K(this.f13455c, e02.f13455c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f13453a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        Integer num = this.f13454b;
        if (num == null) {
            i11 = 0;
        } else {
            i11 = num.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        Integer num2 = this.f13455c;
        if (num2 != null) {
            i12 = num2.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "ApiMessageAggregateResultMessage(imageUrl=" + this.f13453a + ", width=" + this.f13454b + ", height=" + this.f13455c + Separators.RPAREN;
    }
}
