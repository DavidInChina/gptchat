package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class z extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f47029c;

    public z(float f6) {
        super(false, false, 3);
        this.f47029c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z) && Float.compare(this.f47029c, ((z) obj).f47029c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f47029c);
    }

    public final String toString() {
        return AbstractC6463a.k(new StringBuilder("RelativeVerticalTo(dy="), this.f47029c, ')');
    }
}
