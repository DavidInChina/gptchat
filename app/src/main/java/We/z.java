package We;

import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class z {
    public static final y Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21075a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21076b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f21077c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f21078d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f21079e;

    public z(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f21075a = z10;
        this.f21076b = z11;
        this.f21077c = z12;
        this.f21078d = z13;
        this.f21079e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f21075a == zVar.f21075a && this.f21076b == zVar.f21076b && this.f21077c == zVar.f21077c && this.f21078d == zVar.f21078d && this.f21079e == zVar.f21079e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1;
        boolean z10 = this.f21075a;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = i11 * 31;
        boolean z11 = this.f21076b;
        if (z11) {
            z11 = true;
        }
        int i14 = z11 ? 1 : 0;
        int i15 = z11 ? 1 : 0;
        int i16 = (i13 + i14) * 31;
        boolean z12 = this.f21077c;
        if (z12) {
            z12 = true;
        }
        int i17 = z12 ? 1 : 0;
        int i18 = z12 ? 1 : 0;
        int i19 = (i16 + i17) * 31;
        boolean z13 = this.f21078d;
        if (z13) {
            z13 = true;
        }
        int i20 = z13 ? 1 : 0;
        int i21 = z13 ? 1 : 0;
        int i22 = (i19 + i20) * 31;
        boolean z14 = this.f21079e;
        if (!z14) {
            i10 = z14 ? 1 : 0;
        }
        return i22 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParticipantPermission(canPublish=");
        sb2.append(this.f21075a);
        sb2.append(", canSubscribe=");
        sb2.append(this.f21076b);
        sb2.append(", canPublishData=");
        sb2.append(this.f21077c);
        sb2.append(", hidden=");
        sb2.append(this.f21078d);
        sb2.append(", recorder=");
        return AbstractC6463a.l(sb2, this.f21079e, ')');
    }
}
