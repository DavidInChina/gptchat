package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class t extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f47014c;

    public t(float f6) {
        super(false, false, 3);
        this.f47014c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && Float.compare(this.f47014c, ((t) obj).f47014c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f47014c);
    }

    public final String toString() {
        return AbstractC6463a.k(new StringBuilder("RelativeHorizontalTo(dx="), this.f47014c, ')');
    }
}
