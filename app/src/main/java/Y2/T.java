package y2;

import E2.C0492y;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public final C0492y f50472a;

    /* renamed from: b  reason: collision with root package name */
    public final long f50473b;

    /* renamed from: c  reason: collision with root package name */
    public final long f50474c;

    /* renamed from: d  reason: collision with root package name */
    public final long f50475d;

    /* renamed from: e  reason: collision with root package name */
    public final long f50476e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f50477f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f50478g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f50479h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f50480i;

    public T(C0492y c0492y, long j6, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16 = false;
        if (z13 && !z11) {
            z14 = false;
        } else {
            z14 = true;
        }
        Gi.e.l(z14);
        if (z12 && !z11) {
            z15 = false;
        } else {
            z15 = true;
        }
        Gi.e.l(z15);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z16 = true;
        }
        Gi.e.l(z16);
        this.f50472a = c0492y;
        this.f50473b = j6;
        this.f50474c = j10;
        this.f50475d = j11;
        this.f50476e = j12;
        this.f50477f = z10;
        this.f50478g = z11;
        this.f50479h = z12;
        this.f50480i = z13;
    }

    public final T a(long j6) {
        if (j6 == this.f50474c) {
            return this;
        }
        return new T(this.f50472a, this.f50473b, j6, this.f50475d, this.f50476e, this.f50477f, this.f50478g, this.f50479h, this.f50480i);
    }

    public final T b(long j6) {
        if (j6 == this.f50473b) {
            return this;
        }
        return new T(this.f50472a, j6, this.f50474c, this.f50475d, this.f50476e, this.f50477f, this.f50478g, this.f50479h, this.f50480i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        T t10 = (T) obj;
        if (this.f50473b == t10.f50473b && this.f50474c == t10.f50474c && this.f50475d == t10.f50475d && this.f50476e == t10.f50476e && this.f50477f == t10.f50477f && this.f50478g == t10.f50478g && this.f50479h == t10.f50479h && this.f50480i == t10.f50480i && AbstractC5530A.a(this.f50472a, t10.f50472a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f50472a.hashCode() + 527) * 31) + ((int) this.f50473b)) * 31) + ((int) this.f50474c)) * 31) + ((int) this.f50475d)) * 31) + ((int) this.f50476e)) * 31) + (this.f50477f ? 1 : 0)) * 31) + (this.f50478g ? 1 : 0)) * 31) + (this.f50479h ? 1 : 0)) * 31) + (this.f50480i ? 1 : 0);
    }
}
