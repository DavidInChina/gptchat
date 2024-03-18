package ii;

import id.AbstractC3557B;
import y.AbstractC6463a;

/* renamed from: ii.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3592g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f33291a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f33292b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f33293c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f33294d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f33295e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f33296f;

    public C3592g(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.f33291a = z10;
        this.f33292b = num;
        this.f33293c = z11;
        this.f33294d = num2;
        this.f33295e = z12;
        this.f33296f = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3592g)) {
            return false;
        }
        C3592g c3592g = (C3592g) obj;
        if (this.f33291a == c3592g.f33291a && AbstractC3557B.K(this.f33292b, c3592g.f33292b) && this.f33293c == c3592g.f33293c && AbstractC3557B.K(this.f33294d, c3592g.f33294d) && this.f33295e == c3592g.f33295e && this.f33296f == c3592g.f33296f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 1;
        boolean z10 = this.f33291a;
        if (z10) {
            z10 = true;
        }
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = i12 * 31;
        int i15 = 0;
        Integer num = this.f33292b;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        int i16 = (i14 + i10) * 31;
        boolean z11 = this.f33293c;
        if (z11) {
            z11 = true;
        }
        int i17 = z11 ? 1 : 0;
        int i18 = z11 ? 1 : 0;
        int i19 = (i16 + i17) * 31;
        Integer num2 = this.f33294d;
        if (num2 != null) {
            i15 = num2.hashCode();
        }
        int i20 = (i19 + i15) * 31;
        boolean z12 = this.f33295e;
        if (z12) {
            z12 = true;
        }
        int i21 = z12 ? 1 : 0;
        int i22 = z12 ? 1 : 0;
        int i23 = (i20 + i21) * 31;
        boolean z13 = this.f33296f;
        if (!z13) {
            i11 = z13 ? 1 : 0;
        }
        return i23 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.f33291a);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.f33292b);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.f33293c);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.f33294d);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.f33295e);
        sb2.append(", unknownValues=");
        return AbstractC6463a.l(sb2, this.f33296f, ')');
    }
}
