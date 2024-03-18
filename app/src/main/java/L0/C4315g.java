package l0;

import Ng.H;
import l8.AbstractC4344b;

/* renamed from: l0.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4315g implements AbstractC4313e {
    @Override // l0.AbstractC4313e
    public final long a(long j6, long j10, Z0.l lVar) {
        long c10 = H.c(((int) (j10 >> 32)) - ((int) (j6 >> 32)), ((int) (j10 & 4294967295L)) - ((int) (j6 & 4294967295L)));
        float f6 = 1 - 1.0f;
        return kotlin.jvm.internal.m.c(AbstractC4344b.Y0((((int) (c10 >> 32)) / 2.0f) * f6), AbstractC4344b.Y0((((int) (c10 & 4294967295L)) / 2.0f) * f6));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4315g)) {
            return false;
        }
        ((C4315g) obj).getClass();
        if (Float.compare(-1.0f, -1.0f) == 0 && Float.compare(-1.0f, -1.0f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(-1.0f) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=-1.0, verticalBias=-1.0)";
    }
}
