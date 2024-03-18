package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class K implements AbstractC1102f {
    public static final J Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13469a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13470b;

    public K(int i10, String str, String str2) {
        if (3 == (i10 & 3)) {
            this.f13469a = str;
            this.f13470b = str2;
            return;
        }
        R4.b.e2(i10, 3, I.f13466b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        if (AbstractC3557B.K(this.f13469a, k10.f13469a) && AbstractC3557B.K(this.f13470b, k10.f13470b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13470b.hashCode() + (this.f13469a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiExecutionOutputContent(text=");
        sb2.append(this.f13469a);
        sb2.append(", contentType=");
        return R.a.t(sb2, this.f13470b, Separators.RPAREN);
    }
}
