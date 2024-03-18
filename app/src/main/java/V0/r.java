package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class r extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f47001c;

    /* renamed from: d  reason: collision with root package name */
    public final float f47002d;

    /* renamed from: e  reason: collision with root package name */
    public final float f47003e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f47004f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f47005g;

    /* renamed from: h  reason: collision with root package name */
    public final float f47006h;

    /* renamed from: i  reason: collision with root package name */
    public final float f47007i;

    public r(float f6, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
        super(false, false, 3);
        this.f47001c = f6;
        this.f47002d = f10;
        this.f47003e = f11;
        this.f47004f = z10;
        this.f47005g = z11;
        this.f47006h = f12;
        this.f47007i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Float.compare(this.f47001c, rVar.f47001c) == 0 && Float.compare(this.f47002d, rVar.f47002d) == 0 && Float.compare(this.f47003e, rVar.f47003e) == 0 && this.f47004f == rVar.f47004f && this.f47005g == rVar.f47005g && Float.compare(this.f47006h, rVar.f47006h) == 0 && Float.compare(this.f47007i, rVar.f47007i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int e10 = AbstractC6463a.e(this.f47003e, AbstractC6463a.e(this.f47002d, Float.floatToIntBits(this.f47001c) * 31, 31), 31);
        int i11 = 1237;
        if (this.f47004f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (e10 + i10) * 31;
        if (this.f47005g) {
            i11 = 1231;
        }
        return Float.floatToIntBits(this.f47007i) + AbstractC6463a.e(this.f47006h, (i12 + i11) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f47001c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f47002d);
        sb2.append(", theta=");
        sb2.append(this.f47003e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f47004f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f47005g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f47006h);
        sb2.append(", arcStartDy=");
        return AbstractC6463a.k(sb2, this.f47007i, ')');
    }
}
