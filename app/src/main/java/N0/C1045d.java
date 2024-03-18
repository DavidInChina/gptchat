package N0;

import id.AbstractC3557B;

/* renamed from: N0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12508a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12509b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12510c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12511d;

    public C1045d(int i10, int i11, Object obj, String str) {
        this.f12508a = obj;
        this.f12509b = i10;
        this.f12510c = i11;
        this.f12511d = str;
        if (i10 <= i11) {
            return;
        }
        throw new IllegalArgumentException("Reversed range is not supported".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1045d)) {
            return false;
        }
        C1045d c1045d = (C1045d) obj;
        if (AbstractC3557B.K(this.f12508a, c1045d.f12508a) && this.f12509b == c1045d.f12509b && this.f12510c == c1045d.f12510c && AbstractC3557B.K(this.f12511d, c1045d.f12511d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Object obj = this.f12508a;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return this.f12511d.hashCode() + (((((i10 * 31) + this.f12509b) * 31) + this.f12510c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f12508a);
        sb2.append(", start=");
        sb2.append(this.f12509b);
        sb2.append(", end=");
        sb2.append(this.f12510c);
        sb2.append(", tag=");
        return android.gov.nist.core.a.n(sb2, this.f12511d, ')');
    }

    public C1045d(Object obj, int i10, int i11) {
        this(i10, i11, obj, "");
    }
}
