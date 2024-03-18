package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Mb.w0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0986w0 implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final String f11995a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11996b;

    /* renamed from: c  reason: collision with root package name */
    public final wd.o0 f11997c;

    /* renamed from: d  reason: collision with root package name */
    public final wd.o0 f11998d;

    public /* synthetic */ C0986w0(String str, int i10) {
        this((i10 & 1) != 0 ? null : str, true, null, null);
    }

    public static C0986w0 e(C0986w0 c0986w0, String str, wd.o0 o0Var, wd.o0 o0Var2, int i10) {
        boolean z10;
        if ((i10 & 1) != 0) {
            str = c0986w0.f11995a;
        }
        if ((i10 & 2) != 0) {
            z10 = c0986w0.f11996b;
        } else {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            o0Var = c0986w0.f11997c;
        }
        if ((i10 & 8) != 0) {
            o0Var2 = c0986w0.f11998d;
        }
        c0986w0.getClass();
        return new C0986w0(str, z10, o0Var, o0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0986w0)) {
            return false;
        }
        C0986w0 c0986w0 = (C0986w0) obj;
        if (AbstractC3557B.K(this.f11995a, c0986w0.f11995a) && this.f11996b == c0986w0.f11996b && AbstractC3557B.K(this.f11997c, c0986w0.f11997c) && AbstractC3557B.K(this.f11998d, c0986w0.f11998d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f11995a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        if (this.f11996b) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        wd.o0 o0Var = this.f11997c;
        if (o0Var == null) {
            i12 = 0;
        } else {
            i12 = o0Var.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        wd.o0 o0Var2 = this.f11998d;
        if (o0Var2 != null) {
            i13 = o0Var2.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "VerifyEmailState(email=" + this.f11995a + ", initialLoading=" + this.f11996b + ", resendProgress=" + this.f11997c + ", recheckProgress=" + this.f11998d + Separators.RPAREN;
    }

    public C0986w0(String str, boolean z10, wd.o0 o0Var, wd.o0 o0Var2) {
        this.f11995a = str;
        this.f11996b = z10;
        this.f11997c = o0Var;
        this.f11998d = o0Var2;
    }
}
