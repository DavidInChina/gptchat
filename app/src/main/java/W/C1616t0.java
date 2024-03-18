package W;

import y.AbstractC6463a;

/* renamed from: W.t0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1616t0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f20418a;

    /* renamed from: b  reason: collision with root package name */
    public final float f20419b;

    /* renamed from: c  reason: collision with root package name */
    public final float f20420c;

    /* renamed from: d  reason: collision with root package name */
    public final float f20421d;

    /* renamed from: e  reason: collision with root package name */
    public final float f20422e;

    public C1616t0(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f20418a = f6;
        this.f20419b = f10;
        this.f20420c = f11;
        this.f20421d = f12;
        this.f20422e = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1616t0)) {
            return false;
        }
        C1616t0 c1616t0 = (C1616t0) obj;
        if (Z0.e.a(this.f20418a, c1616t0.f20418a) && Z0.e.a(this.f20419b, c1616t0.f20419b) && Z0.e.a(this.f20420c, c1616t0.f20420c) && Z0.e.a(this.f20421d, c1616t0.f20421d) && Z0.e.a(this.f20422e, c1616t0.f20422e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f20422e) + AbstractC6463a.e(this.f20421d, AbstractC6463a.e(this.f20420c, AbstractC6463a.e(this.f20419b, Float.floatToIntBits(this.f20418a) * 31, 31), 31), 31);
    }
}
