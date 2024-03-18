package We;

import M3.H;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class F extends H implements D {

    /* renamed from: j  reason: collision with root package name */
    public final String f20970j;

    /* renamed from: k  reason: collision with root package name */
    public final Xe.F f20971k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f20972l;

    /* renamed from: m  reason: collision with root package name */
    public final String f20973m;

    /* renamed from: n  reason: collision with root package name */
    public final String f20974n;

    /* renamed from: o  reason: collision with root package name */
    public final C1652c f20975o;

    /* renamed from: p  reason: collision with root package name */
    public final int f20976p;

    /* renamed from: q  reason: collision with root package name */
    public final String f20977q;

    public F(String str, Xe.F f6, boolean z10, String str2, String str3, C1652c c1652c, int i10, String str4) {
        AbstractC3557B.c0("videoCodec", str2);
        this.f20970j = str;
        this.f20971k = f6;
        this.f20972l = z10;
        this.f20973m = str2;
        this.f20974n = str3;
        this.f20975o = c1652c;
        this.f20976p = i10;
        this.f20977q = str4;
    }

    public static F Q0(F f6, Xe.F f10, String str, String str2, C1652c c1652c, int i10) {
        String str3 = f6.f20970j;
        if ((i10 & 2) != 0) {
            f10 = f6.f20971k;
        }
        Xe.F f11 = f10;
        boolean z10 = f6.f20972l;
        if ((i10 & 8) != 0) {
            str = f6.f20973m;
        }
        String str4 = str;
        if ((i10 & 16) != 0) {
            str2 = f6.f20974n;
        }
        String str5 = str2;
        if ((i10 & 32) != 0) {
            c1652c = f6.f20975o;
        }
        int i11 = f6.f20976p;
        String str6 = f6.f20977q;
        f6.getClass();
        AbstractC3557B.c0("videoCodec", str4);
        return new F(str3, f11, z10, str4, str5, c1652c, i11, str6);
    }

    @Override // We.D
    public final String a() {
        return this.f20977q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        if (AbstractC3557B.K(this.f20970j, f6.f20970j) && AbstractC3557B.K(this.f20971k, f6.f20971k) && this.f20972l == f6.f20972l && AbstractC3557B.K(this.f20973m, f6.f20973m) && AbstractC3557B.K(this.f20974n, f6.f20974n) && AbstractC3557B.K(this.f20975o, f6.f20975o) && this.f20976p == f6.f20976p && AbstractC3557B.K(this.f20977q, f6.f20977q)) {
            return true;
        }
        return false;
    }

    @Override // We.D
    public final String getName() {
        return this.f20970j;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        String str = this.f20970j;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i16 = i10 * 31;
        Xe.F f6 = this.f20971k;
        if (f6 == null) {
            i11 = 0;
        } else {
            i11 = f6.hashCode();
        }
        int i17 = (i16 + i11) * 31;
        boolean z10 = this.f20972l;
        if (z10) {
            z10 = true;
        }
        int i18 = z10 ? 1 : 0;
        int i19 = z10 ? 1 : 0;
        int v10 = E9.f.v(this.f20973m, (i17 + i18) * 31, 31);
        String str2 = this.f20974n;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int i20 = (v10 + i12) * 31;
        C1652c c1652c = this.f20975o;
        if (c1652c == null) {
            i13 = 0;
        } else {
            i13 = c1652c.hashCode();
        }
        int i21 = (i20 + i13) * 31;
        int i22 = this.f20976p;
        if (i22 == 0) {
            i14 = 0;
        } else {
            i14 = AbstractC6708l.f(i22);
        }
        int i23 = (i21 + i14) * 31;
        String str3 = this.f20977q;
        if (str3 != null) {
            i15 = str3.hashCode();
        }
        return i23 + i15;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoTrackPublishOptions(name=");
        sb2.append(this.f20970j);
        sb2.append(", videoEncoding=");
        sb2.append(this.f20971k);
        sb2.append(", simulcast=");
        sb2.append(this.f20972l);
        sb2.append(", videoCodec=");
        sb2.append(this.f20973m);
        sb2.append(", scalabilityMode=");
        sb2.append(this.f20974n);
        sb2.append(", backupCodec=");
        sb2.append(this.f20975o);
        sb2.append(", source=");
        sb2.append(Xe.v.d(this.f20976p));
        sb2.append(", stream=");
        return android.gov.nist.core.a.n(sb2, this.f20977q, ')');
    }
}
