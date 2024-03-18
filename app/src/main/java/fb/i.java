package Fb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class i {
    public static final h Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f5151a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5152b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5153c;

    public i(int i10, String str, String str2, String str3) {
        if (7 == (i10 & 7)) {
            this.f5151a = str;
            this.f5152b = str2;
            this.f5153c = str3;
            return;
        }
        R4.b.e2(i10, 7, g.f5150b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3557B.K(this.f5151a, iVar.f5151a) && AbstractC3557B.K(this.f5152b, iVar.f5152b) && AbstractC3557B.K(this.f5153c, iVar.f5153c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5153c.hashCode() + E9.f.v(this.f5152b, this.f5151a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateAccountResponse(id=");
        sb2.append(this.f5151a);
        sb2.append(", email=");
        sb2.append(this.f5152b);
        sb2.append(", name=");
        return R.a.t(sb2, this.f5153c, Separators.RPAREN);
    }
}
