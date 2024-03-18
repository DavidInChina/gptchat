package l0;

import y.AbstractC6463a;

/* renamed from: l0.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4317i implements AbstractC4312d {

    /* renamed from: a  reason: collision with root package name */
    public final float f37711a;

    public C4317i(float f6) {
        this.f37711a = f6;
    }

    public final int a(int i10, int i11) {
        return R.a.m(1, this.f37711a, (i11 - i10) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4317i) && Float.compare(this.f37711a, ((C4317i) obj).f37711a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f37711a);
    }

    public final String toString() {
        return AbstractC6463a.k(new StringBuilder("Vertical(bias="), this.f37711a, ')');
    }
}
