package Ha;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f7571a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f7572b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7573c;

    public c(int i10, Boolean bool, Boolean bool2, String str) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, a.f7570b);
            throw null;
        }
        this.f7571a = bool;
        this.f7572b = bool2;
        this.f7573c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f7571a, cVar.f7571a) && AbstractC3557B.K(this.f7572b, cVar.f7572b) && AbstractC3557B.K(this.f7573c, cVar.f7573c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        Boolean bool = this.f7571a;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        int i13 = i10 * 31;
        Boolean bool2 = this.f7572b;
        if (bool2 == null) {
            i11 = 0;
        } else {
            i11 = bool2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str = this.f7573c;
        if (str != null) {
            i12 = str.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiPublishSharedConversationRequest(isAnonymous=");
        sb2.append(this.f7571a);
        sb2.append(", isPublic=");
        sb2.append(this.f7572b);
        sb2.append(", title=");
        return R.a.t(sb2, this.f7573c, Separators.RPAREN);
    }

    public c(Boolean bool, String str) {
        Boolean bool2 = Boolean.TRUE;
        this.f7571a = bool;
        this.f7572b = bool2;
        this.f7573c = str;
    }
}
