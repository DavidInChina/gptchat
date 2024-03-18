package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import jf.C3959i;

/* loaded from: classes2.dex */
public final class l0 implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final String f31479a;

    /* renamed from: b  reason: collision with root package name */
    public final C3959i f31480b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f31481c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31482d;

    /* renamed from: e  reason: collision with root package name */
    public final o0 f31483e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f31484f;

    public l0(String str, C3959i c3959i, boolean z10, String str2, o0 o0Var, boolean z11) {
        this.f31479a = str;
        this.f31480b = c3959i;
        this.f31481c = z10;
        this.f31482d = str2;
        this.f31483e = o0Var;
        this.f31484f = z11;
    }

    public static l0 e(l0 l0Var, String str, boolean z10, String str2, o0 o0Var, int i10) {
        C3959i c3959i;
        if ((i10 & 1) != 0) {
            str = l0Var.f31479a;
        }
        String str3 = str;
        if ((i10 & 2) != 0) {
            c3959i = l0Var.f31480b;
        } else {
            c3959i = null;
        }
        C3959i c3959i2 = c3959i;
        if ((i10 & 4) != 0) {
            z10 = l0Var.f31481c;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            str2 = l0Var.f31482d;
        }
        String str4 = str2;
        if ((i10 & 16) != 0) {
            o0Var = l0Var.f31483e;
        }
        boolean z12 = l0Var.f31484f;
        l0Var.getClass();
        return new l0(str3, c3959i2, z11, str4, o0Var, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (AbstractC3557B.K(this.f31479a, l0Var.f31479a) && AbstractC3557B.K(this.f31480b, l0Var.f31480b) && this.f31481c == l0Var.f31481c && AbstractC3557B.K(this.f31482d, l0Var.f31482d) && AbstractC3557B.K(this.f31483e, l0Var.f31483e) && this.f31484f == l0Var.f31484f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        String str = this.f31479a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i15 = i10 * 31;
        C3959i c3959i = this.f31480b;
        if (c3959i == null) {
            i11 = 0;
        } else {
            i11 = c3959i.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        int i17 = 1237;
        if (this.f31481c) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i18 = (i16 + i12) * 31;
        String str2 = this.f31482d;
        if (str2 == null) {
            i13 = 0;
        } else {
            i13 = str2.hashCode();
        }
        int i19 = (i18 + i13) * 31;
        o0 o0Var = this.f31483e;
        if (o0Var != null) {
            i14 = o0Var.hashCode();
        }
        int i20 = (i19 + i14) * 31;
        if (this.f31484f) {
            i17 = 1231;
        }
        return i20 + i17;
    }

    public final String toString() {
        return "MessagesState(showTextSelection=" + this.f31479a + ", showImageSelection=" + this.f31480b + ", exportingImage=" + this.f31481c + ", showCode=" + this.f31482d + ", selectedCitation=" + this.f31483e + ", enableC2PA=" + this.f31484f + Separators.RPAREN;
    }
}
