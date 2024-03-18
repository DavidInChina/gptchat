package E;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a  reason: collision with root package name */
    public final int f3823a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3824b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3825c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3826d;

    public V(int i10, int i11, int i12, int i13) {
        this.f3823a = i10;
        this.f3824b = i11;
        this.f3825c = i12;
        this.f3826d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        if (this.f3823a == v10.f3823a && this.f3824b == v10.f3824b && this.f3825c == v10.f3825c && this.f3826d == v10.f3826d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f3823a * 31) + this.f3824b) * 31) + this.f3825c) * 31) + this.f3826d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f3823a);
        sb2.append(", top=");
        sb2.append(this.f3824b);
        sb2.append(", right=");
        sb2.append(this.f3825c);
        sb2.append(", bottom=");
        return AbstractC2469q0.j(sb2, this.f3826d, ')');
    }
}
