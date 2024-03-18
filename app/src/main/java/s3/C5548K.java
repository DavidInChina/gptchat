package s3;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: s3.K  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5548K {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f45245a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f45246b;

    /* renamed from: c  reason: collision with root package name */
    public final int f45247c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f45248d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f45249e;

    /* renamed from: f  reason: collision with root package name */
    public final int f45250f;

    /* renamed from: g  reason: collision with root package name */
    public final int f45251g;

    /* renamed from: h  reason: collision with root package name */
    public final int f45252h;

    /* renamed from: i  reason: collision with root package name */
    public final int f45253i;

    public C5548K(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12, int i13, int i14) {
        this.f45245a = z10;
        this.f45246b = z11;
        this.f45247c = i10;
        this.f45248d = z12;
        this.f45249e = z13;
        this.f45250f = i11;
        this.f45251g = i12;
        this.f45252h = i13;
        this.f45253i = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5548K)) {
            return false;
        }
        C5548K c5548k = (C5548K) obj;
        if (this.f45245a == c5548k.f45245a && this.f45246b == c5548k.f45246b && this.f45247c == c5548k.f45247c) {
            c5548k.getClass();
            if (AbstractC3557B.K(null, null) && this.f45248d == c5548k.f45248d && this.f45249e == c5548k.f45249e && this.f45250f == c5548k.f45250f && this.f45251g == c5548k.f45251g && this.f45252h == c5548k.f45252h && this.f45253i == c5548k.f45253i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f45245a ? 1 : 0) * 31) + (this.f45246b ? 1 : 0)) * 31) + this.f45247c) * 31) + 0) * 31) + (this.f45248d ? 1 : 0)) * 31) + (this.f45249e ? 1 : 0)) * 31) + this.f45250f) * 31) + this.f45251g) * 31) + this.f45252h) * 31) + this.f45253i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C5548K.class.getSimpleName());
        sb2.append(Separators.LPAREN);
        if (this.f45245a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f45246b) {
            sb2.append("restoreState ");
        }
        int i10 = this.f45253i;
        int i11 = this.f45252h;
        int i12 = this.f45251g;
        int i13 = this.f45250f;
        if (i13 != -1 || i12 != -1 || i11 != -1 || i10 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i13));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i12));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(Separators.RPAREN);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("sb.toString()", sb3);
        return sb3;
    }
}
