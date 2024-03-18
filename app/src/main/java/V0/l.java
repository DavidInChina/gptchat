package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class l extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f46986c;

    public l(float f6) {
        super(false, false, 3);
        this.f46986c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && Float.compare(this.f46986c, ((l) obj).f46986c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f46986c);
    }

    public final String toString() {
        return AbstractC6463a.k(new StringBuilder("HorizontalTo(x="), this.f46986c, ')');
    }
}
