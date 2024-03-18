package R9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f15180a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15181b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15182c;

    public c(int i10, int i11, String str, String str2) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, a.f15179b);
            throw null;
        }
        this.f15180a = str;
        this.f15181b = str2;
        this.f15182c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f15180a, cVar.f15180a) && AbstractC3557B.K(this.f15181b, cVar.f15181b) && this.f15182c == cVar.f15182c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return E9.f.v(this.f15181b, this.f15180a.hashCode() * 31, 31) + this.f15182c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiSuggestionsRequest(messageId=");
        sb2.append(this.f15180a);
        sb2.append(", model=");
        sb2.append(this.f15181b);
        sb2.append(", numSuggestions=");
        return android.gov.nist.core.a.l(sb2, this.f15182c, Separators.RPAREN);
    }

    public c(int i10, String str, String str2) {
        AbstractC3557B.c0("messageId", str);
        AbstractC3557B.c0("model", str2);
        this.f15180a = str;
        this.f15181b = str2;
        this.f15182c = i10;
    }
}
