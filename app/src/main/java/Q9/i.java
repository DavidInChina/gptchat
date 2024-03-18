package Q9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class i {
    public static final h Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f14539a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14540b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14541c;

    public i(int i10, String str, String str2, boolean z10) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, g.f14538b);
            throw null;
        }
        this.f14539a = str;
        this.f14540b = str2;
        this.f14541c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3557B.K(this.f14539a, iVar.f14539a) && AbstractC3557B.K(this.f14540b, iVar.f14540b) && this.f14541c == iVar.f14541c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f14540b, this.f14539a.hashCode() * 31, 31);
        if (this.f14541c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return v10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SharedConversationResponse(shareId=");
        sb2.append(this.f14539a);
        sb2.append(", shareUrl=");
        sb2.append(this.f14540b);
        sb2.append(", alreadyExists=");
        return AbstractC4194d.w(sb2, this.f14541c, Separators.RPAREN);
    }

    public i(String str, String str2, boolean z10) {
        AbstractC3557B.c0("shareId", str);
        AbstractC3557B.c0("shareUrl", str2);
        this.f14539a = str;
        this.f14540b = str2;
        this.f14541c = z10;
    }
}
