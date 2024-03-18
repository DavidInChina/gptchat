package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class Q0 implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final String f11829a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11830b;

    /* renamed from: c  reason: collision with root package name */
    public final wd.o0 f11831c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11832d;

    public Q0(String str, String str2, wd.o0 o0Var, boolean z10) {
        AbstractC3557B.c0("code", str2);
        this.f11829a = str;
        this.f11830b = str2;
        this.f11831c = o0Var;
        this.f11832d = z10;
    }

    public static Q0 e(Q0 q02, String str, String str2, wd.o0 o0Var, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            str = q02.f11829a;
        }
        if ((i10 & 2) != 0) {
            str2 = q02.f11830b;
        }
        if ((i10 & 4) != 0) {
            o0Var = q02.f11831c;
        }
        if ((i10 & 8) != 0) {
            z10 = q02.f11832d;
        }
        q02.getClass();
        AbstractC3557B.c0("code", str2);
        return new Q0(str, str2, o0Var, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q0)) {
            return false;
        }
        Q0 q02 = (Q0) obj;
        if (AbstractC3557B.K(this.f11829a, q02.f11829a) && AbstractC3557B.K(this.f11830b, q02.f11830b) && AbstractC3557B.K(this.f11831c, q02.f11831c) && this.f11832d == q02.f11832d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f11829a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int v10 = E9.f.v(this.f11830b, i10 * 31, 31);
        wd.o0 o0Var = this.f11831c;
        if (o0Var != null) {
            i12 = o0Var.hashCode();
        }
        int i13 = (v10 + i12) * 31;
        if (this.f11832d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return i13 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerifyPhoneState(phoneNumber=");
        sb2.append(this.f11829a);
        sb2.append(", code=");
        sb2.append(this.f11830b);
        sb2.append(", progress=");
        sb2.append(this.f11831c);
        sb2.append(", showPhoneHelp=");
        return AbstractC4194d.w(sb2, this.f11832d, Separators.RPAREN);
    }
}
