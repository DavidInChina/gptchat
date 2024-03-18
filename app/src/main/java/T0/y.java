package T0;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;

/* loaded from: classes.dex */
public final class y implements AbstractC1414i {

    /* renamed from: a  reason: collision with root package name */
    public final int f16828a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16829b;

    public y(int i10, int i11) {
        this.f16828a = i10;
        this.f16829b = i11;
    }

    @Override // T0.AbstractC1414i
    public final void a(k kVar) {
        int p10 = N.p(this.f16828a, 0, kVar.f16791a.a());
        int p11 = N.p(this.f16829b, 0, kVar.f16791a.a());
        if (p10 < p11) {
            kVar.f(p10, p11);
        } else {
            kVar.f(p11, p10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f16828a == yVar.f16828a && this.f16829b == yVar.f16829b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16828a * 31) + this.f16829b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f16828a);
        sb2.append(", end=");
        return AbstractC2469q0.j(sb2, this.f16829b, ')');
    }
}
