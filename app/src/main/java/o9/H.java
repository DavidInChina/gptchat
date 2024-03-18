package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class H {
    public static final G Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13460a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13461b;

    public H(int i10, String str, String str2) {
        if ((i10 & 1) == 0) {
            this.f13460a = null;
        } else {
            this.f13460a = str;
        }
        if ((i10 & 2) == 0) {
            this.f13461b = null;
        } else {
            this.f13461b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        if (AbstractC3557B.K(this.f13460a, h10.f13460a) && AbstractC3557B.K(this.f13461b, h10.f13461b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f13460a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f13461b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiConversationUserContextMessageData(aboutUserMessage=");
        sb2.append(this.f13460a);
        sb2.append(", aboutModelMessage=");
        return R.a.t(sb2, this.f13461b, Separators.RPAREN);
    }
}
