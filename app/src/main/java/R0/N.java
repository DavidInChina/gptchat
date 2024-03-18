package r0;

import jf.C3970t;

/* loaded from: classes2.dex */
public final class N extends AbstractC5350n {

    /* renamed from: a  reason: collision with root package name */
    public final long f44223a;

    public N(long j6) {
        this.f44223a = j6;
    }

    @Override // r0.AbstractC5350n
    public final void a(float f6, long j6, C5342f c5342f) {
        c5342f.d(1.0f);
        int i10 = (f6 > 1.0f ? 1 : (f6 == 1.0f ? 0 : -1));
        long j10 = this.f44223a;
        if (i10 != 0) {
            j10 = r.b(j10, r.d(j10) * f6);
        }
        c5342f.f(j10);
        if (c5342f.f44237c != null) {
            c5342f.i(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        if (r.c(this.f44223a, ((N) obj).f44223a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r.f44264l;
        return C3970t.a(this.f44223a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) r.i(this.f44223a)) + ')';
    }
}
