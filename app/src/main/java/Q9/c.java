package Q9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f14526a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14527b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14528c;

    public c(int i10, String str, String str2, boolean z10) {
        if (5 != (i10 & 5)) {
            R4.b.e2(i10, 5, a.f14525b);
            throw null;
        }
        this.f14526a = str;
        if ((i10 & 2) == 0) {
            this.f14527b = null;
        } else {
            this.f14527b = str2;
        }
        this.f14528c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f14526a, cVar.f14526a) && AbstractC3557B.K(this.f14527b, cVar.f14527b) && this.f14528c == cVar.f14528c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f14526a.hashCode() * 31;
        String str = this.f14527b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        if (this.f14528c) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiCreateSharedConversationRequest(conversationId=");
        sb2.append(this.f14526a);
        sb2.append(", currentNodeId=");
        sb2.append(this.f14527b);
        sb2.append(", isAnonymous=");
        return AbstractC4194d.w(sb2, this.f14528c, Separators.RPAREN);
    }

    public c(String str, String str2, boolean z10) {
        AbstractC3557B.c0("conversationId", str);
        this.f14526a = str;
        this.f14527b = str2;
        this.f14528c = z10;
    }
}
