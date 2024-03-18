package s0;

import y.AbstractC6463a;

/* renamed from: s0.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5517s {

    /* renamed from: a  reason: collision with root package name */
    public final float f45096a;

    /* renamed from: b  reason: collision with root package name */
    public final float f45097b;

    public C5517s(float f6, float f10) {
        this.f45096a = f6;
        this.f45097b = f10;
    }

    public final float[] a() {
        float f6 = this.f45096a;
        float f10 = this.f45097b;
        return new float[]{f6 / f10, 1.0f, ((1.0f - f6) - f10) / f10};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5517s)) {
            return false;
        }
        C5517s c5517s = (C5517s) obj;
        if (Float.compare(this.f45096a, c5517s.f45096a) == 0 && Float.compare(this.f45097b, c5517s.f45097b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f45097b) + (Float.floatToIntBits(this.f45096a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f45096a);
        sb2.append(", y=");
        return AbstractC6463a.k(sb2, this.f45097b, ')');
    }
}
