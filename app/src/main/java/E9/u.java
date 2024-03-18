package E9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class u {
    public static final t Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f4573a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4574b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4575c;

    public u(int i10, String str, String str2, boolean z10) {
        if (1 == (i10 & 1)) {
            this.f4573a = str;
            if ((i10 & 2) == 0) {
                this.f4574b = null;
            } else {
                this.f4574b = str2;
            }
            if ((i10 & 4) == 0) {
                this.f4575c = false;
                return;
            } else {
                this.f4575c = z10;
                return;
            }
        }
        R4.b.e2(i10, 1, s.f4572b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3557B.K(this.f4573a, uVar.f4573a) && AbstractC3557B.K(this.f4574b, uVar.f4574b) && this.f4575c == uVar.f4575c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f4573a.hashCode() * 31;
        String str = this.f4574b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        if (this.f4575c) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TermsOfUseSecondaryCtaResponse(text=");
        sb2.append(this.f4573a);
        sb2.append(", url=");
        sb2.append(this.f4574b);
        sb2.append(", dismissOnAction=");
        return AbstractC4194d.w(sb2, this.f4575c, Separators.RPAREN);
    }
}
