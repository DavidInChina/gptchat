package W;

import y.AbstractC6463a;

/* renamed from: W.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1597p0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f20273a;

    /* renamed from: b  reason: collision with root package name */
    public final float f20274b;

    /* renamed from: c  reason: collision with root package name */
    public final float f20275c;

    /* renamed from: d  reason: collision with root package name */
    public final float f20276d;

    /* renamed from: e  reason: collision with root package name */
    public final float f20277e;

    public C1597p0(float f6, float f10, float f11, float f12, float f13) {
        this.f20273a = f6;
        this.f20274b = f10;
        this.f20275c = f11;
        this.f20276d = f12;
        this.f20277e = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1597p0)) {
            return false;
        }
        C1597p0 c1597p0 = (C1597p0) obj;
        if (Z0.e.a(this.f20273a, c1597p0.f20273a) && Z0.e.a(this.f20274b, c1597p0.f20274b) && Z0.e.a(this.f20275c, c1597p0.f20275c) && Z0.e.a(this.f20276d, c1597p0.f20276d) && Z0.e.a(this.f20277e, c1597p0.f20277e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f20277e) + AbstractC6463a.e(this.f20276d, AbstractC6463a.e(this.f20275c, AbstractC6463a.e(this.f20274b, Float.floatToIntBits(this.f20273a) * 31, 31), 31), 31);
    }
}
