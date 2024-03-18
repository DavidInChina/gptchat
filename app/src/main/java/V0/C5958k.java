package v0;

import y.AbstractC6463a;

/* renamed from: v0.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5958k extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f46980c;

    /* renamed from: d  reason: collision with root package name */
    public final float f46981d;

    /* renamed from: e  reason: collision with root package name */
    public final float f46982e;

    /* renamed from: f  reason: collision with root package name */
    public final float f46983f;

    /* renamed from: g  reason: collision with root package name */
    public final float f46984g;

    /* renamed from: h  reason: collision with root package name */
    public final float f46985h;

    public C5958k(float f6, float f10, float f11, float f12, float f13, float f14) {
        super(true, false, 2);
        this.f46980c = f6;
        this.f46981d = f10;
        this.f46982e = f11;
        this.f46983f = f12;
        this.f46984g = f13;
        this.f46985h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5958k)) {
            return false;
        }
        C5958k c5958k = (C5958k) obj;
        if (Float.compare(this.f46980c, c5958k.f46980c) == 0 && Float.compare(this.f46981d, c5958k.f46981d) == 0 && Float.compare(this.f46982e, c5958k.f46982e) == 0 && Float.compare(this.f46983f, c5958k.f46983f) == 0 && Float.compare(this.f46984g, c5958k.f46984g) == 0 && Float.compare(this.f46985h, c5958k.f46985h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f46985h) + AbstractC6463a.e(this.f46984g, AbstractC6463a.e(this.f46983f, AbstractC6463a.e(this.f46982e, AbstractC6463a.e(this.f46981d, Float.floatToIntBits(this.f46980c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f46980c);
        sb2.append(", y1=");
        sb2.append(this.f46981d);
        sb2.append(", x2=");
        sb2.append(this.f46982e);
        sb2.append(", y2=");
        sb2.append(this.f46983f);
        sb2.append(", x3=");
        sb2.append(this.f46984g);
        sb2.append(", y3=");
        return AbstractC6463a.k(sb2, this.f46985h, ')');
    }
}
