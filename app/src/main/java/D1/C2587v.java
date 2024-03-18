package d1;

/* renamed from: d1.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2587v {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27917a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f27918b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f27919c;

    /* renamed from: d  reason: collision with root package name */
    public final EnumC2588w f27920d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27921e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27922f;

    public C2587v(boolean z10, boolean z11, int i10) {
        boolean z12 = false;
        z10 = (i10 & 1) != 0 ? false : z10;
        EnumC2588w enumC2588w = EnumC2588w.f27923Y;
        z11 = (i10 & 16) != 0 ? true : z11;
        z12 = (i10 & 32) != 0 ? true : z12;
        this.f27917a = z10;
        this.f27918b = true;
        this.f27919c = true;
        this.f27920d = enumC2588w;
        this.f27921e = z11;
        this.f27922f = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2587v)) {
            return false;
        }
        C2587v c2587v = (C2587v) obj;
        if (this.f27917a == c2587v.f27917a && this.f27918b == c2587v.f27918b && this.f27919c == c2587v.f27919c && this.f27920d == c2587v.f27920d && this.f27921e == c2587v.f27921e && this.f27922f == c2587v.f27922f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 1231;
        boolean z10 = this.f27918b;
        if (z10) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i16 = i10 * 31;
        if (this.f27917a) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i17 = (i16 + i11) * 31;
        if (z10) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i18 = (i17 + i12) * 31;
        if (this.f27919c) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int hashCode = (this.f27920d.hashCode() + ((i18 + i13) * 31)) * 31;
        if (this.f27921e) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i19 = (hashCode + i14) * 31;
        if (!this.f27922f) {
            i15 = 1237;
        }
        return ((i19 + i15) * 31) + 1237;
    }
}
