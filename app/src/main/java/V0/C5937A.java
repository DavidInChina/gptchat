package v0;

import y.AbstractC6463a;

/* renamed from: v0.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5937A extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f46840c;

    public C5937A(float f6) {
        super(false, false, 3);
        this.f46840c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5937A) && Float.compare(this.f46840c, ((C5937A) obj).f46840c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f46840c);
    }

    public final String toString() {
        return AbstractC6463a.k(new StringBuilder("VerticalTo(y="), this.f46840c, ')');
    }
}
