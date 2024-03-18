package r0;

import A.AbstractC0044t0;
import jf.C3970t;
import q0.C5251c;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class K {

    /* renamed from: d  reason: collision with root package name */
    public static final K f44202d = new K();

    /* renamed from: a  reason: collision with root package name */
    public final long f44203a;

    /* renamed from: b  reason: collision with root package name */
    public final long f44204b;

    /* renamed from: c  reason: collision with root package name */
    public final float f44205c;

    public K() {
        this(androidx.compose.ui.graphics.a.c(4278190080L), C5251c.f43619b, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        if (r.c(this.f44203a, k10.f44203a) && C5251c.b(this.f44204b, k10.f44204b) && this.f44205c == k10.f44205c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r.f44264l;
        int f6 = C5251c.f(this.f44204b);
        return Float.floatToIntBits(this.f44205c) + ((f6 + (C3970t.a(this.f44203a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        AbstractC0044t0.B(this.f44203a, sb2, ", offset=");
        sb2.append((Object) C5251c.j(this.f44204b));
        sb2.append(", blurRadius=");
        return AbstractC6463a.k(sb2, this.f44205c, ')');
    }

    public K(long j6, long j10, float f6) {
        this.f44203a = j6;
        this.f44204b = j10;
        this.f44205c = f6;
    }
}
