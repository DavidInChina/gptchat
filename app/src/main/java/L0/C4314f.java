package l0;

import y.AbstractC6463a;

/* renamed from: l0.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4314f implements AbstractC4311c {

    /* renamed from: a  reason: collision with root package name */
    public final float f37709a;

    public C4314f(float f6) {
        this.f37709a = f6;
    }

    @Override // l0.AbstractC4311c
    public final int a(int i10, int i11, Z0.l lVar) {
        return R.a.m(1, this.f37709a, (i11 - i10) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4314f) && Float.compare(this.f37709a, ((C4314f) obj).f37709a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f37709a);
    }

    public final String toString() {
        return AbstractC6463a.k(new StringBuilder("Horizontal(bias="), this.f37709a, ')');
    }
}
