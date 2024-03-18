package ja;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

@AbstractC1998i
/* renamed from: ja.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3931c {
    public static final C3930b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f36092a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f36093b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f36094c;

    /* renamed from: d  reason: collision with root package name */
    public final String f36095d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f36096e;

    public C3931c(int i10, String str, boolean z10, boolean z11, String str2, boolean z12) {
        if (1 != (i10 & 1)) {
            R4.b.e2(i10, 1, C3929a.f36091b);
            throw null;
        }
        this.f36092a = str;
        if ((i10 & 2) == 0) {
            this.f36093b = false;
        } else {
            this.f36093b = z10;
        }
        if ((i10 & 4) == 0) {
            this.f36094c = false;
        } else {
            this.f36094c = z11;
        }
        if ((i10 & 8) == 0) {
            this.f36095d = null;
        } else {
            this.f36095d = str2;
        }
        if ((i10 & 16) == 0) {
            this.f36096e = false;
        } else {
            this.f36096e = z12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3931c)) {
            return false;
        }
        C3931c c3931c = (C3931c) obj;
        if (AbstractC3557B.K(this.f36092a, c3931c.f36092a) && this.f36093b == c3931c.f36093b && this.f36094c == c3931c.f36094c && AbstractC3557B.K(this.f36095d, c3931c.f36095d) && this.f36096e == c3931c.f36096e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f36092a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        int i15 = 1237;
        if (this.f36093b) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i16 = (i14 + i11) * 31;
        if (this.f36094c) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i17 = (i16 + i12) * 31;
        String str2 = this.f36095d;
        if (str2 != null) {
            i13 = str2.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        if (this.f36096e) {
            i15 = 1231;
        }
        return i18 + i15;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Contributor(displayName=");
        sb2.append(this.f36092a);
        sb2.append(", isAnonymous=");
        sb2.append(this.f36093b);
        sb2.append(", isFromSharedConversation=");
        sb2.append(this.f36094c);
        sb2.append(", picture=");
        sb2.append(this.f36095d);
        sb2.append(", isGizmo=");
        return AbstractC4194d.w(sb2, this.f36096e, Separators.RPAREN);
    }

    public C3931c(String str, boolean z10, boolean z11, String str2, boolean z12, int i10) {
        z10 = (i10 & 2) != 0 ? false : z10;
        z11 = (i10 & 4) != 0 ? false : z11;
        str2 = (i10 & 8) != 0 ? null : str2;
        z12 = (i10 & 16) != 0 ? false : z12;
        this.f36092a = str;
        this.f36093b = z10;
        this.f36094c = z11;
        this.f36095d = str2;
        this.f36096e = z12;
    }
}
