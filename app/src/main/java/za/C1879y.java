package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import cb.AbstractC2338G;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Za.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1879y implements C {
    public static final C1878x Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f23631a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23632b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23633c;

    public C1879y(int i10, String str, String str2, String str3) {
        if (7 == (i10 & 7)) {
            this.f23631a = str;
            this.f23632b = str2;
            this.f23633c = str3;
            return;
        }
        R4.b.e2(i10, 7, C1877w.f23624b);
        throw null;
    }

    @Override // Za.C
    public final AbstractC2338G a() {
        return K8.d.R0(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1879y)) {
            return false;
        }
        C1879y c1879y = (C1879y) obj;
        if (AbstractC3557B.K(this.f23631a, c1879y.f23631a) && AbstractC3557B.K(this.f23632b, c1879y.f23632b) && AbstractC3557B.K(this.f23633c, c1879y.f23633c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23633c.hashCode() + E9.f.v(this.f23632b, this.f23631a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GenericTitleSubtitle(type=");
        sb2.append(this.f23631a);
        sb2.append(", title=");
        sb2.append(this.f23632b);
        sb2.append(", subtitle=");
        return R.a.t(sb2, this.f23633c, Separators.RPAREN);
    }
}
