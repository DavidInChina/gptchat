package v0;

import y.AbstractC6463a;

/* renamed from: v0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5956i extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f46972c;

    /* renamed from: d  reason: collision with root package name */
    public final float f46973d;

    /* renamed from: e  reason: collision with root package name */
    public final float f46974e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f46975f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f46976g;

    /* renamed from: h  reason: collision with root package name */
    public final float f46977h;

    /* renamed from: i  reason: collision with root package name */
    public final float f46978i;

    public C5956i(float f6, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
        super(false, false, 3);
        this.f46972c = f6;
        this.f46973d = f10;
        this.f46974e = f11;
        this.f46975f = z10;
        this.f46976g = z11;
        this.f46977h = f12;
        this.f46978i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5956i)) {
            return false;
        }
        C5956i c5956i = (C5956i) obj;
        if (Float.compare(this.f46972c, c5956i.f46972c) == 0 && Float.compare(this.f46973d, c5956i.f46973d) == 0 && Float.compare(this.f46974e, c5956i.f46974e) == 0 && this.f46975f == c5956i.f46975f && this.f46976g == c5956i.f46976g && Float.compare(this.f46977h, c5956i.f46977h) == 0 && Float.compare(this.f46978i, c5956i.f46978i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int e10 = AbstractC6463a.e(this.f46974e, AbstractC6463a.e(this.f46973d, Float.floatToIntBits(this.f46972c) * 31, 31), 31);
        int i11 = 1237;
        if (this.f46975f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (e10 + i10) * 31;
        if (this.f46976g) {
            i11 = 1231;
        }
        return Float.floatToIntBits(this.f46978i) + AbstractC6463a.e(this.f46977h, (i12 + i11) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f46972c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f46973d);
        sb2.append(", theta=");
        sb2.append(this.f46974e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f46975f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f46976g);
        sb2.append(", arcStartX=");
        sb2.append(this.f46977h);
        sb2.append(", arcStartY=");
        return AbstractC6463a.k(sb2, this.f46978i, ')');
    }
}
