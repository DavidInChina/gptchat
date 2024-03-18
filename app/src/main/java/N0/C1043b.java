package N0;

import id.AbstractC3557B;

/* renamed from: N0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1043b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12499a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12500b;

    /* renamed from: c  reason: collision with root package name */
    public int f12501c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12502d;

    public /* synthetic */ C1043b(Object obj, int i10, int i11, String str, int i12) {
        this(i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, obj, (i12 & 8) != 0 ? "" : str);
    }

    public final C1045d a(int i10) {
        int i11 = this.f12501c;
        if (i11 != Integer.MIN_VALUE) {
            i10 = i11;
        }
        if (i10 != Integer.MIN_VALUE) {
            return new C1045d(this.f12500b, i10, this.f12499a, this.f12502d);
        }
        throw new IllegalStateException("Item.end should be set first".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1043b)) {
            return false;
        }
        C1043b c1043b = (C1043b) obj;
        if (AbstractC3557B.K(this.f12499a, c1043b.f12499a) && this.f12500b == c1043b.f12500b && this.f12501c == c1043b.f12501c && AbstractC3557B.K(this.f12502d, c1043b.f12502d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Object obj = this.f12499a;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return this.f12502d.hashCode() + (((((i10 * 31) + this.f12500b) * 31) + this.f12501c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableRange(item=");
        sb2.append(this.f12499a);
        sb2.append(", start=");
        sb2.append(this.f12500b);
        sb2.append(", end=");
        sb2.append(this.f12501c);
        sb2.append(", tag=");
        return android.gov.nist.core.a.n(sb2, this.f12502d, ')');
    }

    public C1043b(int i10, int i11, Object obj, String str) {
        this.f12499a = obj;
        this.f12500b = i10;
        this.f12501c = i11;
        this.f12502d = str;
    }
}
