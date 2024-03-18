package Z0;

import a1.AbstractC1913a;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class m implements AbstractC1913a {

    /* renamed from: a  reason: collision with root package name */
    public final float f22808a;

    public m(float f6) {
        this.f22808a = f6;
    }

    @Override // a1.AbstractC1913a
    public final float a(float f6) {
        return f6 / this.f22808a;
    }

    @Override // a1.AbstractC1913a
    public final float b(float f6) {
        return f6 * this.f22808a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && Float.compare(this.f22808a, ((m) obj).f22808a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f22808a);
    }

    public final String toString() {
        return AbstractC6463a.k(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f22808a, ')');
    }
}
