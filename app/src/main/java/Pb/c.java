package Pb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13916a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13917b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13918c;

    public c(int i10, String str, String str2, String str3) {
        if (7 == (i10 & 7)) {
            this.f13916a = str;
            this.f13917b = str2;
            this.f13918c = str3;
            return;
        }
        R4.b.e2(i10, 7, a.f13915b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f13916a, cVar.f13916a) && AbstractC3557B.K(this.f13917b, cVar.f13917b) && AbstractC3557B.K(this.f13918c, cVar.f13918c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13918c.hashCode() + E9.f.v(this.f13917b, this.f13916a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiPrompt(title=");
        sb2.append(this.f13916a);
        sb2.append(", description=");
        sb2.append(this.f13917b);
        sb2.append(", prompt=");
        return R.a.t(sb2, this.f13918c, Separators.RPAREN);
    }
}
