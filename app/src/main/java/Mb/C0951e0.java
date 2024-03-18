package Mb;

import android.gov.nist.core.Separators;
import b9.EnumC2132a;
import k6.AbstractC4194d;

/* renamed from: Mb.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951e0 implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11914a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC2132a f11915b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11916c;

    public C0951e0(boolean z10, EnumC2132a enumC2132a, boolean z11) {
        this.f11914a = z10;
        this.f11915b = enumC2132a;
        this.f11916c = z11;
    }

    public static C0951e0 e(C0951e0 c0951e0, boolean z10, EnumC2132a enumC2132a, boolean z11, int i10) {
        if ((i10 & 1) != 0) {
            z10 = c0951e0.f11914a;
        }
        if ((i10 & 2) != 0) {
            enumC2132a = c0951e0.f11915b;
        }
        if ((i10 & 4) != 0) {
            z11 = c0951e0.f11916c;
        }
        c0951e0.getClass();
        return new C0951e0(z10, enumC2132a, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0951e0)) {
            return false;
        }
        C0951e0 c0951e0 = (C0951e0) obj;
        if (this.f11914a == c0951e0.f11914a && this.f11915b == c0951e0.f11915b && this.f11916c == c0951e0.f11916c) {
            return true;
        }
        return false;
    }

    public final boolean f(EnumC2132a enumC2132a) {
        if (this.f11915b == enumC2132a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 1237;
        if (this.f11914a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i13 = i10 * 31;
        EnumC2132a enumC2132a = this.f11915b;
        if (enumC2132a == null) {
            i11 = 0;
        } else {
            i11 = enumC2132a.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        if (this.f11916c) {
            i12 = 1231;
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoginViewState(readyForLogin=");
        sb2.append(this.f11914a);
        sb2.append(", inProgressProvider=");
        sb2.append(this.f11915b);
        sb2.append(", showBrowserWarning=");
        return AbstractC4194d.w(sb2, this.f11916c, Separators.RPAREN);
    }
}
