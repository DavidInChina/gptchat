package x9;

import android.gov.nist.core.Separators;
import y.AbstractC6463a;

/* renamed from: x9.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6382a {

    /* renamed from: a  reason: collision with root package name */
    public final float f49636a;

    /* renamed from: b  reason: collision with root package name */
    public final float f49637b;

    /* renamed from: c  reason: collision with root package name */
    public final float f49638c;

    public C6382a(float f6, float f10, float f11, int i10) {
        f10 = (i10 & 2) != 0 ? 0.0f : f10;
        f11 = (i10 & 4) != 0 ? 0.0f : f11;
        this.f49636a = f6;
        this.f49637b = f10;
        this.f49638c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6382a)) {
            return false;
        }
        C6382a c6382a = (C6382a) obj;
        if (Float.compare(this.f49636a, c6382a.f49636a) == 0 && Float.compare(this.f49637b, c6382a.f49637b) == 0 && Float.compare(this.f49638c, c6382a.f49638c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f49638c) + AbstractC6463a.e(this.f49637b, Float.floatToIntBits(this.f49636a) * 31, 31);
    }

    public final String toString() {
        return "ConversionParameters(scale=" + this.f49636a + ", offsetX=" + this.f49637b + ", offsetY=" + this.f49638c + Separators.RPAREN;
    }
}
