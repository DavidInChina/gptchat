package l0;

import y.AbstractC6463a;

/* renamed from: l0.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4316h implements AbstractC4311c {

    /* renamed from: a  reason: collision with root package name */
    public final float f37710a;

    public C4316h(float f6) {
        this.f37710a = f6;
    }

    @Override // l0.AbstractC4311c
    public final int a(int i10, int i11, Z0.l lVar) {
        float f6 = (i11 - i10) / 2.0f;
        Z0.l lVar2 = Z0.l.f22805Y;
        float f10 = this.f37710a;
        if (lVar != lVar2) {
            f10 *= -1;
        }
        return R.a.m(1, f10, f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4316h) && Float.compare(this.f37710a, ((C4316h) obj).f37710a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f37710a);
    }

    public final String toString() {
        return AbstractC6463a.k(new StringBuilder("Horizontal(bias="), this.f37710a, ')');
    }
}
