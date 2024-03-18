package T0;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;

/* loaded from: classes.dex */
public final class w implements AbstractC1414i {

    /* renamed from: a  reason: collision with root package name */
    public final int f16824a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16825b;

    public w(int i10, int i11) {
        this.f16824a = i10;
        this.f16825b = i11;
    }

    @Override // T0.AbstractC1414i
    public final void a(k kVar) {
        if (kVar.f16794d != -1) {
            kVar.f16794d = -1;
            kVar.f16795e = -1;
        }
        t tVar = kVar.f16791a;
        int p10 = N.p(this.f16824a, 0, tVar.a());
        int p11 = N.p(this.f16825b, 0, tVar.a());
        if (p10 != p11) {
            if (p10 < p11) {
                kVar.e(p10, p11);
            } else {
                kVar.e(p11, p10);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f16824a == wVar.f16824a && this.f16825b == wVar.f16825b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16824a * 31) + this.f16825b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f16824a);
        sb2.append(", end=");
        return AbstractC2469q0.j(sb2, this.f16825b, ')');
    }
}
