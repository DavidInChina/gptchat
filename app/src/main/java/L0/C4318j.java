package l0;

import l8.AbstractC4344b;
import y.AbstractC6463a;

/* renamed from: l0.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4318j implements AbstractC4313e {

    /* renamed from: a  reason: collision with root package name */
    public final float f37712a;

    /* renamed from: b  reason: collision with root package name */
    public final float f37713b;

    public C4318j(float f6, float f10) {
        this.f37712a = f6;
        this.f37713b = f10;
    }

    @Override // l0.AbstractC4313e
    public final long a(long j6, long j10, Z0.l lVar) {
        float f6 = (((int) (j10 >> 32)) - ((int) (j6 >> 32))) / 2.0f;
        float f10 = (((int) (j10 & 4294967295L)) - ((int) (j6 & 4294967295L))) / 2.0f;
        Z0.l lVar2 = Z0.l.f22805Y;
        float f11 = this.f37712a;
        if (lVar != lVar2) {
            f11 *= -1;
        }
        float f12 = 1;
        return kotlin.jvm.internal.m.c(AbstractC4344b.Y0((f11 + f12) * f6), AbstractC4344b.Y0((f12 + this.f37713b) * f10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4318j)) {
            return false;
        }
        C4318j c4318j = (C4318j) obj;
        if (Float.compare(this.f37712a, c4318j.f37712a) == 0 && Float.compare(this.f37713b, c4318j.f37713b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f37713b) + (Float.floatToIntBits(this.f37712a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f37712a);
        sb2.append(", verticalBias=");
        return AbstractC6463a.k(sb2, this.f37713b, ')');
    }
}
