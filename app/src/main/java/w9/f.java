package w9;

import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f48249a;

    /* renamed from: b  reason: collision with root package name */
    public final long f48250b;

    public f(boolean z10, long j6) {
        this.f48249a = z10;
        this.f48250b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f48249a == fVar.f48249a && Z0.i.a(this.f48250b, fVar.f48250b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f48249a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i11 = Z0.i.f22798c;
        long j6 = this.f48250b;
        return ((int) (j6 ^ (j6 >>> 32))) + (i10 * 31);
    }

    public final String toString() {
        String b10 = Z0.i.b(this.f48250b);
        return "PopupMenuPosition(expanded=" + this.f48249a + ", offset=" + b10 + Separators.RPAREN;
    }
}
