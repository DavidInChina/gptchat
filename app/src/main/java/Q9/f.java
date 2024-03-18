package Q9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f14531a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14532b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14533c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14534d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14535e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14536f;

    public f(int i10, String str, String str2, boolean z10, boolean z11, String str3, boolean z12) {
        if (63 == (i10 & 63)) {
            this.f14531a = str;
            this.f14532b = str2;
            this.f14533c = z10;
            this.f14534d = z11;
            this.f14535e = str3;
            this.f14536f = z12;
            return;
        }
        R4.b.e2(i10, 63, d.f14530b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3557B.K(this.f14531a, fVar.f14531a) && AbstractC3557B.K(this.f14532b, fVar.f14532b) && this.f14533c == fVar.f14533c && this.f14534d == fVar.f14534d && AbstractC3557B.K(this.f14535e, fVar.f14535e) && this.f14536f == fVar.f14536f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int v10 = E9.f.v(this.f14532b, this.f14531a.hashCode() * 31, 31);
        int i13 = 1237;
        if (this.f14533c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (v10 + i10) * 31;
        if (this.f14534d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        String str = this.f14535e;
        if (str == null) {
            i12 = 0;
        } else {
            i12 = str.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        if (this.f14536f) {
            i13 = 1231;
        }
        return i16 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiCreateSharedConversationResponse(shareId=");
        sb2.append(this.f14531a);
        sb2.append(", shareUrl=");
        sb2.append(this.f14532b);
        sb2.append(", isPublic=");
        sb2.append(this.f14533c);
        sb2.append(", isVisible=");
        sb2.append(this.f14534d);
        sb2.append(", currentNodeId=");
        sb2.append(this.f14535e);
        sb2.append(", alreadyExists=");
        return AbstractC4194d.w(sb2, this.f14536f, Separators.RPAREN);
    }
}
