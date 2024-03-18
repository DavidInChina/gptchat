package E9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class o {
    public static final n Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f4564a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4565b;

    /* renamed from: c  reason: collision with root package name */
    public final u f4566c;

    public o(int i10, String str, String str2, u uVar) {
        if (3 == (i10 & 3)) {
            this.f4564a = str;
            this.f4565b = str2;
            if ((i10 & 4) == 0) {
                this.f4566c = null;
                return;
            } else {
                this.f4566c = uVar;
                return;
            }
        }
        R4.b.e2(i10, 3, m.f4563b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3557B.K(this.f4564a, oVar.f4564a) && AbstractC3557B.K(this.f4565b, oVar.f4565b) && AbstractC3557B.K(this.f4566c, oVar.f4566c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f4564a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f4565b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        u uVar = this.f4566c;
        if (uVar != null) {
            i12 = uVar.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "TermsOfUseDisplayResponse(messageMarkdown=" + this.f4564a + ", acceptCtaText=" + this.f4565b + ", secondaryCta=" + this.f4566c + Separators.RPAREN;
    }
}
