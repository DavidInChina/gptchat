package Q3;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14404a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14405b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14406c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14407d;

    public d(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f14404a = z10;
        this.f14405b = z11;
        this.f14406c = z12;
        this.f14407d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f14404a == dVar.f14404a && this.f14405b == dVar.f14405b && this.f14406c == dVar.f14406c && this.f14407d == dVar.f14407d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1;
        boolean z10 = this.f14404a;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = i11 * 31;
        boolean z11 = this.f14405b;
        if (z11) {
            z11 = true;
        }
        int i14 = z11 ? 1 : 0;
        int i15 = z11 ? 1 : 0;
        int i16 = (i13 + i14) * 31;
        boolean z12 = this.f14406c;
        if (z12) {
            z12 = true;
        }
        int i17 = z12 ? 1 : 0;
        int i18 = z12 ? 1 : 0;
        int i19 = (i16 + i17) * 31;
        boolean z13 = this.f14407d;
        if (!z13) {
            i10 = z13 ? 1 : 0;
        }
        return i19 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.f14404a);
        sb2.append(", isValidated=");
        sb2.append(this.f14405b);
        sb2.append(", isMetered=");
        sb2.append(this.f14406c);
        sb2.append(", isNotRoaming=");
        return AbstractC6463a.l(sb2, this.f14407d, ')');
    }
}
