package na;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class T1 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f39874a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f39875b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f39876c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f39877d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f39878e;

    public /* synthetic */ T1(boolean z10, int i10) {
        this((i10 & 1) != 0 ? false : z10, false, false, false, false);
    }

    public static T1 a(T1 t12, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        boolean z14 = t12.f39874a;
        if ((i10 & 2) != 0) {
            z10 = t12.f39875b;
        }
        boolean z15 = z10;
        if ((i10 & 4) != 0) {
            z11 = t12.f39876c;
        }
        boolean z16 = z11;
        if ((i10 & 8) != 0) {
            z12 = t12.f39877d;
        }
        boolean z17 = z12;
        if ((i10 & 16) != 0) {
            z13 = t12.f39878e;
        }
        t12.getClass();
        return new T1(z14, z15, z16, z17, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T1)) {
            return false;
        }
        T1 t12 = (T1) obj;
        if (this.f39874a == t12.f39874a && this.f39875b == t12.f39875b && this.f39876c == t12.f39876c && this.f39877d == t12.f39877d && this.f39878e == t12.f39878e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 1237;
        if (this.f39874a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i15 = i10 * 31;
        if (this.f39875b) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i16 = (i15 + i11) * 31;
        if (this.f39876c) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i17 = (i16 + i12) * 31;
        if (this.f39877d) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i18 = (i17 + i13) * 31;
        if (this.f39878e) {
            i14 = 1231;
        }
        return i18 + i14;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VoiceModeState(available=");
        sb2.append(this.f39874a);
        sb2.append(", active=");
        sb2.append(this.f39875b);
        sb2.append(", showDisclosure=");
        sb2.append(this.f39876c);
        sb2.append(", showSettings=");
        sb2.append(this.f39877d);
        sb2.append(", showHistoryOffNotice=");
        return AbstractC4194d.w(sb2, this.f39878e, Separators.RPAREN);
    }

    public T1(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f39874a = z10;
        this.f39875b = z11;
        this.f39876c = z12;
        this.f39877d = z13;
        this.f39878e = z14;
    }
}
